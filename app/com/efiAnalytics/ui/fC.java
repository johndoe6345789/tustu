package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class fC extends JPanel {
  Polygon a = new Polygon();
  
  Polygon b = new Polygon();
  
  int c = 10;
  
  private boolean f = true;
  
  private boolean g = true;
  
  List d = new ArrayList();
  
  Color e = null;
  
  public fC() {
    a();
    addMouseListener(new fD(this));
    Color color = UIManager.getColor("Button.foreground");
    if (color != null)
      setForeground(color); 
    color = UIManager.getColor("SplitPane.background");
    if (color != null)
      setBackground(color); 
    this.e = UIManager.getColor("SplitPane.highlight");
  }
  
  private void a() {
    int i = this.c;
    byte b = 1;
    this.a.reset();
    this.a.addPoint(b + i / 2, i);
    this.a.addPoint(b, i + i / 2);
    this.a.addPoint(b + i / 2, 2 * i);
    int j = i + i / 2;
    this.b.reset();
    this.b.addPoint(b, j + i);
    this.b.addPoint(b + i / 2, j + i + i / 2);
    this.b.addPoint(b, j + 2 * i);
  }
  
  public void paint(Graphics paramGraphics) {
    paramGraphics.setColor(getBackground());
    paramGraphics.fill3DRect(0, 0, getWidth(), getHeight(), true);
    paramGraphics.setColor(this.e);
    paramGraphics.draw3DRect(0, 0, getWidth(), getHeight(), true);
    paramGraphics.setColor(getForeground());
    if (this.f)
      paramGraphics.fillPolygon(this.b); 
    if (this.g)
      paramGraphics.fillPolygon(this.a); 
  }
  
  public void a(fE paramfE) {
    this.d.add(paramfE);
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(2 + this.c / 2, 4 * this.c);
  }
  
  public void setBackground(Color paramColor) {
    super.setBackground(paramColor);
  }
  
  private void b() {
    for (fE fE : this.d)
      fE.a(); 
  }
  
  private void c() {
    for (fE fE : this.d)
      fE.b(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */