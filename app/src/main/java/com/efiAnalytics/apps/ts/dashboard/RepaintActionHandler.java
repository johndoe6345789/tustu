package com.efiAnalytics.apps.ts.dashboard;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RepaintActionHandler implements ActionListener {
  RepaintActionHandler(x paramx) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a.j(paramActionEvent.getActionCommand());
    x.c(this.a, (Image) null);
    this.a.repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/L.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
