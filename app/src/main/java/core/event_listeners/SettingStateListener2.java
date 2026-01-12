package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dN implements ItemListener {
  dN(cd paramcd) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    this.a.a(IOProperties.E, ((JCheckBoxMenuItem) paramItemEvent.getSource()).getState());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
