package com.efiAnalytics.ui;

import G.B;
import G.dj;
import W.j;
import bH.D;
import bH.X;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.JComponent;

public class CurveEditorComponent extends JComponent implements FocusListener {
  private double G = 1.0D;
  
  private dj H = (dj)new B(1.0D);
  
  private ArrayList I = new ArrayList();
  
  private ArrayList J = new ArrayList();
  
  private double K = 100.0D;
  
  private double L = Double.MIN_VALUE;
  
  private double M = 0.0D;
  
  private double N = 100.0D;
  
  private double O = Double.MIN_VALUE;
  
  private double P = 0.0D;
  
  private double Q = Double.MAX_VALUE;
  
  private int R = 0;
  
  private int S = 0;
  
  private int T = 10;
  
  private int U = 10;
  
  private String V = null;
  
  private boolean W = false;
  
  int a = eJ.a(8);
  
  int b = eJ.a(10);
  
  ArrayList c = new ArrayList();
  
  bP d = new bP(this, -1, -1);
  
  private double X = Double.MIN_VALUE;
  
  private double Y = Double.NaN;
  
  private boolean Z = true;
  
  private boolean aa = false;
  
  private boolean ab = false;
  
  private double ac = 0.0D;
  
  private int ad = 10000;
  
  private long ae = 0L;
  
  double e = 0.01D;
  
  private int af;
  
  ArrayList f = new ArrayList();
  
  Color g = Color.YELLOW;
  
  Color h = Color.GRAY;
  
  Color i = new Color(50, 60, 255);
  
  Color j = Color.RED;
  
  Color k = Color.GREEN;
  
  Color l = Color.MAGENTA;
  
  ArrayList m = new ArrayList();
  
  private Insets ag = null;
  
  private Font ah = new Font("Arial Unicode MS", 0, eJ.a(10));
  
  private Font ai = new Font("Arial Unicode MS", 1, eJ.a(11));
  
  private Font aj = new Font("Arial Unicode MS", 1, eJ.a(12));
  
  ArrayList n = new ArrayList();
  
  ArrayList o = new ArrayList();
  
  Image p = null;
  
  boolean q = true;
  
  Stroke r = new BasicStroke(eJ.a(1), 0, 2, 0.0F, new float[] { 1.0F, 2.0F }, 0.0F);
  
  Stroke s = new BasicStroke(eJ.a(1), 0, 2, 0.0F, new float[] { 2.0F, 2.0F }, 0.0F);
  
  Stroke t = new BasicStroke(eJ.a(2));
  
  static final float[] u = new float[] { 8.0F };
  
  Stroke v = new BasicStroke(eJ.a(3.0F), 0, 0, 10.0F, u, 0.0F);
  
  Stroke w = new BasicStroke(eJ.a(3));
  
  private boolean ak = false;
  
  private boolean al = false;
  
  private boolean am = false;
  
  static int x = 0;
  
  static int y = 1;
  
  static int z = 2;
  
  static int A = 3;
  
  static int B = 4;
  
  static int C = 5;
  
  Rectangle D = null;
  
  private j an = null;
  
  private j ao = null;
  
  private boolean ap = false;
  
  private double aq = Double.NaN;
  
  private double ar = Double.NaN;
  
  private bT as = null;
  
  long E = -1L;
  
  double F = 0.0D;
  
  public bN() {
    setBackground(Color.BLACK);
    setForeground(Color.WHITE);
    bO bO = new bO(this);
    addMouseListener(bO);
    addMouseMotionListener(bO);
    setFocusable(true);
    addFocusListener(this);
    L();
  }
  
  private void L() {
    this.f.add(Color.GREEN);
    this.f.add(Color.RED);
    this.f.add(Color.CYAN);
    this.f.add(Color.YELLOW);
    this.f.add(Color.MAGENTA);
    this.f.add(Color.WHITE);
    this.f.add(Color.GRAY);
    this.f.add(Color.ORANGE);
    this.f.add(Color.PINK);
    this.f.add(Color.BLUE);
  }
  
  public void a(String paramString) {
    this.m.add(paramString);
  }
  
  public void a() {
    this.m.clear();
  }
  
  public Color a(int paramInt) {
    return (this.I.size() > 1) ? this.f.get(paramInt % this.f.size()) : this.g;
  }
  
  public void paint(Graphics paramGraphics) {
    Stroke stroke = ((Graphics2D)paramGraphics).getStroke();
    paramGraphics.drawImage(b(), 0, 0, null);
    try {
      b(paramGraphics);
    } catch (Exception exception) {
      exception.printStackTrace();
      D.c("Curve, error painting highlight");
    } 
    if (I())
      c(paramGraphics); 
    if (!isEnabled()) {
      Color color = new Color(0, 0, 0, 128);
      paramGraphics.setColor(color);
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    } 
    super.paint(paramGraphics);
    if (this.D != null) {
      paramGraphics.setColor(Color.YELLOW);
      ((Graphics2D)paramGraphics).setStroke(this.r);
      paramGraphics.drawRect(this.D.x, this.D.y, this.D.width, this.D.height);
      ((Graphics2D)paramGraphics).setStroke(stroke);
    } 
    if (hasFocus()) {
      paramGraphics.setColor(Color.LIGHT_GRAY);
      ((Graphics2D)paramGraphics).setStroke(this.r);
      paramGraphics.drawRect(eJ.a(2), eJ.a(2), getWidth() - eJ.a(5), getHeight() - eJ.a(5));
      ((Graphics2D)paramGraphics).setStroke(stroke);
    } 
  }
  
  private void a(Graphics paramGraphics) {
    g(paramGraphics);
    e(paramGraphics);
    f(paramGraphics);
    d(paramGraphics);
  }
  
