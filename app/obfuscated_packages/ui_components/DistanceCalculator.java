package ao;

import L.z;
import W.j;
import W.n;
import ax.U;
import bE.b;
import bE.c;
import bE.l;
import bE.p;
import bE.q;
import bx.j;
import h.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k.a;
import k.d;

class eq implements p {
  private n g = null;
  
  j a = null;
  
  j b = null;
  
  j c = null;
  
  List d = new ArrayList();
  
  HashMap e = new HashMap<>();
  
  z f = new z();
  
  private final fK h;
  
  eq(fK paramfK) {
    this.h = paramfK;
  }
  
  public double a() {
    return (this.a == null) ? 0.0D : (this.h.q.a() ? ((this.b != null && n()) ? j() : this.a.e()) : this.h.q.b());
  }
  
  private double j() {
    double d1;
    double d2;
    if (this.b.a().toLowerCase().contains("lat")) {
      d1 = this.f.a(this.b.h(), this.a.h(), this.b.g(), this.a.h());
      d2 = this.f.a(this.b.h(), this.a.h(), this.b.h(), this.a.g());
    } else {
      d1 = this.f.a(this.a.h(), this.b.h(), this.a.g(), this.b.h());
      d2 = this.f.a(this.a.h(), this.b.h(), this.a.h(), this.b.g());
    } 
    if (d2 > d1) {
      double d = (this.a.g() - this.a.h()) * 0.05D;
      return this.a.h() - d;
    } 
    double d3 = d1 / d2 * 1.05D;
    double d4 = ((this.a.h() + this.a.g()) / 2.0F);
    return d4 - (d4 - this.a.e()) * d3;
  }
  
  public double b() {
    return (this.a == null) ? 100.0D : (this.h.q.a() ? ((this.b != null && n()) ? k() : this.a.f()) : this.h.q.c());
  }
  
  private double k() {
    double d1;
    double d2;
    if (this.b.a().toLowerCase().contains("lat")) {
      d1 = this.f.a(this.b.h(), this.a.h(), this.b.g(), this.a.h());
      d2 = this.f.a(this.b.h(), this.a.h(), this.b.h(), this.a.g());
    } else {
      d1 = this.f.a(this.a.h(), this.b.h(), this.a.g(), this.b.h());
      d2 = this.f.a(this.a.h(), this.b.h(), this.a.h(), this.b.g());
    } 
    if (d2 > d1) {
      double d = (this.a.g() - this.a.h()) * 0.05D;
      return this.a.g() + d;
    } 
    double d3 = d1 / d2 * 1.05D;
    double d4 = ((this.a.h() + this.a.g()) / 2.0F);
    return d4 + (this.a.f() - d4) * d3;
  }
  
  public double c() {
    return (this.b == null) ? 0.0D : (this.h.q.d() ? ((this.a != null && n()) ? l() : this.b.e()) : this.h.q.e());
  }
  
  private double l() {
    double d1;
    double d2;
    if (this.b.a().toLowerCase().contains("lat")) {
      d1 = this.f.a(this.b.h(), this.a.h(), this.b.g(), this.a.h());
      d2 = this.f.a(this.b.h(), this.a.h(), this.b.h(), this.a.g());
    } else {
      d1 = this.f.a(this.a.h(), this.b.h(), this.a.g(), this.b.h());
      d2 = this.f.a(this.a.h(), this.b.h(), this.a.h(), this.b.g());
    } 
    if (d1 > d2) {
      double d = (this.b.g() - this.b.h()) * 0.05D;
      return this.b.h() - d;
    } 
    double d3 = d2 / d1 * 1.05D;
    double d4 = ((this.b.h() + this.b.g()) / 2.0F);
    return d4 - (d4 - this.b.e()) * d3;
  }
  
  public double d() {
    return (this.b == null) ? 100.0D : (this.h.q.d() ? ((this.a != null && n()) ? m() : this.b.f()) : this.h.q.f());
  }
  
  private double m() {
    double d1;
    double d2;
    if (this.b.a().toLowerCase().contains("lat")) {
      d1 = this.f.a(this.b.h(), this.a.h(), this.b.g(), this.a.h());
      d2 = this.f.a(this.b.h(), this.a.h(), this.b.h(), this.a.g());
    } else {
      d1 = this.f.a(this.a.h(), this.b.h(), this.a.g(), this.b.h());
      d2 = this.f.a(this.a.h(), this.b.h(), this.a.h(), this.b.g());
    } 
    if (d1 > d2) {
      double d = (this.b.g() - this.b.h()) * 0.05D;
      return this.b.g() + d;
    } 
    double d3 = d2 / d1 * 1.05D;
    double d4 = ((this.b.h() + this.b.g()) / 2.0F);
    return d4 + (this.b.f() - d4) * d3;
  }
  
  private boolean n() {
    return ((this.b.a().toLowerCase().contains("lat") && this.a.a().toLowerCase().contains("long")) || (this.b.a().toLowerCase().contains("long") && this.a.a().toLowerCase().contains("lat")));
  }
  
  protected boolean a(int paramInt) {
    for (j j1 : this.h.j.a()) {
      try {
        String str = d(j1.c());
        a a = d.a().a(str);
        if (a.a(this.g, paramInt) != 0.0D)
          return true; 
      } catch (U u) {
        this.h.j.a(j1.a(), false);
        u.printStackTrace();
      } 
    } 
    return false;
  }
  
  private String d(String paramString) {
    String str = (String)this.e.get(paramString);
    if (str == null) {
      str = g.a().c(paramString);
      this.e.put(paramString, str);
    } 
    return str;
  }
  
  public q b(int paramInt) {
    double d = (this.c == null) ? Double.NaN : this.c.c(paramInt);
    boolean bool = a(paramInt);
    return (q)(bool ? new c(this.a.c(paramInt), this.b.c(paramInt), d) : new b(this.a.c(paramInt), this.b.c(paramInt), d));
  }
  
  public int e() {
    return (this.a == null || this.b == null) ? 0 : this.h.f();
  }
  
  public int f() {
    return this.h.g();
  }
  
  public void a(String paramString) {
    j j1 = g().a(paramString);
    this.a = j1;
    if (j1 != null)
      this.h.i().h(j1.m()); 
    o();
  }
  
  public void b(String paramString) {
    j j1 = g().a(paramString);
    this.b = j1;
    if (j1 != null)
      this.h.i().i(j1.m()); 
    o();
  }
  
  public void c(String paramString) {
    j j1 = g().a(paramString);
    this.c = j1;
    if (j1 != null)
      this.h.i().j(j1.m()); 
    o();
  }
  
  public n g() {
    return this.g;
  }
  
  public void a(n paramn) {
    this.g = paramn;
    this.e.clear();
    o();
  }
  
  public void a(l paraml) {
    this.d.add(paraml);
  }
  
  public void b(l paraml) {
    this.d.remove(paraml);
  }
  
  private void o() {
    Iterator<l> iterator = this.d.iterator();
    while (iterator.hasNext())
      ((l)iterator.next()).a(); 
  }
  
  public double h() {
    return (this.c == null) ? Double.NaN : (this.h.q.g() ? this.c.e() : this.h.q.h());
  }
  
  public double i() {
    return (this.c == null) ? Double.NaN : (this.h.q.g() ? this.c.f() : this.h.q.i());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */