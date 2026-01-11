package com.efiAnalytics.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.util.ArrayList;
import javax.swing.JComponent;

public abstract class AbstractChartComponent extends JComponent {
  private boolean a = true;
  
  private Color b = Color.GRAY;
  
  ArrayList c = new ArrayList();
  
  private String i = "";
  
  private String j = "";
  
  private String k = "";
  
  private Font l = new Font("Arial Unicode MS", 0, eJ.a(20));
  
  private Font m = new Font("Arial Unicode MS", 0, eJ.a(11));
  
  private double n = 0.0D;
  
  private double o = 0.0D;
  
  private boolean p = true;
  
  private Color q = Color.lightGray;
  
  private Color r = Color.WHITE;
  
  protected Rectangle d = null;
  
  private String s = "";
  
  private int t = -1;
  
  private int u = -1;
  
  private boolean v = true;
  
  Image e = null;
  
  boolean f = true;
  
  Stroke g = new BasicStroke(1.0F);
  
  private int w = 5;
  
  private int x = 5;
  
  int h = eJ.a(25);
  
  public aS() {
    setBackground(Color.BLACK);
    setForeground(Color.lightGray);
    aT aT = new aT(this);
    addMouseListener(aT);
    addMouseMotionListener(aT);
  }
  
  public void paint(Graphics paramGraphics) {
    if (this.e == null || getWidth() != this.e.getWidth(null) || getHeight() != this.e.getHeight(null)) {
      this.e = createImage(getWidth(), getHeight());
      this.f = true;
    } 
    if (this.f) {
      Graphics graphics = this.e.getGraphics();
      graphics.clearRect(0, 0, this.e.getWidth(null), this.e.getHeight(null));
      c(graphics);
      if (e())
        b(graphics); 
      a(graphics);
    } 
    paramGraphics.drawImage(this.e, 0, 0, this);
    d(paramGraphics);
  }
  
  protected void c(Graphics paramGraphics) {
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    int i = getFontMetrics(g()).stringWidth(f());
    paramGraphics.setFont(g());
    paramGraphics.setColor(getForeground());
    paramGraphics.drawString(f(), (getWidth() - i) / 2, g().getSize());
  }
  
  public void d(Graphics paramGraphics) {
    if (!n() || p() < 0 || o() < 0)
      return; 
    ((Graphics2D)paramGraphics).setStroke(this.g);
    Rectangle rectangle = k();
    if (!rectangle.contains(p(), o()))
      return; 
    paramGraphics.setColor(q());
    paramGraphics.drawLine(p(), rectangle.y, p(), rectangle.height + rectangle.y);
    paramGraphics.drawLine(rectangle.x, o(), rectangle.width + rectangle.x, o());
    paramGraphics.drawString("X: " + a(p()), rectangle.x + this.h, rectangle.y + paramGraphics.getFont().getSize());
    String[] arrayOfString = b(o()).split("\n");
    int i = rectangle.y + paramGraphics.getFont().getSize() * 2;
    int j = rectangle.x + this.h;
    paramGraphics.drawString("Y:", j, i);
    j += paramGraphics.getFontMetrics(paramGraphics.getFont()).stringWidth("Y: ");
    for (String str : arrayOfString) {
      paramGraphics.drawString(str, j, i);
      i += paramGraphics.getFont().getSize();
    } 
  }
  
  public abstract void c();
  
  public abstract void a(Graphics paramGraphics);
  
  public abstract void b(Graphics paramGraphics);
  
  public abstract String a(int paramInt);
  
  public abstract String b(int paramInt);
  
  public void a(int paramInt, Color paramColor) {
    if (this.c.size() <= paramInt)
      c(paramInt); 
    this.c.set(paramInt, paramColor);
    d();
  }
  
  public void d() {
    this.f = true;
  }
  
  public Color c(int paramInt) {
    if (this.c.size() <= paramInt)
      for (int i = this.c.size(); i <= paramInt; i++)
        this.c.add(f(i));  
    return this.c.get(paramInt);
  }
  
  private Color f(int paramInt) {
    switch (paramInt % 4) {
      case 0:
        return Color.CYAN;
      case 1:
        return Color.GREEN;
      case 2:
        return Color.RED;
      case 3:
        return Color.YELLOW;
    } 
    return Color.ORANGE;
  }
  
  public boolean e() {
    return this.a;
  }
  
  public String f() {
    return this.i;
  }
  
  public void b(String paramString) {
    this.i = paramString;
    d();
  }
  
  public Font g() {
    return this.l;
  }
  
  public double h() {
    return this.n;
  }
  
  public void c(double paramDouble) {
    this.n = paramDouble;
    d();
  }
  
  public double i() {
    return this.o;
  }
  
  public void d(double paramDouble) {
    this.o = paramDouble;
    d();
  }
  
  public boolean j() {
    return this.p;
  }
  
  public void a(boolean paramBoolean) {
    this.p = paramBoolean;
    d();
  }
  
  public Rectangle k() {
    if (this.d == null) {
      byte b = 5;
      this.d = new Rectangle(this.w, this.l.getSize() + b, getWidth() - b - this.w, getHeight() - this.l.getSize() - b - this.x);
    } 
    return this.d;
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.d = null;
    d();
  }
  
  public Font l() {
    return this.m;
  }
  
  public String m() {
    return this.s;
  }
  
  public void c(String paramString) {
    this.s = paramString;
    d();
  }
  
  public boolean n() {
    return this.v;
  }
  
  public int o() {
    return this.u;
  }
  
  public int p() {
    return this.t;
  }
  
  public Color q() {
    return this.r;
  }
  
  public String r() {
    return this.j;
  }
  
  public void d(String paramString) {
    this.j = paramString;
    d();
  }
  
  public String s() {
    return this.k;
  }
  
  public void e(String paramString) {
    this.k = paramString;
    d();
  }
  
  public void d(int paramInt) {
    this.w = paramInt;
    this.d = null;
  }
  
  public void e(int paramInt) {
    this.x = paramInt;
    this.d = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */