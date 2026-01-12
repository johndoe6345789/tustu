package com.efiAnalytics.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

class BinTableMouseHandler extends MouseAdapter {
  BinTableMouseHandler(BinTableView paramBinTableView) {}

  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) this.a.a(paramMouseEvent.getX(), paramMouseEvent.getY());
    this.a.r = true;
  }

  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.a.r = false;
  }

  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) this.a.b(paramMouseEvent.getX(), paramMouseEvent.getY());
    this.a.O();
  }

  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {
    if (BinTableView.Y() && BinTableView.W()) {
      int i = paramMouseWheelEvent.getWheelRotation();
      if (i > 0) {
        this.a.o();
      } else {
        this.a.n();
      }
    }
    this.a.O();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
