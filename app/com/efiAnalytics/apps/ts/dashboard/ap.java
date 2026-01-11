package com.efiAnalytics.apps.ts.dashboard;

import com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class ap implements ActionListener {
  ap(ad paramad) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JComboBox jComboBox = (JComboBox)paramActionEvent.getSource();
    aE aE = (aE)jComboBox.getSelectedItem();
    GaugePainter gaugePainter = aE.a();
    this.a.a.setGaugePainter(gaugePainter);
    this.a.a().repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/ap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */