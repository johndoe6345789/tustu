package com.efiAnalytics.apps.ts.tuningViews;

import V.a;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.g;

class TuningViewFileLoadThread extends Thread {
  k a;
  
  J b;
  
  private boolean d = false;
  
  y(n paramn, k paramk, J paramJ) {
    this.a = paramk;
    this.b = paramJ;
  }
  
  public void run() {
    F f1;
    if (this.d)
      D.c("Attempting to load a TuningViewFile that has already been loaded"); 
    try {
      this.d = true;
      this.b.y();
      f1 = this.a.d();
      if (f1 == null) {
        this.d = false;
        this.b.e(g.b("This Tuning View contains Password Protected Information. You must have the password to access it."));
        for (byte b = 0; b < this.c.h.size(); b++) {
          y y1 = this.c.h.get(b);
          if (y1.b.equals(this.b)) {
            this.c.h.set(b, new y(this.c, this.a, this.b));
            return;
          } 
        } 
      } 
    } catch (a a) {
      bV.d("Failed to load Tune View File:\n" + ((this.a.a() != null) ? this.a.a().getAbsolutePath() : "null") + "\nError:\n" + a.getMessage(), this.c.getParent());
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      return;
    } finally {
      this.b.z();
    } 
    F f2 = f1;
    this.b.a(f2);
  }
  
  public boolean a() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */