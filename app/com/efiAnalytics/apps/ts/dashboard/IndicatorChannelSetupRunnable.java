package com.efiAnalytics.apps.ts.dashboard;

import G.i;
import V.a;
import java.util.logging.Level;
import java.util.logging.Logger;

class IndicatorChannelSetupRunnable implements Runnable {
  IndicatorChannelSetupRunnable(IndicatorConfigurationProvider paramaN) {}
  
  public void run() {
    if (Indicator.access$200(this.a.b).b() != null && (Indicator.access$200(this.a.b).b()).length > 0) {
      this.a.b.g = new IndicatorOutputChannelListener(this.a.b);
      this.a.b.h = new IndicatorStringUpdateListener(this.a.b);
      try {
        i.a(this.a.b.e, Indicator.access$200(this.a.b), this.a.b.g, this.a.b.h);
      } catch (a a) {
        Logger.getLogger(Indicator.class.getName()).log(Level.SEVERE, "Bad Channel on dash indicator String expression", (Throwable)a);
      } 
    } 
    if (Indicator.access$300(this.a.b).b() != null && (Indicator.access$300(this.a.b).b()).length > 0) {
      this.a.b.g = (this.a.b.g != null) ? this.a.b.g : new IndicatorOutputChannelListener(this.a.b);
      this.a.b.h = (this.a.b.h != null) ? this.a.b.h : new IndicatorStringUpdateListener(this.a.b);
      try {
        i.a(this.a.b.e, Indicator.access$300(this.a.b), this.a.b.g, this.a.b.h);
      } catch (a a) {
        Logger.getLogger(Indicator.class.getName()).log(Level.SEVERE, "Bad Channel on dash indicator String expression", (Throwable)a);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */