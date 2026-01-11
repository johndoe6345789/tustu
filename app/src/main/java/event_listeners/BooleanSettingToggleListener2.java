package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dU implements ItemListener {
  dU(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    IOProperties.c(IOProperties.aJ, Boolean.toString(((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()));
    cd.b(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */