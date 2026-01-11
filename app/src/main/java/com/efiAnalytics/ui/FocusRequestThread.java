package com.efiAnalytics.ui;

import java.util.logging.Level;
import java.util.logging.Logger;

class FocusRequestThread extends Thread {
  FocusRequestThread(fs paramfs) {}
  
  public void run() {
    try {
      Thread.sleep(150L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(fs.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    if (this.a.k != null)
      this.a.k.requestFocus(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */