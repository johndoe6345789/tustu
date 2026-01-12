package ao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class gk extends MouseAdapter {
  gk(fK paramfK) {}

  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) {
      this.a.a(paramMouseEvent.getComponent(), paramMouseEvent.getX(), paramMouseEvent.getY());
    } else {
      gn gn = new gn(this.a, paramMouseEvent.getX(), paramMouseEvent.getY());
      gn.start();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
