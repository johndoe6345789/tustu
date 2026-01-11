package aA;

import D.c;
import az.a;
import com.efiAnalytics.ui.bV;
import java.util.logging.Level;
import java.util.logging.Logger;

class d extends Thread {
  d(a parama, a parama1) {}
  
  public void run() {
    try {
      Thread.sleep(200L);
      c c = h.a().a(this.b.b);
      if (c.b() != null)
        this.b.b = c.b(); 
      if (c.a() != 0) {
        String str = c.b(c.a());
        bV.c(str, this.b.a);
      } else if (this.b.a != null) {
        this.b.a.dispose();
      } 
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } finally {
      this.a.dispose();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aA/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */