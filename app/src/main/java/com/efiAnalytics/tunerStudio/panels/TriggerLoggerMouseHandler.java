package com.efiAnalytics.tunerStudio.panels;

import com.efiAnalytics.ui.eJ;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class TriggerLoggerMouseHandler extends MouseAdapter {
  int a = eJ.a(4);
  
  boolean b = false;
  
  boolean c = false;
  
  TriggerLoggerMouseHandler(TriggerLoggerPanel paramTriggerLoggerPanel) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      TriggerLoggerPanel.a(this.d, paramMouseEvent.getX(), paramMouseEvent.getY()); 
    if (paramMouseEvent.getButton() == 1)
      if (!this.d.f.v()) {
        this.d.f.k(paramMouseEvent.getX());
        this.c = true;
      } else if (Math.abs(paramMouseEvent.getX() - this.d.f.w()) < this.a) {
        this.b = true;
      } else if (Math.abs(paramMouseEvent.getX() - this.d.f.x()) < this.a) {
        this.c = true;
      } else {
        this.d.f.u();
      }  
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger()) {
      TriggerLoggerPanel.a(this.d, paramMouseEvent.getX(), paramMouseEvent.getY());
    } else {
      this.b = false;
      this.c = false;
      this.d.f.repaint();
    } 
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (this.b) {
      this.d.f.k(paramMouseEvent.getX());
      this.d.f.repaint();
    } else if (this.c && paramMouseEvent.getX() > this.d.f.w()) {
      this.d.f.l(paramMouseEvent.getX());
      this.d.f.repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */