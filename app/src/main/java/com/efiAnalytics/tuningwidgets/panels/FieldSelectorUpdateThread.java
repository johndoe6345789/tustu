package com.efiAnalytics.tuningwidgets.panels;

import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

class FieldSelectorUpdateThread extends Thread {
  FieldSelectorUpdateThread(ReplayFieldSelectorPanel paramae) {}

  public void run() {
    try {
      Thread.sleep(500L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(ReplayFieldSelectorPanel.class.getName())
          .log(Level.SEVERE, (String) null, interruptedException);
    }
    this.a.c();
    this.a.d.validate();
    this.a.f.validate();
    D.c("updated");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
