package com.efiAnalytics.ui;

import bH.X;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.Iterator;

public class LineChartComponent extends AbstractChartComponent {
  aV a = new aV(this);

  private double l = 0.0D;

  private double m = 0.0D;

  private int n = 4;

  private int o = -1;

  Stroke b = new BasicStroke(2.0F, 1, 1);

  ArrayList i = new ArrayList();

  private Color p = Color.darkGray;

  private Color q = Color.YELLOW;

  private boolean r = true;

  private Color s = null;

  aX[] j = null;

  double k = 0.0D;

  public LineChartComponent() {
    addMouseListener(new aW(this));
  }

  public void a(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    graphics2D.setStroke(this.b);
    for (byte b = 0; b < this.a.a(); b++) {
      paramGraphics.setColor(c(b));
      ArrayList arrayList = this.a.a(b);
      int[] arrayOfInt1 = a(arrayList);
      int[] arrayOfInt2 = b(arrayList);
      paramGraphics.drawPolyline(arrayOfInt1, arrayOfInt2, arrayOfInt1.length);
    }
    e(paramGraphics);
  }

  private void e(Graphics paramGraphics) {
    if (this.s == null) return;
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    if (this.j != null) {
      Rectangle rectangle = k();
      graphics2D.setColor(this.q);
      for (aX aX1 : this.j) {
        if (aX1.b() > 0.0D) {
          int i = f(aX1.a());
          paramGraphics.drawLine(i, rectangle.y, i, rectangle.y + rectangle.height);
          paramGraphics.drawString(
              "Gap: " + X.b(aX1.a(), 3) + " to " + X.b(aX1.c(), 3),
              i + paramGraphics.getFont().getSize(),
              rectangle.y + paramGraphics.getFont().getSize() * 3);
        }
      }
    }
    graphics2D.setStroke(this.b);
    paramGraphics.setColor(this.s);
    for (byte b = 0; b < this.a.a(); b++) {
      ArrayList<aZ> arrayList = this.a.a(b);
      int[] arrayOfInt1 = a(arrayList);
      int[] arrayOfInt2 = b(arrayList);
      for (byte b1 = 0; b1 < arrayOfInt1.length; b1++) {
        if (!((aZ) arrayList.get(b1)).a())
          paramGraphics.drawLine(
              arrayOfInt1[b1], arrayOfInt2[b1] - 1, arrayOfInt1[b1], arrayOfInt2[b1] + 1);
      }
    }
  }

  private int[] a(ArrayList paramArrayList) {
    int[] arrayOfInt = new int[paramArrayList.size()];
    for (byte b = 0; b < arrayOfInt.length; b++)
      arrayOfInt[b] = f(((aZ) paramArrayList.get(b)).getX());
    return arrayOfInt;
  }

  private int[] b(ArrayList paramArrayList) {
    int[] arrayOfInt = new int[paramArrayList.size()];
    for (byte b = 0; b < arrayOfInt.length; b++)
      arrayOfInt[b] = g(((aZ) paramArrayList.get(b)).getY());
    return arrayOfInt;
  }

  public void b(Graphics paramGraphics) {
    paramGraphics.setColor(x());
    Rectangle rectangle = k();
    paramGraphics.drawRect(rectangle.x, rectangle.y, rectangle.width - 1, rectangle.height - 1);
    int i = u();
    paramGraphics.setFont(l());
    int j;
    for (j = 1; j < i; j++) {
      int k = rectangle.y + j * rectangle.height / i;
      paramGraphics.drawLine(rectangle.x, k, rectangle.width, k);
      double d = (i() - h()) / i * (i - j) + h();
      String str = X.a(d);
      paramGraphics.drawString(str + " " + m(), rectangle.x + 2, k - 1);
    }
    if (w()) {
      j = v();
      if (j <= 0) j = rectangle.width * i / rectangle.height;
      for (byte b = 1; b < j; b++) {
        int k = b * rectangle.width / j;
        paramGraphics.drawLine(k, rectangle.y, k, rectangle.y + rectangle.height);
      }
    }
  }

  public void a(int paramInt, aZ paramaZ) {
    this.a.a(paramInt, paramaZ);
    d();
  }

  public void a(int paramInt1, int paramInt2, aZ paramaZ) {
    this.a.a(paramInt1, paramInt2, paramaZ);
    d();
  }

  private int f(double paramDouble) {
    Rectangle rectangle = k();
    double d = a(paramDouble);
    return (int)
        Math.round(
            (paramDouble - d - this.l) / (this.m - this.l - this.k) * rectangle.width
                + rectangle.x);
  }

  public double a(double paramDouble) {
    if (this.j == null) {
      double d1 = 0.0D;
      byte b1 = 0;
      double d2 = Double.NaN;
      for (byte b2 = 0; b2 < this.a.a(0).size(); b2++) {
        aZ aZ = this.a.a(0).get(b2);
        if (aZ.x > 0.0D && Double.isNaN(d2)) {
          d2 = aZ.x;
        } else if (aZ.x - d2 > 0.0D) {
          d1 += aZ.x - d2;
          d2 = aZ.x;
          b1++;
        }
      }
      if (b1 > 0) {
        d1 /= b1;
      } else {
        this.j = new aX[0];
        return 0.0D;
      }
      ArrayList<aX> arrayList = new ArrayList();
      d2 = Double.NaN;
      double d3 = d1 * 10.0D;
      for (aZ aZ : this.a.a(0)) {
        if (Double.isNaN(d2) || d2 == aZ.x) {
          d2 = aZ.x;
          continue;
        }
        if (aZ.x - d2 > d3) {
          aX aX1 = new aX(this, d2, aZ.x);
          arrayList.add(aX1);
          d2 = aZ.x;
          continue;
        }
        d2 = aZ.x;
      }
      this.j = arrayList.<aX>toArray(new aX[arrayList.size()]);
      if (this.k == 0.0D) for (aX aX1 : this.j) this.k += aX1.b();
    }
    double d = 0.0D;
    aX[] arrayOfAX = this.j;
    int i = arrayOfAX.length;
    byte b = 0;
    while (b < i) {
      aX aX1 = arrayOfAX[b];
      if (aX1.a() < paramDouble) {
        d += aX1.b();
        b++;
      }
    }
    return d;
  }

  private int g(double paramDouble) {
    Rectangle rectangle = k();
    return rectangle.height
        + rectangle.y
        - (int) Math.round((paramDouble - h()) / (i() - h()) * rectangle.height);
  }

  public void a() {
    this.a.b();
    this.j = null;
    this.k = 0.0D;
    d();
  }

  public double b() {
    return this.l;
  }

  public void b(double paramDouble) {
    this.l = paramDouble;
    d();
  }

  public double t() {
    return this.m;
  }

  public void e(double paramDouble) {
    this.m = paramDouble;
    d();
  }

  public int u() {
    return this.n;
  }

  public void f(int paramInt) {
    this.n = paramInt;
    d();
  }

  public int v() {
    return this.o;
  }

  public String a(int paramInt) {
    double d = g(paramInt);
    return X.a(d) + " " + r();
  }

  public double g(int paramInt) {
    Rectangle rectangle = k();
    if (paramInt < rectangle.x) return this.l;
    if (paramInt > rectangle.x + rectangle.width) return this.m;
    double d1 = (paramInt - rectangle.x) / rectangle.width;
    double d2 = a(this.m);
    double d3 = this.l + (this.m - this.l - d2) * d1;
    aX[] arrayOfAX = this.j;
    int i = arrayOfAX.length;
    byte b = 0;
    while (b < i) {
      aX aX1 = arrayOfAX[b];
      if (d3 > aX1.a()) {
        d3 += aX1.b();
        b++;
      }
    }
    return d3;
  }

  public String b(int paramInt) {
    double d = h(paramInt);
    return X.a(d) + " " + s();
  }

  public double h(int paramInt) {
    Rectangle rectangle = k();
    if (paramInt < rectangle.y) return h();
    if (paramInt > rectangle.y + rectangle.height) return i();
    double d = 1.0D - (paramInt - rectangle.y) / rectangle.height;
    return h() + (i() - h()) * d;
  }

  private void a(double paramDouble1, double paramDouble2) {
    Iterator<aY> iterator = this.i.iterator();
    while (iterator.hasNext()) ((aY) iterator.next()).a(paramDouble1, paramDouble2);
  }

  public void a(aY paramaY) {
    this.i.add(paramaY);
  }

  public boolean w() {
    return this.r;
  }

  public Color x() {
    return this.p;
  }

  public void c() {
    this.a.b();
    this.j = null;
    this.k = 0.0D;
    d();
  }

  public void a(Color paramColor) {
    this.s = paramColor;
    d();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
