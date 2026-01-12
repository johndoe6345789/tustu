package com.efiAnalytics.tunerStudio.panels;

import aP.ApInterfaceWhiskey;
import aP.EqualsTostring;
import java.awt.Cursor;
import javax.swing.SwingUtilities;

class DeviceSelectCallback implements ApInterfaceWhiskey {
  DeviceSelectCallback(CanDeviceConfigPanel parama) {}

  public void a(EqualsTostring paramV) {
    if (paramV.b() != null) {
      this.a.g.setCursor(Cursor.getPredefinedCursor(3));
      e e = new e(this, paramV);
      SwingUtilities.invokeLater(e);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
