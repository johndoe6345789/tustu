package com.efiAnalytics.ui;

import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

class ca implements Runnable {
  ca(String paramString, Component paramComponent) {}
  
  public void run() {
    JOptionPane jOptionPane = new JOptionPane(this.a, 3);
    JDialog jDialog = jOptionPane.createDialog(this.b, bV.a("Information"));
    jDialog.setModal(false);
    jDialog.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */