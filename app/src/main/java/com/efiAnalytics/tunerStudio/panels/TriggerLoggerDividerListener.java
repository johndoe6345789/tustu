package com.efiAnalytics.tunerStudio.panels;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class TriggerLoggerDividerListener implements PropertyChangeListener {
  TriggerLoggerDividerListener(TriggerLoggerPanel paramTriggerLoggerPanel) {}

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (TriggerLoggerPanel.b(this.a) == null) return;
    int i = this.a.p.getDividerLocation();
    TriggerLoggerPanel.b(this.a).a(TriggerLoggerPanel.L, i + "");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
