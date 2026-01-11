package com.efiAnalytics.apps.ts.tuningViews;

import V.a;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Level;
import java.util.logging.Logger;

class c implements ItemListener {
  c(b paramb) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (this.a.c.getSelectedItem() instanceof k) {
      k k = (k)this.a.c.getSelectedItem();
      try {
        this.a.a(k.d());
      } catch (a a) {
        bV.d(a.getMessage(), this.a.c);
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      } 
      this.a.a = k.a();
    } else {
      D.c("Didn't show TuningView");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */