package com.efiAnalytics.remotefileaccess.http;

import ab.AbInterfaceAlpha;
import ay.AyComponentKilo;
import bH.D;
import bH.n;
import com.efiAnalytics.remotefileaccess.DirectoryFiles;
import com.efiAnalytics.remotefileaccess.DirectoryIdentifier;
import com.efiAnalytics.remotefileaccess.DirectoryInformation;
import com.efiAnalytics.remotefileaccess.FileDownloadProgressListener;
import com.efiAnalytics.remotefileaccess.RefreshNeededListener;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HttpFileAccess implements RemoteFileAccess {
  String hostName;

  List fileDownloadListeners = new ArrayList();

  List refreshListeners = new ArrayList();

  HttpFileAccess$MyDownloadProgressListener dlListener =
      new HttpFileAccess$MyDownloadProgressListener(this);

  File downloadDirectory = null;

  int port;

  private FileAccessPreferences fileAccessPreferences = null;

  public HttpFileAccess(String paramString, int paramInt, File paramFile) {
    this.hostName = paramString;
    this.downloadDirectory = paramFile;
    this.port = paramInt;
  }

  private String getCoreUrl(String paramString) {
    String str;
    if (this.port == 80) {
      str = "http://" + this.hostName + "/LogFileActions?";
    } else {
      str = "http://" + this.hostName + ":" + this.port + "/LogFileActions?";
    }
    if (paramString != null && !paramString.isEmpty())
      str = str + "projectName=" + paramString + "&";
    return str;
  }

  public DirectoryFiles getFilesIn(DirectoryIdentifier paramDirectoryIdentifier) {
    String str2;
    String str1 =
        getCoreUrl(
            (paramDirectoryIdentifier == null) ? null : paramDirectoryIdentifier.getDirectoryId());
    str1 = str1 + "action=listLogs";
    try {
      str2 = AyComponentKilo.AbInterfaceAlpha(str1);
    } catch (IOException iOException) {
      D.AbInterfaceAlpha("Failed to read from url: " + str1);
      throw new RemoteAccessException(
          "Unable to read file list from "
              + this.hostName
              + ", error: "
              + iOException.getLocalizedMessage());
    }
    if (str2.toLowerCase().startsWith("error")) throw new RemoteAccessException(str2);
    try {
      List list = AbInterfaceAlpha.AbInterfaceAlpha(RemoteFileDescriptor[].class, str2);
      DirectoryInformation directoryInformation = getDirectoryInformation(paramDirectoryIdentifier);
      DirectoryFiles directoryFiles = new DirectoryFiles();
      directoryFiles.setDirectoryInformation(directoryInformation);
      directoryFiles.setFiles(list);
      return directoryFiles;
    } catch (Exception exception) {
      D.AbInterfaceAlpha("Could not parse this json: " + str2);
      throw new RemoteAccessException(
          "Error parsing response from "
              + this.hostName
              + ", error: "
              + exception.getLocalizedMessage());
    }
  }

  public File readRemoteFile(File paramFile, RemoteFileDescriptor paramRemoteFileDescriptor) {
    String str = getCoreUrl(paramRemoteFileDescriptor.getDirectory().getDirectoryId());
    if (paramRemoteFileDescriptor.getName() == null
        || paramRemoteFileDescriptor.getName().isEmpty())
      throw new RemoteAccessException("fileName is required!");
    str = str + "action=downloadLog&logFileName=" + paramRemoteFileDescriptor.getName();
    if (this.fileAccessPreferences != null) {
      paramFile = new File(this.fileAccessPreferences.getDownloadDirectory());
    } else if (paramFile == null || !paramFile.exists()) {
      paramFile = this.downloadDirectory;
    }
    File file = new File(paramFile, paramRemoteFileDescriptor.getName());
    byte b = 1;
    if (this.fileAccessPreferences != null
        && this.fileAccessPreferences.getFileExistsPreference() != 1)
      if (this.fileAccessPreferences.getFileExistsPreference() == 0) {
        if (paramRemoteFileDescriptor.getSize() == file.length()) {
          this.dlListener.setDownloadFile(file);
          this.dlListener.setFileDescriptor(paramRemoteFileDescriptor);
          this.dlListener.started(file.length());
          this.dlListener.updateProgress(file.length(), 1.0D);
          this.dlListener.completed();
          return file;
        }
        D.c(
            "Preference to return local, but local file and remote file are different sizes, going"
                + " to overwrite.");
      } else {
        while (file.exists())
          file = new File(paramFile, paramRemoteFileDescriptor.getName() + "(" + b++ + ")");
      }
    try {
      this.dlListener.setFileDescriptor(paramRemoteFileDescriptor);
      this.dlListener.setDownloadFile(file);
      n.AbInterfaceAlpha(str, file.getAbsolutePath(), this.dlListener);
      file.setLastModified(paramRemoteFileDescriptor.getLastModified());
    } catch (IOException iOException) {
      Logger.getLogger(HttpFileAccess.class.getName())
          .log(Level.WARNING, "File Download Failed.", iOException);
      throw new RemoteAccessException(
          "Failed to download "
              + paramRemoteFileDescriptor.getName()
              + ", Error: "
              + iOException.getLocalizedMessage());
    }
    return file;
  }

  public boolean deleteFile(RemoteFileDescriptor paramRemoteFileDescriptor) {
    String str =
        getCoreUrl(URLEncoder.encode(paramRemoteFileDescriptor.getDirectory().getDirectoryId()));
    if (paramRemoteFileDescriptor.getName() == null
        || paramRemoteFileDescriptor.getName().isEmpty())
      throw new RemoteAccessException("fileName is required!");
    str =
        str
            + "action=deleteLog&logFileName="
            + URLEncoder.encode(paramRemoteFileDescriptor.getName());
    try {
      String str1 = n.AbInterfaceAlpha(str);
      if (str1.equals("SUCCESSFUL")) {
        notifyRefreshNeeded();
        return true;
      }
      throw new RemoteAccessException(
          "Delete file " + paramRemoteFileDescriptor.getName() + " failed, Error: " + str1);
    } catch (IOException iOException) {
      Logger.getLogger(HttpFileAccess.class.getName())
          .log(Level.WARNING, "Unable to delete file", iOException);
      throw new RemoteAccessException(
          "Unable to delete file "
              + paramRemoteFileDescriptor.getName()
              + ", Error: "
              + iOException.getLocalizedMessage());
    }
  }

  public File getDownloadDirectory() {
    return this.downloadDirectory;
  }

  public DirectoryInformation getDirectoryInformation(
      DirectoryIdentifier paramDirectoryIdentifier) {
    String str2;
    String str1 =
        getCoreUrl(
            (paramDirectoryIdentifier == null) ? null : paramDirectoryIdentifier.getDirectoryId());
    str1 = str1 + "action=getDirectoryInfo";
    try {
      str2 = n.AbInterfaceAlpha(str1);
    } catch (IOException iOException) {
      D.AbInterfaceAlpha("Failed to read from url: " + str1);
      throw new RemoteAccessException(
          "Unable to read file list from "
              + this.hostName
              + ", error: "
              + iOException.getLocalizedMessage());
    }
    try {
      return (DirectoryInformation) AbInterfaceAlpha.b(HttpDirectoryInfo.class, str2);
    } catch (IOException iOException) {
      D.AbInterfaceAlpha("Could not parse this json: " + str2);
      throw new RemoteAccessException(
          "Error parsing response from "
              + this.hostName
              + ", error: "
              + iOException.getLocalizedMessage());
    }
  }

  private void notifyRefreshNeeded() {
    for (RefreshNeededListener refreshNeededListener : this.refreshListeners)
      refreshNeededListener.refreshView();
  }

  public void addRefreshNeededListener(RefreshNeededListener paramRefreshNeededListener) {
    this.refreshListeners.add(paramRefreshNeededListener);
  }

  public void removeRefreshNeededListener(RefreshNeededListener paramRefreshNeededListener) {
    this.refreshListeners.remove(paramRefreshNeededListener);
  }

  public void addFileDownloadProgressListener(
      FileDownloadProgressListener paramFileDownloadProgressListener) {
    this.fileDownloadListeners.add(paramFileDownloadProgressListener);
  }

  public void removeFileDownloadProgressListener(
      FileDownloadProgressListener paramFileDownloadProgressListener) {
    this.fileDownloadListeners.remove(paramFileDownloadProgressListener);
  }

  public void cancelReadFile() {}

  public void setFileAccessPreferences(FileAccessPreferences paramFileAccessPreferences) {
    this.fileAccessPreferences = paramFileAccessPreferences;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/remotefileaccess/http/HttpFileAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
