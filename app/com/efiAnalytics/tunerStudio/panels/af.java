package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class af implements ActionListener {
  af(TriggerLoggerPanel paramTriggerLoggerPanel) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    TriggerLoggerPanel.c(this.a);
    this.a.i();
    TriggerLoggerPanel.d(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */