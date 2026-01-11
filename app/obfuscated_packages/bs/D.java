package bs;

import G.R;
import G.aF;
import G.aH;
import G.aI;
import G.aM;
import G.bm;
import G.cu;
import G.dp;
import K.d;
import V.a;
import V.g;
import V.j;
import aP.hq;
import bL.k;
import bM.a;
import bM.b;
import bM.c;
import bM.d;
import bM.e;
import bt.bQ;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class D implements aF {
  private R p = null;
  
  private aM q = null;
  
  private aM r = null;
  
  private aM s = null;
  
  private aM t = null;
  
  ArrayList a;
  
  dp b = null;
  
  private s u = null;
  
  aH c = null;
  
  aH d = null;
  
  aH e = null;
  
  aH f = null;
  
  aH g = null;
  
  aH h = null;
  
  String i = "";
  
  private int v = 0;
  
  private int w = 0;
  
  private double x = 100.0D;
  
  private double y = Double.NaN;
  
  private double z = Double.NaN;
  
  private boolean A = false;
  
  private boolean B = true;
  
  private boolean C = true;
  
  double[] j = null;
  
  long k = 0L;
  
  E l = new E(this);
  
  b m;
  
  List n = new ArrayList();
  
  d o = new d();
  
  public D(R paramR, dp paramdp) {
    this.p = paramR;
    this.b = paramdp;
    this.m = new b(paramR);
    this.q = paramR.c(paramdp.a());
    this.r = paramR.c(paramdp.b());
    bm bm = (bm)paramR.e().c(paramdp.g());
    if (bm == null)
      throw new a("Lambda Temperature compensation CurvePanel not found. " + paramdp.g()); 
    this.s = paramR.c(bm.b(0));
    if (this.s == null)
      throw new a("Lambda Temperature compensation Parameter not found. " + bm.d(0)); 
    this.t = paramR.c(paramdp.l());
    this.u = bQ.a().a(paramR, paramdp.f());
    this.a = e.a().a(paramR, paramdp);
    this.j = d.a(paramR, this.q);
    if (paramdp.h() != null && !paramdp.h().equals(""))
      this.f = paramR.g(paramdp.h()); 
    this.e = paramR.g(paramdp.d());
    if (this.e == null)
      throw new a("WUE Analyze can not locate OutputChannel: " + paramdp.d() + " in the current Configuration."); 
    if (paramdp.n() == null)
      paramdp.p(this.u.w()); 
    this.c = paramR.g(paramdp.n());
    if (this.c == null)
      throw new a("WUE Analyze can not locate AFR Table X Axis OutputChannel: " + paramdp.n() + " in the current Configuration."); 
    if (paramdp.o() == null)
      paramdp.q(this.u.v()); 
    this.d = paramR.g(paramdp.o());
    if (this.d == null)
      throw new a("WUE Analyze can not locate AFR Table Y Axis OutputChannel: " + paramdp.o() + " in the current Configuration."); 
    this.g = paramR.g(paramdp.e());
    if (this.g == null)
      throw new a("WUE Analyze can not locate OutputChannel: " + paramdp.e() + " in the current Configuration."); 
    this.h = paramR.g(paramdp.k());
    if (this.g == null)
      throw new a("WUE Analyze can not locate OutputChannel: " + paramdp.k() + " in the current Configuration."); 
    try {
      m();
      n();
    } catch (g g) {
      Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      throw new a("Failed to start WUE Analyze.\n" + g.getMessage());
    } 
  }
  
  private void j() {
    for (e e : this.n)
      e.a(this.o); 
  }
  
  public void a(e parame) {
    this.n.add(parame);
  }
  
  public boolean a() {
    return this.A;
  }
  
  public String b() {
    return this.i;
  }
  
  void c() {
    this.u = bQ.a().a(this.p, this.b.f());
  }
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    if (this.A && System.currentTimeMillis() - this.k > 60L) {
      this.k = System.currentTimeMillis();
      a a = new a();
      try {
        float f = 40.0F;
        double d1 = this.g.b(paramArrayOfbyte);
        a.e(d1);
        if (Double.isNaN(g())) {
          this.y = this.e.b(paramArrayOfbyte);
        } else {
          this.y = (this.e.b(paramArrayOfbyte) + g() * f) / (f + 1.0F);
        } 
        a.c(g());
        double d2 = this.c.b(paramArrayOfbyte);
        double d3 = this.d.b(paramArrayOfbyte);
        this.z = fh.a(this.u, d2, d3) + a((int)Math.round(d1));
        a.d(h());
        if (this.f != null) {
          if (Double.isNaN(f())) {
            this.x = this.f.b(paramArrayOfbyte);
          } else {
            this.x = (this.f.b(paramArrayOfbyte) + f() * f) / (f + 1.0F);
          } 
          a.b(f());
        } 
        if (this.B) {
          a.a(this.h.b(paramArrayOfbyte));
        } else {
          a.a(a(d1));
        } 
        boolean bool = a(paramArrayOfbyte);
        a.a(bool);
        this.o.a(bool);
        this.m.a(a);
        if (bool) {
          this.v++;
        } else {
          if (Float.isNaN(this.o.f()) || this.o.f() > this.o.e())
            this.o.e(this.o.e()); 
          if (Float.isNaN(this.o.g()) || this.o.g() < this.o.e())
            this.o.f(this.o.e()); 
        } 
        this.w++;
        this.o.b((float)this.y);
        this.o.c((float)d1);
        this.o.a((float)this.z);
        this.o.b(this.v);
        this.o.a(this.w);
        this.o.d(o());
        k();
        j();
      } catch (g g) {
        Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        hq.a().d("WUE Analyze Error!! Could not retrieve all data. " + g.getMessage());
      } 
    } 
  }
  
  private void k() {
    if (this.o.e() > l())
      try {
        double[][] arrayOfDouble = this.r.i(this.p.h());
        for (byte b1 = 0; b1 < arrayOfDouble.length && (b1 == 0 || arrayOfDouble[b1 - 1][0] <= this.o.e()); b1++) {
          double d1;
          if (i() || arrayOfDouble[b1][0] > this.o.e()) {
            d1 = this.m.a((int)Math.round(arrayOfDouble[b1][0]));
          } else {
            c c = this.m.c((int)Math.round(arrayOfDouble[b1][0]));
            d1 = (c != null) ? c.c() : Double.NaN;
          } 
          try {
            if (!Double.isNaN(d1)) {
              d1 = (d1 < 100.0D || b1 == arrayOfDouble.length - 1) ? 100.0D : d1;
              this.t.a(this.p.h(), d1, b1, 0);
            } 
          } catch (j j) {
            Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j);
          } 
        } 
      } catch (g g) {
        g.printStackTrace();
      }  
  }
  
  private double l() {
    if (!Float.isNaN(this.o.f()))
      try {
        double[][] arrayOfDouble = this.r.i(this.p.h());
        for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
          if (arrayOfDouble[b1][0] > this.o.f())
            return arrayOfDouble[b1][0]; 
        } 
        return Double.NaN;
      } catch (g g) {
        Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        return Double.NaN;
      }  
    return Double.NaN;
  }
  
  protected boolean a(byte[] paramArrayOfbyte) {
    for (k k : this.a) {
      if (k.a((aI)this.p, paramArrayOfbyte)) {
        this.i = k.a();
        return true;
      } 
    } 
    this.i = "";
    return false;
  }
  
  public double a(double paramDouble) {
    double[][] arrayOfDouble1 = this.r.i(this.p.h());
    double[][] arrayOfDouble2 = this.q.i(this.p.h());
    return d.a(arrayOfDouble1, arrayOfDouble2, paramDouble);
  }
  
  public double b(double paramDouble) {
    return this.m.a((int)Math.round(paramDouble));
  }
  
  private double a(int paramInt) {
    double[][] arrayOfDouble1 = this.r.i(this.p.h());
    double[][] arrayOfDouble2 = this.s.i(this.p.h());
    return d.a(arrayOfDouble1, arrayOfDouble2, paramInt);
  }
  
  public double d() {
    double[][] arrayOfDouble = this.r.i(this.p.h());
    return arrayOfDouble[arrayOfDouble.length - 1][0];
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      cu.a().a(this.p.c(), this.g.aL(), this.l);
      cu.a().a(this.p.c(), this.e.aL(), this.l);
      cu.a().a(this.p.c(), this.c.aL(), this.l);
      cu.a().a(this.p.c(), this.d.aL(), this.l);
      if (this.f != null)
        cu.a().a(this.p.c(), this.f.aL(), this.l); 
      try {
        m();
      } catch (g g) {
        Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        a(false);
        throw new a("Failed to start WUE Analyze.\n" + g.getMessage());
      } 
      this.A = paramBoolean;
    } else {
      this.A = paramBoolean;
      cu.a().a(this.l);
    } 
  }
  
  private void m() {
    double[][] arrayOfDouble = this.q.i(this.p.p());
    try {
      this.t.a(this.p.p(), arrayOfDouble);
    } catch (j j) {
      Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j);
    } 
  }
  
  private void n() {
    this.m.c();
  }
  
  public void e() {
    double[][] arrayOfDouble = this.t.i(this.p.p());
    try {
      this.q.a(this.p.p(), arrayOfDouble);
    } catch (j j) {
      Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j);
    } 
  }
  
  public double f() {
    return this.x;
  }
  
  public double g() {
    return this.y;
  }
  
  public double h() {
    return this.z;
  }
  
  private float o() {
    return 0.0F;
  }
  
  public int a(float paramFloat) {
    return this.m.e(Math.round(paramFloat));
  }
  
  public boolean i() {
    return this.C;
  }
  
  public void b(boolean paramBoolean) {
    this.C = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */