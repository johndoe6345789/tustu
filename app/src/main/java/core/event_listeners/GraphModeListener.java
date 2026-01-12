package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dD implements ItemListener {
  dD(cd paramcd) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    this.a.c(((JCheckBoxMenuItem) paramItemEvent.getSource()).getState());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
