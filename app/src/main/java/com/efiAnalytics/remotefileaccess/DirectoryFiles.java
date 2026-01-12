package com.efiAnalytics.remotefileaccess;

import java.io.Serializable;
import java.util.List;

public class DirectoryFiles implements Serializable {
  private DirectoryInformation directoryInformation = null;

  private List files = null;

  public DirectoryInformation getDirectoryInformation() {
    return this.directoryInformation;
  }

  public void setDirectoryInformation(DirectoryInformation paramDirectoryInformation) {
    this.directoryInformation = paramDirectoryInformation;
  }

  public List getFiles() {
    return this.files;
  }

  public void setFiles(List paramList) {
    this.files = paramList;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/remotefileaccess/DirectoryFiles.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
