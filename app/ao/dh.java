package ao;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dh implements ItemListener {
  dh(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()) {
      i.c(i.N, i.Q);
      this.a.a.e(i.Q);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */