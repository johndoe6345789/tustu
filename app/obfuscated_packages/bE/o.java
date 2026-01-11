package bE;

import com.efiAnalytics.ui.eJ;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

class o extends MouseAdapter {
  int a = eJ.a(10);
  
  Point b = null;
  
  o(m paramm) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    Rectangle rectangle = this.c.c();
    if (rectangle.contains(this.c.getWidth() / 2, paramMouseEvent.getY())) {
      m.a(this.c, paramMouseEvent.getY());
      this.c.repaint();
    } 
    if (rectangle.contains(paramMouseEvent.getX(), this.c.getHeight() / 2)) {
      m.b(this.c, paramMouseEvent.getX());
      this.c.repaint();
    } 
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    Rectangle rectangle = this.c.c();
    if (rectangle.contains(this.c.getWidth() / 2, paramMouseEvent.getY()))
      m.a(this.c, paramMouseEvent.getY()); 
    if (rectangle.contains(paramMouseEvent.getX(), this.c.getHeight() / 2))
      m.b(this.c, paramMouseEvent.getX()); 
    this.c.repaint();
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 1) {
      this.c.x = paramMouseEvent.getPoint();
    } else if (paramMouseEvent.getButton() == 3) {
      this.b = paramMouseEvent.getPoint();
    } 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 1 && this.c.x != null && this.c.x.getX() < (paramMouseEvent.getX() - this.a) && this.c.x.getY() < (paramMouseEvent.getY() - this.a) && paramMouseEvent.getButton() == 1)
      for (p p : this.c.d) {
        q q1 = this.c.a(p, this.c.x.x, this.c.x.y);
        q q2 = this.c.a(p, paramMouseEvent.getX(), paramMouseEvent.getY());
        m.a(this.c, q1.getX(), q2.getX(), q2.getY(), q1.getY());
      }  
    if (paramMouseEvent.getButton() != 1)
      this.b = null; 
    this.c.x = null;
    this.c.repaint();
  }
  
  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {
    double d = paramMouseWheelEvent.getPreciseWheelRotation();
    if (d < 0.0D) {
      double d1 = 1.1D;
      this.c.a(d1);
    } else {
      double d1 = 0.9090909090909091D;
      this.c.a(d1);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bE/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */