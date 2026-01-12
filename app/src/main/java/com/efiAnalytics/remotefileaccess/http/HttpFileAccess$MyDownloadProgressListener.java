package com.efiAnalytics.remotefileaccess.http;

import W.q;
import com.efiAnalytics.remotefileaccess.FileDownloadProgressListener;
import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import java.io.File;

class HttpFileAccess$MyDownloadProgressListener implements q {
  private RemoteFileDescriptor fileDescriptor = null;

  private long fileSize = -1L;

  private File downloadFile = null;

  public void started(long paramLong) {
    this.fileSize = paramLong;
    for (FileDownloadProgressListener fileDownloadProgressListener :
        HttpFileAccess.this.fileDownloadListeners)
      fileDownloadProgressListener.fileDownloadStarted(this.fileDescriptor);
  }

  public void updateProgress(long paramLong, double paramDouble) {
    for (FileDownloadProgressListener fileDownloadProgressListener :
        HttpFileAccess.this.fileDownloadListeners)
      fileDownloadProgressListener.fileDownloadProgressUpdate(paramLong, this.fileSize);
  }

  public void completed() {
    for (FileDownloadProgressListener fileDownloadProgressListener :
        HttpFileAccess.this.fileDownloadListeners)
      fileDownloadProgressListener.fileDownloadCompleted(this.fileDescriptor, this.downloadFile);
  }

  public void setFileDescriptor(RemoteFileDescriptor paramRemoteFileDescriptor) {
    this.fileDescriptor = paramRemoteFileDescriptor;
  }

  public void setDownloadFile(File paramFile) {
    this.downloadFile = paramFile;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/remotefileaccess/http/HttpFileAccess$MyDownloadProgressListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
