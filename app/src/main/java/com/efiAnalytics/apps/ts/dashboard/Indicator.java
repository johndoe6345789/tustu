package com.efiAnalytics.apps.ts.dashboard;

import G.GInterfaceAn;
import G.c;
import G.GInterfaceCz;
import G.GComponentCq;
import G.GInterfaceDa;
import G.GInterfaceDb;
import V.ExceptionPrintstacktrace;
import com.efiAnalytics.apps.ts.dashboard.renderers.IndicatorPainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.RectangleIndicatorPainter;
import com.efiAnalytics.ui.eJ;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Area;
import java.awt.image.ImageObserver;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.ExceptionPrintstacktrace;

public class Indicator extends SingleChannelDashComponent implements ImageObserver, Serializable {
  private GInterfaceDb i = (GInterfaceDb)new c("On");
  
  private GInterfaceDb j = (GInterfaceDb)new c("Off");
  
  private Color k = Color.RED;
  
  private Color l = Color.LIGHT_GRAY;
  
  private Color m = Color.BLACK;
  
  private Color n = Color.BLACK;
  
  private boolean o = false;
  
  private IndicatorPainter p = null;
  
  private Insets q = new Insets(2, 2, 2, 2);
  
  private aM r = null;
  
  private String s = null;
  
  private Image t = null;
  
  private String u = null;
  
  private Image v = null;
  
  GInterfaceCz a = null;
  
  String b = null;
  
  String c = null;
  
  String d = null;
  
  String f = null;
  
  GComponentCq ExceptionPrintstacktrace = null;
  
  GInterfaceAn h = null;
  
  public Indicator() {
    setPainter((IndicatorPainter)new RectangleIndicatorPainter());
    setRelativeX(0.02D);
    setRelativeY(0.02D);
    setRelativeWidth(0.12D);
    setRelativeHeight(0.035D);
    this.a = new GInterfaceAn(this);
  }
  
  public void setRunDemo(boolean paramBoolean) {
    if (paramBoolean) {
      if (this.r == null || !this.r.isAlive()) {
        this.r = new aM(this, true);
        this.r.start();
      } else {
        this.r.a = true;
      } 
    } else if (this.r != null) {
      this.r.a = false;
    } 
  }
  
  public void setCurrentOutputChannelValue(String paramString1, String paramString2) {}
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (this.r != null)
      this.r.a = false; 
    setValue(paramDouble);
  }
  
  public void goDead() {
    if (this.r == null || !this.r.isAlive()) {
      this.r = new aM(this, false);
      this.r.start();
    } else {
      this.r.a = false;
    } 
  }
  
  public String getOnText() {
    return this.i.toString();
  }
  
  public boolean imageUpdate(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if ((paramInt1 & 0x20) != 32) {
      invalidate();
      setDirty(true);
    } 
    return super.imageUpdate(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public String onText() {
    try {
      String str = this.i.a();
      if (this.b != null && str.equals(this.b))
        return this.d; 
      this.b = str;
      this.d = ExceptionPrintstacktrace.b(str);
      return this.d;
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      return "Error";
    } 
  }
  
  public void setOnText(String paramString) {
    try {
      this.i = GInterfaceDa.a().a(this.a, paramString);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    invalidatePainter();
  }
  
  public String getOffText() {
    return this.j.toString();
  }
  
  public String offText() {
    try {
      String str = this.j.a();
      if (this.c != null && str.equals(this.c))
        return this.f; 
      this.c = str;
      this.f = ExceptionPrintstacktrace.b(str);
      return this.f;
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      return "Error";
    } 
  }
  
  public void setOffText(String paramString) {
    try {
      this.j = GInterfaceDa.a().a(this.a, paramString);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Gauge.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    invalidatePainter();
  }
  
  public Color getOnBackgroundColor() {
    return this.k;
  }
  
  public void setOnBackgroundColor(Color paramColor) {
    this.k = paramColor;
    invalidatePainter();
  }
  
  public Color getOffBackgroundColor() {
    return this.l;
  }
  
  public void setOffBackgroundColor(Color paramColor) {
    this.l = paramColor;
    invalidatePainter();
  }
  
  public Color getOnTextColor() {
    return this.m;
  }
  
  public void setOnTextColor(Color paramColor) {
    this.m = paramColor;
    invalidatePainter();
  }
  
  public Color getOffTextColor() {
    return this.n;
  }
  
  public void setOffTextColor(Color paramColor) {
    this.n = paramColor;
    invalidatePainter();
  }
  
  public IndicatorPainter getPainter() {
    return this.p;
  }
  
  public void setPainter(IndicatorPainter paramIndicatorPainter) {
    this.p = paramIndicatorPainter;
  }
  
  public void paint(Graphics paramGraphics) {
    if (this.p != null && getWidth() > 0 && getHeight() > 0)
      this.p.paintGauge(paramGraphics, this); 
    if (isInvalidState())
      paintInvalid(paramGraphics); 
    setDirty(false);
  }
  
  public void paintInvalid(Graphics paramGraphics) {
    if (getOffBackgroundColor().getRed() > 220 && getOffBackgroundColor().getBlue() < 92 && getOffBackgroundColor().getGreen() < 92) {
      paramGraphics.setXORMode(getOffBackgroundColor());
    } else {
      paramGraphics.setColor(Color.red);
    } 
    BasicStroke basicStroke = new BasicStroke(eJ.a(3));
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setStroke(basicStroke);
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    int i = getHeight() - 1;
    paramGraphics.drawOval((getWidth() - i) / 2, 0, i, i);
    int j = (int)((i / 2) * 1.414213D / 2.0D);
    int k = getWidth() / 2;
    int m = getHeight() / 2;
    paramGraphics.drawLine(k - j, m - j, k + j, m + j);
    paramGraphics.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
  }
  
  public void update(Graphics paramGraphics) {
    if (this.p != null)
      this.p.updateGauge(paramGraphics, this); 
  }
  
  public void invalidate() {
    if (this.p != null)
      this.p.invalidate(); 
    super.invalidate();
  }
  
  public Insets insets() {
    return this.q;
  }
  
  public double getValue() {
    return this.o ? 1.0D : 0.0D;
  }
  
  public void setValue(double paramDouble) {
    boolean bool = false;
    if (this.o && paramDouble == 0.0D) {
      this.o = false;
      bool = true;
    } else if (!this.o && paramDouble != 0.0D) {
      this.o = true;
      bool = true;
    } 
    if (bool)
      callRepaint(); 
  }
  
  public void invalidatePainter() {
    if (getPainter() != null) {
      getPainter().invalidate();
      setDirty(true);
    } 
    this.t = null;
    this.v = null;
  }
  
  private void callRepaint() {
    if (getParent() instanceof ac)
      ((ac)getParent()).a(this); 
  }
  
  public boolean isMustPaint() {
    return getPainter().isMustPaint();
  }
  
  public boolean isRunDemo() {
    return (this.r != null);
  }
  
  public String getOnImageFileName() {
    return this.s;
  }
  
  public void setOnImageFileName(String paramString) {
    this.s = paramString;
    if (paramString != null && !paramString.equals("")) {
      this.t = Toolkit.getDefaultToolkit().getImage(paramString);
      MediaTracker mediaTracker = new MediaTracker(this);
      try {
        mediaTracker.addImage(this.t, 0);
        mediaTracker.waitForAll(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } else {
      this.t = null;
    } 
    invalidatePainter();
  }
  
  public Image onImage() {
    if (this.t == null && this.s != null && !this.s.equals("")) {
      this.t = Toolkit.getDefaultToolkit().getImage(this.s);
      MediaTracker mediaTracker = new MediaTracker(this);
      try {
        mediaTracker.addImage(this.t, 0);
        mediaTracker.waitForAll(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    return this.t;
  }
  
  public String getOffImageFileName() {
    return this.u;
  }
  
  public void setOffImageFileName(String paramString) {
    this.u = paramString;
    if (paramString != null && !paramString.equals("")) {
      this.v = Toolkit.getDefaultToolkit().getImage(paramString);
      MediaTracker mediaTracker = new MediaTracker(this);
      try {
        mediaTracker.addImage(this.v, 0);
        mediaTracker.waitForAll(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } else {
      this.v = null;
    } 
    invalidatePainter();
  }
  
  public Image offImage() {
    if (this.v == null && this.u != null && !this.u.equals("")) {
      this.v = Toolkit.getDefaultToolkit().getImage(this.u);
      MediaTracker mediaTracker = new MediaTracker(this);
      try {
        mediaTracker.addImage(this.v, 0);
        mediaTracker.waitForAll(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    return this.v;
  }
  
  public boolean isComponentPaintedAt(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0 && paramInt1 < getWidth() && paramInt2 >= 0 && paramInt2 < getHeight());
  }
  
  public void paintBackground(Graphics paramGraphics) {
    if (this.p != null)
      this.p.paintBackground(paramGraphics, this); 
  }
  
  public boolean requiresBackgroundRepaint() {
    return (this.p != null) ? this.p.requiresBackgroundRepaint(this) : false;
  }
  
  public void updateGauge(Graphics paramGraphics) {
    if (this.p != null)
      this.p.updateGauge(paramGraphics, this); 
    if (isInvalidState())
      paintInvalid(paramGraphics); 
  }
  
  public Area areaPainted() {
    return this.p.areaPainted(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/Indicator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */