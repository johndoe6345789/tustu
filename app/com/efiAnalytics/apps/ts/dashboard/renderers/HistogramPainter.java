package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.aH;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.cq;
import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class HistogramPainter implements GaugePainter {
  private transient Image backImage = null;
  
  aH historicalData = null;
  
  int scaleMultiplier = 2;
  
  g lineStroke = new g(2.0F);
  
  g gridLineStroke = new g(1.0F);
  
  g dashedLineStroke = new g(1.0F, 0, 2, 0.0F, new float[] { 6.0F, 4.0F }, 0.0F);
  
  public String getName() {
    return "Line Graph";
  }
  
  public void paintGauge(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge)params;
    paramGraphics.drawImage(getOffImage(paramGraphics, gauge), 0, 0, null);
    drawHistogramLine(paramGraphics, gauge);
  }
  
  public void invalidate() {
    this.backImage = null;
  }
  
  public void initialize(Gauge paramGauge) {
    this.historicalData = paramGauge.setCaptureHistoricalData(true);
  }
  
  private Image getOffImage(Graphics paramGraphics, Gauge paramGauge) {
    if (this.backImage == null) {
      this.backImage = paintBackground(paramGraphics, paramGauge);
      this.historicalData.b(2 + paramGauge.getWidth() / this.scaleMultiplier);
    } 
    return this.backImage;
  }
  
  private Image paintBackground(Graphics paramGraphics, Gauge paramGauge) {
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
    GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
    BufferedImage bufferedImage = null;
    Graphics graphics = null;
    if (paramGauge.getWidth() <= 0 || paramGauge.getHeight() <= 0)
      return null; 
    if (paramGauge.isAntialiasingOn()) {
      bufferedImage = graphicsConfiguration.createCompatibleImage(paramGauge.getWidth(), paramGauge.getHeight(), 3);
      graphics = bufferedImage.getGraphics();
      Graphics2D graphics2D = (Graphics2D)graphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    } else {
      bufferedImage = graphicsConfiguration.createCompatibleImage(paramGauge.getWidth(), paramGauge.getHeight(), 2);
      graphics = bufferedImage.getGraphics();
    } 
    graphics.setColor(paramGauge.getBackColor());
    graphics.fillRect(0, 0, paramGauge.getWidth(), paramGauge.getHeight());
    if (paramGauge.backgroundImage() != null)
      graphics.drawImage(paramGauge.backgroundImage(), 0, 0, paramGauge.getWidth(), paramGauge.getHeight(), null); 
    drawBorder(graphics, paramGauge);
    drawGridLines(graphics, paramGauge);
    drawTitle(graphics, paramGauge);
    return bufferedImage;
  }
  
  private void drawTitle(Graphics paramGraphics, Gauge paramGauge) {
    Font font = getLineFont(paramGauge);
    paramGraphics.setFont(font);
    String str = paramGauge.title();
    if (!paramGauge.units().equals(""))
      str = str + "(" + paramGauge.units() + ")"; 
    if (str.length() > 0) {
      int i = (paramGauge.getWidth() - paramGauge.getFontMetrics(font).stringWidth(str)) / 2;
      paramGraphics.drawString(str, i, font.getSize());
    } 
  }
  
  private void drawHistogramLine(Graphics paramGraphics, Gauge paramGauge) {
    double[] arrayOfDouble = getLineValues(paramGauge);
    int[] arrayOfInt1 = new int[arrayOfDouble.length];
    int[] arrayOfInt2 = new int[arrayOfDouble.length];
    int i = paramGauge.getWidth();
    int j = paramGauge.getHeight() - 2 * paramGauge.getBorderWidth();
    if (paramGauge.isAntialiasingOn()) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    } 
    for (byte b = 0; b < arrayOfInt2.length; b++) {
      arrayOfInt1[b] = i - paramGauge.getBorderWidth() - b * this.scaleMultiplier;
      double d = (arrayOfDouble[b] - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
      if (d > 1.0D) {
        arrayOfInt2[b] = paramGauge.getBorderWidth();
      } else if (d < 0.0D) {
        arrayOfInt2[b] = paramGauge.getHeight() - paramGauge.getBorderWidth();
      } else {
        arrayOfInt2[b] = paramGauge.getHeight() - (int)(j * d) - paramGauge.getBorderWidth();
      } 
    } 
    paramGraphics.setColor(paramGauge.getNeedleColor());
    ((Graphics2D)paramGraphics).setStroke(this.lineStroke);
    paramGraphics.drawPolyline(arrayOfInt1, arrayOfInt2, arrayOfInt1.length);
  }
  
  private double[] getLineValues(Gauge paramGauge) {
    int i = 1 + (paramGauge.getWidth() - 2 * paramGauge.getBorderWidth()) / this.scaleMultiplier;
    double[] arrayOfDouble = null;
    int j = 0;
    synchronized (this.historicalData) {
      j = (this.historicalData.size() > i && i > 0) ? i : this.historicalData.size();
      arrayOfDouble = new double[j];
      for (byte b = 0; b < j; b++)
        arrayOfDouble[b] = this.historicalData.a(b); 
    } 
    if (arrayOfDouble.length == 0) {
      arrayOfDouble = new double[1];
      arrayOfDouble[0] = 0.0D;
    } 
    return arrayOfDouble;
  }
  
  private void drawBorder(Graphics paramGraphics, Gauge paramGauge) {
    int i = paramGauge.getWidth();
    int j = paramGauge.getHeight();
    paramGraphics.setColor(paramGauge.getTrimColor());
    for (byte b = 0; b < paramGauge.getBorderWidth(); b++)
      paramGraphics.draw3DRect(b, b, i - 2 * b - 1, j - 2 * b - 1, (b < paramGauge.getBorderWidth() / 2)); 
  }
  
  private void drawGridLines(Graphics paramGraphics, Gauge paramGauge) {
    byte b = 40;
    double d1 = 1.0D;
    boolean bool1 = false;
    if (paramGauge.getHeight() < 150) {
      b = 20;
      bool1 = true;
    } 
    int i;
    for (i = 2; paramGauge.getHeight() / i > b; i *= 2)
      d1 = paramGauge.getHeight() / i / paramGauge.getHeight(); 
    double d2 = d1;
    boolean bool2 = true;
    while (d2 <= 1.0D) {
      bool2 = bool1 ? (!bool2 ? true : false) : true;
      drawAGridLine(paramGraphics, paramGauge, d2, bool2);
      d2 += d1;
    } 
    Font font = getLineFont(paramGauge);
    String str = paramGauge.formatDouble(paramGauge.max(), paramGauge.getLabelDigits());
    paramGraphics.drawString(str, 3 + paramGauge.getBorderWidth(), font.getSize() + paramGauge.getBorderWidth());
  }
  
  private void drawAGridLine(Graphics paramGraphics, Gauge paramGauge, double paramDouble, boolean paramBoolean) {
    int i = paramGauge.getBorderWidth();
    int j = paramGauge.getWidth() - 2 * i;
    int k = (int)Math.round((paramGauge.getHeight() - paramGauge.getBorderWidth() * 2) * paramDouble) + paramGauge.getBorderWidth();
    paramGraphics.setColor(Color.LIGHT_GRAY);
    ((Graphics2D)paramGraphics).setStroke(paramBoolean ? this.gridLineStroke : this.dashedLineStroke);
    paramGraphics.drawLine(i, k, j + i, k);
    paramGraphics.setColor(paramGauge.getFontColor());
    if (paramBoolean) {
      String str = paramGauge.formatDouble(paramGauge.max() - paramDouble * (paramGauge.max() - paramGauge.min()), paramGauge.getLabelDigits());
      Font font = getLineFont(paramGauge);
      paramGraphics.setFont(font);
      paramGraphics.drawString(str, 3 + paramGauge.getBorderWidth(), k - 2);
    } 
  }
  
  private Font getLineFont(Gauge paramGauge) {
    int i = (paramGauge.getHeight() < eJ.a(168)) ? eJ.a(12) : (paramGauge.getHeight() / 14);
    i += paramGauge.getFontSizeAdjustment();
    boolean bool = paramGauge.isItalicFont() ? true : true;
    return cq.a().a(paramGauge.getFontFamily(), bool, i);
  }
  
  public boolean isShapeLockedToAspect() {
    return false;
  }
  
  public boolean requiresBackgroundRepaint(s params) {
    return (this.backImage == null || params.getWidth() != this.backImage.getWidth(null) || params.getHeight() != this.backImage.getHeight(null));
  }
  
  public void updateGauge(Graphics paramGraphics, s params) {
    drawHistogramLine(paramGraphics, (Gauge)params);
  }
  
  public void paintBackground(Graphics paramGraphics, s params) {
    paramGraphics.drawImage(getOffImage(paramGraphics, (Gauge)params), 0, 0, null);
  }
  
  public Area areaPainted(s params) {
    Area area;
    Gauge gauge = (Gauge)params;
    if (gauge.getBackColor().getAlpha() > 40) {
      Rectangle2D.Double double_ = new Rectangle2D.Double(0.0D, 0.0D, gauge.getWidth(), gauge.getHeight());
      area = new Area(double_);
    } else {
      area = new Area();
    } 
    return area;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/HistogramPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */