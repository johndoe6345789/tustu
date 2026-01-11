package business.bit_array_utils;

import java.util.logging.Level;
import java.util.logging.Logger;

class o extends Thread {
  o(W paramW) {}
  
  public void run() {
    long l = System.currentTimeMillis() + 3000L;
    while (!this.a.a() && l > System.currentTimeMillis()) {
      try {
        Thread.sleep(10L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    n.b = System.currentTimeMillis();
    n.a = this.a.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */