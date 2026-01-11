package com.efiAnalytics.apps.ts.dashboard;

import G.T;
import G.GInterfaceCz;
import java.io.Serializable;

class GaugeConfigProvider implements GInterfaceCz, Serializable {
  GaugeConfigProvider(Gauge paramGauge) {}
  
  public String a() {
    String str = this.a.getEcuConfigurationName();
    if ((str == null || str.isEmpty()) && T.a().c() != null)
      str = T.a().c().c(); 
    return str;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */