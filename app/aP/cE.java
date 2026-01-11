package aP;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class cE implements ItemListener {
  cE(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    this.a.a(i.U, ((JCheckBoxMenuItem)paramItemEvent.getSource()).getState());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */