package aP;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class ApComponentCp implements ItemListener {
  cp(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState())
      IOProperties.c(IOProperties.G, IOProperties.I); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */