package com.efiAnalytics.tunerStudio.panels;

import bA.JCheckBoxMenuItemExtension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TriggerStateChangeListener implements ActionListener {
  TriggerStateChangeListener(o paramo) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension = (JCheckBoxMenuItemExtension)paramActionEvent.getSource();
    this.a.k.a(JCheckBoxMenuItemExtension.getState());
    this.a.k.i();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */