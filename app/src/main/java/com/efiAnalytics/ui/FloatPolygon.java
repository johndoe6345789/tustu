package com.efiAnalytics.ui;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

public class FloatPolygon implements Shape, Serializable {
  public int a;
  
  public float[] b;
  
  public float[] c;
  
  protected Rectangle2D d;
  
  private GeneralPath e;
  
  private GeneralPath f;
  
  public FloatPolygon() {
    this.b = new float[4];
    this.c = new float[4];
  }
  
  public FloatPolygon(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int paramInt) {
    if (paramInt > paramArrayOffloat1.length || paramInt > paramArrayOffloat2.length)
      throw new IndexOutOfBoundsException("npoints > xpoints.length || npoints > ypoints.length"); 
    this.a = paramInt;
    this.b = new float[paramInt];
    this.c = new float[paramInt];
    System.arraycopy(paramArrayOffloat1, 0, this.b, 0, paramInt);
    System.arraycopy(paramArrayOffloat2, 0, this.c, 0, paramInt);
    FloatPolygon();
  }
  
  public Object FloatPolygon() {
    dL dL1 = new FloatPolygon();
    for (byte b = 0; b < this.a; b++)
      dL1.a(this.b[b], this.c[b]); 
    return dL1;
  }
  
  private void FloatPolygon() {
    this.e = new GeneralPath();
    this.e.moveTo(this.b[0], this.c[0]);
    for (byte b = 1; b < this.a; b++)
      this.e.lineTo(this.b[b], this.c[b]); 
    this.d = this.e.getBounds2D();
    this.f = null;
  }
  
  private void FloatPolygon(float paramFloat1, float paramFloat2) {
    this.f = null;
    if (this.e == null) {
      this.e = new GeneralPath(0);
      this.e.moveTo(paramFloat1, paramFloat2);
      this.d = new Rectangle2D.Float(paramFloat1, paramFloat2, 0.0F, 0.0F);
    } else {
      this.e.lineTo(paramFloat1, paramFloat2);
      float f1 = (float)this.d.getMaxX();
      float f2 = (float)this.d.getMaxY();
      float f3 = (float)this.d.getMinX();
      float f4 = (float)this.d.getMinY();
      if (paramFloat1 < f3) {
        f3 = paramFloat1;
      } else if (paramFloat1 > f1) {
        f1 = paramFloat1;
      } 
      if (paramFloat2 < f4) {
        f4 = paramFloat2;
      } else if (paramFloat2 > f2) {
        f2 = paramFloat2;
      } 
      this.d = new Rectangle2D.Float(f3, f4, f1 - f3, f2 - f4);
    } 
  }
  
  public void FloatPolygon(float paramFloat1, float paramFloat2) {
    if (this.a == this.b.length) {
      float[] arrayOfFloat = new float[this.a * 2];
      System.arraycopy(this.b, 0, arrayOfFloat, 0, this.a);
      this.b = arrayOfFloat;
      arrayOfFloat = new float[this.a * 2];
      System.arraycopy(this.c, 0, arrayOfFloat, 0, this.a);
      this.c = arrayOfFloat;
    } 
    this.b[this.a] = paramFloat1;
    this.c[this.a] = paramFloat2;
    this.a++;
    FloatPolygon(paramFloat1, paramFloat2);
  }
  
  public Rectangle2D FloatPolygon() {
    return this.d;
  }
  
  public Rectangle FloatPolygon() {
    return (this.d == null) ? null : this.d.getBounds();
  }
  
  public boolean FloatPolygon(double paramDouble1, double paramDouble2) {
    if (this.a <= 2 || !this.d.contains(paramDouble1, paramDouble2))
      return false; 
    FloatPolygon();
    return this.f.contains(paramDouble1, paramDouble2);
  }
  
  private void FloatPolygon() {
    if (this.a >= 1 && this.f == null) {
      this.f = (GeneralPath)this.e.clone();
      this.f.closePath();
    } 
  }
  
  public boolean FloatPolygon(Point2D paramPoint2D) {
    return FloatPolygon(paramPoint2D.getX(), paramPoint2D.getY());
  }
  
  public boolean FloatPolygon(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    if (this.a <= 0 || !this.d.intersects(paramDouble1, paramDouble2, paramDouble3, paramDouble4))
      return false; 
    FloatPolygon();
    return this.f.intersects(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
  }
  
  public boolean FloatPolygon(Rectangle2D paramRectangle2D) {
    return FloatPolygon(paramRectangle2D.getX(), paramRectangle2D.getY(), paramRectangle2D.getWidth(), paramRectangle2D.getHeight());
  }
  
  public boolean FloatPolygon(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    if (this.a <= 0 || !this.d.intersects(paramDouble1, paramDouble2, paramDouble3, paramDouble4))
      return false; 
    FloatPolygon();
    return this.f.contains(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
  }
  
  public boolean FloatPolygon(Rectangle2D paramRectangle2D) {
    return FloatPolygon(paramRectangle2D.getX(), paramRectangle2D.getY(), paramRectangle2D.getWidth(), paramRectangle2D.getHeight());
  }
  
  public PathIterator FloatPolygon(AffineTransform paramAffineTransform) {
    FloatPolygon();
    return (this.f == null) ? null : this.f.getPathIterator(paramAffineTransform);
  }
  
  public PathIterator FloatPolygon(AffineTransform paramAffineTransform, double paramDouble) {
    return FloatPolygon(paramAffineTransform);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */