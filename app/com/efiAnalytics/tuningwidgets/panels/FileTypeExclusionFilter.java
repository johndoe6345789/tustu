package com.efiAnalytics.tuningwidgets.panels;

import java.io.File;
import java.io.FileFilter;
import r.a;

class FileTypeExclusionFilter implements FileFilter {
  FileTypeExclusionFilter(X paramX) {}
  
  public boolean accept(File paramFile) {
    return !paramFile.getName().toLowerCase().endsWith(a.t);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */