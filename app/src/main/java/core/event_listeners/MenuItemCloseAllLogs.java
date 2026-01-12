package ao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class av extends MouseAdapter {
  av(ar paramar) {}

  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3 || paramMouseEvent.isPopupTrigger()) {
      ar.a(this.a, paramMouseEvent.getX(), paramMouseEvent.getY());
    } else {
      ar.a(this.a);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
