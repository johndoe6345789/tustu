package aP;

import java.util.logging.Level;
import java.util.logging.Logger;

class ApComponentDm extends Thread {
  dm(dl paramdl) {}
  
  public void run() {
    try {
      sleep(3000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    this.a.j();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */