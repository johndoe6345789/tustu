package aP;

import ao.hx;
import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class cl implements ItemListener {
  cl(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()) {
      IOProperties.c(IOProperties.N, IOProperties.O);
      hx.a().c(true);
      this.a.b.e(IOProperties.O);
      hx.a().c(true);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */