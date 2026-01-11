package ao;

import bE.m;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class fS implements ItemListener {
  fS(fK paramfK) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState())
      this.a.d(m.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */