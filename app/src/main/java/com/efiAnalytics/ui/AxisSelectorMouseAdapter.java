package com.efiAnalytics.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class AxisSelectorMouseAdapter extends MouseAdapter {
  boolean a = false;
  
  AxisSelectorMouseAdapter(fn paramfn) {}
  
  public void AxisSelectorMouseAdapter(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 1)
      this.a = true; 
  }
  
  public void AxisSelectorMouseAdapter(MouseEvent paramMouseEvent) {
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