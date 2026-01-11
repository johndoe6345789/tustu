package com.efiAnalytics.apps.ts.dashboard;

import G.c;
import G.GInterfaceCz;
import G.GInterfaceDa;
import G.GInterfaceDb;
import V.ExceptionPrintstacktrace;
import com.efiAnalytics.ui.cq;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DashLabel extends s implements Serializable {
  protected GInterfaceDb a = (GInterfaceDb)new c("Label");
  
  private Color d = null;
  
  private Color f = Color.DARK_GRAY;
  
  GInterfaceCz b = null;
  
  private Font ExceptionPrintstacktrace = null;
  
  Dimension c = null;
  
  public DashLabel() {
    setRelativeX(0.02D);
    setRelativeY(0.02D);
    setRelativeWidth(0.12D);
    setRelativeHeight(0.035D);
    this.b = new o(this);
  }
  
  public void setRunDemo(boolean paramBoolean) {}
  
  public boolean isRunDemo() {
    return false;
  }
  
  public void goDead() {}
  
  public void invalidatePainter() {
    this.ExceptionPrintstacktrace = null;
  }
  
  public String getText() {
    return this.a.toString();
  }
  
  public void setText(String paramString) {
    try {
      this.a = GInterfaceDa.a().a(this.b, paramString);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(DashLabel.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    invalidatePainter();
  }
  
  public boolean isMustPaint() {
    return false;
  }
  
  public void paint(Graphics paramGraphics) {
    if (getBackgroundColor() != null && getBackgroundColor().getAlpha() > 0) {
      paramGraphics.setColor(getBackgroundColor());
      paramGraphics.fill3DRect(0, 0, getWidth(), getHeight(), true);
    } 
    try {
      drawText(paramGraphics, this.a.a(), getTextColor());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(DashLabel.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
  }
  
  public void subscribeToOutput() {}
  
  public void unsubscribeToOutput() {}
  
  private void drawText(Graphics paramGraphics, String paramString, Color paramColor) {
    if (isAntialiasingOn()) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    } 
    paramGraphics.setColor(paramColor);
    Font font = getTextFont();
    paramGraphics.setFont(font);
    int i = (getWidth() - getFontMetrics(font).stringWidth(paramString)) / 2;
    int j = (int)((getHeight() / 2) + font.getSize() * 0.36D);
    paramGraphics.drawString(paramString, i, j);
  }
  
  private boolean sameSize() {
    return (this.c != null && this.c.width == getWidth() && this.c.height == getHeight());
  }
  
  protected Font getTextFont() {
    String str2;
    if (this.ExceptionPrintstacktrace != null && sameSize())
      return this.ExceptionPrintstacktrace; 
    this.c = getSize();
    int i = getHeight() - (getInsets()).top - (getInsets()).bottom;
    int j = getWidth() - (getInsets()).left - (getInsets()).right;
    String str1 = getFontFamily();
    try {
      str2 = this.a.a();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(DashLabel.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      str2 = "Error";
    } 
    byte b = isItalicFont() ? 2 : 0;
    Font font = cq.a().a(str1, b, i);
    if (font.canDisplayUpTo(str2) >= 0)
      font = cq.a().a("", b + 1, i); 
    while (true) {
      FontMetrics fontMetrics = getFontMetrics(font);
      if (fontMetrics.stringWidth(str2) < j || i < 1) {
        this.ExceptionPrintstacktrace = font;
        return this.ExceptionPrintstacktrace;
      } 
      font = cq.a().a(str1, b, --i);
    } 
  }
  
  public boolean isComponentPaintedAt(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0 && paramInt1 < getWidth() && paramInt2 >= 0 && paramInt2 < getHeight());
  }
  
  public Color getBackgroundColor() {
    return this.d;
  }
  
  public void setBackgroundColor(Color paramColor) {
    this.d = paramColor;
  }
  
  public Color getTextColor() {
    return this.f;
  }
  
  public void setTextColor(Color paramColor) {
    this.f = paramColor;
  }
  
  public void paintBackground(Graphics paramGraphics) {
    paint(paramGraphics);
  }
  
  public boolean requiresBackgroundRepaint() {
    return (this.ExceptionPrintstacktrace == null);
  }
  
  public void invalidate() {
    invalidatePainter();
    super.invalidate();
  }
  
  public void updateGauge(Graphics paramGraphics) {}
  
  public Area areaPainted() {
    Rectangle2D.Double double_ = new Rectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight());
    return new Area(double_);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/DashLabel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */