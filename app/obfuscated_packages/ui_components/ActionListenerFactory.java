package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dj implements ItemListener {
  dj(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()) {
      IOProperties.c(IOProperties.N, IOProperties.P);
      this.a.a.e(IOProperties.P);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */