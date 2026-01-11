package com.efiAnalytics.ui;

import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;

class PasswordFocusThread extends Thread {
  PasswordFocusThread(JPasswordField paramJPasswordField) {}
  
  public void run() {
    try {
      sleep(300L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(bV.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    D.c("Password Focus: " + this.a.requestFocusInWindow());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */