package ar;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MouseAdapterExtensionMouseclicked extends MouseAdapter {
  k(g paramg) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      this.a.a(paramMouseEvent); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      this.a.a(paramMouseEvent); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ar/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */