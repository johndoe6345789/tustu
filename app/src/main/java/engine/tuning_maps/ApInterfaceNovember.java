package aP;

import java.util.logging.Level;
import java.util.logging.Logger;

class ApInterfaceNovember extends Thread {
  ApInterfaceNovember(M paramM, int paramInt) {}

  public void run() {
    try {
      Thread.sleep(this.a);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(M.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    this.b.a();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
