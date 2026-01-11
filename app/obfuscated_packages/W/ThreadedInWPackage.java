package W;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadedInWPackage extends Thread {
  boolean a = true;
  
  ac(ab paramab) {}
  
  public void run() {
    while (this.a) {
      this.a = false;
      try {
        Thread.sleep(3000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(ab.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      ab.a((ac)null);
      ab.b().clear();
    } 
  }
  
  public void a() {
    this.a = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */