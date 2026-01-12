package com.efiAnalytics.ui;

import bH.X;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class BarChartPanel extends aS {
  private double i = 0.7D;

  ArrayList a = new ArrayList();

  ArrayList b = new ArrayList();

  public void a(Graphics paramGraphics) {
    synchronized (this.a) {
      if (this.a.size() == 0) return;
      Rectangle rectangle = k();
      int i = t();
      double d = (rectangle.getWidth() - i) / this.a.size();
      int j = (int) (d * this.i);
      paramGraphics.setColor(c(0));
      int k = rectangle.height - (int) Math.round(rectangle.height * (0.0D - h()) / (i() - h()));
      for (byte b = 0; b < this.a.size(); b++) {
        double d1 = ((Double) this.a.get(b)).doubleValue();
        double d2 = d1 / (i() - h());
        int m =
            (d2 >= 0.0D)
                ? ((int) (rectangle.height * d2) - 2)
                : ((int) (rectangle.height * d2) - 2);
        if (d2 >= 0.0D) {
          paramGraphics.fill3DRect(
              rectangle.x + (int) (b * d + i), rectangle.y + k - m - 2, j, m, true);
        } else {
          paramGraphics.fill3DRect(
              rectangle.x + (int) (b * d + i), rectangle.y + k - 2, j, -m, true);
        }
      }
    }
  }

  private int t() {
    return getFontMetrics(l()).stringWidth(X.a(i()) + m()) + 6;
  }

  private double u() {
    Rectangle rectangle = k();
    int i = getFontMetrics(l()).stringWidth(X.a(i()) + m()) + 6;
    return (rectangle.getWidth() - i) / this.a.size();
  }

  public void b(Graphics paramGraphics) {
    paramGraphics.setColor(getForeground());
    Rectangle rectangle = k();
    paramGraphics.drawRect(rectangle.x, rectangle.y, rectangle.width - 1, rectangle.height - 1);
    byte b = 4;
    paramGraphics.setFont(l());
    int i;
    for (i = 1; i < b; i++) {
      int j = rectangle.y + i * rectangle.height / b;
      paramGraphics.drawLine(rectangle.x, j, rectangle.width, j);
      double d = (i() - h()) / b * (b - i) + h();
      String str = X.a(d, 3);
      paramGraphics.drawString(str + " " + m(), rectangle.x + 2, j - 1);
    }
    if (h() < 0.0D) {
      i =
          this.d.y
              + this.d.height
              - 1
              - (int) Math.round(this.d.height * (0.0D - h()) / (i() - h()));
      paramGraphics.drawLine(rectangle.x, i, rectangle.width, i);
      paramGraphics.drawString("0.0 " + m(), rectangle.x + 2, i - 1);
    }
  }

  private void e(double paramDouble) {
    if (j() && paramDouble > i() - i() * 0.06D) d(paramDouble + paramDouble * 0.06D);
  }

  private void f(double paramDouble) {
    if (j() && paramDouble < h() - h() * 0.06D) c(paramDouble + paramDouble * 0.06D);
  }

  public void a(double paramDouble, int paramInt) {
    this.a.add(paramInt, Double.valueOf(paramDouble));
    e(paramDouble);
    f(paramDouble);
    d();
  }

  public void a(double paramDouble) {
    this.a.add(Double.valueOf(paramDouble));
    e(paramDouble);
    f(paramDouble);
    d();
  }

  public void a() {
    this.a.clear();
    d();
  }

  public void b() {
    this.b.clear();
  }

  public void a(String paramString) {
    this.b.add(paramString);
  }

  public String a(int paramInt) {
    Rectangle rectangle = k();
    double d = u();
    int i = t();
    if (paramInt < rectangle.x + i) return "";
    if (paramInt > rectangle.x + rectangle.width) return "";
    int j = (int) ((paramInt - i - this.d.x) / d) + 1;
    return (this.b.size() >= j && this.b.get(j - 1) != null)
        ? ((r() != null && !r().trim().isEmpty())
            ? ((String) this.b.get(j - 1) + "(" + r() + ")")
            : this.b.get(j - 1))
        : ("Bar: " + j);
  }

  public String b(int paramInt) {
    Rectangle rectangle = k();
    if (paramInt < rectangle.y) return X.a(h());
    if (paramInt > rectangle.y + rectangle.height) return X.a(i());
    double d1 = 1.0D - (paramInt - rectangle.y) / rectangle.height;
    double d2 = h() + (i() - h()) * d1;
    return X.a(d2, 3) + " " + s();
  }

  public void c() {
    this.a.clear();
    d();
  }

  public void b(double paramDouble) {
    this.i = paramDouble;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
