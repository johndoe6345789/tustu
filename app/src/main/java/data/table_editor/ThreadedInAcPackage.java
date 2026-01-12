package ac;

import G.ManagerUsingArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadedInAcPackage extends Thread {
  boolean a;

  public void run() {
    while (this.a) {
      ManagerUsingArrayList.a().a("dataLoggingActive", 1.0D);
      if (h.v() == null) {
        double d = (System.currentTimeMillis() - this.b.j) / 1000.0D;
        ManagerUsingArrayList.a().a("dataLogTime", d);
      }
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(h.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
    ManagerUsingArrayList.a().a("dataLoggingActive", 0.0D);
  }

  public void a() {
    this.a = false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
