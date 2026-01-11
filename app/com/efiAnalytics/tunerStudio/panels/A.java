package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class A implements ActionListener {
  A(o paramo) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBox jCheckBox = (JCheckBox)paramActionEvent.getSource();
    this.a.a(jCheckBox.isSelected());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */