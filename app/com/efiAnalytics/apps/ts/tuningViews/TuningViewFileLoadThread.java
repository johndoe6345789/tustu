package com.efiAnalytics.apps.ts.tuningViews;

import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.SComponentGolf;

class TuningViewFileLoadThread extends Thread {
  k ExceptionInVPackage;
  
  J b;
  
  private boolean d = false;
  
  y(n paramn, k paramk, J paramJ) {
    this.ExceptionInVPackage = paramk;
    this.b = paramJ;
  }
  
  public void run() {
    F f1;
    if (this.d)
      D.c("Attempting to load ExceptionInVPackage TuningViewFile that has already been loaded"); 
    try {
      this.d = true;
      this.b.y();
      f1 = this.ExceptionInVPackage.d();
      if (f1 == null) {
        this.d = false;
        this.b.e(SComponentGolf.b("This Tuning View contains Password Protected Information. You must have the password to access it."));
        for (byte b = 0; b < this.c.h.size(); b++) {
          y y1 = this.c.h.get(b);
          if (y1.b.equals(this.b)) {
            this.c.h.set(b, new y(this.c, this.ExceptionInVPackage, this.b));
            return;
          } 
        } 
      } 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d("Failed to load Tune View File:\n" + ((this.ExceptionInVPackage.ExceptionInVPackage() != null) ? this.ExceptionInVPackage.ExceptionInVPackage().getAbsolutePath() : "null") + "\nError:\n" + ExceptionInVPackage.getMessage(), this.c.getParent());
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
      return;
    } finally {
      this.b.z();
    } 
    F f2 = f1;
    this.b.ExceptionInVPackage(f2);
  }
  
  public boolean ExceptionInVPackage() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */