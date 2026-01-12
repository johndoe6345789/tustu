package aP;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class ItemListener implements ItemListener {
  ItemListener(cc paramcc) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem) paramItemEvent.getSource()).getState()) this.a.b.p().q();
    boolean bool = ((JCheckBoxMenuItem) paramItemEvent.getSource()).getState();
    if (bool) {
      IOProperties.c(IOProperties.S, "top");
      this.a.b.p().IOProperties();
      this.a.b.p().repaint();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
