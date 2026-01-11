package com.efiAnalytics.apps.ts.dashboard;

import V.a;
import com.efiAnalytics.ui.bV;
import java.io.File;

class E implements a {
  E(x paramx) {}
  
  public void a(File paramFile) {
    try {
      new aa();
      Gauge gauge = aa.a(paramFile);
      this.a.b(gauge);
      this.a.a(gauge, true);
      gauge.setValue(gauge.min() + 0.3499999940395355D * (gauge.max() - gauge.min()));
    } catch (a a1) {
      bV.d(a1.getLocalizedMessage(), x.e(this.a));
    } 
    this.a.validate();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */