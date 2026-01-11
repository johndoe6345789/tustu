package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ProfileCloseListener implements ActionListener {
  ProfileCloseListener(DataLogProfileEditorPanel paramg) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a.close();
    this.a.g.dispose();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */