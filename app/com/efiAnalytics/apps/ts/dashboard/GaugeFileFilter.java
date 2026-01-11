package com.efiAnalytics.apps.ts.dashboard;

import java.io.File;
import java.io.FileFilter;

class GaugeFileFilter implements FileFilter {
  GaugeFileFilter(g paramg) {}
  
  public boolean accept(File paramFile) {
    String str = paramFile.getName().toLowerCase();
    return str.endsWith(".gauge");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */