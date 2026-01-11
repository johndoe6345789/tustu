package B;

import java.util.logging.Level;
import java.util.logging.Logger;

class BInterfaceHotel extends Thread {
  boolean a = false;
  
  int b = 2000;
  
  h(g paramg) {
    setName("UDP Scan Thread " + Math.random());
  }
  
  public void run() {
    while (!this.a) {
      g.a(this.c);
      try {
        Thread.sleep(this.b);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(g.class.getName()).log(Level.INFO, "Shouldn't happen.", interruptedException);
      } 
    } 
  }
  
  public void a() {
    this.a = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */