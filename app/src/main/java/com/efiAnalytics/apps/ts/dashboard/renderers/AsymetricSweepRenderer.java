package com.efiAnalytics.apps.ts.dashboard.renderers;

import bH.X;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.aR;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.cq;
import com.efiAnalytics.ui.dL;
import com.efiAnalytics.ui.eJ;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AsymetricSweepRenderer implements aR, GaugePainter {
  int barThickness = eJ.a(10);
  
  private GradientPaint outerGradient = null;
  
  double lastValue = 0.0D;
  
  transient Image bottomOffImage = null;
  
  transient Image topOffImage = null;
  
  transient List numberPositions = null;
  
  g tickStroke = new g(eJ.a(4), 1, 1);
  
  private b barShape = null;
  
  HashMap darkColorCache = new HashMap<>();
  
  public void initialize(Gauge paramGauge) {}
  
  public boolean isShapeLockedToAspect() {
    return false;
  }
  
  public String getName() {
    return "Asymetric Sweep Gauge";
  }
  
  public void paintGauge(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge)params;
    Graphics2D graphics2D1 = (Graphics2D)paramGraphics;
    graphics2D1.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Image image = getBottomOffImage(gauge);
    Graphics2D graphics2D2 = (Graphics2D)image.getGraphics();
    graphics2D2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    paramGraphics.drawImage(image, 0, 0, null);
    paintNeedle(graphics2D1, gauge, false);
    boolean bool = true;
    if (bool) {
      paramGraphics.drawImage(getTopOffImage(gauge), 0, 0, null);
    } else {
      paintNumbers(graphics2D1, gauge);
      paintBorder(graphics2D1, gauge);
    } 
  }
  
  private void paintNumbers(Graphics2D paramGraphics2D, Gauge paramGauge) {
    if (paramGauge.getFontColor().getAlpha() > 0) {
      List list = getNumberPositions(paramGauge);
      float f = (getBarShape(paramGauge)).j * 0.08F;
      int i = Math.round(((getBarShape(paramGauge)).j - paramGauge.getBorderWidth()) * 0.38F) + paramGauge.getFontSizeAdjustment();
      i = (i < 1) ? 1 : i;
      boolean bool = paramGauge.isItalicFont() ? true : false;
      Font font = cq.a().a(paramGauge.getFontFamily(), bool, i);
      paramGraphics2D.setFont(font);
      paramGraphics2D.setColor(paramGauge.getFontColor());
      Color color = paramGauge.getTrimColor().darker();
      float[] arrayOfFloat1 = new float[4];
      float[] arrayOfFloat2 = new float[4];
      for (c c : list) {
        float f1 = (float)getBarShape(paramGauge).b(c.a()) + (paramGauge.getBorderWidth() / 2);
        float f2 = getBarShape(paramGauge).d((getBarShape(paramGauge)).c, f1) - (paramGauge.getBorderWidth() / 2);
        arrayOfFloat1[0] = f1;
        arrayOfFloat2[0] = f2 - f;
        arrayOfFloat1[1] = f1 - f / 3.0F;
        arrayOfFloat2[1] = f2;
        arrayOfFloat1[2] = f1 + f / 3.0F;
        arrayOfFloat2[2] = f2;
        arrayOfFloat1[3] = f1;
        arrayOfFloat2[3] = f2 - f;
        dL dL = new dL(arrayOfFloat1, arrayOfFloat2, arrayOfFloat1.length);
        paramGraphics2D.setColor(color);
        paramGraphics2D.setStroke(this.tickStroke);
        paramGraphics2D.draw((Shape)dL);
        paramGraphics2D.fill((Shape)dL);
        String str = X.a(c.b(), paramGauge.getLabelDigits());
        int j = paramGraphics2D.getFontMetrics(font).stringWidth(str);
        float f3 = f1 - j / 2.0F;
        float f4 = f2 - (((getBarShape(paramGauge)).j - i) / 2);
        TextLayout textLayout = new TextLayout(str, font, paramGraphics2D.getFontRenderContext());
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(f3, f4);
        Shape shape = textLayout.getOutline(affineTransform);
        paramGraphics2D.setColor(paramGauge.getFontColor());
        paramGraphics2D.drawString(str, f3, f4);
        paramGraphics2D.setColor(paramGauge.getTrimColor());
        paramGraphics2D.setStroke(new BasicStroke(i / 30.0F));
        paramGraphics2D.draw(shape);
      } 
    } 
  }
  
  private void paintNeedle(Graphics2D paramGraphics2D, Gauge paramGauge, boolean paramBoolean) {
    double d1 = paramBoolean ? paramGauge.min() : paramGauge.getSmoothedValue();
    double d2 = (d1 - paramGauge.min()) / (paramGauge.max() - paramGauge.min());
    this.lastValue = d1;
    float[] arrayOfFloat1 = { 0.0F, 0.8F };
    Color[] arrayOfColor = { paramGauge.getNeedleColor().darker(), getBrighter(paramGauge.getNeedleColor()) };
    float f1 = eJ.a(450);
    byte b1 = (paramGauge.getWidth() > f1) ? (20 + Math.round((paramGauge.getWidth() - f1) / 22.4F)) : 20;
    float f2 = 0.065F;
    float f3 = (paramGauge.getWidth() - 2.5F * paramGauge.getBorderWidth()) / b1;
    float[] arrayOfFloat2 = new float[5];
    float[] arrayOfFloat3 = new float[5];
    boolean bool = false;
    for (byte b2 = 0; b2 < b1; b2++) {
      float f4 = b2 / b1;
      float f5 = (b2 + 1.0F) / b1;
      float f6 = paramGauge.isCounterClockwise() ? ((paramGauge.getWidth() - paramGauge.getBorderWidth()) - b2 * f3 - f3 * f2) : (paramGauge.getBorderWidth() + b2 * f3 + f3 * f2);
      float f7 = paramGauge.isCounterClockwise() ? ((paramGauge.getWidth() - paramGauge.getBorderWidth()) - (b2 + 1) * f3 + f3 * f2) : (paramGauge.getBorderWidth() + (b2 + 1) * f3 - f3 * f2);
      float f8 = getBarShape(paramGauge).d(this.barShape.b, f6);
      float f9 = getBarShape(paramGauge).d(this.barShape.b, f7);
      float f10 = getBarShape(paramGauge).d(this.barShape.c, f6);
      float f11 = getBarShape(paramGauge).d(this.barShape.c, f7);
      arrayOfFloat2[0] = f6;
      arrayOfFloat3[0] = f8;
      arrayOfFloat2[1] = f7;
      arrayOfFloat3[1] = f9;
      arrayOfFloat2[2] = f7;
      arrayOfFloat3[2] = f11;
      arrayOfFloat2[3] = f6;
      arrayOfFloat3[3] = f10;
      arrayOfFloat2[4] = f6;
      arrayOfFloat3[4] = f8;
      dL dL = new dL(arrayOfFloat2, arrayOfFloat3, arrayOfFloat2.length);
      if (f5 < d2) {
        if (bool) {
          Point2D.Float float_ = new Point2D.Float((f7 + f6) / 2.0F, 2.0F * (f10 + f8) / 3.0F);
          RadialGradientPaint radialGradientPaint = new RadialGradientPaint(float_, f7 - f6, float_, arrayOfFloat1, arrayOfColor, MultipleGradientPaint.CycleMethod.NO_CYCLE);
          paramGraphics2D.setPaint(radialGradientPaint);
        } else {
          paramGraphics2D.setColor(getNeedleColor(paramGauge, f5));
        } 
        paramGraphics2D.fill((Shape)dL);
      } else {
        if (paramBoolean) {
          paramGraphics2D.setColor(getDarker(getDarker(getDarker(getDarker(getNeedleColor(paramGauge, f5))))));
          paramGraphics2D.fill((Shape)dL);
        } 
        float f = (f6 - paramGauge.getBorderWidth()) / (paramGauge.getWidth() - 2.0F * paramGauge.getBorderWidth());
        if (d2 > f) {
          float f12 = paramGauge.getBorderWidth() + (float)d2 * (paramGauge.getWidth() - 2.0F * paramGauge.getBorderWidth());
          f7 = (f12 < f7) ? f12 : f7;
          arrayOfFloat2[1] = f7;
          arrayOfFloat3[1] = getBarShape(paramGauge).d(this.barShape.b, f7);
          arrayOfFloat2[2] = f7;
          arrayOfFloat3[2] = getBarShape(paramGauge).d(this.barShape.c, f7);
          paramGraphics2D.setColor(getNeedleColor(paramGauge, f5));
          dL = new dL(arrayOfFloat2, arrayOfFloat3, arrayOfFloat2.length);
          paramGraphics2D.fill((Shape)dL);
        } 
        if (!paramBoolean)
          break; 
      } 
    } 
  }
  
  private Color getNeedleColor(Gauge paramGauge, double paramDouble) {
    double d = paramGauge.min() + paramDouble * (paramGauge.max() - paramGauge.min());
    return ((d < paramGauge.lowCritical() && paramGauge.getValue() < paramGauge.lowCritical()) || d > paramGauge.highCritical()) ? paramGauge.getCriticalColor() : (((d < paramGauge.lowWarning() && paramGauge.getValue() < paramGauge.lowWarning()) || d > paramGauge.highWarning()) ? paramGauge.getWarnColor() : paramGauge.getNeedleColor());
  }
  
  protected Image getBottomOffImage(Gauge paramGauge) {
    if (this.bottomOffImage == null || this.bottomOffImage.getWidth(null) != paramGauge.getWidth() || this.bottomOffImage.getHeight(null) != paramGauge.getHeight()) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.bottomOffImage = graphicsConfiguration.createCompatibleImage(paramGauge.getWidth(), paramGauge.getHeight(), 3);
      Graphics2D graphics2D = (Graphics2D)this.bottomOffImage.getGraphics();
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      paintBackground(graphics2D, paramGauge);
    } 
    return this.bottomOffImage;
  }
  
  protected Image getTopOffImage(Gauge paramGauge) {
    if (this.topOffImage == null || this.topOffImage.getWidth(null) != paramGauge.getWidth() || this.topOffImage.getHeight(null) != paramGauge.getHeight()) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.topOffImage = graphicsConfiguration.createCompatibleImage(paramGauge.getWidth(), paramGauge.getHeight(), 3);
      Graphics2D graphics2D = (Graphics2D)this.topOffImage.getGraphics();
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      paintNumbers(graphics2D, paramGauge);
      paintBorder(graphics2D, paramGauge);
    } 
    return this.topOffImage;
  }
  
  protected Image paintBackground(Graphics paramGraphics, Gauge paramGauge) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Color color = new Color(0, 0, 0, 0);
    graphics2D.setColor(color);
    graphics2D.fillRect(0, 0, paramGauge.getWidth(), paramGauge.getHeight());
    if (paramGauge.getBackColor() != null && paramGauge.getBackColor().getAlpha() > 0) {
      graphics2D.setColor(paramGauge.getBackColor());
      graphics2D.fill(getBarShape(paramGauge));
    } 
    paintNeedle(graphics2D, paramGauge, true);
    return this.bottomOffImage;
  }
  
  private void paintBorder(Graphics2D paramGraphics2D, Gauge paramGauge) {
    Color color = paramGauge.getTrimColor();
    if (paramGauge.getBorderWidth() > 0 && color.getAlpha() > 0) {
      if (this.outerGradient == null) {
        Color color1 = getDarker(color);
        float f = (float)getBarShape(paramGauge).c((getBarShape(paramGauge)).c, 0.25D);
        this.outerGradient = new GradientPaint((paramGauge.getWidth() / 4), 0.0F, getBrighter(color), (paramGauge.getWidth() / 2), 40.0F, color1, true);
      } 
      paramGraphics2D.setPaint(this.outerGradient);
      paramGraphics2D.setStroke(new BasicStroke(paramGauge.getBorderWidth(), 1, 1, 10.0F, null, 0.0F));
      paramGraphics2D.draw(getBarShape(paramGauge));
    } 
  }
  
  protected Color getBrighter(Color paramColor) {
    int i = paramColor.getBlue() + paramColor.getRed() + paramColor.getGreen();
    if (i < 180) {
      i += 250;
      return new Color(i / 3, i / 3, i / 3);
    } 
    return paramColor.brighter();
  }
  
  protected Color getDarker(Color paramColor) {
    Color color = (Color)this.darkColorCache.get(paramColor);
    if (color == null) {
      if (paramColor.getBlue() + paramColor.getRed() + paramColor.getGreen() > 650) {
        color = paramColor.darker().darker();
      } else {
        color = paramColor.darker();
      } 
      this.darkColorCache.put(paramColor, color);
    } 
    return color;
  }
  
  private List getNumberPositions(Gauge paramGauge) {
    if (this.numberPositions == null) {
      float f1 = (getBarShape(paramGauge)).j * 0.65F;
      this.numberPositions = new ArrayList();
      int i = paramGauge.getWidth() / (getBarShape(paramGauge)).j;
      float f2 = (paramGauge.max() > 3000.0D) ? 1000.0F : ((paramGauge.max() > 500.0D) ? 100.0F : 1.0F);
      int j = (int)(Math.round(Math.log10(paramGauge.max() - paramGauge.min())) - 1L);
      double d = Math.pow(10.0D, j);
      int k;
      for (k = (int)Math.round((paramGauge.max() - paramGauge.min()) / d); k > 0 && (paramGauge.getWidth() / k) < f1; k = (int)((paramGauge.max() - paramGauge.min()) / d))
        d *= 2.0D; 
      for (byte b1 = 1; b1 < k; b1++) {
        float f3 = (float)(paramGauge.min() + b1 * d);
        float f4 = (f3 - (float)paramGauge.getMin()) / (float)(paramGauge.max() - paramGauge.min());
        this.numberPositions.add(new c(this, f3 / f2, f4));
      } 
    } 
    return this.numberPositions;
  }
  
  public void invalidate() {
    this.barShape = null;
    this.outerGradient = null;
    this.bottomOffImage = null;
    this.topOffImage = null;
    this.numberPositions = null;
  }
  
  private b getBarShape(Gauge paramGauge) {
    if (this.barShape == null) {
      this.barShape = new b(this, paramGauge);
      this.barShape.a(paramGauge.getWidth(), paramGauge.getHeight());
    } 
    return this.barShape;
  }
  
  public boolean isComponentPaintedAt(int paramInt1, int paramInt2) {
    return (this.barShape != null) ? this.barShape.contains(paramInt1, paramInt2) : true;
  }
  
  public boolean requiresBackgroundRepaint(s params) {
    return (this.topOffImage == null || params.getWidth() != this.topOffImage.getWidth(null) || params.getHeight() != this.topOffImage.getHeight(null));
  }
  
  public void updateGauge(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge)params;
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    if (gauge.isAntialiasingOn()) {
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    } 
    paintNeedle(graphics2D, gauge, false);
    boolean bool = true;
    if (bool) {
      paramGraphics.drawImage(getTopOffImage(gauge), 0, 0, null);
    } else {
      paintNumbers(graphics2D, gauge);
      paintBorder(graphics2D, gauge);
    } 
  }
  
  public void paintBackground(Graphics paramGraphics, s params) {
    Gauge gauge = (Gauge)params;
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    boolean bool = false;
    if (bool) {
      Image image = getBottomOffImage(gauge);
      Graphics2D graphics2D1 = (Graphics2D)image.getGraphics();
      graphics2D1.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      paramGraphics.drawImage(image, 0, 0, null);
    } else {
      paintBackground(paramGraphics, (Gauge)params);
    } 
    paintBorder(graphics2D, gauge);
  }
  
  public Area areaPainted(s params) {
    Gauge gauge = (Gauge)params;
    return new Area(getBarShape(gauge));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/AsymetricSweepRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */