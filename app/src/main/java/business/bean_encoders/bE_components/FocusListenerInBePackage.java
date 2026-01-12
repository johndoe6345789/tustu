package business.bean_encoders.bE_components;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class FocusListenerInBePackage implements FocusListener {
  FocusListenerInBePackage(e parame) {}

  public void focusGained(FocusEvent paramFocusEvent) {
    this.a.c.selectAll();
  }

  public void focusLost(FocusEvent paramFocusEvent) {
    e.b(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bE/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
