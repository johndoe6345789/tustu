package com.efiAnalytics.ui;

import java.util.ArrayList;

public class eR {
  private double[][] b = null;
  
  private double[] c = null;
  
  private double[] d = null;
  
  private double[][] e = null;
  
  private String f = null;
  
  private String g = null;
  
  private String h = null;
  
  private double i = 0.0D;
  
  private double j = 0.0D;
  
  private double k = 1.0D;
  
  private double l = Double.MAX_VALUE;
  
  private double m = Double.MIN_VALUE;
  
  ArrayList a = new ArrayList();
  
  public eR(int paramInt1, int paramInt2) {
    a(paramInt1, paramInt2);
  }
  
  public eR() {
    a(1, 1);
  }
  
  public int a() {
    return (this.d == null) ? 0 : this.d.length;
  }
  
  public int b() {
    return (this.c == null) ? 0 : this.c.length;
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.c = new double[paramInt2];
    this.d = new double[paramInt1];
    this.b = new double[paramInt1][paramInt2];
    this.i = 0.0D;
    this.j = 0.0D;
  }
  
  public void a(int paramInt1, int paramInt2, double paramDouble) {
    if (paramDouble < this.m)
      paramDouble = this.m; 
    if (paramDouble > this.l)
      paramDouble = this.l; 
    if (s() > 0.0D) {
      double d1 = paramDouble - this.b[paramInt1][paramInt2];
      double d2 = d1 % s();
      if (d2 != 0.0D) {
        boolean bool1 = (d2 > s() / 2.0D) ? true : false;
        boolean bool2 = (d2 < -s() / 2.0D) ? true : false;
        if (bool1) {
          paramDouble = this.b[paramInt1][paramInt2] + d1 - d2 + s();
        } else if (bool2) {
          paramDouble = this.b[paramInt1][paramInt2] + d1 - d2 - s();
        } else {
          paramDouble = this.b[paramInt1][paramInt2] + d1 - d2;
        } 
      } 
    } 
    if (this.b[paramInt1][paramInt2] != paramDouble) {
      this.b[paramInt1][paramInt2] = paramDouble;
      t();
      b(paramInt1, paramInt2, paramDouble);
    } 
  }
  
  public double b(int paramInt1, int paramInt2) {
    return this.e[paramInt1][paramInt2];
  }
  
  public boolean c(int paramInt1, int paramInt2) {
    return (this.e == null) ? true : ((this.e[paramInt1][paramInt2] == this.b[paramInt1][paramInt2]));
  }
  
  public void c() {
    this.e = new double[this.b.length][(this.b[0]).length];
    for (byte b = 0; b < this.b.length; b++) {
      for (byte b1 = 0; b1 < (this.b[0]).length; b1++)
        this.e[b][b1] = this.b[b][b1]; 
    } 
  }
  
  private void t() {
    double d1 = Double.MAX_VALUE;
    double d2 = Double.MIN_VALUE;
    for (byte b = 0; b < this.b.length; b++) {
      for (byte b1 = 0; b1 < (this.b[0]).length; b1++) {
        if (this.b[b][b1] < d1)
          d1 = this.b[b][b1]; 
        if (this.b[b][b1] > d2)
          d2 = this.b[b][b1]; 
      } 
    } 
    this.i = d1;
    this.j = d2;
  }
  
  public double d(int paramInt1, int paramInt2) {
    return this.b[paramInt1][paramInt2];
  }
  
  public double a(double paramDouble) {
    for (byte b = 0; b < this.c.length; b++) {
      if (paramDouble < this.c[b]) {
        if (b == 0)
          return 0.0D; 
        if (b < this.c.length - 1) {
          double d1 = this.c[b];
          double d2 = this.c[b - 1];
          return (b - 1) + (paramDouble - d2) / (d1 - d2);
        } 
      } 
    } 
    return (this.c.length - 1);
  }
  
  public double b(double paramDouble) {
    for (byte b = 0; b < this.d.length; b++) {
      if (paramDouble < this.d[b]) {
        if (b == 0)
          return 0.0D; 
        if (b < this.d.length - 1) {
          double d1 = this.d[b];
          double d2 = this.d[b - 1];
          return (b - 1) + (paramDouble - d2) / (d1 - d2);
        } 
      } 
    } 
    return (this.d.length - 1);
  }
  
  public double a(int paramInt) {
    return this.c[paramInt];
  }
  
  public double b(int paramInt) {
    return (this.b.length == this.d.length / 2) ? this.d[paramInt * 2 + 1] : this.d[paramInt];
  }
  
  public void a(int paramInt, double paramDouble) {
    if (this.c[paramInt] != paramDouble) {
      this.c[paramInt] = paramDouble;
      c(paramInt, paramDouble);
    } 
  }
  
  public void b(int paramInt, double paramDouble) {
    if (this.d[paramInt] != paramDouble) {
      this.d[paramInt] = paramDouble;
      d(paramInt, paramDouble);
    } 
  }
  
  public void a(eS parameS) {
    this.a.add(parameS);
  }
  
  private void b(int paramInt1, int paramInt2, double paramDouble) {
    for (eS eS : this.a)
      eS.a(paramInt1, paramInt2, paramDouble); 
  }
  
  private void c(int paramInt, double paramDouble) {
    for (eS eS : this.a)
      eS.a(paramInt, paramDouble); 
  }
  
  private void d(int paramInt, double paramDouble) {
    for (eS eS : this.a)
      eS.b(paramInt, paramDouble); 
  }
  
  public void a(double[][] paramArrayOfdouble) {
    if ((paramArrayOfdouble.length != this.d.length && paramArrayOfdouble.length != this.d.length / 2) || (paramArrayOfdouble[0]).length != this.c.length)
      throw new IndexOutOfBoundsException("Z Dimensions do not match X and Y dimensions"); 
    this.b = paramArrayOfdouble;
    t();
  }
  
  public double[] d() {
    return this.c;
  }
  
  public double[] e() {
    return this.d;
  }
  
  public String f() {
    return this.f;
  }
  
  public void a(String paramString) {
    this.f = paramString;
  }
  
  public String g() {
    return this.g;
  }
  
  public void b(String paramString) {
    this.g = paramString;
  }
  
  public String h() {
    return this.h;
  }
  
  public void c(String paramString) {
    this.h = paramString;
  }
  
  public double i() {
    return this.c[0];
  }
  
  public double j() {
    return this.c[this.c.length - 1];
  }
  
  public double k() {
    return this.d[0];
  }
  
  public double l() {
    return this.d[this.d.length - 1];
  }
  
  public double m() {
    return this.i;
  }
  
  public double n() {
    return this.j;
  }
  
  public int o() {
    return this.c.length;
  }
  
  public int p() {
    return this.b.length;
  }
  
  public double q() {
    return this.l;
  }
  
  public void c(double paramDouble) {
    this.l = paramDouble;
  }
  
  public double r() {
    return this.m;
  }
  
  public void d(double paramDouble) {
    this.m = paramDouble;
  }
  
  public double s() {
    return this.k;
  }
  
  public void e(double paramDouble) {
    this.k = paramDouble;
  }
  
  private double a(double paramDouble, double[] paramArrayOfdouble) {
    if (paramArrayOfdouble == null || paramDouble <= paramArrayOfdouble[0])
      return 0.0D; 
    if (paramDouble >= paramArrayOfdouble[paramArrayOfdouble.length - 1])
      return (paramArrayOfdouble.length - 1); 
    for (byte b = 0; b < paramArrayOfdouble.length - 1; b++) {
      if (paramDouble == paramArrayOfdouble[b])
        return b; 
      if (paramDouble > paramArrayOfdouble[b] && paramDouble < paramArrayOfdouble[b + 1]) {
        double d = (paramDouble - paramArrayOfdouble[b]) / (paramArrayOfdouble[b + 1] - paramArrayOfdouble[b]);
        return b + d;
      } 
    } 
    return 0.0D;
  }
  
  public double a(double paramDouble1, double paramDouble2) {
    double d1 = a(paramDouble1, this.d);
    double d2 = a(paramDouble2, this.c);
    if (this.d.length / 2 == this.b.length)
      d1 /= 2.0D; 
    int i = (int)d1;
    int j = (int)d2;
    int k = (i < this.b.length - 1) ? (i + 1) : i;
    int m = (j < (this.b[0]).length - 1) ? (j + 1) : j;
    double d3 = d1 - i;
    double d4 = d2 - j;
    return this.b[i][j] * (1.0D - d4) * (1.0D - d3) + this.b[i][m] * d4 * (1.0D - d3) + this.b[k][j] * (1.0D - d4) * d3 + this.b[k][m] * d4 * d3;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */