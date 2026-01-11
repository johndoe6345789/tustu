package bL;

import V.a;
import bH.D;
import com.efiAnalytics.ui.b;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;

public class q {
  private s f = null;
  
  private s g = null;
  
  private s h = null;
  
  private s i = null;
  
  i a = null;
  
  g b = null;
  
  g c = null;
  
  r d = new r(this);
  
  private b[][] j = (b[][])null;
  
  c e = null;
  
  private long k = -1L;
  
  private long l = -1L;
  
  private float m = 1.0F;
  
  private float n = 0.0F;
  
  public q(s params1, s params2, s params3, s params4, c paramc) {
    this.g = params2;
    this.h = params3;
    this.i = params4;
    this.f = params1;
    params4.addTableModelListener(this.d);
    int j = (int)Math.ceil(fh.c(params4)) / 6;
    this.a = new i(params1, j);
    double d = fh.d(params3);
    this.b = new g(j, 100.0D);
    this.c = new g(j, d);
  }
  
  public void a(p paramp) {
    if (this.l == -1L) {
      this.l = paramp.g();
      this.b.a(paramp.c(), paramp.g());
      this.a.a(c(), paramp.g());
      return;
    } 
    this.l = paramp.g();
    try {
      this.b.a(paramp.c(), paramp.g());
      this.a.a(c(), paramp.g());
      this.c.a(paramp.j(), paramp.g());
      if (this.g.D() != null) {
        this.j = this.g.D();
      } else {
        this.j = this.g.a(this.h, this.e);
      } 
      double d1 = fh.b(this.g.b(), paramp.a());
      double d2 = this.g.getRowCount() - fh.a(this.g.a(), paramp.b()) - 1.0D;
      double d3 = fh.b(this.h.b(), paramp.h());
      double d4 = this.h.getRowCount() - fh.a(this.h.a(), paramp.i()) - 1.0D;
      if (!paramp.e()) {
        int j = (int)Math.round(fh.a(this.i, paramp.a(), paramp.b()));
        long l = paramp.g() - j;
        s s1 = this.a.a(l, 100);
        double d5 = paramp.d();
        double d6 = this.b.a(l, 100);
        if (s1 != null && !Double.isNaN(d6)) {
          if (d6 < 50.0D)
            d6 += 100.0D; 
          for (byte b1 = 0; b1 < this.g.getRowCount(); b1++) {
            Thread.yield();
            for (byte b2 = 0; b2 < this.g.getColumnCount(); b2++) {
              if (b2 - d1 > -1.0D && b2 - d1 < 1.0D && b1 - d2 > -1.0D && b1 - d2 < 1.0D) {
                double d12;
                double d7 = (d1 - b2 >= 0.0D) ? Math.abs(d1 - b2 - 1.0D) : Math.abs(1.0D + d1 - b2);
                double d8 = (d2 - b1 >= 0.0D) ? Math.abs(d2 - b1 - 1.0D) : Math.abs(1.0D + d2 - b1);
                double d9 = (d7 == 0.0D || d8 == 0.0D) ? 0.005D : (d7 * d8);
                double d10 = this.n + s1.e(b1, b2).doubleValue();
                double d11 = this.n + s1.a(d2, d1);
                if (paramp.k()) {
                  d12 = this.c.a(l, 100);
                  if (Double.isNaN(d12)) {
                    D.d("Target Lambda unavailable, waiting for data.");
                    return;
                  } 
                } else {
                  d12 = this.h.a(d4, d3);
                } 
                double d13 = (d10 * d6 / 100.0D * d5 / d12 + d11 * d6 / 100.0D * d5 / d12) / 2.0D - this.n;
                this.j[b1][b2].a(Double.valueOf(d13), d9);
              } 
            } 
          } 
        } else {
          D.c("filtering record, no historic table close enough.");
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error calculating VE values. Debug info written to log file.");
    } 
  }
  
  public s a() {
    return this.g;
  }
  
  public s b() {
    return this.h;
  }
  
  public void a(s params) {
    this.h = params;
  }
  
  public s c() {
    return this.f;
  }
  
  void a(float paramFloat) {
    this.n = paramFloat;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bL/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */