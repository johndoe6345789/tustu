package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class RoundAnalogGaugePainter extends AnalogGaugePainter {
  String name = "Circle Analog Gauge";

  protected int getGaugeWidth(Gauge paramGauge) {
    return getGaugeSize(paramGauge);
  }

  protected int getGaugeHeight(Gauge paramGauge) {
    return getGaugeSize(paramGauge);
  }

  public String getName() {
    return this.name;
  }

  protected int getGaugeSize(Gauge paramGauge) {
    return (paramGauge.getHeight() > paramGauge.getWidth())
        ? paramGauge.getWidth()
        : paramGauge.getHeight();
  }

  protected int getXOffset(Gauge paramGauge) {
    int i = getGaugeSize(paramGauge);
    return (paramGauge.getWidth() > i) ? ((paramGauge.getWidth() - i) / 2) : 0;
  }

  protected int getYOffset(Gauge paramGauge) {
    int i = getGaugeSize(paramGauge);
    return (paramGauge.getHeight() > i) ? ((paramGauge.getHeight() - i) / 2) : 0;
  }

  public boolean isShapeLockedToAspect() {
    return true;
  }

  protected void drawWarningBars(Graphics2D paramGraphics2D, Gauge paramGauge) {
    int i = (int) (getGaugeSize(paramGauge) * 0.033D);
    int j = (int) Math.round(getAngleFromValue(paramGauge, paramGauge.highWarning()));
    int k = (int) Math.round(getAngleFromValue(paramGauge, paramGauge.highCritical()));
    int m = (int) Math.round(getAngleFromValue(paramGauge, paramGauge.max()));
    int n = (int) Math.round(getAngleFromValue(paramGauge, paramGauge.lowWarning()));
    int i1 =
        (paramGauge.lowCritical() < paramGauge.min())
            ? (int) Math.round(getAngleFromValue(paramGauge, paramGauge.min()))
            : (int) Math.round(getAngleFromValue(paramGauge, paramGauge.lowCritical()));
    int i2 = (int) Math.round(getAngleFromValue(paramGauge, paramGauge.min()));
    int i3 = paramGauge.getBorderWidth() + i / 2 + i / 2;
    BasicStroke basicStroke = new BasicStroke(i, 0, 0);
    paramGraphics2D.setStroke(basicStroke);
    if (paramGauge.highWarning() < paramGauge.max()) {
      paramGraphics2D.setColor(paramGauge.getWarnColor());
      paramGraphics2D.drawArc(
          i3,
          i3,
          getGaugeWidth(paramGauge) - 2 * i3,
          getGaugeHeight(paramGauge) - 2 * i3,
          j,
          k - j);
    }
    if (paramGauge.highCritical() < paramGauge.max()) {
      paramGraphics2D.setColor(paramGauge.getCriticalColor());
      paramGraphics2D.drawArc(
          i3,
          i3,
          getGaugeWidth(paramGauge) - 2 * i3,
          getGaugeHeight(paramGauge) - 2 * i3,
          k,
          m - k);
    }
    if (paramGauge.lowWarning() > paramGauge.min()) {
      paramGraphics2D.setColor(paramGauge.getWarnColor());
      paramGraphics2D.drawArc(
          i3,
          i3,
          getGaugeWidth(paramGauge) - 2 * i3,
          getGaugeHeight(paramGauge) - 2 * i3,
          i1,
          n - i1);
    }
    if (paramGauge.lowCritical() > paramGauge.min()) {
      paramGraphics2D.setColor(paramGauge.getCriticalColor());
      paramGraphics2D.drawArc(
          i3,
          i3,
          getGaugeWidth(paramGauge) - 2 * i3,
          getGaugeHeight(paramGauge) - 2 * i3,
          i1,
          i2 - i1);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/RoundAnalogGaugePainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
