package ao;

import V.a;
import W.C;
import com.efiAnalytics.ui.bV;
import java.io.File;

class hL extends Thread {
  hL(hE paramhE1, String paramString, hE paramhE2) {}
  
  public void run() {
    try {
      hX hX = new hX();
      hW hW = hX.a(this.a);
      this.c.f = this.a;
      this.c.q = this.a.substring(this.a.lastIndexOf(".") + 1);
      this.c.a(hW);
      if (hE.a(this.c) != null)
        C.a().e(hE.a(this.c)); 
      hE.a(this.c, new File(this.c.f));
      C.a().a(hE.a(this.c), this.b);
    } catch (a a) {
      bV.d("Unable to open file:\n" + this.a + "\n \nError Message:\n" + a.getMessage(), this.b);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */