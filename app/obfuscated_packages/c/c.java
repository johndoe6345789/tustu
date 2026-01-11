package c;

import java.util.logging.Level;
import java.util.logging.Logger;

class c extends Thread {
  long a = Long.MAX_VALUE;
  
  long b = 0L;
  
  c(b paramb) {
    super("EnableByCondition Service");
    setDaemon(true);
  }
  
  public void run() {
    while (true) {
      try {
        sleep(this.c.a);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      if (System.currentTimeMillis() > this.a && System.currentTimeMillis() - this.b > this.c.a) {
        this.a = Long.MAX_VALUE;
        this.b = System.currentTimeMillis();
        b.a(this.c);
      } 
    } 
  }
  
  public void a() {
    this.a = System.currentTimeMillis() + this.c.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/c/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */