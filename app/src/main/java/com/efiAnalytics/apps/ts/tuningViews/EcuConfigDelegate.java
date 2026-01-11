package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import G.T;
import c.CInterfaceDelta;

class EcuConfigDelegate implements CInterfaceDelta {
  J a;
  
  boolean b = true;
  
  EcuConfigDelegate(n paramn, J paramJ) {
    this.a = paramJ;
  }
  
  public R EcuConfigDelegate() {
    return T.a().c();
  }
  
  public String EcuConfigDelegate() {
    return this.a.A();
  }
  
  public void EcuConfigDelegate(String paramString) {
    this.a.CInterfaceDelta(paramString);
  }
  
  public void EcuConfigDelegate(boolean paramBoolean) {
    int i = this.c.f(this.a.getName());
    this.c.setEnabledAt(i, paramBoolean);
    this.b = paramBoolean;
  }
  
  public boolean EcuConfigDelegate() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */