package com.efiAnalytics.apps.ts.dashboard;

import C.a;
import G.R;
import G.T;
import G.aF;
import G.aG;
import G.ah;
import G.ak;
import G.bT;
import G.cq;
import G.cu;
import G.i;
import I.c;
import I.d;
import K.c;
import V.a;
import V.g;
import W.ap;
import aE.a;
import bH.A;
import bH.D;
import bH.J;
import bH.K;
import bH.S;
import bH.X;
import bH.aa;
import bH.p;
import bz.b;
import com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.IndicatorPainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.e;
import com.efiAnalytics.ui.a;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.ba;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.bq;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.ct;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.dR;
import com.efiAnalytics.ui.dn;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import d.d;
import d.e;
import d.g;
import i.a;
import i.c;
import i.j;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Point2D;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import r.a;
import r.b;
import r.i;
import r.j;
import r.m;
import r.o;
import r.p;
import s.g;
import t.aj;
import t.w;
import v.c;

public class x extends JComponent implements aF, aG, ac, bc {
  private Image aj = null;
  
  private Image ak = null;
  
  private Image al = null;
  
  Color a = new Color(0, 255, 0, 0);
  
  Vector b = new Vector();
  
  long c = System.currentTimeMillis();
  
  double d = 0.0D;
  
  float e = 1.0F;
  
  X f = null;
  
  W g = new W(this);
  
  Q h = new Q(this);
  
  private int am = eJ.a(7);
  
  private Window an = null;
  
  private Container ao = null;
  
  boolean i = false;
  
  private String ap = "";
  
  private Image aq = null;
  
  private String ar = null;
  
  private Dimension as = null;
  
  private boolean at = false;
  
  private T au = null;
  
  private boolean av = true;
  
  private boolean aw = false;
  
  ap j = null;
  
  private boolean ax = false;
  
  private boolean ay = false;
  
  R k = null;
  
  private boolean az = false;
  
  S l = null;
  
  private boolean aA = false;
  
  private Z aB = null;
  
  private Z aC = null;
  
  private String aD = null;
  
  private w aE = null;
  
  private ArrayList aF = new ArrayList();
  
  private boolean aG = true;
  
  private String aH = null;
  
  private String aI = null;
  
  private Color aJ = Color.gray;
  
  boolean m = i.a().a("sesrhsfghyuf754");
  
  public static final String n = g.b("Stretch");
  
  public static final String o = g.b("Tile");
  
  public static final String p = g.b("Center");
  
  private String aK = o;
  
  public static final String q = g.b("Bring Forward");
  
  public static final String r = g.b("Send Backward");
  
  public static final String s = g.b("Bring to Front");
  
  public static final String t = g.b("Send to Back");
  
  public static final String u = g.b("Gauge Properties");
  
  public static final String v = g.b("Add Gauge");
  
  public static final String w = g.b("Add Indicator");
  
  public static final String x = g.b("Add Label");
  
  public static final String y = g.b("Add Settings Panel");
  
  public static final String z = g.b("Add Tuning Table");
  
  public static final String A = g.b("Remove From Dash");
  
  public static final String B = g.b("Start Gauge Demo");
  
  public static final String C = g.b("Stop Gauge Demo");
  
  public static final String D = g.b("Set Background Color");
  
  public static final String E = g.b("Set Background Dither Color");
  
  public static final String F = g.b("Set Background Image");
  
  public static final String G = g.b("Clear Background Image");
  
  public static final String H = g.b("Export / Save As");
  
  public static final String I = g.b("Save Dashboard");
  
  public static final String J = g.b("Load Dashboard");
  
  public static final String K = g.b("Reload Default Gauges");
  
  public static final String L = g.b("Load a Saved Gauge");
  
  public static final String M = g.b("Save this Gauge");
  
  public static final String N = g.b("Designer Mode");
  
  public static final String O = g.b("Copy");
  
  public static final String P = g.b("Paste");
  
  public static final String Q = g.b("Paste Other");
  
  public static final String R = g.b("Paste Gauge Theme");
  
  public static final String S = g.b("Paste Gauge Size");
  
  public static final String T = g.b("Antialiasing Enabled");
  
  public static final String U = g.b("Group Selected Gauges");
  
  public static final String V = g.b("Un-Group Gauges");
  
  public static final String W = g.b("Show Grid");
  
  public static final String X = g.b("Force Aspect Ratio");
  
  private static String aL = "fullScreenIndex";
  
  public static final String Y = N;
  
  private static String aM = j.y() + File.separator + ".tempGauge";
  
  private boolean aN = false;
  
  private boolean aO = false;
  
  private boolean aP = false;
  
  private boolean aQ = true;
  
  private boolean aR = false;
  
  N Z = new N(this);
  
  private boolean aS = false;
  
  private boolean aT = true;
  
  private final ArrayList aU = new ArrayList();
  
  private final ArrayList aV = new ArrayList();
  
  private final ArrayList aW = new ArrayList();
  
  private final List aX = new ArrayList();
  
  private float aY = 0.32F;
  
  private float aZ = 24.0F;
  
  private boolean ba = false;
  
  private double bb = 16.0D;
  
  private double bc = 9.0D;
  
  long aa = -1L;
  
  public static int ab = 3500;
  
  private boolean bd = true;
  
  HashMap ac = new HashMap<>();
  
  List ad = new ArrayList();
  
  a ae = new y(this);
  
  j af = new F(this);
  
  int ag = eJ.a(2);
  
  Stroke ah = new BasicStroke(this.ag);
  
  static int ai = 0;
  
  public x(R paramR) {
    this();
    a(paramR);
  }
  
  public x() {
    setFocusable(true);
    if (A.i().b()) {
      setLayout(new Y());
      addMouseListener(this.h);
      addMouseMotionListener(this.h);
      setDoubleBuffered(true);
      setFocusable(true);
      this.aN = a.a().a(a.ck, "false").equals("true");
      this.aZ = a.a().a(a.aF, this.aZ);
      this.aY = a.a().a(a.aG, this.aY);
      this.f = new X(this);
      this.f.start();
    } 
    setDoubleBuffered(false);
    setOpaque(false);
  }
  
  public void a(R paramR) {
    if (this.k != null) {
      this.k.C().c(this);
      this.k.C().b(this);
    } 
    this.k = paramR;
    if (this.k != null) {
      paramR.C().a(this);
      paramR.C().a(this);
    } 
    if (i.a().a(" a09kmfds098432lkg89vlk")) {
      c.a().a(this.ae);
      c.a().a(this.af);
    } 
    if (paramR.C().q()) {
      ab();
    } else {
      k(g.b("Off Line"));
    } 
  }
  
  public void a(s params) {
    if (this.f != null && (this.k == null || this.ax || this.ay))
      this.f.c(); 
    if (!this.az)
      repaint(); 
  }
  
  public void b(s params) {
    if (this.f == null || !this.f.isAlive()) {
      this.f = new X(this);
      this.f.start();
    } 
    add(params);
    if (i.a().a("09BDPO;L,;l;ldpo;l5 ") && params instanceof d)
      params.addMouseListener(this.Z); 
    params.setGaugeContainer(this);
    if (isEnabled()) {
      if (params instanceof Gauge) {
        Gauge gauge = (Gauge)params;
        gauge.setValue(gauge.max());
      } 
      if (!(params instanceof t)) {
        params.addMouseListener(this.g);
        params.addMouseMotionListener(this.g);
        params.setFocusable(false);
      } else {
        params.setFocusable(true);
        params.enableInputMethods(true);
      } 
      if (this.bd)
        params.subscribeToOutput(); 
    } 
    params.setAntialiasingOn(M());
  }
  
  public void a() {
    for (s s : r())
      c(s); 
    this.ak = null;
    repaint();
  }
  
  public void c(s params) {
    params.removeMouseListener(this.g);
    params.removeMouseMotionListener(this.g);
    remove(params);
    if (params instanceof cq) {
      cu cu = cu.a();
      cu.a((cq)params);
    } 
  }
  
  public void removeAll() {
    Component[] arrayOfComponent = getComponents();
    int i = getComponentCount();
    for (byte b = 0; b < i; b++) {
      if (arrayOfComponent[b] instanceof s)
        c((s)arrayOfComponent[b]); 
    } 
    super.removeAll();
  }
  
  public void setBackground(Color paramColor) {
    super.setBackground(paramColor);
    this.aj = null;
    this.aq = null;
    if (getParent() != null)
      getParent().setBackground(paramColor); 
  }
  
  private boolean ah() {
    return (getComponentCount() > 0 && !(getComponent(0) instanceof HtmlDisplay));
  }
  
  private void ai() {
    for (aQ aQ : this.ad)
      aQ.a(); 
  }
  
  public void paint(Graphics paramGraphics) {
    long l1 = System.nanoTime();
    boolean bool = (D() && ah()) ? true : false;
    if (bool) {
      a(paramGraphics, D(), bool);
    } else {
      Image image = aC();
      if (image == null)
        return; 
      Graphics graphics = image.getGraphics();
      a(graphics, D(), bool);
      paramGraphics.drawImage(image, 0, 0, null);
    } 
    b(paramGraphics);
    if (L()) {
      String str = "Width: " + getWidth() + ", Height: " + getHeight();
      int i = getFontMetrics(paramGraphics.getFont()).stringWidth(str) + 8;
      int k = getWidth() - i - 10;
      int m = getFont().getSize();
      paramGraphics.setColor(Color.DARK_GRAY);
      paramGraphics.fillRect(k, 0, i, m);
      paramGraphics.setColor(Color.WHITE);
      paramGraphics.drawString(str, k + 4, m);
    } 
    a(paramGraphics);
    long l2 = System.nanoTime() - this.c;
    double d1 = (System.nanoTime() - l1) / 1000000.0D;
    double d2 = d1 * 1000000.0D / l2;
    if (getComponentCount() > 0) {
      if (getComponent(0) instanceof Gauge || getComponent(0) instanceof Indicator) {
        float f = (float)Math.round(1.0E9D / l2) * 5.0F;
        this.d = (f * this.d + 1.0E9D / l2) / (f + 1.0F);
        this.e = (f * this.e + (float)d2 * 100.0F) / (f + 1.0F);
      } 
      float f1 = this.at ? 0.12F : (s() ? 0.9F : this.aY);
      float f2 = s() ? 95.0F : this.aZ;
      if (c.a().b() > 5.0D && f2 > 1.05D / c.a().b())
        f2 = (float)(1.05D * c.a().b()); 
      if (d2 > f1 || this.d > (f2 + 5.0F)) {
        this.f.b();
      } else if (this.d <= f2) {
        this.f.a();
      } 
    } 
    if (this.aN) {
      paramGraphics.setFont(new Font("Arial Unicode MS", 1, eJ.a(13)));
      paramGraphics.setColor(Color.CYAN);
      paramGraphics.drawString(X.b(this.d, 1) + " fps, Core%: " + X.b(this.e, 1), 5, 15);
    } 
    this.c = System.nanoTime();
  }
  
  private void a(Graphics paramGraphics, boolean paramBoolean) {
    if ((paramBoolean || L()) && (this.aK.equals(p) || this.aq == null || this.ap == null || this.ap.equals(""))) {
      Color color = getBackground();
      if (this.aJ != null && this.m && this.aJ.getAlpha() > 0) {
        Point2D.Float float_1 = new Point2D.Float((getWidth() / 3), (getHeight() * 5 / 6));
        Point2D.Float float_2 = new Point2D.Float((getWidth() / 3), (getHeight() / 6));
        GradientPaint gradientPaint = new GradientPaint(float_1, color, float_2, this.aJ, true);
        ((Graphics2D)paramGraphics).setPaint(gradientPaint);
      } else {
        paramGraphics.setColor(getBackground());
      } 
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    } 
    if (this.ap != null && !this.ap.equals("") && this.aq == null)
      this.aq = Toolkit.getDefaultToolkit().getImage(this.ap); 
    if ((paramBoolean || L()) && this.aq != null && this.aq.getWidth(null) > 0)
      if (this.aK.equals(n)) {
        paramGraphics.drawImage(this.aq, 0, 0, getWidth(), getHeight(), null);
      } else if (this.aK.equals(p)) {
        if (getWidth() > this.aq.getWidth(null)) {
          paramGraphics.drawImage(this.aq, (getWidth() - this.aq.getWidth(null)) / 2, (getHeight() - this.aq.getHeight(null)) / 2, null);
        } else {
          double d = getWidth() / this.aq.getWidth(null);
          paramGraphics.drawImage(this.aq, 0, (getHeight() - (int)(this.aq.getHeight(null) * d)) / 2, (int)(this.aq.getWidth(null) * d), (int)(this.aq.getHeight(null) * d), null);
        } 
      } else if (this.aK.equals(o) && this.aq.getWidth(null) > 0) {
        int i = this.aq.getWidth(null);
        int k = this.aq.getHeight(null);
        for (byte b = 0; b * i < getWidth(); b++) {
          for (byte b1 = 0; b1 * k < getHeight(); b1++)
            paramGraphics.drawImage(this.aq, b * i, b1 * k, null); 
        } 
      } else {
        D.c("Shouldn't be here. backgroundImage.getWidth(null)=" + this.aq.getWidth(null) + "\n\tbackgroundImageStyle=" + this.aK + "\n");
      }  
    if (this.aQ && L()) {
      int i = eJ.a(10);
      Color color1 = getBackground();
      Color color2 = new Color(255 - color1.getRed(), 255 - color1.getGreen(), 255 - color1.getBlue(), 64);
      paramGraphics.setColor(color2);
      byte b;
      for (b = 1; b * i < getWidth(); b++)
        paramGraphics.drawLine(b * i, 0, b * i, getHeight()); 
      for (b = 1; b * i < getHeight(); b++)
        paramGraphics.drawLine(0, b * i, getWidth(), b * i); 
    } 
  }
  
  private void a(Graphics paramGraphics, boolean paramBoolean1, boolean paramBoolean2) {
    try {
      if (paramBoolean2) {
        Image image = aD();
        Graphics2D graphics2D1 = (Graphics2D)image.getGraphics();
        if (aj()) {
          Graphics2D graphics2D = (Graphics2D)paramGraphics;
          graphics2D1.setColor(this.a);
          graphics2D1.setComposite(AlphaComposite.getInstance(2));
          graphics2D1.fillRect(0, 0, image.getWidth(null), image.getHeight(null));
          graphics2D1.setComposite(AlphaComposite.getInstance(3));
          if (image.getWidth(null) < 0)
            System.out.print("break 214312"); 
          a(graphics2D1, true);
          c(graphics2D1);
          this.aT = false;
        } 
        Graphics2D graphics2D2 = (Graphics2D)paramGraphics;
        paramGraphics.drawImage(image, 0, 0, null);
        d(paramGraphics);
      } else {
        a(paramGraphics, paramBoolean1);
        b(paramGraphics, paramBoolean1);
      } 
    } catch (Exception exception) {
      D.c("Exception in GaugeCluster paint");
      exception.printStackTrace();
    } 
  }
  
  public void paintChildren(Graphics paramGraphics) {
    b(paramGraphics, !this.az);
    if (!this.az)
      super.paintChildren(paramGraphics); 
    ai();
  }
  
  private void a(Graphics paramGraphics) {
    if (this.h.a() != null) {
      Rectangle rectangle = this.h.a();
      paramGraphics.setColor(getBackground());
      paramGraphics.setXORMode(Color.YELLOW);
      int i = Math.abs(rectangle.width);
      int k = Math.abs(rectangle.height);
      int m = (rectangle.width < 0) ? (rectangle.x + rectangle.width) : rectangle.x;
      int n = (rectangle.height < 0) ? (rectangle.y + rectangle.height) : rectangle.y;
      BasicStroke basicStroke = new BasicStroke(eJ.a(1), 0, 2, 0.0F, new float[] { 2.0F, 1.0F }, 0.0F);
      ((Graphics2D)paramGraphics).setStroke(basicStroke);
      paramGraphics.drawRect(m, n, i, k);
    } 
  }
  
  private void b(Graphics paramGraphics) {
    String str1;
    String str2;
    if (L())
      return; 
    boolean bool = false;
    if (this.k != null && !this.k.C().q() && (this.aa > System.currentTimeMillis() || m.a().b())) {
      str1 = null;
      str2 = g.b("Log Playback");
      bool = true;
    } else {
      str1 = aa();
      str2 = this.aI;
    } 
    if (((str1 == null || str1.equals("")) && (str2 == null || str2.equals(""))) || (getComponentCount() > 0 && this.ax))
      return; 
    if (this.al == null || this.al.getWidth(null) != getWidth() || this.al.getHeight(null) != getHeight()) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.al = graphicsConfiguration.createCompatibleImage(getWidth(), getHeight(), 3);
      Graphics2D graphics2D = (Graphics2D)this.al.getGraphics();
      graphics2D.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_SPEED);
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      if (str1 != null && !str1.equals("")) {
        Color color = new Color(64, 64, 64, 160);
        graphics2D.setColor(color);
        graphics2D.fillRect(0, 0, getWidth(), getHeight());
      } 
      graphics2D.setColor(new Color(210, 210, 210, 239));
      int i = bool ? eJ.a(16) : eJ.a(28);
      Font font = null;
      FontMetrics fontMetrics = null;
      if (str1 == null || str1.equals(""))
        str1 = str2; 
      String[] arrayOfString = str1.split("\n");
      while (true) {
        font = new Font("Times", 1, i);
        graphics2D.setFont(font);
        fontMetrics = getFontMetrics(font);
        if (fontMetrics.stringWidth(arrayOfString[0]) <= getWidth() - 4 && --i != 0) {
          int k = i / 2;
          int m = bool ? 2 : (getHeight() / 12);
          int n = fontMetrics.stringWidth(arrayOfString[0]) + k;
          Font font1 = new Font(font.getFamily(), 0, (int)(font.getSize() * 0.6D));
          if (arrayOfString.length > 1)
            for (byte b1 = 1; b1 < arrayOfString.length; b1++) {
              int i3 = getFontMetrics(font1).stringWidth(arrayOfString[b1]) + k;
              if (i3 > n)
                n = i3; 
            }  
          int i1 = (getWidth() - n + k) / 2;
          int i2 = (int)((fontMetrics.getHeight() + k / 2) + fontMetrics.getHeight() * 0.6D * (arrayOfString.length - 0.5D));
          graphics2D.fillRect(i1 - k / 2, m, n, i2);
          graphics2D.setColor(new Color(16, 16, 32));
          for (byte b = 0; b < arrayOfString.length; b++) {
            if (b == 1)
              graphics2D.setFont(font1); 
            i1 = (getWidth() - graphics2D.getFontMetrics().stringWidth(arrayOfString[b])) / 2;
            graphics2D.drawString(arrayOfString[b], i1, m + fontMetrics.getHeight());
            m += graphics2D.getFontMetrics().getHeight();
          } 
        } else {
          continue;
        } 
        paramGraphics.drawImage(this.al, 0, 0, null);
        return;
      } 
    } 
    paramGraphics.drawImage(this.al, 0, 0, null);
  }
  
  public boolean a(String paramString, bT parambT) {
    if (a.A().E().c().equals(paramString)) {
      this.d = 6.0D;
      ab();
      S s = this.l;
      if (s != null)
        S.a(s); 
      this.az = true;
    } 
    return true;
  }
  
  public void a(String paramString) {
    if (a.A().E() != null && a.A().E().c().equals(paramString)) {
      b();
      this.az = false;
    } 
    R r = T.a().c(paramString);
    if (r != null && !r.C().O()) {
      k(g.b("Connected to Dash Echo server that is Off Line"));
    } else {
      k(g.b("Off Line"));
    } 
  }
  
  public void b() {
    if (a.a().a(a.P, a.Q) && c.a().d())
      return; 
    this.ax = false;
    s[] arrayOfS = j();
    if (!B()) {
      this.ay = false;
      for (s s : arrayOfS) {
        if (s instanceof Gauge) {
          Gauge gauge = (Gauge)s;
          if (gauge.min() < 0.0D && gauge.max() > 0.0D) {
            gauge.setValue(0.0D);
          } else {
            gauge.setValue(gauge.min());
          } 
          gauge.invalidate();
        } else if (s instanceof Indicator) {
          Indicator indicator = (Indicator)s;
          if (indicator.getEcuConfigurationName() != null && !indicator.getEcuConfigurationName().equals(cu.a))
            indicator.setValue(0.0D); 
          indicator.setRunDemo(false);
        } 
      } 
    } else {
      for (s s : arrayOfS) {
        if (s instanceof Gauge) {
          Gauge gauge = (Gauge)s;
          gauge.invalidate();
        } else if (s instanceof Indicator) {
          Indicator indicator = (Indicator)s;
          if (indicator.getEcuConfigurationName() != null && !indicator.getEcuConfigurationName().equals(cu.a)) {
            indicator.goDead();
          } else if (indicator.isRunDemo()) {
            indicator.setRunDemo(false);
          } 
        } 
      } 
      this.ay = true;
      if (this.l != null)
        this.l.b = true; 
      this.l = new S(this);
      this.l.a = false;
      this.l.start();
    } 
  }
  
  public void update(Graphics paramGraphics) {
    D.c("Update Called");
    paint(paramGraphics);
  }
  
  private boolean a(Component paramComponent, int paramInt) {
    Component[] arrayOfComponent = getComponents();
    for (int i = paramInt; i < arrayOfComponent.length; i++) {
      if (!arrayOfComponent[i].equals(paramComponent) && a(arrayOfComponent[i], paramComponent))
        return true; 
    } 
    return false;
  }
  
  private boolean a(Component paramComponent1, Component paramComponent2) {
    int i = paramComponent1.getX();
    int k = paramComponent1.getY();
    int m = paramComponent1.getWidth();
    int n = paramComponent1.getHeight();
    Rectangle rectangle1 = new Rectangle(i, k, m, n);
    i = paramComponent2.getX();
    k = paramComponent2.getY();
    m = paramComponent2.getWidth();
    n = paramComponent2.getHeight();
    Rectangle rectangle2 = new Rectangle(i, k, m, n);
    return (rectangle1.intersects(rectangle2) && !paramComponent2.equals(paramComponent1));
  }
  
  private void b(Graphics paramGraphics, boolean paramBoolean) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof s) {
        s s = (s)arrayOfComponent[b];
        if (!D() && s.isMustPaint()) {
          e(true);
          D.c("Deactivated fast paint " + getName());
        } 
        if (s.isDirty() || paramBoolean || L() || s.isRunDemo() || s.requiresBackgroundRepaint()) {
          Graphics graphics = paramGraphics.create(s.getX(), s.getY(), s.getWidth(), s.getHeight());
          Area area = f(s);
          graphics.setClip(area);
          s.paint(graphics);
          graphics.dispose();
          s.setDirty(false);
        } 
        if (this.aF.contains(s))
          a(paramGraphics, s); 
      } 
    } 
  }
  
  private boolean aj() {
    if (this.aT)
      return true; 
    Component[] arrayOfComponent = getComponents();
    if (arrayOfComponent.length == 0)
      return true; 
    boolean bool = false;
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof s) {
        s s = (s)arrayOfComponent[b];
        if (!bool && s.requiresBackgroundRepaint()) {
          bool = true;
          break;
        } 
      } 
    } 
    return bool;
  }
  
  private void c(Graphics paramGraphics) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof s) {
        s s = (s)arrayOfComponent[b];
        Graphics graphics = paramGraphics.create(s.getX(), s.getY(), s.getWidth(), s.getHeight());
        s.paintBackground(graphics);
        graphics.dispose();
        s.validate();
      } 
    } 
  }
  
  private void d(Graphics paramGraphics) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof s) {
        s s = (s)arrayOfComponent[b];
        if (s.getWidth() > 0 && s.getHeight() > 0) {
          Graphics2D graphics2D = (Graphics2D)paramGraphics.create(s.getX(), s.getY(), s.getWidth(), s.getHeight());
          Area area = f(s);
          graphics2D.setClip(area);
          s.updateGauge(graphics2D);
          graphics2D.dispose();
          s.setDirty(false);
        } 
        if (this.aF.contains(s))
          a(paramGraphics, s); 
      } 
    } 
    ai();
  }
  
  private Area f(s params) {
    Area area = (Area)this.ac.get(params);
    if (area == null || L()) {
      area = new Area(new Rectangle(0, 0, params.getWidth(), params.getHeight()));
      boolean bool = false;
      for (s s1 : j()) {
        if (bool) {
          Area area1 = s1.areaPainted();
          int i = s1.getX() - params.getX();
          int k = s1.getY() - params.getY();
          AffineTransform affineTransform = new AffineTransform();
          affineTransform.translate(i, k);
          area1.transform(affineTransform);
          area.subtract(area1);
        } else if (s1.equals(params)) {
          bool = true;
        } 
      } 
      this.ac.put(params, area);
    } 
    return area;
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.ac.clear();
  }
  
  public void c() {
    for (Component component : getComponents()) {
      if (component instanceof bc)
        ((bc)component).close(); 
    } 
    removeAll();
    String str = a.a().a(a.aX, G);
    i(str);
    j(p);
    this.aq = eJ.a(this.aq);
    this.ar = "";
    if (this.k != null) {
      this.k.C().c(this);
      this.k.C().b(this);
    } 
    if (this.f != null) {
      X.a(this.f);
      this.f = null;
    } 
    e(false);
    c.a().b(this.ae);
    c.a().b(this.af);
  }
  
  private void a(Graphics paramGraphics, s params) {
    if (!L())
      return; 
    int i = params.getX();
    int k = params.getY();
    int m = params.getWidth();
    int n = params.getHeight();
    int i1 = this.am - this.ag / 2;
    if (m > 0 && n > 0) {
      if (M()) {
        Graphics2D graphics2D = (Graphics2D)paramGraphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.setStroke(this.ah);
      } 
      paramGraphics.setFont(getFont());
      Color color = Color.yellow;
      paramGraphics.setColor(color);
      paramGraphics.drawLine(i + i1, k + i1, i + m - i1, k + n - i1);
      paramGraphics.drawLine(i + i1, k + n - i1, i + m - i1, k + i1);
      paramGraphics.fillRect(i, k, this.am, this.am);
      paramGraphics.fillRect(i, k + n - this.am, this.am, this.am);
      paramGraphics.fillRect(i + m - this.am, k, this.am, this.am);
      paramGraphics.setColor(Color.red);
      paramGraphics.fillRect(i + m - this.am, k + n - this.am, this.am, this.am);
      String str = "X: " + i + ", Y:" + k + ", Width: " + m + ", Height: " + n;
      paramGraphics.setColor(Color.DARK_GRAY);
      paramGraphics.fillRect(i + 10, k, paramGraphics.getFontMetrics().stringWidth(str) + 10, paramGraphics.getFont().getSize() + 2);
      paramGraphics.setColor(Color.WHITE);
      paramGraphics.drawString(str, i + eJ.a(15), k + paramGraphics.getFont().getSize() - 1);
    } 
  }
  
  public void a(Component paramComponent, int paramInt1, int paramInt2) {
    boolean bool = a.a().a(a.da, a.db);
    if (bool)
      return; 
    boolean bool1 = false;
    if (!bool1) {
      JPopupMenu jPopupMenu = d();
      add(jPopupMenu);
      if (paramComponent != null) {
        jPopupMenu.show(paramComponent, paramInt1, paramInt2);
      } else {
        jPopupMenu.show(this, paramInt1, paramInt2);
      } 
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.aT = paramBoolean;
  }
  
  public JPopupMenu d() {
    br br = new br();
    a((bq)br);
    return (JPopupMenu)br;
  }
  
  public bq a(bq parambq) {
    V v = new V(this);
    JMenu jMenu1 = null;
    if (i.a().a("43wunjt58j7tjtht")) {
      JMenu jMenu = new JMenu(g.b("Load / Save"));
      parambq.add(jMenu);
      jMenu.add(J).addActionListener(v);
      jMenu.add(I).addActionListener(v);
      jMenu.add(H).addActionListener(v);
      if (L()) {
        jMenu.addSeparator();
        jMenu.add(L).addActionListener(v);
        JMenuItem jMenuItem1 = parambq.add(O);
        jMenuItem1.addActionListener(v);
        if (this.aF.size() > 0) {
          jMenu.add(M).addActionListener(v);
        } else {
          jMenuItem1.setEnabled(false);
        } 
        File file = new File(aM);
        JMenuItem jMenuItem2 = parambq.add(P);
        jMenuItem2.setEnabled(file.exists());
        jMenuItem2.addActionListener(v);
        if (r().size() > 0) {
          JMenu jMenu4 = new JMenu(Q);
          parambq.add(jMenu4);
          jMenuItem2 = jMenu4.add(R);
          jMenuItem2.setEnabled(file.exists());
          jMenuItem2.addActionListener(v);
          jMenuItem2 = jMenu4.add(S);
          jMenuItem2.setEnabled(file.exists());
          jMenuItem2.addActionListener(v);
        } 
      } 
    } else {
      parambq.add(K).addActionListener(v);
    } 
    if (L()) {
      JMenu jMenu;
      byte b = 0;
      if (r().size() > 0) {
        w w1 = O();
        O().b(r());
        w1.setText(g.b("Dashboard Designer"));
      } else {
        jMenu = new JMenu(g.b("Dashboard Designer"));
      } 
      jMenu1 = new JMenu(g.b("New"));
      jMenu1.add(v).addActionListener(v);
      jMenu1.add(w).addActionListener(v);
      jMenu1.add(x).addActionListener(v);
      if (i.a().a("LKMFSLKFDSLK;LKM09")) {
        jMenu1.add(y).addActionListener(v);
        jMenu1.add(z).addActionListener(v);
      } 
      jMenu.insert(jMenu1, b++);
      if (this.aF.size() > 0) {
        JMenuItem jMenuItem = new JMenuItem(A);
        jMenuItem.addActionListener(v);
        jMenu.insert(jMenuItem, b++);
      } 
      if (am()) {
        parambq.addSeparator();
        if (this.aF.size() > 1) {
          JMenuItem jMenuItem = new JMenuItem(U);
          jMenuItem.addActionListener(v);
          jMenu.insert(jMenuItem, b++);
          if (this.aF.get(0) instanceof Gauge) {
            Gauge gauge = this.aF.get(0);
            if (gauge.getGroupId() != 0) {
              jMenuItem = new JMenuItem(V);
              jMenuItem.addActionListener(v);
              jMenu.insert(jMenuItem, b++);
            } 
          } 
        } 
        GaugePainter[] arrayOfGaugePainter = e.a();
        jMenu1 = new JMenu(g.b("Gauge Style"));
        if (arrayOfGaugePainter != null)
          for (byte b1 = 0; b1 < arrayOfGaugePainter.length; b1++) {
            GaugePainter gaugePainter = arrayOfGaugePainter[b1];
            JMenuItem jMenuItem = new JMenuItem(g.b(gaugePainter.getName()));
            jMenuItem.setActionCommand(gaugePainter.getClass().getName());
            jMenuItem.addActionListener(new G(this));
            jMenu1.add(jMenuItem);
          }  
        jMenu.insert(jMenu1, b++);
      } 
      if (al()) {
        parambq.addSeparator();
        IndicatorPainter[] arrayOfIndicatorPainter = e.b();
        jMenu1 = new JMenu(g.b("Indicator Style"));
        for (byte b1 = 0; b1 < arrayOfIndicatorPainter.length; b1++) {
          IndicatorPainter indicatorPainter = arrayOfIndicatorPainter[b1];
          JMenuItem jMenuItem = new JMenuItem(indicatorPainter.getName());
          jMenuItem.setActionCommand(indicatorPainter.getClass().getName());
          jMenuItem.addActionListener(new H(this));
          jMenu1.add(jMenuItem);
        } 
        jMenu.insert(jMenu1, b++);
      } 
      if (r().size() > 0) {
        jMenu1 = new JMenu(g.b("Order"));
        jMenu1.add(q).addActionListener(v);
        jMenu1.add(r).addActionListener(v);
        jMenu1.add(s).addActionListener(v);
        jMenu1.add(t).addActionListener(v);
        jMenu.insert(jMenu1, b++);
      } 
      jMenu.insertSeparator(b++);
      JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(W);
      jCheckBoxMenuItem1.setState(this.aQ);
      jCheckBoxMenuItem1.addActionListener(new I(this));
      jMenu.add(jCheckBoxMenuItem1);
      jCheckBoxMenuItem1 = new JCheckBoxMenuItem(X);
      jCheckBoxMenuItem1.setState(this.ba);
      x x1 = this;
      jCheckBoxMenuItem1.addActionListener(new J(this, x1));
      jMenu.add(jCheckBoxMenuItem1);
      parambq.add(jMenu);
    } 
    if (am()) {
      if (i.a().a("43wunjt58j7tjtht"))
        parambq.addSeparator(); 
      jMenu1 = new JMenu(a.b + " " + g.b("Gauges"));
      parambq.add(jMenu1);
      ArrayList arrayList = new ArrayList();
      Iterator iterator = c.a().b();
      while (iterator.hasNext())
        arrayList.add(iterator.next()); 
      List list = S.a(arrayList);
      O o = new O(this, cu.a);
      HashMap<Object, Object> hashMap = new HashMap<>();
      for (ah ah : list) {
        String str = "";
        try {
          str = g.b(ah.k().a());
        } catch (g g) {
          Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        } 
        JMenuItem jMenuItem = new JMenuItem(str + " - " + ah.aL());
        jMenuItem.setActionCommand(ah.aL());
        jMenuItem.addActionListener(o);
        if (ah.p() == null || ah.p().equals("")) {
          jMenu1.add(jMenuItem);
          continue;
        } 
        if (hashMap.containsKey(ah.p())) {
          ((ArrayList<JMenuItem>)hashMap.get(ah.p())).add(jMenuItem);
          continue;
        } 
        ArrayList<JMenuItem> arrayList1 = new ArrayList();
        arrayList1.add(jMenuItem);
        hashMap.put(ah.p(), arrayList1);
      } 
      for (String str : hashMap.keySet()) {
        jMenu1 = new JMenu(g.b(str));
        parambq.add(jMenu1);
        for (JMenuItem jMenuItem : hashMap.get(str))
          jMenu1.add(jMenuItem); 
      } 
      byte b1 = 0;
      int i = (Toolkit.getDefaultToolkit().getScreenSize()).height;
      JMenu jMenu = null;
      T t = T.a();
      String[] arrayOfString = t.d();
      for (byte b2 = 0; b2 < arrayOfString.length; b2++) {
        R r = t.c(arrayOfString[b2]);
        if (r.S()) {
          o = new O(this, arrayOfString[b2]);
          if (r != null && r.B() != null) {
            byte b3 = 0;
            byte b4 = 25;
            ArrayList<ah> arrayList1 = new ArrayList();
            Iterator<ah> iterator1 = r.B();
            while (iterator1.hasNext()) {
              ah ah = iterator1.next();
              boolean bool = true;
              try {
                bool = p.a(ah.aJ(), r);
              } catch (g g) {
                Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
              } 
              if (bool)
                arrayList1.add(ah); 
            } 
            List list1 = S.a(arrayList1);
            iterator1 = null;
            String str = null;
            for (ah ah : list1) {
              if (b3++ % b4 == 0 || !X.a(ah.p(), str)) {
                if (!X.a(ah.p(), str)) {
                  b3 = 1;
                  str = ah.p();
                } 
                String str2 = (ah.p() == null) ? (g.b("Gauge Templates") + " ") : g.b(ah.p());
                String str3 = (b3 > b4) ? ((b3 / b4 + 1) + "") : "";
                if (arrayOfString.length == 1) {
                  jMenu1 = new JMenu(str2 + " " + str3);
                } else {
                  jMenu1 = new JMenu(str2 + " " + str3 + " (" + r.c() + ")");
                } 
                if (i < 1024 && b1++ > 12) {
                  if (jMenu == null) {
                    jMenu = new JMenu(g.b("More Gauges"));
                    parambq.add(jMenu);
                  } 
                  jMenu.add(jMenu1);
                } else {
                  parambq.add(jMenu1);
                } 
              } 
              String str1 = "";
              try {
                str1 = g.b(ah.k().a());
              } catch (g g) {
                Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
              } 
              JMenuItem jMenuItem = new JMenuItem(str1 + " - " + ah.aL());
              jMenuItem.setActionCommand(ah.aL());
              jMenuItem.addActionListener(o);
              jMenu1.add(jMenuItem);
            } 
          } 
          parambq.addSeparator();
        } 
      } 
    } 
    if (al()) {
      parambq.addSeparator();
      jMenu1 = new JMenu(g.b("Application Indicators"));
      parambq.add(jMenu1);
      ArrayList arrayList = new ArrayList();
      Iterator iterator = d.a().c();
      while (iterator.hasNext())
        arrayList.add(iterator.next()); 
      List list = S.a(arrayList);
      P p = new P(this, cu.a);
      for (ak ak : list) {
        JMenuItem jMenuItem = new JMenuItem(g.b("On") + ": " + ak.b() + " - " + g.b("Off") + ": " + ak.e());
        jMenuItem.setActionCommand(ak.aL());
        jMenuItem.addActionListener(p);
        jMenu1.add(jMenuItem);
      } 
      T t = T.a();
      String[] arrayOfString = t.d();
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString.length > 1) {
          jMenu1 = new JMenu(g.b("Predefined Indicators") + " (" + arrayOfString[b] + ")");
        } else {
          jMenu1 = new JMenu(g.b("Predefined Indicators"));
        } 
        parambq.add(jMenu1);
        R r = t.c(arrayOfString[b]);
        p = new P(this, arrayOfString[b]);
        if (r != null && r.A() != null) {
          byte b1 = 1;
          byte b2 = 25;
          list = new ArrayList();
          Iterator<ak> iterator1 = r.A();
          while (iterator1.hasNext())
            list.add(iterator1.next()); 
          list = S.a(list);
          iterator1 = list.iterator();
          while (iterator1.hasNext()) {
            if (b1++ % b2 == 0) {
              jMenu1 = new JMenu(g.b("Predefined Indicators") + " " + (b1 / b2 + 1));
              parambq.add(jMenu1);
            } 
            ak ak = iterator1.next();
            JMenuItem jMenuItem = new JMenuItem(g.b("On") + ": " + g.b(ak.b()) + " - " + g.b("Off") + ": " + g.b(ak.e()));
            jMenuItem.setActionCommand(ak.aL());
            jMenuItem.addActionListener(p);
            jMenu1.add(jMenuItem);
          } 
        } 
      } 
      parambq.addSeparator();
    } 
    if (al() || am()) {
      JMenuItem jMenuItem = new JMenuItem(g.b("Reset Value"));
      jMenuItem.addActionListener(new K(this));
      parambq.add(jMenuItem);
    } 
    JMenu jMenu2 = new JMenu(g.b("Background"));
    parambq.add(jMenu2);
    jMenu2.add(D).addActionListener(v);
    jMenu2.add(E).addActionListener(v);
    jMenu2.add(F).addActionListener(v);
    JMenu jMenu3 = new JMenu(g.b("Image Position"));
    L l = new L(this);
    jMenu3.add(n).addActionListener(l);
    jMenu3.add(o).addActionListener(l);
    jMenu3.add(p).addActionListener(l);
    jMenu2.add(jMenu3);
    if (this.aq != null)
      jMenu2.add(G).addActionListener(v); 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(T);
    a((dR)new ba(jCheckBoxMenuItem, "antiAliasingOn"));
    jCheckBoxMenuItem.setState(M());
    jCheckBoxMenuItem.addActionListener(new M(this));
    parambq.add(jCheckBoxMenuItem);
    if (af())
      if (J.b() || !bV.h() || s()) {
        JMenuItem jMenuItem = new JMenuItem(g.b("Full Screen"));
        jMenuItem.setSelected(s());
        jMenuItem.addActionListener(new z(this));
        parambq.add(jMenuItem);
      } else {
        JMenu jMenu = new JMenu(g.b("Full Screen"));
        jMenu.setSelected(s());
        jMenu.addActionListener(new A(this));
        String[] arrayOfString = dn.a();
        for (byte b = 0; b < arrayOfString.length; b++) {
          JMenuItem jMenuItem = new JMenuItem(g.b("Full Screen on ") + arrayOfString[b]);
          jMenuItem.setActionCommand(b + "");
          jMenu.add(jMenuItem);
          jMenuItem.addActionListener(new B(this));
        } 
        parambq.add(jMenu);
      }  
    if (!a.a().b(a.cQ, a.cR)) {
      jCheckBoxMenuItem = new JCheckBoxMenuItem(N);
      jCheckBoxMenuItem.setState(L());
      jCheckBoxMenuItem.addActionListener(new C(this));
      parambq.add(jCheckBoxMenuItem);
      if (!i.a().a("sesrhsfghyuf754"))
        jCheckBoxMenuItem.setEnabled(false); 
    } 
    jMenu1 = new JMenu(g.b("Gauge Demo"));
    jMenu1.add(B).addActionListener(v);
    jMenu1.add(C).addActionListener(v);
    parambq.add(jMenu1);
    return parambq;
  }
  
  private void ak() {
    for (s s : this.aF) {
      if (s instanceof SingleChannelDashComponent) {
        SingleChannelDashComponent singleChannelDashComponent = (SingleChannelDashComponent)s;
        String str1 = singleChannelDashComponent.getOutputChannel();
        String str2 = singleChannelDashComponent.getEcuConfigurationName();
        try {
          i.a(str2, str1);
        } catch (g g) {
          Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        } 
      } 
    } 
  }
  
  private boolean al() {
    Iterator iterator = this.aF.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() instanceof Indicator)
        return true; 
    } 
    return false;
  }
  
  private boolean am() {
    Iterator iterator = this.aF.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() instanceof Gauge)
        return true; 
    } 
    return false;
  }
  
  public void b(boolean paramBoolean) {
    Component component = null;
    for (byte b = 0; b < getComponentCount(); b++) {
      component = getComponent(b);
      if (component instanceof s) {
        s s = (s)component;
        s.setRunDemo(paramBoolean);
      } 
      if (component instanceof Gauge && paramBoolean) {
        Gauge gauge = (Gauge)component;
        gauge.setValue(gauge.min());
      } 
    } 
    if (paramBoolean && !this.ax) {
      this.ax = paramBoolean;
      if (this.ax) {
        if (this.l != null)
          S.a(this.l); 
        this.ay = false;
        this.l = new S(this);
        this.l.start();
      } 
    } else if (!paramBoolean) {
      this.ax = false;
      b();
    } 
  }
  
  public void e() {
    Component component = null;
    for (byte b = 0; b < getComponentCount(); b++) {
      component = getComponent(b);
      if (!(component instanceof Gauge) && component instanceof Indicator) {
        Indicator indicator = (Indicator)component;
        indicator.setOffText(g.b(indicator.getOffText().toString()));
        indicator.setOnText(g.b(indicator.getOnText().toString()));
      } 
    } 
  }
  
  public void f() {
    Component component = null;
    for (byte b = 0; b < getComponentCount(); b++) {
      component = getComponent(b);
      if (!(component instanceof Gauge) && component instanceof Indicator);
    } 
  }
  
  public Component g() {
    return (this.aF.size() > 0) ? this.aF.get(0) : null;
  }
  
  public void b(String paramString) {
    if (paramString.equals(v)) {
      m();
    } else if (paramString.equals(w)) {
      p();
    } else if (paramString.equals(x)) {
      q();
    } else if (paramString.equals(y)) {
      n();
    } else if (paramString.equals(z)) {
      o();
    } else if (paramString.equals(D)) {
      ay();
    } else if (paramString.equals(E)) {
      az();
    } else if (paramString.equals(F)) {
      aA();
    } else if (paramString.equals(H)) {
      at();
    } else if (paramString.equals(I)) {
      h();
    } else if (paramString.equals(J)) {
      k();
    } else if (paramString.equals(L)) {
      ax();
    } else if (paramString.equals(G)) {
      l();
    } else if (paramString.equals(B)) {
      b(true);
    } else if (paramString.equals(C)) {
      b(false);
    } else if (paramString.equals(O)) {
      ap();
    } else if (paramString.equals(P)) {
      aq();
    } else if (paramString.equals(R)) {
      as();
    } else if (paramString.equals(S)) {
      ar();
    } else if (paramString.equals(K)) {
      aF();
    } 
    Component component = g();
    if (component == null) {
      repaint();
      return;
    } 
    if (paramString.equals(q)) {
      a(component);
    } else if (paramString.equals(r)) {
      b(component);
    } else if (paramString.equals(s)) {
      d(component);
    } else if (paramString.equals(t)) {
      c(component);
    } else if (paramString.equals(U)) {
      ao();
    } else if (paramString.equals(V)) {
      an();
    } else if (component instanceof s) {
      if (paramString.equals(A)) {
        a();
      } else if (paramString.equals(M)) {
        a(r());
      } else if (component instanceof Gauge) {
        Gauge gauge = (Gauge)component;
        if (paramString.equals(u))
          d(gauge); 
      } 
    } 
    this.ak = null;
    repaint();
  }
  
  private void an() {
    for (s s : this.aF) {
      if (s instanceof Gauge)
        ((Gauge)s).setGroupId(0); 
    } 
  }
  
  private void ao() {
    int i = (int)(Math.random() * 2.147483647E9D);
    for (s s : this.aF) {
      if (s instanceof Gauge)
        ((Gauge)s).setGroupId(i); 
    } 
  }
  
  private void ap() {
    a(r(), aM);
  }
  
  private void aq() {
    try {
      a(aM, 0.06D, 0.06D);
    } catch (a a1) {
      D.d("no valid DashboardComponent");
    } 
  }
  
  private void ar() {
    try {
      File file = new File(aM);
      ArrayList<s> arrayList = (new c(j.G())).b(file.getAbsolutePath());
      if (arrayList.isEmpty()) {
        bV.d("No Component Copied", this);
        return;
      } 
      s s = arrayList.get(0);
      for (s s1 : r()) {
        s1.setRelativeHeight(s.getRelativeHeight());
        s1.setRelativeWidth(s.getRelativeWidth());
      } 
      doLayout();
      a(true);
      repaint();
    } catch (a a1) {
      D.d("no valid DashboardComponent");
    } 
  }
  
  private void as() {
    try {
      File file = new File(aM);
      Gauge gauge = aa.a(file);
      if (gauge != null) {
        for (s s : r()) {
          if (s instanceof Gauge) {
            Gauge gauge1 = (Gauge)s;
            aa.a(gauge, gauge1);
          } 
        } 
      } else {
        bV.d(g.b("You must copy a Gauge before applying the Theme."), this);
      } 
    } catch (a a1) {
      D.d("no valid DashboardComponent");
    } 
  }
  
  private void at() {
    String[] arrayOfString = { a.co };
    String str = (ad() == null) ? ("*." + a.co) : ad();
    str = bV.a(this, g.b("Save Dashboard Layout"), arrayOfString, "*." + a.co, j.j().getAbsolutePath(), false);
    if (str == null)
      return; 
    if (!str.toLowerCase().endsWith("." + a.co))
      str = str + "." + a.co; 
    d(str);
    j.e(new File(str));
  }
  
  public void c(String paramString) {
    if (ad() != null) {
      a(ad(), paramString);
      this.aG = true;
    } else {
      at();
    } 
  }
  
  public void h() {
    if (ad() != null) {
      a(ad(), (String)null);
      this.aG = true;
    } else {
      at();
    } 
  }
  
  public void d(String paramString) {
    a(paramString, (String)null);
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString1 == null || paramString1.trim().equals(""))
      return; 
    aa aa = new aa();
    aa.a();
    c c = new c(j.G());
    try {
      boolean bool = this.ax;
      b(false);
      if (bool)
        try {
          Thread.sleep(100L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        }  
      Z z = i();
      if (paramString2 != null)
        z.b(paramString2); 
      synchronized (this) {
        c.a(paramString1, z);
      } 
      D.c("Time to save dashboard: " + aa.d() + "ms. file: " + paramString1);
    } catch (a a1) {
      bV.d("Error saving Dashboard.\n" + a1.getMessage() + "\nCheck Log for more details", this);
    } 
  }
  
  private void a(ArrayList paramArrayList) {
    String[] arrayOfString = { a.cq };
    a a1 = a.A();
    if (a1 == null)
      bV.d("There is no project open.\nPlease open a project first.", this); 
    String str = bV.a(this, "Save Gauge", arrayOfString, "*." + a.cq, j.j().getAbsolutePath(), false);
    if (str == null)
      return; 
    if (!str.toLowerCase().endsWith("." + a.cq))
      str = str + "." + a.cq; 
    j.e((new File(str)).getParentFile());
    a(paramArrayList, str);
  }
  
  private void a(ArrayList paramArrayList, String paramString) {
    c c = new c(j.G());
    try {
      c.a(paramString, paramArrayList);
    } catch (a a1) {
      bV.d("Error saving Gauge.\n" + a1.getMessage() + "\nCheck Log for more details", this);
    } 
  }
  
  public Z i() {
    b(false);
    Z z = new Z();
    z.a(getBackground());
    String str = J();
    if (str != null && !str.equals(""))
      str = j.c(str); 
    z.a(str);
    z.c(K());
    z.b(C());
    z.b(au());
    z.b(this.ba);
    z.b(I());
    z.a(H());
    Component[] arrayOfComponent = getComponents();
    z.a(arrayOfComponent);
    z.a(this.aP);
    return z;
  }
  
  public s[] j() {
    ArrayList<Component> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < getComponentCount(); b1++) {
      if (getComponent(b1) instanceof s)
        arrayList.add(getComponent(b1)); 
    } 
    s[] arrayOfS = new s[arrayList.size()];
    for (byte b2 = 0; b2 < arrayList.size(); b2++)
      arrayOfS[b2] = (s)arrayList.get(b2); 
    return arrayOfS;
  }
  
  private String au() {
    try {
      return this.k.i();
    } catch (Exception exception) {
      D.b("Could not get Firmware signature");
      return null;
    } 
  }
  
  public boolean e(String paramString) {
    if (!this.aG) {
      String str = null;
      if (getName() == null || getName().equals("") || !a.a().c().getLanguage().equals(g.c().getLanguage())) {
        str = g.b("This Project's dashboard layout has been modified.") + "\n" + g.b("Would you like to save the changes to this project?");
      } else {
        str = "The dashboard layout for " + getName() + " has been modified.\nWould you like to save the changes to this project?";
      } 
      int i = JOptionPane.showConfirmDialog(this, str, g.b("Save Dashboard?"), 1, 3);
      if (i == 2)
        return false; 
      if (i == 0) {
        f();
        if (paramString != null && !paramString.equals("")) {
          d(paramString);
        } else {
          h();
        } 
        return true;
      } 
      if (i == 1)
        return true; 
    } 
    return true;
  }
  
  protected void k() {
    a((a)null);
  }
  
  public void a(a parama) {
    b b = new b();
    aa aa = new aa();
    String[] arrayOfString1 = T.a().d();
    String str = this.k.c();
    String[] arrayOfString2 = new String[arrayOfString1.length];
    if (this.aB != null)
      b.a(g.b("Default"), this.aB); 
    for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
      R r1 = T.a().c(arrayOfString1[b1]);
      if (r1.S()) {
        Z z = b(r1);
        if (this.aB == null) {
          if (ag() != null) {
            b.a(ag());
          } else {
            b.a();
          } 
          if (!str.equals(r1.c()))
            z.d(r1.c()); 
          b.a(r1.c(), z);
        } 
      } 
      arrayOfString2[b1] = r1.i();
    } 
    o o = p.a().b();
    b.a(arrayOfString2, o);
    R r = new R(this, b, arrayOfString2);
    Window window1 = bV.b(this);
    Window window2 = window1;
    if (!(window2 instanceof java.awt.Dialog) && !(window2 instanceof java.awt.Frame))
      window2 = null; 
    ct ct = new ct(window2, (JComponent)b, "Select Dashboard", r, 7);
    if (parama != null)
      ct.a(parama); 
    bV.a(window1, (Component)ct);
    ct.setVisible(true);
  }
  
  public void f(String paramString) {
    c c = new c(j.G());
    Z z = null;
    try {
      z = c.a(paramString);
    } catch (Exception exception) {
      exception.printStackTrace();
      bV.d("Error Loading Dashboard file.\n" + paramString + "\nloading default gauge cluster.", this);
      z = (new aa()).a(this.k, "FrontPage", 1);
      c.a(paramString, z);
    } 
    String str = this.k.i();
    o o = p.a().b();
    if (!i.a().a("GD;';'RE;'GD;'DG") && str != null && !o.a(str, z.d()) && !aa.a(this.k, z)) {
      boolean bool = bV.a("Warning: Gauge Cluster firmware signature '" + z.d() + "'\ndoes not match current firmware '" + str + "'.\nYou may need to reset gauge output channels.\n \nContinue Loading?", this, true);
      if (!bool) {
        k();
        this.ar = paramString;
        h();
        return;
      } 
      k(false);
    } else {
      this.aG = true;
    } 
    this.ar = paramString;
    a(z);
    validate();
  }
  
  public void a(Z paramZ) {
    if (i.a().a("0rewporewo430932")) {
      T t = T.a();
      R r = t.c();
      if (r != null)
        (new aa()).b(r, paramZ); 
    } 
    g(false);
    g(paramZ.h());
    a(paramZ.i());
    b(paramZ.j());
    if (getParent() != null)
      getParent().doLayout(); 
    Component[] arrayOfComponent1 = getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent1.length; b1++) {
      if (arrayOfComponent1[b1] instanceof s)
        c((s)arrayOfComponent1[b1]); 
    } 
    Component[] arrayOfComponent2 = paramZ.c();
    j(paramZ.f());
    String str = "";
    byte b2 = 0;
    for (byte b3 = 0; b3 < arrayOfComponent2.length; b3++) {
      try {
        if (arrayOfComponent2[b3] != null) {
          b((s)arrayOfComponent2[b3]);
        } else {
          D.b("A null gauge was tried to be added?\nThis is wierd.");
        } 
      } catch (a a1) {
        if (b2++ < 5)
          str = str + a1.getMessage() + "\n"; 
      } 
    } 
    setBackground(paramZ.a());
    i(paramZ.b());
    j(paramZ.e());
    a(paramZ.g());
    b();
    invalidate();
    validate();
    this.ak = null;
    repaint();
    if (!str.equals(""))
      str = str + "\n\n" + g.b("To correct this:") + "\n" + g.b("- right click on any Gauge or indicator with a red line through it.") + "\n" + g.b("- Select a valid Gauge or Indicator Template from the menu."); 
    e();
    av();
  }
  
  private void av() {
    e(aw());
    D.c("High Speed Paint: " + (!D() ? 1 : 0));
  }
  
  private boolean aw() {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (a(arrayOfComponent[b], b))
        return true; 
    } 
    return false;
  }
  
  public boolean imageUpdate(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 == 32) {
      this.aj = null;
      aC().getGraphics();
      return true;
    } 
    return super.imageUpdate(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  private void ax() {
    String[] arrayOfString = { a.cq };
    String str = bV.a(this, g.b("Open Gauge Layout"), arrayOfString, "*." + a.co, j.h().getAbsolutePath(), true);
    if (str == null)
      return; 
    try {
      o(str);
    } catch (a a1) {
      bV.d("Error loading Gauge.\n" + a1.getMessage() + "\nCheck Log for more details", this);
    } 
  }
  
  private void o(String paramString) {
    a(paramString, 0.0D, 0.0D);
  }
  
  private void a(String paramString, double paramDouble1, double paramDouble2) {
    c c = new c(j.G());
    ArrayList<s> arrayList = null;
    arrayList = c.b(paramString);
    try {
      for (byte b = 0; b < arrayList.size(); b++) {
        if (paramDouble1 != 0.0D && ((s)arrayList.get(b)).getRelativeX() + paramDouble1 < 0.97D) {
          ((s)arrayList.get(b)).setRelativeX(((s)arrayList.get(b)).getRelativeX() + paramDouble1);
        } else if (paramDouble1 != 0.0D) {
          ((s)arrayList.get(b)).setRelativeX(((s)arrayList.get(b)).getRelativeX() - paramDouble1);
        } 
        if (paramDouble2 != 0.0D && ((s)arrayList.get(b)).getRelativeY() + paramDouble2 < 0.97D) {
          ((s)arrayList.get(b)).setRelativeY(((s)arrayList.get(b)).getRelativeY() + paramDouble2);
        } else if (paramDouble2 != 0.0D) {
          ((s)arrayList.get(b)).setRelativeY(((s)arrayList.get(b)).getRelativeY() - paramDouble2);
        } 
        if (arrayList.get(b) instanceof Gauge) {
          Gauge gauge = (Gauge)arrayList.get(b);
          if (gauge.getGroupId() > 0)
            gauge.setGroupId(gauge.getGroupId() + 1); 
        } 
        b(arrayList.get(b));
        ((s)arrayList.get(b)).goDead();
      } 
    } catch (a a1) {
      bV.d(a1.getMessage(), this);
    } 
    this.aF.clear();
    for (s s : arrayList)
      this.aF.add(s); 
    aG();
    repaint();
    validate();
  }
  
  private void ay() {
    Color color = bV.a(this, g.b("Choose Background Color"), getBackground());
    setBackground(color);
    k(false);
  }
  
  private void az() {
    Color color = bV.a(this, g.b("Choose Background Dither Color"), C());
    a(color);
    k(false);
    this.aj = null;
  }
  
  public void l() {
    this.aq = null;
    this.ap = null;
    this.aj = null;
    repaint();
    k(false);
  }
  
  private void aA() {
    String str = "Select Indicator Off Image";
    aj aj = new aj(bV.b(this), j.G(), str);
    bV.a(this, (Component)aj);
    aj.a(new D(this));
    aj.setVisible(true);
  }
  
  public void d(s params) {
    if (params instanceof Gauge) {
      ad ad = new ad((Gauge)params);
      ad.a(this);
    } 
  }
  
  public void m() {
    String str = g.b("Add Gauges");
    ArrayList<File> arrayList = new ArrayList();
    arrayList.add(j.j());
    arrayList.add(j.h());
    g g = new g(bV.a(this), arrayList, str);
    g.a((et)new dQ((a.a()).an, str));
    w.a(g, this);
    g.a(new E(this));
    g.setVisible(true);
  }
  
  public void n() {
    if (i.a().a("LKMFSLKFDSLK;LKM09")) {
      DashTuningPanel dashTuningPanel = new DashTuningPanel();
      try {
        b(dashTuningPanel);
        a(dashTuningPanel, true);
      } catch (a a1) {}
      validate();
    } 
  }
  
  public void o() {
    if (i.a().a("LKMFSLKFDSLK;LKM09")) {
      SelectableTableComponent selectableTableComponent = new SelectableTableComponent();
      try {
        b(selectableTableComponent);
        a(selectableTableComponent, true);
      } catch (a a1) {}
      validate();
    } 
  }
  
  public void p() {
    Indicator indicator = new Indicator();
    try {
      b(indicator);
      a(indicator, true);
    } catch (a a1) {}
    validate();
  }
  
  public void q() {
    DashLabel dashLabel = new DashLabel();
    try {
      b(dashLabel);
      a(dashLabel, true);
    } catch (a a1) {}
    validate();
  }
  
  public void a(Component paramComponent) {
    int i = getComponentZOrder(paramComponent);
    if (i >= 0 && i < getComponentCount() - 1)
      add(paramComponent, i + 1); 
  }
  
  public void b(Component paramComponent) {
    int i = getComponentZOrder(paramComponent);
    if (i > 0 && i < getComponentCount() - 1)
      add(paramComponent, i - 1); 
  }
  
  public void c(Component paramComponent) {
    add(paramComponent, 0);
  }
  
  public void d(Component paramComponent) {
    add(paramComponent, getComponentCount() - 1);
  }
  
  public ArrayList r() {
    return this.aF;
  }
  
  public void a(Indicator paramIndicator, String paramString1, String paramString2) {
    ak ak = null;
    if (paramString2.equals(cu.a)) {
      ak = d.a().c(paramString1);
    } else {
      T t = T.a();
      R r = null;
      if (paramString2 == null || paramString2.length() == 0) {
        r = t.c();
      } else {
        r = t.c(paramString2);
      } 
      ak = r.n(paramString1);
    } 
    paramIndicator.setEcuConfigurationName(paramString2);
    paramIndicator.setOutputChannel(ak.f());
    paramIndicator.setOnText(ak.a().toString());
    paramIndicator.setOffText(ak.d().toString());
    paramIndicator.setShortClickAction(ak.l());
    paramIndicator.setLongClickAction(ak.m());
    try {
      paramIndicator.subscribeToOutput();
    } catch (a a1) {
      bV.d(a1.getMessage(), this);
    } 
    paramIndicator.setDirty(true);
    paramIndicator.repaint();
    this.aG = false;
  }
  
  private List a(Gauge paramGauge) {
    int i = paramGauge.getGroupId();
    ArrayList<Gauge> arrayList = new ArrayList();
    if (i == Gauge.Q) {
      arrayList.add(paramGauge);
      return arrayList;
    } 
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof Gauge) {
        Gauge gauge = (Gauge)getComponent(b);
        if (gauge.getGroupId() == i && !arrayList.contains(gauge))
          arrayList.add(gauge); 
      } 
    } 
    return arrayList;
  }
  
  public void a(Gauge paramGauge, String paramString1, String paramString2) {
    T t = T.a();
    R r = null;
    if (paramString2 == null || paramString2.length() == 0) {
      r = t.c();
    } else {
      r = t.c(paramString2);
    } 
    ah ah = null;
    if (paramString2.equals(cu.a)) {
      ah = c.a().a(paramString1);
    } else {
      ah = r.k(paramString1);
    } 
    if (ah == null) {
      D.c("Gauge:" + paramString1 + " not found in current configuration.");
      return;
    } 
    for (Gauge gauge : a(paramGauge)) {
      if (!gauge.title().isEmpty())
        gauge.setTitle(ah.k().toString()); 
      gauge.setEcuConfigurationName(paramString2);
      gauge.setUnits(ah.j().toString());
      gauge.setMinVP(ah.b());
      gauge.setMaxVP(ah.e());
      if (gauge.isGoingDead())
        gauge.setValue(ah.d()); 
      gauge.setShortClickAction(ah.r());
      gauge.setLongClickAction(ah.s());
      if (gauge.getValue() > ah.d() || gauge.getValue() < ah.a()) {
        gauge.setValue(ah.a());
        gauge.invalidate();
      } 
      gauge.setLowWarningVP(ah.f());
      gauge.setLowCriticalVP(ah.o());
      gauge.setHighWarningVP(ah.g());
      gauge.setHighCriticalVP(ah.h());
      gauge.setOutputChannel(ah.i());
      gauge.setValueDigitsVP(ah.m());
      gauge.setLabelDigits(ah.n());
      try {
        gauge.subscribeToOutput();
      } catch (a a1) {
        bV.d(a1.getMessage(), this);
      } 
      gauge.invalidate();
      gauge.repaint();
    } 
    this.aG = false;
    a(paramGauge, paramString1);
  }
  
  private void a(s params, String paramString) {
    byte b = -1;
    for (byte b1 = 0; b1 < getComponentCount(); b1++) {
      if (getComponent(b1).equals(params)) {
        b = b1;
        break;
      } 
    } 
    boolean bool = A();
    Iterator<aG> iterator = this.aW.iterator();
    while (iterator.hasNext())
      ((aG)iterator.next()).a(b, paramString, bool); 
  }
  
  private void aB() {
    Iterator<aG> iterator = this.aW.iterator();
    while (iterator.hasNext())
      ((aG)iterator.next()).a(); 
  }
  
  public void a(aG paramaG) {
    this.aW.add(paramaG);
  }
  
  public void g(String paramString) {
    for (s s : r()) {
      if (s instanceof Gauge)
        try {
          GaugePainter gaugePainter = (GaugePainter)Class.forName(paramString).newInstance();
          ((Gauge)s).setGaugePainter(gaugePainter);
          Gauge gauge = (Gauge)s;
          gauge.setBackgroundImageFileName((String)null);
          gauge.setNeedleImageFileName((String)null);
        } catch (Exception exception) {
          bV.d("Error loading Gauge Painter: " + paramString, this);
          break;
        }  
    } 
  }
  
  public void h(String paramString) {
    for (s s : r()) {
      if (s instanceof Indicator)
        try {
          IndicatorPainter indicatorPainter = (IndicatorPainter)Class.forName(paramString).newInstance();
          ((Indicator)s).setPainter(indicatorPainter);
          s.repaint();
        } catch (Exception exception) {
          bV.d("Error loading Indicator Painter: " + paramString, this);
        }  
    } 
  }
  
  private Image aC() {
    if (this.aj == null || this.aj.getWidth(null) != getWidth() || this.aj.getHeight(null) != getHeight()) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.aj = graphicsConfiguration.createCompatibleImage(getWidth(), getHeight(), 3);
      Graphics2D graphics2D = (Graphics2D)this.aj.getGraphics();
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      a(this.aj.getGraphics(), true, false);
    } 
    return this.aj;
  }
  
  private Image aD() {
    if (this.ak == null || this.ak.getWidth(null) != getWidth() || this.ak.getHeight(null) != getHeight()) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.ak = graphicsConfiguration.createCompatibleImage(getWidth(), getHeight(), 3);
      Graphics2D graphics2D = (Graphics2D)this.ak.getGraphics();
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      a(graphics2D, true);
      c(graphics2D);
    } 
    return this.ak;
  }
  
  public boolean s() {
    return (this.an != null || this.aR);
  }
  
  public void t() {
    if (aE())
      if (this.an == null) {
        D.c("FullScreen");
        y();
      } else {
        D.c("End FullScreen");
        u();
      }  
  }
  
  public void a(u paramu) {
    this.aX.add(paramu);
  }
  
  public void b(u paramu) {
    this.aX.remove(paramu);
  }
  
  private boolean aE() {
    for (u u : this.aX) {
      if (!u.a())
        return false; 
    } 
    return true;
  }
  
  public void u() {
    if (this.ao != null && this.an != null) {
      this.ao.add(this);
      doLayout();
      this.ao.validate();
      if (J.c());
      this.an.dispose();
      this.an = null;
      this.i = false;
      if (this.aj != null)
        this.aj.flush(); 
    } 
  }
  
  public Window v() {
    if (this.ao != null && this.an != null) {
      this.ao.add(this);
      doLayout();
      this.ao.validate();
      try {
        return this.an;
      } finally {
        this.an = null;
        this.i = false;
        if (this.aj != null)
          this.aj.flush(); 
      } 
    } 
    return null;
  }
  
  public void w() {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof s) {
        s s = (s)arrayOfComponent[b];
        this.aF.add(s);
      } 
    } 
    repaint();
  }
  
  public void a(Rectangle paramRectangle) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof s) {
        s s = (s)arrayOfComponent[b];
        Rectangle rectangle = s.getBounds();
        if (rectangle.x > paramRectangle.x && rectangle.y > paramRectangle.y && rectangle.x + rectangle.width < paramRectangle.x + paramRectangle.width && rectangle.y + rectangle.height < paramRectangle.y + paramRectangle.height && !this.aF.contains(s))
          this.aF.add(s); 
      } 
    } 
    aG();
  }
  
  public boolean e(s params) {
    return this.aF.contains(params);
  }
  
  public int x() {
    String str = c(aL, "-1");
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException numberFormatException) {
      return -1;
    } 
  }
  
  public void y() {
    a(x());
  }
  
  public void a(Window paramWindow) {
    if (this.aO) {
      if (s())
        u(); 
      this.ao = getParent();
      this.an = paramWindow;
      JPanel jPanel = new JPanel();
      jPanel.setDoubleBuffered(true);
      jPanel.setLayout((LayoutManager)new b());
      jPanel.setBackground(getBackground());
      jPanel.add(this);
      this.an.add("Center", jPanel);
      this.an.validate();
      this.an.doLayout();
      this.aj = null;
      repaint();
      validate();
      requestFocus();
      this.ao.repaint();
    } 
  }
  
  public void a(int paramInt) {
    if (this.aO && !s()) {
      GraphicsDevice graphicsDevice;
      Rectangle rectangle;
      this.ao = getParent();
      JDialog jDialog = new JDialog(bV.a(this));
      jDialog.setUndecorated(true);
      this.an = jDialog;
      this.an.setLayout(new BorderLayout());
      if (J.b() || paramInt < 0) {
        graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        Point point = MouseInfo.getPointerInfo().getLocation();
        rectangle = dn.a(point.x, point.y);
      } else {
        graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[paramInt];
        rectangle = dn.a(paramInt);
      } 
      this.an.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
      JPanel jPanel = new JPanel();
      jPanel.setDoubleBuffered(true);
      jPanel.setLayout((LayoutManager)new b());
      jPanel.setBackground(getBackground());
      jPanel.add(this);
      this.an.add("Center", jPanel);
      if (J.c()) {
        K.a(this.an);
        K.b(this.an);
      } else if (!J.a() && graphicsDevice.isFullScreenSupported()) {
        graphicsDevice.setFullScreenWindow(this.an);
      } 
      this.an.setVisible(true);
      this.an.validate();
      this.ao.repaint();
      b(aL, "" + paramInt);
    } 
  }
  
  private void b(String paramString1, String paramString2) {
    if (this.j != null)
      this.j.a(paramString1, paramString2); 
  }
  
  private String c(String paramString1, String paramString2) {
    return (this.j != null) ? this.j.b(paramString1, paramString2) : paramString2;
  }
  
  public s a(int paramInt1, int paramInt2) {
    for (s s : r()) {
      int k = s.getX() + s.getWidth() - this.am;
      int m = s.getY() + s.getHeight() - this.am;
      int n = s.getX() + s.getWidth();
      int i1 = s.getY() + s.getHeight();
      if (paramInt1 >= k && paramInt1 <= n && paramInt2 >= m && paramInt2 <= i1)
        return s; 
    } 
    Component[] arrayOfComponent = getComponents();
    for (int i = getComponentCount() - 1; i >= 0; i--) {
      if (arrayOfComponent[i] instanceof s) {
        s s = (s)arrayOfComponent[i];
        int k = s.getX();
        int m = s.getY();
        int n = s.getX() + s.getWidth();
        int i1 = s.getY() + s.getHeight();
        if (s instanceof aR) {
          aR aR = (aR)s;
          if (paramInt1 >= k && paramInt1 <= n && paramInt2 >= m && paramInt2 <= i1 && aR.isComponentPaintedAt(paramInt1 - k, paramInt2 - m))
            return s; 
        } else if (paramInt1 >= k && paramInt1 <= n && paramInt2 >= m && paramInt2 <= i1) {
          return s;
        } 
      } 
    } 
    return null;
  }
  
  public Dimension getPreferredSize() {
    return (this.as != null) ? this.as : super.getPreferredSize();
  }
  
  public Dimension getMinimumSize() {
    return (this.as != null) ? this.as : super.getMinimumSize();
  }
  
  public void a(dR paramdR) {
    this.aU.add(paramdR);
  }
  
  private void d(String paramString1, String paramString2) {
    Iterator<dR> iterator = this.aU.iterator();
    while (iterator.hasNext()) {
      try {
        dR dR = iterator.next();
        dR.a(paramString1, paramString2);
      } catch (Exception exception) {
        D.b("Problem encountered while notifying PropertyChangedListener. Ignored and continued.");
        exception.printStackTrace();
      } 
    } 
  }
  
  public boolean z() {
    return this.av;
  }
  
  public void c(boolean paramBoolean) {
    this.av = paramBoolean;
  }
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    if (paramString.equals(this.k.c()) && this.f != null)
      this.f.c(); 
  }
  
  public void close() {
    D.c("Closing Dashboard " + getName());
    c();
  }
  
  public boolean A() {
    return this.aS;
  }
  
  public void d(boolean paramBoolean) {
    this.aS = paramBoolean;
  }
  
  public boolean B() {
    return a.a().c(a.bo, true);
  }
  
  public Color C() {
    return this.aJ;
  }
  
  public void a(Color paramColor) {
    this.aJ = paramColor;
  }
  
  public void repaint(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.repaint(paramLong, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void repaint() {
    super.repaint();
  }
  
  public boolean D() {
    return (this.aw || getComponentCount() == 0);
  }
  
  public void e(boolean paramBoolean) {
    this.aw = paramBoolean;
  }
  
  private void aF() {
    Z z = b(this.k);
    a(z);
    Iterator<aG> iterator = this.aW.iterator();
    while (iterator.hasNext())
      ((aG)iterator.next()).a(); 
  }
  
  public void E() {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof s)
        c((s)arrayOfComponent[b]); 
    } 
    i((String)null);
    a((Image)null);
  }
  
  public void a(ap paramap) {
    this.j = paramap;
  }
  
  public boolean F() {
    return this.aA;
  }
  
  public void f(boolean paramBoolean) {
    this.az = paramBoolean;
  }
  
  public boolean G() {
    return this.ba;
  }
  
  public void g(boolean paramBoolean) {
    this.ba = paramBoolean;
  }
  
  public double H() {
    return this.bb;
  }
  
  public void a(double paramDouble) {
    this.bb = paramDouble;
  }
  
  public double I() {
    return this.bc;
  }
  
  public void b(double paramDouble) {
    this.bc = paramDouble;
  }
  
  public synchronized void h(boolean paramBoolean) {
    if (this.bd ^ paramBoolean)
      if (paramBoolean) {
        for (Component component : getComponents()) {
          if (component instanceof s) {
            s s = (s)component;
            try {
              s.subscribeToOutput();
            } catch (a a1) {}
          } 
        } 
      } else {
        for (Component component : getComponents()) {
          if (component instanceof s) {
            s s = (s)component;
            try {
              s.unsubscribeToOutput();
            } catch (a a1) {
              D.b("Failed to subscribe DashComponent: " + a1.getLocalizedMessage());
            } 
          } 
        } 
      }  
    this.bd = paramBoolean;
  }
  
  public String J() {
    return (this.ap == null) ? "" : this.ap;
  }
  
  public void a(Image paramImage) {
    this.aq = paramImage;
  }
  
  public void i(String paramString) {
    this.ap = paramString;
    this.aq = null;
    this.aj = null;
  }
  
  public String K() {
    return this.aK;
  }
  
  public void j(String paramString) {
    if (paramString != null && (paramString.equals(p) || paramString.equals(o) || paramString.equals(n))) {
      this.aK = paramString;
      this.aj = null;
    } 
  }
  
  public void setMinimumSize(Dimension paramDimension) {
    this.as = paramDimension;
  }
  
  public boolean L() {
    return this.at;
  }
  
  public void i(boolean paramBoolean) {
    if (paramBoolean)
      this.aG = false; 
    this.at = paramBoolean;
    this.aj = null;
    this.ak = null;
    repaint();
    d(Y, "" + paramBoolean);
  }
  
  public boolean M() {
    return this.aP;
  }
  
  public void N() {
    this.aF.clear();
    aG();
  }
  
  public void a(s params, boolean paramBoolean) {
    if (paramBoolean)
      this.aF.clear(); 
    if (this.aF.contains(params) && !paramBoolean) {
      this.aF.remove(params);
    } else {
      if (!this.aF.contains(params))
        this.aF.add(params); 
      if (params instanceof Gauge) {
        Gauge gauge = (Gauge)params;
        if (gauge.getGroupId() != Gauge.Q)
          b(gauge.getGroupId()); 
      } 
    } 
    aG();
  }
  
  private void b(int paramInt) {
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof Gauge) {
        Gauge gauge = (Gauge)getComponent(b);
        if (gauge.getGroupId() == paramInt && gauge.getGroupId() != Gauge.Q && !this.aF.contains(gauge))
          this.aF.add(gauge); 
      } 
    } 
  }
  
  public void j(boolean paramBoolean) {
    this.aP = paramBoolean;
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof s) {
        s s = (s)getComponent(b);
        s.setAntialiasingOn(paramBoolean);
      } 
    } 
    this.aj = null;
    repaint();
    d("antiAliasingOn", "" + paramBoolean);
  }
  
  public w O() {
    if (this.aE == null) {
      this.aE = new w();
      a((f)this.aE);
    } 
    return this.aE;
  }
  
  public void P() {
    for (s s : r()) {
      s.setLocation((s.getLocation()).x + 1, (s.getLocation()).y);
      s.updateRelativeBoundsToCurrent();
    } 
    a(true);
  }
  
  public void Q() {
    for (s s : r()) {
      s.setLocation((s.getLocation()).x - 1, (s.getLocation()).y);
      s.updateRelativeBoundsToCurrent();
    } 
    a(true);
  }
  
  public void R() {
    for (s s : r()) {
      s.setLocation((s.getLocation()).x, (s.getLocation()).y - 1);
      s.updateRelativeBoundsToCurrent();
    } 
    a(true);
  }
  
  public void S() {
    for (s s : r()) {
      s.setLocation((s.getLocation()).x, (s.getLocation()).y + 1);
      s.updateRelativeBoundsToCurrent();
    } 
    a(true);
  }
  
  public void T() {
    for (s s : this.aF) {
      s.setSize(s.getWidth() + 1, s.getHeight());
      s.updateRelativeBoundsToCurrent();
      s.validate();
    } 
    a(true);
  }
  
  public void U() {
    for (s s : this.aF) {
      s.setSize(s.getWidth() - 1, s.getHeight());
      s.updateRelativeBoundsToCurrent();
      s.validate();
    } 
  }
  
  public void V() {
    for (s s : this.aF) {
      s.setSize(s.getWidth(), s.getHeight() + 1);
      s.updateRelativeBoundsToCurrent();
      s.validate();
    } 
  }
  
  public void W() {
    for (s s : this.aF) {
      s.setSize(s.getWidth(), s.getHeight() - 1);
      s.updateRelativeBoundsToCurrent();
      s.validate();
    } 
  }
  
  public T X() {
    if (this.au == null)
      this.au = new T(this, this); 
    return this.au;
  }
  
  public void Y() {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof s) {
        if (g() == null) {
          a((s)arrayOfComponent[b], true);
          repaint();
          return;
        } 
        if (r().contains(arrayOfComponent[b])) {
          if (arrayOfComponent.length > b + 1 && arrayOfComponent[b + 1] instanceof s) {
            a((s)arrayOfComponent[b + 1], true);
            repaint();
            return;
          } 
          if (arrayOfComponent[0] instanceof s) {
            a((s)arrayOfComponent[0], true);
            repaint();
            return;
          } 
        } 
      } 
    } 
  }
  
  public void Z() {
    Component[] arrayOfComponent = getComponents();
    for (int i = arrayOfComponent.length - 1; i >= 0; i--) {
      if (arrayOfComponent[i] instanceof s) {
        if (g() == null) {
          a((s)arrayOfComponent[i], true);
          repaint();
          return;
        } 
        if (r().contains(arrayOfComponent[i])) {
          if (i > 0 && arrayOfComponent[i - 1] instanceof s) {
            a((s)arrayOfComponent[i - 1], true);
            repaint();
            return;
          } 
          if (arrayOfComponent[arrayOfComponent.length - 1] instanceof s) {
            a((s)arrayOfComponent[arrayOfComponent.length - 1], true);
            repaint();
            return;
          } 
        } 
      } 
    } 
  }
  
  public void a(f paramf) {
    this.aV.add(paramf);
  }
  
  private void aG() {
    for (f f : this.aV)
      f.a(r()); 
  }
  
  public String aa() {
    return this.aH;
  }
  
  public void k(String paramString) {
    if (!F())
      a(paramString, false); 
  }
  
  public void a(String paramString, boolean paramBoolean) {
    this.aH = paramString;
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof s) {
        s s = (s)getComponent(b);
        s.setDirty(true);
      } 
    } 
    this.aj = null;
    this.al = null;
    repaint();
    if (paramString != null && paramString.length() > 0) {
      c(!paramBoolean);
    } else {
      c(true);
    } 
  }
  
  public void ab() {
    k((String)null);
  }
  
  public void l(String paramString) {
    this.aI = paramString;
    this.aj = null;
    this.al = null;
    repaint();
  }
  
  public void ac() {
    l((String)null);
  }
  
  public String ad() {
    return this.ar;
  }
  
  public void m(String paramString) {
    this.ar = paramString;
  }
  
  public boolean ae() {
    return this.aG;
  }
  
  public void k(boolean paramBoolean) {
    this.aG = paramBoolean;
  }
  
  public boolean af() {
    return (this.aO && i.a().a("d67nhtrbd4es8j"));
  }
  
  public void l(boolean paramBoolean) {
    this.aO = paramBoolean;
  }
  
  public Z b(R paramR) {
    if (this.aB != null)
      return this.aB; 
    aa aa = new aa();
    try {
      this.aC = aa.a(paramR, "FrontPage", 1);
    } catch (a a1) {
      Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      this.aC = aa.a(paramR, "FrontPage", 2, 4);
    } 
    return this.aC;
  }
  
  public void b(Z paramZ) {
    this.aB = paramZ;
  }
  
  public String ag() {
    return this.aD;
  }
  
  public void n(String paramString) {
    this.aD = paramString;
  }
  
  private boolean a(d paramd) {
    if (paramd.getShortClickAction() != null && !paramd.getShortClickAction().isEmpty())
      try {
        g.a().c(paramd.getShortClickAction());
        return true;
      } catch (e e) {
        bV.d(e.getLocalizedMessage(), this.ao);
        D.a("Unable to fire Action: " + e.getLocalizedMessage());
      }  
    return false;
  }
  
  private void b(d paramd) {
    if (paramd.getLongClickAction() != null && !paramd.getLongClickAction().isEmpty())
      try {
        g.a().c(paramd.getLongClickAction());
      } catch (e e) {
        bV.d(e.getLocalizedMessage(), this.ao);
        Logger.getLogger(x.class.getName()).log(Level.SEVERE, "Unable to fire Action", (Throwable)e);
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */