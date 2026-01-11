package aP;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class cM implements ItemListener {
  cM(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    i.c(i.aD, Boolean.toString(((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */