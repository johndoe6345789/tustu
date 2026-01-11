package bG;

import bH.D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class n implements MouseListener, MouseMotionListener {
  double a = 0.0D;
  
  double b = 0.0D;
  
  double c = 0.0D;
  
  n(m paramm) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.d.isEnabled()) {
      this.a = m.a(this.d, paramMouseEvent.getX(), paramMouseEvent.getY());
      this.c = this.a;
      this.b = this.d.c();
      int i = this.d.a(paramMouseEvent.getX(), paramMouseEvent.getY());
      if (i >= 0 && this.d.g()) {
        D.c("Tooth Clicked: " + i);
        this.d.c(Integer.valueOf(i));
      } 
      this.d.requestFocus();
    } 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    m.a(this.d);
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (this.d.isEnabled()) {
      double d = m.a(this.d, paramMouseEvent.getX(), paramMouseEvent.getY());
      this.d.a(this.a - d + this.b);
      m.a(this.d);
      this.d.repaint();
    } 
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */