package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.cq;
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

public class BasicReadoutGaugePainter implements GaugePainter {
  int lastWidth = 0;

  int lastHeight = 0;

  String lastDisplayVal = "";

  final String name = "Basic Readout";

  private String fontName = null;

  int maxStringWidth = 0;

  transient Font titleFont = null;

  transient Font valueFont = null;

  transient Color backColor = null;

  Image backgroundImg = null;

  int lastDigits = 0;

  public String getName() {
    return "Basic Readout";
  }

  private void checkFontFamily(Gauge paramGauge) {
    if (this.fontName == null) {
      Font font = cq.a().a(paramGauge.getFontFamily(), 1, 12);
      if (font.canDisplayUpTo(paramGauge.title()) >= 0
          || font.canDisplayUpTo(paramGauge.units()) >= 0) {
        this.fontName = "Arial Unicode MS";
      } else {
        this.fontName = paramGauge.getFontFamily();
      }
    }
  }

  public void paintGauge(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge) params;
    checkFontFamily(gauge);
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    if (gauge.isAntialiasingOn()) {
      graphics2D.setRenderingHint(
          RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(
          RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }
    int i = gauge.getWidth();
    int j = gauge.getHeight();
    if (this.backgroundImg == null
        || this.backgroundImg.getWidth(null) != i
        || this.backgroundImg.getHeight(null) != j) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.backgroundImg = graphicsConfiguration.createCompatibleImage(i, j, 3);
      paintBackground(this.backgroundImg.getGraphics(), gauge);
    }
    paramGraphics.drawImage(this.backgroundImg, 0, 0, null);
    paintValues(paramGraphics, gauge);
    paintBorder(paramGraphics, gauge);
  }

  private void paintBackground(Graphics paramGraphics, Gauge paramGauge) {
    int i = paramGauge.getWidth();
    int j = paramGauge.getHeight();
    this.lastWidth = i;
    this.lastHeight = j;
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    graphics2D.setRenderingHint(
        RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    this.backColor = getCurrentBackColor(paramGauge);
    if (this.backColor != null && this.backColor.getAlpha() > 0) {
      paramGraphics.setColor(this.backColor);
      if (paramGauge.getBorderWidth() > 0) {
        paramGraphics.fillRect(0, 0, i, j);
      } else {
        paramGraphics.fillRoundRect(
            0, 0, i, j, paramGauge.getHeight() / 4, paramGauge.getHeight() / 4);
      }
    }
    if (paramGauge.backgroundImage() != null) {
      graphics2D.setRenderingHint(
          RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
      graphics2D.drawImage(paramGauge.backgroundImage(), 0, 0, i, j, null);
    }
  }

  private Color getCurrentBackColor(Gauge paramGauge) {
    Color color = null;
    if (paramGauge.getValue() > paramGauge.highCritical()
        || paramGauge.getValue() < paramGauge.lowCritical()) {
      color = paramGauge.getCriticalColor();
    } else if (paramGauge.getValue() > paramGauge.highWarning()
        || paramGauge.getValue() < paramGauge.lowWarning()) {
      color = paramGauge.getWarnColor();
    } else {
      color = paramGauge.getBackColor();
    }
    return color;
  }

  private void paintValues(Graphics paramGraphics, Gauge paramGauge) {
    String str1 = paramGauge.getDisplayValue();
    if (str1.length() != this.lastDigits) {
      this.titleFont = null;
      this.valueFont = null;
      this.lastDigits = str1.length();
    }
    Font font1 = getValueFont(paramGauge);
    Font font2 = getTitleFont(paramGauge);
    boolean bool = (paramGauge.title().equals("") && paramGauge.units().equals("")) ? true : false;
    int i =
        bool
            ? (paramGauge.getBorderWidth()
                + (paramGauge.getHeight() - 2 * paramGauge.getBorderWidth()) / 2
                + (int) (font1.getSize() * 0.37D))
            : (paramGauge.getBorderWidth()
                + (paramGauge.getHeight() - 2 * paramGauge.getBorderWidth()) / 2
                + (int) (font1.getSize() * 0.2D));
    paramGraphics.setFont(font1);
    paramGraphics.setColor(paramGauge.getFontColor());
    int j = (paramGauge.getWidth() - paramGraphics.getFontMetrics().stringWidth(str1)) / 2;
    paramGraphics.drawString(str1, j, i);
    this.lastDisplayVal = str1;
    paramGraphics.setFont(font2);
    String str2 = paramGauge.title();
    if (paramGauge.units() != null && !paramGauge.units().equals(""))
      str2 = str2 + " (" + paramGauge.units() + ")";
    j = (paramGauge.getWidth() - paramGraphics.getFontMetrics().stringWidth(str2)) / 2;
    j = (j < paramGauge.getBorderWidth()) ? paramGauge.getBorderWidth() : j;
    i += (int) (paramGraphics.getFont().getSize() * 1.1D);
    paramGraphics.drawString(str2, j, i);
  }

  private Font getValueFont(Gauge paramGauge) {
    if (this.valueFont == null) setFonts(paramGauge);
    return this.valueFont;
  }

  private Font getTitleFont(Gauge paramGauge) {
    if (this.titleFont == null) setFonts(paramGauge);
    return this.titleFont;
  }

  private void setFonts(Gauge paramGauge) {
    int i = paramGauge.getHeight();
    double d = 0.79D;
    if (paramGauge.getHeight() > paramGauge.getWidth())
      d = Math.pow(d, 2.0D) * paramGauge.getWidth() / paramGauge.getHeight();
    if (paramGauge.title().equals("") && paramGauge.units().equals("")) d += 0.19D;
    int j = i - paramGauge.getBorderWidth() * 2;
    int k = (int) (j * d) + paramGauge.getFontSizeAdjustment() * j / 30;
    int m = j / 4;
    byte b = 10;
    if (k < 0) {
      k = 1;
      m = 1;
    } else if (m < b) {
      int i1 = k + m;
      if (i1 > b * 2) {
        m = b;
        k = i1 - b;
      } else {
        m = i1 / 2;
        k = i1 / 2;
      }
    } else {
      m = j / 4;
    }
    boolean bool = paramGauge.isItalicFont() ? true : true;
    String str = paramGauge.getDisplayValue();
    int n = (int) ((paramGauge.getWidth() - 2 * paramGauge.getBorderWidth()) * 0.98D);
    while (true) {
      this.valueFont = cq.a().a(paramGauge.getFontFamily(), bool, k--);
      if (paramGauge.getFontMetrics(this.valueFont).stringWidth(str) <= n) {
        String str1 = paramGauge.title();
        if (paramGauge.units() != null && !paramGauge.units().equals(""))
          str1 = str1 + " (" + paramGauge.units() + ")";
        do {
          this.titleFont = cq.a().a(this.fontName, bool, m--);
        } while (paramGauge.getFontMetrics(this.titleFont).stringWidth(str1) > n);
        return;
      }
    }
  }

  private void paintBorder(Graphics paramGraphics, Gauge paramGauge) {
    int i = paramGauge.getWidth();
    int j = paramGauge.getHeight();
    paramGraphics.setColor(paramGauge.getTrimColor());
    for (byte b = 0; b < paramGauge.getBorderWidth(); b++)
      paramGraphics.draw3DRect(
          b, b, i - 2 * b - 1, j - 2 * b - 1, (b < paramGauge.getBorderWidth() / 2));
  }

  public void invalidate() {
    this.fontName = null;
    this.titleFont = null;
    this.valueFont = null;
    this.backgroundImg = null;
  }

  public void initialize(Gauge paramGauge) {}

  public boolean isShapeLockedToAspect() {
    return false;
  }

  public boolean requiresBackgroundRepaint(s params) {
    return (params.getWidth() != this.lastWidth
        || params.getHeight() != this.lastHeight
        || this.backColor == null
        || !this.backColor.equals(getCurrentBackColor((Gauge) params)));
  }

  public void updateGauge(Graphics paramGraphics, s params) {
    if (params.isAntialiasingOn()) {
      Graphics2D graphics2D = (Graphics2D) paramGraphics;
      graphics2D.setRenderingHint(
          RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(
          RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }
    paintValues(paramGraphics, (Gauge) params);
  }

  public void paintBackground(Graphics paramGraphics, s params) {
    paintBackground(paramGraphics, (Gauge) params);
    paintBorder(paramGraphics, (Gauge) params);
  }

  public Area areaPainted(s params) {
    Area area;
    Gauge gauge = (Gauge) params;
    if (gauge.getBackColor().getAlpha() > 50) {
      Rectangle2D.Double double_ =
          new Rectangle2D.Double(0.0D, 0.0D, gauge.getWidth(), gauge.getHeight());
      area = new Area(double_);
    } else {
      area = new Area();
    }
    return area;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/BasicReadoutGaugePainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
