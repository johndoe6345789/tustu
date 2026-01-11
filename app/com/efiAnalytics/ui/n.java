package com.efiAnalytics.ui;

import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

class n extends Thread {
  long a;
  
  public synchronized void run() {
    while (true) {
      try {
        wait(this.a - System.currentTimeMillis());
        if (System.currentTimeMillis() >= this.a) {
          e.a(this.b);
          this.a = Long.MAX_VALUE;
          D.c("Reset List");
        } 
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(de.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */