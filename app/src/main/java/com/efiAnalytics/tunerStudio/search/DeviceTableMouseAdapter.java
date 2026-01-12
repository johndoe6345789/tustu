package com.efiAnalytics.tunerStudio.search;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

class DeviceTableMouseAdapter extends MouseAdapter {
  DeviceTableMouseAdapter(r paramr) {}

  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3 || paramMouseEvent.isPopupTrigger()) {
      int i = this.a.rowAtPoint(paramMouseEvent.getPoint());
      if (i >= 0 && i < this.a.getRowCount()) {
        this.a.setRowSelectionInterval(i, i);
      } else {
        this.a.clearSelection();
      }
      int j = this.a.getSelectedRow();
      if (j < 0) return;
      if (paramMouseEvent.getComponent() instanceof javax.swing.JTable) {
        JPopupMenu jPopupMenu = r.a(this.a);
        jPopupMenu.show(
            paramMouseEvent.getComponent(), paramMouseEvent.getX(), paramMouseEvent.getY());
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
