package com.efiAnalytics.ui;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

class Table3DMenuPointListener implements ActionListener {
  Table3DMenuPointListener(bt parambt) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JMenuItem jMenuItem = (JMenuItem) paramActionEvent.getSource();
    Point point = jMenuItem.getLocation();
    point.y += jMenuItem.getHeight();
    this.a.a(point);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
