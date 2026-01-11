package com.efiAnalytics.tunerStudio.panels;

import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import s.g;

class DeviceFileSelectListener implements ActionListener {
  DeviceFileSelectListener(CanDeviceConfigPanel parama) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String[] arrayOfString = { "ini", "ecu" };
    String str = bV.b((Component)paramActionEvent.getSource(), g.b("Find CAN Device definition file"), arrayOfString, "", "");
    if (str != null) {
      a.a(this.a, str);
      this.a.g.validate();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */