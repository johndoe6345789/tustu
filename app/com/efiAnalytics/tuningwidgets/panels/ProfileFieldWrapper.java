package com.efiAnalytics.tuningwidgets.panels;

import ac.q;
import bH.R;

class F implements R {
  private q b = null;
  
  public F(A paramA, q paramq) {
    this.b = paramq;
  }
  
  public String toString() {
    return this.b.a();
  }
  
  public q a() {
    return this.b;
  }
  
  public String c() {
    return (this.b != null) ? this.b.a() : "";
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof String && this.b != null) ? paramObject.equals(this.b.a()) : super.equals(paramObject);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */