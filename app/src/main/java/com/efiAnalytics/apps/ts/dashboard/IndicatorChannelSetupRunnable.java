package com.efiAnalytics.apps.ts.dashboard;

import G.i;
import V.ExceptionInVPackage;
import java.util.logging.Level;
import java.util.logging.Logger;

class IndicatorChannelSetupRunnable implements Runnable {
  IndicatorChannelSetupRunnable(IndicatorConfigurationProvider paramaN) {}

  public void run() {
    if (Indicator.access$200(this.ExceptionInVPackage.b).b() != null
        && (Indicator.access$200(this.ExceptionInVPackage.b).b()).length > 0) {
      this.ExceptionInVPackage.b.g = new IndicatorOutputChannelListener(this.ExceptionInVPackage.b);
      this.ExceptionInVPackage.b.h = new IndicatorStringUpdateListener(this.ExceptionInVPackage.b);
      try {
        i.ExceptionInVPackage(
            this.ExceptionInVPackage.b.e,
            Indicator.access$200(this.ExceptionInVPackage.b),
            this.ExceptionInVPackage.b.g,
            this.ExceptionInVPackage.b.h);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(Indicator.class.getName())
            .log(
                Level.SEVERE,
                "Bad Channel on dash indicator String expression",
                (Throwable) ExceptionInVPackage);
      }
    }
    if (Indicator.access$300(this.ExceptionInVPackage.b).b() != null
        && (Indicator.access$300(this.ExceptionInVPackage.b).b()).length > 0) {
      this.ExceptionInVPackage.b.g =
          (this.ExceptionInVPackage.b.g != null)
              ? this.ExceptionInVPackage.b.g
              : new IndicatorOutputChannelListener(this.ExceptionInVPackage.b);
      this.ExceptionInVPackage.b.h =
          (this.ExceptionInVPackage.b.h != null)
              ? this.ExceptionInVPackage.b.h
              : new IndicatorStringUpdateListener(this.ExceptionInVPackage.b);
      try {
        i.ExceptionInVPackage(
            this.ExceptionInVPackage.b.e,
            Indicator.access$300(this.ExceptionInVPackage.b),
            this.ExceptionInVPackage.b.g,
            this.ExceptionInVPackage.b.h);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(Indicator.class.getName())
            .log(
                Level.SEVERE,
                "Bad Channel on dash indicator String expression",
                (Throwable) ExceptionInVPackage);
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
