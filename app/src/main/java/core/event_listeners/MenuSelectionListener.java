package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dO implements ItemListener {
  dO(cd paramcd) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem) paramItemEvent.getSource()).getState())
      cd.a(this.a, ((JCheckBoxMenuItem) paramItemEvent.getSource()).getText());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
