package business.buffer_loaders.bL_components;

import bH.D;
import com.efiAnalytics.ui.b;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlInterfaceNovember {
  q a = null;

  List b = Collections.synchronizedList(new ArrayList());

  o c = null;

  ArrayList d = new ArrayList();

  int e = 0;

  int f = 0;

  private c g = null;

  public BlInterfaceNovember(s params1, s params2, s params3, s params4, c paramc) {
    this.g = paramc;
    this.a = new q(params1, params2, params3, params4, paramc);
  }

  public void a(l paraml) {
    this.d.add(paraml);
  }

  public void b(l paraml) {
    this.d.remove(paraml);
  }

  public m a() {
    m m = new m();
    s s = this.a.a();
    m.d(s.t());
    m.a(this.e);
    m.b(this.f);
    byte b1 = 0;
    double d1 = 0.0D;
    byte b2 = 0;
    double d2 = 0.0D;
    double d3 = 0.0D;
    b[][] arrayOfB = s.D();
    for (int i = arrayOfB.length - 1; i >= 0; i--) {
      for (byte b = 0; b < (arrayOfB[i]).length; b++) {
        if (arrayOfB[arrayOfB.length - i - 1][b].j() > 0) {
          b2++;
          d2 += arrayOfB[i][b].k();
          double d =
              Math.abs(
                  arrayOfB[arrayOfB.length - i - 1][b].i().doubleValue() - s.c(i, b).doubleValue());
          d3 += d;
          b1++;
          if (d > d1) d1 = d;
        }
      }
    }
    d2 /= b2;
    m.c(b1);
    m.c(d1);
    m.b(d3 / b1);
    m.a(d2);
    return m;
  }

  private void g() {
    m m = a();
    for (l l : this.d) {
      try {
        l.a(m);
      } catch (Exception exception) {
        D.c("Exception caught publishing VE analyze metrics, continuing...");
        exception.printStackTrace();
      }
    }
  }

  public void a(p paramp) {
    this.b.add(paramp);
  }

  public void b() {
    this.e = 0;
    this.f = 0;
    s s1 = this.a.a();
    s s2 = this.a.b();
    s s3 = this.a.c();
    s1.a(s2, this.g);
    s1.q();
    s1.a(s3.e(0, 0), 0, 0);
  }

  public void c() {
    if (this.c != null) this.c.a(false);
    this.c = new o(this);
    this.c.start();
  }

  public void d() {
    if (this.c != null) {
      this.c.a(false);
      g();
    }
  }

  public boolean e() {
    return (this.c != null && this.c.b());
  }

  public c f() {
    return this.g;
  }

  public void a(s params) {
    this.a.a(params);
  }

  public void a(float paramFloat) {
    this.a.a(paramFloat);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bL/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
