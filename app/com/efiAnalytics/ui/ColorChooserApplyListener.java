package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColorChooserApplyListener implements ActionListener {
  ColorChooserApplyListener(bd parambd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    bd.a(this.a, this.a.a.getColor());
    this.a.e.setEnabled(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/be.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */