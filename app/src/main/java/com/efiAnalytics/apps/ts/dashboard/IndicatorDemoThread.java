package com.efiAnalytics.apps.ts.dashboard;

import java.io.Serializable;

class IndicatorDemoThread extends Thread implements Serializable {
  boolean a = false;

  public IndicatorDemoThread(Indicator paramIndicator, boolean paramBoolean) {
    super("Indicator Demo");
    this.a = paramBoolean;
    setDaemon(true);
  }

  public void run() {
    while (true) {
      try {
        if (this.a) {
          this.b.setValue(1.0D);
          Indicator.access$000(this.b);
        }
        Thread.sleep(2000L);
        this.b.setValue(0.0D);
        if (this.a) Thread.sleep(1000L);
        Indicator.access$000(this.b);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      }
      if (!this.a) {
        Indicator.access$102(this.b, null);
        return;
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
