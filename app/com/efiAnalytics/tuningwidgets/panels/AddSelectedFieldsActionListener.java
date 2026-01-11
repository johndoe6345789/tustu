package com.efiAnalytics.tuningwidgets.panels;

import V.a;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddSelectedFieldsActionListener implements ActionListener {
  AddSelectedFieldsActionListener(ReplayFieldSelectorPanel paramae) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    try {
      this.a.d();
    } catch (a a) {
      bV.d(a.getLocalizedMessage(), this.a.h);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */