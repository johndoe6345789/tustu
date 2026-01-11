package com.efiAnalytics.ui;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class RangeSliderMouseHandler implements MouseListener, MouseMotionListener {
  int a = 0;
  
  RangeSliderMouseHandler(cg paramcg) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (this.a == 1) {
      double d = cg.a(this.b, paramMouseEvent.getX(), paramMouseEvent.getY());
      this.b.d(d);
    } else if (this.a == 2) {
      double d = cg.a(this.b, paramMouseEvent.getX(), paramMouseEvent.getY());
      this.b.c(d);
    } 
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    if (this.b.m.contains(paramMouseEvent.getX(), paramMouseEvent.getY())) {
      this.b.setCursor(Cursor.getPredefinedCursor(10));
    } else if (this.b.n.contains(paramMouseEvent.getX(), paramMouseEvent.getY())) {
      this.b.setCursor(Cursor.getPredefinedCursor(11));
    } else {
      this.b.setCursor(Cursor.getDefaultCursor());
    } 
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.b.m.contains(paramMouseEvent.getX(), paramMouseEvent.getY())) {
      this.a = 1;
    } else if (this.b.n.contains(paramMouseEvent.getX(), paramMouseEvent.getY())) {
      this.a = 2;
    } else {
      this.a = 0;
    } 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.a = 0;
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */