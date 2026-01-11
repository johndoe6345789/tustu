package com.efiAnalytics.apps.ts.dashboard.renderers;

import bH.X;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.aR;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.cq;
import com.efiAnalytics.ui.eJ;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class AnalogGaugePainter implements aR, GaugePainter {
  private final String name = "Analog Gauge";
  
  transient Polygon needleShape = null;
  
  transient Polygon historyNeedleShape = null;
  
  int lastWidth = 0;
  
  int lastHeight = 0;
  
  double lastValue = 0.0D;
  
  double lastHistoryValue = 0.0D;
  
  int counter = 0;
  
  int maxMajorTicks = 12;
  
  int maxFaceNumber = 999;
  
  int digitsTrimmed = 0;
  
  transient Image normalOffImage = null;
  
  transient Image criticalOffImage = null;
  
  transient Image warnOffImage = null;
  
  transient long lastPaintTime = System.nanoTime();
  
  boolean lastPaintColored = false;
  
  private Gauge parentGauge = null;
  
  private transient GradientPaint outerGradient = null;
  
  private transient GradientPaint innerGradient = null;
  
  private int limitRattle = 0;
  
  int lastBgState = -1;
  
  g needleStroke = new g(eJ.a(3), 1, 1);
  
  g historyNeedleStroke = new g(eJ.a(1), 1, 1);
  
  private Image getOffImage(Graphics paramGraphics, Gauge paramGauge) {
    int i = currentState(paramGauge);
    this.lastBgState = i;
    if (i == 0) {
      if (this.normalOffImage == null)
        this.normalOffImage = paintBackground(paramGraphics, paramGauge, i); 
      return this.normalOffImage;
    } 
    if (i == 2) {
      if (this.criticalOffImage == null)
        this.criticalOffImage = paintBackground(paramGraphics, paramGauge, i); 
      return this.criticalOffImage;
    } 
    if (this.warnOffImage == null)
      this.warnOffImage = paintBackground(paramGraphics, paramGauge, i); 
    return this.warnOffImage;
  }
  
  public void paintGauge(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge)params;
    if (parentGauge() == null)
      setParentGauge(gauge); 
    this.lastPaintTime = System.nanoTime();
    if (gauge.isAntialiasingOn()) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    } 
    Image image = getOffImage(paramGraphics, gauge);
    paramGraphics.drawImage(image, getXOffset(gauge), getYOffset(gauge), null);
    drawStrings(paramGraphics, gauge);
    drawWarningIndicator(paramGraphics, gauge);
    double d1 = (getSmoothedValue(gauge) - gauge.min()) / (gauge.max() - gauge.min());
    if (gauge.isPegLimits() && d1 > 1.02D) {
      if (this.limitRattle++ % 2 == 0) {
        d1 = 1.02D;
      } else {
        d1 = 1.015D;
      } 
    } else if (gauge.isPegLimits() && d1 < -0.02D) {
      if (this.limitRattle++ % 2 == 0) {
        d1 = -0.02D;
      } else {
        d1 = -0.015D;
      } 
    } 
    double d2 = (gauge.getSweepBeginDegree() + gauge.getSweepAngle()) - gauge.getSweepAngle() * d1;
    paramGraphics.setColor(gauge.getNeedleColor());
    if (gauge.max() > gauge.min())
      drawNeedle(paramGraphics, gauge, d2); 
    this.lastWidth = getGaugeWidth(gauge);
    this.lastHeight = getGaugeHeight(gauge);
  }
  
  protected double getSmoothedValue(Gauge paramGauge) {
    return paramGauge.getSmoothedValue();
  }
  
  protected Color getFaceColor(Gauge paramGauge, int paramInt) {
    return (paramInt == 2) ? paramGauge.getCriticalColor() : paramGauge.getBackColor();
  }
  
  protected double getMajorTickSpacing(Gauge paramGauge) {
    byte b = 18;
    double d = paramGauge.getMajorTicks();
    if (d <= 0.0D) {
      int j = (int)(Math.round(Math.log10(paramGauge.max() - paramGauge.min())) - 1L);
      d = Math.pow(10.0D, j);
    } 
    int i;
    for (i = (int)((paramGauge.max() - paramGauge.min()) / d); i > 0 && paramGauge.getSweepAngle() / i < b; i = (int)((paramGauge.max() - paramGauge.min()) / d))
      d *= 2.0D; 
    return d;
  }
  
  protected void drawStrings(Graphics paramGraphics, Gauge paramGauge) {
    int i = (getGaugeHeight(paramGauge) - 2 * paramGauge.getBorderWidth()) / 12 + paramGauge.getFontSizeAdjustment();
    String str = paramGauge.getFontFamily();
    if (!paramGauge.isDisplayValueAt180()) {
      boolean bool1 = paramGauge.isItalicFont() ? true : false;
      Font font1 = cq.a().a(str, bool1, i);
      if (font1.canDisplayUpTo(paramGauge.title()) >= 0) {
        bool1 = paramGauge.isItalicFont() ? true : true;
        font1 = cq.a().a("", bool1, i);
        str = "";
      } 
      boolean bool2 = false;
      bool1 = paramGauge.isItalicFont() ? true : false;
      while (paramGraphics.getFontMetrics(font1).stringWidth(paramGauge.title()) > getGaugeWidth(paramGauge) * 0.5D) {
        i = (int)(i * 0.8D);
        font1 = cq.a().a(str, bool1, i);
        bool2 = true;
      } 
      Font font2 = bool2 ? font1 : cq.a().a(str, bool1, (int)(i * 0.85D));
      paramGraphics.setFont(font2);
      paramGraphics.setColor(paramGauge.getFontColor());
      String str1 = paramGauge.units().equals("") ? paramGauge.getDisplayValue() : (paramGauge.getDisplayValue() + "(" + paramGauge.units() + ")");
      double d = Double.isNaN(paramGauge.getRelativeBorderWidth2()) ? 0.0D : paramGauge.getRelativeBorderWidth2();
      Point point = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), (paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle() / 2), getGaugeWidth(paramGauge) / 2, getGaugeHeight(paramGauge) / 2, getOuterEdge(paramGauge) - 0.6D + d, paramGauge.isCounterClockwise());
      int j = point.x - paramGraphics.getFontMetrics().stringWidth(str1) / 2;
      int k = point.y;
      paramGraphics.drawString(str1, j + getXOffset(paramGauge), k + getYOffset(paramGauge));
      paramGraphics.setFont(font1);
      j = point.x - paramGraphics.getFontMetrics().stringWidth(paramGauge.title()) / 2;
      k += (int)(1.2D * font1.getSize());
      paramGraphics.drawString(paramGauge.title(), j + getXOffset(paramGauge), k + getYOffset(paramGauge));
      paramGraphics.setFont(font2);
      if (this.digitsTrimmed > 0 && paramGauge.max() > this.maxFaceNumber) {
        String str2 = "x1";
        for (byte b = 0; b < this.digitsTrimmed; b++)
          str2 = str2 + "0"; 
        bool1 = paramGauge.isItalicFont() ? true : false;
        paramGraphics.setFont(cq.a().a(str, bool1, (int)(i * 0.6D)));
        j = point.x - paramGraphics.getFontMetrics().stringWidth(str2) / 2;
        k = point.y - (int)(font2.getSize() * 1.3D);
        paramGraphics.drawString(str2, j + getXOffset(paramGauge), k + getYOffset(paramGauge));
      } 
    } else {
      boolean bool1 = paramGauge.isItalicFont() ? true : false;
      Font font1 = cq.a().a(str, bool1, (int)(i * 0.85D));
      if (font1.canDisplayUpTo(paramGauge.title()) >= 0) {
        bool1 = paramGauge.isItalicFont() ? true : true;
        font1 = cq.a().a("", bool1, i);
        str = "";
      } 
      boolean bool2 = false;
      String str1 = paramGauge.title();
      String str2 = null;
      int j = (paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle() / 2 + 180) % 360;
      byte b = 13;
      if (str1.length() > b && str1.indexOf(" ", str1.length() / 3) != -1) {
        str2 = str1.substring(str1.indexOf(" ", str1.length() / 3) + 1);
        str1 = str1.substring(0, str1.indexOf(" ", str1.length() / 3));
      } 
      while (paramGraphics.getFontMetrics(font1).stringWidth(str1) > getGaugeWidth(paramGauge) * 0.5D) {
        i = (int)(i * 0.9D);
        font1 = cq.a().a(str, bool1, i);
        bool2 = true;
      } 
      Font font2 = bool2 ? font1 : cq.a().a(str, bool1, (int)(i * 0.85D));
      paramGraphics.setFont(font2);
      paramGraphics.setColor(paramGauge.getFontColor());
      int k = (getGaugeHeight(paramGauge) - 2 * paramGauge.getBorderWidth()) / 14 + paramGauge.getFontSizeAdjustment();
      Font font3 = cq.a().a(str, bool1, k);
      paramGraphics.setFont(font3);
      String str3 = paramGauge.getDisplayValue();
      double d = Double.isNaN(paramGauge.getRelativeBorderWidth2()) ? 0.0D : paramGauge.getRelativeBorderWidth2();
      Point point = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), j, getGaugeWidth(paramGauge) / 2, getGaugeHeight(paramGauge) / 2, getOuterEdge(paramGauge) - 0.55D + d, paramGauge.isCounterClockwise());
      int m = point.x - paramGraphics.getFontMetrics().stringWidth(str3) / 2;
      int n = point.y;
      paramGraphics.drawString(str3, m + getXOffset(paramGauge), n + getYOffset(paramGauge));
      if (paramGauge.units() != null && !paramGauge.units().equals("")) {
        m = point.x - paramGraphics.getFontMetrics().stringWidth(paramGauge.units()) / 2;
        n += (int)(font3.getSize() * 1.1D);
        paramGraphics.drawString(paramGauge.units(), m + getXOffset(paramGauge), n + getYOffset(paramGauge));
      } 
      if (str2 == null) {
        Point point1 = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), (paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle() / 2), getGaugeWidth(paramGauge) / 2, getGaugeHeight(paramGauge) / 2, getOuterEdge(paramGauge) - 0.66D + d, paramGauge.isCounterClockwise());
        paramGraphics.setFont(font1);
        int i1 = point1.x - paramGraphics.getFontMetrics().stringWidth(paramGauge.title()) / 2;
        int i2 = point1.y;
        paramGraphics.drawString(paramGauge.title(), i1 + getXOffset(paramGauge), i2 + getYOffset(paramGauge));
        paramGraphics.setFont(font2);
        if (this.digitsTrimmed > 0 && paramGauge.max() > this.maxFaceNumber) {
          String str4 = "x1";
          for (byte b1 = 0; b1 < this.digitsTrimmed; b1++)
            str4 = str4 + "0"; 
          paramGraphics.setFont(cq.a().a(str, bool1, (int)(i * 0.6D)));
          i1 = point1.x - paramGraphics.getFontMetrics().stringWidth(str4) / 2;
          i2 = point1.y - (int)(font2.getSize() * 1.3D);
          paramGraphics.drawString(str4, i1 + getXOffset(paramGauge), i2 + getYOffset(paramGauge));
        } 
      } else {
        int i1 = getGaugeHeight(paramGauge);
        Point point1 = getPoint(getGaugeWidth(paramGauge), i1, (paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle() / 2), i1 / 2, i1 / 2, getOuterEdge(paramGauge) - 0.6D + d, paramGauge.isCounterClockwise());
        paramGraphics.setFont(font1);
        int i2 = point1.x - paramGraphics.getFontMetrics().stringWidth(str1) / 2;
        int i3 = point1.y;
        paramGraphics.drawString(str1, i2 + getXOffset(paramGauge), i3 + getYOffset(paramGauge));
        i2 = point1.x - paramGraphics.getFontMetrics().stringWidth(str2) / 2;
        paramGraphics.drawString(str2, i2 + getXOffset(paramGauge), i3 + (int)(font1.getSize() * 1.1D) + getYOffset(paramGauge));
        paramGraphics.setFont(font2);
        if (this.digitsTrimmed > 0 && paramGauge.max() > this.maxFaceNumber) {
          String str4 = "x1";
          for (byte b1 = 0; b1 < this.digitsTrimmed; b1++)
            str4 = str4 + "0"; 
          paramGraphics.setFont(cq.a().a(str, bool1, (int)(i * 0.6D)));
          i2 = point1.x - paramGraphics.getFontMetrics().stringWidth(str4) / 2;
          i3 = point1.y - (int)(font2.getSize() * 1.3D);
          paramGraphics.drawString(str4, i2 + getXOffset(paramGauge), i3 + getYOffset(paramGauge));
        } 
      } 
    } 
  }
  
  protected int getXOffset(Gauge paramGauge) {
    return 0;
  }
  
  protected int getYOffset(Gauge paramGauge) {
    return 0;
  }
  
  protected double getAngleOffsetToMajorTick(Gauge paramGauge) {
    double d1 = getMinMajorTickValue(paramGauge);
    double d2 = (d1 - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    return -(paramGauge.getSweepAngle() * d2);
  }
  
  protected double getMinMajorTickValue(Gauge paramGauge) {
    return (paramGauge.max() > 2.0D) ? Math.round(paramGauge.min()) : (Math.round(paramGauge.min() * 10.0D) / 10.0D);
  }
  
  protected void drawNumbers(Graphics paramGraphics, Gauge paramGauge) {
    double d1 = getAngleOffsetToMajorTick(paramGauge);
    double d2 = getOuterEdge(paramGauge);
    double d3 = getMajorTickSpacing(paramGauge);
    double d4 = (paramGauge.max() - paramGauge.min()) / d3;
    double d5 = paramGauge.getSweepAngle() / d4;
    if (d1 < 0.0D)
      d4--; 
    paramGraphics.setColor(paramGauge.getFontColor());
    boolean bool = paramGauge.isItalicFont() ? true : false;
    paramGraphics.setFont(cq.a().a(paramGauge.getFontFamily(), bool, (getGaugeHeight(paramGauge) - 2 * paramGauge.getBorderWidth()) / 14 + paramGauge.getFontSizeAdjustment()));
    this.digitsTrimmed = 10;
    for (byte b = 0; b <= d4; b++) {
      double d = d1 + paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle() - d5 * b;
      String str = null;
      if (paramGauge.max() > 2.0D) {
        str = X.b(paramGauge.min() + b * d3, 0);
      } else {
        str = X.b(paramGauge.min() + b * d3, 1);
      } 
      if (paramGauge.max() > this.maxFaceNumber)
        if (b == 1) {
          int k = str.length();
          str = trimRightZeros(str, this.digitsTrimmed);
          this.digitsTrimmed = k - str.length();
        } else if (b > 1 && this.digitsTrimmed > 0) {
          str = trimRightZeros(str, this.digitsTrimmed);
        }  
      Point point = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), d, getGaugeWidth(paramGauge) / 2, getGaugeHeight(paramGauge) / 2, d2 - 0.14D + str.length() * 0.02D, paramGauge.isCounterClockwise());
      int i = point.x - paramGraphics.getFontMetrics().stringWidth(str) / 2;
      int j = point.y + paramGraphics.getFont().getSize() / 2;
      paramGraphics.drawString(str, i, j);
    } 
  }
  
  protected int getGaugeWidth(Gauge paramGauge) {
    return paramGauge.getWidth();
  }
  
  protected int getGaugeHeight(Gauge paramGauge) {
    return paramGauge.getHeight();
  }
  
  private String trimRightZeros(String paramString, int paramInt) {
    for (byte b = 0; b < paramInt && paramString.endsWith("0"); b++)
      paramString = paramString.substring(0, paramString.length() - 1); 
    return paramString;
  }
  
  protected double getOuterEdge(Gauge paramGauge) {
    return 0.983D - 2.0D * paramGauge.getBorderWidth() / getGaugeWidth(paramGauge);
  }
  
  protected double getNumberOfMinorTickPerMajor(Gauge paramGauge) {
    return (paramGauge.getHeight() > 450 || paramGauge.getWidth() > 450) ? 5.0D : ((paramGauge.getHeight() > 325) ? 4.0D : ((paramGauge.getHeight() > 175 || paramGauge.getWidth() > 175) ? 2.0D : 1.0D));
  }
  
  protected void drawTickMarks(Graphics paramGraphics, Gauge paramGauge) {
    double d1 = getAngleOffsetToMajorTick(paramGauge);
    double d2 = getNumberOfMinorTickPerMajor(paramGauge);
    double d3 = getOuterEdge(paramGauge);
    double d4 = getMajorTickSpacing(paramGauge);
    double d5 = (paramGauge.max() - paramGauge.min()) / d4;
    double d6 = paramGauge.getSweepAngle() / d5;
    if (d1 < 0.0D)
      d5--; 
    double d7 = d5 * d2;
    double d8 = d6 / d2;
    paramGraphics.setColor(paramGauge.getFontColor());
    ((Graphics2D)paramGraphics).setStroke(new BasicStroke(2.0F));
    for (byte b1 = 0; b1 <= d7; b1++) {
      if (b1 % d2 > 0.0D) {
        double d = d1 + paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle() - d8 * b1;
        Point point1 = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), d, getGaugeWidth(paramGauge) / 2, getGaugeHeight(paramGauge) / 2, d3 - 0.01D, paramGauge.isCounterClockwise());
        Point point2 = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), d, getGaugeWidth(paramGauge) / 2, getGaugeHeight(paramGauge) / 2, d3 - 0.04D, paramGauge.isCounterClockwise());
        paramGraphics.drawLine(point1.x, point1.y, point2.x, point2.y);
      } 
    } 
    double d9 = d3 - 0.07D;
    double d10 = 0.6D;
    paramGraphics.setColor(paramGauge.getFontColor());
    ((Graphics2D)paramGraphics).setStroke(new BasicStroke(1.0F));
    for (byte b2 = 0; b2 <= d5; b2++) {
      double d = d1 + paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle() - d6 * b2;
      Point point1 = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), d - d10, getGaugeWidth(paramGauge) / 2, getGaugeHeight(paramGauge) / 2, d3, paramGauge.isCounterClockwise());
      Point point2 = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), d - d10, getGaugeWidth(paramGauge) / 2, getGaugeHeight(paramGauge) / 2, d9, paramGauge.isCounterClockwise());
      Point point3 = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), d + d10, getGaugeWidth(paramGauge) / 2, getGaugeHeight(paramGauge) / 2, d3, paramGauge.isCounterClockwise());
      Point point4 = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), d + d10, getGaugeWidth(paramGauge) / 2, getGaugeHeight(paramGauge) / 2, d9, paramGauge.isCounterClockwise());
      Polygon polygon = new Polygon();
      polygon.addPoint(point2.x, point2.y);
      polygon.addPoint(point1.x, point1.y);
      polygon.addPoint(point3.x, point3.y);
      polygon.addPoint(point4.x, point4.y);
      paramGraphics.fillPolygon(polygon);
    } 
  }
  
  protected void drawWarningBars(Graphics2D paramGraphics2D, Gauge paramGauge) {}
  
  protected double getAngleFromValue(Gauge paramGauge, double paramDouble) {
    double d1 = (paramDouble - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    double d2 = (paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle()) - paramGauge.getSweepAngle() * d1;
    return paramGauge.isCounterClockwise() ? (180.0D - d2) : d2;
  }
  
  protected void drawWarningIndicator(Graphics paramGraphics, Gauge paramGauge) {
    if (paramGauge.getValue() > paramGauge.lowWarning() && paramGauge.getValue() < paramGauge.highWarning())
      return; 
    float f = (getGaugeHeight(paramGauge) - 2.0F * paramGauge.getBorderWidth() + 1.0F) / 8.0F;
    paramGraphics.setColor(paramGauge.getWarnColor());
    paramGraphics.fillArc(Math.round((getGaugeWidth(paramGauge) - f) / 2.0F + getXOffset(paramGauge)), Math.round((getGaugeHeight(paramGauge) - f) / 2.0F + getYOffset(paramGauge)) - 1, Math.round(f), Math.round(f), paramGauge.getStartAngle(), paramGauge.getFaceAngle());
  }
  
  private Polygon getNeedleShape(Gauge paramGauge, double paramDouble) {
    double d1 = getOuterEdge(paramGauge);
    double d2 = paramGauge.isCounterClockwise() ? (180.0D - paramDouble) : paramDouble;
    int i = getGaugeWidth(paramGauge) / 2;
    int j = getGaugeHeight(paramGauge) / 2;
    int k = (getGaugeWidth(paramGauge) > getGaugeHeight(paramGauge)) ? (j - 2 * paramGauge.getBorderWidth()) : (i - 2 * paramGauge.getBorderWidth());
    Point point1 = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), paramDouble - 0.25D, i, j, d1 - 0.07D, paramGauge.isCounterClockwise());
    Point point2 = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), paramDouble + 0.25D, i, j, d1 - 0.07D, paramGauge.isCounterClockwise());
    Point point3 = getPoint(k / 7 + 1, (d2 + 164.0D) % 360.0D, i, j);
    Point point4 = getPoint(k / 5, (d2 - 180.0D) % 360.0D, i, j);
    Point point5 = getPoint(k / 7 + 1, (d2 - 164.0D) % 360.0D, i, j);
    if (paramGauge.isCounterClockwise()) {
      Point point = point5;
      point5 = point3;
      point3 = point;
    } 
    this.needleShape = new Polygon();
    this.needleShape.addPoint(point1.x + getXOffset(paramGauge), point1.y + getYOffset(paramGauge));
    this.needleShape.addPoint(point2.x + getXOffset(paramGauge), point2.y + getYOffset(paramGauge));
    this.needleShape.addPoint(point3.x + getXOffset(paramGauge), point3.y + getYOffset(paramGauge));
    this.needleShape.addPoint(point4.x + getXOffset(paramGauge), point4.y + getYOffset(paramGauge));
    this.needleShape.addPoint(point5.x + getXOffset(paramGauge), point5.y + getYOffset(paramGauge));
    return this.needleShape;
  }
  
  protected void drawNeedle(Graphics paramGraphics, Gauge paramGauge, double paramDouble) {
    int i = getGaugeWidth(paramGauge) / 2;
    int j = getGaugeHeight(paramGauge) / 2;
    int k = Math.round((paramGauge.getShortestSize() - 2 * paramGauge.getBorderWidth()) * 0.955F);
    if (paramGauge.needleImage(k) != null && k > 0) {
      Image image = paramGauge.needleImage(k);
      double d1 = paramGauge.isCounterClockwise() ? (180.0D - paramDouble) : paramDouble;
      double d2 = paramGauge.isCounterClockwise() ? ((-90.0D + d1) * 2.0D * Math.PI / 360.0D) : ((d1 - 90.0D) * 2.0D * Math.PI / 360.0D);
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      if (paramGauge.isShowHistory()) {
        if (this.lastHistoryValue != paramGauge.getHistoricalPeakValue() || this.historyNeedleShape == null) {
          double d3 = getAngleFromValue(paramGauge, paramGauge.getHistoricalPeakValue());
          double d4 = paramGauge.isCounterClockwise() ? (180.0D - d3) : d3;
          this.historyNeedleShape = getNeedleShape(paramGauge, d4);
          this.lastHistoryValue = paramGauge.getHistoricalPeakValue();
        } 
        double d = (paramGauge.getHistoricalPeakValue() - paramGauge.getValue()) / (paramGauge.max() - paramGauge.min());
        if (d > 0.008D && this.historyNeedleStroke != null) {
          paramGraphics.setColor(paramGauge.getNeedleColor());
          graphics2D.setStroke(this.historyNeedleStroke);
          paramGraphics.drawPolygon(this.historyNeedleShape);
          graphics2D.setStroke(this.needleStroke);
        } 
      } 
      AffineTransform affineTransform1 = graphics2D.getTransform();
      AffineTransform affineTransform2 = (AffineTransform)affineTransform1.clone();
      affineTransform2.rotate(-d2, (paramGauge.getWidth() / 2), (paramGauge.getHeight() / 2));
      float f1 = (paramGauge.getWidth() - image.getWidth(null)) / 2.0F;
      float f2 = (paramGauge.getHeight() - image.getHeight(null)) / 2.0F;
      affineTransform2.translate(f1, f2);
      graphics2D.setTransform(affineTransform2);
      graphics2D.drawImage(image, 0, 0, (ImageObserver)paramGauge);
      graphics2D.setTransform(affineTransform1);
    } else {
      this.needleShape = getNeedleShape(paramGauge, paramDouble);
      paramGraphics.fillPolygon(this.needleShape);
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setStroke(this.needleStroke);
      if (paramGauge.isShowHistory()) {
        if (this.lastHistoryValue != paramGauge.getHistoricalPeakValue() || this.historyNeedleShape == null) {
          double d2 = getAngleFromValue(paramGauge, paramGauge.getHistoricalPeakValue());
          double d3 = paramGauge.isCounterClockwise() ? (180.0D - d2) : d2;
          this.historyNeedleShape = getNeedleShape(paramGauge, d3);
          this.lastHistoryValue = paramGauge.getHistoricalPeakValue();
        } 
        double d1 = (paramGauge.getHistoricalPeakValue() - paramGauge.getValue()) / (paramGauge.max() - paramGauge.min());
        if (d1 > 0.008D) {
          paramGraphics.setColor(paramGauge.getNeedleColor());
          graphics2D.setStroke(this.historyNeedleStroke);
          paramGraphics.drawPolygon(this.historyNeedleShape);
          graphics2D.setStroke(this.needleStroke);
        } 
      } 
      Color color1 = paramGauge.getNeedleColor();
      Color color2 = null;
      if (color1.getRed() + color1.getGreen() + color1.getBlue() > 384) {
        color2 = color1.darker();
      } else {
        color2 = color1.brighter().brighter();
      } 
      paramGraphics.setColor(color2);
      double d = getOuterEdge(paramGauge);
      Point point = getPoint(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), paramDouble, i, j, d - 0.05D, paramGauge.isCounterClockwise());
      paramGraphics.drawLine(i + getXOffset(paramGauge), j + getYOffset(paramGauge), point.x + getXOffset(paramGauge), point.y + getYOffset(paramGauge));
    } 
  }
  
  protected Image paintBackground(Graphics paramGraphics, Gauge paramGauge, int paramInt) {
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
    GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
    BufferedImage bufferedImage = null;
    Graphics graphics = null;
    bufferedImage = graphicsConfiguration.createCompatibleImage(getGaugeWidth(paramGauge), getGaugeHeight(paramGauge), 3);
    graphics = bufferedImage.getGraphics();
    Graphics2D graphics2D = (Graphics2D)graphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    graphics2D = (Graphics2D)graphics;
    Color color = new Color(0, 0, 0, 0);
    graphics.setColor(color);
    graphics.fillRect(0, 0, getGaugeWidth(paramGauge), getGaugeHeight(paramGauge));
    this.lastPaintTime = System.nanoTime();
    if (paramInt == 2)
      paintBgImage(graphics2D, paramGauge); 
    graphics.setColor(paramGauge.getBackColor());
    graphics.setColor(getFaceColor(paramGauge, paramInt));
    graphics.fillArc(paramGauge.getBorderWidth(), paramGauge.getBorderWidth(), getGaugeWidth(paramGauge) - 2 * paramGauge.getBorderWidth(), getGaugeHeight(paramGauge) - 2 * paramGauge.getBorderWidth(), paramGauge.getStartAngle(), paramGauge.getFaceAngle());
    if (paramInt != 2)
      paintBgImage(graphics2D, paramGauge); 
    drawWarningBars((Graphics2D)graphics, paramGauge);
    drawTickMarks(graphics, paramGauge);
    drawBorder(graphics, paramGauge);
    if (paramGauge.max() > paramGauge.min())
      drawNumbers(graphics, paramGauge); 
    return bufferedImage;
  }
  
  protected Color getBrighter(Color paramColor) {
    int i = paramColor.getBlue() + paramColor.getRed() + paramColor.getGreen();
    if (i < 180) {
      i += 250;
      return new Color(i / 3, i / 3, i / 3);
    } 
    return paramColor.brighter();
  }
  
  protected Color getDarker(Color paramColor) {
    return (paramColor.getBlue() + paramColor.getRed() + paramColor.getGreen() > 650) ? paramColor.darker().darker() : paramColor.darker();
  }
  
  protected void drawBorder(Graphics paramGraphics, Gauge paramGauge) {
    Color color = paramGauge.getTrimColor();
    if (paramGauge.getBorderWidth() > 0 && color.getAlpha() > 0) {
      Color color1 = getDarker(color);
      color1 = new Color(color1.getRed(), color1.getGreen(), color1.getBlue(), color.getAlpha());
      color = getBrighter(color);
      if (this.outerGradient == null)
        this.outerGradient = new GradientPaint(0.0F, 92.0F, color1, (getGaugeWidth(paramGauge) / 2), (getGaugeHeight(paramGauge) / 2), color, true); 
      ((Graphics2D)paramGraphics).setPaint(this.outerGradient);
      ((Graphics2D)paramGraphics).setStroke(new BasicStroke((paramGauge.getBorderWidth() / 2)));
      paramGraphics.drawArc(paramGauge.getBorderWidth() / 4, paramGauge.getBorderWidth() / 4, getGaugeWidth(paramGauge) - paramGauge.getBorderWidth() / 2, getGaugeHeight(paramGauge) - paramGauge.getBorderWidth() / 2, paramGauge.getStartAngle(), paramGauge.getFaceAngle());
      if (this.innerGradient == null)
        this.innerGradient = new GradientPaint(92.0F, 0.0F, color, (getGaugeWidth(paramGauge) / 2), (getGaugeHeight(paramGauge) / 2), color1, true); 
      ((Graphics2D)paramGraphics).setPaint(this.innerGradient);
      ((Graphics2D)paramGraphics).setStroke(new BasicStroke(((paramGauge.getBorderWidth() + 4) / 2)));
      paramGraphics.drawArc(3 * paramGauge.getBorderWidth() / 4, 3 * paramGauge.getBorderWidth() / 4, getGaugeWidth(paramGauge) - paramGauge.getBorderWidth() - paramGauge.getBorderWidth() / 2, getGaugeHeight(paramGauge) - paramGauge.getBorderWidth() - paramGauge.getBorderWidth() / 2, paramGauge.getStartAngle(), paramGauge.getFaceAngle());
    } 
  }
  
  protected Point getPoint(int paramInt1, double paramDouble, int paramInt2, int paramInt3) {
    double d = paramDouble * 2.0D * Math.PI / 360.0D;
    int i = (int)(paramInt2 + paramInt1 * Math.cos(d));
    int j = (int)(paramInt3 - paramInt1 * Math.sin(d));
    return new Point(i, j);
  }
  
  protected Point getPoint(int paramInt1, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, double paramDouble2, boolean paramBoolean) {
    double d = paramBoolean ? ((180.0D - paramDouble1) * 2.0D * Math.PI / 360.0D) : (paramDouble1 * 2.0D * Math.PI / 360.0D);
    float f = (float)(Math.sqrt(Math.pow(paramInt1 / 2.0D, 2.0D) * Math.pow(paramInt2 / 2.0D, 2.0D) / (Math.pow(paramInt1 / 2.0D * Math.sin(d), 2.0D) + Math.pow(paramInt2 / 2.0D * Math.cos(d), 2.0D))) * paramDouble2);
    int i = paramInt3 + Math.round((float)(f * Math.cos(d)));
    int j = paramInt4 - Math.round((float)(f * Math.sin(d)));
    return new Point(i, j);
  }
  
  public boolean requiresBackgroundRepaint(s params) {
    int i = currentState((Gauge)params);
    return (this.lastBgState != i || params.getWidth() != this.lastWidth || params.getHeight() != this.lastHeight);
  }
  
  public void updateGauge(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge)params;
    if (gauge.isAntialiasingOn()) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    } 
    drawStrings(paramGraphics, gauge);
    drawWarningIndicator(paramGraphics, gauge);
    double d1 = (getSmoothedValue(gauge) - gauge.min()) / (gauge.max() - gauge.min());
    if (gauge.isPegLimits() && d1 > 1.02D) {
      if (this.limitRattle++ % 2 == 0) {
        d1 = 1.02D;
      } else {
        d1 = 1.015D;
      } 
    } else if (gauge.isPegLimits() && d1 < -0.02D) {
      if (this.limitRattle++ % 2 == 0) {
        d1 = -0.02D;
      } else {
        d1 = -0.015D;
      } 
    } 
    double d2 = (gauge.getSweepBeginDegree() + gauge.getSweepAngle()) - gauge.getSweepAngle() * d1;
    paramGraphics.setColor(gauge.getNeedleColor());
    if (gauge.max() > gauge.min())
      drawNeedle(paramGraphics, gauge, d2); 
    this.lastWidth = gauge.getWidth();
    this.lastHeight = gauge.getHeight();
  }
  
  public void paintBackground(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge)params;
    if (parentGauge() == null)
      setParentGauge(gauge); 
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    this.lastPaintTime = System.nanoTime();
    if (getGaugeWidth(gauge) > 0) {
      Image image = getOffImage(paramGraphics, gauge);
      paramGraphics.drawImage(image, getXOffset(gauge), getYOffset(gauge), null);
    } 
  }
  
  public String getName() {
    return "Analog Gauge";
  }
  
  public void invalidate() {
    this.normalOffImage = null;
    this.criticalOffImage = null;
    this.warnOffImage = null;
    this.historyNeedleShape = null;
    this.outerGradient = null;
    this.innerGradient = null;
  }
  
  public void initialize(Gauge paramGauge) {}
  
  public boolean isShapeLockedToAspect() {
    return false;
  }
  
  public boolean isComponentPaintedAt(int paramInt1, int paramInt2) {
    if (parentGauge() == null)
      return true; 
    double d1 = ((parentGauge().getWidth() - getGaugeWidth(parentGauge())) / 2);
    double d2 = ((parentGauge().getHeight() - getGaugeHeight(parentGauge())) / 2);
    Rectangle2D.Double double_ = new Rectangle2D.Double(d1, d2, getGaugeWidth(parentGauge()), getGaugeHeight(parentGauge()));
    Arc2D.Double double_1 = new Arc2D.Double(double_, parentGauge().getStartAngle(), parentGauge().getFaceAngle(), 2);
    return double_1.contains(paramInt1, paramInt2);
  }
  
  public Gauge parentGauge() {
    return this.parentGauge;
  }
  
  public void setParentGauge(Gauge paramGauge) {
    this.parentGauge = paramGauge;
  }
  
  public int currentState(Gauge paramGauge) {
    return (paramGauge.getValue() > paramGauge.lowWarning() && paramGauge.getValue() < paramGauge.highWarning()) ? 0 : ((paramGauge.getValue() > paramGauge.highCritical()) ? 2 : 1);
  }
  
  private void paintBgImage(Graphics2D paramGraphics2D, Gauge paramGauge) {
    if (paramGauge.backgroundImage() != null) {
      Rectangle2D.Double double_ = new Rectangle2D.Double(0.0D, 0.0D, getGaugeWidth(parentGauge()), getGaugeHeight(parentGauge()));
      Arc2D.Double double_1 = new Arc2D.Double(double_, paramGauge.getStartAngle(), paramGauge.getFaceAngle(), 2);
      paramGraphics2D.clip(double_1);
      paramGraphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
      paramGraphics2D.drawImage(paramGauge.backgroundImage(), 1, 1, getGaugeWidth(paramGauge) - 2, getGaugeHeight(paramGauge) - 2, null);
      paramGraphics2D.setClip(0, 0, paramGauge.getWidth(), paramGauge.getHeight());
    } 
  }
  
  public Area areaPainted(s params) {
    Gauge gauge = (Gauge)params;
    Rectangle2D.Double double_ = new Rectangle2D.Double(getXOffset(gauge), getYOffset(gauge), getGaugeWidth(gauge), getGaugeHeight(gauge));
    Arc2D.Double double_1 = new Arc2D.Double(double_, gauge.getStartAngle(), gauge.getFaceAngle(), 2);
    Area area = new Area();
    if (gauge.getBackColor().getAlpha() > 50) {
      area.add(new Area(double_1));
      int i = getGaugeWidth(gauge) / 2;
      int j = getGaugeHeight(gauge) / 2;
      int k = (i - 2 * gauge.getBorderWidth()) / 5;
      int m = (j - 2 * gauge.getBorderWidth()) / 5;
      Arc2D.Double double_2 = new Arc2D.Double((i - k), (j - m), (2 * k), (2 * m), 0.0D, 360.0D, 2);
      area.add(new Area(double_2));
    } 
    return area;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/AnalogGaugePainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */