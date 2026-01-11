package aj;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadedInAjPackage extends Thread {
  boolean a = true;
  
  j(d paramd) {
    super("SendCaller");
    setDaemon(true);
  }
  
  public synchronized void run() {
    while (this.a) {
      try {
        wait();
        if (this.a) {
          this.b.e();
          continue;
        } 
        d.b(this.b);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public synchronized void a() {
    notify();
  }
  
  public synchronized void b() {
    this.a = false;
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aj/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */