package com.efiAnalytics.tuningwidgets.panels;

import W.j;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class J implements ActionListener {
  J(I paramI, j paramj, Component paramComponent) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramActionEvent.getSource();
    if (jCheckBoxMenuItem.isSelected()) {
      this.c.a(this.a, this.a.s());
    } else {
      this.c.a(this.a);
    }
    this.b.repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
