package com.efiAnalytics.tunerStudio.search;

import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

class SearchDelayThread extends Thread {
  int a = 600;
  
  long b = Long.MAX_VALUE;
  
  long c = 0L;
  
  int d = 30000;
  
  q(m paramm) {
    super("SearchBox");
    setDaemon(true);
  }
  
  public synchronized void run() {
    this.c = System.currentTimeMillis();
    while (this.c + this.d > System.currentTimeMillis()) {
      try {
        while (this.b >= System.currentTimeMillis()) {
          long l = this.b - System.currentTimeMillis();
          if (l > 0L) {
            wait(l);
            continue;
          } 
          if (l == 0L) {
            wait(1L);
            continue;
          } 
          D.c("waitTime < 0 ???");
        } 
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(m.class.getName()).log(Level.INFO, "Search Thread error", interruptedException);
      } 
      if (!this.e.d.equals(this.e.b.getText())) {
        this.b = Long.MAX_VALUE;
        m.e(this.e);
        continue;
      } 
      this.b = Long.MAX_VALUE;
    } 
  }
  
  public synchronized void a() {
    this.b = System.currentTimeMillis() + this.a;
    this.c = System.currentTimeMillis();
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */