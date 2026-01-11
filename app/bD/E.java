package bD;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class E extends MouseAdapter {
  E(r paramr) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      r.a(this.a, paramMouseEvent.getX(), paramMouseEvent.getY()); 
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger()) {
      r.a(this.a, paramMouseEvent.getX(), paramMouseEvent.getY());
      return;
    } 
    if (paramMouseEvent.getButton() == 1 && paramMouseEvent.getClickCount() == 2)
      r.a(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */