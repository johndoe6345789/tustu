package business.bean_encoders;

import G.GInterfaceAh;
import G.Q;
import G.R;
import G.SerializableImpl;
import G.SerializableImplExceptionprintstacktrace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BeInterfaceBravo {
  private R b;

  List a = new ArrayList();

  private q c = null;

  private boolean d = true;

  private boolean e = false;

  public BeInterfaceBravo(R paramR) {
    this.b = paramR;
  }

  public void a(SerializableImpl paramaH) {
    SerializableImpl aH1 = d().g(paramaH.aL());
    paramaH.s(this.d);
    d().a(paramaH);
    if (aH1 == null || !aH1.aN()) {
      c((Q) paramaH);
    } else {
      d((Q) aH1);
    }
  }

  public void b(SerializableImpl paramaH) {
    d().z(paramaH.aL());
    e((Q) paramaH);
  }

  private void c(Q paramQ) {
    for (p p : this.a) p.a(paramQ);
    a();
  }

  private void d(Q paramQ) {
    for (p p : this.a) p.b(paramQ);
    a();
  }

  private void e(Q paramQ) {
    for (p p : this.a) p.c(paramQ);
    a();
  }

  private void b(boolean paramBoolean) {
    for (p p : this.a) p.a(paramBoolean);
  }

  public void a() {
    boolean bool = !c() ? true : false;
    this.e = true;
    if (bool) b(c());
  }

  public void b() {
    boolean bool = c();
    this.e = false;
    if (bool) b(c());
  }

  public void a(p paramp) {
    this.a.add(paramp);
  }

  public void b(p paramp) {
    this.a.remove(paramp);
  }

  public boolean a(String paramString) {
    Iterator<GInterfaceAh> iterator = d().B();
    while (iterator.hasNext()) {
      GInterfaceAh GInterfaceAh = iterator.next();
      if (f((Q) GInterfaceAh) && GInterfaceAh.i().equals(paramString)) return true;
    }
    return false;
  }

  private boolean f(Q paramQ) {
    return (this.c == null || this.c.a(paramQ));
  }

  public void b(String paramString) {
    Iterator<GInterfaceAh> iterator = d().B();
    while (iterator.hasNext()) {
      GInterfaceAh GInterfaceAh = iterator.next();
      if (f((Q) GInterfaceAh) && GInterfaceAh.i().equals(paramString)) {
        e((Q) GInterfaceAh);
        iterator.remove();
      }
    }
  }

  public void a(q paramq) {
    this.c = paramq;
  }

  public void a(Q paramQ) {
    paramQ.s(this.d);
    if (paramQ instanceof SerializableImplExceptionprintstacktrace) {
      if (d().a((SerializableImplExceptionprintstacktrace) paramQ)) {
        d(paramQ);
      } else {
        c(paramQ);
      }
    } else if (paramQ instanceof GInterfaceAh) {
      GInterfaceAh GInterfaceAh = d().k(paramQ.aL());
      d().a((GInterfaceAh) paramQ);
      if (GInterfaceAh != null && GInterfaceAh.aN()) {
        d(paramQ);
      } else {
        c(paramQ);
      }
    }
  }

  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
  }

  public boolean c() {
    return this.e;
  }

  public void b(Q paramQ) {
    if (paramQ instanceof SerializableImplExceptionprintstacktrace) {
      d().b((SerializableImplExceptionprintstacktrace) paramQ);
    } else if (paramQ instanceof GInterfaceAh) {
      d().b((GInterfaceAh) paramQ);
    } else if (paramQ instanceof SerializableImpl) {
      d().z(paramQ.aL());
    }
    e(paramQ);
  }

  public R d() {
    return this.b;
  }

  public void a(R paramR) {
    this.b = paramR;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
