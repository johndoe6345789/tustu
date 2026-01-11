package com.efiAnalytics.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

class fg extends JPanel {
  int a;
  
  int b;
  
  fg(fc paramfc, int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public void paint(Graphics paramGraphics) {
    paramGraphics.setColor(Color.BLACK);
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    if (this.c.a(this.a, this.b)) {
      paramGraphics.setColor(this.c.c);
      int i = eJ.a(4);
      ((Graphics2D)paramGraphics).setStroke(new BasicStroke(i));
      paramGraphics.drawRect(i / 2, i / 2, getWidth() - i, getHeight() - i);
    } else {
      paramGraphics.setColor(Color.WHITE);
      ((Graphics2D)paramGraphics).setStroke(new BasicStroke(1.0F));
      paramGraphics.drawRect(0, 0, getWidth(), getHeight());
    } 
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(eJ.a(24), eJ.a(24));
  }
  
  public Dimension getMinimumSize() {
    return new Dimension(eJ.a(24), eJ.a(24));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */