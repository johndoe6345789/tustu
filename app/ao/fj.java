package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class fj implements ItemListener {
  fj(eK parameK) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1)
      this.a.b((String)paramItemEvent.getItem()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */