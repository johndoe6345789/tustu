package com.efiAnalytics.apps.ts.dashboard;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class IndicatorActionListener implements ActionListener {
  String a = "";

  IndicatorActionListener(x paramx, String paramString) {
    this.a = paramString;
  }

  public void actionPerformed(ActionEvent paramActionEvent) {
    Component component = this.b.g();
    if (component instanceof Indicator)
      this.b.a((Indicator) component, paramActionEvent.getActionCommand(), this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
