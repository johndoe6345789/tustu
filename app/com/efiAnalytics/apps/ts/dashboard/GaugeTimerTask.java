package com.efiAnalytics.apps.ts.dashboard;

import d.d;
import java.util.TimerTask;

class GaugeTimerTask extends TimerTask {
  private d b = null;
  
  GaugeTimerTask(x paramx) {}
  
  public void run() {
    if (this.b != null)
      x.a(this.a, this.b); 
  }
  
  public void a(d paramd) {
    this.b = paramd;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/U.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */