package com.efiAnalytics.apps.ts.tuningViews;

import java.util.logging.Level;
import java.util.logging.Logger;

class RepaintThread extends Thread {
  boolean a = true;
  
  RepaintThread(J paramJ) {}
  
  public void run() {
    while (this.a) {
      this.b.repaint();
      try {
        sleep(30L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */