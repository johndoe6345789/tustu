package com.efiAnalytics.tunerStudio.search;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DeviceSelectionListener implements ActionListener {
  DeviceSelectionListener(r paramr) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.a.getSelectedRow() >= 0) {
      f f = this.a.b.get(this.a.getSelectedRow());
      this.a.d(f);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */