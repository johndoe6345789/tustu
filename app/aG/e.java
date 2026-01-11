package aG;

import A.f;
import B.o;
import G.R;
import G.bo;
import V.g;
import bH.D;
import bH.p;
import bQ.l;
import com.efiAnalytics.remotefileaccess.DirectoryFiles;
import com.efiAnalytics.remotefileaccess.DirectoryIdentifier;
import com.efiAnalytics.remotefileaccess.DirectoryInformation;
import com.efiAnalytics.remotefileaccess.FileDownloadProgressListener;
import com.efiAnalytics.remotefileaccess.RefreshNeededListener;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

public class e implements RemoteFileAccess {
  private final FTPClient h = new FTPClient();
  
  bo a;
  
  R b;
  
  g c = null;
  
  private String i = "connectedController";
  
  private int j = 22021;
  
  String d = "anonymous";
  
  String e = "sd@efianalytics.com";
  
  File f;
  
  private final List k = new ArrayList();
  
  private final List l = new ArrayList();
  
  boolean g = false;
  
  public e(R paramR, bo parambo, File paramFile) {
    this.b = paramR;
    this.a = parambo;
    this.f = paramFile;
    if (parambo.a() != null && !parambo.a().isEmpty())
      this.i = parambo.a(); 
    if (this.i == null || this.i.equals("connectedController"))
      this.i = b(); 
    this.j = parambo.b();
    if (parambo.c() != null && !parambo.c().isEmpty())
      this.d = parambo.c(); 
    if (parambo.d() != null && !parambo.d().isEmpty())
      this.e = parambo.d(); 
    this.c = new g(this);
    this.c.start();
  }
  
  private String b() {
    if (this.b.C() instanceof l) {
      l l = (l)this.b.C();
      f f = l.a();
      return f.a(o.i).toString();
    } 
    return null;
  }
  
  public DirectoryFiles getFilesIn(DirectoryIdentifier paramDirectoryIdentifier) {
    c();
    try {
      FTPClient fTPClient = e();
      DirectoryFiles directoryFiles = new DirectoryFiles();
      d d = (d)a(paramDirectoryIdentifier);
      directoryFiles.setDirectoryInformation(d);
      ArrayList<RemoteFileDescriptor> arrayList = new ArrayList();
      String str = (paramDirectoryIdentifier == null || paramDirectoryIdentifier.getDirectoryId() == null) ? "." : paramDirectoryIdentifier.getDirectoryId();
      FTPFile[] arrayOfFTPFile = fTPClient.listFiles(str, new f(this));
      a(fTPClient);
      long l = 0L;
      byte b = 0;
      for (FTPFile fTPFile : arrayOfFTPFile) {
        if (!fTPFile.isDirectory()) {
          RemoteFileDescriptor remoteFileDescriptor = new RemoteFileDescriptor();
          remoteFileDescriptor.setName(fTPFile.getName());
          remoteFileDescriptor.setDirectory(paramDirectoryIdentifier);
          remoteFileDescriptor.setSize(fTPFile.getSize());
          remoteFileDescriptor.setLastModified(fTPFile.getTimestamp().getTimeInMillis());
          arrayList.add(remoteFileDescriptor);
          b++;
        } 
        l += fTPFile.getSize();
      } 
      directoryFiles.setFiles(arrayList);
      d.a(l);
      d.a(b);
      return directoryFiles;
    } catch (IOException iOException) {
      throw new RemoteAccessException("Error Listing files: " + iOException.getLocalizedMessage());
    } finally {
      f();
    } 
  }
  
  private void c() {
    if (this.a.f() != null && this.a.f().b() != null && !this.a.f().b().isEmpty()) {
      String str = this.a.f().b();
      try {
        boolean bool = p.a(str, this.b);
        if (!bool) {
          String str1 = this.a.f().a();
          throw new RemoteAccessException(str1);
        } 
      } catch (g g1) {
        Logger.getLogger(e.class.getName()).log(Level.WARNING, "Failed to evaluate BrowseEnable condtion: " + str, (Throwable)g1);
      } 
    } 
  }
  
  private void d() {
    if (this.a.g() != null && this.a.g().b() != null && !this.a.g().b().isEmpty()) {
      String str = this.a.g().b();
      try {
        boolean bool = p.a(str, this.b);
        if (!bool) {
          String str1 = this.a.g().a();
          throw new RemoteAccessException(str1);
        } 
      } catch (g g1) {
        Logger.getLogger(e.class.getName()).log(Level.WARNING, "Failed to evaluate BrowseEnable condtion: " + str, (Throwable)g1);
      } 
    } 
  }
  
  private FTPClient e() {
    if (!this.h.isConnected()) {
      try {
        this.h.connect(this.i, this.j);
        a(this.h);
        if (!FTPReply.isPositiveCompletion(this.h.getReplyCode())) {
          this.h.disconnect();
          throw new RemoteAccessException("Connection Refused");
        } 
      } catch (IOException iOException) {
        throw new RemoteAccessException(iOException.getMessage());
      } 
      try {
        if (!this.h.login(this.d, this.e) || !FTPReply.isPositiveCompletion(this.h.getReplyCode())) {
          a(this.h);
          f();
          throw new RemoteAccessException("Invalid User and/or password");
        } 
        a(this.h);
      } catch (IOException iOException) {
        f();
        throw new RemoteAccessException("Login failed: " + iOException.getLocalizedMessage());
      } 
      if (this.a.h())
        this.h.enterLocalPassiveMode(); 
      try {
        this.h.setFileType(2);
        a(this.h);
      } catch (IOException iOException) {
        f();
        throw new RemoteAccessException("Unable to set Transfertype to binary: " + iOException.getLocalizedMessage());
      } 
    } 
    return this.h;
  }
  
  public File readRemoteFile(File paramFile, RemoteFileDescriptor paramRemoteFileDescriptor) {
    this.g = false;
    d();
    File file = new File(paramFile, paramRemoteFileDescriptor.getName());
    BufferedOutputStream bufferedOutputStream = null;
    boolean bool = false;
    FTPClient fTPClient = e();
    try {
      bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
      InputStream inputStream = fTPClient.retrieveFileStream("./" + paramRemoteFileDescriptor.getName());
      a(this.h);
      byte[] arrayOfByte = new byte[4096];
      int i = -1;
      int j = (int)paramRemoteFileDescriptor.getSize();
      int k = 0;
      a(paramRemoteFileDescriptor);
      while (!this.g && (i = inputStream.read(arrayOfByte)) != -1) {
        bufferedOutputStream.write(arrayOfByte, 0, i);
        k += i;
        a(k, j);
      } 
      if (this.g) {
        a(fTPClient);
        bool = false;
        return null;
      } 
      a(fTPClient);
      bool = true;
      try {
        bufferedOutputStream.close();
      } catch (IOException iOException) {
        D.c("Failed to close OutputStream for FTP.");
      } 
      a(paramRemoteFileDescriptor, file);
      return file;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      bool = false;
      throw new RemoteAccessException("Unable to read file: " + iOException.getLocalizedMessage());
    } finally {
      if (bufferedOutputStream != null)
        try {
          bufferedOutputStream.close();
        } catch (IOException iOException) {} 
      if (!bool)
        file.delete(); 
      f();
    } 
  }
  
  public boolean deleteFile(RemoteFileDescriptor paramRemoteFileDescriptor) {
    d();
    try {
      FTPClient fTPClient = e();
      this.c.b();
      fTPClient.deleteFile(paramRemoteFileDescriptor.getName());
      this.c.a();
      a(fTPClient);
      if (!FTPReply.isPositiveCompletion(fTPClient.getReplyCode())) {
        String[] arrayOfString = fTPClient.getReplyStrings();
        if (arrayOfString != null && arrayOfString.length > 0)
          throw new RemoteAccessException("Delete failed: " + arrayOfString[0]); 
        return false;
      } 
    } catch (IOException iOException) {
      throw new RemoteAccessException("Delete failed: " + iOException.getLocalizedMessage());
    } 
    return true;
  }
  
  public File getDownloadDirectory() {
    return this.f;
  }
  
  public DirectoryInformation a(DirectoryIdentifier paramDirectoryIdentifier) {
    return new d();
  }
  
  public void a() {
    f();
    if (this.c != null)
      this.c.b = false; 
  }
  
  public void addRefreshNeededListener(RefreshNeededListener paramRefreshNeededListener) {
    this.l.add(paramRefreshNeededListener);
  }
  
  public void removeRefreshNeededListener(RefreshNeededListener paramRefreshNeededListener) {
    this.l.remove(paramRefreshNeededListener);
  }
  
  public void addFileDownloadProgressListener(FileDownloadProgressListener paramFileDownloadProgressListener) {
    this.k.add(paramFileDownloadProgressListener);
  }
  
  public void removeFileDownloadProgressListener(FileDownloadProgressListener paramFileDownloadProgressListener) {
    this.k.remove(paramFileDownloadProgressListener);
  }
  
  public void cancelReadFile() {
    this.g = true;
  }
  
  private void f() {
    try {
      if (this.h != null && this.h.isConnected()) {
        this.h.logout();
        D.c("Logged out FTP Session.");
        this.h.disconnect();
        D.c("Disconnected FTP Session.");
        Thread.sleep(10L);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void a(RemoteFileDescriptor paramRemoteFileDescriptor) {
    Iterator<FileDownloadProgressListener> iterator = this.k.iterator();
    while (iterator.hasNext())
      ((FileDownloadProgressListener)iterator.next()).fileDownloadStarted(paramRemoteFileDescriptor); 
  }
  
  private void a(long paramLong1, long paramLong2) {
    Iterator<FileDownloadProgressListener> iterator = this.k.iterator();
    while (iterator.hasNext())
      ((FileDownloadProgressListener)iterator.next()).fileDownloadProgressUpdate(paramLong1, paramLong2); 
  }
  
  private void a(RemoteFileDescriptor paramRemoteFileDescriptor, File paramFile) {
    Iterator<FileDownloadProgressListener> iterator = this.k.iterator();
    while (iterator.hasNext())
      ((FileDownloadProgressListener)iterator.next()).fileDownloadCompleted(paramRemoteFileDescriptor, paramFile); 
  }
  
  private void a(FTPClient paramFTPClient) {
    String[] arrayOfString = paramFTPClient.getReplyStrings();
    if (arrayOfString != null && arrayOfString.length > 0)
      for (String str : arrayOfString)
        D.d("SERVER: " + str);  
  }
  
  private void g() {
    Iterator<RefreshNeededListener> iterator = this.l.iterator();
    while (iterator.hasNext())
      ((RefreshNeededListener)iterator.next()).refreshView(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aG/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */