package com.efiAnalytics.apps.ts.dashboard;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

class TextFieldSelectAllFocusListener implements FocusListener {
  TextFieldSelectAllFocusListener(ad paramad) {}

  public void focusLost(FocusEvent paramFocusEvent) {}

  public void focusGained(FocusEvent paramFocusEvent) {
    JTextField jTextField = (JTextField) paramFocusEvent.getSource();
    jTextField.selectAll();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
