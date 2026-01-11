package com.efiAnalytics.apps.ts.dashboard;

import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cp;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NeedleColorActionListener implements ActionListener {
  NeedleColorActionListener(GaugePropertiesPanel paramad) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    Color color = bV.a((Component)paramActionEvent.getSource(), "Choose Needle Color", this.a.a().getNeedleColor());
    if (color != null) {
      cp cp = (cp)paramActionEvent.getSource();
      cp.a(color);
      this.a.a().setNeedleColor(color);
      this.a.a().repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */