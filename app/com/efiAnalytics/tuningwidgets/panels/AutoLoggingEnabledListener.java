package com.efiAnalytics.tuningwidgets.panels;

import G.q;
import S.SInterfaceAlpha;
import S.SInterfaceEcho;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AutoLoggingEnabledListener implements ActionListener {
  AutoLoggingEnabledListener(AutoLoggingTriggerPanel paramg) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.SInterfaceAlpha.j.isSelected()) {
      try {
        SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(this.SInterfaceAlpha.SInterfaceAlpha.c(), (SInterfaceAlpha)this.SInterfaceAlpha.b);
        SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(this.SInterfaceAlpha.SInterfaceAlpha.c(), (SInterfaceAlpha)this.SInterfaceAlpha.c);
      } catch (q q) {
        bV.d("No Configuration Found: " + this.SInterfaceAlpha.SInterfaceAlpha.c(), this.SInterfaceAlpha.j);
      } 
    } else {
      SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(this.SInterfaceAlpha.SInterfaceAlpha.c(), this.SInterfaceAlpha.b.SInterfaceAlpha());
      SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(this.SInterfaceAlpha.SInterfaceAlpha.c(), this.SInterfaceAlpha.c.SInterfaceAlpha());
    } 
    g.SInterfaceAlpha(this.SInterfaceAlpha);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */