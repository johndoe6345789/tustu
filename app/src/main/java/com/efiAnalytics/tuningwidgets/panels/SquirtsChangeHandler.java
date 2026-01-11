package com.efiAnalytics.tuningwidgets.panels;

import bt.BtInterfaceBz;

class SquirtsChangeHandler implements BtInterfaceBz {
  SquirtsChangeHandler(aF paramaF) {}
  
  public void b(String paramString) {
    if (this.a.a(paramString)) {
      if (!this.a.e.getText().trim().equals(""))
        this.a.b(); 
    } else {
      aF.a(this.a);
    } 
    if (this.a.b != null)
      this.a.b.h().g(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */