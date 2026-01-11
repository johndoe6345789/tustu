package com.efiAnalytics.ui;

import java.util.logging.Level;
import java.util.logging.Logger;

class fK extends Thread {
  boolean a = true;
  
  fK(fJ paramfJ) {}
  
  public void run() {
    while (this.a) {
      this.b.repaint();
      try {
        sleep(30L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(fJ.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */