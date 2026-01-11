package aP;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class cs implements ItemListener {
  cs(cc paramcc) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    IOProperties.c(IOProperties.K, "true");
    IOProperties.c(IOProperties.L, "false");
    this.a.b.o();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */