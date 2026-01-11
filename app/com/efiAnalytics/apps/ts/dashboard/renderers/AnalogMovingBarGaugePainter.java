package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Stroke;

public class AnalogMovingBarGaugePainter extends RoundAnalogGaugePainter {
  static String NAME = "Analog Moving Bar Gauge";
  
  private g needleStroke = null;
  
  public String getName() {
    return NAME;
  }
  
  protected Image paintBackground(Graphics paramGraphics, Gauge paramGauge, int paramInt) {
    Image image = super.paintBackground(paramGraphics, paramGauge, currentState(paramGauge));
    Graphics2D graphics2D = (Graphics2D)image.getGraphics();
    if (parentGauge() == null)
      setParentGauge(paramGauge); 
    double d = paramGauge.getSweepAngle();
    int i = Math.round(getNeedleWidth(paramGauge));
    int j = paramGauge.getBorderWidth() + i / 2;
    int k = paramGauge.getBorderWidth() + i / 2;
    if (paramGauge.isAntialiasingOn()) {
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    } 
    graphics2D.setStroke(getNeedleStroke(paramGauge));
    graphics2D.setColor(paramGauge.getTrimColor());
    if (paramGauge.isCounterClockwise()) {
      graphics2D.drawArc(j, k, getGaugeWidth(paramGauge) - i - 2 * paramGauge.getBorderWidth(), getGaugeHeight(paramGauge) - i - 2 * paramGauge.getBorderWidth(), 180 - paramGauge.getSweepBeginDegree() - paramGauge.getSweepAngle(), (int)Math.round(d));
    } else {
      graphics2D.drawArc(j, k, getGaugeWidth(paramGauge) - i - 2 * paramGauge.getBorderWidth(), getGaugeHeight(paramGauge) - i - 2 * paramGauge.getBorderWidth(), paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle(), 0 - (int)Math.round(d));
    } 
    return image;
  }
  
  protected void drawWarningIndicator(Graphics paramGraphics, Gauge paramGauge) {}
  
  protected void drawWarningBars(Graphics2D paramGraphics2D, Gauge paramGauge) {}
  
  protected Color getNeedleColor(Gauge paramGauge) {
    return getNeedleColor(paramGauge, paramGauge.getValue());
  }
  
  protected Color getNeedleColor(Gauge paramGauge, double paramDouble) {
    return (paramDouble > paramGauge.lowWarning() && paramDouble < paramGauge.highWarning()) ? paramGauge.getNeedleColor() : ((paramDouble > paramGauge.highCritical()) ? paramGauge.getCriticalColor() : paramGauge.getWarnColor());
  }
  
  protected void drawStrings(Graphics paramGraphics, Gauge paramGauge) {}
  
  protected double getOuterEdge(Gauge paramGauge) {
    return (paramGauge.getWidth() > paramGauge.getHeight()) ? (0.95D - getNeedleWidthPercent() - 2.0D * paramGauge.getBorderWidth() / getGaugeHeight(paramGauge)) : (0.95D - getNeedleWidthPercent() - 2.0D * paramGauge.getBorderWidth() / getGaugeWidth(paramGauge));
  }
  
  protected double getNumberOfMinorTickPerMajor(Gauge paramGauge) {
    return 1.0D;
  }
  
  protected void drawNeedle(Graphics paramGraphics, Gauge paramGauge, double paramDouble) {
    double d1 = (getSmoothedValue(paramGauge) - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    double d2 = paramGauge.getSweepAngle() * d1;
    double d3 = (paramGauge.getHistoricalPeakValue() - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    double d4 = paramGauge.getSweepAngle() * d3;
    if (d2 < 1.0D)
      d2 = 1.0D; 
    int i = Math.round(getNeedleWidth(paramGauge));
    int j = (paramGauge.getWidth() - getGaugeWidth(paramGauge)) / 2 + paramGauge.getBorderWidth() + i / 2;
    int k = (paramGauge.getHeight() - getGaugeHeight(paramGauge)) / 2 + paramGauge.getBorderWidth() + i / 2;
    ((Graphics2D)paramGraphics).setStroke(getNeedleStroke(paramGauge));
    paramGraphics.setColor(getNeedleColor(paramGauge));
    if (paramGauge.isCounterClockwise()) {
      paramGraphics.drawArc(j, k, getGaugeWidth(paramGauge) - i - 2 * paramGauge.getBorderWidth(), getGaugeHeight(paramGauge) - i - 2 * paramGauge.getBorderWidth(), 180 - paramGauge.getSweepBeginDegree() - paramGauge.getSweepAngle(), (int)Math.round(d2));
      if (d3 - d1 > 0.01D) {
        paramGraphics.setColor(getNeedleColor(paramGauge, paramGauge.getHistoricalPeakValue()));
        paramGraphics.drawArc(j, k, getGaugeWidth(paramGauge) - i - 2 * paramGauge.getBorderWidth(), getGaugeHeight(paramGauge) - i - 2 * paramGauge.getBorderWidth(), 180 - paramGauge.getSweepBeginDegree() - paramGauge.getSweepAngle() + (int)Math.round(d4), 1);
      } 
    } else {
      paramGraphics.drawArc(j, k, getGaugeWidth(paramGauge) - i - 2 * paramGauge.getBorderWidth(), getGaugeHeight(paramGauge) - i - 2 * paramGauge.getBorderWidth(), paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle(), 0 - (int)Math.round(d2));
      if (d3 - d1 > 0.01D) {
        paramGraphics.setColor(getNeedleColor(paramGauge, paramGauge.getHistoricalPeakValue()));
        paramGraphics.drawArc(j, k, getGaugeWidth(paramGauge) - i - 2 * paramGauge.getBorderWidth(), getGaugeHeight(paramGauge) - i - 2 * paramGauge.getBorderWidth(), paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle() - (int)Math.round(d4), 1);
      } 
    } 
  }
  
  public float getNeedleWidthPercent() {
    return 0.07F;
  }
  
  public float getNeedleWidth(Gauge paramGauge) {
    return getGaugeSize(paramGauge) * getNeedleWidthPercent();
  }
  
  public Stroke getNeedleStroke(Gauge paramGauge) {
    if (this.needleStroke == null) {
      float f = getNeedleWidth(paramGauge);
      this.needleStroke = new g(f, 0, 2);
    } 
    return this.needleStroke;
  }
  
  public void invalidate() {
    super.invalidate();
    this.needleStroke = null;
  }
  
  public boolean isShapeLockedToAspect() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/AnalogMovingBarGaugePainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */