package ao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class bp extends MouseAdapter {
  bp(bo parambo) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getX() > this.a.getWidth() - this.a.b && paramMouseEvent.getY() < this.a.c)
      bo.a(this.a, paramMouseEvent.getX(), paramMouseEvent.getY()); 
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */