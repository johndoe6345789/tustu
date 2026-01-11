package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.ui.eJ;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.HashMap;

class b implements Shape, Serializable {
  Gauge a = null;
  
  CubicCurve2D.Float b = new CubicCurve2D.Float();
  
  CubicCurve2D.Float c = new CubicCurve2D.Float();
  
  float d = 0.27F;
  
  float e = 0.2F;
  
  float f = 0.12F;
  
  a g = new a(this.k, this);
  
  final HashMap h = new HashMap<>();
  
  final int i = eJ.a(30);
  
  int j = this.i;
  
  b(AsymetricSweepRenderer paramAsymetricSweepRenderer, Gauge paramGauge) {
    this.a = paramGauge;
  }
  
  public Rectangle getBounds() {
    return new Rectangle(this.a.getWidth(), this.a.getHeight());
  }
  
  public Rectangle2D getBounds2D() {
    return new Rectangle2D.Float(0.0F, 0.0F, this.a.getWidth(), this.a.getHeight());
  }
  
  public boolean contains(double paramDouble1, double paramDouble2) {
    double d1 = (this.a.getWidth() - 2 * this.a.getBorderWidth());
    double d2 = (paramDouble1 - this.a.getBorderWidth()) / d1;
    return (paramDouble2 < c(this.c, d2) && paramDouble2 > c(this.b, d2));
  }
  
  public boolean contains(Point2D paramPoint2D) {
    return contains(paramPoint2D.getX(), paramPoint2D.getY());
  }
  
  public boolean intersects(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    return true;
  }
  
  public boolean intersects(Rectangle2D paramRectangle2D) {
    return intersects(paramRectangle2D.getX(), paramRectangle2D.getY(), paramRectangle2D.getWidth(), paramRectangle2D.getHeight());
  }
  
  public boolean contains(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    return (contains(paramDouble1, paramDouble2) && contains(paramDouble1 + paramDouble3, paramDouble2) && contains(paramDouble1 + paramDouble3, paramDouble2 + paramDouble4) && contains(paramDouble1, paramDouble2));
  }
  
  public boolean contains(Rectangle2D paramRectangle2D) {
    return contains(paramRectangle2D.getX(), paramRectangle2D.getY(), paramRectangle2D.getWidth(), paramRectangle2D.getHeight());
  }
  
  public PathIterator getPathIterator(AffineTransform paramAffineTransform) {
    this.g.a();
    this.g.a(paramAffineTransform);
    return this.g;
  }
  
  public PathIterator getPathIterator(AffineTransform paramAffineTransform, double paramDouble) {
    this.g.a();
    this.g.a(paramAffineTransform);
    return this.g;
  }
  
  private int a() {
    return this.j;
  }
  
  public void a(int paramInt1, int paramInt2) {
    float f1;
    float f2;
    int i = this.a.getBorderWidth() / 2;
    int j = paramInt1 - 2 * i;
    this.j = Math.round(paramInt2 * this.a.getFaceAngle() / 360.0F);
    int k = 360 - this.a.getStartAngle();
    this.j = (this.j < k) ? k : this.j;
    if (this.j > this.a.getHeight() - 2 * i)
      this.j = this.a.getHeight() - 2 * i; 
    int m = paramInt2 - this.j - 2 * i;
    this.e = this.a.getSweepBeginDegree() / 90.0F;
    this.f = this.a.getSweepAngle() / 90.0F;
    if (this.e > 3.0F) {
      f1 = 0.0F;
      this.e -= 3.0F;
    } else if (this.e > 2.0F) {
      f1 = Math.abs(this.e - 3.0F);
      this.e = 0.0F;
    } else if (this.e > 1.0F) {
      f1 = 1.0F;
      this.e = Math.abs(this.e - 2.0F);
    } else {
      f1 = this.e;
      this.e = 1.0F;
    } 
    if (this.f > 3.0F) {
      f2 = 0.0F;
      this.f -= 3.0F;
    } else if (this.f > 2.0F) {
      f2 = Math.abs(this.f - 3.0F);
      this.f = 0.0F;
    } else if (this.f > 1.0F) {
      f2 = 1.0F;
      this.f = Math.abs(this.f - 2.0F);
    } else {
      f2 = this.f;
      this.f = 1.0F;
    } 
    this.b.setCurve(i, (this.a.getHeight() - this.j - i), j * this.e, m * f1, j * this.f, m * f2, j, i);
    this.c.setCurve(this.b);
    this.c.y1 += this.j;
    this.c.y2 += this.j;
    this.c.ctrly1 += this.j;
    this.c.ctrly2 += this.j;
    this.h.clear();
    byte b1 = -1;
    double d1 = 0.0D;
    double d2 = 0.0D;
    for (byte b2 = 0; b2 <= 'ᎈ' && b1 < 100; b2++) {
      double d3 = (b2 / 1000.0F);
      double d4 = a(this.b, d3);
      double d5 = 100.0D * d4 / (this.b.getX2() - this.b.getX1());
      if (d5 >= (b1 + 1))
        if (d5 - ++b1 > b1 - d1) {
          this.h.put(Integer.valueOf(b1), Double.valueOf(d2));
        } else {
          this.h.put(Integer.valueOf(b1), Double.valueOf(d3));
        }  
      d1 = d5;
      d2 = d3;
    } 
  }
  
  public double a(CubicCurve2D paramCubicCurve2D, double paramDouble) {
    return Math.pow(1.0D - paramDouble, 3.0D) * paramCubicCurve2D.getX1() + 3.0D * Math.pow(1.0D - paramDouble, 2.0D) * paramDouble * paramCubicCurve2D.getCtrlX1() + 3.0D * (1.0D - paramDouble) * Math.pow(paramDouble, 2.0D) * paramCubicCurve2D.getCtrlX2() + Math.pow(paramDouble, 3.0D) * paramCubicCurve2D.getX2();
  }
  
  public double b(CubicCurve2D paramCubicCurve2D, double paramDouble) {
    return Math.pow(1.0D - paramDouble, 3.0D) * paramCubicCurve2D.getY1() + 3.0D * Math.pow(1.0D - paramDouble, 2.0D) * paramDouble * paramCubicCurve2D.getCtrlY1() + 3.0D * (1.0D - paramDouble) * Math.pow(paramDouble, 2.0D) * paramCubicCurve2D.getCtrlY2() + Math.pow(paramDouble, 3.0D) * paramCubicCurve2D.getY2();
  }
  
  public double a(double paramDouble) {
    paramDouble = this.a.isCounterClockwise() ? (1.0D - paramDouble) : paramDouble;
    synchronized (this.h) {
      if (this.h.isEmpty())
        return 0.0D; 
      if (paramDouble >= 1.0D)
        return ((Double)this.h.get(Integer.valueOf(100))).doubleValue(); 
      if (paramDouble <= 0.0D)
        return ((Double)this.h.get(Integer.valueOf(0))).doubleValue(); 
      int i = (int)Math.floor(paramDouble * 100.0D);
      double d1 = paramDouble * 100.0D - i;
      double d2 = ((Double)this.h.get(Integer.valueOf(i))).doubleValue();
      double d3 = ((Double)this.h.get(Integer.valueOf(i + 1))).doubleValue();
      return d2 + d1 * (d3 - d2);
    } 
  }
  
  public double c(CubicCurve2D paramCubicCurve2D, double paramDouble) {
    double d = a(paramDouble);
    return paramCubicCurve2D.equals(this.b) ? b(paramCubicCurve2D, d) : (b(this.b, d) + a());
  }
  
  public float d(CubicCurve2D paramCubicCurve2D, double paramDouble) {
    float f = (float)(paramDouble / this.a.getWidth());
    return (float)c(paramCubicCurve2D, f);
  }
  
  public double b(double paramDouble) {
    double d = a(paramDouble);
    return a(this.b, d);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */