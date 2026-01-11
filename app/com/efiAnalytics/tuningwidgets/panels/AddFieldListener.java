package com.efiAnalytics.tuningwidgets.panels;

import V.a;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddFieldListener implements ActionListener {
  AddFieldListener(DatalogFieldSelectorPanel paramn) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    try {
      this.a.e();
    } catch (a a) {
      bV.d(a.getLocalizedMessage(), this.a.i);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */