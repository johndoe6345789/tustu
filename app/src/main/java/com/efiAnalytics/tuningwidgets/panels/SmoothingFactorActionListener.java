package com.efiAnalytics.tuningwidgets.panels;

import W.j;
import g.IOJFileChooser;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SmoothingFactorActionListener implements ActionListener {
  SmoothingFactorActionListener(I paramI, j paramj, Component paramComponent) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    String str =
        IOJFileChooser.a(
            "{Set " + this.a.a() + " Smoothing Factor}",
            true,
            "Smoothing Factor: Larger Number for more Smoothing",
            true,
            this.b);
    if (str != null && !str.isEmpty()) {
      int i = Integer.parseInt(str);
      if (i < 1) {
        this.c.a(this.a);
      } else {
        this.c.a(this.a, i);
      }
    }
    this.b.repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
