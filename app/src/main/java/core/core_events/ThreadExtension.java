package G;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtension extends Thread {
  private int b = 200;

  ThreadExtension(aO paramaO) {}

  public void run() {
    try {
      sleep(this.b);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(aO.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    aO.a(this.a, (aP) null);
    aO.a(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
