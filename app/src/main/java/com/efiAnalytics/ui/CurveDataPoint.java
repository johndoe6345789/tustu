package com.efiAnalytics.ui;

class CurveDataPoint implements ef {
  double a = 0.0D;

  double b = 0.0D;

  int c = -1;

  int d = -1;

  private double f = Double.NaN;

  CurveDataPoint(bN parambN) {}

  CurveDataPoint(bN parambN, int paramInt1, int paramInt2) {
    this.c = paramInt2;
    this.d = paramInt1;
  }

  CurveDataPoint(
      bN parambN, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2) {
    CurveDataPoint(paramDouble1);
    CurveDataPoint(paramDouble2);
    this.c = paramInt2;
    this.d = paramInt1;
  }

  public double CurveDataPoint() {
    return this.a;
  }

  protected int CurveDataPoint() {
    int i = this.e.getWidth() - (this.e.F()).left - (this.e.F()).right;
    if (bN.a(this.e)) {
      int j = this.d;
      if (j < 0) j = 0;
      bQ bQ = bN.a(this.e, j);
      byte b;
      for (b = (this.c < 0) ? 0 : this.c; ((bP) bQ.get(b)).c() < this.a && b < bQ.size() - 2; b++)
        ;
      if (b < bQ.size() - 1) {
        bP bP1 = (bP) bQ.get(b);
        bP bP2 = (bP) bQ.get(b + 1);
        return (this.e.F()).left
            + (int) (b / (bQ.size() - 1) * i)
            + (int) ((this.a - bP1.c()) / (bP2.c() - bP1.c()) * (i / (bQ.size() - 1)));
      }
      return (this.e.F()).left + (int) (b / (bQ.size() - 1) * i);
    }
    return (this.e.h() == this.e.i())
        ? (this.e.F()).left
        : ((this.e.F()).left + (int) ((this.a - this.e.i()) / (this.e.h() - this.e.i()) * i));
  }

  protected void CurveDataPoint(int paramInt) {
    double d1 = (this.e.getWidth() - (this.e.F()).left - (this.e.F()).right);
    double d2 = (paramInt - (this.e.F()).left) / d1;
    double d3 = this.e.i() + d2 * (this.e.h() - this.e.i());
    d3 = Math.rint(d3 / bN.b(this.e)) * bN.b(this.e);
    CurveDataPoint(d3);
  }

  public void CurveDataPoint(double paramDouble) {
    this.a = Math.rint(paramDouble * 1.0E7D) / 1.0E7D;
  }

  public double CurveDataPoint() {
    return this.b;
  }

  protected int CurveDataPoint() {
    int i = this.e.getHeight() - (this.e.F()).top - (this.e.F()).bottom;
    return this.e.getHeight()
        - (this.e.F()).bottom
        - (int) Math.round((this.b - this.e.k()) / (this.e.j() - this.e.k()) * i);
  }

  protected void CurveDataPoint(int paramInt) {
    double d1 = (this.e.getHeight() - (this.e.F()).top - (this.e.F()).bottom);
    double d2 = (this.e.getHeight() - (this.e.F()).bottom - paramInt) / d1;
    double d3 = this.e.k() + d2 * (this.e.j() - this.e.k());
    d3 = Math.rint(d3 / bN.c(this.e).a(this.c)) * bN.c(this.e).a(this.c);
    CurveDataPoint(d3);
  }

  public void CurveDataPoint(double paramDouble) {
    this.b = Math.rint(paramDouble * 1.0E7D) / 1.0E7D;
  }

  public int CurveDataPoint() {
    return this.c;
  }

  public int CurveDataPoint() {
    return this.d;
  }

  public boolean CurveDataPoint(Object paramObject) {
    if (paramObject instanceof bP) {
      bP bP1 = (bP) paramObject;
      return (bP1.d == this.d && bP1.c == this.c);
    }
    return super.equals(paramObject);
  }

  public void CurveDataPoint(int paramInt) {
    this.d = paramInt;
  }

  public double CurveDataPoint() {
    return this.f;
  }

  public void CurveDataPoint(double paramDouble) {
    this.f = paramDouble;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
