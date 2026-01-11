package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.s;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class VerticalDashedBarPainter implements GaugePainter {
  int inset = 10;
  
  int barCount = 20;
  
  transient Image backImage = null;
  
  int lastWidth = 0;
  
  int lastHeight = 0;
  
  public void paintGauge(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge)params;
    paramGraphics.drawImage(getBackImage(gauge), 0, 0, null);
    paintBar(paramGraphics, gauge, false);
  }
  
  protected Image getBackImage(Gauge paramGauge) {
    if (this.backImage != null && this.backImage.getWidth(null) == paramGauge.getWidth() && this.backImage.getHeight(null) == paramGauge.getHeight())
      return this.backImage; 
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
    GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
    Graphics graphics = null;
    this.backImage = graphicsConfiguration.createCompatibleImage(paramGauge.getWidth(), paramGauge.getHeight(), 2);
    graphics = this.backImage.getGraphics();
    Color color = new Color(0, 0, 0, 0);
    graphics.setColor(color);
    graphics.fillRect(0, 0, paramGauge.getWidth(), paramGauge.getHeight());
    this.inset = paramGauge.getBorderWidth() + 5;
    int i = paramGauge.getHeight() - 2 * this.inset;
    this.barCount = i / 7;
    double d1 = (i / this.barCount);
    double d2 = 1.0D;
    paintBackground(graphics, paramGauge);
    int j = paramGauge.isCounterClockwise() ? (this.inset + (int)d1) : (paramGauge.getHeight() - this.inset - (int)d1);
    graphics.setColor(new Color(25, 25, 25));
    for (byte b = 0; b < this.barCount; b++) {
      int k = (int)(b * d1);
      if (k - d1 / 4.0D < i * d2)
        if (paramGauge.isCounterClockwise()) {
          int m = j + k;
          graphics.fillRect(this.inset, m, paramGauge.getWidth() - 2 * this.inset, (int)(d1 * 0.7D));
        } else {
          int m = j - k;
          graphics.fillRect(this.inset, m, paramGauge.getWidth() - 2 * this.inset, (int)(d1 * 0.7D));
        }  
    } 
    return this.backImage;
  }
  
  protected void paintBar(Graphics paramGraphics, Gauge paramGauge, boolean paramBoolean) {
    double d1 = paramBoolean ? 1.0D : ((paramGauge.getSmoothedValue() - paramGauge.min()) / (paramGauge.max() - paramGauge.min()));
    double d2 = (paramGauge.highWarning() - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    double d3 = (paramGauge.highCritical() - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    int i = paramGauge.getHeight() - 2 * this.inset;
    this.barCount = i / 7;
    double d4 = (i / this.barCount);
    int j = paramGauge.isCounterClockwise() ? (this.inset + (int)d4) : (paramGauge.getHeight() - this.inset - (int)d4);
    paramGraphics.setColor(getFaded(paramGauge.getFontColor(), paramBoolean));
    for (byte b = 0; b < this.barCount; b++) {
      int k = (int)(b * d4);
      if (k - d4 / 4.0D < i * d1) {
        if (k > d2 * i)
          paramGraphics.setColor(getFaded(paramGauge.getWarnColor(), paramBoolean)); 
        if (k > d3 * i)
          paramGraphics.setColor(getFaded(paramGauge.getCriticalColor(), paramBoolean)); 
        if (paramGauge.isCounterClockwise()) {
          int m = j + k;
          paramGraphics.fillRect(this.inset, m, paramGauge.getWidth() - 2 * this.inset, (int)(d4 * 0.7D));
        } else {
          int m = j - k;
          paramGraphics.fillRect(this.inset, m, paramGauge.getWidth() - 2 * this.inset, (int)(d4 * 0.7D));
        } 
      } 
    } 
  }
  
  private Color getFaded(Color paramColor, boolean paramBoolean) {
    return paramBoolean ? new Color(paramColor.getRed(), paramColor.getGreen(), paramColor.getBlue(), 35) : paramColor;
  }
  
  protected void paintBackground(Graphics paramGraphics, Gauge paramGauge) {
    this.lastWidth = paramGauge.getWidth();
    this.lastHeight = paramGauge.getHeight();
    paramGraphics.setColor(paramGauge.getBackColor());
    paramGraphics.fillRect(0, 0, paramGauge.getWidth(), paramGauge.getHeight());
    if (paramGauge.backgroundImage() != null)
      paramGraphics.drawImage(paramGauge.backgroundImage(), 0, 0, paramGauge.getWidth(), paramGauge.getHeight(), null); 
    paramGraphics.setColor(paramGauge.getTrimColor());
    for (byte b = 0; b < paramGauge.getBorderWidth(); b++)
      paramGraphics.draw3DRect(b, b, paramGauge.getWidth() - 1 - 2 * b, paramGauge.getHeight() - 1 - 2 * b, (paramGauge.getBorderWidth() / 2 >= b)); 
    paintBar(paramGraphics, paramGauge, true);
  }
  
  public void invalidate() {
    this.backImage = null;
  }
  
  public String getName() {
    return "Vertical Dashed Bar Gauge";
  }
  
  public void initialize(Gauge paramGauge) {}
  
  public boolean isShapeLockedToAspect() {
    return false;
  }
  
  public boolean requiresBackgroundRepaint(s params) {
    return (params.getWidth() != this.lastWidth || params.getHeight() != this.lastHeight);
  }
  
  public void updateGauge(Graphics paramGraphics, s params) {
    paintBar(paramGraphics, (Gauge)params, false);
  }
  
  public void paintBackground(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge)params;
    paintBackground(paramGraphics, gauge);
  }
  
  public Area areaPainted(s params) {
    Gauge gauge = (Gauge)params;
    Rectangle2D.Double double_ = new Rectangle2D.Double(0.0D, 0.0D, gauge.getWidth(), gauge.getHeight());
    return new Area(double_);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/VerticalDashedBarPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */