package u;

import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

class ManagerMousemoved extends MouseInputAdapter {
  Container a = null;

  ArrayList b = new ArrayList();

  boolean c = false;

  Component d = null;

  a e = null;

  public ManagerMousemoved(h paramh, Container paramContainer) {
    this.a = paramContainer;
  }

  public void a(Component paramComponent) {
    this.b.add(paramComponent);
  }

  public void mouseDragged(MouseEvent paramMouseEvent) {
    a(paramMouseEvent);
  }

  public void mouseMoved(MouseEvent paramMouseEvent) {
    a(paramMouseEvent);
  }

  public void mouseClicked(MouseEvent paramMouseEvent) {
    a(paramMouseEvent);
  }

  public void mouseEntered(MouseEvent paramMouseEvent) {
    a(paramMouseEvent);
  }

  public void mouseExited(MouseEvent paramMouseEvent) {
    a(paramMouseEvent);
  }

  public void mousePressed(MouseEvent paramMouseEvent) {
    a(paramMouseEvent);
  }

  public void mouseReleased(MouseEvent paramMouseEvent) {
    a(paramMouseEvent);
    this.c = false;
    this.d = null;
  }

  private void a(MouseEvent paramMouseEvent) {
    Point point1 = paramMouseEvent.getPoint();
    Point point2 = SwingUtilities.convertPoint(this.a, point1, this.a);
    int i = paramMouseEvent.getID();
    if (!this.c) {
      this.d = SwingUtilities.getDeepestComponentAt(this.f.getContentPane(), point2.x, point2.y);
      a(i);
    }
    if (this.d == null || this.d instanceof j) return;
    if (this.d instanceof a && this.e == null) {
      a a1 = (a) this.d;
      a1.a();
      this.e = a1;
    } else if (!(this.d instanceof a) && this.e != null) {
      this.e.b();
      this.e = null;
    } else if (this.b.contains(this.d)
        && (paramMouseEvent.getID() == 500
            || paramMouseEvent.getID() == 504
            || paramMouseEvent.getID() == 505
            || this.c)) {
      Point point = SwingUtilities.convertPoint(this.a, point1, this.d);
      this.d.dispatchEvent(
          new MouseEvent(
              this.d,
              i,
              paramMouseEvent.getWhen(),
              paramMouseEvent.getModifiers(),
              point.x,
              point.y,
              paramMouseEvent.getClickCount(),
              paramMouseEvent.isPopupTrigger()));
    }
  }

  private void a(int paramInt) {
    if (paramInt == 501) this.c = true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/u/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
