package aP;

import bq.b;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class S extends MouseAdapter implements PopupMenuListener {
  boolean a = false;
  
  public void a(b paramb) {
    paramb.addMouseListener(this);
    paramb.a(this);
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    b b = (b)paramMouseEvent.getSource();
    if (b.isEnabled() && this.a)
      b.b(true); 
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void popupMenuWillBecomeVisible(PopupMenuEvent paramPopupMenuEvent) {
    this.a = true;
  }
  
  public void popupMenuWillBecomeInvisible(PopupMenuEvent paramPopupMenuEvent) {
    this.a = false;
  }
  
  public void popupMenuCanceled(PopupMenuEvent paramPopupMenuEvent) {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */