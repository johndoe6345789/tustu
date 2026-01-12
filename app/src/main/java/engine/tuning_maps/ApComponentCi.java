package aP;

import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class ApComponentCi extends Thread {
  ApComponentCi(cc paramcc, Runnable paramRunnable) {}

  public void run() {
    try {
      Thread.sleep(500L);
      D.c("Waiting to enable Buttons.");
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(cc.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    SwingUtilities.invokeLater(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
