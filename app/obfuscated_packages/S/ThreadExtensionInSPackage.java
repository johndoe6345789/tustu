package S;

import G.R;
import G.q;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInSPackage extends Thread {
  c(b paramb, R paramR) {}
  
  public void run() {
    try {
      Thread.sleep(1000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    try {
      this.b.c(this.a.c());
    } catch (q q) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, "Failed to Activate at least some Event Triggers.", (Throwable)q);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/S/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */