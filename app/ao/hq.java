package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class hq implements ItemListener {
  hq(hj paramhj) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      hu hu = (hu)paramItemEvent.getSource();
      String str = (String)paramItemEvent.getItem();
      this.a.a(str, hu);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */