package aI;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadedInAiPackage extends Thread {
  long a = Long.MAX_VALUE;

  boolean b = true;

  int c = 400;

  long d = Long.MAX_VALUE;

  public ThreadedInAiPackage(l paraml) {
    super("MS3SD Refresh Monitor");
    setDaemon(true);
  }

  public void run() {
    while (this.b) {
      if (this.e.g != null) {
        if (this.e.g.c() && this.d > System.currentTimeMillis()) {
          this.d = System.currentTimeMillis();
        } else if (!this.e.g.c()) {
          this.d = Long.MAX_VALUE;
        }
        if (System.currentTimeMillis() - this.d > 100L && this.a < System.currentTimeMillis()) {
          this.a = Long.MAX_VALUE;
          l.a(this.e);
        }
      }
      try {
        Thread.sleep(40L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
  }

  public void a() {
    this.a = this.c + System.currentTimeMillis();
  }

  public void b() {
    this.a = Long.MAX_VALUE;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
