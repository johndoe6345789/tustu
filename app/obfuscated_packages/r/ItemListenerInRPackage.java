package r;

import bH.D;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ItemListenerInRPackage implements ItemListener {
  c(b paramb) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1)
      if (this.a.c.getSelectedItem() instanceof g) {
        g g = (g)this.a.c.getSelectedItem();
        this.a.b(g.a());
      } else {
        D.c("Didn't show Dash");
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */