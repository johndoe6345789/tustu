package com.efiAnalytics.apps.ts.dashboard;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class CheckboxImageHandler implements ActionListener {
  CheckboxImageHandler(x paramx) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    x.b(this.a, ((JCheckBoxMenuItem) paramActionEvent.getSource()).getState());
    x.c(this.a, (Image) null);
    this.a.repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
