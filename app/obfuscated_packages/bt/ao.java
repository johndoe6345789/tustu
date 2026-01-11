package bt;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ao extends MouseAdapter {
  ao(an paraman) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) {
      an.a(this.a, paramMouseEvent.getX(), paramMouseEvent.getY());
    } else if (this.a.y) {
      an.a(this.a, false);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */