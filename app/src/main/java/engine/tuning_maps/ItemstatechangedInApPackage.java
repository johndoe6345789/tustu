package aP;

import ao.hx;
import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class ItemstatechangedInApPackage implements ItemListener {
  ck(cc paramcc) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem) paramItemEvent.getSource()).getState()) {
      IOProperties.c(IOProperties.N, IOProperties.P);
      hx.a().c(true);
      this.a.b.e(IOProperties.P);
      hx.a().c(true);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
