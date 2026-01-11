package business.array_adapters;

import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

class AyComponentGolf extends Thread {
  boolean a = false;
  
  boolean b = true;
  
  AyComponentGolf(f paramf) {}
  
  public synchronized void run() {
    while (!this.a) {
      boolean bool = false;
      if (this.b) {
        try {
          f.a(this.c);
          this.b = false;
          f.b(this.c);
          bool = false;
        } catch (Exception exception) {
          if (f.d) {
            exception.printStackTrace();
            f.d = false;
          } 
          try {
            Thread.sleep(3000L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
          } 
          if (!bool) {
            D.c("HttpService Search Failed");
            bool = true;
          } 
        } 
        continue;
      } 
      try {
        wait();
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public synchronized void a() {
    this.b = true;
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */