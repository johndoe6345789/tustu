package com.efiAnalytics.ui;

import bH.X;

public class b {
  public static int a = 1;
  
  public static int b = 2;
  
  private int m = 0;
  
  double c = 0.0D;
  
  private boolean n = false;
  
  private boolean o = false;
  
  double d = 0.0D;
  
  double e = 0.0D;
  
  int f = 0;
  
  public static double g = 5.0D;
  
  double h = 0.0D;
  
  private c p = null;
  
  double i = Double.NEGATIVE_INFINITY;
  
  double j = Double.POSITIVE_INFINITY;
  
  double k = 0.0D;
  
  double l = 0.0D;
  
  public b() {
    this.p = new c();
  }
  
  public b(c paramc) {
    this.p = paramc;
  }
  
  public void a(double paramDouble) {
    a(paramDouble, this.p.h());
  }
  
  public void a(double paramDouble1, double paramDouble2) {
    this.c = paramDouble1;
    this.h = paramDouble1;
    this.m = 0;
    this.p.f(paramDouble2);
  }
  
  public void b(double paramDouble) {
    a(paramDouble);
    this.d = this.p.h();
    this.f = 0;
    this.h = Double.NaN;
    this.i = Double.NEGATIVE_INFINITY;
    this.j = Double.POSITIVE_INFINITY;
    this.k = 0.0D;
    this.l = 0.0D;
  }
  
  public double a() {
    return this.c;
  }
  
  public String b() {
    return X.a(this.c);
  }
  
  public void a(Double paramDouble, double paramDouble1) {
    double d1;
    if (this.p == null)
      this.p = new c(); 
    if (paramDouble1 <= this.p.a() || this.o || Double.isNaN(paramDouble.doubleValue()))
      return; 
    if (this.d >= this.p.i()) {
      d1 = (this.h * this.p.i() + paramDouble.doubleValue() * paramDouble1) / (this.p.i() + paramDouble1);
    } else if (Double.isNaN(this.h)) {
      d1 = paramDouble.doubleValue();
    } else {
      d1 = (this.h * (this.d + this.p.h()) + paramDouble.doubleValue() * paramDouble1) / (this.d + this.p.h() + paramDouble1);
    } 
    if (Math.abs(d1 - this.c) > this.p.d()) {
      this.m &= b;
      return;
    } 
    if (!Double.isNaN(this.p.e())) {
      double d = Math.abs(d1 - this.c) / this.c;
      if (d > this.p.e()) {
        this.m &= a;
        return;
      } 
    } 
    if (paramDouble.doubleValue() > this.i)
      this.i = paramDouble.doubleValue(); 
    if (paramDouble.doubleValue() < this.j)
      this.j = paramDouble.doubleValue(); 
    this.k += paramDouble.doubleValue() * paramDouble1;
    this.h = d1;
    this.d += paramDouble1;
    this.f++;
    double d2 = e();
    this.l += (d2 - paramDouble.doubleValue()) * (d2 - paramDouble.doubleValue()) * paramDouble1;
  }
  
  public double c() {
    return Math.sqrt(d());
  }
  
  public double d() {
    return this.l / this.d;
  }
  
  public double e() {
    return (i() == null) ? 0.0D : i().doubleValue();
  }
  
  public Double f() {
    return Double.isInfinite(this.i) ? null : Double.valueOf(this.i);
  }
  
  public Double g() {
    return Double.isInfinite(this.j) ? null : Double.valueOf(this.j);
  }
  
  public void c(double paramDouble) {
    this.e = paramDouble;
  }
  
  public double h() {
    return this.e;
  }
  
  public Double i() {
    return (this.p.c() > Math.abs(this.h - this.c)) ? Double.valueOf(this.c) : ((Double.isNaN(this.h) || this.p.b() > this.d) ? null : (this.n ? new Double(Math.round(this.h)) : Double.valueOf(this.h)));
  }
  
  public int j() {
    return this.f;
  }
  
  public double k() {
    return this.d;
  }
  
  public String l() {
    return X.a(k());
  }
  
  public String toString() {
    return i().intValue() + "";
  }
  
  public void a(c paramc) {
    this.p = paramc;
  }
  
  public boolean m() {
    return this.o;
  }
  
  public void a(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public void n() {
    this.f = 0;
    this.d = 0.0D;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */