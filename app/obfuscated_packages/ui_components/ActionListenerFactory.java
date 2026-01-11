package ao;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dj implements ItemListener {
  dj(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()) {
      i.c(i.N, i.P);
      this.a.a.e(i.P);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */