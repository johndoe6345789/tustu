package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import java.awt.Graphics;

public class HorizontalLinePainter extends HorizontalBarPainter {
  protected void paintBar(Graphics paramGraphics, Gauge paramGauge) {
    double d1 = (paramGauge.getSmoothedValue() - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    double d2 = (paramGauge.highWarning() - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    double d3 = (paramGauge.highCritical() - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    int i = (int)((paramGauge.getWidth() - paramGauge.getBorderWidth() * 2) * d1) + paramGauge.getBorderWidth();
    if (i < paramGauge.getBorderWidth()) {
      i = paramGauge.getBorderWidth();
    } else if (i > paramGauge.getWidth() - paramGauge.getBorderWidth()) {
      i = paramGauge.getWidth() - paramGauge.getBorderWidth();
    } 
    paramGraphics.setColor(paramGauge.getBackColor());
    paramGraphics.fillRect(0, 0, paramGauge.getWidth(), paramGauge.getHeight());
    int j = paramGauge.getWidth() / 50;
    j = (j < 1) ? 1 : j;
    j = (j > 20) ? 20 : j;
    if (paramGauge.getSmoothedValue() > paramGauge.getHighCritical() || paramGauge.getSmoothedValue() < paramGauge.getLowCritical()) {
      paramGraphics.setColor(paramGauge.getCriticalColor());
    } else if (paramGauge.getSmoothedValue() > paramGauge.getHighWarning() || paramGauge.getSmoothedValue() < paramGauge.getLowWarning()) {
      paramGraphics.setColor(paramGauge.getWarnColor());
    } else {
      paramGraphics.setColor(paramGauge.getNeedleColor());
    } 
    paramGraphics.fillRect(i - j / 2, 0, j, paramGauge.getHeight());
    double d4 = Math.abs((paramGauge.getHistoricalPeakValue() - paramGauge.min()) / (paramGauge.max() - paramGauge.min()));
    if (paramGauge.isShowHistory() && d4 - d1 > 0.008D) {
      if (d4 > d3) {
        paramGraphics.setColor(paramGauge.getCriticalColor());
      } else if (d4 > d2) {
        paramGraphics.setColor(paramGauge.getWarnColor());
      } else {
        paramGraphics.setColor(paramGauge.getFontColor());
      } 
      i = (int)((paramGauge.getWidth() - paramGauge.getBorderWidth() * 2) * d4) + paramGauge.getBorderWidth();
      paramGraphics.drawRect(i - j / 2, 0, j, paramGauge.getHeight());
    } 
  }
  
  public String getName() {
    return "Horizontal Line Gauge";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/HorizontalLinePainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */