package com.efiAnalytics.apps.ts.tuningViews;

import V.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class TuneViewFileRunnable implements Runnable {
  k ExceptionInVPackage;
  
  List b;
  
  boolean c = false;
  
  v(n paramn, List paramList, k paramk) {
    this.ExceptionInVPackage = paramk;
    this.b = paramList;
  }
  
  public void run() {
    try {
      this.d.ExceptionInVPackage(this.ExceptionInVPackage);
      this.b.remove(this.ExceptionInVPackage);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d("Failed to load Tune View File:\n" + ((this.ExceptionInVPackage.ExceptionInVPackage() != null) ? this.ExceptionInVPackage.ExceptionInVPackage().getAbsolutePath() : "null") + "\nError:\n" + ExceptionInVPackage.getMessage(), this.d.getParent());
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */