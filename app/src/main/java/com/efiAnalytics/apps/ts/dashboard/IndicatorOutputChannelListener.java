package com.efiAnalytics.apps.ts.dashboard;

import G.GComponentCq;

class IndicatorOutputChannelListener implements GComponentCq {
  double a = -1.0D;

  IndicatorOutputChannelListener(Indicator paramIndicator) {}

  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (paramDouble != this.a) {
      this.b.invalidatePainter();
      this.a = paramDouble;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
