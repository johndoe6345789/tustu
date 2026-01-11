package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class SettingsPanelPopupListener implements ActionListener {
  SettingsPanelPopupListener(TuneSettingsPanel paramTuneSettingsPanel) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JButton jButton = (JButton)paramActionEvent.getSource();
    TuneSettingsPanel.access$000(this.a, jButton.getX(), jButton.getY() + jButton.getHeight());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */