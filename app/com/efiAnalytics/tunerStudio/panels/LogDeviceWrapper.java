package com.efiAnalytics.tunerStudio.panels;

import G.GComponentCd;
import s.SComponentGolf;

class LogDeviceWrapper {
  private GComponentCd b = null;
  
  LogDeviceWrapper(o paramo, GComponentCd paramcd) {
    this.b = paramcd;
  }
  
  public String toString() {
    return (a() == null) ? "[none]" : ((a().SComponentGolf() == null) ? SComponentGolf.b("Unknown") : SComponentGolf.b(a().SComponentGolf()));
  }
  
  public GComponentCd a() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */