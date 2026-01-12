package com.efiAnalytics.apps.ts.dashboard;

import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cp;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CriticalColorActionListener implements ActionListener {
  CriticalColorActionListener(ad paramad) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    Color color =
        bV.a(
            (Component) paramActionEvent.getSource(),
            "Choose Critical Limits Color",
            this.a.a().getCriticalColor());
    if (color != null) {
      cp cp = (cp) paramActionEvent.getSource();
      cp.a(color);
      this.a.a().setCriticalColor(color);
      this.a.a().repaint();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
