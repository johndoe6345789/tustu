package com.efiAnalytics.apps.ts.dashboard;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

class GaugeTitleKeyAdapter extends KeyAdapter {
  GaugeTitleKeyAdapter(GaugePropertiesPanel paramad) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    JTextField jTextField = (JTextField)paramKeyEvent.getSource();
    this.a.a().setTitle(jTextField.getText());
    this.a.a().repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */