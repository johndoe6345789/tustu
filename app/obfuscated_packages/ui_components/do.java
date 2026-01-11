package ao;

import h.i;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class do implements ItemListener {
  do(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState()) {
      String str = ((JCheckBoxMenuItem)paramItemEvent.getSource()).getActionCommand();
      i.c("lineTraceSize", str);
      this.a.a.p().c(Integer.parseInt(str));
      this.a.a.p().i();
      this.a.a.p().repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/do.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */