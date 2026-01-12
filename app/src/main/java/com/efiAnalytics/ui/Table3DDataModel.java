package com.efiAnalytics.ui;

import java.util.ArrayList;

public class Table3DDataModel {
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

  public Table3DDataModel(int paramInt1, int paramInt2) {
    Table3DDataModel(paramInt1, paramInt2);
  }

  public Table3DDataModel() {
    Table3DDataModel(1, 1);
  }

  public int Table3DDataModel() {
    return (this.d == null) ? 0 : this.d.length;
  }

  public int Table3DDataModel() {
    return (this.c == null) ? 0 : this.c.length;
  }

  public void Table3DDataModel(int paramInt1, int paramInt2) {
    this.c = new double[paramInt2];
    this.d = new double[paramInt1];
    this.b = new double[paramInt1][paramInt2];
    this.i = 0.0D;
    this.j = 0.0D;
  }

  public void Table3DDataModel(int paramInt1, int paramInt2, double paramDouble) {
    if (paramDouble < this.m) paramDouble = this.m;
    if (paramDouble > this.l) paramDouble = this.l;
    if (s() > 0.0D) {
      double d1 = paramDouble - this.b[paramInt1][paramInt2];
      double d2 = d1 % Table3DDataModel();
      if (d2 != 0.0D) {
        boolean bool1 = (d2 > Table3DDataModel() / 2.0D) ? true : false;
        boolean bool2 = (d2 < -s() / 2.0D) ? true : false;
        if (bool1) {
          paramDouble = this.b[paramInt1][paramInt2] + d1 - d2 + Table3DDataModel();
        } else if (bool2) {
          paramDouble = this.b[paramInt1][paramInt2] + d1 - d2 - Table3DDataModel();
        } else {
          paramDouble = this.b[paramInt1][paramInt2] + d1 - d2;
        }
      }
    }
    if (this.b[paramInt1][paramInt2] != paramDouble) {
      this.b[paramInt1][paramInt2] = paramDouble;
      Table3DDataModel();
      Table3DDataModel(paramInt1, paramInt2, paramDouble);
    }
  }

  public double Table3DDataModel(int paramInt1, int paramInt2) {
    return this.e[paramInt1][paramInt2];
  }

  public boolean Table3DDataModel(int paramInt1, int paramInt2) {
    return (this.e == null)
        ? true
        : ((this.e[paramInt1][paramInt2] == this.b[paramInt1][paramInt2]));
  }

  public void Table3DDataModel() {
    this.e = new double[this.b.length][(this.b[0]).length];
    for (byte b = 0; b < this.b.length; b++) {
      for (byte b1 = 0; b1 < (this.b[0]).length; b1++) this.e[b][b1] = this.b[b][b1];
    }
  }

  private void Table3DDataModel() {
    double d1 = Double.MAX_VALUE;
    double d2 = Double.MIN_VALUE;
    for (byte b = 0; b < this.b.length; b++) {
      for (byte b1 = 0; b1 < (this.b[0]).length; b1++) {
        if (this.b[b][b1] < d1) d1 = this.b[b][b1];
        if (this.b[b][b1] > d2) d2 = this.b[b][b1];
      }
    }
    this.i = d1;
    this.j = d2;
  }

  public double Table3DDataModel(int paramInt1, int paramInt2) {
    return this.b[paramInt1][paramInt2];
  }

  public double Table3DDataModel(double paramDouble) {
    for (byte b = 0; b < this.c.length; b++) {
      if (paramDouble < this.c[b]) {
        if (b == 0) return 0.0D;
        if (b < this.c.length - 1) {
          double d1 = this.c[b];
          double d2 = this.c[b - 1];
          return (b - 1) + (paramDouble - d2) / (d1 - d2);
        }
      }
    }
    return (this.c.length - 1);
  }

  public double Table3DDataModel(double paramDouble) {
    for (byte b = 0; b < this.d.length; b++) {
      if (paramDouble < this.d[b]) {
        if (b == 0) return 0.0D;
        if (b < this.d.length - 1) {
          double d1 = this.d[b];
          double d2 = this.d[b - 1];
          return (b - 1) + (paramDouble - d2) / (d1 - d2);
        }
      }
    }
    return (this.d.length - 1);
  }

  public double Table3DDataModel(int paramInt) {
    return this.c[paramInt];
  }

  public double Table3DDataModel(int paramInt) {
    return (this.b.length == this.d.length / 2) ? this.d[paramInt * 2 + 1] : this.d[paramInt];
  }

  public void Table3DDataModel(int paramInt, double paramDouble) {
    if (this.c[paramInt] != paramDouble) {
      this.c[paramInt] = paramDouble;
      Table3DDataModel(paramInt, paramDouble);
    }
  }

  public void Table3DDataModel(int paramInt, double paramDouble) {
    if (this.d[paramInt] != paramDouble) {
      this.d[paramInt] = paramDouble;
      Table3DDataModel(paramInt, paramDouble);
    }
  }

  public void Table3DDataModel(eS parameS) {
    this.a.add(parameS);
  }

  private void Table3DDataModel(int paramInt1, int paramInt2, double paramDouble) {
    for (eS eS : this.a) eS.a(paramInt1, paramInt2, paramDouble);
  }

  private void Table3DDataModel(int paramInt, double paramDouble) {
    for (eS eS : this.a) eS.a(paramInt, paramDouble);
  }

  private void Table3DDataModel(int paramInt, double paramDouble) {
    for (eS eS : this.a) eS.b(paramInt, paramDouble);
  }

  public void Table3DDataModel(double[][] paramArrayOfdouble) {
    if ((paramArrayOfdouble.length != this.d.length
            && paramArrayOfdouble.length != this.d.length / 2)
        || (paramArrayOfdouble[0]).length != this.c.length)
      throw new IndexOutOfBoundsException("Z Dimensions do not match X and Y dimensions");
    this.b = paramArrayOfdouble;
    Table3DDataModel();
  }

  public double[] Table3DDataModel() {
    return this.c;
  }

  public double[] Table3DDataModel() {
    return this.d;
  }

  public String Table3DDataModel() {
    return this.f;
  }

  public void Table3DDataModel(String paramString) {
    this.f = paramString;
  }

  public String Table3DDataModel() {
    return this.g;
  }

  public void Table3DDataModel(String paramString) {
    this.g = paramString;
  }

  public String Table3DDataModel() {
    return this.h;
  }

  public void Table3DDataModel(String paramString) {
    this.h = paramString;
  }

  public double Table3DDataModel() {
    return this.c[0];
  }

  public double Table3DDataModel() {
    return this.c[this.c.length - 1];
  }

  public double Table3DDataModel() {
    return this.d[0];
  }

  public double Table3DDataModel() {
    return this.d[this.d.length - 1];
  }

  public double Table3DDataModel() {
    return this.i;
  }

  public double Table3DDataModel() {
    return this.j;
  }

  public int Table3DDataModel() {
    return this.c.length;
  }

  public int Table3DDataModel() {
    return this.b.length;
  }

  public double Table3DDataModel() {
    return this.l;
  }

  public void Table3DDataModel(double paramDouble) {
    this.l = paramDouble;
  }

  public double Table3DDataModel() {
    return this.m;
  }

  public void Table3DDataModel(double paramDouble) {
    this.m = paramDouble;
  }

  public double Table3DDataModel() {
    return this.k;
  }

  public void Table3DDataModel(double paramDouble) {
    this.k = paramDouble;
  }

  private double Table3DDataModel(double paramDouble, double[] paramArrayOfdouble) {
    if (paramArrayOfdouble == null || paramDouble <= paramArrayOfdouble[0]) return 0.0D;
    if (paramDouble >= paramArrayOfdouble[paramArrayOfdouble.length - 1])
      return (paramArrayOfdouble.length - 1);
    for (byte b = 0; b < paramArrayOfdouble.length - 1; b++) {
      if (paramDouble == paramArrayOfdouble[b]) return b;
      if (paramDouble > paramArrayOfdouble[b] && paramDouble < paramArrayOfdouble[b + 1]) {
        double d =
            (paramDouble - paramArrayOfdouble[b])
                / (paramArrayOfdouble[b + 1] - paramArrayOfdouble[b]);
        return b + d;
      }
    }
    return 0.0D;
  }

  public double Table3DDataModel(double paramDouble1, double paramDouble2) {
    double d1 = Table3DDataModel(paramDouble1, this.d);
    double d2 = Table3DDataModel(paramDouble2, this.c);
    if (this.d.length / 2 == this.b.length) d1 /= 2.0D;
    int i = (int) d1;
    int j = (int) d2;
    int k = (i < this.b.length - 1) ? (i + 1) : i;
    int m = (j < (this.b[0]).length - 1) ? (j + 1) : j;
    double d3 = d1 - i;
    double d4 = d2 - j;
    return this.b[i][j] * (1.0D - d4) * (1.0D - d3)
        + this.b[i][m] * d4 * (1.0D - d3)
        + this.b[k][j] * (1.0D - d4) * d3
        + this.b[k][m] * d4 * d3;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
