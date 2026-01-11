package ao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class hh extends MouseAdapter implements MouseMotionListener {
  hh(hg paramhg) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    hg.a(this.a, paramMouseEvent.getX());
    this.a.repaint();
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    hg.a(this.a, paramMouseEvent.getX());
    this.a.repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */