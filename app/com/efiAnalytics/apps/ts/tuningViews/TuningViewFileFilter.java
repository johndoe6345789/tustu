package com.efiAnalytics.apps.ts.tuningViews;

import java.io.File;
import java.io.FilenameFilter;
import r.a;

class TuningViewFileFilter implements FilenameFilter {
  public boolean accept(File paramFile, String paramString) {
    return paramString.toLowerCase().endsWith(a.cp.toLowerCase());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */