package aP;

import java.util.logging.Level;
import java.util.logging.Logger;

class ApComponentIx extends Thread {
  public void ix(iw paramiw) {
    super("SendBlockCleanup");
    setDaemon(true);
  }

  public void run() {
    while (this.a.a.C().x()) {
      try {
        Thread.sleep(30L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(iw.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
    try {
      Thread.sleep(100L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(iw.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    iw.a(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
