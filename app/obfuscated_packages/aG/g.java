package aG;

import aI.l;
import java.util.logging.Level;
import java.util.logging.Logger;

class g extends Thread {
  long a = Long.MAX_VALUE;
  
  boolean b = true;
  
  int c = 100;
  
  public g(e parame) {
    super("FTD SD Refresh Monitor");
    setDaemon(true);
  }
  
  public void run() {
    while (this.b) {
      if (this.a < System.currentTimeMillis()) {
        this.a = Long.MAX_VALUE;
        e.a(this.d);
      } 
      try {
        Thread.sleep(40L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public void a() {
    this.a = this.c + System.currentTimeMillis();
  }
  
  public void b() {
    this.a = Long.MAX_VALUE;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aG/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */