package ao;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class fc implements ItemListener {
  fc(eK parameK) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramItemEvent.getSource();
    i.c("veAnalysisDisableOverrunFilter", jCheckBoxMenuItem.getState() + "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */