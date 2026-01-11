package com.efiAnalytics.ui;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.SwingUtilities;

class AxisTableFocusAdapter extends FocusAdapter {
  AxisTableFocusAdapter(AxisEditorTable paramS, w paramw) {}
  
  public void focusLost(FocusEvent paramFocusEvent) {
    SwingUtilities.invokeLater(new X(this, paramFocusEvent));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */