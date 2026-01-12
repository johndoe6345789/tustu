package com.efiAnalytics.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class RowHeaderClickListener extends MouseAdapter {
  RowHeaderClickListener(w paramw) {}

  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (this.a.isEnabled()
        && paramMouseEvent.getClickCount() == 1
        && paramMouseEvent.getButton() == 1) {
      w.b(this.a, paramMouseEvent.getY() / this.a.j);
      paramMouseEvent.consume();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
