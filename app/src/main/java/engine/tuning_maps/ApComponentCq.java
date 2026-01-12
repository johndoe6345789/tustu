package aP;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class ApComponentCq implements ItemListener {
  cq(cc paramcc) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    IOProperties.c(
        "showGraphHalfMark", ((JCheckBoxMenuItem) paramItemEvent.getSource()).getState() + "");
    this.a.b.o();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
