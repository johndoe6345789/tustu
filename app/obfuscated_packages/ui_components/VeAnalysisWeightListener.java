package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class eQ implements ItemListener {
  eQ(eK parameK) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      fn fn = (fn)paramItemEvent.getItem();
      IOProperties.c("baseWeight", fn.a());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */