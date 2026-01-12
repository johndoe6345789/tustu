package com.efiAnalytics.apps.ts.dashboard;

import G.GInterfaceCz;
import G.T;
import java.io.Serializable;
import javax.swing.SwingUtilities;

class IndicatorConfigurationProvider implements GInterfaceCz, Serializable {
  boolean a = false;

  IndicatorConfigurationProvider(Indicator paramIndicator) {}

  public String a() {
    String str = this.b.getEcuConfigurationName();
    if ((str == null || str.isEmpty()) && T.a().c() != null) str = T.a().c().c();
    if (!this.a && T.a().c(this.b.e) != null) {
      IndicatorChannelSetupRunnable indicatorChannelSetupRunnable =
          new IndicatorChannelSetupRunnable(this);
      SwingUtilities.invokeLater(indicatorChannelSetupRunnable);
      this.a = true;
    }
    return str;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
