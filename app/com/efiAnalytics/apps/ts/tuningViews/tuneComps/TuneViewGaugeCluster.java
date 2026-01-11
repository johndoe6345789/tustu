package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import G.T;
import V.a;
import bI.a;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.ab;
import com.efiAnalytics.apps.ts.dashboard.u;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.apps.ts.tuningViews.TuneViewComponent;
import com.efiAnalytics.apps.ts.tuningViews.h;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.LayoutManager;
import java.io.File;
import java.io.IOException;
import r.j;
import v.c;

public class TuneViewGaugeCluster extends TuneViewComponent {
  x c;
  
  public TuneViewGaugeCluster() {
    setLayout((LayoutManager)new h(this));
    if (T.a().c() != null) {
      this.c = new x(T.a().c());
    } else {
      this.c = new x();
    } 
    ab.a(this.c);
    add((Component)this.c, "Center");
  }
  
  public void initializeComponents() {
    this.c.a(T.a().c());
    this.c.b();
  }
  
  public String getEncodedDashboard() {
    Z z = this.c.i();
    c c = new c(j.G());
    String str1 = (Math.random() * 2.0E9D) + "";
    String str2 = "";
    try {
      File file = File.createTempFile(str1, "tempDash");
      c.a(file.getAbsolutePath(), z);
      str2 = a.b(file.getAbsolutePath());
      file.delete();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      bV.d("Unable to write temporary file for Saving TuningView Dashboard.\n" + iOException.getMessage(), (Component)this);
    } catch (a a) {
      a.printStackTrace();
      bV.d("Error Saving TuningView Dashboard.\n" + a.getMessage(), (Component)this);
    } 
    return str2;
  }
  
  public void setEncodedDashboard(String paramString) {
    c c = new c(j.G());
    String str = (Math.random() * 2.0E9D) + "";
    try {
      File file = File.createTempFile(str, "tempDash");
      a.a(paramString, file.getAbsolutePath());
      Z z = c.a(file.getAbsolutePath());
      this.c.a(z);
      file.delete();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      bV.d("Unable to write temporary file for Loading TuningView Dashboard.\n" + iOException.getMessage(), (Component)this);
    } catch (a a) {
      a.printStackTrace();
      bV.d("Error Loading a TuningView Dashboard\n" + a.getMessage(), (Component)this);
    } 
  }
  
  public void close() {
    this.c.close();
  }
  
  public boolean isShieldedDuringEdit() {
    return false;
  }
  
  public boolean isDirty() {
    return !this.c.ae();
  }
  
  public void setClean(boolean paramBoolean) {
    this.c.k(paramBoolean);
  }
  
  public void addFullScreenRequestListener(u paramu) {
    this.c.a(paramu);
  }
  
  public void removeFullScreenRequestListener(u paramu) {
    this.c.b(paramu);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/TuneViewGaugeCluster.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */