package aO;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class FocusListenerFocusgained implements FocusListener {
  FocusListenerFocusgained(q paramq, k paramk) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    this.b.c.selectAll();
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    this.b.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */