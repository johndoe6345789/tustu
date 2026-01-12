package aj;

import bH.D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class AjInterfaceLima extends Thread {
  boolean a = true;

  AjInterfaceLima(k paramk) {}

  public void run() {
    byte b = 0;
    while (this.a) {
      try {
        k.a(this.b);
        b = 0;
      } catch (IOException iOException) {
        if (b > 3) {
          D.c("3 consectutive errors, giving up log processing");
          this.a = false;
        }
        try {
          sleep(1L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(k.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
        b++;
        if (this.a)
          Logger.getLogger(k.class.getName())
              .log(Level.SEVERE, "Failed to read data set", iOException);
      }
    }
  }

  public synchronized void a() {
    this.a = false;
    notify();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aj/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
