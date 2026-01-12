package G;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class GComponentCz extends Thread {
  List a = new ArrayList();

  final Object b = new Object();

  cz(cy paramcy) {}

  public void run() {
    while (true) {
      synchronized (this.b) {
        try {
          this.b.wait(10000L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(cy.class.getName())
              .log(Level.SEVERE, "ChannelListenerRemover died?", interruptedException);
        }
      }
      if (!this.a.isEmpty()) {
        ArrayList<cq> arrayList = new ArrayList();
        while (this.a.size() > 0) arrayList.add(this.a.remove(0));
        for (cq cq : arrayList) cu.a().a(cq);
      }
    }
  }

  private void a(cq paramcq) {
    this.a.add(paramcq);
    synchronized (this.b) {
      this.b.notifyAll();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
