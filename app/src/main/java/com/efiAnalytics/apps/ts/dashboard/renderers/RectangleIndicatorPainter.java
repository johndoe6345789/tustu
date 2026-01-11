package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.Indicator;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.cq;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import r.IOPropertiesUsingFile;

public class RectangleIndicatorPainter implements IndicatorPainter {
  static String NAME = "Basic Rectangle Indicator";
  
  transient Font textFont = null;
  
  transient Image offImage = null;
  
  int lastWidth = -1;
  
  int lastHeight = -1;
  
  double lastValue = Double.NaN;
  
  Area onImageArea = null;
  
  Area offImageArea = null;
  
  private boolean maskImages = false;
  
  public RectangleIndicatorPainter() {
    this.maskImages = IOPropertiesUsingFile.IOPropertiesUsingFile().c(IOPropertiesUsingFile.al, false);
  }
  
  public String getName() {
    return NAME;
  }
  
  public void paintGauge(Graphics paramGraphics, s params) {
    Indicator indicator = (Indicator)params;
    this.lastWidth = params.getWidth();
    this.lastHeight = params.getHeight();
    this.lastValue = indicator.getValue();
    if (indicator.getValue() == 0.0D) {
      Color color = indicator.getOffBackgroundColor();
      drawBackground(paramGraphics, indicator, color);
      if (indicator.offImage() != null) {
        Image image = indicator.offImage();
        float f = getImageScaleRatio(indicator, image);
        int i = (int)(image.getWidth(null) * f);
        int j = (int)(image.getHeight(null) * f);
        paramGraphics.drawImage(image, (indicator.getWidth() - i) / 2, (indicator.getHeight() - j) / 2, i, j, null);
        if (this.maskImages && this.offImageArea == null)
          this.offImageArea = getImageOutline(indicator, image, f); 
      } 
      drawText(paramGraphics, indicator.offText(), indicator, indicator.getOffTextColor());
    } else {
      Color color = indicator.getOnBackgroundColor();
      drawBackground(paramGraphics, indicator, color);
      if (indicator.onImage() != null) {
        Image image = indicator.onImage();
        float f = getImageScaleRatio(indicator, image);
        int i = (int)(image.getWidth(null) * f);
        int j = (int)(image.getHeight(null) * f);
        paramGraphics.drawImage(image, (indicator.getWidth() - i) / 2, (indicator.getHeight() - j) / 2, i, j, null);
        if (this.maskImages && this.onImageArea == null)
          this.onImageArea = getImageOutline(indicator, image, f); 
      } 
      drawText(paramGraphics, indicator.onText(), indicator, indicator.getOnTextColor());
    } 
  }
  
  private float getImageScaleRatio(Indicator paramIndicator, Image paramImage) {
    if (paramImage != null) {
      float f1 = paramIndicator.getWidth() / paramImage.getWidth(null);
      float f2 = paramIndicator.getHeight() / paramImage.getHeight(null);
      return (f1 < f2) ? f1 : f2;
    } 
    return 1.0F;
  }
  
  private void drawBackground(Graphics paramGraphics, Indicator paramIndicator, Color paramColor) {
    if (paramColor != null && paramColor.getAlpha() > 0) {
      paramGraphics.setColor(paramColor);
      paramGraphics.fill3DRect(0, 0, paramIndicator.getWidth(), paramIndicator.getHeight(), true);
      paramGraphics.draw3DRect(1, 1, paramIndicator.getWidth() - 3, paramIndicator.getHeight() - 3, true);
    } 
  }
  
  private void drawText(Graphics paramGraphics, String paramString, Indicator paramIndicator, Color paramColor) {
    if (paramIndicator.isAntialiasingOn()) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    } 
    paramGraphics.setColor(paramColor);
    Font font = getTextFont(paramIndicator);
    paramGraphics.setFont(font);
    int i = (paramIndicator.getWidth() - paramIndicator.getFontMetrics(font).stringWidth(paramString)) / 2;
    int j = (int)((paramIndicator.getHeight() / 2) + font.getSize() * 0.36D);
    paramGraphics.drawString(paramString, i, j);
  }
  
  protected Font getTextFont(Indicator paramIndicator) {
    if (this.textFont != null)
      return this.textFont; 
    int i = (int)((paramIndicator.getHeight() - (paramIndicator.insets()).top - (paramIndicator.insets()).bottom) * 0.98D);
    int j = paramIndicator.getWidth() - (paramIndicator.insets()).left - (paramIndicator.insets()).right;
    String str = paramIndicator.getFontFamily();
    boolean bool = paramIndicator.isItalicFont() ? true : false;
    Font font = cq.IOPropertiesUsingFile().IOPropertiesUsingFile(str, bool, i);
    if (font.canDisplayUpTo(paramIndicator.onText()) >= 0 && font.canDisplayUpTo(paramIndicator.offText()) >= 0)
      font = cq.IOPropertiesUsingFile().IOPropertiesUsingFile("", bool, i); 
    while (true) {
      FontMetrics fontMetrics = paramIndicator.getFontMetrics(font);
      if ((fontMetrics.stringWidth(paramIndicator.onText()) < j && fontMetrics.stringWidth(paramIndicator.offText()) < j) || i < 1) {
        this.textFont = font;
        return this.textFont;
      } 
      font = cq.IOPropertiesUsingFile().IOPropertiesUsingFile(str, bool, --i);
    } 
  }
  
  public void invalidate() {
    this.textFont = null;
    this.offImage = null;
    this.onImageArea = null;
    this.offImageArea = null;
  }
  
  public boolean isMustPaint() {
    return false;
  }
  
  public boolean requiresBackgroundRepaint(s params) {
    Indicator indicator = (Indicator)params;
    return (params.getWidth() != this.lastWidth || params.getHeight() != this.lastHeight || indicator.getValue() != this.lastValue || this.textFont == null);
  }
  
  public void updateGauge(Graphics paramGraphics, s params) {}
  
  public void paintBackground(Graphics paramGraphics, s params) {
    paintGauge(paramGraphics, params);
  }
  
  public Area areaPainted(s params) {
    Area area;
    Indicator indicator = (Indicator)params;
    Color color = (indicator.getValue() == 0.0D) ? indicator.getOffBackgroundColor() : indicator.getOnBackgroundColor();
    if (color != null && color.getAlpha() > 0) {
      Rectangle2D.Double double_ = new Rectangle2D.Double(0.0D, 0.0D, params.getWidth(), params.getHeight());
      area = new Area(double_);
    } else if (indicator.getValue() == 0.0D && this.offImageArea != null) {
      area = (Area)this.offImageArea.clone();
    } else if (this.onImageArea != null) {
      area = (Area)this.onImageArea.clone();
    } else {
      area = new Area(new Rectangle2D.Double(0.0D, 0.0D, params.getWidth(), params.getHeight()));
    } 
    return area;
  }
  
  private Area getImageOutline(Indicator paramIndicator, Image paramImage, double paramDouble) {
    int i = (int)(paramImage.getWidth((ImageObserver)paramIndicator) * paramDouble);
    int j = (int)(paramImage.getHeight((ImageObserver)paramIndicator) * paramDouble);
    if (i <= 0 || j <= 0)
      return null; 
    BufferedImage bufferedImage = new BufferedImage(paramIndicator.getWidth(), paramIndicator.getHeight(), 6);
    Graphics graphics = bufferedImage.getGraphics();
    graphics.drawImage(paramImage, (paramIndicator.getWidth() - i) / 2, (paramIndicator.getHeight() - j) / 2, i, j, null);
    return getImageOutline(bufferedImage);
  }
  
  private Area getImageOutline(BufferedImage paramBufferedImage) {
    Area area = new Area();
    byte b1 = -1;
    byte b2 = -1;
    if (paramBufferedImage.getHeight() < 256 && paramBufferedImage.getWidth() < 256) {
      for (byte b = 0; b < paramBufferedImage.getHeight(); b++) {
        for (byte b3 = 0; b3 < paramBufferedImage.getWidth(); b3++) {
          if (getAlpha(paramBufferedImage.getRGB(b3, b)) != 0) {
            if (b1 == -1) {
              b1 = b3;
              b2 = b;
            } else if (b3 == paramBufferedImage.getWidth() - 1) {
              Rectangle rectangle = new Rectangle(b1, b2, b3 - b1 + 1, b - b2 + 1);
              area.add(new Area(rectangle));
              b1 = -1;
              b2 = -1;
            } 
          } else if (b1 >= 0 && b2 >= 0) {
            Rectangle rectangle = new Rectangle(b1, b2, b3 - b1 + 1, b - b2 + 1);
            area.add(new Area(rectangle));
            b1 = -1;
            b2 = -1;
          } 
        } 
      } 
    } else {
      int i = -1;
      int j = -1;
      int k = -1;
      int m = -1;
      int n = paramBufferedImage.getHeight() / 2;
      int i1 = paramBufferedImage.getWidth() / 2;
      int i2;
      for (i2 = 0; i2 < paramBufferedImage.getWidth(); i2++) {
        if (getAlpha(paramBufferedImage.getRGB(i2, n)) != 0) {
          k = i2;
          break;
        } 
      } 
      for (i2 = paramBufferedImage.getWidth() - 1; i2 > 0; i2--) {
        if (getAlpha(paramBufferedImage.getRGB(i2, n)) != 0) {
          m = i2;
          break;
        } 
      } 
      for (i2 = 0; i2 < paramBufferedImage.getHeight(); i2++) {
        if (getAlpha(paramBufferedImage.getRGB(i1, i2)) != 0) {
          i = i2;
          break;
        } 
      } 
      for (i2 = paramBufferedImage.getHeight() - 1; i2 > 0; i2--) {
        if (getAlpha(paramBufferedImage.getRGB(i1, i2)) != 0) {
          j = i2;
          break;
        } 
      } 
      if (m > 0 && j > 0)
        area.add(new Area(new Rectangle(k, i, m - k + 1, j - i + 1))); 
    } 
    return area.getBounds().isEmpty() ? null : area;
  }
  
  private int getAlpha(int paramInt) {
    return paramInt >> 24 & 0xFF;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/RectangleIndicatorPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */