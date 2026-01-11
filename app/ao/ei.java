package ao;

import V.a;
import az.a;
import bH.D;
import h.i;
import java.util.logging.Level;
import java.util.logging.Logger;

class ei extends Thread {
  ei(eg parameg, String paramString1, String paramString2, String paramString3, String paramString4, a parama) {}
  
  public void run() {
    try {
      Thread.sleep(200L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(cd.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    try {
      i.d("firstName", this.a);
      i.d("lastName", this.b);
      i.d("registrationKeyV2", this.c);
      i.d("userEmail", this.d);
      i.c("quadraticInterpolation", "false");
      i.c("valid", "false");
      if (cd.e(this.f.a)) {
        try {
          i.h();
          i.g();
        } catch (a a1) {
          D.a("Failed to save Registration Information.", (Exception)a1, bq.a().b());
          return;
        } 
        cd.f(this.f.a);
      } 
    } finally {
      this.e.setVisible(false);
      this.e.dispose();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ei.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */