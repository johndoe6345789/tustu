package com.efiAnalytics.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class bM extends MouseAdapter {
  bM(bt parambt) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3)
      this.a.a(paramMouseEvent.getPoint()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */