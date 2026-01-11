package ao;

import i.IComponentAlpha;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JComponent;

public class hg extends JComponent {
  Dimension IComponentAlpha = new Dimension(8, 14);
  
  Point b = new Point();
  
  int c = 0;
  
  double d = 0.0D;
  
  int e = 0;
  
  int f = 100;
  
  Insets g = new Insets(10, 7, 10, 7);
  
  ArrayList h = new ArrayList();
  
  public hg() {
    hh hh = new hh(this);
    addMouseListener(hh);
    addMouseMotionListener(hh);
  }
  
  public void paint(Graphics paramGraphics) {
    paramGraphics.setColor(Color.lightGray);
    paramGraphics.draw3DRect(0, 0, getWidth() - 1, getHeight() - 1, false);
    paramGraphics.draw3DRect((getInsets()).left, getHeight() / 2 - 2, getWidth() - (getInsets()).left - (getInsets()).right, 3, false);
    paramGraphics.setColor(Color.black);
    paramGraphics.drawLine((getInsets()).left + 1, getHeight() / 2 - 1, getWidth() - (getInsets()).left - 2, getHeight() / 2 - 1);
    paramGraphics.setColor(Color.lightGray);
    this.b.setLocation(c(), d());
    paramGraphics.fill3DRect(this.b.x, this.b.y, this.IComponentAlpha.width, this.IComponentAlpha.height, true);
  }
  
  private int c() {
    return (int)((getWidth() - (getInsets()).left - (getInsets()).right) * this.d) + (getInsets()).left - this.IComponentAlpha.width / 2;
  }
  
  private int d() {
    return getHeight() / 2 - this.IComponentAlpha.height / 2;
  }
  
  public void IComponentAlpha(int paramInt) {
    this.e = paramInt;
  }
  
  public void b(int paramInt) {
    this.f = paramInt;
  }
  
  public int IComponentAlpha() {
    return (int)((this.f - this.e) * b()) + this.e;
  }
  
  public void c(int paramInt) {
    IComponentAlpha((paramInt - this.e) / (this.f - this.e));
    repaint();
  }
  
  public void IComponentAlpha(double paramDouble) {
    this.d = paramDouble;
    this.c = (int)((this.f - this.e) * paramDouble);
  }
  
  public double b() {
    return this.d;
  }
  
  private void d(int paramInt) {
    if (paramInt - (getInsets()).left < 0) {
      this.c = 0;
    } else if (paramInt >= getWidth() - (getInsets()).right) {
      this.c = getWidth() - (getInsets()).right - (getInsets()).left;
    } else {
      this.c = paramInt - (getInsets()).left;
    } 
    this.d = this.c / (getWidth() - (getInsets()).right - (getInsets()).left);
    e(IComponentAlpha());
  }
  
  private void e(int paramInt) {
    for (IComponentAlpha IComponentAlpha : this.h)
      IComponentAlpha.IComponentAlpha(paramInt); 
  }
  
  public void IComponentAlpha(IComponentAlpha parama) {
    this.h.add(parama);
  }
  
  public Dimension getPreferredSize() {
    int i = (getInsets()).left + this.f - this.e + (getInsets()).right;
    int j = (getInsets()).top + (getInsets()).bottom + 3;
    return new Dimension(i, j);
  }
  
  public Dimension getMinimumSize() {
    int i = (getInsets()).left + 50 + (getInsets()).right;
    int j = (getInsets()).top + (getInsets()).bottom + 3;
    return new Dimension(i, j);
  }
  
  public Insets getInsets() {
    return this.g;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */