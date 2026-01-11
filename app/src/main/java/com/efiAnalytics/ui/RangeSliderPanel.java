package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;

public class RangeSliderPanel extends JPanel {
  ArrayList a = new ArrayList();
  
  public static int b = 1;
  
  public static int c = 2;
  
  int d = b;
  
  double e = 0.0D;
  
  double f = 100.0D;
  
  double g = 0.0D;
  
  double h = 100.0D;
  
  int i = eJ.a(5);
  
  int j = eJ.a(13);
  
  Insets k = eJ.a(new Insets(5, 5, 5, 5));
  
  Color l = Color.BLUE;
  
  Rectangle m = null;
  
  Rectangle n = null;
  
  public RangeSliderPanel() {
    ch ch = new ch(this);
    addMouseMotionListener(ch);
    addMouseListener(ch);
  }
  
  public void paint(Graphics paramGraphics) {
    a(paramGraphics);
  }
  
  private void a(Graphics paramGraphics) {
    paramGraphics.clearRect(0, 0, getWidth(), getHeight());
    Rectangle rectangle = d();
    paramGraphics.setColor(Color.lightGray);
    paramGraphics.draw3DRect(rectangle.x - 1, rectangle.y - 1, rectangle.width + 2, rectangle.height + 2, false);
    Point point1 = b();
    Point point2 = c();
    paramGraphics.setColor(this.l);
    if (this.d != c) {
      paramGraphics.setColor(Color.gray);
      paramGraphics.draw3DRect(rectangle.x + 1, rectangle.y + rectangle.height / 2, rectangle.width - 2, 1, false);
    } 
    if (this.d == c) {
      this.n = new Rectangle(point1.x - this.j / 2, this.j / 2, point1.x + this.i / 2, point1.y + this.j / 2);
      this.m = new Rectangle(point2.x - this.j / 2, this.j / 2, point2.x + this.i / 2, point2.y + this.j / 2);
    } else {
      this.n = new Rectangle(point1.x - this.i / 2, point1.y - 1 - this.j / 2, this.i, point1.y + this.j / 2);
      this.m = new Rectangle(point2.x - this.i / 2, point2.y - 1 - this.j / 2, this.i, point2.y + this.j / 2);
    } 
    paramGraphics.setColor(Color.lightGray);
    paramGraphics.fill3DRect(this.n.x, this.n.y, this.n.width, this.n.height, true);
    paramGraphics.fill3DRect(this.m.x, this.m.y, this.m.width, this.m.height, true);
  }
  
  private Point b() {
    return e(this.g);
  }
  
  private Point c() {
    return e(this.h);
  }
  
  private Point e(double paramDouble) {
    double d = (paramDouble - this.e) / (this.f - this.e);
    return f(d);
  }
  
  private Point f(double paramDouble) {
    Rectangle rectangle = d();
    return (this.d == c) ? new Point(rectangle.x + rectangle.width / 2, rectangle.y + rectangle.height - (int)(rectangle.height * paramDouble)) : new Point(rectangle.x + (int)(rectangle.width * paramDouble), rectangle.y + rectangle.height / 2);
  }
  
  private Rectangle d() {
    Rectangle rectangle = null;
    if (this.d == c) {
      int i = this.j;
      int j = getHeight() - this.k.top - this.k.bottom;
      int k = this.k.left + (getWidth() - i - this.k.right - this.k.left) / 2;
      int m = this.k.top;
      rectangle = new Rectangle(k, m, i, j);
    } else {
      int i = getWidth() - this.k.right - this.k.left;
      int j = this.j;
      int k = this.k.left;
      int m = this.k.top + (getHeight() - j - this.k.top - this.k.bottom) / 2;
      rectangle = new Rectangle(k, m, i, j);
    } 
    return rectangle;
  }
  
  private double a(int paramInt1, int paramInt2) {
    double d;
    Rectangle rectangle = d();
    if (this.d == c) {
      d = (paramInt2 - rectangle.y) / rectangle.height;
      d = 1.0D - d;
    } else {
      d = (paramInt1 - rectangle.x) / rectangle.width;
    } 
    return (d >= 1.0D) ? this.f : ((d <= 0.0D) ? this.e : (this.e + d * (this.f - this.e)));
  }
  
  public void a(ev paramev) {
    this.a.add(paramev);
  }
  
  public void a(double paramDouble) {
    this.e = paramDouble;
  }
  
  public void b(double paramDouble) {
    this.f = paramDouble;
  }
  
  public double a() {
    return (this.d == c) ? ((this.f - this.e) / (getHeight() - this.k.top - this.k.bottom)) : ((this.f - this.e) / (getWidth() - this.k.left - this.k.right));
  }
  
  public void c(double paramDouble) {
    if (paramDouble < this.e)
      paramDouble = this.e; 
    if (paramDouble >= this.h)
      d(paramDouble + a()); 
    this.g = paramDouble;
    repaint();
    e();
  }
  
  public void d(double paramDouble) {
    if (paramDouble > this.f)
      paramDouble = this.f; 
    if (paramDouble < this.g)
      c(paramDouble - a()); 
    this.h = paramDouble;
    repaint();
    f();
  }
  
  private void e() {
    double d = this.g;
    Iterator<ev> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((ev)iterator.next()).a(d); 
  }
  
  private void f() {
    double d = this.h;
    Iterator<ev> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((ev)iterator.next()).b(d); 
  }
  
  public Dimension getPreferredSize() {
    return (this.d == c) ? new Dimension(this.k.left + this.j + this.k.right, this.k.top + this.i + this.k.bottom + eJ.a(100)) : new Dimension(this.k.left + this.i + this.k.right + eJ.a(100), this.k.top + this.j + this.k.bottom);
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */