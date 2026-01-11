package com.efiAnalytics.tunerStudio.panels;

import G.ba;
import s.g;

class BaWrapper {
  private ba b;
  
  public BaWrapper(CalibrationTablePanel paramJ, ba paramba) {
    this.b = paramba;
  }
  
  public String toString() {
    return g.b(this.b.toString());
  }
  
  public ba a() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof R) ? this.b.toString().equals(((R)paramObject).a().toString()) : super.equals(paramObject);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */