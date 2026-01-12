package G;

import bH.D;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

class Threaded extends Thread implements Serializable {
  long a = 70L;

  boolean b = true;

  long c = 0L;

  int d = 250;

  final az e = new az(this.f);

  public Threaded(an paraman) {
    super("DataUpdateThread");
    setDaemon(true);
  }

  public void run() {
    while (this.b) {
      try {
        synchronized (this.e) {
          this.e.wait(this.a);
        }
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      }
      if (System.currentTimeMillis() - this.c > this.d) {
        this.f.c();
        synchronized (this.e) {
          this.e.notify();
        }
      }
    }
  }

  public void a() {
    synchronized (this.e) {
      this.c = 0L;
      this.e.notify();
    }
    try {
      D.d("dirtyData.size(): " + this.f.g.size());
      synchronized (this.e) {
        this.e.wait();
      }
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    D.d("dirtyData.size(): " + this.f.g.size());
  }

  public void b() {
    this.c = System.currentTimeMillis();
  }

  public void c() {
    this.b = false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
