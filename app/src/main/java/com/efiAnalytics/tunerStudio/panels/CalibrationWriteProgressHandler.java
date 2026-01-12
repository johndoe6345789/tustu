package com.efiAnalytics.tunerStudio.panels;

import G.ArrayListInGPackage;
import G.n;
import G.o;
import bH.D;
import com.efiAnalytics.ui.bV;
import s.SComponentGolf;

class CalibrationWriteProgressHandler implements n {
  CalibrationWriteProgressHandler(CalibrationTablePanel paramJ) {}

  public void a(double paramDouble) {
    this.a.i.b(paramDouble);
  }

  public void a(o paramo) {
    ArrayListInGPackage.a().e();
    if (paramo.a() == 3) {
      if (paramo.c() != null) {
        String str = paramo.c();
        if (str.length() > 150) str = str.substring(0, 150);
        bV.d(SComponentGolf.b("Calibration Table Write Failed!") + "\n" + str, this.a.e);
        J.a(this.a, SComponentGolf.b("Calibration Table Write Failed!") + "\n" + str);
        D.b("Calibration Table Write Failed!\n" + paramo.c());
      } else {
        J.a(
            this.a,
            SComponentGolf.b("Calibration Table Write Failed!") + "\nUnable to complete write.");
      }
    } else {
      this.a.i.b(1.0D);
      J.a(this.a, SComponentGolf.b("Write Complete!"));
      J.c(this.a);
    }
  }

  public void e() {
    ArrayListInGPackage.a().d();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/O.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
