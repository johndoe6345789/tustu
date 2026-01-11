package com.efiAnalytics.apps.ts.dashboard;

import V.a;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class ae implements ActionListener {
  ae(ad paramad) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JComboBox jComboBox = (JComboBox)paramActionEvent.getSource();
    this.a.a.setOutputChannel((String)jComboBox.getSelectedItem());
    try {
      this.a.a.subscribeToOutput();
    } catch (a a) {
      bV.d(a.getMessage(), this.a.a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */