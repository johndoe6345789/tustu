package com.efiAnalytics.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ColumnHeaderMouseAdapter extends MouseAdapter {
  ColumnHeaderMouseAdapter(TableEditorPanel paramw) {}

  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (this.a.isEnabled() && paramMouseEvent.getClickCount() == 1)
      w.a(this.a, paramMouseEvent.getX() / this.a.a.i());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
