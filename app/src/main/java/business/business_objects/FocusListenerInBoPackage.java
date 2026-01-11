package business.business_objects;

import com.efiAnalytics.ui.NumericTextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class FocusListenerInBoPackage implements FocusListener {
  l(b paramb) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    if (paramFocusEvent.getSource() instanceof do)
      ((NumericTextField)paramFocusEvent.getSource()).selectAll(); 
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bo/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */