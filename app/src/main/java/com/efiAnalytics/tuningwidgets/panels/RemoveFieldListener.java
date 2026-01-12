package com.efiAnalytics.tuningwidgets.panels;

import V.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RemoveFieldListener implements ActionListener {
  RemoveFieldListener(DatalogFieldSelectorPanel paramn) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    try {
      this.ExceptionInVPackage.d();
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d(ExceptionInVPackage.getLocalizedMessage(), this.ExceptionInVPackage.i);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
