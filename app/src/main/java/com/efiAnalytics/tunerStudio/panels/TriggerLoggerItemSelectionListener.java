package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class TriggerLoggerItemSelectionListener implements ItemListener {
  TriggerLoggerItemSelectionListener(TriggerLoggerPanel paramTriggerLoggerPanel) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (!this.a.ad && this.a.a.j() != null) TriggerLoggerPanel.a(this.a, this.a.a.j());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
