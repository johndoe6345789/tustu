package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class ThreeDViewAntialiasingListener implements ActionListener {
  ThreeDViewAntialiasingListener(bt parambt) {}

  public void ThreeDViewAntialiasingListener(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramActionEvent.getSource();
    this.a.e(jCheckBoxMenuItem.getState());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
