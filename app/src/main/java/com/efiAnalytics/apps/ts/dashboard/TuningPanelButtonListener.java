package com.efiAnalytics.apps.ts.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class TuningPanelButtonListener implements ActionListener {
  TuningPanelButtonListener(DashTuningPanel paramDashTuningPanel) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JButton jButton = (JButton) paramActionEvent.getSource();
    DashTuningPanel.access$000(this.a, jButton.getX(), jButton.getY() + jButton.getHeight());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
