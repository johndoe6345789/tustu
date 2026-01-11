package B;

import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadedInBPackage extends Thread {
  boolean a = false;
  
  boolean b = true;
  
  ThreadedInBPackage(e parame) {}
  
  public synchronized void run() {
    while (!this.a) {
      if (this.b) {
        try {
          e.a(this.c);
          this.b = false;
          e.b(this.c);
        } catch (Exception exception) {
          D.c("Device Search Failed");
        } 
        continue;
      } 
      try {
        wait();
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public synchronized void a() {
    this.b = true;
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */