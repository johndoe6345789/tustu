package com.efiAnalytics.ui;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WaitBarThread extends Thread {
  boolean a = true;
  
  fI(fH paramfH) {
    super("WaitBar");
    setDaemon(true);
  }
  
  public void a() {
    this.a = false;
  }
  
  public void run() {
    while (this.a) {
      try {
        Thread.sleep(25L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(fH.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      this.b.c += 4;
      this.b.repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */