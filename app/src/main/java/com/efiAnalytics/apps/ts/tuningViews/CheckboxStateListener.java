package com.efiAnalytics.apps.ts.tuningViews;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class CheckboxStateListener implements ActionListener {
  CheckboxStateListener(J paramJ) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a.a(((JCheckBoxMenuItem) paramActionEvent.getSource()).getState());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
