package aP;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ht implements ItemListener {
  ht(hs paramhs) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      this.a.a(3);
      hs.a(this.a).requestFocus();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */