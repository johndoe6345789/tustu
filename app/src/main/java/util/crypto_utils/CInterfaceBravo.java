package c;

import G.GInterfaceAb;
import G.R;
import G.S;
import G.T;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.p;
import java.util.ArrayList;
import java.util.List;

public class CInterfaceBravo implements S, GInterfaceAb {
  int a = 300;

  private static b c = null;

  private c d = null;

  List b = new ArrayList();

  private CInterfaceBravo() {
    String[] arrayOfString = T.a().d();
    for (String str : arrayOfString) {
      try {
        T.a().c(str).h().a(this);
      } catch (Exception exception) {
        D.c("Failed to enable EnableByConditionManager for " + str);
      }
    }
    T.a().a(this);
    this.d = new c(this);
    this.d.start();
  }

  public static b a() {
    if (c == null) c = new b();
    return c;
  }

  public void a(R paramR) {}

  public void b(R paramR) {
    paramR.h().b(this);
    this.b.clear();
  }

  public void c(R paramR) {
    paramR.h().a(this);
  }

  public void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    this.d.a();
  }

  private void b() {
    for (d d : this.b) {
      if (d.a_() != null && !d.a_().isEmpty()) {
        R r = d.b_();
        try {
          boolean bool = p.a(d.a_(), r);
          if (d.isEnabled() != bool) d.setEnabled(bool);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          D.a("Unable to evaluate enable condition for " + d.getClass().getName() + ": " + d.a_());
        }
      }
    }
  }

  public void a(d paramd) {
    this.b.add(paramd);
    this.d.a();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/c/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
