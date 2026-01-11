package ao;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dT implements ItemListener {
  dT(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    i.c(i.aD, Boolean.toString(((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */