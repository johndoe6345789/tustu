package ao;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dR implements ItemListener {
  dR(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState())
      i.c(i.G, i.H); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */