package com.efiAnalytics.tunerStudio.panels;

import V.ExceptionInVPackage;
import W.ManagerInWPackage;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import s.SComponentGolf;

class IgnitionLogLoaderThread extends Thread {
  IgnitionLogLoaderThread(o paramo, ManagerInWPackage paramaB, File paramFile, String paramString) {}
  
  public void run() {
    try {
      ArrayList arrayList = this.ExceptionInVPackage.ExceptionInVPackage(this.b, TriggerLoggerPanel.S + 1);
      this.d.i.ExceptionInVPackage(this.c);
      this.d.j.setSelected(false);
      this.d.k.x.ExceptionInVPackage(true);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage(SComponentGolf.b("Unable to load Ignition Log File."), (Exception)ExceptionInVPackage, this);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */