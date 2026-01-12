package ao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;

class ao extends MouseAdapter {
  ao(aj paramaj) {}

  public void mouseClicked(MouseEvent paramMouseEvent) {}

  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger()) {
      JToggleButton jToggleButton = (JToggleButton) paramMouseEvent.getSource();
      aj.b(this.a);
    }
  }

  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger()) {
      JToggleButton jToggleButton = (JToggleButton) paramMouseEvent.getSource();
      aj.b(this.a);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
