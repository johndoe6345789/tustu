package com.efiAnalytics.ui;

import bH.D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class CurveEditorMouseHandler implements MouseListener, MouseMotionListener {
  bP a = null;
  
  Point b = null;
  
  bO(bN parambN) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (!this.c.isEnabled())
      return; 
    this.c.requestFocus();
    for (byte b = 0; b < bN.d(this.c).size(); b++) {
      bQ bQ = bN.d(this.c).get(b);
      for (byte b1 = 0; b1 < bQ.size(); b1++) {
        bP bP1 = (bP)bQ.get(b1);
        if (Math.abs(bP1.d() - paramMouseEvent.getX()) < this.c.b / 3 && Math.abs(bP1.f() - paramMouseEvent.getY()) < this.c.b / 3) {
          this.a = new bP(this.c, b, b1);
          this.a.c(paramMouseEvent.getY());
          this.a.b(paramMouseEvent.getX());
          this.c.b(b, b1);
          this.c.o();
          bN.e(this.c);
          this.c.repaint();
          return;
        } 
      } 
    } 
    if (!this.c.c.isEmpty()) {
      this.c.c.clear();
      bN.e(this.c);
      this.c.o();
      this.c.repaint();
    } 
    if (bN.f(this.c))
      this.b = paramMouseEvent.getPoint(); 
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (!this.c.isEnabled())
      return; 
    if (this.a != null) {
      bP bP1 = (bP)bN.a(this.c, this.c.x()).get(this.c.w());
      if (!this.c.l()) {
        int j = bN.a(this.c, paramMouseEvent.getX(), this.c.x(), this.c.w());
        if (j == bN.x) {
          bP1.b(paramMouseEvent.getX());
        } else if (j == bN.B) {
          bP1.a(this.c.h());
        } else if (j == bN.A) {
          bP1.a(this.c.i());
        } 
      } 
      int i = bN.b(this.c, paramMouseEvent.getY(), this.c.x(), this.c.w());
      if (i == bN.x) {
        bP1.c(paramMouseEvent.getY());
      } else if (i == bN.y) {
        bP1.b(bN.a(this.c, bP1.a(), bP1.b()));
      } else if (i == bN.z) {
        bP1.b(this.c.k());
      } else if (i == bN.C) {
        D.c("Range Out");
      } 
      this.c.o();
      this.c.repaint();
    } else if (this.b != null) {
      int i = Math.min(this.b.x, (paramMouseEvent.getPoint()).x);
      int j = Math.min(this.b.y, (paramMouseEvent.getPoint()).y);
      int k = Math.abs((paramMouseEvent.getPoint()).x - this.b.x);
      int m = Math.abs((paramMouseEvent.getPoint()).y - this.b.y);
      this.c.D = new Rectangle(i, j, k, m);
      this.c.repaint();
    } 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (!this.c.isEnabled())
      return; 
    if (this.a != null)
      bN.b(this.c, this.c.x(), this.c.w()); 
    this.a = null;
    if (this.c.D != null) {
      this.c.a(this.c.D);
      this.c.D = null;
    } 
    this.b = null;
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */