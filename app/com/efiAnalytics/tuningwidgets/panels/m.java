package com.efiAnalytics.tuningwidgets.panels;

import bH.X;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class m implements ChangeListener {
  m(k paramk, g paramg, JLabel paramJLabel) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    String str = this.c.e.getValue() + " s.";
    this.b.setText(X.a(str, ' ', 8));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */