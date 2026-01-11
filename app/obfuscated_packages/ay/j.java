package ay;

import bH.D;
import bH.n;
import java.util.logging.Level;
import java.util.logging.Logger;

class j extends Thread {
  boolean a = true;
  
  public j(i parami) {
    super("Internet Monitor");
  }
  
  public void run() {
    while (this.a) {
      if (!i.a(this.b) || i.b(this.b)) {
        boolean bool = n.a();
        if (i.a(this.b) != bool) {
          i.a(this.b, bool);
          i.b(this.b, i.a(this.b));
          D.d("Internet Available: " + i.a(this.b));
        } 
      } 
      try {
        Thread.sleep(60000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */