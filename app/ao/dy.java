package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dy implements ItemListener {
  dy(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    this.a.b(((JCheckBoxMenuItem)paramItemEvent.getSource()).getState());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */