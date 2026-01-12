package com.efiAnalytics.tunerStudio.search;

import java.io.File;

public class ProjectFolder {
  private File a;

  public ProjectFolder(File paramFile) {
    this.a = paramFile;
  }

  public String a() {
    return this.a.getName();
  }

  public File b() {
    return this.a;
  }

  public String toString() {
    return "projectFolder: " + this.a;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
