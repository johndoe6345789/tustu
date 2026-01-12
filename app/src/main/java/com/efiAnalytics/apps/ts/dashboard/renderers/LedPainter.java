package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.s;
import java.awt.Graphics;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class LedPainter implements GaugePainter {
  public String getName() {
    return "LED Readout (Not Ready)";
  }

  public void paintGauge(Graphics paramGraphics, s params) {
    paramGraphics.drawString("Not finished", 0, paramGraphics.getFont().getSize());
  }

  public void invalidate() {}

  public void initialize(Gauge paramGauge) {}

  public boolean isShapeLockedToAspect() {
    return false;
  }

  public boolean requiresBackgroundRepaint(s params) {
    return false;
  }

  public void updateGauge(Graphics paramGraphics, s params) {}

  public void paintBackground(Graphics paramGraphics, s params) {}

  public Area areaPainted(s params) {
    Gauge gauge = (Gauge) params;
    Rectangle2D.Double double_ =
        new Rectangle2D.Double(0.0D, 0.0D, gauge.getWidth(), gauge.getHeight());
    return new Area(double_);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/LedPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
