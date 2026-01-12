package com.efiAnalytics.apps.ts.tuningViews;

import java.io.File;
import java.io.FilenameFilter;
import r.IOPropertiesUsingFile;

class TuningViewFileFilter implements FilenameFilter {
  public boolean accept(File paramFile, String paramString) {
    return paramString.toLowerCase().endsWith(IOPropertiesUsingFile.cp.toLowerCase());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
