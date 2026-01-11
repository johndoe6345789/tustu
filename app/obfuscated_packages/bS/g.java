package bS;

import bN.o;
import java.util.logging.Level;
import java.util.logging.Logger;

class g extends Thread {
  int a = 400;
  
  boolean b = false;
  
  public g(e parame) {
    setName("Slave Data Notify");
  }
  
  public void run() {
    while (!this.b) {
      if (!this.c.b.isEmpty() && System.currentTimeMillis() - this.c.c > this.a) {
        try {
          e.a(this.c);
        } catch (o o) {
          Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o);
        } 
        continue;
      } 
      synchronized (this.c.d) {
        try {
          this.c.d.wait(this.a);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
    } 
  }
  
  public void a() {
    this.b = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */