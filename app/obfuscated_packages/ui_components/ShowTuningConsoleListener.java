package ao;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dH implements ItemListener {
  dH(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    this.a.a.b(((JCheckBoxMenuItem)paramItemEvent.getSource()).getState());
    i.c("showTuningConsole", "" + ((JCheckBoxMenuItem)paramItemEvent.getSource()).getState());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */