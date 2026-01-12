package com.efiAnalytics.tuningwidgets.panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AutoLoggingOkListener implements ActionListener {
  AutoLoggingOkListener(AutoLoggingTriggerPanel paramg) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.a.c()) {
      g.b(this.a);
      this.a.close();
      this.a.p.dispose();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
