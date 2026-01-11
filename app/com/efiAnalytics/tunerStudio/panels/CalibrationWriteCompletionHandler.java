package com.efiAnalytics.tunerStudio.panels;

import G.ArrayListInGPackage;
import G.n;
import G.o;
import s.SComponentGolf;

class CalibrationWriteCompletionHandler implements n {
  CalibrationWriteCompletionHandler(CalibrationTablePanel paramJ) {}
  
  public void a(double paramDouble) {
    this.a.i.b(paramDouble);
  }
  
  public void a(o paramo) {
    ArrayListInGPackage.a().e();
    if (paramo.a() == 3) {
      if (paramo.c() != null) {
        J.a(this.a, SComponentGolf.b("Calibration Table Write Failed!") + "\n" + paramo.c());
      } else {
        J.a(this.a, SComponentGolf.b("Calibration Table Write Failed!") + "\nUnable to complete write.");
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */