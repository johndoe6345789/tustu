package com.efiAnalytics.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class TablePanelMousePressListener extends MouseAdapter {
  TablePanelMousePressListener(w paramw) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) {
      w.c(this.a);
    } else {
      this.a.a.w();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */