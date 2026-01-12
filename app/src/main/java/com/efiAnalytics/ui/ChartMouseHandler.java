package com.efiAnalytics.ui;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ChartMouseHandler extends MouseAdapter implements MouseListener, MouseMotionListener {
  public ChartMouseHandler(aS paramaS) {}

  public void ChartMouseHandler(MouseEvent paramMouseEvent) {
    Rectangle rectangle = this.a.k();
    if (rectangle.contains(paramMouseEvent.getX(), paramMouseEvent.getY())) {
      aS.a(this.a, paramMouseEvent.getX());
      aS.b(this.a, paramMouseEvent.getY());
      this.a.repaint();
    }
  }

  public void ChartMouseHandler(MouseEvent paramMouseEvent) {
    Rectangle rectangle = this.a.k();
    if (rectangle.contains(paramMouseEvent.getX(), paramMouseEvent.getY())) {
      aS.a(this.a, paramMouseEvent.getX());
      aS.b(this.a, paramMouseEvent.getY());
      this.a.repaint();
    }
  }

  public void ChartMouseHandler(MouseEvent paramMouseEvent) {}

  public void ChartMouseHandler(MouseEvent paramMouseEvent) {}

  public void ChartMouseHandler(MouseEvent paramMouseEvent) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
