package bF;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class P extends MouseAdapter {
  P(D paramD) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3)
      this.a.a(paramMouseEvent.getX(), paramMouseEvent.getY()); 
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3)
      this.a.b(paramMouseEvent.getX(), paramMouseEvent.getY()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */