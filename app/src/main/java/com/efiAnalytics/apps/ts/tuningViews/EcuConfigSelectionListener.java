package com.efiAnalytics.apps.ts.tuningViews;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EcuConfigSelectionListener implements ActionListener {
  EcuConfigSelectionListener(TuneViewComponent paramTuneViewComponent) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = paramActionEvent.getActionCommand();
    this.a.setEcuConfigurationName(str);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
