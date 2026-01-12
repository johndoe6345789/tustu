package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class hK implements ItemListener {
  hK(hE paramhE) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) this.a.a(1, (String) paramItemEvent.getItem());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
