package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class NavigationArrowPanel extends JPanel {
  Polygon a = new Polygon();
  
  Polygon b = new Polygon();
  
  int c = eJ.a(10);
  
  private boolean f = true;
  
  private boolean g = true;
  
  List d = new ArrayList();
  
  Color e = null;
  
  public cK() {
    a();
    addMouseListener(new cL(this));
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
    this.a.addPoint(i, b);
    this.a.addPoint(i + i / 2, b + i / 2);
    this.a.addPoint(2 * i, b);
    int j = i + i / 2;
    this.b.reset();
    this.b.addPoint(j + i - 1, b + i / 2);
    this.b.addPoint(j + i + i / 2, b - 1);
    this.b.addPoint(j + 2 * i + 1, b + i / 2);
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
  
  public void a(cM paramcM) {
    this.d.add(paramcM);
  }
  
  public void setBackground(Color paramColor) {
    super.setBackground(paramColor);
  }
  
  public void setForeground(Color paramColor) {
    super.setForeground(paramColor);
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(4 * this.c, 2 + this.c / 2);
  }
  
  private void b() {
    for (cM cM : this.d)
      cM.b(); 
  }
  
  private void c() {
    for (cM cM : this.d)
      cM.a(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */