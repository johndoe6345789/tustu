package aP;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class cu implements ItemListener {
  cu(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()) {
      String str = ((JCheckBoxMenuItem)paramItemEvent.getSource()).getActionCommand();
      i.c("lineTraceSize", str);
      this.a.b.p().c(Integer.parseInt(str));
      this.a.b.p().i();
      this.a.b.p().repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */