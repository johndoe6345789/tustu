package com.efiAnalytics.ui;

import bH.A;
import bH.D;
import bH.X;
import bH.ab;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComponent;

public class Table3DViewComponent extends JComponent implements FocusListener {
  private eR j = null;
  
  eT a = null;
  
  private Color k = Color.RED;
  
  private Color l = new Color(32, 32, 255);
  
  private boolean m = true;
  
  private int n = 1;
  
  private int o = 1;
  
  private String p = "Selected";
  
  private String q = "Starting";
  
  private double r = Double.NaN;
  
  private double s = Double.NaN;
  
  private int t = 8;
  
  private int u = 4;
  
  private int v = 25;
  
  private int w = 0;
  
  private int x = 0;
  
  private int y = 0;
  
  String b = "X";
  
  String c = "Y";
  
  String d = "Z";
  
  private boolean z = true;
  
  private boolean A = false;
  
  private boolean B = true;
  
  private ArrayList C = new ArrayList();
  
  private ArrayList D = new ArrayList();
  
  private long E = System.currentTimeMillis();
  
  Image e = null;
  
  Font f = new Font("Arial Unicode MS", 1, eJ.a(13));
  
  eQ g = null;
  
  boolean h = true;
  
  private ab F = null;
  
  private boolean G = true;
  
  Stroke i = new BasicStroke(1.0F, 0, 2, 0.0F, new float[] { 1.0F, 2.0F }, 0.0F);
  
  public eM() {
    if (A.i().b()) {
      this.a = new eT(this);
      eP eP = new eP(this);
      addMouseListener(eP);
      addMouseMotionListener(eP);
      addMouseWheelListener(eP);
      this.g = new eQ(this);
    } 
    eN eN = new eN(this);
    addMouseListener(eN);
    setFocusable(true);
    addFocusListener(this);
    setFont(new Font("SansSerif", 1, 12));
  }
  
  private String a(String paramString) {
    if (this.F != null)
      paramString = this.F.a(paramString); 
    return paramString;
  }
  
  public void setSize(int paramInt1, int paramInt2) {
    if (this.j == null || this.j.a() != paramInt1 || this.j.b() != paramInt2)
      this.j = new eR(paramInt1, paramInt2); 
    z();
  }
  
  public eR a() {
    return this.j;
  }
  
  public void a(eR parameR) {
    this.j = parameR;
    this.a.a(parameR);
    parameR.a(new eO(this));
    this.b = a(parameR.g());
    this.c = a(parameR.f());
    this.d = a(parameR.h());
    z();
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    if (getHeight() > 390) {
      int i = Math.round((getHeight() / 30));
      this.f = new Font("Arial Unicode MS", 1, i);
      setFont(this.f);
    } 
    this.a.c();
  }
  
  public void focusGained(FocusEvent paramFocusEvent) {
    repaint();
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    repaint();
  }
  
  private void a(Graphics paramGraphics, eZ parameZ, int paramInt1, int paramInt2) {
    if (!this.j.c(paramInt1, paramInt2)) {
      paramGraphics.setColor(Color.YELLOW);
      int i = H();
      paramGraphics.fillOval(parameZ.a - i / 2, parameZ.b - i / 2, i, i);
    } 
  }
  
  private void a(Graphics paramGraphics, boolean paramBoolean) {
    if (paramBoolean) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    } else {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
    } 
  }
  
  public void paint(Graphics paramGraphics) {
    long l = System.nanoTime();
    paramGraphics.drawImage(A(), 0, 0, null);
    h(paramGraphics);
    double d1 = (System.nanoTime() - l) / 1000000.0D;
    double d2 = 1000.0D / (System.currentTimeMillis() - this.E);
    this.E = System.currentTimeMillis();
    if (hasFocus()) {
      paramGraphics.setColor(getForeground());
      ((Graphics2D)paramGraphics).setStroke(this.i);
      paramGraphics.drawRect(1, 1, getWidth() - 3, getHeight() - 3);
    } 
    if (!isEnabled()) {
      paramGraphics.setColor(Color.lightGray);
      paramGraphics.draw3DRect(0, 0, getWidth() - 1, getHeight() - 1, false);
      paramGraphics.draw3DRect(1, 1, getWidth() - 3, getHeight() - 3, false);
      if (!isEnabled()) {
        Color color = new Color(64, 64, 64, 160);
        paramGraphics.setColor(color);
        paramGraphics.fillRect(0, 0, getWidth(), getHeight());
      } 
    } 
  }
  
  public void a(Graphics paramGraphics) {
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    a(paramGraphics, w());
    boolean bool1 = ((m() > 180 && l() < 180) || (m() < 180 && l() > 180)) ? true : false;
    boolean bool2 = ((l() < 90 || l() > 270) && m() > 90 && m() < 270) ? true : false;
    if (bool1) {
      if (bool2) {
        e(paramGraphics);
        f(paramGraphics);
        a(paramGraphics, this.j.a(this.n), this.j.b(this.o));
        d(paramGraphics);
        g(paramGraphics);
      } else {
        e(paramGraphics);
        a(paramGraphics, this.j.a(this.n), this.j.b(this.o));
        d(paramGraphics);
        f(paramGraphics);
        g(paramGraphics);
      } 
    } else if (bool2) {
      f(paramGraphics);
      d(paramGraphics);
      a(paramGraphics, this.j.a(this.n), this.j.b(this.o));
      g(paramGraphics);
      e(paramGraphics);
    } else {
      d(paramGraphics);
      a(paramGraphics, this.j.a(this.n), this.j.b(this.o));
      g(paramGraphics);
      f(paramGraphics);
      e(paramGraphics);
    } 
    b(paramGraphics);
  }
  
  public void b(Graphics paramGraphics) {
    a(paramGraphics, false);
    String str1 = X.b(this.j.d(this.o, this.n), D());
    String str2 = X.b(this.j.b(this.o), B());
    String str3 = X.b(this.j.a(this.n), C());
    paramGraphics.setColor(this.k);
    paramGraphics.setFont(this.f);
    paramGraphics.drawString(this.b + ": " + str3, 5, getFont().getSize());
    paramGraphics.drawString(this.c + ": " + str2, 5, getFont().getSize() * 2);
    paramGraphics.drawString(this.p + " " + this.j.h() + ": " + str1, 5, getFont().getSize() * 3);
    if (!this.j.c(this.o, this.n)) {
      String str = X.b(this.j.b(this.o, this.n), D());
      paramGraphics.drawString(this.q + " " + this.d + ": " + str, 5, getFont().getSize() * 4);
    } 
    if (this.B) {
      eZ eZ = this.a.a(this.j.a(this.n), this.j.b(this.o), this.j.d(this.o, this.n));
      int i = paramGraphics.getFont().getSize();
      eZ.b = eZ.b - G() - i;
      a(paramGraphics, eZ, str1, false, Color.orange);
    } 
    if (this.A) {
      eZ eZ1 = this.a.a(this.j.a(this.n), this.j.k() - 0.05D * (this.j.l() - this.j.k()), this.j.r());
      eZ eZ2 = this.a.a(this.j.i() - 0.05D * (this.j.j() - this.j.i()), this.j.b(this.o), this.j.r());
      a(paramGraphics, eZ2, str2, false, Color.orange);
      a(paramGraphics, eZ1, str3, false, Color.orange);
    } 
  }
  
  public void c(Graphics paramGraphics) {
    a(paramGraphics, false);
    String str1 = X.b(this.j.a(this.s, this.r), D());
    String str2 = X.b(this.s, B());
    String str3 = X.b(this.r, C());
    paramGraphics.setColor(this.l);
    paramGraphics.setFont(this.f);
    String str4 = this.b + ": " + str3;
    String str5 = this.c + ": " + str2;
    String str6 = this.d + ": " + str1;
    FontMetrics fontMetrics = getFontMetrics(this.f);
    int i = fontMetrics.stringWidth(str4);
    i = (fontMetrics.stringWidth(str5) > i) ? fontMetrics.stringWidth(str5) : i;
    i = (fontMetrics.stringWidth(str6) > i) ? fontMetrics.stringWidth(str6) : i;
    paramGraphics.drawString(str4, getWidth() - i + 5, getFont().getSize());
    paramGraphics.drawString(str5, getWidth() - i + 5, getFont().getSize() * 2);
    paramGraphics.drawString(str6, getWidth() - i + 5, getFont().getSize() * 3);
  }
  
  private void a(Graphics paramGraphics, eZ parameZ, String paramString, boolean paramBoolean, Color paramColor) {
    Color color = new Color(64, 64, 64, 192);
    int i = parameZ.a - (getFontMetrics(paramGraphics.getFont()).stringWidth(paramString) + 2) / 2;
    int j = parameZ.b - (paramGraphics.getFont().getSize() + 2) / 2;
    if (paramBoolean)
      j = parameZ.b + 2 * paramGraphics.getFont().getSize() + 2; 
    paramGraphics.setColor(color);
    paramGraphics.fill3DRect(i, j, getFontMetrics(paramGraphics.getFont()).stringWidth(paramString) + 3, paramGraphics.getFont().getSize() + 3, false);
    paramGraphics.setColor(paramColor);
    paramGraphics.drawString(paramString, i + 2, j + (int)(paramGraphics.getFont().getSize() * 0.9D) + 1);
  }
  
  private void d(Graphics paramGraphics) {
    boolean bool = false;
    eZ[][] arrayOfEZ = this.a.b();
    if (l() >= 90 && l() <= 270) {
      for (byte b = 1; b < this.j.o(); b++) {
        for (byte b1 = 0; b1 < this.j.p(); b1++) {
          if (b1 > 0) {
            Polygon polygon = new Polygon();
            polygon.addPoint((arrayOfEZ[b1 - 1][b - 1]).a, (arrayOfEZ[b1 - 1][b - 1]).b);
            polygon.addPoint((arrayOfEZ[b1 - 1][b]).a, (arrayOfEZ[b1 - 1][b]).b);
            polygon.addPoint((arrayOfEZ[b1][b]).a, (arrayOfEZ[b1][b]).b);
            polygon.addPoint((arrayOfEZ[b1][b - 1]).a, (arrayOfEZ[b1][b - 1]).b);
            if (p())
              if (bool) {
                double[] arrayOfDouble = new double[4];
                arrayOfDouble[0] = this.j.d(b1 - 1, b - 1);
                arrayOfDouble[1] = this.j.d(b1 - 1, b);
                arrayOfDouble[2] = this.j.d(b1, b);
                arrayOfDouble[3] = this.j.d(b1, b - 1);
                fh.a((Graphics2D)paramGraphics, polygon, arrayOfDouble, this.j.m(), this.j.n());
              } else {
                double d = (this.j.d(b1 - 1, b - 1) + this.j.d(b1 - 1, b) + this.j.d(b1, b) + this.j.d(b1, b - 1)) / 4.0D;
                Color color = fh.a(d, this.j.m(), this.j.n());
                paramGraphics.setColor(color);
                paramGraphics.fillPolygon(polygon);
              }  
            paramGraphics.setColor(getForeground());
            paramGraphics.drawPolygon(polygon);
          } 
          a(paramGraphics, arrayOfEZ[b1][b], b1, b);
        } 
      } 
    } else {
      for (int i = this.j.p() - 1; i >= 0; i--) {
        for (byte b = 1; b < this.j.o(); b++) {
          if (i > 0) {
            Polygon polygon = new Polygon();
            polygon.addPoint((arrayOfEZ[i - 1][b - 1]).a, (arrayOfEZ[i - 1][b - 1]).b);
            polygon.addPoint((arrayOfEZ[i - 1][b]).a, (arrayOfEZ[i - 1][b]).b);
            polygon.addPoint((arrayOfEZ[i][b]).a, (arrayOfEZ[i][b]).b);
            polygon.addPoint((arrayOfEZ[i][b - 1]).a, (arrayOfEZ[i][b - 1]).b);
            if (p())
              if (bool) {
                double[] arrayOfDouble = new double[4];
                arrayOfDouble[0] = this.j.d(i - 1, b - 1);
                arrayOfDouble[1] = this.j.d(i - 1, b);
                arrayOfDouble[2] = this.j.d(i, b);
                arrayOfDouble[3] = this.j.d(i, b - 1);
                fh.a((Graphics2D)paramGraphics, polygon, arrayOfDouble, this.j.m(), this.j.n());
              } else {
                double d = (this.j.d(i - 1, b - 1) + this.j.d(i - 1, b) + this.j.d(i, b) + this.j.d(i, b - 1)) / 4.0D;
                Color color = fh.a(d, this.j.m(), this.j.n());
                paramGraphics.setColor(color);
                paramGraphics.fillPolygon(polygon);
              }  
            paramGraphics.setColor(getForeground());
            paramGraphics.drawPolygon(polygon);
          } 
          a(paramGraphics, arrayOfEZ[i][b], i, b);
        } 
      } 
    } 
  }
  
  private void e(Graphics paramGraphics) {
    eZ eZ1 = this.a.a(this.j.i(), this.j.k(), this.j.r());
    eZ eZ2 = this.a.a(this.j.j(), this.j.k(), this.j.r());
    eZ eZ3 = this.a.a(this.j.i(), this.j.l(), this.j.r());
    paramGraphics.setColor(getForeground());
    paramGraphics.drawLine(eZ1.a, eZ1.b, eZ2.a, eZ2.b);
    paramGraphics.drawLine(eZ1.a, eZ1.b, eZ3.a, eZ3.b);
  }
  
  private void f(Graphics paramGraphics) {
    eZ eZ1 = this.a.a(this.j.i(), this.j.k(), this.j.r());
    eZ eZ2 = this.a.a(this.j.j(), this.j.k(), this.j.r());
    eZ eZ3 = this.a.a(this.j.i(), this.j.l(), this.j.r());
    eZ eZ4 = this.a.a(this.j.j(), this.j.l(), b(this.j));
    eZ eZ5 = this.a.a(this.j.j(), this.j.l(), this.j.r());
    eZ eZ6 = this.a.a(this.j.j(), this.j.k(), b(this.j));
    eZ eZ7 = this.a.a(this.j.i(), this.j.l(), b(this.j));
    paramGraphics.setColor(getForeground());
    paramGraphics.drawLine(eZ4.a, eZ4.b, eZ6.a, eZ6.b);
    paramGraphics.drawLine(eZ4.a, eZ4.b, eZ7.a, eZ7.b);
    paramGraphics.drawLine(eZ5.a, eZ5.b, eZ2.a, eZ2.b);
    paramGraphics.drawLine(eZ5.a, eZ5.b, eZ3.a, eZ3.b);
    paramGraphics.drawLine(eZ5.a, eZ5.b, eZ4.a, eZ4.b);
    paramGraphics.drawLine(eZ6.a, eZ6.b, eZ2.a, eZ2.b);
    paramGraphics.drawLine(eZ7.a, eZ7.b, eZ3.a, eZ3.b);
  }
  
  private double b(eR parameR) {
    double d = parameR.n() + (parameR.q() - parameR.r()) * 0.05D;
    return (d < parameR.q()) ? d : parameR.q();
  }
  
  private void g(Graphics paramGraphics) {
    if (!I())
      return; 
    eZ eZ = this.a.a(this.j.a(this.n), this.j.b(this.o), this.j.d(this.o, this.n));
    paramGraphics.setColor(this.k);
    int i = G() / 2;
    paramGraphics.fill3DRect(eZ.a - i, eZ.b - i, G(), G(), true);
  }
  
  private void a(Graphics paramGraphics, double paramDouble1, double paramDouble2) {
    a(paramGraphics, paramDouble1, paramDouble2, this.k);
  }
  
  private void a(Graphics paramGraphics, double paramDouble1, double paramDouble2, Color paramColor) {
    if (!I())
      return; 
    eZ eZ1 = this.a.a(paramDouble1, paramDouble2, this.j.r());
    eZ eZ2 = this.a.a(paramDouble1, this.j.k(), this.j.r());
    eZ eZ3 = this.a.a(this.j.i(), paramDouble2, this.j.r());
    eZ eZ4 = this.a.a(paramDouble1, paramDouble2, this.j.a(paramDouble2, paramDouble1));
    paramGraphics.setColor(paramColor);
    paramGraphics.drawLine(eZ2.a, eZ2.b, eZ1.a, eZ1.b);
    paramGraphics.drawLine(eZ3.a, eZ3.b, eZ1.a, eZ1.b);
    paramGraphics.drawLine(eZ1.a, eZ1.b, eZ4.a, eZ4.b);
  }
  
  private boolean F() {
    return (!Double.isNaN(this.r) && !Double.isNaN(this.s));
  }
  
  private void h(Graphics paramGraphics) {
    if (!F())
      return; 
    double d1 = (this.r > this.j.a(0)) ? this.r : this.j.a(0);
    double d2 = (this.s > this.j.b(0)) ? this.s : this.j.b(0);
    double d3 = this.j.a(this.s, this.r);
    eZ eZ1 = this.a.a(d1, d2, d3);
    paramGraphics.setColor(this.l);
    int i = G() / 2;
    paramGraphics.fillOval(eZ1.a - i, eZ1.b - i, G(), G());
    c(paramGraphics);
    eZ eZ2 = new eZ();
    eZ2.a = eZ1.a;
    eZ2.b = eZ1.b;
    int j = paramGraphics.getFont().getSize();
    eZ2.b = eZ2.b - G() - j;
    String str = X.b(d3, D());
    boolean bool = (this.r < this.j.a(this.n) || this.s < this.j.b(this.o)) ? true : false;
    a(paramGraphics, eZ2, str, bool, Color.CYAN);
  }
  
  private int G() {
    return (getHeight() > 360) ? (getHeight() / 45) : this.t;
  }
  
  private int H() {
    return G() * 4 / 5;
  }
  
  private boolean I() {
    return (this.n >= 0 && this.n < this.j.o() && this.o >= 0 && this.o < this.j.p());
  }
  
  public void b() {
    eZ[][] arrayOfEZ = this.a.b();
    int i = (arrayOfEZ[0][(arrayOfEZ[0]).length - 1]).a - (arrayOfEZ[0][0]).a;
    int j = (arrayOfEZ[0][(arrayOfEZ[0]).length - 1]).b - (arrayOfEZ[0][0]).b;
    if (E()) {
      if (Math.abs(i) > Math.abs(j)) {
        if (i > 0) {
          f();
        } else {
          g();
        } 
      } else if (j > 0) {
        h();
      } else {
        i();
      } 
    } else {
      f();
    } 
    repaint();
  }
  
  public void c() {
    eZ[][] arrayOfEZ = this.a.b();
    int i = (arrayOfEZ[0][(arrayOfEZ[0]).length - 1]).a - (arrayOfEZ[0][0]).a;
    int j = (arrayOfEZ[0][(arrayOfEZ[0]).length - 1]).b - (arrayOfEZ[0][0]).b;
    if (E()) {
      if (Math.abs(i) > Math.abs(j)) {
        if (i < 0) {
          f();
        } else {
          g();
        } 
      } else if (j < 0) {
        h();
      } else {
        i();
      } 
    } else {
      g();
    } 
    repaint();
  }
  
  public void d() {
    eZ[][] arrayOfEZ = this.a.b();
    int i = (arrayOfEZ[0][(arrayOfEZ[0]).length - 1]).a - (arrayOfEZ[0][0]).a;
    int j = (arrayOfEZ[0][(arrayOfEZ[0]).length - 1]).b - (arrayOfEZ[0][0]).b;
    if (E()) {
      if (Math.abs(i) < Math.abs(j)) {
        if (i < 0) {
          f();
        } else {
          g();
        } 
      } else {
        j = (arrayOfEZ[arrayOfEZ.length - 1][0]).b - (arrayOfEZ[0][0]).b;
        if (j < 0) {
          h();
        } else {
          i();
        } 
      } 
    } else {
      h();
    } 
    repaint();
  }
  
  public void e() {
    eZ[][] arrayOfEZ = this.a.b();
    int i = (arrayOfEZ[0][(arrayOfEZ[0]).length - 1]).a - (arrayOfEZ[0][0]).a;
    int j = (arrayOfEZ[0][(arrayOfEZ[0]).length - 1]).b - (arrayOfEZ[0][0]).b;
    if (E()) {
      if (Math.abs(i) < Math.abs(j)) {
        if (i > 0) {
          f();
        } else {
          g();
        } 
      } else {
        j = (arrayOfEZ[arrayOfEZ.length - 1][0]).b - (arrayOfEZ[0][0]).b;
        if (j > 0) {
          h();
        } else {
          i();
        } 
      } 
    } else {
      i();
    } 
    repaint();
  }
  
  public void f() {
    if (this.n < this.j.o() - 1) {
      this.n++;
      z();
      J();
    } 
  }
  
  public void g() {
    if (this.n > 0) {
      this.n--;
      z();
      J();
    } 
  }
  
  public void h() {
    if (this.o < this.j.p() - 1) {
      this.o++;
      z();
      J();
    } 
  }
  
  public void i() {
    if (this.o > 0) {
      this.o--;
      z();
      J();
    } 
  }
  
  public void j() {
    if (this.n < 0 || this.o < 0)
      return; 
    a(this.o, this.n, this.j.s());
  }
  
  public void a(int paramInt) {
    if (this.n < 0 || this.o < 0)
      return; 
    a(this.o, this.n, paramInt * this.j.s());
  }
  
  public void k() {
    if (this.n < 0 || this.o < 0)
      return; 
    a(this.o, this.n, -this.j.s());
  }
  
  public void b(int paramInt) {
    if (this.n < 0 || this.o < 0)
      return; 
    a(this.o, this.n, -(paramInt * this.j.s()));
  }
  
  public void a(int paramInt1, int paramInt2, double paramDouble) {
    double d = this.j.d(paramInt1, paramInt2) + paramDouble;
    this.j.a(paramInt1, paramInt2, d);
    z();
  }
  
  public void a(double paramDouble, int paramInt) {
    if (!F())
      return; 
    double d1 = this.j.b(this.s);
    double d2 = this.j.a(this.r);
    int i = (int)d1;
    int j = (int)d2;
    int k = (i < this.j.a() - 1) ? (i + 1) : i;
    int m = (j < this.j.b() - 1) ? (j + 1) : j;
    double d3 = d1 - i;
    double d4 = d2 - j;
    double d5 = (1.0D - d4) * (1.0D - d3);
    double d6 = d4 * (1.0D - d3);
    double d7 = (1.0D - d4) * d3;
    double d8 = d4 * d3;
    if (d5 >= paramDouble)
      a(i, j, paramInt * this.j.s()); 
    if (d6 >= paramDouble && j != m)
      a(i, m, paramInt * this.j.s()); 
    if (d7 >= paramDouble && i != k)
      a(k, j, paramInt * this.j.s()); 
    if (d8 >= paramDouble && j != m && i != k)
      a(k, m, paramInt * this.j.s()); 
  }
  
  public void a(eg parameg) {
    this.D.add(parameg);
  }
  
  private void J() {
    Iterator<eg> iterator = this.D.iterator();
    while (iterator.hasNext()) {
      try {
        eg eg = iterator.next();
        eg.a(q(), r(), a().d(r(), q()));
      } catch (Exception exception) {
        D.c("Exception generated by SelctedPointListener, caught and continued:");
        exception.printStackTrace();
      } 
    } 
  }
  
  public void c(int paramInt) {
    this.a.b(paramInt * Math.PI / 180.0D);
    z();
    K();
    j(paramInt);
  }
  
  public int l() {
    return (int)(this.a.d() * 180.0D / Math.PI);
  }
  
  public int m() {
    return (int)(this.a.e() * 180.0D / Math.PI);
  }
  
  public void d(int paramInt) {
    this.a.c(paramInt * Math.PI / 180.0D);
    z();
    K();
    k(paramInt);
  }
  
  public void a(eU parameU) {
    this.C.add(parameU);
  }
  
  private void j(int paramInt) {
    for (eU eU : this.C)
      eU.c(paramInt); 
  }
  
  private void k(int paramInt) {
    for (eU eU : this.C)
      eU.d(paramInt); 
  }
  
  protected eZ n() {
    return this.a.a(this.j.a(this.n), this.j.b(this.o), this.j.d(this.o, this.n));
  }
  
  public double o() {
    return (q() >= 0 && r() >= 0) ? this.j.d(r(), q()) : 0.0D;
  }
  
  public Dimension getMinimumSize() {
    return new Dimension(150, 150);
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(250, 250);
  }
  
  public boolean p() {
    return this.m;
  }
  
  public void a(boolean paramBoolean) {
    z();
    this.m = paramBoolean;
  }
  
  public int q() {
    return this.n;
  }
  
  public void e(int paramInt) {
    this.n = paramInt;
    z();
    J();
  }
  
  public int r() {
    return this.o;
  }
  
  public void f(int paramInt) {
    this.o = paramInt;
    z();
    J();
  }
  
  public Color s() {
    return this.k;
  }
  
  public void a(Color paramColor) {
    this.k = paramColor;
  }
  
  public Color t() {
    return this.l;
  }
  
  public void b(Color paramColor) {
    this.l = paramColor;
    z();
  }
  
  public boolean u() {
    return this.A;
  }
  
  public void b(boolean paramBoolean) {
    this.A = paramBoolean;
  }
  
  public boolean v() {
    return this.B;
  }
  
  public void c(boolean paramBoolean) {
    this.B = paramBoolean;
  }
  
  public void a(ab paramab) {
    this.F = paramab;
    this.p = a("Selected");
    this.q = a("Starting");
    if (this.j != null) {
      this.b = a(this.j.g());
      this.c = a(this.j.f());
      this.d = a(this.j.h());
    } 
  }
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
  
  public boolean w() {
    return this.z;
  }
  
  public void d(boolean paramBoolean) {
    this.z = paramBoolean;
  }
  
  public double x() {
    return this.r;
  }
  
  public void a(double paramDouble) {
    this.r = paramDouble;
  }
  
  public double y() {
    return this.s;
  }
  
  public void b(double paramDouble) {
    this.s = paramDouble;
  }
  
  public void z() {
    this.h = true;
  }
  
  public Image A() {
    if (this.e == null || this.e.getWidth(null) != getWidth() || this.e.getHeight(null) != getHeight()) {
      this.e = createImage(getWidth(), getHeight());
      this.h = true;
    } 
    if (this.h) {
      a(this.e.getGraphics());
      this.h = false;
    } 
    return this.e;
  }
  
  public void c(double paramDouble) {
    this.a.d(paramDouble);
  }
  
  public void repaint() {
    if (this.g == null)
      this.g = new eQ(this); 
    this.g.a();
  }
  
  private void K() {
    super.repaint();
  }
  
  public int B() {
    return this.w;
  }
  
  public void g(int paramInt) {
    this.w = paramInt;
  }
  
  public int C() {
    return this.x;
  }
  
  public void h(int paramInt) {
    this.x = paramInt;
  }
  
  public int D() {
    return this.y;
  }
  
  public void i(int paramInt) {
    this.y = paramInt;
  }
  
  public void e(boolean paramBoolean) {
    this.a.a(paramBoolean);
    z();
  }
  
  public boolean E() {
    return this.G;
  }
  
  public void f(boolean paramBoolean) {
    this.G = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */