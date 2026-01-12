package com.efiAnalytics.ui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class TextFieldSelectAllListener implements FocusListener {
  TextFieldSelectAllListener(BinTableView paramBinTableView) {}

  public void focusGained(FocusEvent paramFocusEvent) {
    ((NumericTextField) paramFocusEvent.getSource()).selectAll();
  }

  public void focusLost(FocusEvent paramFocusEvent) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
