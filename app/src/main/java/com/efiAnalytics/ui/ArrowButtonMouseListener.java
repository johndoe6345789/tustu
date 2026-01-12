package com.efiAnalytics.ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class ArrowButtonMouseListener implements MouseListener {
  ArrowButtonMouseListener(ArrowButtonPanel paramfC) {}

  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getY() > this.a.c && paramMouseEvent.getY() < 2 * this.a.c) {
      fC.a(this.a);
    } else if (paramMouseEvent.getY() > 2 * this.a.c && paramMouseEvent.getY() < 3.5D * this.a.c) {
      fC.b(this.a);
    }
  }

  public void mouseEntered(MouseEvent paramMouseEvent) {}

  public void mouseExited(MouseEvent paramMouseEvent) {}

  public void mousePressed(MouseEvent paramMouseEvent) {}

  public void mouseReleased(MouseEvent paramMouseEvent) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
