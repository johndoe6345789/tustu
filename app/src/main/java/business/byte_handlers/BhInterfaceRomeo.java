package business.byte_handlers;

import G.R;
import V.ExceptionPrintstacktrace;
import bH.D;
import com.efiAnalytics.ui.aO;

class BhInterfaceRomeo implements aO {
  R a;

  public void r(n paramn, R paramR) {
    this.a = paramR;
  }

  public void d() {
    try {
      this.a.p().d();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.a("Error performing redo:", (Exception) ExceptionPrintstacktrace, this);
    }
    n.b(this.b).requestFocus();
    a();
  }

  public void e() {
    try {
      this.a.p().c();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.a("Error performing undo:", (Exception) ExceptionPrintstacktrace, this);
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
