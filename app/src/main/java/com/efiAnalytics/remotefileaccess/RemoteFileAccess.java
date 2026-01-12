package com.efiAnalytics.remotefileaccess;

import java.io.File;

public interface RemoteFileAccess {
  DirectoryFiles getFilesIn(DirectoryIdentifier paramDirectoryIdentifier);

  File readRemoteFile(File paramFile, RemoteFileDescriptor paramRemoteFileDescriptor);

  boolean deleteFile(RemoteFileDescriptor paramRemoteFileDescriptor);

  File getDownloadDirectory();

  void addRefreshNeededListener(RefreshNeededListener paramRefreshNeededListener);

  void removeRefreshNeededListener(RefreshNeededListener paramRefreshNeededListener);

  void addFileDownloadProgressListener(
      FileDownloadProgressListener paramFileDownloadProgressListener);

  void removeFileDownloadProgressListener(
      FileDownloadProgressListener paramFileDownloadProgressListener);

  void cancelReadFile();
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/remotefileaccess/RemoteFileAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
