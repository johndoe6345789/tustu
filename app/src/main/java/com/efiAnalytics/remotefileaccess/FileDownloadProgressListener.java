package com.efiAnalytics.remotefileaccess;

import java.io.File;

public interface FileDownloadProgressListener {
  void fileDownloadStarted(RemoteFileDescriptor paramRemoteFileDescriptor);
  
  void fileDownloadProgressUpdate(long paramLong1, long paramLong2);
  
  void fileDownloadCompleted(RemoteFileDescriptor paramRemoteFileDescriptor, File paramFile);
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/remotefileaccess/FileDownloadProgressListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */