package com.efiAnalytics.apps.ts.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;

class AntiAliasingHandler implements ActionListener {
  AntiAliasingHandler(x paramx) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    boolean bool = ((JCheckBoxMenuItem)paramActionEvent.getSource()).getState();
    this.IOPropertiesUsingFile.j(bool);
    IOPropertiesUsingFile.IOPropertiesUsingFile().b("dashAntiAliasingOn", bool + "");
    if (x.d(this.IOPropertiesUsingFile) && this.IOPropertiesUsingFile.ad() != null) {
      this.IOPropertiesUsingFile.h();
    } else {
      x.d(this.IOPropertiesUsingFile, false);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */