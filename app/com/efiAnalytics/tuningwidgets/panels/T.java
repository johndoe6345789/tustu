package com.efiAnalytics.tuningwidgets.panels;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class T extends Thread {
  T(S paramS) {}
  
  public void run() {
    try {
      Thread.sleep(500L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(Q.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    SwingUtilities.invokeLater(this.a.a.h);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */