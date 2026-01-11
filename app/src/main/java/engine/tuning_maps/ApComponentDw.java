package aP;

import java.util.logging.Level;
import java.util.logging.Logger;

class ApComponentDw extends Thread {
  public void dw(dl paramdl) {
    super("MainFrameDelayValidate");
    setDaemon(true);
  }
  
  public void run() {
    try {
      Thread.sleep(400L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    this.a.validate();
    this.a.doLayout();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */