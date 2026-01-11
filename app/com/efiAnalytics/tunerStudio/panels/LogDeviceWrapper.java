package com.efiAnalytics.tunerStudio.panels;

import G.cd;
import s.g;

class LogDeviceWrapper {
  private cd b = null;
  
  LogDeviceWrapper(o paramo, cd paramcd) {
    this.b = paramcd;
  }
  
  public String toString() {
    return (a() == null) ? "[none]" : ((a().g() == null) ? g.b("Unknown") : g.b(a().g()));
  }
  
  public cd a() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */