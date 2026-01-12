package com.efiAnalytics.tuningwidgets.panels;

import java.io.File;
import java.io.FileFilter;
import r.IOPropertiesUsingFile;

class RestorePointsExclusionFilter implements FileFilter {
  RestorePointsExclusionFilter(X paramX) {}

  public boolean accept(File paramFile) {
    return (!paramFile.getParentFile().getName().equals("restorePoints")
        && !paramFile.getName().toLowerCase().endsWith(IOPropertiesUsingFile.t));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
