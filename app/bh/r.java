package bh;

import G.R;
import V.g;
import bH.D;
import com.efiAnalytics.ui.aO;

class r implements aO {
  R a;
  
  r(n paramn, R paramR) {
    this.a = paramR;
  }
  
  public void d() {
    try {
      this.a.p().d();
    } catch (g g) {
      D.a("Error performing redo:", (Exception)g, this);
    } 
    n.b(this.b).requestFocus();
    a();
  }
  
  public void e() {
    try {
      this.a.p().c();
    } catch (g g) {
      D.a("Error performing undo:", (Exception)g, this);
    } 
    a();
  }
  
  public void f() {
    s s = new s(this);
    s.start();
    a();
  }
  
  public void i() {}
  
  public void a() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */