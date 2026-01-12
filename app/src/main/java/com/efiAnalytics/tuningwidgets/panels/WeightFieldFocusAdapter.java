package com.efiAnalytics.tuningwidgets.panels;

import com.efiAnalytics.ui.bV;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

class WeightFieldFocusAdapter extends FocusAdapter {
  WeightFieldFocusAdapter(WeightInputPanel paramaQ) {}

  public void focusGained(FocusEvent paramFocusEvent) {
    JTextField jTextField = (JTextField) paramFocusEvent.getSource();
    jTextField.selectAll();
  }

  public void focusLost(FocusEvent paramFocusEvent) {
    if (paramFocusEvent.getSource() == this.a.b)
      try {
        String str = this.a.b.getText();
        int i = Integer.parseInt(str);
        this.a.a.setText((i * 22 / 10) + "");
      } catch (NumberFormatException numberFormatException) {
        bV.d("Weight must be numeric.", this.a.b);
      }
    if (paramFocusEvent.getSource() == this.a.a)
      try {
        String str = this.a.a.getText();
        int i = Integer.parseInt(str);
        this.a.b.setText((i * 10 / 22) + "");
      } catch (NumberFormatException numberFormatException) {
        bV.d("Weight must be numeric.", this.a.a);
      }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
