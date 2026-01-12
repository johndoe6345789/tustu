package com.efiAnalytics.apps.ts.dashboard;

import G.GInterfaceAn;
import java.io.Serializable;

class IndicatorStringUpdateListener implements GInterfaceAn, Serializable {
  IndicatorStringUpdateListener(Indicator paramIndicator) {}

  public void a(String paramString1, String paramString2) {
    this.a.invalidatePainter();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
