package bG;

import bH.T;
import bH.X;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JComponent;

public class JComponentExtensionPaint extends JComponent {
  double a = 0.93D;
  
  double b = 0.07D;
  
  private double p = 0.12D;
  
  private int q = 135;
  
  private double r = 0.0D;
  
  private int s = 135;
  
  private l t = new a(60, 2);
  
  public static int c = 1;
  
  public static int d = 0;
  
  public static int e = 2;
  
  private int u = c;
  
  private boolean v = true;
  
  Stroke f = new BasicStroke(1.0F, 2, 0, 50.0F, null, 0.0F);
  
  Stroke g = new BasicStroke(2.0F, 2, 0, 50.0F, null, 0.0F);
  
  Stroke h = new BasicStroke(3.0F);
  
  Color i = Color.GREEN;
  
  Color j = Color.BLUE;
  
  Color k = Color.RED;
  
  private boolean w = false;
  
  ArrayList l = new ArrayList();
  
  HashMap m = new HashMap<>();
  
  ArrayList n = new ArrayList();
  
  List o = new ArrayList();
  
  public JComponentExtensionPaint() {
    setBackground(Color.WHITE);
    n n = new n(this);
    addMouseListener(n);
    addMouseMotionListener(n);
  }
  
  public void a(j paramj) {
    this.o.add(paramj);
  }
  
  private void a(List paramList) {
    for (j j : this.o)
      j.a(paramList); 
  }
  
  public void a(p paramp) {
    this.l.add(paramp);
  }
  
  public void b(p paramp) {
    this.l.remove(paramp);
  }
  
  private void k() {
    double d = c();
    for (p p : this.l)
      p.a(d); 
  }
  
  public void paint(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    d(paramGraphics);
    paramGraphics.setColor(getForeground());
    int i = m();
    int j = i - (int)(i * this.b);
    double d1 = ((getWidth() - j) / 2);
    double d2 = ((getHeight() - j) / 2);
    double d3 = ((getWidth() - i) / 2);
    double d4 = ((getHeight() - i) / 2);
    ArrayList<k> arrayList = e().a();
    if (arrayList.size() > 0) {
      double d = l() - 360.0D - ((k)arrayList.get(arrayList.size() - 1)).a() + ((k)arrayList.get(arrayList.size() - 1)).b();
      graphics2D.setStroke(this.f);
      ArrayList<k> arrayList1 = e().a();
      n();
      for (byte b = 0; b < arrayList1.size(); b++) {
        k k = arrayList1.get(b);
        double d5 = d;
        double d6 = l() + k.a() - d;
        double d7 = k.b();
        paramGraphics.setColor(getForeground());
        graphics2D.setStroke(this.f);
        a(paramGraphics, d1, d2, j, j, d5, d6);
        double d8 = d5 + d6;
        boolean bool = this.n.contains(Integer.valueOf(b));
        if (bool) {
          paramGraphics.setColor(this.k);
          graphics2D.setStroke(this.g);
        } 
        a(paramGraphics, d3, d4, i, i, d8, d7);
        o o = b(b);
        o.c((d8 + d7) % 360.0D - d7);
        o.d((d8 + d7) % 360.0D);
        o.a((j / 2));
        o.b((i / 2));
        Point2D point2D1 = a(j, j, d8, getWidth() / 2.0D, getHeight() / 2.0D, 1.0D, false);
        Point2D point2D2 = a(i, i, d8, getWidth() / 2.0D, getHeight() / 2.0D, 1.0D, false);
        a(paramGraphics, point2D1.getX(), point2D1.getY(), point2D2.getX(), point2D2.getY());
        point2D1 = a(j, j, d8 + d7, getWidth() / 2.0D, getHeight() / 2.0D, 1.0D, false);
        point2D2 = a(i, i, d8 + d7, getWidth() / 2.0D, getHeight() / 2.0D, 1.0D, false);
        a(paramGraphics, point2D1.getX(), point2D1.getY(), point2D2.getX(), point2D2.getY());
        if (bool) {
          String str1 = k.a() + "°";
          int n = getFontMetrics(paramGraphics.getFont()).stringWidth(str1) / 2;
          int i1 = paramGraphics.getFont().getSize() / 2;
          point2D1 = a(j, j, d8, getWidth() / 2.0D, getHeight() / 2.0D, 0.9D, false);
          paramGraphics.drawString(str1, (int)point2D1.getX() - n, (int)point2D1.getY() + i1);
          String str2 = (k.a() + d7) + "°";
          n = getFontMetrics(paramGraphics.getFont()).stringWidth(str2) / 2;
          point2D1 = a(i, i, d8 + d7, getWidth() / 2.0D, getHeight() / 2.0D, 1.09D, false);
          paramGraphics.drawString(str2, (int)point2D1.getX() - n, (int)point2D1.getY() + i1);
        } 
        d = l() + k.a() + k.b();
      } 
    } else {
      graphics2D.setStroke(this.f);
      a(paramGraphics, d1, d2, j, j, 0.0D, 360.0D);
    } 
    graphics2D.setStroke(this.g);
    b(paramGraphics);
    c(paramGraphics);
    a(paramGraphics);
    if (!isEnabled()) {
      Color color = new Color(230, 230, 230, 165);
      paramGraphics.setColor(color);
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    } 
  }
  
  public void a(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    int i = (int)(m() * (this.a - 0.3D));
    int j = (int)(i * 0.05D);
    BasicStroke basicStroke = new BasicStroke(j);
    graphics2D.setStroke(basicStroke);
    int k = Math.round(((getWidth() - i) / 2));
    int n = Math.round(((getHeight() - i) / 2));
    byte b1 = 60;
    byte b2 = 60;
    paramGraphics.drawArc(k, n, i, i, b1, b2);
    Polygon polygon = new Polygon();
    if (this.v) {
      Point2D point2D = a(i, i, (b1 + 1), (getWidth() / 2), (getHeight() / 2), 1.14D, false);
      polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
      point2D = a(i, i, (b1 - 10), (getWidth() / 2), (getHeight() / 2), 1.009D, false);
      polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
      point2D = a(i, i, (b1 + 1), (getWidth() / 2), (getHeight() / 2), 0.87D, false);
      polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
    } else {
      Point2D point2D = a(i, i, (b1 - 1), (getWidth() / 2), (getHeight() / 2), 1.14D, false);
      polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
      point2D = a(i, i, (b1 + 10), (getWidth() / 2), (getHeight() / 2), 1.009D, false);
      polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
      point2D = a(i, i, (b1 - 1), (getWidth() / 2), (getHeight() / 2), 0.87D, false);
      polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
    } 
    paramGraphics.fillPolygon(polygon.xpoints, polygon.ypoints, polygon.npoints);
  }
  
  private void c(Graphics paramGraphics) {
    int i = (int)(m() * this.p);
    Polygon polygon = new Polygon();
    int j = 0;
    Point2D point2D = a(i, i, l() + j, (getWidth() / 2), (getHeight() / 2), 1.0D, false);
    polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
    j += 60;
    point2D = a(i, i, l() + j, (getWidth() / 2), (getHeight() / 2), 1.0D, false);
    polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
    j += 60;
    point2D = a(i, i, l() + j, (getWidth() / 2), (getHeight() / 2), 1.0D, false);
    polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
    j += 60;
    point2D = a(i, i, l() + j, (getWidth() / 2), (getHeight() / 2), 1.0D, false);
    polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
    j += 60;
    point2D = a(i, i, l() + j, (getWidth() / 2), (getHeight() / 2), 1.0D, false);
    polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
    j += 60;
    point2D = a(i, i, l() + j, (getWidth() / 2), (getHeight() / 2), 1.0D, false);
    polygon.addPoint(Math.round((float)point2D.getX()), Math.round((float)point2D.getY()));
    j += 60;
    paramGraphics.setColor(getForeground());
    paramGraphics.fillPolygon(polygon);
  }
  
  public void b(Graphics paramGraphics) {
    paramGraphics.setColor(getForeground());
    double d1 = 0.25D;
    double d2 = 5.0D;
    double d3 = 2.0D;
    double d4 = 0.03D;
    double d5 = 1.0D + d4 * 2.0D;
    double d6 = 1.0D + d4 * 2.0D + d1;
    int i = m();
    Polygon polygon1 = new Polygon();
    Point2D point2D1 = a(i, i, this.q - d2 / 2.0D, (getWidth() / 2), (getHeight() / 2), d5, false);
    polygon1.addPoint(Math.round((float)point2D1.getX()), Math.round((float)point2D1.getY()));
    point2D1 = a(i, i, this.q + d2 / 2.0D, (getWidth() / 2), (getHeight() / 2), d5, false);
    polygon1.addPoint(Math.round((float)point2D1.getX()), Math.round((float)point2D1.getY()));
    point2D1 = a(i, i, this.q + d2 / 2.3D, (getWidth() / 2), (getHeight() / 2), d6, false);
    polygon1.addPoint(Math.round((float)point2D1.getX()), Math.round((float)point2D1.getY()));
    point2D1 = a(i, i, this.q - d2 / 2.3D, (getWidth() / 2), (getHeight() / 2), d6, false);
    polygon1.addPoint(Math.round((float)point2D1.getX()), Math.round((float)point2D1.getY()));
    paramGraphics.drawPolygon(polygon1);
    Polygon polygon2 = new Polygon();
    Point2D point2D2 = a(i, i, this.q - d3 / 2.0D, (getWidth() / 2), (getHeight() / 2), d5 - d4, false);
    polygon2.addPoint(Math.round((float)point2D2.getX()), Math.round((float)point2D2.getY()));
    point2D2 = a(i, i, this.q + d3 / 2.0D, (getWidth() / 2), (getHeight() / 2), d5 - d4, false);
    polygon2.addPoint(Math.round((float)point2D2.getX()), Math.round((float)point2D2.getY()));
    point2D2 = a(i, i, this.q + d3 / 2.0D, (getWidth() / 2), (getHeight() / 2), d5, false);
    polygon2.addPoint(Math.round((float)point2D2.getX()), Math.round((float)point2D2.getY()));
    point2D2 = a(i, i, this.q - d3 / 2.0D, (getWidth() / 2), (getHeight() / 2), d5, false);
    polygon2.addPoint(Math.round((float)point2D2.getX()), Math.round((float)point2D2.getY()));
    paramGraphics.fillPolygon(polygon2);
  }
  
  public void a(Integer paramInteger) {
    if (!this.n.contains(paramInteger)) {
      this.n.add(paramInteger);
      repaint();
      a(this.n);
    } 
  }
  
  public void b(Integer paramInteger) {
    if (this.n.remove(paramInteger)) {
      a(this.n);
      repaint();
    } 
  }
  
  public void c(Integer paramInteger) {
    if (this.n.contains(paramInteger)) {
      b(paramInteger);
    } else {
      a(paramInteger);
    } 
  }
  
  protected Point2D a(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, boolean paramBoolean) {
    double d1 = paramBoolean ? ((180.0D - paramDouble1) * 2.0D * Math.PI / 360.0D) : (paramDouble1 * 2.0D * Math.PI / 360.0D);
    double d2 = Math.sqrt(Math.pow(paramInt1 / 2.0D, 2.0D) * Math.pow(paramInt2 / 2.0D, 2.0D) / (Math.pow(paramInt1 / 2.0D * Math.sin(d1), 2.0D) + Math.pow(paramInt2 / 2.0D * Math.cos(d1), 2.0D))) * paramDouble4;
    double d3 = paramDouble2 + d2 * Math.cos(d1);
    double d4 = paramDouble3 - d2 * Math.sin(d1);
    return new Point2D.Double(d3, d4);
  }
  
  private double b(int paramInt1, int paramInt2) {
    Point point = new Point(getWidth() / 2, getHeight() / 2);
    double d = Math.atan2(Math.abs(paramInt2 - point.y), paramInt1 - point.x);
    if (paramInt2 > point.y)
      d = 6.283185307179586D - d; 
    return Math.toDegrees(d);
  }
  
  public int a(int paramInt1, int paramInt2) {
    double d1 = b(paramInt1, paramInt2);
    int i = paramInt1 - getWidth() / 2;
    int j = paramInt2 - getHeight() / 2;
    double d2 = Math.sqrt(Math.pow(i, 2.0D) + Math.pow(j, 2.0D));
    for (o o : this.m.values()) {
      if (o.a(d2, d1))
        return o.b(); 
    } 
    return -1;
  }
  
  private double l() {
    return -c() + f() + this.s - e().b();
  }
  
  public double a() {
    return 360.0D - c();
  }
  
  public int b() {
    k k = null;
    ArrayList<k> arrayList = e().a();
    double d = 360.0D - a();
    if (d > 360.0D)
      d -= 360.0D; 
    if (d < 0.0D)
      d += 360.0D; 
    for (byte b = 0; b < arrayList.size(); b++) {
      k k1 = arrayList.get(b);
      if (d() == c) {
        if (k1.a() > d)
          return (k == null) ? (b - 1) : (b - 1); 
      } else if (k1.a() > d) {
        return (k == null) ? (b - 1) : (b - 1);
      } 
      k = k1;
    } 
    return arrayList.size() - 1;
  }
  
  public double c() {
    return this.r;
  }
  
  public void a(double paramDouble) {
    this.r = paramDouble % 360.0D;
  }
  
  private int m() {
    return (int)((getWidth() > getHeight()) ? Math.round(getHeight() * this.a) : Math.round(getWidth() * this.a));
  }
  
  public int d() {
    return this.u;
  }
  
  public void a(int paramInt) {
    this.u = paramInt;
  }
  
  public l e() {
    return this.t;
  }
  
  public void a(l paraml) {
    this.t = paraml;
  }
  
  private void a(Graphics paramGraphics, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    Line2D.Double double_ = new Line2D.Double(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
    ((Graphics2D)paramGraphics).draw(double_);
  }
  
  private void a(Graphics paramGraphics, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4) {
    boolean bool = false;
    if (bool) {
      Point2D point2D1 = a(paramInt1, paramInt2, paramDouble3, getWidth() / 2.0D, getHeight() / 2.0D, 1.0D, false);
      Point2D point2D2 = a(paramInt1, paramInt2, paramDouble3 + paramDouble4, getWidth() / 2.0D, getHeight() / 2.0D, 1.0D, false);
      a(paramGraphics, point2D1.getX(), point2D1.getY(), point2D2.getX(), point2D2.getY());
    } else {
      Arc2D.Double double_ = new Arc2D.Double(paramDouble1, paramDouble2, paramInt1, paramInt2, paramDouble3, paramDouble4, 0);
      ((Graphics2D)paramGraphics).draw(double_);
    } 
  }
  
  public double f() {
    return (d() == c) ? 0.0D : -((k)this.t.a().get(0)).b();
  }
  
  private void d(Graphics paramGraphics) {
    byte b = 33;
    double d1 = 0.43D;
    paramGraphics.setColor(this.j);
    ((Graphics2D)paramGraphics).setStroke(this.h);
    int i = (int)(m() * this.p * 1.35D);
    double d2 = ((getWidth() - i) / 2);
    double d3 = ((getHeight() - i) / 2);
    double d4 = this.q;
    double d5 = this.q - c();
    Point point = new Point(getWidth() / 2, getHeight() / 2);
    Point2D point2D1 = a(m(), m(), d4, (getWidth() / 2), (getHeight() / 2), 1.0D, false);
    Point2D point2D2 = a(m(), m(), d5, (getWidth() / 2), (getHeight() / 2), 1.0D, false);
    a(paramGraphics, point.getX(), point.getY(), point2D1.getX(), point2D1.getY());
    a(paramGraphics, point.getX(), point.getY(), point2D2.getX(), point2D2.getY());
    a(paramGraphics, d2, d3, i, i, this.q, -c());
    Point2D point2D3 = null;
    String str = X.a(c()) + T.a();
    FontMetrics fontMetrics = paramGraphics.getFontMetrics();
    int j = fontMetrics.stringWidth(str);
    if (Math.abs(c()) < b) {
      point2D3 = a(m(), m(), d4 - 45.0D, (getWidth() / 2), (getHeight() / 2), d1, false);
    } else {
      point2D3 = a(m(), m(), (d4 + d5) / 2.0D, (getWidth() / 2), (getHeight() / 2), d1, false);
    } 
    paramGraphics.drawString(str, (int)point2D3.getX() - j / 2, (int)point2D3.getY() + fontMetrics.getHeight() / 2);
  }
  
  public boolean g() {
    return this.w;
  }
  
  public void a(boolean paramBoolean) {
    this.w = paramBoolean;
    if (paramBoolean) {
      this.a = 0.85D;
    } else {
      this.a = 0.93D;
    } 
  }
  
  private o b(int paramInt) {
    o o = (o)this.m.get(Integer.valueOf(paramInt));
    if (o == null) {
      o = new o(this, paramInt);
      this.m.put(Integer.valueOf(paramInt), o);
    } 
    return o;
  }
  
  private void n() {
    for (o o : this.m.values())
      o.b(o.a()); 
  }
  
  public Integer[] h() {
    return (Integer[])this.n.toArray((Object[])new Integer[this.n.size()]);
  }
  
  public void i() {
    this.n.clear();
    a(this.n);
  }
  
  public void j() {
    for (byte b = 0; b < e().a().size(); b++)
      a(Integer.valueOf(b)); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */