package com.efiAnalytics.apps.ts.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.a;

class AntiAliasingHandler implements ActionListener {
  AntiAliasingHandler(x paramx) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    boolean bool = ((JCheckBoxMenuItem)paramActionEvent.getSource()).getState();
    this.a.j(bool);
    a.a().b("dashAntiAliasingOn", bool + "");
    if (x.d(this.a) && this.a.ad() != null) {
      this.a.h();
    } else {
      x.d(this.a, false);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */