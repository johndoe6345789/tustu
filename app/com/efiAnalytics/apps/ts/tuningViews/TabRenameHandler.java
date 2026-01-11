package com.efiAnalytics.apps.ts.tuningViews;

import bH.D;

class TabRenameHandler implements m {
  J a;
  
  String b;
  
  TabRenameHandler(z paramz, J paramJ, String paramString) {
    this.a = paramJ;
    this.b = paramString;
  }
  
  public boolean a(String paramString1, String paramString2) {
    if (paramString2 == null || paramString2.trim().isEmpty())
      return false; 
    int i = this.c.a.f(this.b);
    if (i >= 0) {
      this.c.a.setTitleAt(i, paramString2);
      return true;
    } 
    D.c("Could not find tab titled " + this.b + " to rename to: " + paramString2);
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */