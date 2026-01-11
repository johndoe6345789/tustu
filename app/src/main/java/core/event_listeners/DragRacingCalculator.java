package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dh implements ItemListener {
  dh(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()) {
      IOProperties.c(IOProperties.N, IOProperties.Q);
      this.a.a.e(IOProperties.Q);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */