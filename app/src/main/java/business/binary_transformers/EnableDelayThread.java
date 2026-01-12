package business.binary_transformers;

import java.util.logging.Level;
import java.util.logging.Logger;

class EnableDelayThread extends Thread {
  int a = 100;

  long b = System.currentTimeMillis() + this.a;

  public void f(e parame) {
    super("EnableDelay");
    setDaemon(true);
  }

  public void run() {
    while (System.currentTimeMillis() < this.b) {
      long l = this.b - System.currentTimeMillis() + 1L;
      try {
        if (l > 0L) Thread.sleep(l);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(e.class.getName())
            .log(Level.SEVERE, "Playback Thread stopped", interruptedException);
      }
    }
    this.c.c = null;
    this.c.b();
  }

  public void a() {
    this.b = System.currentTimeMillis() + this.a;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
