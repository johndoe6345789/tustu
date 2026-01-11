package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SettingsPanelSelectionListener implements ActionListener {
  SettingsPanelSelectionListener(TuneSettingsPanel paramTuneSettingsPanel) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a.setSettingPanelName(paramActionEvent.getActionCommand());
    TuneSettingsPanel.access$100(this.a);
    TuneSettingsPanel.access$202(this.a, true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */