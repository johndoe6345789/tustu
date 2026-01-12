package com.efiAnalytics.apps.ts.dashboard;

import DComponentDelta.DComponentDelta;
import java.util.TimerTask;

class GaugeTimerTask extends TimerTask {
  private DComponentDelta b = null;

  GaugeTimerTask(x paramx) {}

  public void run() {
    if (this.b != null) x.a(this.a, this.b);
  }

  public void a(DComponentDelta paramd) {
    this.b = paramd;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/U.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
