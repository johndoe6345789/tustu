package com.efiAnalytics.apps.ts.tuningViews;

import V.a;
import com.efiAnalytics.ui.bV;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class TuneViewFileRunnable implements Runnable {
  k a;
  
  List b;
  
  boolean c = false;
  
  v(n paramn, List paramList, k paramk) {
    this.a = paramk;
    this.b = paramList;
  }
  
  public void run() {
    try {
      this.d.a(this.a);
      this.b.remove(this.a);
    } catch (a a) {
      bV.d("Failed to load Tune View File:\n" + ((this.a.a() != null) ? this.a.a().getAbsolutePath() : "null") + "\nError:\n" + a.getMessage(), this.d.getParent());
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */