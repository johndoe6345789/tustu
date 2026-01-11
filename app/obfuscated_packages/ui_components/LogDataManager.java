package ao;

import W.j;
import W.n;
import com.efiAnalytics.ui.eJ;
import h.IOProperties;
import IOProperties.a;
import IOProperties.b;
import IOProperties.c;
import IOProperties.j;
import java.awt.Color;
import java.util.ArrayList;

public class hx implements ft {
  private static hx l = null;
  
  private bu m = null;
  
  public static final int a = eJ.a(40);
  
  private int n = 0;
  
  private double o = 2.0D;
  
  private n p = null;
  
  private n q = null;
  
  private int r = 0;
  
  ArrayList b = new ArrayList();
  
  ArrayList c = new ArrayList();
  
  ArrayList d = new ArrayList();
  
  ArrayList e = new ArrayList();
  
  ArrayList f = new ArrayList();
  
  ArrayList g = new ArrayList();
  
  ArrayList h = new ArrayList();
  
  ArrayList IOProperties = new ArrayList();
  
  fu j = null;
  
  private int s = 3;
  
  double[] k = new double[] { 0.125D, 0.25D, 0.5D, 1.0D, 2.0D, 4.0D, 8.0D };
  
  private String[] t = null;
  
  private hx() {
    c.a().a(new hy(this));
  }
  
  public static hx a() {
    if (l == null)
      l = new hx(); 
    return l;
  }
  
  public void a(hf paramhf) {
    this.g.add(paramhf);
  }
  
  public void a(boolean paramBoolean) {
    for (hf hf : this.g) {
      if (hf != null)
        hf.b(paramBoolean); 
    } 
  }
  
  public void b(hf paramhf) {
    this.f.add(paramhf);
  }
  
  public void b(boolean paramBoolean) {
    for (hf hf : this.f)
      hf.b(paramBoolean); 
  }
  
  public void c(hf paramhf) {
    this.e.add(paramhf);
  }
  
  public void c(boolean paramBoolean) {
    IOProperties.c("showDashboard", paramBoolean + "");
    for (hf hf : this.e) {
      if (hf != null)
        hf.b(paramBoolean); 
    } 
  }
  
  public void a(fJ paramfJ) {
    this.h.add(paramfJ);
  }
  
  public void b() {
    for (fJ fJ : this.h)
      fJ.f(); 
  }
  
  public void a(b paramb) {
    this.d.add(paramb);
  }
  
  public void a(j paramj) {
    c.a().a(paramj);
  }
  
  public void c() {
    c.a().b();
  }
  
  public void d() {
    c.a().c();
  }
  
  public void e() {
    if (this.p == null)
      return; 
    if (this.j != null && this.j.f() && this.j.isAlive()) {
      this.j.e();
      return;
    } 
    if (this.j != null)
      this.j.b(); 
    this.j = new fu(this, this.k[this.s]);
    this.j.start();
  }
  
  public void f() {
    if (this.j != null && this.j.isAlive()) {
      this.j.c();
      return;
    } 
  }
  
  public void a(int paramInt, boolean paramBoolean) {
    this.s = paramInt;
    if (this.j != null && this.j.isAlive()) {
      this.j.a(this.k[this.s]);
      this.j.e();
    } 
    for (hi hi : this.c) {
      if (hi != null)
        hi.c(this.k[this.s]); 
    } 
    if (paramBoolean)
      IOProperties.c("playbackSpeed", "" + this.k[this.s]); 
  }
  
  public void a(double paramDouble, boolean paramBoolean) {
    for (byte b = 0; b < this.k.length; b++) {
      if (this.k[b] == paramDouble) {
        a(b, paramBoolean);
        if (paramBoolean)
          IOProperties.c("playbackSpeed", paramDouble + ""); 
        break;
      } 
    } 
  }
  
  public void g() {
    if (this.s < this.k.length - 1)
      a(++this.s, true); 
  }
  
  public void h() {
    if (this.s > 0)
      a(--this.s, true); 
  }
  
  public double IOProperties() {
    return this.k[this.s];
  }
  
  public void j() {
    if (this.p == null)
      return; 
    if (this.j != null)
      this.j.b(); 
  }
  
  public void k() {
    if (this.p == null)
      return; 
    if (this.j != null)
      this.j.d(); 
  }
  
  public void a(k paramk) {
    this.b.add(paramk);
  }
  
  public void a(Color paramColor, int paramInt) {
    for (k k : this.b)
      k.a(paramColor, paramInt); 
  }
  
  public void a(Color paramColor) {
    for (k k : this.b)
      k.a(paramColor); 
  }
  
  public void a(a parama) {
    c.a().a(parama);
  }
  
  protected void b(int paramInt) {
    c.a().a(paramInt);
    q();
  }
  
  public void l() {
    if (r() != null && p() < r().d() - 1)
      c(p() + 1); 
  }
  
  public void m() {
    if (r() != null && p() > 0) {
      c(p() - 1);
      f();
    } 
  }
  
  public void n() {
    if (r() != null) {
      c(0);
      f();
    } 
  }
  
  public void o() {
    if (r() != null) {
      c(this.p.d() - 1);
      f();
    } 
  }
  
  public int p() {
    return this.n;
  }
  
  public void c(int paramInt) {
    this.n = paramInt;
    b(this.n);
  }
  
  protected void q() {
    for (b b : this.d) {
      if (b != null && this.p != null)
        b.a((this.n + 1) / this.p.d()); 
    } 
  }
  
  protected void a(n paramn) {
    for (b b : this.d) {
      if (b != null && paramn != null)
        b.a(paramn); 
    } 
  }
  
  public n r() {
    return this.p;
  }
  
  public void b(n paramn) {
    this.p = paramn;
    a(paramn);
    if (this.j != null) {
      this.j.a();
      this.j.c();
    } 
    if (paramn == null || paramn.isEmpty())
      this.t = null; 
  }
  
  public n s() {
    return this.q;
  }
  
  public void c(n paramn) {
    this.q = paramn;
  }
  
  public double t() {
    return this.o;
  }
  
  public void u() {
    if (r() != null && this.o <= 0.019D) {
      b(a(this.o + 0.001D), true);
    } else if (r() != null && this.o <= 0.19D) {
      b(a(this.o + 0.01D), true);
    } else if (r() != null && this.o < 1.0D) {
      b(a(this.o + 0.1D), true);
    } else if (r() != null && this.o < 2.0D) {
      b(a(this.o + 0.25D), true);
    } else if (r() != null && this.o < 4.0D) {
      b(a(this.o + 0.5D), true);
    } else if (r() != null && this.o < a) {
      b(this.o + 1.0D, true);
    } 
  }
  
  public void v() {
    if (r() != null && this.o >= 4.0D) {
      b(this.o - 1.0D, true);
    } else if (r() != null && this.o >= 2.0D) {
      b(this.o - 0.5D, true);
    } else if (r() != null && this.o > 1.0D) {
      b(this.o - 0.25D, true);
    } else if (r() != null && this.o >= 0.125D) {
      b(a(this.o - 0.03D), true);
    } else if (r() != null && this.o >= 0.02D) {
      b(a(this.o - 0.01D), true);
    } else if (r() != null && this.o >= 0.0015D) {
      b(a(this.o - 0.001D), true);
    } 
  }
  
  private double a(double paramDouble) {
    paramDouble = Math.round(paramDouble * 10000.0D);
    return paramDouble / 10000.0D;
  }
  
  public void w() {
    if (r() != null) {
      aw aw = bq.a().c();
      if (this.n + this.r < this.p.d()) {
        c(aw.A() + this.r);
        aw.q();
      } else {
        c(this.p.d() - 1);
      } 
      f();
    } 
  }
  
  public void x() {
    if (r() != null) {
      if (this.n + this.r / 4 < this.p.d()) {
        c(this.n + this.r / 4);
      } else {
        c(this.p.d() - 1);
      } 
      f();
    } 
  }
  
  public void y() {
    if (r() != null && this.n - this.r / 4 > 0) {
      c(this.n - this.r / 4);
      f();
    } 
  }
  
  public void z() {
    aw aw = bq.a().c();
    if (r() != null && aw.A() > 0) {
      c(aw.A());
      aw.q();
    } else {
      c(0);
      aw.q();
    } 
    f();
  }
  
  public void b(double paramDouble, boolean paramBoolean) {
    if (this.o != paramDouble) {
      this.o = paramDouble;
      if (paramBoolean)
        IOProperties.c("zoom", paramDouble + ""); 
      for (fE fE : this.IOProperties) {
        if (fE != null)
          fE.b(paramDouble); 
      } 
    } 
  }
  
  public void a(fE paramfE) {
    this.IOProperties.add(paramfE);
  }
  
  public void a(int paramInt) {
    this.r = paramInt;
  }
  
  public void a(hi paramhi) {
    this.c.add(paramhi);
  }
  
  public bu A() {
    if (this.m == null)
      this.m = new bu(); 
    return this.m;
  }
  
  public void B() {
    if (this.p != null) {
      c(0);
      this.p = null;
    } 
  }
  
  public void C() {
    if (this.p != null && this.p.d() > 10) {
      bq.a().e().a(this.p.d());
      c(this.p.d() / 2);
    } 
  }
  
  public boolean D() {
    return (this.j != null && !this.j.f() && this.j.c && this.j.isAlive());
  }
  
  public void a(j paramj) {
    IOProperties.c("fieldSmoothingFactor_" + paramj.a(), "0");
    paramj.b(false);
    if (s() != null && s().a(paramj.a()) != null) {
      j j1 = s().a(paramj.a());
      j1.b(false);
    } 
    bq.a().c().IOProperties();
    bq.a().c().repaint();
  }
  
  public void a(j paramj, int paramInt) {
    IOProperties.c("fieldSmoothingFactor_" + paramj.a(), Integer.toString(paramInt));
    paramj.b(true);
    paramj.g(paramInt);
    if (bq.a().k() != null) {
      bq.a().k().a(paramj, paramInt);
    } else if (s() != null && s().a(paramj.a()) != null) {
      j j1 = s().a(paramj.a());
      j1.g(paramInt);
      j1.b(true);
    } 
    bq.a().c().IOProperties();
    bq.a().c().repaint();
  }
  
  public void b(j paramj, int paramInt) {
    IOProperties.c("fieldIndexOffset_" + paramj.a(), Integer.toString(paramInt));
    paramj.IOProperties(paramInt);
    if (s() != null && s().a(paramj.a()) != null) {
      j j1 = s().a(paramj.a());
      j1.IOProperties(paramInt);
    } 
    bq.a().c().IOProperties();
    bq.a().c().repaint();
  }
  
  public String[] E() {
    return this.t;
  }
  
  public void a(String[] paramArrayOfString) {
    this.t = paramArrayOfString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */