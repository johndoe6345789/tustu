package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JButton;

class ArrowButton extends JButton {
  Dimension a = new Dimension(14, 8);
  
  int b = 1;
  
  ez(ew paramew, int paramInt) {
    this.b = paramInt;
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (isEnabled()) {
      paramGraphics.setColor(Color.BLACK);
    } else {
      paramGraphics.setColor(Color.GRAY);
    } 
    Polygon polygon = new Polygon();
    if (this.b == 1) {
      polygon.addPoint(getWidth() / 2, getHeight() / 3);
      polygon.addPoint(getWidth() * 2 / 3, getHeight() * 2 / 3);
      polygon.addPoint(getWidth() / 3, getHeight() * 2 / 3);
    } else {
      polygon.addPoint(getWidth() / 2, getHeight() * 2 / 3);
      polygon.addPoint(getWidth() * 2 / 3, getHeight() / 3);
      polygon.addPoint(getWidth() / 3, getHeight() / 3);
    } 
    paramGraphics.fillPolygon(polygon);
  }
  
  public Dimension getPreferredSize() {
    return this.a;
  }
  
  public Dimension getMinimumSize() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ez.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */