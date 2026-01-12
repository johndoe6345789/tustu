package com.efiAnalytics.remotefileaccess.http;

import com.efiAnalytics.remotefileaccess.DirectoryInformation;
import java.io.Serializable;

public class HttpDirectoryInfo implements DirectoryInformation, Serializable {
  private int fileCount = 0;

  private long totalBytes = 0L;

  private long usedBytes = 0L;

  private String description = "";

  public int getFileCount() {
    return this.fileCount;
  }

  public long getTotalBytes() {
    return this.totalBytes;
  }

  public long getUsedBytes() {
    return this.usedBytes;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/remotefileaccess/http/HttpDirectoryInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
