package com.efiAnalytics.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ChartClickHandler extends MouseAdapter {
  aW(aU paramaU) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    double d1 = this.a.g(paramMouseEvent.getX());
    double d2 = this.a.h(paramMouseEvent.getY());
    aU.a(this.a, d1, d2);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */