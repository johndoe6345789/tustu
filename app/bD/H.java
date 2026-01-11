package bD;

import java.util.logging.Level;
import java.util.logging.Logger;

class H extends Thread {
  boolean a = true;
  
  H(G paramG) {
    super("Remote table wait");
    setDaemon(true);
  }
  
  public void run() {
    while (this.a) {
      this.b.repaint();
      try {
        Thread.sleep(50L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    this.b.repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */