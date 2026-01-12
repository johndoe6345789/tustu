package ao;

import bE.JComponentExtension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class fU implements ItemListener {
  fU(fK paramfK) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem) paramItemEvent.getSource()).getState())
      this.a.d(JComponentExtension.c);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
