package com.efiAnalytics.tunerStudio.panels;

import aE.PropertiesExtension;
import com.efiAnalytics.ui.et;

class RefTablePropertyStore implements et {
  String PropertiesExtension = "refTable_" + CalibrationTablePanel.d(this.b) + "_";
  
  RefTablePropertyStore(CalibrationTablePanel paramJ) {}
  
  public void PropertiesExtension(String paramString1, String paramString2) {
    PropertiesExtension PropertiesExtension = PropertiesExtension.A();
    if (PropertiesExtension != null)
      PropertiesExtension.setProperty(this.PropertiesExtension + paramString1, paramString2); 
  }
  
  public String PropertiesExtension(String paramString) {
    PropertiesExtension PropertiesExtension = PropertiesExtension.A();
    return (PropertiesExtension != null) ? PropertiesExtension.getProperty(this.PropertiesExtension + paramString, "") : "";
  }
  
  public String b(String paramString1, String paramString2) {
    return paramString2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */