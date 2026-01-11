package com.efiAnalytics.tuningwidgets.panels;

import G.GComponentBb;
import java.util.ArrayList;

class TablePanelItemWrapper {
  GComponentBb a = null;
  
  public am(ae paramae, GComponentBb parambb) {
    this.a = parambb;
  }
  
  public boolean a(ArrayList paramArrayList) {
    byte b = 0;
    for (GComponentBb bb1 : paramArrayList) {
      if (this.a.equals(bb1) && ++b == 1)
        return true; 
    } 
    return false;
  }
  
  public GComponentBb a() {
    return this.a;
  }
  
  public String toString() {
    return (this.a != null) ? this.a.aL() : "Error";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */