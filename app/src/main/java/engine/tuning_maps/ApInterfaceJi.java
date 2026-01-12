package aP;

import G.R;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class ApInterfaceJi extends Thread {
  List a = new ArrayList();

  long b = 0L;

  int c = 1000;

  jI(jA paramjA) {
    super("OfflineTuneSaver");
  }

  public void run() {
    while (true) {
      try {
        Thread.sleep(this.c);
      } catch (Exception exception) {
        Logger.getLogger(jA.class.getName())
            .log(Level.SEVERE, "Failed to save offline tune.", exception);
      }
      if (!this.a.isEmpty() && System.currentTimeMillis() - this.b > this.c) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        for (R r : arrayList) {
          f.a().e(r);
          this.a.remove(r);
        }
      }
    }
  }

  public void a(R paramR) {
    if (!this.a.contains(paramR)) this.a.add(paramR);
    this.b = System.currentTimeMillis();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
