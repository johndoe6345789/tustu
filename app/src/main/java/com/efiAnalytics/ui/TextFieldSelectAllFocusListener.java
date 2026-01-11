package com.efiAnalytics.ui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

class TextFieldSelectAllFocusListener implements FocusListener {
  TextFieldSelectAllFocusListener(fs paramfs) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    JTextField jTextField = (JTextField)paramFocusEvent.getSource();
    if (jTextField != null)
      jTextField.selectAll(); 
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */