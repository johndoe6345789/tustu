package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.JComponent;

public class WaitBarComponent extends JComponent {
  Image a = null;
  
  int b = 350;
  
  int c = -this.b;
  
  fI d = null;
  
  public fH() {
    setMinimumSize(new Dimension(100, eJ.a(4)));
    setPreferredSize(new Dimension(100, eJ.a(4)));
    setOpaque(true);
  }
  
  public void paint(Graphics paramGraphics) {
    if (this.d == null) {
      paramGraphics.setColor(getBackground());
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
      return;
    } 
    for (int i = this.c; i < getWidth(); i += this.b)
      paramGraphics.drawImage(a(paramGraphics), i, 0, null); 
    if (this.c >= 0)
      this.c = -this.b; 
  }
  
  private Image a(Graphics paramGraphics) {
    if (this.a == null) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      Graphics graphics = null;
      this.a = graphicsConfiguration.createCompatibleImage(this.b, getHeight(), 3);
      graphics = this.a.getGraphics();
      Graphics2D graphics2D = (Graphics2D)graphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      graphics.setColor(getBackground());
      graphics.fillRect(0, 0, this.a.getWidth(null), this.a.getHeight(null));
      int i = getForeground().getRed();
      int j = getForeground().getGreen();
      int k = getForeground().getBlue();
      double d = this.a.getWidth(null) / 127.5D;
      int m = 0;
      for (byte b = 0; b < this.a.getWidth(null); b++) {
        m = (int)(b * d);
        if (m > 255) {
          int n = m - 255;
          m = 255 - n;
        } 
        if (m < 0)
          m = 0; 
        Color color = new Color(i, j, k, m);
        graphics.setColor(color);
        graphics.drawLine(b, 0, b, this.a.getHeight(null));
      } 
    } 
    return this.a;
  }
  
  public void a() {
    if (this.d != null)
      this.d.a(); 
    this.d = new fI(this);
    this.d.start();
  }
  
  public void b() {
    if (this.d != null)
      this.d.a(); 
    this.d = null;
    repaint();
  }
  
  public void setForeground(Color paramColor) {
    super.setForeground(paramColor);
    this.a = null;
  }
  
  public void setBackground(Color paramColor) {
    super.setBackground(paramColor);
    this.a = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */