package aP;

import ao.hx;
import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class cj implements ItemListener {
  cj(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()) {
      i.c(i.N, i.Q);
      hx.a().c(true);
      this.a.b.e(i.Q);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */