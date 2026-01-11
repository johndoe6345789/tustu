package com.efiAnalytics.tunerStudio.panels;

import aE.a;
import com.efiAnalytics.ui.et;

class RefTablePropertyStore implements et {
  String a = "refTable_" + CalibrationTablePanel.d(this.b) + "_";
  
  RefTablePropertyStore(CalibrationTablePanel paramJ) {}
  
  public void a(String paramString1, String paramString2) {
    a a = a.A();
    if (a != null)
      a.setProperty(this.a + paramString1, paramString2); 
  }
  
  public String a(String paramString) {
    a a = a.A();
    return (a != null) ? a.getProperty(this.a + paramString, "") : "";
  }
  
  public String b(String paramString1, String paramString2) {
    return paramString2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */