package com.efiAnalytics.apps.ts.dashboard;

import C.ExceptionInVPackage;
import G.AeInterfaceMikeTostring;
import G.Exceptionprintstacktrace;
import G.GComponentCq;
import G.GInterfaceAf;
import G.GInterfaceAg;
import G.GInterfaceAh;
import G.ManagerUsingArrayList;
import G.R;
import G.RInterfaceIndia;
import G.T;
import I.ArrayListInIPackage;
import I.IInterfaceDelta;
import IInterfaceDelta.ExceptionPrintstacktrace;
import IInterfaceDelta.IInterfaceDelta;
import IInterfaceDelta.e;
import K.ArrayListInIPackage;
import RInterfaceIndia.ArrayListInIPackage;
import RInterfaceIndia.ExceptionInVPackage;
import RInterfaceIndia.IComponentJuliet;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import W.WInterfaceAp;
import aE.ExceptionInVPackage;
import bH.A;
import bH.D;
import bH.J;
import bH.K;
import bH.RInterfacePapa;
import bH.S;
import bH.X;
import bH.aa;
import bz.ManagerPreferredlayoutsize;
import com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.IndicatorPainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.e;
import com.efiAnalytics.ui.ExceptionInVPackage;
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
import r.ExceptionInVPackage;
import r.IComponentJuliet;
import r.ManagerPreferredlayoutsize;
import r.RComponentMike;
import r.RInterfaceIndia;
import r.RInterfaceOscar;
import r.RInterfacePapa;
import s.ExceptionPrintstacktrace;
import t.ThreadedInTPackage;
import t.w;
import v.ArrayListInIPackage;

public class x extends JComponent implements GInterfaceAf, GInterfaceAg, ac, bc {
  private Image ThreadedInTPackage = null;

  private Image Exceptionprintstacktrace = null;

  private Image al = null;

  Color ExceptionInVPackage = new Color(0, 255, 0, 0);

  Vector ManagerPreferredlayoutsize = new Vector();

  long ArrayListInIPackage = System.currentTimeMillis();

  double IInterfaceDelta = 0.0D;

  float e = 1.0F;

  X f = null;

  W ExceptionPrintstacktrace = new W(this);

  Q h = new Q(this);

  private int am = eJ.ExceptionInVPackage(7);

  private Window an = null;

  private Container ao = null;

  boolean RInterfaceIndia = false;

  private String WInterfaceAp = "";

  private Image aq = null;

  private String ar = null;

  private Dimension as = null;

  private boolean at = false;

  private T au = null;

  private boolean av = true;

  private boolean aw = false;

  WInterfaceAp IComponentJuliet = null;

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

  private ArrayList GInterfaceAf = new ArrayList();

  private boolean GInterfaceAg = true;

  private String aH = null;

  private String aI = null;

  private Color aJ = Color.gray;

  boolean RComponentMike =
      RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("sesrhsfghyuf754");

  public static final String n = ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Stretch");

  public static final String RInterfaceOscar =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Tile");

  public static final String RInterfacePapa =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Center");

  private String aK = RInterfaceOscar;

  public static final String q =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Bring Forward");

  public static final String r =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Send Backward");

  public static final String s =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Bring to Front");

  public static final String t =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Send to Back");

  public static final String u =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Gauge Properties");

  public static final String v = ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Add Gauge");

  public static final String w =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Add Indicator");

  public static final String x = ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Add Label");

  public static final String y =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Add Settings Panel");

  public static final String z =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Add Tuning Table");

  public static final String A =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Remove From Dash");

  public static final String B =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Start Gauge Demo");

  public static final String C =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Stop Gauge Demo");

  public static final String D =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Set Background Color");

  public static final String E =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Set Background Dither Color");

  public static final String F =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Set Background Image");

  public static final String G =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Clear Background Image");

  public static final String H =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Export / Save As");

  public static final String I =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Save Dashboard");

  public static final String J =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Load Dashboard");

  public static final String K =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Reload Default Gauges");

  public static final String L =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Load ExceptionInVPackage Saved Gauge");

  public static final String M =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Save this Gauge");

  public static final String N =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Designer Mode");

  public static final String O = ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Copy");

  public static final String P = ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Paste");

  public static final String Q = ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Paste Other");

  public static final String R =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Paste Gauge Theme");

  public static final String S =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Paste Gauge Size");

  public static final String T =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Antialiasing Enabled");

  public static final String U =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Group Selected Gauges");

  public static final String V =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Un-Group Gauges");

  public static final String W = ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Show Grid");

  public static final String X =
      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Force Aspect Ratio");

  private static String aL = "fullScreenIndex";

  public static final String Y = N;

  private static String aM = IComponentJuliet.y() + File.separator + ".tempGauge";

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

  ExceptionInVPackage ae = new y(this);

  IComponentJuliet af = new F(this);

  int ag = eJ.ExceptionInVPackage(2);

  Stroke GInterfaceAh = new BasicStroke(this.ag);

  static int ai = 0;

  public x(R paramR) {
    this();
    ExceptionInVPackage(paramR);
  }

  public x() {
    setFocusable(true);
    if (A.RInterfaceIndia().ManagerPreferredlayoutsize()) {
      setLayout(new Y());
      addMouseListener(this.h);
      addMouseMotionListener(this.h);
      setDoubleBuffered(true);
      setFocusable(true);
      this.aN =
          ExceptionInVPackage.ExceptionInVPackage()
              .ExceptionInVPackage(ExceptionInVPackage.ck, "false")
              .equals("true");
      this.aZ =
          ExceptionInVPackage.ExceptionInVPackage()
              .ExceptionInVPackage(ExceptionInVPackage.GInterfaceAf, this.aZ);
      this.aY =
          ExceptionInVPackage.ExceptionInVPackage()
              .ExceptionInVPackage(ExceptionInVPackage.GInterfaceAg, this.aY);
      this.f = new X(this);
      this.f.start();
    }
    setDoubleBuffered(false);
    setOpaque(false);
  }

  public void ExceptionInVPackage(R paramR) {
    if (this.k != null) {
      this.k.C().ArrayListInIPackage(this);
      this.k.C().ManagerPreferredlayoutsize(this);
    }
    this.k = paramR;
    if (this.k != null) {
      paramR.C().ExceptionInVPackage(this);
      paramR.C().ExceptionInVPackage(this);
    }
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage(" a09kmfds098432lkg89vlk")) {
      ArrayListInIPackage.ExceptionInVPackage().ExceptionInVPackage(this.ae);
      ArrayListInIPackage.ExceptionInVPackage().ExceptionInVPackage(this.af);
    }
    if (paramR.C().q()) {
      ab();
    } else {
      k(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Off Line"));
    }
  }

  public void ExceptionInVPackage(s params) {
    if (this.f != null && (this.k == null || this.ax || this.ay)) this.f.ArrayListInIPackage();
    if (!this.az) repaint();
  }

  public void ManagerPreferredlayoutsize(s params) {
    if (this.f == null || !this.f.isAlive()) {
      this.f = new X(this);
      this.f.start();
    }
    add(params);
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("09BDPO;L,;l;ldpo;l5 ")
        && params instanceof IInterfaceDelta) params.addMouseListener(this.Z);
    params.setGaugeContainer(this);
    if (isEnabled()) {
      if (params instanceof Gauge) {
        Gauge gauge = (Gauge) params;
        gauge.setValue(gauge.max());
      }
      if (!(params instanceof t)) {
        params.addMouseListener(this.ExceptionPrintstacktrace);
        params.addMouseMotionListener(this.ExceptionPrintstacktrace);
        params.setFocusable(false);
      } else {
        params.setFocusable(true);
        params.enableInputMethods(true);
      }
      if (this.bd) params.subscribeToOutput();
    }
    params.setAntialiasingOn(M());
  }

  public void ExceptionInVPackage() {
    for (s s : r()) ArrayListInIPackage(s);
    this.Exceptionprintstacktrace = null;
    repaint();
  }

  public void ArrayListInIPackage(s params) {
    params.removeMouseListener(this.ExceptionPrintstacktrace);
    params.removeMouseMotionListener(this.ExceptionPrintstacktrace);
    remove(params);
    if (params instanceof GComponentCq) {
      ManagerUsingArrayList ManagerUsingArrayList = ManagerUsingArrayList.ExceptionInVPackage();
      ManagerUsingArrayList.ExceptionInVPackage((GComponentCq) params);
    }
  }

  public void removeAll() {
    Component[] arrayOfComponent = getComponents();
    int RInterfaceIndia = getComponentCount();
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < RInterfaceIndia;
        ManagerPreferredlayoutsize++) {
      if (arrayOfComponent[ManagerPreferredlayoutsize] instanceof s)
        ArrayListInIPackage((s) arrayOfComponent[ManagerPreferredlayoutsize]);
    }
    super.removeAll();
  }

  public void setBackground(Color paramColor) {
    super.setBackground(paramColor);
    this.ThreadedInTPackage = null;
    this.aq = null;
    if (getParent() != null) getParent().setBackground(paramColor);
  }

  private boolean GInterfaceAh() {
    return (getComponentCount() > 0 && !(getComponent(0) instanceof HtmlDisplay));
  }

  private void ai() {
    for (aQ aQ : this.ad) aQ.ExceptionInVPackage();
  }

  public void paint(Graphics paramGraphics) {
    long l1 = System.nanoTime();
    boolean bool = (D() && GInterfaceAh()) ? true : false;
    if (bool) {
      ExceptionInVPackage(paramGraphics, D(), bool);
    } else {
      Image image = aC();
      if (image == null) return;
      Graphics graphics = image.getGraphics();
      ExceptionInVPackage(graphics, D(), bool);
      paramGraphics.drawImage(image, 0, 0, null);
    }
    ManagerPreferredlayoutsize(paramGraphics);
    if (L()) {
      String str = "Width: " + getWidth() + ", Height: " + getHeight();
      int RInterfaceIndia = getFontMetrics(paramGraphics.getFont()).stringWidth(str) + 8;
      int k = getWidth() - RInterfaceIndia - 10;
      int RComponentMike = getFont().getSize();
      paramGraphics.setColor(Color.DARK_GRAY);
      paramGraphics.fillRect(k, 0, RInterfaceIndia, RComponentMike);
      paramGraphics.setColor(Color.WHITE);
      paramGraphics.drawString(str, k + 4, RComponentMike);
    }
    ExceptionInVPackage(paramGraphics);
    long l2 = System.nanoTime() - this.ArrayListInIPackage;
    double d1 = (System.nanoTime() - l1) / 1000000.0D;
    double d2 = d1 * 1000000.0D / l2;
    if (getComponentCount() > 0) {
      if (getComponent(0) instanceof Gauge || getComponent(0) instanceof Indicator) {
        float f = (float) Math.round(1.0E9D / l2) * 5.0F;
        this.IInterfaceDelta = (f * this.IInterfaceDelta + 1.0E9D / l2) / (f + 1.0F);
        this.e = (f * this.e + (float) d2 * 100.0F) / (f + 1.0F);
      }
      float f1 = this.at ? 0.12F : (s() ? 0.9F : this.aY);
      float f2 = s() ? 95.0F : this.aZ;
      if (ArrayListInIPackage.ExceptionInVPackage().ManagerPreferredlayoutsize() > 5.0D
          && f2 > 1.05D / ArrayListInIPackage.ExceptionInVPackage().ManagerPreferredlayoutsize())
        f2 =
            (float)
                (1.05D * ArrayListInIPackage.ExceptionInVPackage().ManagerPreferredlayoutsize());
      if (d2 > f1 || this.IInterfaceDelta > (f2 + 5.0F)) {
        this.f.ManagerPreferredlayoutsize();
      } else if (this.IInterfaceDelta <= f2) {
        this.f.ExceptionInVPackage();
      }
    }
    if (this.aN) {
      paramGraphics.setFont(new Font("Arial Unicode MS", 1, eJ.ExceptionInVPackage(13)));
      paramGraphics.setColor(Color.CYAN);
      paramGraphics.drawString(
          X.ManagerPreferredlayoutsize(this.IInterfaceDelta, 1)
              + " fps, Core%: "
              + X.ManagerPreferredlayoutsize(this.e, 1),
          5,
          15);
    }
    this.ArrayListInIPackage = System.nanoTime();
  }

  private void ExceptionInVPackage(Graphics paramGraphics, boolean paramBoolean) {
    if ((paramBoolean || L())
        && (this.aK.equals(RInterfacePapa)
            || this.aq == null
            || this.WInterfaceAp == null
            || this.WInterfaceAp.equals(""))) {
      Color color = getBackground();
      if (this.aJ != null && this.RComponentMike && this.aJ.getAlpha() > 0) {
        Point2D.Float float_1 = new Point2D.Float((getWidth() / 3), (getHeight() * 5 / 6));
        Point2D.Float float_2 = new Point2D.Float((getWidth() / 3), (getHeight() / 6));
        GradientPaint gradientPaint = new GradientPaint(float_1, color, float_2, this.aJ, true);
        ((Graphics2D) paramGraphics).setPaint(gradientPaint);
      } else {
        paramGraphics.setColor(getBackground());
      }
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    }
    if (this.WInterfaceAp != null && !this.WInterfaceAp.equals("") && this.aq == null)
      this.aq = Toolkit.getDefaultToolkit().getImage(this.WInterfaceAp);
    if ((paramBoolean || L()) && this.aq != null && this.aq.getWidth(null) > 0)
      if (this.aK.equals(n)) {
        paramGraphics.drawImage(this.aq, 0, 0, getWidth(), getHeight(), null);
      } else if (this.aK.equals(RInterfacePapa)) {
        if (getWidth() > this.aq.getWidth(null)) {
          paramGraphics.drawImage(
              this.aq,
              (getWidth() - this.aq.getWidth(null)) / 2,
              (getHeight() - this.aq.getHeight(null)) / 2,
              null);
        } else {
          double IInterfaceDelta = getWidth() / this.aq.getWidth(null);
          paramGraphics.drawImage(
              this.aq,
              0,
              (getHeight() - (int) (this.aq.getHeight(null) * IInterfaceDelta)) / 2,
              (int) (this.aq.getWidth(null) * IInterfaceDelta),
              (int) (this.aq.getHeight(null) * IInterfaceDelta),
              null);
        }
      } else if (this.aK.equals(RInterfaceOscar) && this.aq.getWidth(null) > 0) {
        int RInterfaceIndia = this.aq.getWidth(null);
        int k = this.aq.getHeight(null);
        for (byte ManagerPreferredlayoutsize = 0;
            ManagerPreferredlayoutsize * RInterfaceIndia < getWidth();
            ManagerPreferredlayoutsize++) {
          for (byte b1 = 0; b1 * k < getHeight(); b1++)
            paramGraphics.drawImage(
                this.aq, ManagerPreferredlayoutsize * RInterfaceIndia, b1 * k, null);
        }
      } else {
        D.ArrayListInIPackage(
            "Shouldn't be here. backgroundImage.getWidth(null)="
                + this.aq.getWidth(null)
                + "\n\tbackgroundImageStyle="
                + this.aK
                + "\n");
      }
    if (this.aQ && L()) {
      int RInterfaceIndia = eJ.ExceptionInVPackage(10);
      Color color1 = getBackground();
      Color color2 =
          new Color(255 - color1.getRed(), 255 - color1.getGreen(), 255 - color1.getBlue(), 64);
      paramGraphics.setColor(color2);
      byte ManagerPreferredlayoutsize;
      for (ManagerPreferredlayoutsize = 1;
          ManagerPreferredlayoutsize * RInterfaceIndia < getWidth();
          ManagerPreferredlayoutsize++)
        paramGraphics.drawLine(
            ManagerPreferredlayoutsize * RInterfaceIndia,
            0,
            ManagerPreferredlayoutsize * RInterfaceIndia,
            getHeight());
      for (ManagerPreferredlayoutsize = 1;
          ManagerPreferredlayoutsize * RInterfaceIndia < getHeight();
          ManagerPreferredlayoutsize++)
        paramGraphics.drawLine(
            0,
            ManagerPreferredlayoutsize * RInterfaceIndia,
            getWidth(),
            ManagerPreferredlayoutsize * RInterfaceIndia);
    }
  }

  private void ExceptionInVPackage(
      Graphics paramGraphics, boolean paramBoolean1, boolean paramBoolean2) {
    try {
      if (paramBoolean2) {
        Image image = aD();
        Graphics2D graphics2D1 = (Graphics2D) image.getGraphics();
        if (ThreadedInTPackage()) {
          Graphics2D graphics2D = (Graphics2D) paramGraphics;
          graphics2D1.setColor(this.ExceptionInVPackage);
          graphics2D1.setComposite(AlphaComposite.getInstance(2));
          graphics2D1.fillRect(0, 0, image.getWidth(null), image.getHeight(null));
          graphics2D1.setComposite(AlphaComposite.getInstance(3));
          if (image.getWidth(null) < 0) System.out.print("break 214312");
          ExceptionInVPackage(graphics2D1, true);
          ArrayListInIPackage(graphics2D1);
          this.aT = false;
        }
        Graphics2D graphics2D2 = (Graphics2D) paramGraphics;
        paramGraphics.drawImage(image, 0, 0, null);
        IInterfaceDelta(paramGraphics);
      } else {
        ExceptionInVPackage(paramGraphics, paramBoolean1);
        ManagerPreferredlayoutsize(paramGraphics, paramBoolean1);
      }
    } catch (Exception exception) {
      D.ArrayListInIPackage("Exception in GaugeCluster paint");
      exception.printStackTrace();
    }
  }

  public void paintChildren(Graphics paramGraphics) {
    ManagerPreferredlayoutsize(paramGraphics, !this.az);
    if (!this.az) super.paintChildren(paramGraphics);
    ai();
  }

  private void ExceptionInVPackage(Graphics paramGraphics) {
    if (this.h.ExceptionInVPackage() != null) {
      Rectangle rectangle = this.h.ExceptionInVPackage();
      paramGraphics.setColor(getBackground());
      paramGraphics.setXORMode(Color.YELLOW);
      int RInterfaceIndia = Math.abs(rectangle.width);
      int k = Math.abs(rectangle.height);
      int RComponentMike = (rectangle.width < 0) ? (rectangle.x + rectangle.width) : rectangle.x;
      int n = (rectangle.height < 0) ? (rectangle.y + rectangle.height) : rectangle.y;
      BasicStroke basicStroke =
          new BasicStroke(eJ.ExceptionInVPackage(1), 0, 2, 0.0F, new float[] {2.0F, 1.0F}, 0.0F);
      ((Graphics2D) paramGraphics).setStroke(basicStroke);
      paramGraphics.drawRect(RComponentMike, n, RInterfaceIndia, k);
    }
  }

  private void ManagerPreferredlayoutsize(Graphics paramGraphics) {
    String str1;
    String str2;
    if (L()) return;
    boolean bool = false;
    if (this.k != null
        && !this.k.C().q()
        && (this.aa > System.currentTimeMillis()
            || RComponentMike.ExceptionInVPackage().ManagerPreferredlayoutsize())) {
      str1 = null;
      str2 = ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Log Playback");
      bool = true;
    } else {
      str1 = aa();
      str2 = this.aI;
    }
    if (((str1 == null || str1.equals("")) && (str2 == null || str2.equals("")))
        || (getComponentCount() > 0 && this.ax)) return;
    if (this.al == null
        || this.al.getWidth(null) != getWidth()
        || this.al.getHeight(null) != getHeight()) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.al = graphicsConfiguration.createCompatibleImage(getWidth(), getHeight(), 3);
      Graphics2D graphics2D = (Graphics2D) this.al.getGraphics();
      graphics2D.setRenderingHint(
          RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_SPEED);
      graphics2D.setRenderingHint(
          RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      if (str1 != null && !str1.equals("")) {
        Color color = new Color(64, 64, 64, 160);
        graphics2D.setColor(color);
        graphics2D.fillRect(0, 0, getWidth(), getHeight());
      }
      graphics2D.setColor(new Color(210, 210, 210, 239));
      int RInterfaceIndia = bool ? eJ.ExceptionInVPackage(16) : eJ.ExceptionInVPackage(28);
      Font font = null;
      FontMetrics fontMetrics = null;
      if (str1 == null || str1.equals("")) str1 = str2;
      String[] arrayOfString = str1.split("\n");
      while (true) {
        font = new Font("Times", 1, RInterfaceIndia);
        graphics2D.setFont(font);
        fontMetrics = getFontMetrics(font);
        if (fontMetrics.stringWidth(arrayOfString[0]) <= getWidth() - 4 && --RInterfaceIndia != 0) {
          int k = RInterfaceIndia / 2;
          int RComponentMike = bool ? 2 : (getHeight() / 12);
          int n = fontMetrics.stringWidth(arrayOfString[0]) + k;
          Font font1 = new Font(font.getFamily(), 0, (int) (font.getSize() * 0.6D));
          if (arrayOfString.length > 1)
            for (byte b1 = 1; b1 < arrayOfString.length; b1++) {
              int i3 = getFontMetrics(font1).stringWidth(arrayOfString[b1]) + k;
              if (i3 > n) n = i3;
            }
          int i1 = (getWidth() - n + k) / 2;
          int i2 =
              (int)
                  ((fontMetrics.getHeight() + k / 2)
                      + fontMetrics.getHeight() * 0.6D * (arrayOfString.length - 0.5D));
          graphics2D.fillRect(i1 - k / 2, RComponentMike, n, i2);
          graphics2D.setColor(new Color(16, 16, 32));
          for (byte ManagerPreferredlayoutsize = 0;
              ManagerPreferredlayoutsize < arrayOfString.length;
              ManagerPreferredlayoutsize++) {
            if (ManagerPreferredlayoutsize == 1) graphics2D.setFont(font1);
            i1 =
                (getWidth()
                        - graphics2D
                            .getFontMetrics()
                            .stringWidth(arrayOfString[ManagerPreferredlayoutsize]))
                    / 2;
            graphics2D.drawString(
                arrayOfString[ManagerPreferredlayoutsize],
                i1,
                RComponentMike + fontMetrics.getHeight());
            RComponentMike += graphics2D.getFontMetrics().getHeight();
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

  public boolean ExceptionInVPackage(String paramString, AeInterfaceMikeTostring parambT) {
    if (ExceptionInVPackage.A().E().ArrayListInIPackage().equals(paramString)) {
      this.IInterfaceDelta = 6.0D;
      ab();
      S s = this.l;
      if (s != null) S.ExceptionInVPackage(s);
      this.az = true;
    }
    return true;
  }

  public void ExceptionInVPackage(String paramString) {
    if (ExceptionInVPackage.A().E() != null
        && ExceptionInVPackage.A().E().ArrayListInIPackage().equals(paramString)) {
      ManagerPreferredlayoutsize();
      this.az = false;
    }
    R r = T.ExceptionInVPackage().ArrayListInIPackage(paramString);
    if (r != null && !r.C().O()) {
      k(
          ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
              "Connected to Dash Echo server that is Off Line"));
    } else {
      k(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Off Line"));
    }
  }

  public void ManagerPreferredlayoutsize() {
    if (ExceptionInVPackage.ExceptionInVPackage()
            .ExceptionInVPackage(ExceptionInVPackage.P, ExceptionInVPackage.Q)
        && ArrayListInIPackage.ExceptionInVPackage().IInterfaceDelta()) return;
    this.ax = false;
    s[] arrayOfS = IComponentJuliet();
    if (!B()) {
      this.ay = false;
      for (s s : arrayOfS) {
        if (s instanceof Gauge) {
          Gauge gauge = (Gauge) s;
          if (gauge.min() < 0.0D && gauge.max() > 0.0D) {
            gauge.setValue(0.0D);
          } else {
            gauge.setValue(gauge.min());
          }
          gauge.invalidate();
        } else if (s instanceof Indicator) {
          Indicator indicator = (Indicator) s;
          if (indicator.getEcuConfigurationName() != null
              && !indicator
                  .getEcuConfigurationName()
                  .equals(ManagerUsingArrayList.ExceptionInVPackage)) indicator.setValue(0.0D);
          indicator.setRunDemo(false);
        }
      }
    } else {
      for (s s : arrayOfS) {
        if (s instanceof Gauge) {
          Gauge gauge = (Gauge) s;
          gauge.invalidate();
        } else if (s instanceof Indicator) {
          Indicator indicator = (Indicator) s;
          if (indicator.getEcuConfigurationName() != null
              && !indicator
                  .getEcuConfigurationName()
                  .equals(ManagerUsingArrayList.ExceptionInVPackage)) {
            indicator.goDead();
          } else if (indicator.isRunDemo()) {
            indicator.setRunDemo(false);
          }
        }
      }
      this.ay = true;
      if (this.l != null) this.l.ManagerPreferredlayoutsize = true;
      this.l = new S(this);
      this.l.ExceptionInVPackage = false;
      this.l.start();
    }
  }

  public void update(Graphics paramGraphics) {
    D.ArrayListInIPackage("Update Called");
    paint(paramGraphics);
  }

  private boolean ExceptionInVPackage(Component paramComponent, int paramInt) {
    Component[] arrayOfComponent = getComponents();
    for (int RInterfaceIndia = paramInt;
        RInterfaceIndia < arrayOfComponent.length;
        RInterfaceIndia++) {
      if (!arrayOfComponent[RInterfaceIndia].equals(paramComponent)
          && ExceptionInVPackage(arrayOfComponent[RInterfaceIndia], paramComponent)) return true;
    }
    return false;
  }

  private boolean ExceptionInVPackage(Component paramComponent1, Component paramComponent2) {
    int RInterfaceIndia = paramComponent1.getX();
    int k = paramComponent1.getY();
    int RComponentMike = paramComponent1.getWidth();
    int n = paramComponent1.getHeight();
    Rectangle rectangle1 = new Rectangle(RInterfaceIndia, k, RComponentMike, n);
    RInterfaceIndia = paramComponent2.getX();
    k = paramComponent2.getY();
    RComponentMike = paramComponent2.getWidth();
    n = paramComponent2.getHeight();
    Rectangle rectangle2 = new Rectangle(RInterfaceIndia, k, RComponentMike, n);
    return (rectangle1.intersects(rectangle2) && !paramComponent2.equals(paramComponent1));
  }

  private void ManagerPreferredlayoutsize(Graphics paramGraphics, boolean paramBoolean) {
    Component[] arrayOfComponent = getComponents();
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < arrayOfComponent.length;
        ManagerPreferredlayoutsize++) {
      if (arrayOfComponent[ManagerPreferredlayoutsize] instanceof s) {
        s s = (s) arrayOfComponent[ManagerPreferredlayoutsize];
        if (!D() && s.isMustPaint()) {
          e(true);
          D.ArrayListInIPackage("Deactivated fast paint " + getName());
        }
        if (s.isDirty() || paramBoolean || L() || s.isRunDemo() || s.requiresBackgroundRepaint()) {
          Graphics graphics = paramGraphics.create(s.getX(), s.getY(), s.getWidth(), s.getHeight());
          Area area = f(s);
          graphics.setClip(area);
          s.paint(graphics);
          graphics.dispose();
          s.setDirty(false);
        }
        if (this.GInterfaceAf.contains(s)) ExceptionInVPackage(paramGraphics, s);
      }
    }
  }

  private boolean ThreadedInTPackage() {
    if (this.aT) return true;
    Component[] arrayOfComponent = getComponents();
    if (arrayOfComponent.length == 0) return true;
    boolean bool = false;
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < arrayOfComponent.length;
        ManagerPreferredlayoutsize++) {
      if (arrayOfComponent[ManagerPreferredlayoutsize] instanceof s) {
        s s = (s) arrayOfComponent[ManagerPreferredlayoutsize];
        if (!bool && s.requiresBackgroundRepaint()) {
          bool = true;
          break;
        }
      }
    }
    return bool;
  }

  private void ArrayListInIPackage(Graphics paramGraphics) {
    Component[] arrayOfComponent = getComponents();
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < arrayOfComponent.length;
        ManagerPreferredlayoutsize++) {
      if (arrayOfComponent[ManagerPreferredlayoutsize] instanceof s) {
        s s = (s) arrayOfComponent[ManagerPreferredlayoutsize];
        Graphics graphics = paramGraphics.create(s.getX(), s.getY(), s.getWidth(), s.getHeight());
        s.paintBackground(graphics);
        graphics.dispose();
        s.validate();
      }
    }
  }

  private void IInterfaceDelta(Graphics paramGraphics) {
    Component[] arrayOfComponent = getComponents();
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < arrayOfComponent.length;
        ManagerPreferredlayoutsize++) {
      if (arrayOfComponent[ManagerPreferredlayoutsize] instanceof s) {
        s s = (s) arrayOfComponent[ManagerPreferredlayoutsize];
        if (s.getWidth() > 0 && s.getHeight() > 0) {
          Graphics2D graphics2D =
              (Graphics2D) paramGraphics.create(s.getX(), s.getY(), s.getWidth(), s.getHeight());
          Area area = f(s);
          graphics2D.setClip(area);
          s.updateGauge(graphics2D);
          graphics2D.dispose();
          s.setDirty(false);
        }
        if (this.GInterfaceAf.contains(s)) ExceptionInVPackage(paramGraphics, s);
      }
    }
    ai();
  }

  private Area f(s params) {
    Area area = (Area) this.ac.get(params);
    if (area == null || L()) {
      area = new Area(new Rectangle(0, 0, params.getWidth(), params.getHeight()));
      boolean bool = false;
      for (s s1 : IComponentJuliet()) {
        if (bool) {
          Area area1 = s1.areaPainted();
          int RInterfaceIndia = s1.getX() - params.getX();
          int k = s1.getY() - params.getY();
          AffineTransform affineTransform = new AffineTransform();
          affineTransform.translate(RInterfaceIndia, k);
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

  public void ArrayListInIPackage() {
    for (Component component : getComponents()) {
      if (component instanceof bc) ((bc) component).close();
    }
    removeAll();
    String str =
        ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage.aX, G);
    RInterfaceIndia(str);
    IComponentJuliet(RInterfacePapa);
    this.aq = eJ.ExceptionInVPackage(this.aq);
    this.ar = "";
    if (this.k != null) {
      this.k.C().ArrayListInIPackage(this);
      this.k.C().ManagerPreferredlayoutsize(this);
    }
    if (this.f != null) {
      X.ExceptionInVPackage(this.f);
      this.f = null;
    }
    e(false);
    ArrayListInIPackage.ExceptionInVPackage().ManagerPreferredlayoutsize(this.ae);
    ArrayListInIPackage.ExceptionInVPackage().ManagerPreferredlayoutsize(this.af);
  }

  private void ExceptionInVPackage(Graphics paramGraphics, s params) {
    if (!L()) return;
    int RInterfaceIndia = params.getX();
    int k = params.getY();
    int RComponentMike = params.getWidth();
    int n = params.getHeight();
    int i1 = this.am - this.ag / 2;
    if (RComponentMike > 0 && n > 0) {
      if (M()) {
        Graphics2D graphics2D = (Graphics2D) paramGraphics;
        graphics2D.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(
            RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.setStroke(this.GInterfaceAh);
      }
      paramGraphics.setFont(getFont());
      Color color = Color.yellow;
      paramGraphics.setColor(color);
      paramGraphics.drawLine(
          RInterfaceIndia + i1, k + i1, RInterfaceIndia + RComponentMike - i1, k + n - i1);
      paramGraphics.drawLine(
          RInterfaceIndia + i1, k + n - i1, RInterfaceIndia + RComponentMike - i1, k + i1);
      paramGraphics.fillRect(RInterfaceIndia, k, this.am, this.am);
      paramGraphics.fillRect(RInterfaceIndia, k + n - this.am, this.am, this.am);
      paramGraphics.fillRect(RInterfaceIndia + RComponentMike - this.am, k, this.am, this.am);
      paramGraphics.setColor(Color.red);
      paramGraphics.fillRect(
          RInterfaceIndia + RComponentMike - this.am, k + n - this.am, this.am, this.am);
      String str =
          "X: " + RInterfaceIndia + ", Y:" + k + ", Width: " + RComponentMike + ", Height: " + n;
      paramGraphics.setColor(Color.DARK_GRAY);
      paramGraphics.fillRect(
          RInterfaceIndia + 10,
          k,
          paramGraphics.getFontMetrics().stringWidth(str) + 10,
          paramGraphics.getFont().getSize() + 2);
      paramGraphics.setColor(Color.WHITE);
      paramGraphics.drawString(
          str,
          RInterfaceIndia + eJ.ExceptionInVPackage(15),
          k + paramGraphics.getFont().getSize() - 1);
    }
  }

  public void ExceptionInVPackage(Component paramComponent, int paramInt1, int paramInt2) {
    boolean bool =
        ExceptionInVPackage.ExceptionInVPackage()
            .ExceptionInVPackage(ExceptionInVPackage.da, ExceptionInVPackage.db);
    if (bool) return;
    boolean bool1 = false;
    if (!bool1) {
      JPopupMenu jPopupMenu = IInterfaceDelta();
      add(jPopupMenu);
      if (paramComponent != null) {
        jPopupMenu.show(paramComponent, paramInt1, paramInt2);
      } else {
        jPopupMenu.show(this, paramInt1, paramInt2);
      }
    }
  }

  public void ExceptionInVPackage(boolean paramBoolean) {
    this.aT = paramBoolean;
  }

  public JPopupMenu IInterfaceDelta() {
    br br = new br();
    ExceptionInVPackage((bq) br);
    return (JPopupMenu) br;
  }

  public bq ExceptionInVPackage(bq parambq) {
    V v = new V(this);
    JMenu jMenu1 = null;
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("43wunjt58j7tjtht")) {
      JMenu jMenu = new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Load / Save"));
      parambq.add(jMenu);
      jMenu.add(J).addActionListener(v);
      jMenu.add(I).addActionListener(v);
      jMenu.add(H).addActionListener(v);
      if (L()) {
        jMenu.addSeparator();
        jMenu.add(L).addActionListener(v);
        JMenuItem jMenuItem1 = parambq.add(O);
        jMenuItem1.addActionListener(v);
        if (this.GInterfaceAf.size() > 0) {
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
      byte ManagerPreferredlayoutsize = 0;
      if (r().size() > 0) {
        w w1 = O();
        O().ManagerPreferredlayoutsize(r());
        w1.setText(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Dashboard Designer"));
      } else {
        jMenu =
            new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Dashboard Designer"));
      }
      jMenu1 = new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("New"));
      jMenu1.add(v).addActionListener(v);
      jMenu1.add(w).addActionListener(v);
      jMenu1.add(x).addActionListener(v);
      if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("LKMFSLKFDSLK;LKM09")) {
        jMenu1.add(y).addActionListener(v);
        jMenu1.add(z).addActionListener(v);
      }
      jMenu.insert(jMenu1, ManagerPreferredlayoutsize++);
      if (this.GInterfaceAf.size() > 0) {
        JMenuItem jMenuItem = new JMenuItem(A);
        jMenuItem.addActionListener(v);
        jMenu.insert(jMenuItem, ManagerPreferredlayoutsize++);
      }
      if (am()) {
        parambq.addSeparator();
        if (this.GInterfaceAf.size() > 1) {
          JMenuItem jMenuItem = new JMenuItem(U);
          jMenuItem.addActionListener(v);
          jMenu.insert(jMenuItem, ManagerPreferredlayoutsize++);
          if (this.GInterfaceAf.get(0) instanceof Gauge) {
            Gauge gauge = this.GInterfaceAf.get(0);
            if (gauge.getGroupId() != 0) {
              jMenuItem = new JMenuItem(V);
              jMenuItem.addActionListener(v);
              jMenu.insert(jMenuItem, ManagerPreferredlayoutsize++);
            }
          }
        }
        GaugePainter[] arrayOfGaugePainter = e.ExceptionInVPackage();
        jMenu1 = new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Gauge Style"));
        if (arrayOfGaugePainter != null)
          for (byte b1 = 0; b1 < arrayOfGaugePainter.length; b1++) {
            GaugePainter gaugePainter = arrayOfGaugePainter[b1];
            JMenuItem jMenuItem =
                new JMenuItem(
                    ExceptionPrintstacktrace.ManagerPreferredlayoutsize(gaugePainter.getName()));
            jMenuItem.setActionCommand(gaugePainter.getClass().getName());
            jMenuItem.addActionListener(new G(this));
            jMenu1.add(jMenuItem);
          }
        jMenu.insert(jMenu1, ManagerPreferredlayoutsize++);
      }
      if (al()) {
        parambq.addSeparator();
        IndicatorPainter[] arrayOfIndicatorPainter = e.ManagerPreferredlayoutsize();
        jMenu1 = new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Indicator Style"));
        for (byte b1 = 0; b1 < arrayOfIndicatorPainter.length; b1++) {
          IndicatorPainter indicatorPainter = arrayOfIndicatorPainter[b1];
          JMenuItem jMenuItem = new JMenuItem(indicatorPainter.getName());
          jMenuItem.setActionCommand(indicatorPainter.getClass().getName());
          jMenuItem.addActionListener(new H(this));
          jMenu1.add(jMenuItem);
        }
        jMenu.insert(jMenu1, ManagerPreferredlayoutsize++);
      }
      if (r().size() > 0) {
        jMenu1 = new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Order"));
        jMenu1.add(q).addActionListener(v);
        jMenu1.add(r).addActionListener(v);
        jMenu1.add(s).addActionListener(v);
        jMenu1.add(t).addActionListener(v);
        jMenu.insert(jMenu1, ManagerPreferredlayoutsize++);
      }
      jMenu.insertSeparator(ManagerPreferredlayoutsize++);
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
      if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("43wunjt58j7tjtht"))
        parambq.addSeparator();
      jMenu1 =
          new JMenu(
              ExceptionInVPackage.ManagerPreferredlayoutsize
                  + " "
                  + ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Gauges"));
      parambq.add(jMenu1);
      ArrayList arrayList = new ArrayList();
      Iterator iterator = ArrayListInIPackage.ExceptionInVPackage().ManagerPreferredlayoutsize();
      while (iterator.hasNext()) arrayList.add(iterator.next());
      List list = S.ExceptionInVPackage(arrayList);
      O RInterfaceOscar = new O(this, ManagerUsingArrayList.ExceptionInVPackage);
      HashMap<Object, Object> hashMap = new HashMap<>();
      for (GInterfaceAh GInterfaceAh : list) {
        String str = "";
        try {
          str =
              ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
                  GInterfaceAh.k().ExceptionInVPackage());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(x.class.getName())
              .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
        }
        JMenuItem jMenuItem = new JMenuItem(str + " - " + GInterfaceAh.aL());
        jMenuItem.setActionCommand(GInterfaceAh.aL());
        jMenuItem.addActionListener(RInterfaceOscar);
        if (GInterfaceAh.RInterfacePapa() == null || GInterfaceAh.RInterfacePapa().equals("")) {
          jMenu1.add(jMenuItem);
          continue;
        }
        if (hashMap.containsKey(GInterfaceAh.RInterfacePapa())) {
          ((ArrayList<JMenuItem>) hashMap.get(GInterfaceAh.RInterfacePapa())).add(jMenuItem);
          continue;
        }
        ArrayList<JMenuItem> arrayList1 = new ArrayList();
        arrayList1.add(jMenuItem);
        hashMap.put(GInterfaceAh.RInterfacePapa(), arrayList1);
      }
      for (String str : hashMap.keySet()) {
        jMenu1 = new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize(str));
        parambq.add(jMenu1);
        for (JMenuItem jMenuItem : hashMap.get(str)) jMenu1.add(jMenuItem);
      }
      byte b1 = 0;
      int RInterfaceIndia = (Toolkit.getDefaultToolkit().getScreenSize()).height;
      JMenu jMenu = null;
      T t = T.ExceptionInVPackage();
      String[] arrayOfString = t.IInterfaceDelta();
      for (byte b2 = 0; b2 < arrayOfString.length; b2++) {
        R r = t.ArrayListInIPackage(arrayOfString[b2]);
        if (r.S()) {
          RInterfaceOscar = new O(this, arrayOfString[b2]);
          if (r != null && r.B() != null) {
            byte b3 = 0;
            byte b4 = 25;
            ArrayList<GInterfaceAh> arrayList1 = new ArrayList();
            Iterator<GInterfaceAh> iterator1 = r.B();
            while (iterator1.hasNext()) {
              GInterfaceAh GInterfaceAh = iterator1.next();
              boolean bool = true;
              try {
                bool = RInterfacePapa.ExceptionInVPackage(GInterfaceAh.aJ(), r);
              } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
                Logger.getLogger(x.class.getName())
                    .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
              }
              if (bool) arrayList1.add(GInterfaceAh);
            }
            List list1 = S.ExceptionInVPackage(arrayList1);
            iterator1 = null;
            String str = null;
            for (GInterfaceAh GInterfaceAh : list1) {
              if (b3++ % b4 == 0 || !X.ExceptionInVPackage(GInterfaceAh.RInterfacePapa(), str)) {
                if (!X.ExceptionInVPackage(GInterfaceAh.RInterfacePapa(), str)) {
                  b3 = 1;
                  str = GInterfaceAh.RInterfacePapa();
                }
                String str2 =
                    (GInterfaceAh.RInterfacePapa() == null)
                        ? (ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Gauge Templates")
                            + " ")
                        : ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
                            GInterfaceAh.RInterfacePapa());
                String str3 = (b3 > b4) ? ((b3 / b4 + 1) + "") : "";
                if (arrayOfString.length == 1) {
                  jMenu1 = new JMenu(str2 + " " + str3);
                } else {
                  jMenu1 = new JMenu(str2 + " " + str3 + " (" + r.ArrayListInIPackage() + ")");
                }
                if (RInterfaceIndia < 1024 && b1++ > 12) {
                  if (jMenu == null) {
                    jMenu =
                        new JMenu(
                            ExceptionPrintstacktrace.ManagerPreferredlayoutsize("More Gauges"));
                    parambq.add(jMenu);
                  }
                  jMenu.add(jMenu1);
                } else {
                  parambq.add(jMenu1);
                }
              }
              String str1 = "";
              try {
                str1 =
                    ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
                        GInterfaceAh.k().ExceptionInVPackage());
              } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
                Logger.getLogger(x.class.getName())
                    .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
              }
              JMenuItem jMenuItem = new JMenuItem(str1 + " - " + GInterfaceAh.aL());
              jMenuItem.setActionCommand(GInterfaceAh.aL());
              jMenuItem.addActionListener(RInterfaceOscar);
              jMenu1.add(jMenuItem);
            }
          }
          parambq.addSeparator();
        }
      }
    }
    if (al()) {
      parambq.addSeparator();
      jMenu1 =
          new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Application Indicators"));
      parambq.add(jMenu1);
      ArrayList arrayList = new ArrayList();
      Iterator iterator = IInterfaceDelta.ExceptionInVPackage().ArrayListInIPackage();
      while (iterator.hasNext()) arrayList.add(iterator.next());
      List list = S.ExceptionInVPackage(arrayList);
      P RInterfacePapa = new P(this, ManagerUsingArrayList.ExceptionInVPackage);
      for (Exceptionprintstacktrace Exceptionprintstacktrace : list) {
        JMenuItem jMenuItem =
            new JMenuItem(
                ExceptionPrintstacktrace.ManagerPreferredlayoutsize("On")
                    + ": "
                    + Exceptionprintstacktrace.ManagerPreferredlayoutsize()
                    + " - "
                    + ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Off")
                    + ": "
                    + Exceptionprintstacktrace.e());
        jMenuItem.setActionCommand(Exceptionprintstacktrace.aL());
        jMenuItem.addActionListener(RInterfacePapa);
        jMenu1.add(jMenuItem);
      }
      T t = T.ExceptionInVPackage();
      String[] arrayOfString = t.IInterfaceDelta();
      for (byte ManagerPreferredlayoutsize = 0;
          ManagerPreferredlayoutsize < arrayOfString.length;
          ManagerPreferredlayoutsize++) {
        if (arrayOfString.length > 1) {
          jMenu1 =
              new JMenu(
                  ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Predefined Indicators")
                      + " ("
                      + arrayOfString[ManagerPreferredlayoutsize]
                      + ")");
        } else {
          jMenu1 =
              new JMenu(
                  ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Predefined Indicators"));
        }
        parambq.add(jMenu1);
        R r = t.ArrayListInIPackage(arrayOfString[ManagerPreferredlayoutsize]);
        RInterfacePapa = new P(this, arrayOfString[ManagerPreferredlayoutsize]);
        if (r != null && r.A() != null) {
          byte b1 = 1;
          byte b2 = 25;
          list = new ArrayList();
          Iterator<Exceptionprintstacktrace> iterator1 = r.A();
          while (iterator1.hasNext()) list.add(iterator1.next());
          list = S.ExceptionInVPackage(list);
          iterator1 = list.iterator();
          while (iterator1.hasNext()) {
            if (b1++ % b2 == 0) {
              jMenu1 =
                  new JMenu(
                      ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Predefined Indicators")
                          + " "
                          + (b1 / b2 + 1));
              parambq.add(jMenu1);
            }
            Exceptionprintstacktrace Exceptionprintstacktrace = iterator1.next();
            JMenuItem jMenuItem =
                new JMenuItem(
                    ExceptionPrintstacktrace.ManagerPreferredlayoutsize("On")
                        + ": "
                        + ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
                            Exceptionprintstacktrace.ManagerPreferredlayoutsize())
                        + " - "
                        + ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Off")
                        + ": "
                        + ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
                            Exceptionprintstacktrace.e()));
            jMenuItem.setActionCommand(Exceptionprintstacktrace.aL());
            jMenuItem.addActionListener(RInterfacePapa);
            jMenu1.add(jMenuItem);
          }
        }
      }
      parambq.addSeparator();
    }
    if (al() || am()) {
      JMenuItem jMenuItem =
          new JMenuItem(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Reset Value"));
      jMenuItem.addActionListener(new K(this));
      parambq.add(jMenuItem);
    }
    JMenu jMenu2 = new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Background"));
    parambq.add(jMenu2);
    jMenu2.add(D).addActionListener(v);
    jMenu2.add(E).addActionListener(v);
    jMenu2.add(F).addActionListener(v);
    JMenu jMenu3 = new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Image Position"));
    L l = new L(this);
    jMenu3.add(n).addActionListener(l);
    jMenu3.add(RInterfaceOscar).addActionListener(l);
    jMenu3.add(RInterfacePapa).addActionListener(l);
    jMenu2.add(jMenu3);
    if (this.aq != null) jMenu2.add(G).addActionListener(v);
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(T);
    ExceptionInVPackage((dR) new ba(jCheckBoxMenuItem, "antiAliasingOn"));
    jCheckBoxMenuItem.setState(M());
    jCheckBoxMenuItem.addActionListener(new M(this));
    parambq.add(jCheckBoxMenuItem);
    if (af())
      if (J.ManagerPreferredlayoutsize() || !bV.h() || s()) {
        JMenuItem jMenuItem =
            new JMenuItem(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Full Screen"));
        jMenuItem.setSelected(s());
        jMenuItem.addActionListener(new z(this));
        parambq.add(jMenuItem);
      } else {
        JMenu jMenu = new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Full Screen"));
        jMenu.setSelected(s());
        jMenu.addActionListener(new A(this));
        String[] arrayOfString = dn.ExceptionInVPackage();
        for (byte ManagerPreferredlayoutsize = 0;
            ManagerPreferredlayoutsize < arrayOfString.length;
            ManagerPreferredlayoutsize++) {
          JMenuItem jMenuItem =
              new JMenuItem(
                  ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Full Screen on ")
                      + arrayOfString[ManagerPreferredlayoutsize]);
          jMenuItem.setActionCommand(ManagerPreferredlayoutsize + "");
          jMenu.add(jMenuItem);
          jMenuItem.addActionListener(new B(this));
        }
        parambq.add(jMenu);
      }
    if (!ExceptionInVPackage.ExceptionInVPackage()
        .ManagerPreferredlayoutsize(ExceptionInVPackage.cQ, ExceptionInVPackage.cR)) {
      jCheckBoxMenuItem = new JCheckBoxMenuItem(N);
      jCheckBoxMenuItem.setState(L());
      jCheckBoxMenuItem.addActionListener(new C(this));
      parambq.add(jCheckBoxMenuItem);
      if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("sesrhsfghyuf754"))
        jCheckBoxMenuItem.setEnabled(false);
    }
    jMenu1 = new JMenu(ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Gauge Demo"));
    jMenu1.add(B).addActionListener(v);
    jMenu1.add(C).addActionListener(v);
    parambq.add(jMenu1);
    return parambq;
  }

  private void Exceptionprintstacktrace() {
    for (s s : this.GInterfaceAf) {
      if (s instanceof SingleChannelDashComponent) {
        SingleChannelDashComponent singleChannelDashComponent = (SingleChannelDashComponent) s;
        String str1 = singleChannelDashComponent.getOutputChannel();
        String str2 = singleChannelDashComponent.getEcuConfigurationName();
        try {
          RInterfaceIndia.ExceptionInVPackage(str2, str1);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(x.class.getName())
              .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
        }
      }
    }
  }

  private boolean al() {
    Iterator iterator = this.GInterfaceAf.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() instanceof Indicator) return true;
    }
    return false;
  }

  private boolean am() {
    Iterator iterator = this.GInterfaceAf.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() instanceof Gauge) return true;
    }
    return false;
  }

  public void ManagerPreferredlayoutsize(boolean paramBoolean) {
    Component component = null;
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < getComponentCount();
        ManagerPreferredlayoutsize++) {
      component = getComponent(ManagerPreferredlayoutsize);
      if (component instanceof s) {
        s s = (s) component;
        s.setRunDemo(paramBoolean);
      }
      if (component instanceof Gauge && paramBoolean) {
        Gauge gauge = (Gauge) component;
        gauge.setValue(gauge.min());
      }
    }
    if (paramBoolean && !this.ax) {
      this.ax = paramBoolean;
      if (this.ax) {
        if (this.l != null) S.ExceptionInVPackage(this.l);
        this.ay = false;
        this.l = new S(this);
        this.l.start();
      }
    } else if (!paramBoolean) {
      this.ax = false;
      ManagerPreferredlayoutsize();
    }
  }

  public void e() {
    Component component = null;
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < getComponentCount();
        ManagerPreferredlayoutsize++) {
      component = getComponent(ManagerPreferredlayoutsize);
      if (!(component instanceof Gauge) && component instanceof Indicator) {
        Indicator indicator = (Indicator) component;
        indicator.setOffText(
            ExceptionPrintstacktrace.ManagerPreferredlayoutsize(indicator.getOffText().toString()));
        indicator.setOnText(
            ExceptionPrintstacktrace.ManagerPreferredlayoutsize(indicator.getOnText().toString()));
      }
    }
  }

  public void f() {
    Component component = null;
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < getComponentCount();
        ManagerPreferredlayoutsize++) {
      component = getComponent(ManagerPreferredlayoutsize);
      if (!(component instanceof Gauge) && component instanceof Indicator)
        ;
    }
  }

  public Component ExceptionPrintstacktrace() {
    return (this.GInterfaceAf.size() > 0) ? this.GInterfaceAf.get(0) : null;
  }

  public void ManagerPreferredlayoutsize(String paramString) {
    if (paramString.equals(v)) {
      RComponentMike();
    } else if (paramString.equals(w)) {
      RInterfacePapa();
    } else if (paramString.equals(x)) {
      q();
    } else if (paramString.equals(y)) {
      n();
    } else if (paramString.equals(z)) {
      RInterfaceOscar();
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
      ManagerPreferredlayoutsize(true);
    } else if (paramString.equals(C)) {
      ManagerPreferredlayoutsize(false);
    } else if (paramString.equals(O)) {
      WInterfaceAp();
    } else if (paramString.equals(P)) {
      aq();
    } else if (paramString.equals(R)) {
      as();
    } else if (paramString.equals(S)) {
      ar();
    } else if (paramString.equals(K)) {
      GInterfaceAf();
    }
    Component component = ExceptionPrintstacktrace();
    if (component == null) {
      repaint();
      return;
    }
    if (paramString.equals(q)) {
      ExceptionInVPackage(component);
    } else if (paramString.equals(r)) {
      ManagerPreferredlayoutsize(component);
    } else if (paramString.equals(s)) {
      IInterfaceDelta(component);
    } else if (paramString.equals(t)) {
      ArrayListInIPackage(component);
    } else if (paramString.equals(U)) {
      ao();
    } else if (paramString.equals(V)) {
      an();
    } else if (component instanceof s) {
      if (paramString.equals(A)) {
        ExceptionInVPackage();
      } else if (paramString.equals(M)) {
        ExceptionInVPackage(r());
      } else if (component instanceof Gauge) {
        Gauge gauge = (Gauge) component;
        if (paramString.equals(u)) IInterfaceDelta(gauge);
      }
    }
    this.Exceptionprintstacktrace = null;
    repaint();
  }

  private void an() {
    for (s s : this.GInterfaceAf) {
      if (s instanceof Gauge) ((Gauge) s).setGroupId(0);
    }
  }

  private void ao() {
    int RInterfaceIndia = (int) (Math.random() * 2.147483647E9D);
    for (s s : this.GInterfaceAf) {
      if (s instanceof Gauge) ((Gauge) s).setGroupId(RInterfaceIndia);
    }
  }

  private void WInterfaceAp() {
    ExceptionInVPackage(r(), aM);
  }

  private void aq() {
    try {
      ExceptionInVPackage(aM, 0.06D, 0.06D);
    } catch (ExceptionInVPackage a1) {
      D.IInterfaceDelta("no valid DashboardComponent");
    }
  }

  private void ar() {
    try {
      File file = new File(aM);
      ArrayList<s> arrayList =
          (new ArrayListInIPackage(IComponentJuliet.G()))
              .ManagerPreferredlayoutsize(file.getAbsolutePath());
      if (arrayList.isEmpty()) {
        bV.IInterfaceDelta("No Component Copied", this);
        return;
      }
      s s = arrayList.get(0);
      for (s s1 : r()) {
        s1.setRelativeHeight(s.getRelativeHeight());
        s1.setRelativeWidth(s.getRelativeWidth());
      }
      doLayout();
      ExceptionInVPackage(true);
      repaint();
    } catch (ExceptionInVPackage a1) {
      D.IInterfaceDelta("no valid DashboardComponent");
    }
  }

  private void as() {
    try {
      File file = new File(aM);
      Gauge gauge = aa.ExceptionInVPackage(file);
      if (gauge != null) {
        for (s s : r()) {
          if (s instanceof Gauge) {
            Gauge gauge1 = (Gauge) s;
            aa.ExceptionInVPackage(gauge, gauge1);
          }
        }
      } else {
        bV.IInterfaceDelta(
            ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
                "You must copy ExceptionInVPackage Gauge before applying the Theme."),
            this);
      }
    } catch (ExceptionInVPackage a1) {
      D.IInterfaceDelta("no valid DashboardComponent");
    }
  }

  private void at() {
    String[] arrayOfString = {ExceptionInVPackage.co};
    String str = (ad() == null) ? ("*." + ExceptionInVPackage.co) : ad();
    str =
        bV.ExceptionInVPackage(
            this,
            ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Save Dashboard Layout"),
            arrayOfString,
            "*." + ExceptionInVPackage.co,
            IComponentJuliet.IComponentJuliet().getAbsolutePath(),
            false);
    if (str == null) return;
    if (!str.toLowerCase().endsWith("." + ExceptionInVPackage.co))
      str = str + "." + ExceptionInVPackage.co;
    IInterfaceDelta(str);
    IComponentJuliet.e(new File(str));
  }

  public void ArrayListInIPackage(String paramString) {
    if (ad() != null) {
      ExceptionInVPackage(ad(), paramString);
      this.GInterfaceAg = true;
    } else {
      at();
    }
  }

  public void h() {
    if (ad() != null) {
      ExceptionInVPackage(ad(), (String) null);
      this.GInterfaceAg = true;
    } else {
      at();
    }
  }

  public void IInterfaceDelta(String paramString) {
    ExceptionInVPackage(paramString, (String) null);
  }

  public void ExceptionInVPackage(String paramString1, String paramString2) {
    if (paramString1 == null || paramString1.trim().equals("")) return;
    aa aa = new aa();
    aa.ExceptionInVPackage();
    ArrayListInIPackage ArrayListInIPackage = new ArrayListInIPackage(IComponentJuliet.G());
    try {
      boolean bool = this.ax;
      ManagerPreferredlayoutsize(false);
      if (bool)
        try {
          Thread.sleep(100L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(x.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
      Z z = RInterfaceIndia();
      if (paramString2 != null) z.ManagerPreferredlayoutsize(paramString2);
      synchronized (this) {
        ArrayListInIPackage.ExceptionInVPackage(paramString1, z);
      }
      D.ArrayListInIPackage(
          "Time to save dashboard: " + aa.IInterfaceDelta() + "ms. file: " + paramString1);
    } catch (ExceptionInVPackage a1) {
      bV.IInterfaceDelta(
          "Error saving Dashboard.\n" + a1.getMessage() + "\nCheck Log for more details", this);
    }
  }

  private void ExceptionInVPackage(ArrayList paramArrayList) {
    String[] arrayOfString = {ExceptionInVPackage.GComponentCq};
    ExceptionInVPackage a1 = ExceptionInVPackage.A();
    if (a1 == null)
      bV.IInterfaceDelta(
          "There is no project open.\nPlease open ExceptionInVPackage project first.", this);
    String str =
        bV.ExceptionInVPackage(
            this,
            "Save Gauge",
            arrayOfString,
            "*." + ExceptionInVPackage.GComponentCq,
            IComponentJuliet.IComponentJuliet().getAbsolutePath(),
            false);
    if (str == null) return;
    if (!str.toLowerCase().endsWith("." + ExceptionInVPackage.GComponentCq))
      str = str + "." + ExceptionInVPackage.GComponentCq;
    IComponentJuliet.e((new File(str)).getParentFile());
    ExceptionInVPackage(paramArrayList, str);
  }

  private void ExceptionInVPackage(ArrayList paramArrayList, String paramString) {
    ArrayListInIPackage ArrayListInIPackage = new ArrayListInIPackage(IComponentJuliet.G());
    try {
      ArrayListInIPackage.ExceptionInVPackage(paramString, paramArrayList);
    } catch (ExceptionInVPackage a1) {
      bV.IInterfaceDelta(
          "Error saving Gauge.\n" + a1.getMessage() + "\nCheck Log for more details", this);
    }
  }

  public Z RInterfaceIndia() {
    ManagerPreferredlayoutsize(false);
    Z z = new Z();
    z.ExceptionInVPackage(getBackground());
    String str = J();
    if (str != null && !str.equals("")) str = IComponentJuliet.ArrayListInIPackage(str);
    z.ExceptionInVPackage(str);
    z.ArrayListInIPackage(K());
    z.ManagerPreferredlayoutsize(C());
    z.ManagerPreferredlayoutsize(au());
    z.ManagerPreferredlayoutsize(this.ba);
    z.ManagerPreferredlayoutsize(I());
    z.ExceptionInVPackage(H());
    Component[] arrayOfComponent = getComponents();
    z.ExceptionInVPackage(arrayOfComponent);
    z.ExceptionInVPackage(this.aP);
    return z;
  }

  public s[] IComponentJuliet() {
    ArrayList<Component> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < getComponentCount(); b1++) {
      if (getComponent(b1) instanceof s) arrayList.add(getComponent(b1));
    }
    s[] arrayOfS = new s[arrayList.size()];
    for (byte b2 = 0; b2 < arrayList.size(); b2++) arrayOfS[b2] = (s) arrayList.get(b2);
    return arrayOfS;
  }

  private String au() {
    try {
      return this.k.RInterfaceIndia();
    } catch (Exception exception) {
      D.ManagerPreferredlayoutsize("Could not get Firmware signature");
      return null;
    }
  }

  public boolean e(String paramString) {
    if (!this.GInterfaceAg) {
      String str = null;
      if (getName() == null
          || getName().equals("")
          || !ExceptionInVPackage.ExceptionInVPackage()
              .ArrayListInIPackage()
              .getLanguage()
              .equals(ExceptionPrintstacktrace.ArrayListInIPackage().getLanguage())) {
        str =
            ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
                    "This Project's dashboard layout has been modified.")
                + "\n"
                + ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
                    "Would you like to save the changes to this project?");
      } else {
        str =
            "The dashboard layout for "
                + getName()
                + " has been modified.\nWould you like to save the changes to this project?";
      }
      int RInterfaceIndia =
          JOptionPane.showConfirmDialog(
              this,
              str,
              ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Save Dashboard?"),
              1,
              3);
      if (RInterfaceIndia == 2) return false;
      if (RInterfaceIndia == 0) {
        f();
        if (paramString != null && !paramString.equals("")) {
          IInterfaceDelta(paramString);
        } else {
          h();
        }
        return true;
      }
      if (RInterfaceIndia == 1) return true;
    }
    return true;
  }

  protected void k() {
    ExceptionInVPackage((ExceptionInVPackage) null);
  }

  public void ExceptionInVPackage(ExceptionInVPackage parama) {
    ManagerPreferredlayoutsize ManagerPreferredlayoutsize = new ManagerPreferredlayoutsize();
    aa aa = new aa();
    String[] arrayOfString1 = T.ExceptionInVPackage().IInterfaceDelta();
    String str = this.k.ArrayListInIPackage();
    String[] arrayOfString2 = new String[arrayOfString1.length];
    if (this.aB != null)
      ManagerPreferredlayoutsize.ExceptionInVPackage(
          ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Default"), this.aB);
    for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
      R r1 = T.ExceptionInVPackage().ArrayListInIPackage(arrayOfString1[b1]);
      if (r1.S()) {
        Z z = ManagerPreferredlayoutsize(r1);
        if (this.aB == null) {
          if (ag() != null) {
            ManagerPreferredlayoutsize.ExceptionInVPackage(ag());
          } else {
            ManagerPreferredlayoutsize.ExceptionInVPackage();
          }
          if (!str.equals(r1.ArrayListInIPackage())) z.IInterfaceDelta(r1.ArrayListInIPackage());
          ManagerPreferredlayoutsize.ExceptionInVPackage(r1.ArrayListInIPackage(), z);
        }
      }
      arrayOfString2[b1] = r1.RInterfaceIndia();
    }
    RInterfaceOscar RInterfaceOscar =
        RInterfacePapa.ExceptionInVPackage().ManagerPreferredlayoutsize();
    ManagerPreferredlayoutsize.ExceptionInVPackage(arrayOfString2, RInterfaceOscar);
    R r = new R(this, ManagerPreferredlayoutsize, arrayOfString2);
    Window window1 = bV.ManagerPreferredlayoutsize(this);
    Window window2 = window1;
    if (!(window2 instanceof java.awt.Dialog) && !(window2 instanceof java.awt.Frame))
      window2 = null;
    ct ct = new ct(window2, (JComponent) ManagerPreferredlayoutsize, "Select Dashboard", r, 7);
    if (parama != null) ct.ExceptionInVPackage(parama);
    bV.ExceptionInVPackage(window1, (Component) ct);
    ct.setVisible(true);
  }

  public void f(String paramString) {
    ArrayListInIPackage ArrayListInIPackage = new ArrayListInIPackage(IComponentJuliet.G());
    Z z = null;
    try {
      z = ArrayListInIPackage.ExceptionInVPackage(paramString);
    } catch (Exception exception) {
      exception.printStackTrace();
      bV.IInterfaceDelta(
          "Error Loading Dashboard file.\n" + paramString + "\nloading default gauge cluster.",
          this);
      z = (new aa()).ExceptionInVPackage(this.k, "FrontPage", 1);
      ArrayListInIPackage.ExceptionInVPackage(paramString, z);
    }
    String str = this.k.RInterfaceIndia();
    RInterfaceOscar RInterfaceOscar =
        RInterfacePapa.ExceptionInVPackage().ManagerPreferredlayoutsize();
    if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("GD;';'RE;'GD;'DG")
        && str != null
        && !RInterfaceOscar.ExceptionInVPackage(str, z.IInterfaceDelta())
        && !aa.ExceptionInVPackage(this.k, z)) {
      boolean bool =
          bV.ExceptionInVPackage(
              "Warning: Gauge Cluster firmware signature '"
                  + z.IInterfaceDelta()
                  + "'\ndoes not match current firmware '"
                  + str
                  + "'.\nYou may need to reset gauge output channels.\n \nContinue Loading?",
              this,
              true);
      if (!bool) {
        k();
        this.ar = paramString;
        h();
        return;
      }
      k(false);
    } else {
      this.GInterfaceAg = true;
    }
    this.ar = paramString;
    ExceptionInVPackage(z);
    validate();
  }

  public void ExceptionInVPackage(Z paramZ) {
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("0rewporewo430932")) {
      T t = T.ExceptionInVPackage();
      R r = t.ArrayListInIPackage();
      if (r != null) (new aa()).ManagerPreferredlayoutsize(r, paramZ);
    }
    ExceptionPrintstacktrace(false);
    ExceptionPrintstacktrace(paramZ.h());
    ExceptionInVPackage(paramZ.RInterfaceIndia());
    ManagerPreferredlayoutsize(paramZ.IComponentJuliet());
    if (getParent() != null) getParent().doLayout();
    Component[] arrayOfComponent1 = getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent1.length; b1++) {
      if (arrayOfComponent1[b1] instanceof s) ArrayListInIPackage((s) arrayOfComponent1[b1]);
    }
    Component[] arrayOfComponent2 = paramZ.ArrayListInIPackage();
    IComponentJuliet(paramZ.f());
    String str = "";
    byte b2 = 0;
    for (byte b3 = 0; b3 < arrayOfComponent2.length; b3++) {
      try {
        if (arrayOfComponent2[b3] != null) {
          ManagerPreferredlayoutsize((s) arrayOfComponent2[b3]);
        } else {
          D.ManagerPreferredlayoutsize("A null gauge was tried to be added?\nThis is wierd.");
        }
      } catch (ExceptionInVPackage a1) {
        if (b2++ < 5) str = str + a1.getMessage() + "\n";
      }
    }
    setBackground(paramZ.ExceptionInVPackage());
    RInterfaceIndia(paramZ.ManagerPreferredlayoutsize());
    IComponentJuliet(paramZ.e());
    ExceptionInVPackage(paramZ.ExceptionPrintstacktrace());
    ManagerPreferredlayoutsize();
    invalidate();
    validate();
    this.Exceptionprintstacktrace = null;
    repaint();
    if (!str.equals(""))
      str =
          str
              + "\n\n"
              + ExceptionPrintstacktrace.ManagerPreferredlayoutsize("To correct this:")
              + "\n"
              + ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
                  "- right click on any Gauge or indicator with ExceptionInVPackage red line"
                      + " through it.")
              + "\n"
              + ExceptionPrintstacktrace.ManagerPreferredlayoutsize(
                  "- Select ExceptionInVPackage valid Gauge or Indicator Template from the menu.");
    e();
    av();
  }

  private void av() {
    e(aw());
    D.ArrayListInIPackage("High Speed Paint: " + (!D() ? 1 : 0));
  }

  private boolean aw() {
    Component[] arrayOfComponent = getComponents();
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < arrayOfComponent.length;
        ManagerPreferredlayoutsize++) {
      if (ExceptionInVPackage(
          arrayOfComponent[ManagerPreferredlayoutsize], ManagerPreferredlayoutsize)) return true;
    }
    return false;
  }

  public boolean imageUpdate(
      Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 == 32) {
      this.ThreadedInTPackage = null;
      aC().getGraphics();
      return true;
    }
    return super.imageUpdate(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  private void ax() {
    String[] arrayOfString = {ExceptionInVPackage.GComponentCq};
    String str =
        bV.ExceptionInVPackage(
            this,
            ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Open Gauge Layout"),
            arrayOfString,
            "*." + ExceptionInVPackage.co,
            IComponentJuliet.h().getAbsolutePath(),
            true);
    if (str == null) return;
    try {
      RInterfaceOscar(str);
    } catch (ExceptionInVPackage a1) {
      bV.IInterfaceDelta(
          "Error loading Gauge.\n" + a1.getMessage() + "\nCheck Log for more details", this);
    }
  }

  private void RInterfaceOscar(String paramString) {
    ExceptionInVPackage(paramString, 0.0D, 0.0D);
  }

  private void ExceptionInVPackage(String paramString, double paramDouble1, double paramDouble2) {
    ArrayListInIPackage ArrayListInIPackage = new ArrayListInIPackage(IComponentJuliet.G());
    ArrayList<s> arrayList = null;
    arrayList = ArrayListInIPackage.ManagerPreferredlayoutsize(paramString);
    try {
      for (byte ManagerPreferredlayoutsize = 0;
          ManagerPreferredlayoutsize < arrayList.size();
          ManagerPreferredlayoutsize++) {
        if (paramDouble1 != 0.0D
            && ((s) arrayList.get(ManagerPreferredlayoutsize)).getRelativeX() + paramDouble1
                < 0.97D) {
          ((s) arrayList.get(ManagerPreferredlayoutsize))
              .setRelativeX(
                  ((s) arrayList.get(ManagerPreferredlayoutsize)).getRelativeX() + paramDouble1);
        } else if (paramDouble1 != 0.0D) {
          ((s) arrayList.get(ManagerPreferredlayoutsize))
              .setRelativeX(
                  ((s) arrayList.get(ManagerPreferredlayoutsize)).getRelativeX() - paramDouble1);
        }
        if (paramDouble2 != 0.0D
            && ((s) arrayList.get(ManagerPreferredlayoutsize)).getRelativeY() + paramDouble2
                < 0.97D) {
          ((s) arrayList.get(ManagerPreferredlayoutsize))
              .setRelativeY(
                  ((s) arrayList.get(ManagerPreferredlayoutsize)).getRelativeY() + paramDouble2);
        } else if (paramDouble2 != 0.0D) {
          ((s) arrayList.get(ManagerPreferredlayoutsize))
              .setRelativeY(
                  ((s) arrayList.get(ManagerPreferredlayoutsize)).getRelativeY() - paramDouble2);
        }
        if (arrayList.get(ManagerPreferredlayoutsize) instanceof Gauge) {
          Gauge gauge = (Gauge) arrayList.get(ManagerPreferredlayoutsize);
          if (gauge.getGroupId() > 0) gauge.setGroupId(gauge.getGroupId() + 1);
        }
        ManagerPreferredlayoutsize(arrayList.get(ManagerPreferredlayoutsize));
        ((s) arrayList.get(ManagerPreferredlayoutsize)).goDead();
      }
    } catch (ExceptionInVPackage a1) {
      bV.IInterfaceDelta(a1.getMessage(), this);
    }
    this.GInterfaceAf.clear();
    for (s s : arrayList) this.GInterfaceAf.add(s);
    GInterfaceAg();
    repaint();
    validate();
  }

  private void ay() {
    Color color =
        bV.ExceptionInVPackage(
            this,
            ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Choose Background Color"),
            getBackground());
    setBackground(color);
    k(false);
  }

  private void az() {
    Color color =
        bV.ExceptionInVPackage(
            this,
            ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Choose Background Dither Color"),
            C());
    ExceptionInVPackage(color);
    k(false);
    this.ThreadedInTPackage = null;
  }

  public void l() {
    this.aq = null;
    this.WInterfaceAp = null;
    this.ThreadedInTPackage = null;
    repaint();
    k(false);
  }

  private void aA() {
    String str = "Select Indicator Off Image";
    ThreadedInTPackage ThreadedInTPackage =
        new ThreadedInTPackage(bV.ManagerPreferredlayoutsize(this), IComponentJuliet.G(), str);
    bV.ExceptionInVPackage(this, (Component) ThreadedInTPackage);
    ThreadedInTPackage.ExceptionInVPackage(new D(this));
    ThreadedInTPackage.setVisible(true);
  }

  public void IInterfaceDelta(s params) {
    if (params instanceof Gauge) {
      ad ad = new ad((Gauge) params);
      ad.ExceptionInVPackage(this);
    }
  }

  public void RComponentMike() {
    String str = ExceptionPrintstacktrace.ManagerPreferredlayoutsize("Add Gauges");
    ArrayList<File> arrayList = new ArrayList();
    arrayList.add(IComponentJuliet.IComponentJuliet());
    arrayList.add(IComponentJuliet.h());
    ExceptionPrintstacktrace ExceptionPrintstacktrace =
        new ExceptionPrintstacktrace(bV.ExceptionInVPackage(this), arrayList, str);
    ExceptionPrintstacktrace.ExceptionInVPackage(
        (et) new dQ((ExceptionInVPackage.ExceptionInVPackage()).an, str));
    w.ExceptionInVPackage(ExceptionPrintstacktrace, this);
    ExceptionPrintstacktrace.ExceptionInVPackage(new E(this));
    ExceptionPrintstacktrace.setVisible(true);
  }

  public void n() {
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("LKMFSLKFDSLK;LKM09")) {
      DashTuningPanel dashTuningPanel = new DashTuningPanel();
      try {
        ManagerPreferredlayoutsize(dashTuningPanel);
        ExceptionInVPackage(dashTuningPanel, true);
      } catch (ExceptionInVPackage a1) {
      }
      validate();
    }
  }

  public void RInterfaceOscar() {
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("LKMFSLKFDSLK;LKM09")) {
      SelectableTableComponent selectableTableComponent = new SelectableTableComponent();
      try {
        ManagerPreferredlayoutsize(selectableTableComponent);
        ExceptionInVPackage(selectableTableComponent, true);
      } catch (ExceptionInVPackage a1) {
      }
      validate();
    }
  }

  public void RInterfacePapa() {
    Indicator indicator = new Indicator();
    try {
      ManagerPreferredlayoutsize(indicator);
      ExceptionInVPackage(indicator, true);
    } catch (ExceptionInVPackage a1) {
    }
    validate();
  }

  public void q() {
    DashLabel dashLabel = new DashLabel();
    try {
      ManagerPreferredlayoutsize(dashLabel);
      ExceptionInVPackage(dashLabel, true);
    } catch (ExceptionInVPackage a1) {
    }
    validate();
  }

  public void ExceptionInVPackage(Component paramComponent) {
    int RInterfaceIndia = getComponentZOrder(paramComponent);
    if (RInterfaceIndia >= 0 && RInterfaceIndia < getComponentCount() - 1)
      add(paramComponent, RInterfaceIndia + 1);
  }

  public void ManagerPreferredlayoutsize(Component paramComponent) {
    int RInterfaceIndia = getComponentZOrder(paramComponent);
    if (RInterfaceIndia > 0 && RInterfaceIndia < getComponentCount() - 1)
      add(paramComponent, RInterfaceIndia - 1);
  }

  public void ArrayListInIPackage(Component paramComponent) {
    add(paramComponent, 0);
  }

  public void IInterfaceDelta(Component paramComponent) {
    add(paramComponent, getComponentCount() - 1);
  }

  public ArrayList r() {
    return this.GInterfaceAf;
  }

  public void ExceptionInVPackage(
      Indicator paramIndicator, String paramString1, String paramString2) {
    Exceptionprintstacktrace Exceptionprintstacktrace = null;
    if (paramString2.equals(ManagerUsingArrayList.ExceptionInVPackage)) {
      Exceptionprintstacktrace =
          IInterfaceDelta.ExceptionInVPackage().ArrayListInIPackage(paramString1);
    } else {
      T t = T.ExceptionInVPackage();
      R r = null;
      if (paramString2 == null || paramString2.length() == 0) {
        r = t.ArrayListInIPackage();
      } else {
        r = t.ArrayListInIPackage(paramString2);
      }
      Exceptionprintstacktrace = r.n(paramString1);
    }
    paramIndicator.setEcuConfigurationName(paramString2);
    paramIndicator.setOutputChannel(Exceptionprintstacktrace.f());
    paramIndicator.setOnText(Exceptionprintstacktrace.ExceptionInVPackage().toString());
    paramIndicator.setOffText(Exceptionprintstacktrace.IInterfaceDelta().toString());
    paramIndicator.setShortClickAction(Exceptionprintstacktrace.l());
    paramIndicator.setLongClickAction(Exceptionprintstacktrace.RComponentMike());
    try {
      paramIndicator.subscribeToOutput();
    } catch (ExceptionInVPackage a1) {
      bV.IInterfaceDelta(a1.getMessage(), this);
    }
    paramIndicator.setDirty(true);
    paramIndicator.repaint();
    this.GInterfaceAg = false;
  }

  private List ExceptionInVPackage(Gauge paramGauge) {
    int RInterfaceIndia = paramGauge.getGroupId();
    ArrayList<Gauge> arrayList = new ArrayList();
    if (RInterfaceIndia == Gauge.Q) {
      arrayList.add(paramGauge);
      return arrayList;
    }
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < getComponentCount();
        ManagerPreferredlayoutsize++) {
      if (getComponent(ManagerPreferredlayoutsize) instanceof Gauge) {
        Gauge gauge = (Gauge) getComponent(ManagerPreferredlayoutsize);
        if (gauge.getGroupId() == RInterfaceIndia && !arrayList.contains(gauge))
          arrayList.add(gauge);
      }
    }
    return arrayList;
  }

  public void ExceptionInVPackage(Gauge paramGauge, String paramString1, String paramString2) {
    T t = T.ExceptionInVPackage();
    R r = null;
    if (paramString2 == null || paramString2.length() == 0) {
      r = t.ArrayListInIPackage();
    } else {
      r = t.ArrayListInIPackage(paramString2);
    }
    GInterfaceAh GInterfaceAh = null;
    if (paramString2.equals(ManagerUsingArrayList.ExceptionInVPackage)) {
      GInterfaceAh = ArrayListInIPackage.ExceptionInVPackage().ExceptionInVPackage(paramString1);
    } else {
      GInterfaceAh = r.k(paramString1);
    }
    if (GInterfaceAh == null) {
      D.ArrayListInIPackage("Gauge:" + paramString1 + " not found in current configuration.");
      return;
    }
    for (Gauge gauge : ExceptionInVPackage(paramGauge)) {
      if (!gauge.title().isEmpty()) gauge.setTitle(GInterfaceAh.k().toString());
      gauge.setEcuConfigurationName(paramString2);
      gauge.setUnits(GInterfaceAh.IComponentJuliet().toString());
      gauge.setMinVP(GInterfaceAh.ManagerPreferredlayoutsize());
      gauge.setMaxVP(GInterfaceAh.e());
      if (gauge.isGoingDead()) gauge.setValue(GInterfaceAh.IInterfaceDelta());
      gauge.setShortClickAction(GInterfaceAh.r());
      gauge.setLongClickAction(GInterfaceAh.s());
      if (gauge.getValue() > GInterfaceAh.IInterfaceDelta()
          || gauge.getValue() < GInterfaceAh.ExceptionInVPackage()) {
        gauge.setValue(GInterfaceAh.ExceptionInVPackage());
        gauge.invalidate();
      }
      gauge.setLowWarningVP(GInterfaceAh.f());
      gauge.setLowCriticalVP(GInterfaceAh.RInterfaceOscar());
      gauge.setHighWarningVP(GInterfaceAh.ExceptionPrintstacktrace());
      gauge.setHighCriticalVP(GInterfaceAh.h());
      gauge.setOutputChannel(GInterfaceAh.RInterfaceIndia());
      gauge.setValueDigitsVP(GInterfaceAh.RComponentMike());
      gauge.setLabelDigits(GInterfaceAh.n());
      try {
        gauge.subscribeToOutput();
      } catch (ExceptionInVPackage a1) {
        bV.IInterfaceDelta(a1.getMessage(), this);
      }
      gauge.invalidate();
      gauge.repaint();
    }
    this.GInterfaceAg = false;
    ExceptionInVPackage(paramGauge, paramString1);
  }

  private void ExceptionInVPackage(s params, String paramString) {
    byte ManagerPreferredlayoutsize = -1;
    for (byte b1 = 0; b1 < getComponentCount(); b1++) {
      if (getComponent(b1).equals(params)) {
        ManagerPreferredlayoutsize = b1;
        break;
      }
    }
    boolean bool = A();
    Iterator<GInterfaceAg> iterator = this.aW.iterator();
    while (iterator.hasNext())
      ((GInterfaceAg) iterator.next())
          .ExceptionInVPackage(ManagerPreferredlayoutsize, paramString, bool);
  }

  private void aB() {
    Iterator<GInterfaceAg> iterator = this.aW.iterator();
    while (iterator.hasNext()) ((GInterfaceAg) iterator.next()).ExceptionInVPackage();
  }

  public void ExceptionInVPackage(GInterfaceAg paramaG) {
    this.aW.add(paramaG);
  }

  public void ExceptionPrintstacktrace(String paramString) {
    for (s s : r()) {
      if (s instanceof Gauge)
        try {
          GaugePainter gaugePainter = (GaugePainter) Class.forName(paramString).newInstance();
          ((Gauge) s).setGaugePainter(gaugePainter);
          Gauge gauge = (Gauge) s;
          gauge.setBackgroundImageFileName((String) null);
          gauge.setNeedleImageFileName((String) null);
        } catch (Exception exception) {
          bV.IInterfaceDelta("Error loading Gauge Painter: " + paramString, this);
          break;
        }
    }
  }

  public void h(String paramString) {
    for (s s : r()) {
      if (s instanceof Indicator)
        try {
          IndicatorPainter indicatorPainter =
              (IndicatorPainter) Class.forName(paramString).newInstance();
          ((Indicator) s).setPainter(indicatorPainter);
          s.repaint();
        } catch (Exception exception) {
          bV.IInterfaceDelta("Error loading Indicator Painter: " + paramString, this);
        }
    }
  }

  private Image aC() {
    if (this.ThreadedInTPackage == null
        || this.ThreadedInTPackage.getWidth(null) != getWidth()
        || this.ThreadedInTPackage.getHeight(null) != getHeight()) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.ThreadedInTPackage =
          graphicsConfiguration.createCompatibleImage(getWidth(), getHeight(), 3);
      Graphics2D graphics2D = (Graphics2D) this.ThreadedInTPackage.getGraphics();
      graphics2D.setRenderingHint(
          RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(
          RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      ExceptionInVPackage(this.ThreadedInTPackage.getGraphics(), true, false);
    }
    return this.ThreadedInTPackage;
  }

  private Image aD() {
    if (this.Exceptionprintstacktrace == null
        || this.Exceptionprintstacktrace.getWidth(null) != getWidth()
        || this.Exceptionprintstacktrace.getHeight(null) != getHeight()) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.Exceptionprintstacktrace =
          graphicsConfiguration.createCompatibleImage(getWidth(), getHeight(), 3);
      Graphics2D graphics2D = (Graphics2D) this.Exceptionprintstacktrace.getGraphics();
      graphics2D.setRenderingHint(
          RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(
          RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      ExceptionInVPackage(graphics2D, true);
      ArrayListInIPackage(graphics2D);
    }
    return this.Exceptionprintstacktrace;
  }

  public boolean s() {
    return (this.an != null || this.aR);
  }

  public void t() {
    if (aE())
      if (this.an == null) {
        D.ArrayListInIPackage("FullScreen");
        y();
      } else {
        D.ArrayListInIPackage("End FullScreen");
        u();
      }
  }

  public void ExceptionInVPackage(u paramu) {
    this.aX.add(paramu);
  }

  public void ManagerPreferredlayoutsize(u paramu) {
    this.aX.remove(paramu);
  }

  private boolean aE() {
    for (u u : this.aX) {
      if (!u.ExceptionInVPackage()) return false;
    }
    return true;
  }

  public void u() {
    if (this.ao != null && this.an != null) {
      this.ao.add(this);
      doLayout();
      this.ao.validate();
      if (J.ArrayListInIPackage())
        ;
      this.an.dispose();
      this.an = null;
      this.RInterfaceIndia = false;
      if (this.ThreadedInTPackage != null) this.ThreadedInTPackage.flush();
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
        this.RInterfaceIndia = false;
        if (this.ThreadedInTPackage != null) this.ThreadedInTPackage.flush();
      }
    }
    return null;
  }

  public void w() {
    Component[] arrayOfComponent = getComponents();
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < arrayOfComponent.length;
        ManagerPreferredlayoutsize++) {
      if (arrayOfComponent[ManagerPreferredlayoutsize] instanceof s) {
        s s = (s) arrayOfComponent[ManagerPreferredlayoutsize];
        this.GInterfaceAf.add(s);
      }
    }
    repaint();
  }

  public void ExceptionInVPackage(Rectangle paramRectangle) {
    Component[] arrayOfComponent = getComponents();
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < arrayOfComponent.length;
        ManagerPreferredlayoutsize++) {
      if (arrayOfComponent[ManagerPreferredlayoutsize] instanceof s) {
        s s = (s) arrayOfComponent[ManagerPreferredlayoutsize];
        Rectangle rectangle = s.getBounds();
        if (rectangle.x > paramRectangle.x
            && rectangle.y > paramRectangle.y
            && rectangle.x + rectangle.width < paramRectangle.x + paramRectangle.width
            && rectangle.y + rectangle.height < paramRectangle.y + paramRectangle.height
            && !this.GInterfaceAf.contains(s)) this.GInterfaceAf.add(s);
      }
    }
    GInterfaceAg();
  }

  public boolean e(s params) {
    return this.GInterfaceAf.contains(params);
  }

  public int x() {
    String str = ArrayListInIPackage(aL, "-1");
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException numberFormatException) {
      return -1;
    }
  }

  public void y() {
    ExceptionInVPackage(x());
  }

  public void ExceptionInVPackage(Window paramWindow) {
    if (this.aO) {
      if (s()) u();
      this.ao = getParent();
      this.an = paramWindow;
      JPanel jPanel = new JPanel();
      jPanel.setDoubleBuffered(true);
      jPanel.setLayout((LayoutManager) new ManagerPreferredlayoutsize());
      jPanel.setBackground(getBackground());
      jPanel.add(this);
      this.an.add("Center", jPanel);
      this.an.validate();
      this.an.doLayout();
      this.ThreadedInTPackage = null;
      repaint();
      validate();
      requestFocus();
      this.ao.repaint();
    }
  }

  public void ExceptionInVPackage(int paramInt) {
    if (this.aO && !s()) {
      GraphicsDevice graphicsDevice;
      Rectangle rectangle;
      this.ao = getParent();
      JDialog jDialog = new JDialog(bV.ExceptionInVPackage(this));
      jDialog.setUndecorated(true);
      this.an = jDialog;
      this.an.setLayout(new BorderLayout());
      if (J.ManagerPreferredlayoutsize() || paramInt < 0) {
        graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        Point point = MouseInfo.getPointerInfo().getLocation();
        rectangle = dn.ExceptionInVPackage(point.x, point.y);
      } else {
        graphicsDevice =
            GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[paramInt];
        rectangle = dn.ExceptionInVPackage(paramInt);
      }
      this.an.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
      JPanel jPanel = new JPanel();
      jPanel.setDoubleBuffered(true);
      jPanel.setLayout((LayoutManager) new ManagerPreferredlayoutsize());
      jPanel.setBackground(getBackground());
      jPanel.add(this);
      this.an.add("Center", jPanel);
      if (J.ArrayListInIPackage()) {
        K.ExceptionInVPackage(this.an);
        K.ManagerPreferredlayoutsize(this.an);
      } else if (!J.ExceptionInVPackage() && graphicsDevice.isFullScreenSupported()) {
        graphicsDevice.setFullScreenWindow(this.an);
      }
      this.an.setVisible(true);
      this.an.validate();
      this.ao.repaint();
      ManagerPreferredlayoutsize(aL, "" + paramInt);
    }
  }

  private void ManagerPreferredlayoutsize(String paramString1, String paramString2) {
    if (this.IComponentJuliet != null)
      this.IComponentJuliet.ExceptionInVPackage(paramString1, paramString2);
  }

  private String ArrayListInIPackage(String paramString1, String paramString2) {
    return (this.IComponentJuliet != null)
        ? this.IComponentJuliet.ManagerPreferredlayoutsize(paramString1, paramString2)
        : paramString2;
  }

  public s ExceptionInVPackage(int paramInt1, int paramInt2) {
    for (s s : r()) {
      int k = s.getX() + s.getWidth() - this.am;
      int RComponentMike = s.getY() + s.getHeight() - this.am;
      int n = s.getX() + s.getWidth();
      int i1 = s.getY() + s.getHeight();
      if (paramInt1 >= k && paramInt1 <= n && paramInt2 >= RComponentMike && paramInt2 <= i1)
        return s;
    }
    Component[] arrayOfComponent = getComponents();
    for (int RInterfaceIndia = getComponentCount() - 1; RInterfaceIndia >= 0; RInterfaceIndia--) {
      if (arrayOfComponent[RInterfaceIndia] instanceof s) {
        s s = (s) arrayOfComponent[RInterfaceIndia];
        int k = s.getX();
        int RComponentMike = s.getY();
        int n = s.getX() + s.getWidth();
        int i1 = s.getY() + s.getHeight();
        if (s instanceof aR) {
          aR aR = (aR) s;
          if (paramInt1 >= k
              && paramInt1 <= n
              && paramInt2 >= RComponentMike
              && paramInt2 <= i1
              && aR.isComponentPaintedAt(paramInt1 - k, paramInt2 - RComponentMike)) return s;
        } else if (paramInt1 >= k
            && paramInt1 <= n
            && paramInt2 >= RComponentMike
            && paramInt2 <= i1) {
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

  public void ExceptionInVPackage(dR paramdR) {
    this.aU.add(paramdR);
  }

  private void IInterfaceDelta(String paramString1, String paramString2) {
    Iterator<dR> iterator = this.aU.iterator();
    while (iterator.hasNext()) {
      try {
        dR dR = iterator.next();
        dR.ExceptionInVPackage(paramString1, paramString2);
      } catch (Exception exception) {
        D.ManagerPreferredlayoutsize(
            "Problem encountered while notifying PropertyChangedListener. Ignored and continued.");
        exception.printStackTrace();
      }
    }
  }

  public boolean z() {
    return this.av;
  }

  public void ArrayListInIPackage(boolean paramBoolean) {
    this.av = paramBoolean;
  }

  public void ExceptionInVPackage(String paramString, byte[] paramArrayOfbyte) {
    if (paramString.equals(this.k.ArrayListInIPackage()) && this.f != null)
      this.f.ArrayListInIPackage();
  }

  public void close() {
    D.ArrayListInIPackage("Closing Dashboard " + getName());
    ArrayListInIPackage();
  }

  public boolean A() {
    return this.aS;
  }

  public void IInterfaceDelta(boolean paramBoolean) {
    this.aS = paramBoolean;
  }

  public boolean B() {
    return ExceptionInVPackage.ExceptionInVPackage()
        .ArrayListInIPackage(ExceptionInVPackage.bo, true);
  }

  public Color C() {
    return this.aJ;
  }

  public void ExceptionInVPackage(Color paramColor) {
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

  private void GInterfaceAf() {
    Z z = ManagerPreferredlayoutsize(this.k);
    ExceptionInVPackage(z);
    Iterator<GInterfaceAg> iterator = this.aW.iterator();
    while (iterator.hasNext()) ((GInterfaceAg) iterator.next()).ExceptionInVPackage();
  }

  public void E() {
    Component[] arrayOfComponent = getComponents();
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < arrayOfComponent.length;
        ManagerPreferredlayoutsize++) {
      if (arrayOfComponent[ManagerPreferredlayoutsize] instanceof s)
        ArrayListInIPackage((s) arrayOfComponent[ManagerPreferredlayoutsize]);
    }
    RInterfaceIndia((String) null);
    ExceptionInVPackage((Image) null);
  }

  public void ExceptionInVPackage(WInterfaceAp paramap) {
    this.IComponentJuliet = paramap;
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

  public void ExceptionPrintstacktrace(boolean paramBoolean) {
    this.ba = paramBoolean;
  }

  public double H() {
    return this.bb;
  }

  public void ExceptionInVPackage(double paramDouble) {
    this.bb = paramDouble;
  }

  public double I() {
    return this.bc;
  }

  public void ManagerPreferredlayoutsize(double paramDouble) {
    this.bc = paramDouble;
  }

  public synchronized void h(boolean paramBoolean) {
    if (this.bd ^ paramBoolean)
      if (paramBoolean) {
        for (Component component : getComponents()) {
          if (component instanceof s) {
            s s = (s) component;
            try {
              s.subscribeToOutput();
            } catch (ExceptionInVPackage a1) {
            }
          }
        }
      } else {
        for (Component component : getComponents()) {
          if (component instanceof s) {
            s s = (s) component;
            try {
              s.unsubscribeToOutput();
            } catch (ExceptionInVPackage a1) {
              D.ManagerPreferredlayoutsize(
                  "Failed to subscribe DashComponent: " + a1.getLocalizedMessage());
            }
          }
        }
      }
    this.bd = paramBoolean;
  }

  public String J() {
    return (this.WInterfaceAp == null) ? "" : this.WInterfaceAp;
  }

  public void ExceptionInVPackage(Image paramImage) {
    this.aq = paramImage;
  }

  public void RInterfaceIndia(String paramString) {
    this.WInterfaceAp = paramString;
    this.aq = null;
    this.ThreadedInTPackage = null;
  }

  public String K() {
    return this.aK;
  }

  public void IComponentJuliet(String paramString) {
    if (paramString != null
        && (paramString.equals(RInterfacePapa)
            || paramString.equals(RInterfaceOscar)
            || paramString.equals(n))) {
      this.aK = paramString;
      this.ThreadedInTPackage = null;
    }
  }

  public void setMinimumSize(Dimension paramDimension) {
    this.as = paramDimension;
  }

  public boolean L() {
    return this.at;
  }

  public void RInterfaceIndia(boolean paramBoolean) {
    if (paramBoolean) this.GInterfaceAg = false;
    this.at = paramBoolean;
    this.ThreadedInTPackage = null;
    this.Exceptionprintstacktrace = null;
    repaint();
    IInterfaceDelta(Y, "" + paramBoolean);
  }

  public boolean M() {
    return this.aP;
  }

  public void N() {
    this.GInterfaceAf.clear();
    GInterfaceAg();
  }

  public void ExceptionInVPackage(s params, boolean paramBoolean) {
    if (paramBoolean) this.GInterfaceAf.clear();
    if (this.GInterfaceAf.contains(params) && !paramBoolean) {
      this.GInterfaceAf.remove(params);
    } else {
      if (!this.GInterfaceAf.contains(params)) this.GInterfaceAf.add(params);
      if (params instanceof Gauge) {
        Gauge gauge = (Gauge) params;
        if (gauge.getGroupId() != Gauge.Q) ManagerPreferredlayoutsize(gauge.getGroupId());
      }
    }
    GInterfaceAg();
  }

  private void ManagerPreferredlayoutsize(int paramInt) {
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < getComponentCount();
        ManagerPreferredlayoutsize++) {
      if (getComponent(ManagerPreferredlayoutsize) instanceof Gauge) {
        Gauge gauge = (Gauge) getComponent(ManagerPreferredlayoutsize);
        if (gauge.getGroupId() == paramInt
            && gauge.getGroupId() != Gauge.Q
            && !this.GInterfaceAf.contains(gauge)) this.GInterfaceAf.add(gauge);
      }
    }
  }

  public void IComponentJuliet(boolean paramBoolean) {
    this.aP = paramBoolean;
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < getComponentCount();
        ManagerPreferredlayoutsize++) {
      if (getComponent(ManagerPreferredlayoutsize) instanceof s) {
        s s = (s) getComponent(ManagerPreferredlayoutsize);
        s.setAntialiasingOn(paramBoolean);
      }
    }
    this.ThreadedInTPackage = null;
    repaint();
    IInterfaceDelta("antiAliasingOn", "" + paramBoolean);
  }

  public w O() {
    if (this.aE == null) {
      this.aE = new w();
      ExceptionInVPackage((f) this.aE);
    }
    return this.aE;
  }

  public void P() {
    for (s s : r()) {
      s.setLocation((s.getLocation()).x + 1, (s.getLocation()).y);
      s.updateRelativeBoundsToCurrent();
    }
    ExceptionInVPackage(true);
  }

  public void Q() {
    for (s s : r()) {
      s.setLocation((s.getLocation()).x - 1, (s.getLocation()).y);
      s.updateRelativeBoundsToCurrent();
    }
    ExceptionInVPackage(true);
  }

  public void R() {
    for (s s : r()) {
      s.setLocation((s.getLocation()).x, (s.getLocation()).y - 1);
      s.updateRelativeBoundsToCurrent();
    }
    ExceptionInVPackage(true);
  }

  public void S() {
    for (s s : r()) {
      s.setLocation((s.getLocation()).x, (s.getLocation()).y + 1);
      s.updateRelativeBoundsToCurrent();
    }
    ExceptionInVPackage(true);
  }

  public void T() {
    for (s s : this.GInterfaceAf) {
      s.setSize(s.getWidth() + 1, s.getHeight());
      s.updateRelativeBoundsToCurrent();
      s.validate();
    }
    ExceptionInVPackage(true);
  }

  public void U() {
    for (s s : this.GInterfaceAf) {
      s.setSize(s.getWidth() - 1, s.getHeight());
      s.updateRelativeBoundsToCurrent();
      s.validate();
    }
  }

  public void V() {
    for (s s : this.GInterfaceAf) {
      s.setSize(s.getWidth(), s.getHeight() + 1);
      s.updateRelativeBoundsToCurrent();
      s.validate();
    }
  }

  public void W() {
    for (s s : this.GInterfaceAf) {
      s.setSize(s.getWidth(), s.getHeight() - 1);
      s.updateRelativeBoundsToCurrent();
      s.validate();
    }
  }

  public T X() {
    if (this.au == null) this.au = new T(this, this);
    return this.au;
  }

  public void Y() {
    Component[] arrayOfComponent = getComponents();
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < arrayOfComponent.length;
        ManagerPreferredlayoutsize++) {
      if (arrayOfComponent[ManagerPreferredlayoutsize] instanceof s) {
        if (ExceptionPrintstacktrace() == null) {
          ExceptionInVPackage((s) arrayOfComponent[ManagerPreferredlayoutsize], true);
          repaint();
          return;
        }
        if (r().contains(arrayOfComponent[ManagerPreferredlayoutsize])) {
          if (arrayOfComponent.length > ManagerPreferredlayoutsize + 1
              && arrayOfComponent[ManagerPreferredlayoutsize + 1] instanceof s) {
            ExceptionInVPackage((s) arrayOfComponent[ManagerPreferredlayoutsize + 1], true);
            repaint();
            return;
          }
          if (arrayOfComponent[0] instanceof s) {
            ExceptionInVPackage((s) arrayOfComponent[0], true);
            repaint();
            return;
          }
        }
      }
    }
  }

  public void Z() {
    Component[] arrayOfComponent = getComponents();
    for (int RInterfaceIndia = arrayOfComponent.length - 1;
        RInterfaceIndia >= 0;
        RInterfaceIndia--) {
      if (arrayOfComponent[RInterfaceIndia] instanceof s) {
        if (ExceptionPrintstacktrace() == null) {
          ExceptionInVPackage((s) arrayOfComponent[RInterfaceIndia], true);
          repaint();
          return;
        }
        if (r().contains(arrayOfComponent[RInterfaceIndia])) {
          if (RInterfaceIndia > 0 && arrayOfComponent[RInterfaceIndia - 1] instanceof s) {
            ExceptionInVPackage((s) arrayOfComponent[RInterfaceIndia - 1], true);
            repaint();
            return;
          }
          if (arrayOfComponent[arrayOfComponent.length - 1] instanceof s) {
            ExceptionInVPackage((s) arrayOfComponent[arrayOfComponent.length - 1], true);
            repaint();
            return;
          }
        }
      }
    }
  }

  public void ExceptionInVPackage(f paramf) {
    this.aV.add(paramf);
  }

  private void GInterfaceAg() {
    for (f f : this.aV) f.ExceptionInVPackage(r());
  }

  public String aa() {
    return this.aH;
  }

  public void k(String paramString) {
    if (!F()) ExceptionInVPackage(paramString, false);
  }

  public void ExceptionInVPackage(String paramString, boolean paramBoolean) {
    this.aH = paramString;
    for (byte ManagerPreferredlayoutsize = 0;
        ManagerPreferredlayoutsize < getComponentCount();
        ManagerPreferredlayoutsize++) {
      if (getComponent(ManagerPreferredlayoutsize) instanceof s) {
        s s = (s) getComponent(ManagerPreferredlayoutsize);
        s.setDirty(true);
      }
    }
    this.ThreadedInTPackage = null;
    this.al = null;
    repaint();
    if (paramString != null && paramString.length() > 0) {
      ArrayListInIPackage(!paramBoolean);
    } else {
      ArrayListInIPackage(true);
    }
  }

  public void ab() {
    k((String) null);
  }

  public void l(String paramString) {
    this.aI = paramString;
    this.ThreadedInTPackage = null;
    this.al = null;
    repaint();
  }

  public void ac() {
    l((String) null);
  }

  public String ad() {
    return this.ar;
  }

  public void RComponentMike(String paramString) {
    this.ar = paramString;
  }

  public boolean ae() {
    return this.GInterfaceAg;
  }

  public void k(boolean paramBoolean) {
    this.GInterfaceAg = paramBoolean;
  }

  public boolean af() {
    return (this.aO && RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("d67nhtrbd4es8j"));
  }

  public void l(boolean paramBoolean) {
    this.aO = paramBoolean;
  }

  public Z ManagerPreferredlayoutsize(R paramR) {
    if (this.aB != null) return this.aB;
    aa aa = new aa();
    try {
      this.aC = aa.ExceptionInVPackage(paramR, "FrontPage", 1);
    } catch (ExceptionInVPackage a1) {
      Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
      this.aC = aa.ExceptionInVPackage(paramR, "FrontPage", 2, 4);
    }
    return this.aC;
  }

  public void ManagerPreferredlayoutsize(Z paramZ) {
    this.aB = paramZ;
  }

  public String ag() {
    return this.aD;
  }

  public void n(String paramString) {
    this.aD = paramString;
  }

  private boolean ExceptionInVPackage(IInterfaceDelta paramd) {
    if (paramd.getShortClickAction() != null && !paramd.getShortClickAction().isEmpty())
      try {
        ExceptionPrintstacktrace.ExceptionInVPackage()
            .ArrayListInIPackage(paramd.getShortClickAction());
        return true;
      } catch (e e) {
        bV.IInterfaceDelta(e.getLocalizedMessage(), this.ao);
        D.ExceptionInVPackage("Unable to fire Action: " + e.getLocalizedMessage());
      }
    return false;
  }

  private void ManagerPreferredlayoutsize(IInterfaceDelta paramd) {
    if (paramd.getLongClickAction() != null && !paramd.getLongClickAction().isEmpty())
      try {
        ExceptionPrintstacktrace.ExceptionInVPackage()
            .ArrayListInIPackage(paramd.getLongClickAction());
      } catch (e e) {
        bV.IInterfaceDelta(e.getLocalizedMessage(), this.ao);
        Logger.getLogger(x.class.getName())
            .log(Level.SEVERE, "Unable to fire Action", (Throwable) e);
      }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
