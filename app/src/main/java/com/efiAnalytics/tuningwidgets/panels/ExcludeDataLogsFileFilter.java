package com.efiAnalytics.tuningwidgets.panels;

import java.io.File;
import java.io.FileFilter;
import r.IOPropertiesUsingFile;

class ExcludeDataLogsFileFilter implements FileFilter {
  ExcludeDataLogsFileFilter(ProjectArchiveOptionsPanel paramX) {}
  
  public boolean accept(File paramFile) {
    return (!paramFile.getName().toLowerCase().endsWith(IOPropertiesUsingFile.cr) && !paramFile.getName().toLowerCase().endsWith(IOPropertiesUsingFile.cs) && !paramFile.getName().toLowerCase().endsWith(IOPropertiesUsingFile.t) && !paramFile.getName().toLowerCase().endsWith(IOPropertiesUsingFile.cv));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */