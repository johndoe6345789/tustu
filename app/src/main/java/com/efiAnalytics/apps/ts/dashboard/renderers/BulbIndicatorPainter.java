package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Indicator;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.cq;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;

public class BulbIndicatorPainter implements IndicatorPainter {
  Font textFont = null;
  
  int minimumBulbSize = 14;
  
  int lastWidth = -1;
  
  int lastHeight = -1;
  
  double lastValue = Double.NaN;
  
  public String getName() {
    return "Bulb Indicator";
  }
  
  public void paintGauge(Graphics paramGraphics, s params) {
    Indicator indicator = (Indicator)params;
    this.lastWidth = params.getWidth();
    this.lastHeight = params.getHeight();
    this.lastValue = indicator.getValue();
    if (indicator.getValue() == 0.0D) {
      Color color = indicator.getOffBackgroundColor();
      drawBulb(paramGraphics, indicator, color);
      drawText(paramGraphics, indicator.offText(), indicator, indicator.getOffTextColor());
    } else {
      Color color = indicator.getOnBackgroundColor();
      drawBulb(paramGraphics, indicator, color);
      drawText(paramGraphics, indicator.onText(), indicator, indicator.getOnTextColor());
    } 
  }
  
  private void drawBulb(Graphics paramGraphics, Indicator paramIndicator, Color paramColor) {
    if (paramColor != null && paramColor.getAlpha() > 0) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      int i = paramIndicator.getHeight() - getTextFont(paramIndicator).getSize();
      int j = (paramIndicator.getWidth() - i) / 2;
      paramGraphics.setColor(paramColor.darker());
      paramGraphics.fillOval(j, 0, i, i);
      paramGraphics.setColor(paramColor.darker());
      paramGraphics.fillOval(j + 1, 1, i - 2, i - 2);
      paramGraphics.setColor(paramColor);
      paramGraphics.fillOval(j + 2, 2, i - 4, i - 4);
    } 
  }
  
  private void drawText(Graphics paramGraphics, String paramString, Indicator paramIndicator, Color paramColor) {
    if (paramColor != null && paramString != null) {
      paramGraphics.setColor(paramColor);
      Font font = getTextFont(paramIndicator);
      paramGraphics.setFont(font);
      int i = (paramIndicator.getWidth() - paramIndicator.getFontMetrics(font).stringWidth(paramString)) / 2;
      paramGraphics.drawString(paramString, i, paramIndicator.getHeight() - (int)(font.getSize() * 0.1D));
    } 
  }
  
  protected Font getTextFont(Indicator paramIndicator) {
    if (this.textFont != null)
      return this.textFont; 
    int i = paramIndicator.getHeight() - (paramIndicator.getInsets()).top - (paramIndicator.getInsets()).bottom - this.minimumBulbSize;
    i = (i > 20) ? 20 : i;
    int j = paramIndicator.getWidth() - (paramIndicator.getInsets()).left - (paramIndicator.getInsets()).right;
    String str = paramIndicator.getFontFamily();
    boolean bool = paramIndicator.isItalicFont() ? true : false;
    Font font = cq.a().a(str, bool, i);
    if (font.canDisplayUpTo(paramIndicator.onText()) >= 0 && font.canDisplayUpTo(paramIndicator.offText()) >= 0)
      font = cq.a().a("", bool, i); 
    while (true) {
      FontMetrics fontMetrics = paramIndicator.getFontMetrics(font);
      if ((fontMetrics.stringWidth(paramIndicator.onText()) < j && fontMetrics.stringWidth(paramIndicator.offText()) < j) || i < 1) {
        this.textFont = font;
        return this.textFont;
      } 
      font = cq.a().a(str, bool, --i);
    } 
  }
  
  public void invalidate() {
    this.textFont = null;
  }
  
  public boolean isMustPaint() {
    return true;
  }
  
  public boolean requiresBackgroundRepaint(s params) {
    Indicator indicator = (Indicator)params;
    return (params.getWidth() != this.lastWidth || params.getHeight() != this.lastHeight || indicator.getValue() != this.lastValue);
  }
  
  public void updateGauge(Graphics paramGraphics, s params) {}
  
  public void paintBackground(Graphics paramGraphics, s params) {
    paintGauge(paramGraphics, params);
  }
  
  public Area areaPainted(s params) {
    Indicator indicator = (Indicator)params;
    Area area = new Area();
    if ((indicator.getOffBackgroundColor() != null && indicator.getOffBackgroundColor().getAlpha() > 0) || (indicator.getOnBackgroundColor() != null && indicator.getOnBackgroundColor().getAlpha() > 0)) {
      int i = indicator.getHeight() - getTextFont(indicator).getSize();
      int j = (indicator.getWidth() - i) / 2;
      Arc2D.Double double_ = new Arc2D.Double(j, 0.0D, i, i, 0.0D, 360.0D, 2);
      area.add(new Area(double_));
    } 
    return area;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/BulbIndicatorPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */