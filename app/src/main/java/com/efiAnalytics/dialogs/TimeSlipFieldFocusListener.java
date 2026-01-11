package com.efiAnalytics.dialogs;

import com.efiAnalytics.ui.NumericTextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class TimeSlipFieldFocusListener implements FocusListener {
  TimeSlipFieldFocusListener(e parame) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    NumericTextField numericTextField = (NumericTextField)paramFocusEvent.getSource();
    numericTextField.selectAll();
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/dialogs/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */