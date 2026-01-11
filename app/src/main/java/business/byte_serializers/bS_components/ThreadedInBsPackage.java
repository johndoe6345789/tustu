package business.byte_serializers.bS_components;

import bN.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadedInBsPackage extends Thread {
  int a = 400;
  
  boolean b = false;
  
  public ThreadedInBsPackage(e parame) {
    setName("Slave Data Notify");
  }
  
  public void run() {
    while (!this.b) {
      if (!this.c.b.isEmpty() && System.currentTimeMillis() - this.c.c > this.a) {
        try {
          e.a(this.c);
        } catch (BnInterfaceOscar BnInterfaceOscar) {
          Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)BnInterfaceOscar);
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