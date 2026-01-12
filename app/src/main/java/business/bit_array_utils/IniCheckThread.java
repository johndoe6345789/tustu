package business.bit_array_utils;

import java.util.logging.Level;
import java.util.logging.Logger;

class Q extends Thread {
  Q(P paramP) {
    super("INI Check");
  }

  public void run() {
    boolean bool = false;
    while (!bool) {
      bool = P.a(this.a);
      try {
        Thread.sleep(60000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(P.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
