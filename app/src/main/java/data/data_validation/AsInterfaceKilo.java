package aS;

import G.R;
import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import com.efiAnalytics.apps.ts.dashboard.x;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.SComponentGolf;

class AsInterfaceKilo extends Thread {
  private boolean d = true;

  int a = 1000;

  private x e = null;

  R b = null;

  AsInterfaceKilo(SComponentGolf paramg, R paramR) {
    super("Set PC Message");
    this.b = paramR;
    setDaemon(true);
  }

  public void run() {
    boolean bool = false;
    while (!bool) {
      try {
        Thread.sleep(this.a);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(SComponentGolf.class.getName())
            .log(Level.SEVERE, (String) null, interruptedException);
      }
      bool = (this.b.C() == null || !this.b.C().x()) ? true : false;
      if (bool && a()) {
        this.e = ThreadedJFrameIsoptimizeddrawingenabled.a().b();
        this.e.l(SComponentGolf.b("Settings Changed that Require a Power Cycle to Take Effect."));
      }
    }
  }

  public boolean a() {
    return this.d;
  }

  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
  }

  public x b() {
    return this.e;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
