package bs;

import V.g;
import bE.a;
import bM.d;
import bM.e;
import java.util.logging.Level;
import java.util.logging.Logger;

class A extends a implements e {
  int a = 400;
  
  A(k paramk) {}
  
  public void a(d paramd) {
    int i = this.b.b.a(paramd.e());
    if (i < this.a) {
      float f = (paramd.d() / paramd.c() - 1.0F) * 100.0F;
      if (!paramd.h() && this.b.e.e() < 20000) {
        float f1 = 0.0F;
        try {
          f1 = 100.0F - (float)(this.b.b.b(paramd.e()) / this.b.b.a(paramd.e())) * 100.0F;
        } catch (g g) {
          Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        } 
        a(paramd.e(), f, f1);
        this.b.f.a();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */