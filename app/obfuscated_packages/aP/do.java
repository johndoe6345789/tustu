package aP;

import az.ThreadedInAzPackage;
import java.util.logging.Level;
import java.util.logging.Logger;

class do extends Thread {
  do(dl paramdl, ThreadedInAzPackage paramo) {}
  
  public void run() {
    try {
      Thread.sleep(20000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    this.a.g();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/do.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */