package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import G.T;
import c.d;

class EcuConfigDelegate implements d {
  J a;
  
  boolean b = true;
  
  w(n paramn, J paramJ) {
    this.a = paramJ;
  }
  
  public R b_() {
    return T.a().c();
  }
  
  public String a_() {
    return this.a.A();
  }
  
  public void c_(String paramString) {
    this.a.d(paramString);
  }
  
  public void setEnabled(boolean paramBoolean) {
    int i = this.c.f(this.a.getName());
    this.c.setEnabledAt(i, paramBoolean);
    this.b = paramBoolean;
  }
  
  public boolean isEnabled() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */