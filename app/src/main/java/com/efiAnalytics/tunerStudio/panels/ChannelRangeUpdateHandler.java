package com.efiAnalytics.tunerStudio.panels;

import W.j;
import W.n;

class ChannelRangeUpdateHandler implements U {
  ChannelRangeUpdateHandler(TriggerLoggerPanel paramTriggerLoggerPanel) {}
  
  public void a(String paramString, double paramDouble1, double paramDouble2) {
    for (n n : TriggerLoggerPanel.e(this.a)) {
      j j = n.a(paramString);
      if (j != null) {
        float f1 = Double.isNaN(paramDouble1) ? Float.NaN : (float)paramDouble1;
        float f2 = Double.isNaN(paramDouble2) ? Float.NaN : (float)paramDouble2;
        j.f(f2);
        j.g(f1);
      } 
    } 
    this.a.f.z();
    this.a.i();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */