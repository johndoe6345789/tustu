package aP;

import ao.hx;
import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class cj implements ItemListener {
  cj(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()) {
      IOProperties.c(IOProperties.N, IOProperties.Q);
      hx.a().c(true);
      this.a.b.e(IOProperties.Q);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */