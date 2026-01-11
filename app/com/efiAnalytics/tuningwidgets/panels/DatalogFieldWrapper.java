package com.efiAnalytics.tuningwidgets.panels;

import G.aH;
import G.ac;
import G.al;
import java.util.ArrayList;
import java.util.List;

class DatalogFieldWrapper {
  ac a = null;
  
  al b = null;
  
  ArrayList c = null;
  
  private boolean e = false;
  
  public z(n paramn, ac paramac, ArrayList paramArrayList) {
    this.a = paramac;
    this.c = paramArrayList;
  }
  
  public z(n paramn, al paramal, ArrayList paramArrayList) {
    this.b = paramal;
    this.c = paramArrayList;
  }
  
  public boolean a(List paramList) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramList.size(); b2++) {
      if (this.c.contains(paramList.get(b2)) && ++b1 == this.c.size())
        return true; 
    } 
    return false;
  }
  
  public boolean b(List paramList) {
    for (aH aH : paramList) {
      if (this.c.contains(aH))
        return true; 
    } 
    return false;
  }
  
  public ArrayList a() {
    return this.c;
  }
  
  public String toString() {
    return (this.a != null) ? this.a.b() : this.b.aL();
  }
  
  public boolean b() {
    return this.e;
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */