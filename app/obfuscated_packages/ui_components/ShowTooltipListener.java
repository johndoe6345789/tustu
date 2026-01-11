package ao;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dB implements ItemListener {
  dB(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    boolean bool = ((JCheckBoxMenuItem)paramItemEvent.getItem()).getState();
    i.c(i.aj, Boolean.toString(bool));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */