package com.efiAnalytics.ui;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class bY extends FileFilter {
  public boolean accept(File paramFile) {
    return paramFile.isDirectory();
  }
  
  public String getDescription() {
    return bV.h.l() + " " + bV.h.m() + " Projects";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */