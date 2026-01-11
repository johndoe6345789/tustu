package com.efiAnalytics.ui;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;

class Table3DMouseHandler extends MouseAdapter implements MouseMotionListener {
  Point a = null;
  
  int b = 0;
  
  int c = 0;
  
  boolean d = false;
  
  eP(eM parameM) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.e.isEnabled()) {
      this.a = new Point(paramMouseEvent.getX(), paramMouseEvent.getY());
      this.c = this.e.l();
      this.b = this.e.m();
      eZ[][] arrayOfEZ = this.e.a.b();
      for (byte b = 0; b < eM.b(this.e).o(); b++) {
        for (byte b1 = 0; b1 < eM.b(this.e).p(); b1++) {
          if ((arrayOfEZ[b1][b]).a + eM.c(this.e) > paramMouseEvent.getX() && (arrayOfEZ[b1][b]).a - eM.c(this.e) < paramMouseEvent.getX() && (arrayOfEZ[b1][b]).b + eM.c(this.e) > paramMouseEvent.getY() && (arrayOfEZ[b1][b]).b - eM.c(this.e) < paramMouseEvent.getY()) {
            this.e.f(b1);
            this.e.e(b);
            this.e.repaint();
            this.e.z();
            this.d = true;
            return;
          } 
        } 
      } 
    } 
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (this.e.isEnabled()) {
      eZ eZ = this.e.n();
      if (this.d == true) {
        double d = this.e.a.a(eM.b(this.e).a(eM.d(this.e)), eM.b(this.e).b(eM.e(this.e)), paramMouseEvent.getY());
        eM.b(this.e).a(eM.e(this.e), eM.d(this.e), d);
        this.e.z();
        this.e.repaint();
        return;
      } 
      int i = (paramMouseEvent.getX() - this.a.x) * 360 / this.e.getWidth() / 2;
      int j = (paramMouseEvent.getY() - this.a.y) * 360 / this.e.getHeight() / 2;
      this.e.c(this.c + i);
      this.e.d(this.b + j);
    } 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.a = null;
    this.d = false;
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {}
  
  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {
    int i = paramMouseWheelEvent.getWheelRotation();
    if (i > 0) {
      this.e.k();
    } else {
      this.e.j();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */