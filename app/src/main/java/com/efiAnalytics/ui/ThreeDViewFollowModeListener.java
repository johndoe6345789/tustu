package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class ThreeDViewFollowModeListener implements ActionListener {
  by(bt parambt) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    this.a.g(jCheckBoxMenuItem.getState());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/by.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */