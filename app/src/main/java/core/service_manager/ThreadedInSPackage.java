package S;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadedInSPackage extends Thread {
  long a = 0L;

  int b = 99;

  public ThreadedInSPackage(e parame) {
    super("Offline Event Monitor Thread");
  }

  public void run() {
    while (true) {
      if (System.currentTimeMillis() - this.a > this.b) this.c.b();
      try {
        Thread.sleep(50L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
  }

  public void a() {
    this.a = System.currentTimeMillis();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/S/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
