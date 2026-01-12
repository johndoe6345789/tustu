package aP;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ApComponentHv implements ItemListener {
  hv(hs paramhs) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      this.a.a(1);
      hs.a(this.a).requestFocus();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
