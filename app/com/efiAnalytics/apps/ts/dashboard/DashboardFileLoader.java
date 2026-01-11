package com.efiAnalytics.apps.ts.dashboard;

import G.T;
import V.a;
import bH.D;
import com.efiAnalytics.ui.a;
import com.efiAnalytics.ui.bV;
import r.b;
import r.j;
import v.c;

class DashboardFileLoader implements a {
  private b b = null;
  
  private String[] c = null;
  
  DashboardFileLoader(x paramx, b paramb, String[] paramArrayOfString) {
    this.b = paramb;
    this.c = paramArrayOfString;
  }
  
  public boolean a() {
    d();
    if (this.a.ad() != null)
      this.a.h(); 
    return true;
  }
  
  public void b() {}
  
  public void c() {
    d();
    if (this.a.ad() != null)
      this.a.h(); 
  }
  
  private void d() {
    try {
      c c = new c(j.G());
      Z z = null;
      z = c.a(this.b.b().getAbsolutePath());
      if (this.b.c() && !a(z.d())) {
        String str = this.c[0];
        for (byte b1 = 1; b1 < this.c.length; b1++)
          str = str + " or " + this.c[b1]; 
        boolean bool = bV.a("Warning: Gauge Cluster firmware signature (" + z.d() + ")\ndoes not match current firmware (" + str + ").\nYou may need to reset gauge output channels.\n \nContinue Loading?", this.a.getParent(), true);
        if (!bool)
          return; 
      } 
      z.b(this.c[0]);
      String[] arrayOfString = T.a().d();
      z = ab.a(arrayOfString, z);
      G.R r = this.a.k;
      if (r != null)
        (new aa()).b(r, z); 
      this.a.a(z);
      this.a.d(this.b.g());
      x.k(this.a);
      x.d(this.a, false);
    } catch (a a1) {
      D.a("Unable to load dash file:\n" + this.b.b(), (Exception)a1, this.a.getParent());
    } 
  }
  
  private boolean a(String paramString) {
    for (byte b1 = 0; b1 < this.c.length; b1++) {
      if (this.c[b1].equals(paramString))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */