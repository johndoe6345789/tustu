package com.efiAnalytics.apps.ts.dashboard;

import V.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import java.io.File;

class GaugeFileLoader implements ExceptionInVPackage {
  GaugeFileLoader(x paramx) {}
  
  public void ExceptionInVPackage(File paramFile) {
    try {
      new aa();
      Gauge gauge = aa.ExceptionInVPackage(paramFile);
      this.ExceptionInVPackage.b(gauge);
      this.ExceptionInVPackage.ExceptionInVPackage(gauge, true);
      gauge.setValue(gauge.min() + 0.3499999940395355D * (gauge.max() - gauge.min()));
    } catch (ExceptionInVPackage a1) {
      bV.d(a1.getLocalizedMessage(), x.e(this.ExceptionInVPackage));
    } 
    this.ExceptionInVPackage.validate();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */