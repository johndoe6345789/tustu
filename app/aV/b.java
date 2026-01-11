package aV;

import aP.dd;
import aP.f;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class b extends MouseAdapter {
  b(a parama) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    f.a().a(this.a.d, dd.a().c());
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.a.setCursor(Cursor.getPredefinedCursor(12));
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.a.setCursor(Cursor.getPredefinedCursor(0));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */