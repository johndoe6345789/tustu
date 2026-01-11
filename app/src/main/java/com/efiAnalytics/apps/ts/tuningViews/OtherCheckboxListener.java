package com.efiAnalytics.apps.ts.tuningViews;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class OtherCheckboxListener implements ItemListener {
  OtherCheckboxListener(b paramb) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    boolean bool = (paramItemEvent.getStateChange() == 1) ? true : false;
    this.a.f.setEnabled(bool);
    this.a.d.setEnabled(bool);
    this.a.c.setEnabled(!bool);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */