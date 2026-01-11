package com.efiAnalytics.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class AxisSelectorMouseAdapter extends MouseAdapter {
  boolean a = false;
  
  fo(fn paramfn) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 1)
      this.a = true; 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 1 && this.a) {
      fn.a(this.b, !fn.a(this.b));
      fn.b(this.b);
      this.b.repaint();
      this.a = false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */