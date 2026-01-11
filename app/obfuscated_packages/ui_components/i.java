package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JCheckBoxMenuItem;

public class i implements ItemListener {
  ArrayList a = new ArrayList();
  
  JCheckBoxMenuItem b = null;
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1)
      for (JCheckBoxMenuItem jCheckBoxMenuItem1 : this.a) {
        JCheckBoxMenuItem jCheckBoxMenuItem2 = jCheckBoxMenuItem1;
        if (!jCheckBoxMenuItem2.equals(paramItemEvent.getItem()) && jCheckBoxMenuItem2.getState())
          jCheckBoxMenuItem2.setState(false); 
      }  
  }
  
  public void a(JCheckBoxMenuItem paramJCheckBoxMenuItem) {
    this.a.add(paramJCheckBoxMenuItem);
    paramJCheckBoxMenuItem.addItemListener(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */