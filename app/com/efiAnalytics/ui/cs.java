package com.efiAnalytics.ui;

import java.io.File;
import java.io.FilenameFilter;

class cs implements FilenameFilter {
  cs(cq paramcq) {}
  
  public boolean accept(File paramFile, String paramString) {
    return paramString.toLowerCase().endsWith(".ttf");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */