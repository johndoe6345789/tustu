package com.efiAnalytics.apps.ts.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class aD implements ActionListener {
  aD(ad paramad) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JComboBox jComboBox = (JComboBox)paramActionEvent.getSource();
    this.a.a.setFontFamily((String)jComboBox.getSelectedItem());
    this.a.a().repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */