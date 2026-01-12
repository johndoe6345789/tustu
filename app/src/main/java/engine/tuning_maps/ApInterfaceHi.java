package aP;

import java.util.logging.Level;
import java.util.logging.Logger;

class ApInterfaceHi extends Thread {
  hi(hg paramhg) {}

  public void run() {
    try {
      Thread.sleep(2000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(hg.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    this.a.a.I();
    try {
      Thread.sleep(3000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(hg.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    this.a.a.C().f(true);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
