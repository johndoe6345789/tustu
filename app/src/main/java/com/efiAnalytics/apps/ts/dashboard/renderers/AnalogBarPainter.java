package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;

public class AnalogBarPainter extends RoundAnalogGaugePainter {
  static String NAME = "Analog Bar Gauge";

  private g needleStroke = null;

  public String getName() {
    return NAME;
  }

  protected Image paintBackground(Graphics paramGraphics, Gauge paramGauge, int paramInt) {
    if (parentGauge() == null) setParentGauge(paramGauge);
    Image image = super.paintBackground(paramGraphics, paramGauge, currentState(paramGauge));
    Graphics2D graphics2D = (Graphics2D) image.getGraphics();
    double d = paramGauge.getSweepAngle();
    int i = Math.round(getNeedleWidth(paramGauge));
    int j = paramGauge.getBorderWidth() + i / 2;
    int k = paramGauge.getBorderWidth() + i / 2;
    graphics2D.setRenderingHint(
        RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    graphics2D.setStroke(getNeedleStroke(paramGauge));
    graphics2D.setColor(paramGauge.getFontColor());
    if (paramGauge.isCounterClockwise()) {
      graphics2D.drawArc(
          j,
          k,
          getGaugeWidth(paramGauge) - i - 2 * paramGauge.getBorderWidth(),
          getGaugeHeight(paramGauge) - i - 2 * paramGauge.getBorderWidth(),
          180 - paramGauge.getSweepBeginDegree() - paramGauge.getSweepAngle(),
          (int) Math.round(d));
    } else {
      graphics2D.drawArc(
          j,
          k,
          getGaugeWidth(paramGauge) - i - 2 * paramGauge.getBorderWidth(),
          getGaugeHeight(paramGauge) - i - 2 * paramGauge.getBorderWidth(),
          paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle(),
          0 - (int) Math.round(d));
    }
    return image;
  }

  protected void drawWarningIndicator(Graphics paramGraphics, Gauge paramGauge) {}

  protected void drawWarningBars(Graphics2D paramGraphics2D, Gauge paramGauge) {}

  protected Color getNeedleColor(Gauge paramGauge) {
    return getNeedleColor(paramGauge, paramGauge.getValue());
  }

  protected Color getNeedleColor(Gauge paramGauge, double paramDouble) {
    return (paramDouble > paramGauge.lowWarning() && paramDouble < paramGauge.highWarning())
        ? paramGauge.getNeedleColor()
        : ((paramDouble > paramGauge.highCritical())
            ? paramGauge.getCriticalColor()
            : paramGauge.getWarnColor());
  }

  protected void drawStrings(Graphics paramGraphics, Gauge paramGauge) {}

  protected double getOuterEdge(Gauge paramGauge) {
    return (paramGauge.getWidth() > paramGauge.getHeight())
        ? (0.95D
            - getNeedleWidthPercent()
            - 2.0D * paramGauge.getBorderWidth() / getGaugeHeight(paramGauge))
        : (0.95D
            - getNeedleWidthPercent()
            - 2.0D * paramGauge.getBorderWidth() / getGaugeWidth(paramGauge));
  }

  protected double getNumberOfMinorTickPerMajor(Gauge paramGauge) {
    return 1.0D;
  }

  protected void drawNeedle(Graphics paramGraphics, Gauge paramGauge, double paramDouble) {
    double d1 = (paramGauge.getValue() - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    double d2 = paramDouble;
    if (d2 < 1.0D) d2 = 1.0D;
    paramGraphics.setColor(getNeedleColor(paramGauge));
    Polygon polygon = createNeedlePolygon(paramGauge, d2);
    paramGraphics.fillPolygon(polygon);
    if (paramGauge.isShowHistory()) {
      double d3 =
          (paramGauge.getHistoricalPeakValue() - paramGauge.min())
              / (paramGauge.max() - paramGauge.min());
      double d4 =
          (paramGauge.getSweepBeginDegree() + paramGauge.getSweepAngle())
              - paramGauge.getSweepAngle() * d3;
      if (d3 - d1 > 0.01D) {
        paramGraphics.setColor(getNeedleColor(paramGauge, paramGauge.getHistoricalPeakValue()));
        Polygon polygon1 = createNeedlePolygon(paramGauge, d4);
        paramGraphics.drawPolygon(polygon1);
      }
    }
  }

  protected Polygon createNeedlePolygon(Gauge paramGauge, double paramDouble) {
    int i = getGaugeSize(paramGauge);
    double d = 1.005D - 2.0D * paramGauge.getBorderWidth() / i;
    Polygon polygon = new Polygon();
    Point point1 =
        getPoint(
            i,
            i,
            paramDouble - 4.0D,
            paramGauge.getWidth() / 2,
            paramGauge.getHeight() / 2,
            d,
            paramGauge.isCounterClockwise());
    Point point2 =
        getPoint(
            i,
            i,
            paramDouble + 4.0D,
            paramGauge.getWidth() / 2,
            paramGauge.getHeight() / 2,
            d,
            paramGauge.isCounterClockwise());
    Point point3 =
        getPoint(
            i,
            i,
            paramDouble + 1.0D,
            paramGauge.getWidth() / 2,
            paramGauge.getHeight() / 2,
            getOuterEdge(paramGauge) + 0.02D,
            paramGauge.isCounterClockwise());
    Point point4 =
        getPoint(
            i,
            i,
            paramDouble - 1.0D,
            paramGauge.getWidth() / 2,
            paramGauge.getHeight() / 2,
            getOuterEdge(paramGauge) + 0.02D,
            paramGauge.isCounterClockwise());
    polygon.addPoint(point1.x, point1.y);
    polygon.addPoint(point2.x, point2.y);
    polygon.addPoint(point3.x, point3.y);
    polygon.addPoint(point4.x, point4.y);
    return polygon;
  }

  public float getNeedleWidthPercent() {
    return 0.09F;
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

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/AnalogBarPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
