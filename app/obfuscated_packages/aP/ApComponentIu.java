package aP;

import java.util.logging.Level;
import java.util.logging.Logger;

class ApComponentIu extends Thread {
  iu(ir paramir) {
    super("SalesLabelRotation");
    setDaemon(true);
  }
  
  public void run() {
    while (true) {
      this.a.c = (int)Math.round(Math.random() * (this.a.a.length - 1));
      this.a.b.setText((this.a.a[this.a.c]).a);
      try {
        Thread.sleep(10000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(ir.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */