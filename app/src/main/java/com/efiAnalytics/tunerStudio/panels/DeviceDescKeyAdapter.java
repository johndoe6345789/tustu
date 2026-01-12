package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class DeviceDescKeyAdapter extends KeyAdapter {
  DeviceDescKeyAdapter(CanDeviceConfigPanel parama) {}

  public void keyReleased(KeyEvent paramKeyEvent) {
    if (this.a.b.getText().length() > 0) {
      a.a(this.a).b(this.a.b.getText());
      this.a.getParent().repaint();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
