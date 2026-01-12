package com.efiAnalytics.apps.ts.dashboard;

import G.B;
import G.GInterfaceCz;
import G.GInterfaceDa;
import G.GInterfaceDb;
import G.GInterfaceDj;
import G.GInterfaceDk;
import G.ManagerUsingConcurrentHashMap;
import G.c;
import G.i;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.X;
import com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.RoundAnalogGaugePainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.f;
import com.efiAnalytics.ui.eJ;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Area;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.ExceptionPrintstacktrace;

public class Gauge extends SingleChannelDashComponent
    implements ManagerUsingConcurrentHashMap, Serializable {
  protected GInterfaceDj ExceptionInVPackage = (GInterfaceDj) new B(0.0D);

  protected GInterfaceDj b = (GInterfaceDj) new B(100.0D);

  private GInterfaceDj T = (GInterfaceDj) new B(Double.NEGATIVE_INFINITY);

  protected GInterfaceDj c = (GInterfaceDj) new B(Double.NEGATIVE_INFINITY);

  protected GInterfaceDj d = (GInterfaceDj) new B(85.0D);

  protected GInterfaceDj f = (GInterfaceDj) new B(93.0D);

  private double U = 0.0D;

  private double V = 100.0D;

  protected int ExceptionPrintstacktrace = 0;

  protected int h = 360;

  protected int i = 300;

  protected int j = 300;

  private boolean W = false;

  protected GInterfaceDb k = (GInterfaceDb) new c("Units");

  protected GInterfaceDb l = (GInterfaceDb) new c("Demo");

  protected GInterfaceDj m = (GInterfaceDj) new B(1.0D);

  private int X = -1;

  protected int n = 0;

  protected int o = 8;

  private double Y = Double.NaN;

  protected int p = 0;

  protected double q = -1.0D;

  protected double r = -1.0D;

  public static Color s = new Color(245, 245, 245);

  public static Color t = new Color(105, 105, 122);

  public static Color u = new Color(29, 31, 82);

  public static Color v = new Color(0, 0, 102);

  protected Color w = s;

  protected Color x = u;

  protected Color y = t;

  protected Color z = Color.yellow;

  protected Color A = Color.red;

  protected Color B = v;

  protected String C = "";

  protected double D = 0.0D;

  protected double E = 0.0D;

  private long Z = 0L;

  private double aa = 0.0D;

  private int ab = 15000;

  private long ac = 0L;

  private boolean ad = true;

  public static int F = 0;

  public static int G = 1;

  private int ae = G;

  private boolean af = true;

  private boolean ag = false;

  protected GaugePainter H = null;

  private transient aH ah = null;

  private String ai = null;

  private transient Image aj = null;

  private String ak = null;

  private transient Image al = null;

  GInterfaceCz I = null;

  w J = new w(this);

  w K = new w(this);

  w L = new w(this);

  w M = new w(this);

  w N = new w(this);

  w O = new w(this);

  w P = new w(this);

  private int am = 0;

  public static int Q = 0;

  int R = -1;

  private String an = null;

  private String ao = null;

  private String ap = null;

  private String aq = null;

  public Gauge() {
    setGaugePainter((GaugePainter) new RoundAnalogGaugePainter());
    this.I = new v(this);
  }

  public void paint(Graphics paramGraphics) {
    if (this.H != null && getWidth() > 0 && getHeight() > 0) {
      this.H.paintGauge(paramGraphics, this);
      if (isInvalidState()) paintInvalid(paramGraphics);
    }
    setDirty(false);
  }

  private void paintInvalid(Graphics paramGraphics) {
    if (getBackColor().getRed() > 220
        && getBackColor().getBlue() < 92
        && getBackColor().getGreen() < 92) {
      paramGraphics.setXORMode(getBackColor());
    } else {
      paramGraphics.setColor(Color.red);
    }
    BasicStroke basicStroke = new BasicStroke(eJ.ExceptionInVPackage(3));
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    graphics2D.setStroke(basicStroke);
    graphics2D.setRenderingHint(
        RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    int i = getHeight() - 1;
    paramGraphics.drawOval((getWidth() - i) / 2, 0, i, i);
    int j = (int) ((i / 2) * 1.414213D / 2.0D);
    int k = getWidth() / 2;
    int m = getHeight() / 2;
    paramGraphics.drawLine(k - j, m - j, k + j, m + j);
    paramGraphics.drawRect(1, 1, getWidth() - 3, getHeight() - 3);
  }

  public void invalidate() {
    if (this.H != null) {
      this.E = getValue();
      this.H.invalidate();
    }
    this.X = -1;
    super.invalidate();
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.H != null && (paramInt3 != getWidth() || paramInt4 != getHeight()))
      this.H.invalidate();
    this.R = paramInt2;
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public GaugePainter getGaugePainter() {
    return this.H;
  }

  public void setGaugePainter(GaugePainter paramGaugePainter) {
    this.H = paramGaugePainter;
    paramGaugePainter.initialize(this);
    repaint();
  }

  public double min() {
    return getDefaultMin();
  }

  public double getMin() {
    return min();
  }

  public void initializeExpressionMonitors() {
    initExpressionMonitor(this.J, this.ExceptionInVPackage);
    initExpressionMonitor(this.K, this.b);
    initExpressionMonitor(this.M, this.T);
    initExpressionMonitor(this.L, this.c);
    initExpressionMonitor(this.O, this.f);
    initExpressionMonitor(this.N, this.d);
    initExpressionMonitor(this.P, this.m);
  }

  public GInterfaceDj getMinVP() {
    return this.ExceptionInVPackage;
  }

  public void setMin(Object paramObject) {
    if (!(this.ExceptionInVPackage instanceof G.bR)) {
      try {
        this.ExceptionInVPackage = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
        initExpressionMonitor(this.J, this.ExceptionInVPackage);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(Gauge.class.getName())
            .log(Level.WARNING, "Failed to set min monitor", (Throwable) ExceptionPrintstacktrace);
      }
      invalidatePainter();
    }
  }

  public void setMinVP(Object paramObject) {
    try {
      this.ExceptionInVPackage = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
      initExpressionMonitor(this.J, this.ExceptionInVPackage);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName())
          .log(Level.WARNING, "Failed to set up Min Monitor", (Throwable) ExceptionPrintstacktrace);
    }
    invalidatePainter();
  }

  private void initExpressionMonitor(w paramw, GInterfaceDj paramdj) {
    if (this.I.ExceptionInVPackage() != null && !this.I.ExceptionInVPackage().isEmpty()) {
      ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(paramw);
      try {
        i.ExceptionInVPackage(this.I.ExceptionInVPackage(), paramdj, paramw);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        D.ExceptionInVPackage((Exception) ExceptionInVPackage);
      }
    }
  }

  public double max() {
    return getDefaultMax();
  }

  public double getMax() {
    return max();
  }

  public GInterfaceDj getMaxVP() {
    return this.b;
  }

  public void setMax(Object paramObject) {
    if (!(this.b instanceof G.bR)) {
      try {
        this.b = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
        initExpressionMonitor(this.K, this.b);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(Gauge.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      }
      invalidatePainter();
    }
  }

  public void setMaxVP(Object paramObject) {
    try {
      this.b = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
      initExpressionMonitor(this.K, this.b);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
    }
    invalidatePainter();
  }

  public double lowWarning() {
    return this.c.ExceptionInVPackage();
  }

  public double getLowWarning() {
    return lowWarning();
  }

  public GInterfaceDj getLowWarningVP() {
    return this.c;
  }

  public void setLowWarning(Object paramObject) {
    if (!(this.c instanceof G.bR)) {
      try {
        this.c = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
        initExpressionMonitor(this.L, this.c);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(Gauge.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      }
      invalidatePainter();
    }
  }

  public void setLowWarningVP(Object paramObject) {
    try {
      this.c = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
      initExpressionMonitor(this.L, this.c);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
    }
    invalidatePainter();
  }

  public double highWarning() {
    return this.d.ExceptionInVPackage();
  }

  public double getHighWarning() {
    return highWarning();
  }

  public GInterfaceDj getHighWarningVP() {
    return this.d;
  }

  public void setHighWarningVP(Object paramObject) {
    try {
      this.d = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
      initExpressionMonitor(this.N, this.d);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
    }
    invalidatePainter();
  }

  public void setHighWarning(Object paramObject) {
    if (!(this.d instanceof G.bR)) {
      try {
        this.d = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
        initExpressionMonitor(this.N, this.d);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(Gauge.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      }
      invalidatePainter();
    }
  }

  public double highCritical() {
    return this.f.ExceptionInVPackage();
  }

  public double getHighCritical() {
    return highCritical();
  }

  public GInterfaceDj getHighCriticalVP() {
    return this.f;
  }

  public void setHighCritical(Object paramObject) {
    if (!(this.f instanceof G.bR)) {
      try {
        this.f = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
        initExpressionMonitor(this.O, this.f);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(Gauge.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      }
      invalidatePainter();
    }
  }

  public void setHighCriticalVP(Object paramObject) {
    try {
      this.f = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
      initExpressionMonitor(this.O, this.f);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
    }
    invalidatePainter();
  }

  public double lowCritical() {
    return this.T.ExceptionInVPackage();
  }

  public double getLowCritical() {
    return lowCritical();
  }

  public GInterfaceDj getLowCriticalVP() {
    return this.T;
  }

  public void setLowCritical(Object paramObject) {
    if (!(this.T instanceof G.bR)) {
      try {
        this.T = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
        initExpressionMonitor(this.M, this.T);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(Gauge.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      }
      invalidatePainter();
    }
  }

  public void setLowCriticalVP(Object paramObject) {
    try {
      this.T = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
      initExpressionMonitor(this.M, this.T);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
    }
    invalidatePainter();
  }

  public boolean isPegLimits() {
    return this.ad;
  }

  public void setPegLimits(boolean paramBoolean) {
    this.ad = paramBoolean;
  }

  public int getGroupId() {
    return this.am;
  }

  public void setGroupId(int paramInt) {
    this.am = paramInt;
  }

  public int getStartAngle() {
    return this.ExceptionPrintstacktrace;
  }

  public void setStartAngle(int paramInt) {
    this.ExceptionPrintstacktrace = paramInt;
    invalidatePainter();
  }

  public int getFaceAngle() {
    return this.h;
  }

  public void setFaceAngle(int paramInt) {
    this.h = paramInt;
    invalidatePainter();
  }

  public String units() {
    try {
      String str = this.k.ExceptionInVPackage();
      if (this.an != null && str.equals(this.an)) return this.ao;
      this.an = str;
      this.ao = ExceptionPrintstacktrace.b(str);
      return this.ao;
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      return "";
    }
  }

  public void setUnits(String paramString) {
    try {
      this.k = GInterfaceDa.ExceptionInVPackage().ExceptionInVPackage(this.I, paramString);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
    }
    invalidatePainter();
  }

  public String getUnits() {
    return this.k.toString();
  }

  public String title() {
    try {
      String str = this.l.ExceptionInVPackage();
      if (this.ap != null && str.equals(this.ap)) return this.aq;
      this.ap = str;
      this.aq = ExceptionPrintstacktrace.b(str);
      return this.aq;
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      return "Error";
    }
  }

  public String getTitle() {
    return this.l.toString();
  }

  public void setTitle(String paramString) {
    try {
      this.l = GInterfaceDa.ExceptionInVPackage().ExceptionInVPackage(this.I, paramString);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
    }
    invalidatePainter();
  }

  public int valueDigits() {
    if (this.X == -1) this.X = (int) Math.round(this.m.ExceptionInVPackage());
    return this.X;
  }

  public int getValueDigits() {
    return valueDigits();
  }

  public GInterfaceDj getValueDigitsVP() {
    return this.m;
  }

  public void setValueDigits(Object paramObject) {
    if (!(this.m instanceof G.bR)) {
      try {
        this.m = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
        initExpressionMonitor(this.P, this.m);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(Gauge.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      }
      invalidatePainter();
    }
    this.X = -1;
  }

  public void setValueDigitsVP(Object paramObject) {
    try {
      this.m = GInterfaceDk.ExceptionInVPackage(this.I, paramObject.toString());
      initExpressionMonitor(this.P, this.m);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
    }
    invalidatePainter();
  }

  public int getLabelDigits() {
    return this.n;
  }

  public void setLabelDigits(int paramInt) {
    this.n = paramInt;
    invalidatePainter();
  }

  public double getMajorTicks() {
    return this.q;
  }

  public void setMajorTicks(double paramDouble) {
    this.q = paramDouble;
    invalidatePainter();
  }

  public double getMinorTicks() {
    return this.r;
  }

  public void setMinorTicks(double paramDouble) {
    this.r = paramDouble;
    invalidatePainter();
  }

  public Color getBackColor() {
    return this.w;
  }

  public void setBackColor(Color paramColor) {
    this.w = paramColor;
    invalidatePainter();
  }

  public Color getFontColor() {
    return this.x;
  }

  public void setFontColor(Color paramColor) {
    this.x = paramColor;
    invalidatePainter();
  }

  public Color getTrimColor() {
    return this.y;
  }

  public void setTrimColor(Color paramColor) {
    this.y = paramColor;
    invalidatePainter();
  }

  public Color getWarnColor() {
    return this.z;
  }

  public void setWarnColor(Color paramColor) {
    this.z = paramColor;
    invalidatePainter();
  }

  public Color getCriticalColor() {
    return this.A;
  }

  public void setCriticalColor(Color paramColor) {
    this.A = paramColor;
    invalidatePainter();
  }

  public Color getNeedleColor() {
    return this.B;
  }

  public void setNeedleColor(Color paramColor) {
    this.B = paramColor;
  }

  public int getSweepAngle() {
    return this.i;
  }

  public void setSweepAngle(int paramInt) {
    this.i = paramInt;
    invalidatePainter();
  }

  public int getSweepBeginDegree() {
    return this.j;
  }

  public void setSweepBeginDegree(int paramInt) {
    this.j = paramInt;
    invalidatePainter();
  }

  public String getGaugeStyle() {
    return this.H.getName();
  }

  public String getDisplayValue() {
    return X.c(getValue(), valueDigits());
  }

  public double getValue() {
    return this.D;
  }

  public void setValue(double paramDouble) {
    updateSmoothedValue(paramDouble);
    boolean bool =
        (getValue() != paramDouble
                || Math.abs(this.E - paramDouble)
                        / (this.b.ExceptionInVPackage()
                            - this.ExceptionInVPackage.ExceptionInVPackage())
                    > 0.004D)
            ? true
            : false;
    this.D = paramDouble;
    if (bool && myGaugeContainer() != null) {
      myGaugeContainer().ExceptionInVPackage(this);
      setDirty(true);
    }
  }

  public boolean isRunDemo() {
    return false;
  }

  public void setRunDemo(boolean paramBoolean) {}

  public boolean isShapeLockedToAspect() {
    return this.H.isShapeLockedToAspect();
  }

  public boolean isGoingDead() {
    return false;
  }

  public void setCurrentOutputChannelValue(String paramString1, String paramString2) {}

  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (!Double.isNaN(paramDouble)) {
      setValue(paramDouble);
      double d = paramDouble;
      if (getHistoricalPeakValue() < d
          || System.currentTimeMillis() - this.ac > getHistoryDelay()) {
        this.ac = System.currentTimeMillis();
        setHistoricalPeakValue(d);
      }
      if (this.ah != null) this.ah.ExceptionInVPackage(paramDouble);
    }
  }

  private double updateSmoothedValue(double paramDouble) {
    if (this.ae == G) {
      long l = System.nanoTime() - this.Z;
      this.Z = System.nanoTime();
      if (l < 250000000L && !Double.isInfinite(this.E)) {
        double d = this.E;
        this.E = (this.D * l + d * 6.0E7D) / (l + 60000000L);
      } else {
        this.E = paramDouble;
      }
    } else {
      this.E = paramDouble;
    }
    return this.E;
  }

  public double getSmoothedValue() {
    return this.E;
  }

  public void goDead() {}

  public boolean isMustPaint() {
    return (!isValid()
        || getBackColor().getAlpha() < 200
        || getWarnColor().getAlpha() < 200
        || getCriticalColor().getAlpha() < 200);
  }

  public void paintBackground(Graphics paramGraphics) {
    if (this.H != null) this.H.paintBackground(paramGraphics, this);
  }

  public boolean requiresBackgroundRepaint() {
    return !isValid() ? true : ((this.H != null) ? this.H.requiresBackgroundRepaint(this) : false);
  }

  public void updateGauge(Graphics paramGraphics) {
    if (this.H != null) this.H.updateGauge(paramGraphics, this);
    if (isInvalidState()) paintInvalid(paramGraphics);
  }

  public boolean isDisplayValueAt180() {
    return this.ag;
  }

  public void setDisplayValueAt180(boolean paramBoolean) {
    this.ag = paramBoolean;
  }

  public int getNeedleSmoothing() {
    return this.ae;
  }

  public void setNeedleSmoothing(int paramInt) {
    this.ae = paramInt;
  }

  public double getDefaultMin() {
    return Double.isNaN(getMinVP().ExceptionInVPackage())
        ? this.U
        : getMinVP().ExceptionInVPackage();
  }

  public void setDefaultMin(double paramDouble) {
    this.U = paramDouble;
  }

  public double getDefaultMax() {
    return Double.isNaN(getMaxVP().ExceptionInVPackage())
        ? this.V
        : getMaxVP().ExceptionInVPackage();
  }

  public void setDefaultMax(double paramDouble) {
    this.V = paramDouble;
  }

  public void setRelativeBorderWidth2(double paramDouble) {
    this.Y = paramDouble;
  }

  public String getNeedleImageFileName() {
    return this.ak;
  }

  public void setNeedleImageFileName(String paramString) {
    if (paramString != null && !paramString.startsWith("IMG_ID_")) this.al = null;
    this.ak = paramString;
    invalidatePainter();
    repaint();
  }

  public int getBorderWidth() {
    return Double.isNaN(this.Y)
        ? this.o
        : (int) Math.round(getShortestSize() * getRelativeBorderWidth2());
  }

  public double getRelativeBorderWidth2() {
    return this.Y;
  }

  public int getShortestSize() {
    return (getWidth() > getHeight()) ? getHeight() : getWidth();
  }

  public void setBorderWidth(int paramInt) {
    this.o = paramInt;
    invalidatePainter();
  }

  public int getFontSizeAdjustment() {
    return this.p;
  }

  public void setFontSizeAdjustment(int paramInt) {
    this.p = paramInt;
    invalidatePainter();
  }

  public void invalidatePainter() {
    this.X = -1;
    this.aj = null;
    this.al = null;
    if (this.H != null) {
      this.H.invalidate();
      setDirty(true);
      repaint();
    }
  }

  public double getHistoricalPeakValue() {
    return this.aa;
  }

  public void setHistoricalPeakValue(double paramDouble) {
    this.aa = paramDouble;
  }

  public boolean isShowHistory() {
    return this.af;
  }

  public void setShowHistory(boolean paramBoolean) {
    this.aa = this.ExceptionInVPackage.ExceptionInVPackage();
    this.af = paramBoolean;
  }

  public int getHistoryDelay() {
    return this.ab;
  }

  public void setHistoryDelay(int paramInt) {
    this.ab = paramInt;
  }

  public void setAntialiasingOn(boolean paramBoolean) {
    super.setAntialiasingOn(paramBoolean);
    invalidate();
  }

  public aH setCaptureHistoricalData(boolean paramBoolean) {
    if (paramBoolean) {
      if (this.ah == null) this.ah = new aH();
    } else {
      this.ah = null;
    }
    return this.ah;
  }

  public String formatDouble(double paramDouble, int paramInt) {
    return X.b(paramDouble, paramInt);
  }

  public int historySize() {
    return (this.ah == null) ? -1 : this.ah.size();
  }

  public boolean isCounterClockwise() {
    return this.W;
  }

  public void setCounterClockwise(boolean paramBoolean) {
    this.W = paramBoolean;
    invalidate();
  }

  public boolean isComponentPaintedAt(int paramInt1, int paramInt2) {
    return (getGaugePainter() instanceof ManagerUsingConcurrentHashMap)
        ? ((ManagerUsingConcurrentHashMap) getGaugePainter())
            .isComponentPaintedAt(paramInt1, paramInt2)
        : ((paramInt1 <= getWidth() && paramInt2 <= getHeight()));
  }

  public boolean isDirty() {
    if (super.isDirty()) return true;
    double d1 = max() - min();
    double d2 = Math.abs(getSmoothedValue() - getValue()) / d1;
    if (d2 > Math.pow(10.0D, -valueDigits())) {
      myGaugeContainer().ExceptionInVPackage(this);
      return true;
    }
    return false;
  }

  public String getBackgroundImageFileName() {
    return this.ai;
  }

  public void setBackgroundImageFileName(String paramString) {
    this.ai = paramString;
    if (paramString != null && !paramString.startsWith("IMG_ID_"))
      if (!paramString.equals("")) {
        this.aj = Toolkit.getDefaultToolkit().getImage(paramString);
        MediaTracker mediaTracker = new MediaTracker(this);
        mediaTracker.addImage(this.aj, 0);
        try {
          mediaTracker.waitForAll(250L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(s.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
      } else {
        this.aj = null;
      }
    invalidatePainter();
    repaint();
  }

  public Image backgroundImage() {
    if (this.ai != null && !this.ai.isEmpty())
      if (!this.ai.equals("")) {
        this.aj = Toolkit.getDefaultToolkit().getImage(this.ai);
        MediaTracker mediaTracker = new MediaTracker(this);
        mediaTracker.addImage(this.aj, 0);
        try {
          mediaTracker.waitForAll(250L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(s.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
      } else {
        this.aj = null;
      }
    return this.aj;
  }

  public Image needleImage(int paramInt) {
    if (paramInt > 0
        && this.ak != null
        && !this.ak.equals("")
        && !this.ak.startsWith("IMG_ID_")
        && (this.al == null || this.al.getHeight(null) != paramInt))
      this.al = f.ExceptionInVPackage().ExceptionInVPackage(this.ak, paramInt, this);
    return this.al;
  }

  public boolean imageUpdate(
      Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 == 32) {
      invalidatePainter();
      repaint();
    }
    return super.imageUpdate(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public Area areaPainted() {
    return this.H.areaPainted(this);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/Gauge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
