package bs;

import V.g;
import bE.a;
import bM.d;
import bM.e;
import java.util.logging.Level;
import java.util.logging.Logger;

class B extends a implements e {
  int a = 400;
  
  B(k paramk) {}
  
  public void a(d paramd) {
    int i = this.b.b.a(paramd.e());
    if (i < this.a) {
      float f = paramd.d() - paramd.c();
      if (!paramd.h() && this.b.e.e() < 20000) {
        float f1 = 0.0F;
        try {
          f1 = (float)this.b.b.b(paramd.e());
        } catch (g g) {
          Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        } 
        a(paramd.e(), f1, f);
        this.b.i.a();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */