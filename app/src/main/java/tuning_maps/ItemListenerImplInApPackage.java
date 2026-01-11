package aP;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class ItemListenerImplInApPackage implements ItemListener {
  cM(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    IOProperties.c(IOProperties.aD, Boolean.toString(((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */