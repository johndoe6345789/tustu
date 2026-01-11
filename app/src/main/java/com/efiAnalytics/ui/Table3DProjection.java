package com.efiAnalytics.ui;

public class Table3DProjection {
  final double a = Math.PI;
  
  final double b = 1.5707963267948966D;
  
  private eR j = null;
  
  private eM k = null;
  
  private double l = 0.39269908169872414D;
  
  private double m = 5.890486225480862D;
  
  int c = 0;
  
  int d = 0;
  
  double e = 0.7D;
  
  private double n = 0.45D;
  
  eZ f = null;
  
  eZ[][] g = null;
  
  private boolean o = false;
  
  final double h = 1.5707963267948966D;
  
  eZ i = null;
  
  public eT(eM parameM) {
    a(parameM);
  }
  
  public eZ a(double paramDouble1, double paramDouble2, double paramDouble3) {
    return a(paramDouble1, paramDouble2, paramDouble3, null);
  }
  
  public eZ a() {
    if (this.k.getWidth() < this.k.getHeight() / 0.71D) {
      this.e = 0.71D;
    } else {
      this.e = this.k.getHeight() / this.k.getWidth();
    } 
    this.e *= 0.95D;
    double d1 = this.k.getWidth() * this.e;
    double d2 = this.k.getWidth() * this.e;
    double d3 = this.k.getHeight() * f() + 0.5D * this.k.getHeight() / 4.0D - f() * this.k.getHeight() / 4.0D;
    double d4 = this.k.getWidth() * this.e * 1.41D / 2.0D;
    int i = (int)(this.k.getWidth() / 2.0D) - (int)(d4 * Math.cos(d() + 0.7853981633974483D));
    int j = (int)(this.k.getHeight() + (d1 * Math.sin(d()) + d2 * Math.cos(d())) * Math.sin(e() - Math.PI) + d3 * Math.cos(e() + Math.PI)) / 2;
    this.i = new eZ();
    this.i.a = i;
    this.i.b = j;
    return this.i;
  }
  
  public eZ a(double paramDouble1, double paramDouble2, double paramDouble3, eZ parameZ) {
    if (parameZ == null)
      parameZ = new eZ(); 
    double d1 = this.k.getWidth() * this.e * e(paramDouble1);
    double d2 = this.k.getWidth() * this.e * f(paramDouble2);
    double d3 = this.k.getHeight() * f() * a(paramDouble3);
    this.f = a();
    parameZ.a = (int)Math.round(this.f.a + d1 * Math.cos(d()) + d2 * Math.cos(d() + 1.5707963267948966D));
    parameZ.b = (int)Math.round(this.f.b + d2 * Math.cos(d()) * Math.sin(e()) + d1 * Math.sin(d()) * Math.sin(e()) + d3 * Math.sin(e() + 1.5707963267948966D));
    return parameZ;
  }
  
  public double a(double paramDouble1, double paramDouble2, int paramInt) {
    double d1 = this.k.getWidth() * this.e * e(paramDouble1);
    double d2 = this.k.getWidth() * this.e * f(paramDouble2);
    double d3 = this.k.getHeight() * f();
    double d4 = 0.0D;
    this.f = a();
    int i = (int)Math.round(this.f.b + d2 * Math.cos(d()) * Math.sin(e()) + d1 * Math.sin(d()) * Math.sin(e()) + d4 * Math.sin(e() + 1.5707963267948966D));
    int j = (int)Math.round(this.f.b + d2 * Math.cos(d()) * Math.sin(e()) + d1 * Math.sin(d()) * Math.sin(e()) + d3 * Math.sin(e() + 1.5707963267948966D));
    double d5 = (paramInt - i) / (j - i);
    return this.j.r() + (this.j.n() - this.j.r()) * d5;
  }
  
  public eZ[][] b() {
    long l = System.nanoTime();
    this.g = new eZ[this.j.p()][this.j.o()];
    for (byte b = 0; b < this.j.p(); b++) {
      for (byte b1 = 0; b1 < this.j.o(); b1++)
        this.g[b][b1] = a(this.j.a(b1), this.j.b(b), this.j.d(b, b1), this.g[b][b1]); 
    } 
    double d = (System.nanoTime() - l) / 1000000.0D;
    return this.g;
  }
  
  private double e(double paramDouble) {
    double[] arrayOfDouble = this.j.d();
    if (this.o) {
      for (byte b = 1; b < arrayOfDouble.length; b++) {
        if (arrayOfDouble[b] >= paramDouble) {
          double d = paramDouble - arrayOfDouble[b - 1];
          return (b - 1) / arrayOfDouble.length + d / (arrayOfDouble[b] - arrayOfDouble[b - 1]) * arrayOfDouble.length;
        } 
      } 
      return arrayOfDouble[arrayOfDouble.length - 1];
    } 
    return (paramDouble >= arrayOfDouble[arrayOfDouble.length - 1]) ? 1.0D : ((paramDouble - arrayOfDouble[0]) / (arrayOfDouble[arrayOfDouble.length - 1] - arrayOfDouble[0]));
  }
  
  private double f(double paramDouble) {
    double[] arrayOfDouble = this.j.e();
    if (this.o) {
      for (byte b = 1; b < arrayOfDouble.length; b++) {
        if (arrayOfDouble[b] >= paramDouble) {
          double d = paramDouble - arrayOfDouble[b - 1];
          return (b - 1) / arrayOfDouble.length + d / (arrayOfDouble[b] - arrayOfDouble[b - 1]) * arrayOfDouble.length;
        } 
      } 
      return arrayOfDouble[arrayOfDouble.length - 1];
    } 
    return (paramDouble >= arrayOfDouble[arrayOfDouble.length - 1]) ? 1.0D : ((paramDouble - arrayOfDouble[0]) / (arrayOfDouble[arrayOfDouble.length - 1] - arrayOfDouble[0]));
  }
  
  public double a(double paramDouble) {
    return (paramDouble - this.j.r()) / (this.j.n() - this.j.r());
  }
  
  public void a(eR parameR) {
    this.j = parameR;
  }
  
  public void a(eM parameM) {
    this.k = parameM;
  }
  
  public void c() {
    this.i = a();
  }
  
  public void a(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public double d() {
    return this.l;
  }
  
  public void b(double paramDouble) {
    this.l = paramDouble;
  }
  
  public double e() {
    return this.m;
  }
  
  public void c(double paramDouble) {
    this.m = paramDouble;
  }
  
  public double f() {
    return this.n;
  }
  
  public void d(double paramDouble) {
    this.n = paramDouble;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */