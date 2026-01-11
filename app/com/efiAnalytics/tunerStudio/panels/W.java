package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class W implements ActionListener {
  W(TriggerLoggerPanel paramTriggerLoggerPanel) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    TriggerLoggerPanel.c(this.a);
    this.a.i();
    TriggerLoggerPanel.d(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */