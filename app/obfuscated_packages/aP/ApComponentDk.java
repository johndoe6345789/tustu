package aP;

import com.efiAnalytics.apps.ts.tuningViews.J;
import java.util.logging.Level;
import java.util.logging.Logger;

class ApComponentDk extends Thread {
  boolean a = true;
  
  dk(dh paramdh) {}
  
  public void run() {
    while (this.a) {
      this.b.repaint();
      try {
        sleep(30L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      this.b.repaint();
    } 
  }
  
  public void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */