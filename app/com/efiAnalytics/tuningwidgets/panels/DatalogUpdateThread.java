package com.efiAnalytics.tuningwidgets.panels;

import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class DatalogUpdateThread extends Thread {
  DatalogUpdateThread(DatalogFieldSelectorPanel paramn, Runnable paramRunnable) {}
  
  public void run() {
    try {
      Thread.sleep(500L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    SwingUtilities.invokeLater(this.a);
    D.c("updated");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */