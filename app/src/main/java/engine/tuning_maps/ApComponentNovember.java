package aP;

import G.R;
import G.T;
import G.l;
import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;

class ApComponentNovember implements Runnable {
  ApComponentNovember(f paramf, Window paramWindow) {}
  
  public void run() {
    boolean bool = false;
    R r = T.a().c();
    if (r != null && r.R()) {
      bool = true;
      r.C().c();
    } 
    bb.n n1 = new bb.n();
    n1.a(this.a);
    if (r != null && bool && T.a().c() != null && T.a().c().equals(r))
      try {
        r.C().d();
      } catch (l l) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */