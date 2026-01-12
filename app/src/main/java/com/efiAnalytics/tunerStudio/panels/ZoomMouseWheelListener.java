package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JComponent;

class ZoomMouseWheelListener implements MouseWheelListener {
  ZoomMouseWheelListener(TriggerLoggerPanel paramTriggerLoggerPanel) {}

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

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
