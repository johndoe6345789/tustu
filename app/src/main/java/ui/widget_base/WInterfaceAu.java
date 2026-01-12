package W;

import bH.D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class WInterfaceAu extends Thread {
  private boolean c = true;

  int a = 0;

  public void au(as paramas) {
    super("Queue Write");
    setDaemon(true);
  }

  public synchronized void run() {
    while (b()) {
      while (!this.b.b.isEmpty()) {
        try {
          synchronized (this.b.b) {
            at at = this.b.b.remove(0);
            if (at.c()) {
              this.b.a.write(at.b());
              this.b.a.flush();
            } else {
              this.b.a.write(at.a());
            }
          }
        } catch (IOException iOException) {
          this.b.d = iOException;
          this.c = false;
        } catch (Exception exception) {
          Logger.getLogger(as.class.getName()).log(Level.SEVERE, (String) null, exception);
        }
      }
      try {
        if (this.b.a != null) this.b.a.flush();
      } catch (Exception exception) {
        this.b.b.clear();
        if (this.a++ > 5) {
          D.d("Queued Log Writer max error count exceeded, letting die.");
          this.c = false;
        }
      }
      try {
        wait(500L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(as.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
  }

  public synchronized void a() {
    notify();
  }

  public boolean b() {
    return this.c;
  }

  public void a(boolean paramBoolean) {
    this.c = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
