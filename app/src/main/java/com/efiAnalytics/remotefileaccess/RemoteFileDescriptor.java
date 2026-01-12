package com.efiAnalytics.remotefileaccess;

import java.io.Serializable;

public class RemoteFileDescriptor implements Serializable {
  private String name = "";

  private long size = -1L;

  private long lastModified = 0L;

  private DirectoryIdentifier directory = null;

  public String getName() {
    return this.name;
  }

  public void setName(String paramString) {
    this.name = paramString;
  }

  public long getSize() {
    return this.size;
  }

  public void setSize(long paramLong) {
    this.size = paramLong;
  }

  public long getLastModified() {
    return this.lastModified;
  }

  public void setLastModified(long paramLong) {
    this.lastModified = paramLong;
  }

  public DirectoryIdentifier getDirectory() {
    return this.directory;
  }

  public void setDirectory(DirectoryIdentifier paramDirectoryIdentifier) {
    this.directory = paramDirectoryIdentifier;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/remotefileaccess/RemoteFileDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
