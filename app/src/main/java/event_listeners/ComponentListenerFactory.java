package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dm implements ItemListener {
  dm(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem)paramItemEvent.getSource()).getState())
      this.a.a.p().q(); 
    boolean bool = ((JCheckBoxMenuItem)paramItemEvent.getSource()).getState();
    if (bool) {
      IOProperties.c(IOProperties.S, "bottom");
      this.a.a.p().IOProperties();
      this.a.a.p().repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */