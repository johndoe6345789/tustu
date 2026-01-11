package com.efiAnalytics.apps.ts.dashboard;

import G.R;
import G.GInterfaceAi;
import G.GInterfaceDj;
import G.GInterfaceDk;
import bH.D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

class MaxValueKeyAdapter extends KeyAdapter {
  MaxValueKeyAdapter(ad paramad) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    JTextField jTextField = (JTextField)paramKeyEvent.getSource();
    if (jTextField.getText().equals(""))
      return; 
    try {
      R r = r.a(this.a.a());
      GInterfaceDj GInterfaceDj = GInterfaceDk.a((GInterfaceAi)r, jTextField.getText());
      this.a.a().setMax(GInterfaceDj);
      this.a.a().repaint();
    } catch (Exception exception) {
      D.c("Invalid expression: " + jTextField.getText());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */