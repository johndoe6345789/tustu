package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class aO implements ItemListener {
  aO(aw paramaw) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramItemEvent.getSource();
    this.a.c(jCheckBoxMenuItem.getState());
    this.a.l();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/aO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */