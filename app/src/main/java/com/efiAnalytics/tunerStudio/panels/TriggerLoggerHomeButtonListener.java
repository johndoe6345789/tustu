package com.efiAnalytics.tunerStudio.panels;

import W.n;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TriggerLoggerHomeButtonListener implements ActionListener {
  TriggerLoggerHomeButtonListener(
      TriggerLoggerControlPanel paramao, TriggerLoggerPanel paramTriggerLoggerPanel) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.b.g.l()) {
      n n = this.b.g.n().f();
      TriggerLoggerPanel.a(this.b.g, n);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
