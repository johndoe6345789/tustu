package aP;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MouseAdapterExtension extends MouseAdapter {
  ca(bW parambW) {}

  public void mouseClicked(MouseEvent paramMouseEvent) {}

  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger()) this.a.a(paramMouseEvent);
  }

  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger()) this.a.a(paramMouseEvent);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
