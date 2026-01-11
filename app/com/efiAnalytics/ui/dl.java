package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

public class dl extends JComponent {
  dm b = null;
  
  public dl() {
    this.b = new dm(this);
    setBackground(Color.BLACK);
  }
  
  public void paint(Graphics paramGraphics) {
    this.b.a(paramGraphics);
  }
  
  public void a(cy paramcy) {
    this.b.a(paramcy);
  }
  
  public Dimension getMinimumSize() {
    int i = this.b.b();
    return new Dimension(100, i * 20);
  }
  
  public Dimension getPreferredSize() {
    int i = this.b.b();
    return new Dimension(250, 30 + i * 30);
  }
  
  public void validate() {
    this.b.a();
    super.validate();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */