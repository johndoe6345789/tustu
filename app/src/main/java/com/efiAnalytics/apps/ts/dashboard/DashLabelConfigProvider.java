package com.efiAnalytics.apps.ts.dashboard;

import G.GInterfaceCz;
import G.T;

class DashLabelConfigProvider implements GInterfaceCz {
  DashLabelConfigProvider(DashLabel paramDashLabel) {}

  public String a() {
    String str = this.a.getEcuConfigurationName();
    if ((str == null || str.isEmpty()) && T.a().c() != null) str = T.a().c().c();
    return str;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
