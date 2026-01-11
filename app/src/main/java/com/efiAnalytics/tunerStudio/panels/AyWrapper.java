package com.efiAnalytics.tunerStudio.panels;

import G.SerializableImplEquals;
import s.SComponentGolf;

class AyWrapper {
  private SerializableImplEquals b;
  
  AyWrapper(CalibrationTablePanel paramJ, SerializableImplEquals paramaY) {
    this.b = paramaY;
  }
  
  public SerializableImplEquals a() {
    return this.b;
  }
  
  public String toString() {
    return SComponentGolf.b(this.b.toString());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */