package com.efiAnalytics.apps.ts.tuningViews;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class L implements ActionListener {
  L(J paramJ) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    J.a(this.a, ((JCheckBoxMenuItem)paramActionEvent.getSource()).getState());
    this.a.repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/L.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */