package com.efiAnalytics.apps.ts.dashboard;

import G.ManagerUsingArrayList;
import G.R;
import G.T;

public class EcuConfigurationHelper {
  public static R a(s params) {
    return (params.getEcuConfigurationName() == null
            || params.getEcuConfigurationName().isEmpty()
            || params.getEcuConfigurationName().equals(ManagerUsingArrayList.a))
        ? T.a().c()
        : T.a().c(params.getEcuConfigurationName());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
