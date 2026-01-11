package ay;

import B.g;
import java.util.logging.Level;
import java.util.logging.Logger;

class b extends Thread {
  boolean a = false;
  
  int b = 2500;
  
  b(a parama) {
    setName("HttpServices Scan Thread " + Math.random());
  }
  
  public void run() {
    while (!this.a) {
      a.a(this.c);
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */