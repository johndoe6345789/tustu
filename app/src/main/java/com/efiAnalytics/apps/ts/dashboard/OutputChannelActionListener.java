package com.efiAnalytics.apps.ts.dashboard;

import V.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class OutputChannelActionListener implements ActionListener {
  OutputChannelActionListener(GaugePropertiesPanel paramad) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JComboBox jComboBox = (JComboBox)paramActionEvent.getSource();
    this.ExceptionInVPackage.ExceptionInVPackage.setOutputChannel((String)jComboBox.getSelectedItem());
    try {
      this.ExceptionInVPackage.ExceptionInVPackage.subscribeToOutput();
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d(ExceptionInVPackage.getMessage(), this.ExceptionInVPackage.ExceptionInVPackage);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */