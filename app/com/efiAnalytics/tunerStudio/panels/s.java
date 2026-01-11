package com.efiAnalytics.tunerStudio.panels;

import V.a;
import W.aB;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import s.g;

class s extends Thread {
  s(o paramo, aB paramaB, File paramFile, String paramString) {}
  
  public void run() {
    try {
      ArrayList arrayList = this.a.a(this.b, TriggerLoggerPanel.S + 1);
      this.d.i.a(this.c);
      this.d.j.setSelected(false);
      this.d.k.x.a(true);
    } catch (a a) {
      D.a(g.b("Unable to load Ignition Log File."), (Exception)a, this);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */