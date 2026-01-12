package aO;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JComponent;

class MouseWheelListener implements MouseWheelListener {
  MouseWheelListener(k paramk) {}

  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {
    if (paramMouseWheelEvent.getWheelRotation() > 0) {
      if (paramMouseWheelEvent.getSource() instanceof JComponent) {
        JComponent jComponent = (JComponent) paramMouseWheelEvent.getSource();
        double d = paramMouseWheelEvent.getX() / jComponent.getWidth();
        this.a.b(d);
      }
    } else if (paramMouseWheelEvent.getSource() instanceof JComponent) {
      JComponent jComponent = (JComponent) paramMouseWheelEvent.getSource();
      double d = paramMouseWheelEvent.getX() / jComponent.getWidth();
      this.a.a(d);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
