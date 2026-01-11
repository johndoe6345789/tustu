package com.efiAnalytics.apps.ts.tuningViews;

import V.a;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

class A extends Thread {
  A(z paramz, ArrayList paramArrayList, b paramb) {}
  
  public void run() {
    try {
      List list = G.a(this.a);
      this.b.a(list);
    } catch (a a) {
      bV.d("Failed to load Tuning Views:\n" + a.getLocalizedMessage(), (Component)this.c.a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */