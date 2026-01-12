package business.query_builders.bQ_components;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BqInterfaceSierra extends Thread {
  boolean a = false;

  public BqInterfaceSierra(l paraml) {}

  public void run() {
    while (!this.a) {
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
      if (!this.a)
        try {
          this.b.g();
        } catch (Exception exception) {
          Logger.getLogger(l.class.getName()).log(Level.WARNING, "Failed to send sync", exception);
        }
    }
  }

  public void a() {
    this.a = true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
