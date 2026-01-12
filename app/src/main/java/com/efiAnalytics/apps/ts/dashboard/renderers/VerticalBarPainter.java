package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.s;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class VerticalBarPainter implements GaugePainter {
  String name = "Vertical Bar Gauge";

  transient Image offImage = null;

  static final transient Color transparent = new Color(255, 255, 255, 0);

  public void paintGauge(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge) params;
    if (gauge.isCounterClockwise()) {
      Image image = getOffImage(gauge);
      Graphics graphics = image.getGraphics();
      graphics.setColor(transparent);
      ((Graphics2D) graphics).setComposite(AlphaComposite.getInstance(2));
      graphics.fillRect(0, 0, gauge.getWidth(), gauge.getHeight());
      paintBar(graphics, gauge);
      paintBorder(graphics, gauge);
      paramGraphics.drawImage(
          image, 0, gauge.getHeight(), gauge.getWidth(), -gauge.getHeight(), null);
    } else {
      paintBar(paramGraphics, gauge);
      paintBorder(paramGraphics, gauge);
    }
  }

  protected void paintBar(Graphics paramGraphics, Gauge paramGauge) {
    double d1 =
        (paramGauge.getSmoothedValue() - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    double d2 =
        (paramGauge.highWarning() - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    double d3 =
        (paramGauge.highCritical() - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    int i = paramGauge.getHeight() - (int) (paramGauge.getHeight() * d1);
    paramGraphics.setColor(paramGauge.getBackColor());
    paramGraphics.fillRect(0, 0, paramGauge.getWidth(), paramGauge.getHeight());
    paramGraphics.setColor(paramGauge.getFontColor());
    paramGraphics.fillRect(0, i, paramGauge.getWidth(), paramGauge.getHeight() - i);
    if (d1 > d2) {
      paramGraphics.setColor(paramGauge.getWarnColor());
      int j = (int) (paramGauge.getHeight() * (d1 - d2));
      paramGraphics.fillRect(0, i, paramGauge.getWidth(), j);
    }
    if (d1 > d3) {
      paramGraphics.setColor(paramGauge.getCriticalColor());
      int j = (int) (paramGauge.getHeight() * (d1 - d3));
      paramGraphics.fillRect(0, i, paramGauge.getWidth(), j);
    }
  }

  protected void paintBorder(Graphics paramGraphics, Gauge paramGauge) {
    paramGraphics.setColor(paramGauge.getTrimColor());
    for (byte b = 0; b < paramGauge.getBorderWidth(); b++)
      paramGraphics.draw3DRect(
          b,
          b,
          paramGauge.getWidth() - 1 - 2 * b,
          paramGauge.getHeight() - 1 - 2 * b,
          (paramGauge.getBorderWidth() / 2 >= b));
  }

  public void invalidate() {}

  public String getName() {
    return this.name;
  }

  public void initialize(Gauge paramGauge) {}

  public boolean isShapeLockedToAspect() {
    return false;
  }

  protected Image getOffImage(Gauge paramGauge) {
    if (this.offImage == null) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.offImage =
          graphicsConfiguration.createCompatibleImage(
              paramGauge.getWidth(), paramGauge.getHeight(), 3);
    }
    return this.offImage;
  }

  public boolean requiresBackgroundRepaint(s params) {
    return false;
  }

  public void updateGauge(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge) params;
    if (gauge.isCounterClockwise()) {
      Image image = getOffImage(gauge);
      Graphics graphics = image.getGraphics();
      graphics.setColor(transparent);
      ((Graphics2D) graphics).setComposite(AlphaComposite.getInstance(2));
      graphics.fillRect(0, 0, gauge.getWidth(), gauge.getHeight());
      paintBar(graphics, gauge);
      paramGraphics.drawImage(
          image, 0, gauge.getHeight(), gauge.getWidth(), -gauge.getHeight(), null);
    } else {
      paintBar(paramGraphics, gauge);
    }
  }

  public void paintBackground(Graphics paramGraphics, s params) {
    paintBorder(paramGraphics, (Gauge) params);
  }

  public Area areaPainted(s params) {
    Gauge gauge = (Gauge) params;
    Rectangle2D.Double double_ =
        new Rectangle2D.Double(0.0D, 0.0D, gauge.getWidth(), gauge.getHeight());
    return new Area(double_);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/VerticalBarPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