  protected Image b() {
    if (this.p == null || this.p.getWidth(null) != getWidth() || this.p.getHeight(null) != getHeight()) {
      this.p = createImage(getWidth(), getHeight());
      this.q = true;
    } 
    if (this.q) {
      a(this.p.getGraphics());
      this.q = false;
    } 
    return this.p;
  }
  
  private void b(Graphics paramGraphics) {
    bP bP1;
    if (this.X == Double.MIN_VALUE || Double.isNaN(this.X))
      return; 
    if (Double.isNaN(this.Y)) {
      bP1 = a(this.I.get(0), this.X);
    } else {
      bP1 = new bP(this);
      bP1.a(this.X);
      bP1.b(this.Y);
    } 
    if (Double.isNaN(this.Y))
      for (byte b = 1; b < this.I.size(); b++) {
        bP bP2 = a(this.I.get(b), this.X);
        if (bP2.e() > bP1.e())
          bP1 = bP2; 
      }  
    paramGraphics.setColor(this.k);
    if (Double.isNaN(this.Y)) {
      paramGraphics.drawLine(bP1.d(), bP1.f(), bP1.d(), getHeight() - (F()).bottom);
    } else {
      paramGraphics.drawLine(bP1.d(), (F()).top, bP1.d(), getHeight() - (F()).bottom);
      paramGraphics.drawLine((F()).left, bP1.f(), getWidth() - (F()).right, bP1.f());
    } 
    paramGraphics.fillOval(bP1.d() - this.a / 2, bP1.f() - this.a / 2, this.a, this.a);
  }
  
  private void c(Graphics paramGraphics) {
    if (H() < i())
      return; 
    if (h() <= i() || Math.abs((p() - H()) / (h() - i())) < this.e)
      return; 
    try {
      bP bP1 = a(this.I.get(0), H());
      for (byte b = 1; b < this.I.size(); b++) {
        bP bP2 = a(this.I.get(b), this.X);
        if (bP2.e() > bP1.e())
          bP1 = bP2; 
      } 
      paramGraphics.setColor(this.k);
      ((Graphics2D)paramGraphics).setStroke(this.s);
      paramGraphics.drawOval(bP1.d() - this.a / 2, bP1.f() - this.a / 2, this.a, this.a);
      paramGraphics.drawLine(bP1.d(), bP1.f(), bP1.d(), getHeight() - (F()).bottom);
    } catch (Exception exception) {}
  }
  
  private void d(Graphics paramGraphics) {
    bP bP1 = e(x(), w());
    if (bP1 == null)
      return; 
    String[] arrayOfString = new String[2];
    arrayOfString[0] = b(x()) + ": " + X.b(bP1.c(), this.R);
    arrayOfString[1] = c(x()) + ": " + X.b(bP1.e(), this.S);
    FontMetrics fontMetrics = getFontMetrics(this.ah);
    int i = fontMetrics.stringWidth(arrayOfString[0]);
    i = (fontMetrics.stringWidth(arrayOfString[1]) > i) ? fontMetrics.stringWidth(arrayOfString[1]) : i;
    Rectangle rectangle = c(i, fontMetrics.getHeight());
    paramGraphics.setColor(Color.DARK_GRAY);
    paramGraphics.fill3DRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height, false);
    paramGraphics.setColor(getForeground());
    paramGraphics.setFont(this.ah);
    paramGraphics.drawString(arrayOfString[0], (int)rectangle.getX() + eJ.a(2), (int)rectangle.getY() + fontMetrics.getHeight() - eJ.a(2));
    paramGraphics.drawString(arrayOfString[1], (int)rectangle.getX() + eJ.a(2), (int)rectangle.getY() + 2 * fontMetrics.getHeight() - eJ.a(2));
  }
  
  private Rectangle c(int paramInt1, int paramInt2) {
    int i = eJ.a(10);
    int k = eJ.a(8);
    bP bP1 = e(x(), w());
    bP bP2 = e(x(), w() + 1);
    bP bP3 = e(x(), w() - 1);
    int m = (getWidth() - bP1.d() > paramInt1 + i) ? i : -(paramInt1 + i);
    int n = (paramInt2 * 2 + k < bP1.f()) ? -(paramInt2 + k) : k;
    int i1 = bP1.d() + m;
    int i2 = bP1.f() + n;
    Rectangle rectangle = new Rectangle(i1 - 2, i2 - paramInt2 + 2, paramInt1 + 4, paramInt2 * 2);
    if ((a(bP2, rectangle) || a(bP3, rectangle)) && rectangle.getY() + rectangle.getHeight() + (k * 2) < getHeight()) {
      rectangle.setLocation((int)rectangle.getX(), (int)(rectangle.getY() + rectangle.getHeight() + (k * 2)));
      return rectangle;
    } 
    return rectangle;
  }
  
  private boolean a(bP parambP, Rectangle paramRectangle) {
    int i = eJ.a(5);
    return (parambP == null) ? false : ((parambP.d() > paramRectangle.getX() && parambP.d() < paramRectangle.getX() + paramRectangle.getWidth() + i && parambP.f() > paramRectangle.getY() && parambP.f() < paramRectangle.getY() + paramRectangle.getHeight() + i));
  }
  
  private void e(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setStroke(this.t);
    if (this.ap && this.an != null && this.ao != null) {
      bP bP1 = new bP(this);
      bP1.c = 0;
      bP1.d = 0;
      int[] arrayOfInt1 = new int[this.an.i()];
      int[] arrayOfInt2 = new int[this.ao.i()];
      byte b1 = 0;
      boolean bool = this.ao.r();
      int i = this.ao.s();
      this.ao.g(2);
      this.ar = Double.NaN;
      this.aq = Double.NaN;
      for (byte b2 = 0; b2 < this.an.i(); b2++) {
        if (this.as == null || this.as.a(b2)) {
          bP1.a(this.an.d(b2));
          bP1.b(this.ao.d(b2));
          int k = bP1.d();
          int m = bP1.f();
          if (bP1.c() >= this.M && bP1.c() <= this.K && bP1.e() >= this.P && bP1.e() <= this.N) {
            arrayOfInt1[b1] = k;
            arrayOfInt2[b1] = m;
            b1++;
            if (Double.isNaN(this.aq) || bP1.c() < this.aq)
              this.aq = bP1.c(); 
            if (Double.isNaN(this.ar) || bP1.c() > this.ar)
              this.ar = bP1.c(); 
          } 
        } 
      } 
      this.ao.b(bool);
      this.ao.g(i);
      paramGraphics.setColor(this.l);
      paramGraphics.drawPolyline(arrayOfInt1, arrayOfInt2, b1);
    } 
  }
  
  private void f(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    int i;
    for (i = 0; i < this.I.size(); i++) {
      bQ bQ = this.I.get(i);
      if (this.ak && this.J.size() > i) {
        bQ bQ1 = this.J.get(i);
        byte b1;
        for (b1 = 1; b1 < bQ1.size(); b1++) {
          if (bQ1 != null) {
            graphics2D.setStroke(this.v);
            bP bP1 = (bP)bQ1.get(b1);
            bP bP2 = (bP)bQ1.get(b1 - 1);
            paramGraphics.setColor(a(i).darker().darker());
            paramGraphics.drawLine(bP2.d(), bP2.f(), bP1.d(), bP1.f());
          } 
        } 
        for (b1 = 0; b1 < bQ1.size(); b1++) {
          bP bP1 = (bP)bQ1.get(b1);
          paramGraphics.setColor(Color.GRAY);
          paramGraphics.fillOval(bP1.d() - this.a / 2, bP1.f() - this.a / 2, this.a, this.a);
        } 
      } 
    } 
    i = this.I.size();
    int k = (i > 1) ? (i + 1) : i;
    byte b;
    for (b = 0; b < k; b++) {
      for (byte b1 = 0; b1 < this.I.size(); b1++) {
        bQ bQ = this.I.get(b1);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setStroke(a(b1, i, b));
        for (byte b2 = 1; b2 < bQ.size(); b2++) {
          bP bP1 = (bP)bQ.get(b2);
          bP bP2 = (bP)bQ.get(b2 - 1);
          paramGraphics.setColor(a(b1));
          paramGraphics.drawLine(bP2.d(), bP2.f(), bP1.d(), bP1.f());
        } 
      } 
    } 
    for (b = 0; b < this.I.size(); b++) {
      bQ bQ = this.I.get(b);
      for (byte b1 = 0; b1 < bQ.size(); b1++) {
        bP bP1 = (bP)bQ.get(b1);
        if (this.c.contains(bP1)) {
          paramGraphics.setColor(this.j);
          paramGraphics.fillOval(bP1.d() - this.b / 2, bP1.f() - this.b / 2, this.b, this.b);
        } else {
          paramGraphics.setColor(this.i);
          paramGraphics.fillOval(bP1.d() - this.a / 2, bP1.f() - this.a / 2, this.a, this.a);
        } 
      } 
    } 
  }
  
  private Stroke a(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 > 1) {
      float[] arrayOfFloat = new float[2];
      float f1 = eJ.a(6.0F);
      arrayOfFloat[0] = f1;
      arrayOfFloat[1] = f1 * paramInt2;
      float f2 = (paramInt1 + paramInt3) * f1;
      return new BasicStroke(eJ.a(3.0F), 2, 2, 10.0F, arrayOfFloat, f2);
    } 
    return this.w;
  }
  
  private void g(Graphics paramGraphics) {
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    int i = R();
    int k = getHeight() - (F()).top - (F()).bottom;
    paramGraphics.setColor(getForeground());
    FontMetrics fontMetrics1 = getFontMetrics(this.ah);
    FontMetrics fontMetrics2 = getFontMetrics(this.ai);
    if (E() != null && !E().equals("")) {
      FontMetrics fontMetrics = getFontMetrics(this.aj);
      int i3 = (getWidth() - fontMetrics.stringWidth(E())) / 2;
      paramGraphics.setFont(this.aj);
      paramGraphics.drawString(E(), i3, fontMetrics.getHeight() - eJ.a(3));
    } 
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
    paramGraphics.setFont(this.ah);
    int m;
    for (m = 0; m < this.T; m++) {
      double d;
      paramGraphics.setColor(this.h);
      int i3 = (F()).left + i * m / (this.T - 1);
      paramGraphics.drawLine(i3, (F()).top, i3, k + (F()).top);
      bQ bQ = m(0);
      if (T()) {
        d = ((bP)bQ.get(m)).c();
      } else {
        d = this.M + m * (this.K - this.M) / (this.T - 1);
      } 
      paramGraphics.setColor(getForeground());
      String str1 = X.b(d, this.R);
      int i4 = 0;
      if (m == 0) {
        i4 = eJ.a(5);
      } else if (m == this.T - 1) {
        i4 = -(fontMetrics1.stringWidth(str1) / 8);
      } 
      paramGraphics.drawString(str1, i3 - fontMetrics1.stringWidth(str1) / 2 + i4, (F()).top + k + fontMetrics1.getHeight());
    } 
    if (this.U > 1) {
      for (m = 0; m < this.U; m++) {
        int i3 = (F()).top + k * m / (this.U - 1);
        paramGraphics.drawLine((F()).left, i3, i + (F()).left, i3);
        double d = this.P + (this.U - 1 - m) * (this.N - this.P) / (this.U - 1);
        String str1 = X.b(d, this.S);
        int i4 = 0;
        if (m == 0) {
          i4 = eJ.a(5);
        } else if (m == this.U - 1) {
          i4 = eJ.a(-5);
        } 
        paramGraphics.drawString(str1, (F()).left - fontMetrics1.stringWidth(str1), i3 + fontMetrics1.getHeight() / 3 + i4);
      } 
    } else {
      m = (F()).top;
      paramGraphics.drawLine((F()).left, m, i + (F()).left, m);
      m = (F()).top + k;
      paramGraphics.drawLine((F()).left, m, i + (F()).left, m);
    } 
    paramGraphics.setFont(this.ai);
    ArrayList<String> arrayList1 = new ArrayList();
    ArrayList<String> arrayList2 = new ArrayList();
    int n;
    for (n = 0; n < this.I.size(); n++) {
      String str1 = b(n);
      if (str1 != null && !str1.isEmpty() && !arrayList2.contains(str1))
        arrayList2.add(str1); 
      String str2 = c(n);
      if (str2 != null && !str2.isEmpty() && !arrayList1.contains(str2))
        arrayList1.add(str2); 
    } 
    n = Math.max(arrayList2.size(), arrayList1.size());
    int i1 = 1;
    String str = null;
    int i2;
    for (i2 = 0; i2 < n; i2++) {
      String str1 = c(i2);
      if (str == null || str.equals(str1)) {
        i1 = 1;
      } else {
        i1 = n;
        break;
      } 
    } 
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    for (i2 = 0; i2 < i1; i2++) {
      String str1 = b(i2);
      String str2 = c(i2);
      int i3 = (int)((F()).left + (i2 + 0.5D) * i / i1 - (fontMetrics2.stringWidth(str1) / 2));
      if (str1 != null) {
        if (i1 > 1)
          paramGraphics.setColor(a(i2)); 
        paramGraphics.drawString(str1, i3, (F()).top + k + fontMetrics1.getHeight() + this.ai.getSize() + eJ.a(2));
      } 
      if (str2 != null) {
        if (i1 > 1)
          paramGraphics.setColor(a(i2)); 
        int i4 = (int)((F()).top + (i2 + 0.5D) * k / i1 - (str2.length() * (int)(fontMetrics2.getHeight() * 0.85D) / 2));
        for (byte b = 0; b < str2.length(); b++) {
          String str3 = str2.charAt(b) + "";
          int i5 = ((F()).left - fontMetrics2.stringWidth(str3)) / 2 - eJ.a(10);
          paramGraphics.drawString(str3, i5, i4);
          i4 += (int)(fontMetrics2.getHeight() * 0.85D);
        } 
      } 
    } 
    if (!this.m.isEmpty()) {
      paramGraphics.setFont(this.ah);
      i2 = (getWidth() - (F()).left - (F()).right) / this.m.size();
      for (byte b = 0; b < this.m.size(); b++) {
        int i3 = b * i2 + i2 / 2;
        String str1 = this.m.get(b);
        int i4 = (F()).left + i3 - paramGraphics.getFontMetrics().stringWidth(str1) / 2;
        int i5 = getHeight() - eJ.a(4);
        paramGraphics.setColor(a(b));
        paramGraphics.drawString(str1, i4, i5);
      } 
    } 
  }
  
  private bP a(bQ parambQ, double paramDouble) {
    bP bP1 = null;
    bP bP2 = null;
    if (paramDouble <= this.M) {
      bP bP4 = new bP(this);
      bP4.c = 0;
      bP4.b(((bP)parambQ.get(0)).e());
      if (T()) {
        bP4.a(((bP)parambQ.get(0)).c());
      } else {
        bP4.a(this.M);
      } 
      return bP4;
    } 
    if (paramDouble >= this.K) {
      bP bP4 = new bP(this);
      bP4.c = parambQ.size() - 1;
      bP4.b(((bP)parambQ.get(parambQ.size() - 1)).e());
      if (T()) {
        bP4.a(((bP)parambQ.get(parambQ.size() - 1)).c());
      } else {
        bP4.a(this.K);
      } 
      return bP4;
    } 
    if (paramDouble <= ((bP)parambQ.get(0)).c()) {
      bP bP4 = new bP(this);
      bP4.c = 0;
      bP4.b(((bP)parambQ.get(0)).e());
      bP4.a(paramDouble);
      return bP4;
    } 
    if (paramDouble >= ((bP)parambQ.get(parambQ.size() - 1)).c()) {
      bP bP4 = new bP(this);
      bP4.c = parambQ.size() - 1;
      bP4.b(((bP)parambQ.get(parambQ.size() - 1)).e());
      bP4.a(paramDouble);
      return bP4;
    } 
    for (byte b = 0; b < parambQ.size(); b++) {
      bP2 = (bP)parambQ.get(b);
      if (bP2.c() > paramDouble) {
        if (b > 0) {
          bP1 = (bP)parambQ.get(b - 1);
          break;
        } 
        bP1 = bP2;
      } 
    } 
    bP bP3 = new bP(this, bP1.a(), bP1.b());
    bP3.a(paramDouble);
    double d = (paramDouble - bP1.c()) / (bP2.c() - bP1.c());
    bP3.b(bP1.e() * (1.0D - d) + bP2.e() * d);
    return bP3;
  }
  
  public String b(int paramInt) {
    bQ bQ = m(paramInt);
    String str = bQ.a();
    if (str == null && paramInt > 0) {
      bQ = m(0);
      str = bQ.a();
    } 
    if (str == null)
      str = "X"; 
    return str;
  }
  
  public String c(int paramInt) {
    bQ bQ = m(paramInt);
    if (bQ.b() == null || bQ.b().isEmpty())
      bQ = m(0); 
    return (bQ.b() == null) ? "Y" : bQ.b();
  }
  
  public boolean c() {
    if (e())
      return false; 
    boolean bool = false;
    for (bP bP1 : this.c) {
      if (bP1 == null)
        return false; 
      double d = bP1.c() + g();
      if (bP1 != null && x == a(d, bP1.a(), bP1.b())) {
        bP1.a(d);
        o();
        f(bP1.a(), bP1.b());
        repaint();
        bool = true;
      } 
    } 
    return bool;
  }
  
  public boolean d() {
    if (e())
      return false; 
    boolean bool = false;
    for (bP bP1 : this.c) {
      if (bP1 == null)
        return false; 
      double d = bP1.c() - g();
      if (bP1 != null && x == a(d, bP1.a(), bP1.b())) {
        bP1.a(d);
        o();
        f(bP1.a(), bP1.b());
        repaint();
        bool = true;
      } 
    } 
    return bool;
  }
  
  private bP M() {
    bP bP1 = null;
    for (bQ bQ : this.I) {
      bP bP2 = a(bQ);
      if (bP1 == null || (bP2 != null && bP2.c() > bP1.c()))
        bP1 = bP2; 
    } 
    return bP1;
  }
  
  private bP a(bQ parambQ) {
    bP bP1 = null;
    for (bP bP2 : parambQ) {
      if (bP1 == null || bP2.c() > bP1.c())
        bP1 = bP2; 
    } 
    return bP1;
  }
  
  private bP N() {
    bP bP1 = null;
    for (bQ bQ : this.I) {
      bP bP2 = b(bQ);
      if (bP1 == null || (bP2 != null && bP2.e() > bP1.e()))
        bP1 = bP2; 
    } 
    return bP1;
  }
  
  private bP b(bQ parambQ) {
    bP bP1 = null;
    for (bP bP2 : parambQ) {
      if (bP1 == null || bP2.e() > bP1.e())
        bP1 = bP2; 
    } 
    return bP1;
  }
  
  private bP O() {
    bP bP1 = null;
    for (bQ bQ : this.I) {
      bP bP2 = c(bQ);
      if (bP1 == null || (bP2 != null && bP2.e() < bP1.e()))
        bP1 = bP2; 
    } 
    return bP1;
  }
  
  private bP c(bQ parambQ) {
    bP bP1 = null;
    for (bP bP2 : parambQ) {
      if (bP1 == null || bP2.e() < bP1.e())
        bP1 = bP2; 
    } 
    return bP1;
  }
  
  private boolean P() {
    bP bP1 = M();
    if (bP1 == null)
      return false; 
    if (s()) {
      double d = (bP1.c() > 0.0D) ? 1.15D : 0.8695652173913044D;
      if (bP1.c() * d <= q() && (bP1.c() < h() / 2.0D || bP1.c() > h() * 0.95D)) {
        double d1 = bP1.c() * d + g();
        if (d1 > q()) {
          b(q());
        } else {
          b(d1);
        } 
      } 
    } 
    bP1 = e(x(), w());
    if (bP1 == null)
      return false; 
    if (x != a(bP1.c(), this.d.a(), this.d.b())) {
      if (bP1.c() > h()) {
        bP1.a(h());
      } else if (bP1.c() < i()) {
        bP1.a(i());
      } 
      o();
      f(x(), w());
      repaint();
      return true;
    } 
    return false;
  }
  
  public boolean e() {
    boolean bool = Q();
    return (P() || bool);
  }
  
  private boolean Q() {
    bP bP1 = N();
    bP bP2 = O();
    if (bP1 == null)
      return false; 
    if (t()) {
      double d = (bP1.e() > 0.0D) ? 1.2D : 0.8333333333333334D;
      if (bP1.e() * d <= r() && (bP1.e() < j() / 2.0D || bP1.e() > j() - g(bP1.b()) * 2.0D)) {
        double d1 = bP1.e() * d + g(bP1.b());
        if (d1 > r()) {
          d(r());
        } else {
          d(d1);
        } 
      } 
      d = (bP2.e() < 0.0D) ? 1.2D : 0.8333333333333334D;
      if (bP2.e() * d >= y() && (bP2.e() > k() / 2.0D || bP2.e() < k() + g(bP2.b()) * 2.0D)) {
        double d1 = bP2.e() * d - g(bP2.b());
        if (d1 < y()) {
          e(y());
        } else {
          e(d1);
        } 
      } 
    } 
    bP1 = e(x(), w());
    if (bP1 == null)
      return false; 
    if (x != b(bP1.e(), this.d.a(), this.d.b())) {
      if (bP1.e() > j()) {
        d(bP1.e() + (j() - k()) * 0.1D);
      } else if (bP1.e() < k()) {
        bP1.b(k());
      } 
      o();
      f(x(), w());
      repaint();
      return true;
    } 
    return false;
  }
  
  public int d(int paramInt) {
    bQ bQ = this.I.get(paramInt);
    return bQ.size();
  }
  
  public double a(int paramInt1, int paramInt2) {
    bQ bQ = this.I.get(paramInt1);
    return ((bP)bQ.get(paramInt2)).a;
  }
  
  private int R() {
    return getWidth() - (F()).left - (F()).right;
  }
  
  public boolean e(int paramInt) {
    if (Q())
      return false; 
    boolean bool = false;
    for (bP bP1 : this.c) {
      if (bP1 == null)
        return false; 
      double d1 = d(bP1.a(), bP1.b());
      double d2 = bP1.e() + g(bP1.b()) * paramInt;
      if (d2 > d1)
        d2 = d1; 
      if (bP1 != null && x == b(d2, bP1.a(), bP1.b())) {
        bP1.b(d2);
        o();
        f(bP1.a(), bP1.b());
        repaint();
        bool = true;
      } 
    } 
    return bool;
  }
  
  public boolean f(int paramInt) {
    if (Q())
      return false; 
    boolean bool = false;
    for (bP bP1 : this.c) {
      if (bP1 == null)
        return false; 
      double d = bP1.e() - g(bP1.b()) * paramInt;
      if (d < k())
        d = k(); 
      if (bP1 != null && x == b(d, bP1.a(), bP1.b())) {
        bP1.b(d);
        o();
        f(bP1.a(), bP1.b());
        repaint();
        bool = true;
      } 
    } 
    return bool;
  }
  
  public void a(int paramInt, double paramDouble1, double paramDouble2) {
    bQ bQ = m(paramInt);
    bQ.add((E)new bP(this, paramDouble1, paramDouble2, paramInt, bQ.size()));
    o();
    e();
  }
  
  public void f() {
    this.I.clear();
  }
  
  public void a(int paramInt1, int paramInt2, double paramDouble) {
    bP bP1 = (bP)m(paramInt1).get(paramInt2);
    boolean bool = (bP1.c() != paramDouble) ? true : false;
    bP1.a(paramDouble);
    o();
    if (bool)
      g(paramInt1, paramInt2); 
  }
  
  private double m(double paramDouble) {
    return Math.rint(paramDouble * 1.0E7D) / 1.0E7D;
  }
  
  public void b(int paramInt1, int paramInt2, double paramDouble) {
    paramDouble = m(paramDouble);
    bP bP1 = (bP)m(paramInt1).get(paramInt2);
    boolean bool = (bP1.e() != paramDouble) ? true : false;
    bP1.b(paramDouble);
    o();
    if (bool)
      h(paramInt1, paramInt2); 
  }
  
  public double g() {
    return this.G;
  }
  
  public void a(double paramDouble) {
    this.G = paramDouble;
    String str = "" + paramDouble;
    this.R = 0;
    if (paramDouble < 1.0D)
      for (byte b = 1; str.charAt(b) == '0' || str.charAt(b) == '.'; b++)
        this.R++;  
  }
  
  public double g(int paramInt) {
    return this.H.a(paramInt);
  }
  
  public void a(dj paramdj) {
    this.H = paramdj;
    String str = "" + paramdj.a();
    this.S = 0;
    if (paramdj.a() < 1.0D)
      for (byte b = 1; str.charAt(b) == '0' || str.charAt(b) == '.'; b++)
        this.S++;  
  }
  
  public double h() {
    return this.K;
  }
  
  public void b(double paramDouble) {
    if (this.L == Double.MIN_VALUE)
      g(paramDouble); 
    if (paramDouble > this.L)
      paramDouble = this.L; 
    this.K = paramDouble;
    o();
  }
  
  public double i() {
    return this.M;
  }
  
  public void c(double paramDouble) {
    this.M = paramDouble;
    o();
  }
  
  public double j() {
    return this.N;
  }
  
  private double d(int paramInt1, int paramInt2) {
    return Double.isNaN(((bP)((bQ)this.I.get(paramInt1)).get(paramInt2)).g()) ? j() : ((bP)((bQ)this.I.get(paramInt1)).get(paramInt2)).g();
  }
  
  public void d(double paramDouble) {
    if (this.O == Double.MIN_VALUE)
      h(paramDouble); 
    if (paramDouble > this.O)
      paramDouble = this.O; 
    this.N = paramDouble;
    o();
  }
  
  public double k() {
    return this.P;
  }
  
  public void e(double paramDouble) {
    this.P = paramDouble;
    o();
  }
  
  public void h(int paramInt) {
    this.T = paramInt;
    o();
  }
  
  public void i(int paramInt) {
    this.U = paramInt;
    o();
  }
  
  public void a(String paramString, int paramInt) {
    bQ bQ = m(paramInt);
    bQ.a(paramString);
    o();
  }
  
  public void b(String paramString, int paramInt) {
    bQ bQ = m(paramInt);
    bQ.b(paramString);
    o();
  }
  
  private bP e(int paramInt1, int paramInt2) {
    return (paramInt2 >= 0 && paramInt1 >= 0 && paramInt1 < this.I.size() && paramInt2 < m(paramInt1).size()) ? (bP)m(paramInt1).get(paramInt2) : null;
  }
  
  private void f(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt2 >= 0) {
      g(paramInt1, paramInt2);
      h(paramInt1, paramInt2);
    } 
  }
  
  private void g(int paramInt1, int paramInt2) {
    bP bP1 = e(paramInt1, paramInt2);
    for (bS bS : this.n)
      bS.a(paramInt1, paramInt2, bP1.c()); 
  }
  
  private void h(int paramInt1, int paramInt2) {
    bP bP1 = e(paramInt1, paramInt2);
    for (bS bS : this.n)
      bS.b(paramInt1, paramInt2, bP1.e()); 
  }
  
  private void S() {
    bP[] arrayOfBP = (bP[])this.c.toArray((Object[])new bP[this.c.size()]);
    for (bR bR : this.o)
      bR.a((ef[])arrayOfBP); 
  }
  
  public void a(bS parambS) {
    this.n.add(parambS);
  }
  
  public void a(bR parambR) {
    this.o.add(parambR);
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension;
    if (this.I.size() == 0 || ((bQ)this.I.get(0)).size() < 3) {
      dimension = new Dimension(eJ.a(120), eJ.a(90));
    } else if (((bQ)this.I.get(0)).size() > 12) {
      dimension = new Dimension(eJ.a(450), eJ.a(370));
    } else {
      int i = eJ.a(70) + ((bQ)this.I.get(0)).size() * eJ.a(48);
      dimension = new Dimension(i, (int)(Math.log(((bQ)this.I.get(0)).size()) * eJ.a(126)));
    } 
    if (T() && this.T > 7)
      dimension.width = this.T * eJ.a(38); 
    return dimension;
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = getPreferredSize();
    dimension.height /= 2;
    dimension.width /= 2;
    return dimension;
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 != getX() || paramInt2 != getY() || paramInt3 != getWidth() || paramInt4 != getHeight()) {
      this.p = null;
      this.q = true;
    } 
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    getHeight();
  }
  
  private int a(double paramDouble, int paramInt1, int paramInt2) {
    if (this.W)
      return C; 
    bP bP1 = e(paramInt1, paramInt2);
    bP bP2 = new bP(this, paramInt1, paramInt2);
    bP2.b(bP1.e());
    bP2.a(paramDouble);
    return a(bP2, paramInt1, paramInt2);
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3) {
    if (this.W)
      return C; 
    bP bP1 = e(paramInt2, paramInt3);
    bP bP2 = new bP(this, paramInt2, paramInt3);
    bP2.b(bP1.e());
    bP2.b(paramInt1);
    return a(bP2, paramInt2, paramInt3);
  }
  
  private int c(int paramInt1, int paramInt2, int paramInt3) {
    bP bP1 = e(paramInt2, paramInt3);
    bP bP2 = new bP(this, paramInt2, paramInt3);
    bP2.a(bP1.c());
    bP2.c(paramInt1);
    return a(bP2, paramInt2, paramInt3);
  }
  
  private int b(double paramDouble, int paramInt1, int paramInt2) {
    bP bP1 = e(paramInt1, paramInt2);
    bP bP2 = new bP(this, paramInt1, paramInt2);
    bP2.a(bP1.c());
    bP2.b(paramDouble);
    return a(bP2, paramInt1, paramInt2);
  }
  
  private int a(bP parambP, int paramInt1, int paramInt2) {
    if (parambP.c() > h())
      return B; 
    if (parambP.c() < i())
      return A; 
    if (parambP.e() > d(paramInt1, paramInt2))
      return y; 
    if (parambP.e() < k())
      return z; 
    if (paramInt2 + 1 < m(paramInt1).size()) {
      bP bP1 = e(paramInt1, paramInt2 + 1);
      if (parambP.c() >= bP1.c())
        return C; 
    } 
    if (paramInt2 > 0) {
      bP bP1 = e(paramInt1, paramInt2 - 1);
      if (parambP.c() <= bP1.c())
        return C; 
    } 
    return x;
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    for (byte b = 0; b < getComponentCount(); b++)
      getComponent(b).setEnabled(paramBoolean); 
  }
  
  public boolean l() {
    return this.W;
  }
  
  public void a(boolean paramBoolean) {
    this.W = paramBoolean;
  }
  
  public void a(Rectangle paramRectangle) {
    this.c.clear();
    for (bQ bQ : this.I) {
      for (bP bP1 : bQ) {
        if (paramRectangle.contains(bP1.d(), bP1.f()))
          this.c.add(bP1); 
      } 
    } 
    o();
    S();
  }
  
  public void a(ef[] paramArrayOfef) {
    this.c.clear();
    boolean bool = false;
    if (paramArrayOfef != null)
      for (ef ef1 : paramArrayOfef) {
        if (ef1.a() < 0) {
          bool = true;
          for (byte b = 0; b < this.I.size(); b++) {
            bP bP1 = e(b, ef1.b());
            if (bP1 != null && !this.c.contains(bP1)) {
              this.c.add(bP1);
              if (!this.am)
                break; 
            } 
          } 
        } else {
          bP bP1 = e(ef1.a(), ef1.b());
          if (bP1 != null && !this.c.contains(bP1)) {
            bool = true;
            this.c.add(bP1);
            if (!this.am)
              break; 
          } 
        } 
      }  
    if (bool) {
      o();
      S();
    } 
  }
  
  public void b(boolean paramBoolean) {
    if (x() >= 0)
      if (w() == m(x()).size() - 1) {
        this.d.c = 0;
        m();
      } else {
        this.d.c++;
      }  
    if (paramBoolean || !this.am)
      this.c.clear(); 
    bP bP1 = e(this.d.d, this.d.c);
    if (bP1 != null && !this.c.contains(bP1))
      this.c.add(bP1); 
    o();
    S();
  }
  
  public void m() {
    if (x() == this.I.size() - 1) {
      this.d.d = 0;
    } else {
      this.d.c++;
    } 
    o();
    S();
  }
  
  public void n() {
    if (x() <= 0) {
      this.d.d = this.I.size() - 1;
    } else {
      this.d.c--;
    } 
    o();
    S();
  }
  
  public void c(boolean paramBoolean) {
    if (x() < 0)
      this.d.d = 0; 
    if (w() <= 0) {
      n();
      this.d.c = m(x()).size() - 1;
    } else {
      this.d.c--;
    } 
    if (paramBoolean || !this.am)
      this.c.clear(); 
    bP bP1 = e(this.d.d, this.d.c);
    if (bP1 != null && !this.c.contains(bP1))
      this.c.add(bP1); 
    o();
    S();
  }
  
  public void o() {
    this.q = true;
  }
  
  public double p() {
    return this.X;
  }
  
  public void f(double paramDouble) {
    this.X = paramDouble;
  }
  
  public double q() {
    return this.L;
  }
  
  public void g(double paramDouble) {
    this.L = paramDouble;
  }
  
  public double r() {
    return this.O;
  }
  
  public void h(double paramDouble) {
    this.O = paramDouble;
  }
  
  public boolean s() {
    return this.ab;
  }
  
  public void d(boolean paramBoolean) {
    this.ab = paramBoolean;
  }
  
  public boolean t() {
    return this.aa;
  }
  
  public void e(boolean paramBoolean) {
    this.aa = paramBoolean;
  }
  
  private bQ m(int paramInt) {
    while (this.I.size() <= paramInt)
      this.I.add(new bQ(this)); 
    return this.I.get(paramInt);
  }
  
  public void b(int paramInt1, int paramInt2) {
    this.d.d = paramInt1;
    this.d.c = paramInt2;
    if (!this.al)
      this.c.clear(); 
    this.c.add((bP)((bQ)this.I.get(paramInt1)).get(paramInt2));
    o();
    repaint();
  }
  
  public void u() {
    this.J.clear();
    for (bQ bQ1 : this.I) {
      bQ bQ2 = bQ1.c();
      this.J.add(bQ2);
    } 
  }
  
  public void f(boolean paramBoolean) {
    this.ak = paramBoolean;
  }
  
  public void v() {
    for (byte b = 0; b < this.J.size(); b++) {
      for (byte b1 = 0; b1 < ((bQ)this.J.get(b)).size(); b1++) {
        ((bP)((bQ)this.I.get(b)).get(b1)).a(((bP)((bQ)this.J.get(b)).get(b1)).c());
        ((bP)((bQ)this.I.get(b)).get(b1)).b(((bP)((bQ)this.J.get(b)).get(b1)).e());
        f(b, b1);
      } 
    } 
  }
  
  public int w() {
    return this.c.isEmpty() ? -1 : this.d.b();
  }
  
  public int x() {
    return this.c.isEmpty() ? -1 : this.d.a();
  }
  
  public int[] j(int paramInt) {
    ArrayList<Integer> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < this.c.size(); b1++) {
      if (((bP)this.c.get(b1)).a() == paramInt)
        arrayList.add(Integer.valueOf(((bP)this.c.get(b1)).b())); 
    } 
    int[] arrayOfInt = new int[arrayList.size()];
    for (byte b2 = 0; b2 < arrayList.size(); b2++)
      arrayOfInt[b2] = ((Integer)arrayList.get(b2)).intValue(); 
    return arrayOfInt;
  }
  
  public double y() {
    return this.Q;
  }
  
  public void i(double paramDouble) {
    this.Q = paramDouble;
  }
  
  private boolean T() {
    bQ bQ = m(0);
    return (bQ != null && bQ.size() == this.T && this.W);
  }
  
  public void g(boolean paramBoolean) {
    this.al = paramBoolean;
  }
  
  public void c(int paramInt1, int paramInt2, double paramDouble) {
    ((bP)((bQ)this.I.get(paramInt1)).get(paramInt2)).c(paramDouble);
  }
  
  public void h(boolean paramBoolean) {
    this.am = paramBoolean;
  }
  
  public int z() {
    return this.c.size();
  }
  
  public void j(double paramDouble) {
    for (bP bP1 : this.c) {
      if (bP1 == null)
        break; 
      if (bP1 != null && x == b(paramDouble, bP1.a(), bP1.b())) {
        bP1.b(paramDouble);
        f(bP1.a(), bP1.b());
      } 
    } 
    o();
    repaint();
  }
  
  public void k(double paramDouble) {
    this.Y = paramDouble;
  }
  
  public void i(boolean paramBoolean) {
    this.ap = paramBoolean;
  }
  
  public j A() {
    return this.an;
  }
  
  public void a(j paramj) {
    this.an = paramj;
  }
  
  public j B() {
    return this.ao;
  }
  
  public void b(j paramj) {
    this.ao = paramj;
  }
  
  public void a(bT parambT) {
    this.as = parambT;
  }
  
  public int C() {
    bQ bQ = this.I.get(0);
    for (int i = bQ.size() - 1; i >= 0; i--) {
      if (((bP)bQ.get(i)).c() < this.aq)
        return (i < bQ.size() - 1) ? i : (bQ.size() - 1); 
    } 
    return 0;
  }
  
  public int D() {
    bQ bQ = this.I.get(0);
    for (byte b = 0; b < bQ.size() - 1; b++) {
      if (((bP)bQ.get(b)).c() > this.ar)
        return (b > 0) ? b : 0; 
    } 
    return (bQ.size() > 0) ? (bQ.size() - 1) : 0;
  }
  
  public String E() {
    return this.V;
  }
  
  public void b(String paramString) {
    this.V = paramString;
    o();
  }
  
  public Insets F() {
    if (this.ag == null) {
      byte b = this.m.isEmpty() ? 35 : 55;
      if (E() == null || E().equals("")) {
        this.ag = eJ.a(10, 50, b, 17);
      } else {
        this.ag = eJ.a(22, 50, b, 17);
      } 
    } 
    return this.ag;
  }
  
  public void focusGained(FocusEvent paramFocusEvent) {
    repaint();
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    repaint();
  }
  
  public int G() {
    return this.ad;
  }
  
  public void k(int paramInt) {
    this.ad = paramInt;
  }
  
  public double H() {
    return this.ac;
  }
  
  public void l(double paramDouble) {
    this.ac = paramDouble;
    this.ae = System.currentTimeMillis();
  }
  
  public boolean I() {
    return this.Z;
  }
  
  public void j(boolean paramBoolean) {
    this.Z = paramBoolean;
  }
  
  public long J() {
    return this.ae;
  }
  
  public int K() {
    return this.af;
  }
  
  public void l(int paramInt) {
    this.af = paramInt;
  }
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */