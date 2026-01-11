package com.efiAnalytics.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.BorderFactory;
import javax.swing.JComponent;

public class TargetIndicatorComponent extends JComponent {
  int a = eJ.a(3);
  
  Stroke b = new BasicStroke(this.a);
  
  private double h = Double.NaN;
  
  private double i = Double.NaN;
  
  private double j = Double.NaN;
  
  private double k = Double.NaN;
  
  private double l = Double.NaN;
  
  private double m = Double.NaN;
  
  private double n = Double.NaN;
  
  private double o = Double.NaN;
  
  private Color p = Color.LIGHT_GRAY;
  
  Color c = Color.RED;
  
  Color d = new Color(0, 0, 255, 220);
  
  Color e = Color.CYAN;
  
  private String q = null;
  
  double f = 0.1D;
  
  Font g = new Font("Dialog", 0, 12);
  
  public aR() {
    setBorder(BorderFactory.createLoweredBevelBorder());
  }
  
  public void paint(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    Insets insets = getInsets();
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    graphics2D.setStroke(this.b);
    Stroke stroke = graphics2D.getStroke();
    int i = getWidth() - insets.left - insets.right;
    int j = getHeight() - insets.top - insets.bottom;
    int k = i * 2 / 3;
    int m = j * 2 / 3;
    boolean bool = b();
    if (bool) {
      paramGraphics.setColor(this.c);
    } else {
      paramGraphics.setColor(this.p);
    } 
    paramGraphics.fillRect(insets.left, insets.top, i, j);
    if (this.q != null && !this.q.isEmpty()) {
      int n = getFontMetrics(this.g).stringWidth(this.q);
      paramGraphics.setFont(this.g);
      paramGraphics.setColor(Color.BLACK);
      paramGraphics.drawString(this.q, (getWidth() - n) / 2, this.g.getSize());
    } 
    if (!Double.isNaN(this.l) && !Double.isNaN(this.m)) {
      int n;
      int i1;
      if (bool) {
        paramGraphics.setColor(this.e);
      } else {
        paramGraphics.setColor(this.d);
      } 
      if (this.l < this.n) {
        double d = 0.5D * (this.l - this.h) / (this.n - this.h);
        n = (int)(insets.left + Math.round(d * i));
      } else {
        double d = 0.5D + 0.5D * (this.l - this.n) / (this.i - this.n);
        n = (int)(insets.left + Math.round(d * i));
      } 
      if (this.m < this.o) {
        double d = 1.0D - 0.5D * (this.m - this.j) / (this.o - this.j);
        i1 = (int)(insets.top + Math.round(d * j));
      } else {
        double d = 0.5D - 0.5D * (this.m - this.o) / (this.k - this.o);
        i1 = (int)(insets.top + Math.round(d * j));
      } 
      paramGraphics.drawOval(n - k / 2, i1 - m / 2, k, m);
      paramGraphics.drawLine(insets.left, i1, n - k / 2, i1);
      paramGraphics.drawLine(n + k / 2 + 1, i1, getWidth() - insets.right, i1);
      if (i1 - m / 2 > insets.top)
        paramGraphics.drawLine(n, insets.top, n, i1 - m / 2); 
      if (i1 + m / 2 < getHeight() - insets.bottom)
        paramGraphics.drawLine(n, i1 + m / 2 + 1, n, getHeight() - insets.bottom); 
    } 
    graphics2D.setStroke(stroke);
    super.paint(paramGraphics);
  }
  
  private boolean b() {
    double d1;
    double d2;
    if (this.l < this.n) {
      d1 = 0.5D * (this.l - this.h) / (this.n - this.h);
    } else {
      d1 = 0.5D + (this.l - this.n) / (this.i - this.n);
    } 
    if (this.m < this.o) {
      d2 = 1.0D - 0.5D * (this.m - this.j) / (this.o - this.j);
    } else {
      d2 = 0.5D - 0.5D * (this.m - this.o) / (this.k - this.o);
    } 
    return (Math.abs(0.5D - d1) < this.f && Math.abs(0.5D - d2) < this.f);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.g = new Font("Dialog", 0, paramInt4 * 4 / 5);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(double paramDouble) {
    this.h = paramDouble;
  }
  
  public void b(double paramDouble) {
    this.i = paramDouble;
  }
  
  public void c(double paramDouble) {
    this.j = paramDouble;
  }
  
  public void d(double paramDouble) {
    this.k = paramDouble;
  }
  
  public void e(double paramDouble) {
    this.l = paramDouble;
  }
  
  public void f(double paramDouble) {
    this.m = paramDouble;
  }
  
  public void g(double paramDouble) {
    this.n = paramDouble;
  }
  
  public void h(double paramDouble) {
    this.o = paramDouble;
  }
  
  public void a(Color paramColor) {
    this.p = paramColor;
  }
  
  public void a(String paramString) {
    this.q = paramString;
  }
  
  public void a() {
    this.h = Double.NaN;
    this.i = Double.NaN;
    this.j = Double.NaN;
    this.k = Double.NaN;
    this.l = Double.NaN;
    this.m = Double.NaN;
    this.n = Double.NaN;
    this.o = Double.NaN;
    this.q = null;
    this.p = Color.LIGHT_GRAY;
    setBackground(this.p);
    repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */