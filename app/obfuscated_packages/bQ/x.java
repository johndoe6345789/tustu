package bQ;

import java.util.logging.Level;
import java.util.logging.Logger;

class x extends Thread {
  long a = -1L;
  
  int b = 100;
  
  public x(u paramu) {
    super("Master DAQ List Update");
  }
  
  public synchronized void run() {
    while (true) {
      try {
        wait(10000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(u.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      if (this.a > 0L) {
        while (System.currentTimeMillis() < this.a + this.b) {
          try {
            wait(this.b);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(u.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
          } 
        } 
        if (this.a + this.b <= System.currentTimeMillis()) {
          try {
            u.a(this.c);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
          this.a = -1L;
        } 
      } 
    } 
  }
  
  private synchronized void a() {
    this.a = System.currentTimeMillis();
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */