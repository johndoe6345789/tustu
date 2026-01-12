package com.efiAnalytics.apps.ts.dashboard;

import G.GInterfaceAi;
import G.GInterfaceDj;
import G.GInterfaceDk;
import G.R;
import bH.D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

class LowWarningKeyAdapter extends KeyAdapter {
  LowWarningKeyAdapter(ad paramad) {}

  public void keyReleased(KeyEvent paramKeyEvent) {
    JTextField jTextField = (JTextField) paramKeyEvent.getSource();
    if (jTextField.getText().equals("")) return;
    try {
      R r = r.a(this.a.a());
      GInterfaceDj GInterfaceDj = GInterfaceDk.a((GInterfaceAi) r, jTextField.getText());
      this.a.a().setLowWarning(GInterfaceDj);
      this.a.a().repaint();
    } catch (Exception exception) {
      D.c("Invalid expression: " + jTextField.getText());
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/as.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
