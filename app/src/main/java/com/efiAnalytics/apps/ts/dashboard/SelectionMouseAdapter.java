package com.efiAnalytics.apps.ts.dashboard;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class SelectionMouseAdapter extends MouseAdapter implements MouseMotionListener {
  private Rectangle b = null;

  SelectionMouseAdapter(x paramx) {}

  public void mousePressed(MouseEvent paramMouseEvent) {
    if (!this.a.isEnabled()) return;
    Component component = a(paramMouseEvent);
    if (component instanceof s) {
      if (paramMouseEvent.getButton() != 3 && !this.a.L()) {
        boolean bool =
            ((paramMouseEvent.getModifiers() & 0x2) != 2 && paramMouseEvent.getButton() == 1)
                ? true
                : false;
        this.a.a((s) component, bool);
      }
    } else if (paramMouseEvent.getButton() != 3 && this.a.L()) {
      this.a.N();
      this.b = new Rectangle();
      this.b.x = paramMouseEvent.getX();
      this.b.y = paramMouseEvent.getY();
    }
    if (paramMouseEvent.getClickCount() == 2) {
      this.a.t();
    } else if (paramMouseEvent.getButton() == 3) {
      this.a.a(
          (Component) paramMouseEvent.getSource(), paramMouseEvent.getX(), paramMouseEvent.getY());
      paramMouseEvent.consume();
    } else {
      this.a.requestFocus();
    }
    this.a.repaint();
  }

  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (a() != null) {
      (a()).width = Math.abs(paramMouseEvent.getX() - (a()).x);
      (a()).height = Math.abs(paramMouseEvent.getY() - (a()).y);
      (a()).x = ((a()).x < paramMouseEvent.getX()) ? (a()).x : paramMouseEvent.getX();
      (a()).y = ((a()).y < paramMouseEvent.getY()) ? (a()).y : paramMouseEvent.getY();
      this.a.a(a());
      this.b = null;
      this.a.repaint();
    }
  }

  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (a() != null) {
      (a()).width = paramMouseEvent.getX() - (a()).x;
      (a()).height = paramMouseEvent.getY() - (a()).y;
      this.a.repaint();
    }
  }

  public Rectangle a() {
    return this.b;
  }

  public void mouseMoved(MouseEvent paramMouseEvent) {}

  private Component a(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof s) {
      s s1 = (s) paramMouseEvent.getSource();
      s s2 = this.a.a(s1.getX() + paramMouseEvent.getX(), s1.getY() + paramMouseEvent.getY());
      return (s2 == null) ? s1 : s2;
    }
    return (Component) paramMouseEvent.getSource();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
