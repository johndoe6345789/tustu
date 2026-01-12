package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dC implements ItemListener {
  dC(cd paramcd) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    IOProperties.c(
        IOProperties.aJ,
        (!((JCheckBoxMenuItem) paramItemEvent.getSource()).getState() ? 1 : 0) + "");
    cd.b(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
