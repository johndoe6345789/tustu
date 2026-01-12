package com.efiAnalytics.ui;

import bH.X;
import bH.ab;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LineGraphPanel extends aS {
  private final ArrayList k = new ArrayList();

  private ab l = null;

  private double m = 0.0D;

  private double n = 0.0D;

  private double o = Double.NaN;

  private double p = Double.NaN;

  private final List q = new ArrayList();

  private final List r = new ArrayList();

  private String s = "";

  private final List t = new ArrayList();

  private final List u = new ArrayList();

  private String v = "";

  private int w = -1;

  private int x = -1;

  int a = eJ.a(4);

  da b = new da(this);

  Stroke i = new BasicStroke(2.0F);

  private boolean y = true;

  db j = new db(this);

  private double z = Double.NaN;

  private String A = "";

  private boolean B = true;

  public LineGraphPanel() {
    d(25);
    a(false);
  }

  public ArrayList f(int paramInt) {
    while (this.k.size() <= paramInt) this.k.add(new ArrayList());
    return this.k.get(paramInt);
  }

  public void a(Graphics paramGraphics) {
    Rectangle rectangle = k();
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    graphics2D.setRenderingHint(
        RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    paramGraphics.clipRect(rectangle.x, rectangle.y - 1, rectangle.width, rectangle.height + 2);
    graphics2D.setStroke(this.i);
    for (byte b = 0; b < this.k.size(); b++) {
      ArrayList<Point2D> arrayList = this.k.get(b);
      int[] arrayOfInt1 = new int[arrayList.size()];
      int[] arrayOfInt2 = new int[arrayList.size()];
      byte b1;
      for (b1 = 0; b1 < arrayList.size(); b1++) {
        double d1 = ((Point2D) arrayList.get(b1)).getX();
        double d2 = ((Point2D) arrayList.get(b1)).getY();
        double d3 = 1.0D - (d2 - g(b)) / (h(b) - g(b));
        double d4 = (d1 - t()) / (b() - t());
        arrayOfInt1[b1] = rectangle.x + (int) Math.round(rectangle.width * d4);
        arrayOfInt2[b1] = rectangle.y + (int) Math.round(rectangle.height * d3);
      }
      if (b == 0) a(paramGraphics, rectangle, arrayOfInt1, arrayOfInt2);
      paramGraphics.setColor(c(b));
      if (this.y) {
        paramGraphics.drawPolyline(arrayOfInt1, arrayOfInt2, arrayOfInt1.length);
      } else {
        for (b1 = 0; b1 < arrayOfInt1.length; b1++)
          graphics2D.fillOval(arrayOfInt1[b1] - 2, arrayOfInt2[b1] - 2, 4, 4);
      }
    }
    a(paramGraphics, rectangle);
  }

  private void a(
      Graphics paramGraphics,
      Rectangle paramRectangle,
      int[] paramArrayOfint1,
      int[] paramArrayOfint2) {
    double d = 0.0D;
    if (w() > 0 && x() > w()) {
      int i = -1;
      int j = -1;
      double d1 = Double.NaN;
      double d2 = Double.NaN;
      double d3 = 0.0D;
      double d4 = Double.NaN;
      double d5 = Double.NaN;
      for (int k = paramArrayOfint1.length - 1; k > 1; k--) {
        if (paramArrayOfint1[k] > w() && j < 0 && paramArrayOfint1[k] <= x()) j = k;
        if (paramArrayOfint1[k] < w()) {
          i = k + 1;
          break;
        }
        if (j > 0) {
          double d6 = ((Point2D) ((ArrayList<Point2D>) this.k.get(0)).get(k)).getY();
          if (Double.isNaN(d1) || d1 > d6) d1 = d6;
          if (Double.isNaN(d2) || d2 < d6) d2 = d6;
          d3 += d6;
          if (!Double.isNaN(d4)) {
            double d7 =
                (d5 + ((Point2D) ((ArrayList<Point2D>) this.k.get(0)).get(k)).getY()) / 2.0D;
            double d8 = d4 - ((Point2D) ((ArrayList<Point2D>) this.k.get(0)).get(k)).getX();
            d += d7 * d8;
          }
          d4 = ((Point2D) ((ArrayList<Point2D>) this.k.get(0)).get(k)).getX();
          d5 = ((Point2D) ((ArrayList<Point2D>) this.k.get(0)).get(k)).getY();
        }
      }
      if (j > i && i >= 0) {
        int[] arrayOfInt1 = new int[j - i + 3];
        int[] arrayOfInt2 = new int[arrayOfInt1.length];
        arrayOfInt1[0] = paramArrayOfint1[i];
        arrayOfInt2[0] = paramRectangle.y + paramRectangle.height;
        System.arraycopy(paramArrayOfint1, i, arrayOfInt1, 1, arrayOfInt1.length - 2);
        System.arraycopy(paramArrayOfint2, i, arrayOfInt2, 1, arrayOfInt2.length - 2);
        arrayOfInt1[arrayOfInt1.length - 1] = arrayOfInt1[arrayOfInt1.length - 2];
        arrayOfInt2[arrayOfInt2.length - 1] = paramRectangle.y + paramRectangle.height;
        Color color1 = c(0);
        Color color2 = new Color(color1.getRed(), color1.getGreen(), color1.getBlue(), 92);
        paramGraphics.setColor(color2);
        paramGraphics.fillPolygon(arrayOfInt1, arrayOfInt2, arrayOfInt1.length);
        paramGraphics.setColor(color1);
      }
      db.a(this.j, j - i + 1);
      if (this.j.b() > 0) {
        this.j.c(d2);
        this.j.b(d1);
        this.j.d(d3 / this.j.b());
        this.j.a(d);
        this.b.a(paramGraphics, this.j);
      }
    }
  }

  private void a(Graphics paramGraphics, Rectangle paramRectangle) {
    if (w() > 0) {
      int k;
      paramGraphics.setColor(Color.lightGray);
      int i = w() - this.a / 2;
      paramGraphics.fill3DRect(i, paramRectangle.y, this.a, paramRectangle.height, true);
      paramGraphics.setColor(q());
      paramGraphics.setFont(getFont());
      String str = a(w());
      int j = paramGraphics.getFontMetrics(paramGraphics.getFont()).stringWidth(str);
      if (w() < this.d.x + j + this.a) {
        k = w() + this.a;
      } else {
        k = w() - this.a - j;
      }
      paramGraphics.drawString(str, k, this.d.y + this.d.height / 2);
    }
    if (x() > 0) {
      int k;
      paramGraphics.setColor(Color.lightGray);
      int i = x() - this.a / 2;
      paramGraphics.fill3DRect(i, paramRectangle.y, this.a, paramRectangle.height, true);
      paramGraphics.setColor(q());
      paramGraphics.setFont(getFont());
      String str = a(x());
      int j = paramGraphics.getFontMetrics(paramGraphics.getFont()).stringWidth(str);
      if (getWidth() > i + j + this.a) {
        k = x() + this.a;
      } else {
        k = x() - this.a - j;
      }
      paramGraphics.drawString(str, k, this.d.y + this.d.height / 2);
    }
    if (!Double.isNaN(this.z)) {
      double d = (this.z - t()) / (b() - t());
      int i = paramRectangle.x + (int) Math.round(paramRectangle.width * d);
      paramGraphics.setColor(Color.GREEN);
      paramGraphics.drawLine(i, this.d.y, i, this.d.y + this.d.height);
      if (this.A != null && !this.A.isEmpty()) {
        paramGraphics.setFont(l());
        paramGraphics.drawString(this.A, i + 5, this.d.y + paramGraphics.getFont().getSize());
      }
    }
  }

  private String A() {
    String str = (this.s == null && this.s.isEmpty()) ? "" : (this.s + " vs ");
    for (byte b = 0; b < this.t.size(); b++) {
      String str1 = this.t.get(b);
      if (!str.isEmpty() && !str1.isEmpty()) str = str + ", ";
      str = str + str1;
    }
    return str;
  }

  private boolean B() {
    for (String str : this.t) {
      if (!str.equals("")) return false;
    }
    return true;
  }

  protected void c(Graphics paramGraphics) {
    if (!this.B || this.k.isEmpty() || B()) {
      super.c(paramGraphics);
    } else {
      paramGraphics.setColor(getBackground());
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
      String str = A();
      if (str.isEmpty()) str = f();
      Rectangle rectangle = k();
      Font font;
      for (font = g();
          getFontMetrics(font).stringWidth(str) > rectangle.width && font.getSize() > 1;
          font = new Font(font.getFamily(), font.getStyle(), font.getSize() - 1))
        ;
      int i = getFontMetrics(font).stringWidth(str);
      int j = (k()).x + ((k()).width - i) / 2;
      paramGraphics.setFont(font);
      Graphics2D graphics2D = (Graphics2D) paramGraphics;
      graphics2D.setRenderingHint(
          RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(
          RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      int k = j;
      boolean bool = false;
      if (C()) {
        String str1 = this.s + " vs ";
        paramGraphics.setColor(getForeground());
        paramGraphics.drawString(str1, k, font.getSize());
        k += getFontMetrics(font).stringWidth(str1);
        for (byte b = 0; b < this.k.size(); b++) {
          String str2 = this.t.get(b);
          if (!str2.isEmpty() && bool) {
            paramGraphics.setColor(getForeground());
            paramGraphics.drawString(", ", k, font.getSize());
            k += getFontMetrics(font).stringWidth(", ");
          }
          if (!str2.isEmpty()) {
            paramGraphics.setColor(c(b));
            paramGraphics.drawString(str2, k, font.getSize());
            k += getFontMetrics(font).stringWidth(str2);
            bool = true;
          }
        }
      }
    }
  }

  private boolean C() {
    for (String str : this.t) {
      if (str != null && !str.isEmpty()) return true;
    }
    return false;
  }

  public void b(Graphics paramGraphics) {
    paramGraphics.setColor(getForeground());
    int i = l().getSize();
    byte b1 = 4;
    boolean bool = D();
    String[][] arrayOfString = new String[this.k.size()][b1];
    int j = 0;
    for (byte b2 = 0; b2 < this.k.size(); b2++) {
      for (byte b = 1; b < b1; b++) {
        double d;
        if (bool) {
          d = (i() - h()) / b1 * (b1 - b) + h();
        } else {
          d = (h(b2) - g(b2)) / b1 * (b1 - b) + g(b2);
        }
        if (Double.isNaN(d)) {
          arrayOfString[b2][b] = "";
        } else {
          arrayOfString[b2][b] = X.a(d);
          int m = getFontMetrics(l()).stringWidth(arrayOfString[b2][b] + "0");
          if (m > j) j = m;
        }
      }
    }
    d(j + 4);
    e(l().getSize() + 4);
    Rectangle rectangle = k();
    paramGraphics.drawRect(rectangle.x, rectangle.y - 1, rectangle.width, rectangle.height + 2);
    paramGraphics.setFont(l());
    for (byte b3 = 0; b3 < this.k.size(); b3++) {
      if (bool) {
        if (b3 == 0) {
          String str1 = X.a(i());
          int m = getFontMetrics(l()).stringWidth(str1);
          paramGraphics.setColor(c(b3));
          paramGraphics.drawString(str1, rectangle.x - m - 2, rectangle.y + i * b3);
        }
      } else if (!Double.isNaN(h(b3))) {
        String str1 = X.a(h(b3));
        int m = getFontMetrics(l()).stringWidth(str1);
        paramGraphics.setColor(c(b3));
        paramGraphics.drawString(str1, rectangle.x - m - 2, rectangle.y + i * b3);
      }
      if (bool) {
        if (b3 == 0) {
          String str1 = X.a(h());
          int m = getFontMetrics(l()).stringWidth(str1);
          paramGraphics.setColor(c(b3));
          paramGraphics.drawString(
              str1, rectangle.x - m - 2, rectangle.y + rectangle.height - i * b3);
        }
      } else if (!Double.isNaN(g(b3))) {
        String str1 = X.a(g(b3));
        int m = getFontMetrics(l()).stringWidth(str1);
        paramGraphics.setColor(c(b3));
        paramGraphics.drawString(
            str1, rectangle.x - m - 2, rectangle.y + rectangle.height - i * b3);
      }
      if (!bool || b3 == 0)
        for (byte b = 1; b < b1; b++) {
          int n = rectangle.y + b * rectangle.height / b1 + b3 * i;
          if (b == 0) {
            paramGraphics.setColor(getForeground());
            paramGraphics.drawLine(rectangle.x, n, rectangle.x + rectangle.width, n);
          }
          String str1 = arrayOfString[b3][b];
          int m = getFontMetrics(l()).stringWidth(str1);
          paramGraphics.setColor(c(b3));
          paramGraphics.drawString(str1, rectangle.x - m - 2, n - 1);
        }
    }
    paramGraphics.drawString(X.a(t()), rectangle.x, rectangle.y + rectangle.height + i + 1);
    String str = X.a(this.m);
    int k = getFontMetrics(l()).stringWidth(str);
    paramGraphics.drawString(
        str, rectangle.x + rectangle.width - k, rectangle.y + rectangle.height + i + 1);
  }

  private boolean D() {
    boolean bool;
    if (Double.isNaN(this.o) || Double.isNaN(this.p)) {
      double d1 = h(0);
      double d2 = g(0);
      for (byte b = 1; b < this.k.size(); b++) {
        double d3 = Double.isNaN(h(b)) ? d1 : h(b);
        double d4 = Double.isNaN(g(b)) ? d2 : g(b);
        if ((!Double.isNaN(d2) && d4 != d2) || (!Double.isNaN(d1) && d3 != d1)) return false;
        if (!Double.isNaN(d3)) d1 = d3;
        if (!Double.isNaN(d4)) d2 = d4;
      }
      bool = true;
    } else {
      bool = true;
    }
    return bool;
  }

  public void d(double paramDouble) {
    a(0, paramDouble);
  }

  public void a(int paramInt, double paramDouble) {
    while (this.q.size() <= paramInt) this.q.add(Double.valueOf(Double.NaN));
    this.q.set(paramInt, Double.valueOf(paramDouble));
    if (paramInt == 0) super.d(paramDouble);
  }

  public void c(double paramDouble) {
    b(0, paramDouble);
  }

  public void b(int paramInt, double paramDouble) {
    while (this.r.size() <= paramInt) this.r.add(Double.valueOf(Double.NaN));
    this.r.set(paramInt, Double.valueOf(paramDouble));
    if (paramInt == 0) super.c(paramDouble);
  }

  public double g(int paramInt) {
    if (!Double.isNaN(this.p)) return this.p;
    while (paramInt >= this.r.size()) this.r.add(Double.valueOf(0.0D));
    return ((Double) this.r.get(paramInt)).doubleValue();
  }

  public double h() {
    if (!Double.isNaN(this.p)) return this.p;
    double d = Double.MAX_VALUE;
    Iterator<Double> iterator = this.r.iterator();
    while (iterator.hasNext()) {
      double d1 = ((Double) iterator.next()).doubleValue();
      if (d1 < d) d = d1;
    }
    return d;
  }

  public double h(int paramInt) {
    if (!Double.isNaN(this.o)) return this.o;
    while (paramInt >= this.q.size()) this.q.add(Double.valueOf(0.0D));
    return ((Double) this.q.get(paramInt)).doubleValue();
  }

  public double i() {
    if (!Double.isNaN(this.o)) return this.o;
    double d = 0.0D;
    Iterator<Double> iterator = this.q.iterator();
    while (iterator.hasNext()) {
      double d1 = ((Double) iterator.next()).doubleValue();
      if (d1 > d) d = d1;
    }
    return d;
  }

  private void b(Point2D paramPoint2D, int paramInt) {
    if (j() && paramPoint2D.getY() > h(paramInt) - h(paramInt) * 0.06D)
      a(paramInt, paramPoint2D.getY() + paramPoint2D.getY() * 0.06D);
  }

  public void a(Point2D paramPoint2D, int paramInt) {
    f(paramInt).add(paramPoint2D);
    b(paramPoint2D, paramInt);
    d();
  }

  public void a() {
    c();
  }

  public String a(int paramInt) {
    Rectangle rectangle = k();
    paramInt -= rectangle.x;
    if (paramInt < 0) return "";
    if (paramInt > rectangle.width) return "";
    double d1 = (paramInt / rectangle.width);
    double d2 = t() + (b() - t()) * d1;
    return (this.s.length() > 0) ? (this.s + ": " + X.a(d2)) : X.a(d2);
  }

  public String b(int paramInt) {
    Rectangle rectangle = k();
    if (paramInt < rectangle.y) return X.a(h());
    if (paramInt > rectangle.y + rectangle.height) return X.a(i());
    String str = "";
    boolean bool = D();
    byte b1 = bool ? 1 : this.k.size();
    for (byte b2 = 0; b2 < b1; b2++) {
      double d;
      String str1;
      if (bool) {
        str1 = "Value";
        d = m(paramInt);
      } else {
        str1 = i(b2);
        d = a(paramInt, b2);
      }
      if (str1.length() > 0) {
        if (!str.isEmpty()) str = str + "\n";
        str = str + str1 + ": " + X.a(d);
      }
    }
    return str;
  }

  private double a(int paramInt1, int paramInt2) {
    Rectangle rectangle = k();
    double d = 1.0D - (paramInt1 - rectangle.y) / rectangle.height;
    return g(paramInt2) + (h(paramInt2) - g(paramInt2)) * d;
  }

  private double m(int paramInt) {
    Rectangle rectangle = k();
    double d = 1.0D - (paramInt - rectangle.y) / rectangle.height;
    return h() + (i() - h()) * d;
  }

  public void c() {
    this.k.clear();
    this.b.a();
    this.z = Double.NaN;
    d();
  }

  public double b() {
    return this.m;
  }

  public void a(double paramDouble) {
    this.m = paramDouble;
  }

  public double t() {
    return this.n;
  }

  public void b(double paramDouble) {
    this.n = paramDouble;
  }

  public void a(String paramString) {
    this.s = paramString;
  }

  public String i(int paramInt) {
    return (this.t.size() > paramInt) ? this.t.get(paramInt) : "";
  }

  public String j(int paramInt) {
    while (this.u.size() < paramInt + 1) this.u.add("");
    return this.u.get(paramInt);
  }

  public String a(int paramInt, String paramString) {
    while (this.u.size() < paramInt + 1) this.u.add("");
    return this.u.set(paramInt, paramString);
  }

  public void b(int paramInt, String paramString) {
    while (this.t.size() <= paramInt) this.t.add("");
    this.t.set(paramInt, paramString);
  }

  public void b(boolean paramBoolean) {
    this.y = paramBoolean;
  }

  public void u() {
    this.w = -1;
    this.x = -1;
  }

  public boolean v() {
    return (this.w >= 0);
  }

  public int w() {
    return this.w;
  }

  public void k(int paramInt) {
    if (this.x == -1 || this.x > paramInt) this.w = paramInt;
  }

  public int x() {
    return this.x;
  }

  public void l(int paramInt) {
    this.x = paramInt;
  }

  public String y() {
    return this.v;
  }

  public void f(String paramString) {
    this.v = paramString;
  }

  public void a(ab paramab) {
    this.l = paramab;
  }

  private String h(String paramString) {
    return (this.l != null) ? this.l.a(paramString) : paramString;
  }

  public void e(double paramDouble) {
    this.z = paramDouble;
  }

  public void g(String paramString) {
    this.A = paramString;
  }

  public void c(boolean paramBoolean) {
    this.B = paramBoolean;
  }

  public void z() {
    byte b;
    for (b = 0; b < this.q.size(); b++) this.q.set(b, Double.valueOf(0.0D));
    for (b = 0; b < this.r.size(); b++) this.r.set(b, Double.valueOf(0.0D));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
