package aP;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MouseAdapterExtensionInApPackage extends MouseAdapter {
  jt(jc paramjc) {}

  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) a(paramMouseEvent.getX(), paramMouseEvent.getY());
  }

  public void a(int paramInt1, int paramInt2) {
    int i = paramInt1 / this.a.g.getWidth() / this.a.g.getColumnModel().getColumnCount();
    int j = paramInt2 / this.a.g.getRowHeight();
    if (!this.a.g.isCellSelected(j, i)) this.a.g.changeSelection(j, i, false, false);
  }

  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) this.a.a(paramMouseEvent.getX(), paramMouseEvent.getY());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
