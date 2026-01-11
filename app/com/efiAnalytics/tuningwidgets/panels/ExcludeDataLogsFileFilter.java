package com.efiAnalytics.tuningwidgets.panels;

import java.io.File;
import java.io.FileFilter;
import r.a;

class ExcludeDataLogsFileFilter implements FileFilter {
  ExcludeDataLogsFileFilter(ProjectArchiveOptionsPanel paramX) {}
  
  public boolean accept(File paramFile) {
    return (!paramFile.getName().toLowerCase().endsWith(a.cr) && !paramFile.getName().toLowerCase().endsWith(a.cs) && !paramFile.getName().toLowerCase().endsWith(a.t) && !paramFile.getName().toLowerCase().endsWith(a.cv));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */