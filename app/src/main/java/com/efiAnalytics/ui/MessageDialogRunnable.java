package com.efiAnalytics.ui;

import java.awt.Component;
import javax.swing.JOptionPane;

class MessageDialogRunnable implements Runnable {
  MessageDialogRunnable(Component paramComponent, String paramString) {}
  
  public void run() {
    JOptionPane.showMessageDialog(this.a, this.b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */