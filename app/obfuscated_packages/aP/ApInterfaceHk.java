package aP;

import java.util.logging.Level;
import java.util.logging.Logger;

class ApInterfaceHk extends Thread {
  int a = 100;
  
  long b = System.currentTimeMillis() + this.a;
  
  hk(hg paramhg) {
    super("EnableDelay");
    setDaemon(true);
  }
  
  public void run() {
    while (System.currentTimeMillis() < this.b) {
      long l = this.b - System.currentTimeMillis() + 1L;
      try {
        if (l > 0L)
          Thread.sleep(l); 
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(hg.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    this.c.g = null;
    this.c.k();
  }
  
  public void a() {
    this.b = System.currentTimeMillis() + this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */