package business.binding_generators.bG_components;

import com.efiAnalytics.ui.NumericTextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class FocusListenerInBgPackage implements FocusListener {
  FocusListenerInBgPackage(d paramd) {}

  public void focusGained(FocusEvent paramFocusEvent) {
    NumericTextField numericTextField = (NumericTextField) paramFocusEvent.getSource();
    numericTextField.selectAll();
  }

  public void focusLost(FocusEvent paramFocusEvent) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
