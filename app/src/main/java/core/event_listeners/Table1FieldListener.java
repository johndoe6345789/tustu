package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class hH implements ItemListener {
  hH(hE paramhE) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) this.a.a(0, (String) paramItemEvent.getItem());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
