package com.efiAnalytics.apps.ts.tuningViews;

import java.io.File;
import java.io.FilenameFilter;

class TuneViewPrefixFilter implements FilenameFilter {
  public boolean accept(File paramFile, String paramString) {
    return paramString.startsWith(k.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
