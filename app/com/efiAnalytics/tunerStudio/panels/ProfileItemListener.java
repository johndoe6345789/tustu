package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ProfileItemListener implements ItemListener {
  ProfileItemListener(DataLogProfileEditorPanel paramg) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      String str = ((ProfileNameWrapper)paramItemEvent.getItem()).a();
      DataLogProfileEditorPanel.a(this.a, str);
      this.a.b.h();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */