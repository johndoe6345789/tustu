package aP;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class cD implements ItemListener {
  cD(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    this.a.a(IOProperties.E, ((JCheckBoxMenuItem)paramItemEvent.getSource()).getState());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */