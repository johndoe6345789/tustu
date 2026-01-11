package bH;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class k extends Thread {
  boolean a = true;
  
  k(i parami) {
    super("DeadLockMonitor");
    setDaemon(true);
  }
  
  public synchronized void run() {
    while (this.a) {
      try {
        this.b.a = false;
        SwingUtilities.invokeLater(this.b.b);
        wait(10000L);
        if (!this.b.a) {
          i.a(this.b);
          wait(600000L);
        } 
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  private void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */