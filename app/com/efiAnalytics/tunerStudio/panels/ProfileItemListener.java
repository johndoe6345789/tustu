package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class k implements ItemListener {
  k(g paramg) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      String str = ((n)paramItemEvent.getItem()).a();
      g.a(this.a, str);
      this.a.b.h();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */