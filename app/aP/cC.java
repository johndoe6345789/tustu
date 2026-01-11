package aP;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class cC implements ItemListener {
  cC(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState())
      this.a.b.p().q(); 
    boolean bool = ((JCheckBoxMenuItem)paramItemEvent.getSource()).getState();
    if (bool) {
      i.c(i.S, "withLabels");
      this.a.b.p().i();
      this.a.b.p().repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */