package com.efiAnalytics.tuningwidgets.panels;

import bH.X;
import com.efiAnalytics.ui.NumericTextField;

class DisplacementUnitField extends NumericTextField {
  boolean a = false;
  
  DisplacementUnitField(RequiredFuelCalculatorDialog paraman) {}
  
  public void a() {
    if (!this.a) {
      String str = getText();
      try {
        if (str.trim().length() > 0) {
          double d = Double.parseDouble(str);
          setText("" + (int)Math.round(d * 16.387D));
        } 
      } catch (NumberFormatException numberFormatException) {}
      this.a = true;
    } 
  }
  
  public void b() {
    if (this.a) {
      String str = getText();
      try {
        if (str.trim().length() > 0) {
          double d = Double.parseDouble(str);
          setText(X.b(d / 16.387D, 1));
        } 
      } catch (NumberFormatException numberFormatException) {}
      this.a = false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */