package com.efiAnalytics.apps.ts.dashboard;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

class GaugeUnitsKeyAdapter extends KeyAdapter {
  GaugeUnitsKeyAdapter(GaugePropertiesPanel paramad) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    JTextField jTextField = (JTextField)paramKeyEvent.getSource();
    this.a.a().setUnits(jTextField.getText());
    this.a.a().repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */