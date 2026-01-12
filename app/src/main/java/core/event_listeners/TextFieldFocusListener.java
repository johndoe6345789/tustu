package ao;

import com.efiAnalytics.ui.NumericTextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class gu implements FocusListener {
  gu(go paramgo) {}

  public void focusGained(FocusEvent paramFocusEvent) {
    ((NumericTextField) paramFocusEvent.getSource()).selectAll();
  }

  public void focusLost(FocusEvent paramFocusEvent) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
