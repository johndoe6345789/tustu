package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class ThreeDViewEvenSpacingListener implements ActionListener {
  ThreeDViewEvenSpacingListener(bt parambt) {}
  
  public void ThreeDViewEvenSpacingListener(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    this.a.f(jCheckBoxMenuItem.getState());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */