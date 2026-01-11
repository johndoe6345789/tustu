package com.efiAnalytics.apps.ts.tuningViews;

import javax.swing.SwingUtilities;

class D implements Runnable {
  D(C paramC) {}
  
  public void run() {
    if (this.a.a == null)
      this.a.a = C.a(this.a); 
    if (this.a.a == null)
      return; 
    C.b(this.a);
    this.a.a.doLayout();
    E e = new E(this);
    SwingUtilities.invokeLater(e);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */