package com.efiAnalytics.tunerStudio.panels;

import V.a;
import bH.D;

class t extends Thread {
  t(o paramo) {}
  
  public void run() {
    try {
      this.a.k.e();
      this.a.k.x.a(false);
    } catch (a a) {
      D.a("Unable to start Logging.", (Exception)a, this.a.getParent());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */