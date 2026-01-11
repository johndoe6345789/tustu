package business.byte_serializers.bS_components;

import G.l;
import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

class BsInterfaceNovember extends Thread {
  private r b;
  
  private boolean c = true;
  
  public void n(l paraml, r paramr) {
    super("SlaveConnection: " + paramr.h());
    this.b = paramr;
  }
  
  public void run() {
    do {
      if (l.a(this.a, this.b.h()) < this.b.x() && this.a.f() > this.a.e()) {
        r r1 = null;
        try {
          D.c("Server listening on: " + this.b.n());
          r1 = this.b.v();
          if (r1 != null) {
            l.a(this.a, r1);
          } else {
            l.b(this.a, this.b);
          } 
        } catch (l l1) {
          l.a(this.a, this.b, (Exception)l1);
        } 
      } else {
        try {
          Thread.sleep(500L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
    } while (this.c);
  }
  
  public void a() {
    this.c = false;
  }
  
  public r b() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */