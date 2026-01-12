package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class fd implements ItemListener {
  fd(eK parameK) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramItemEvent.getSource();
    IOProperties.c("veAnalysisBit6Bit7Filter", jCheckBoxMenuItem.getState() + "");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
