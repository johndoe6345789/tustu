package com.efiAnalytics.ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class NavigationArrowMouseListener implements MouseListener {
  NavigationArrowMouseListener(cK paramcK) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getX() > this.a.c && paramMouseEvent.getX() < 2 * this.a.c) {
      cK.a(this.a);
    } else if (paramMouseEvent.getX() > 2 * this.a.c && paramMouseEvent.getX() < 3.5D * this.a.c) {
      cK.b(this.a);
    } 
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */