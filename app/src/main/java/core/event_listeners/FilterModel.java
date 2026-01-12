package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class cI implements ItemListener {
  cI(cd paramcd) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    this.a.a((JCheckBoxMenuItem) paramItemEvent.getSource());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
