package com.efiAnalytics.apps.ts.tuningViews;

import V.a;
import bH.D;
import com.efiAnalytics.ui.a;
import com.efiAnalytics.ui.bV;
import javax.swing.SwingUtilities;
import v.g;

class TuningViewLoader implements a {
  private b b = null;
  
  private String[] c = null;
  
  V(J paramJ, b paramb, String[] paramArrayOfString) {
    this.b = paramb;
    this.c = paramArrayOfString;
  }
  
  public boolean a() {
    c();
    return true;
  }
  
  public void b() {}
  
  public void c() {
    W w = new W(this);
    SwingUtilities.invokeLater(w);
  }
  
  private void d() {
    try {
      g g = new g();
      F f = g.a(this.b.a());
      if (this.b.b() && !a(f.a())) {
        String str = this.c[0];
        for (byte b1 = 1; b1 < this.c.length; b1++)
          str = str + " & " + this.c[b1]; 
        boolean bool = bV.a("Warning: Gauge Cluster firmware signature (" + f.a() + ")\ndoes not match current firmware (" + str + ").\nYou may need to edit some components of the layout.\n \nContinue Loading?", this.a.getParent(), true);
        if (!bool)
          return; 
      } 
      f.a(this.c[0]);
      this.a.a(f);
    } catch (a a1) {
      D.a("Unable to load dash file:\n" + this.b.a(), (Exception)a1, this.a.getParent());
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */