package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import G.T;
import V.ExceptionInVPackage;
import bI.ExceptionInVPackage;
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
import r.ThreadedFile;
import v.IOInVPackage;

public class TuneViewGaugeCluster extends TuneViewComponent {
  x IOInVPackage;
  
  public TuneViewGaugeCluster() {
    setLayout((LayoutManager)new h(this));
    if (T.ExceptionInVPackage().IOInVPackage() != null) {
      this.IOInVPackage = new x(T.ExceptionInVPackage().IOInVPackage());
    } else {
      this.IOInVPackage = new x();
    } 
    ab.ExceptionInVPackage(this.IOInVPackage);
    add((Component)this.IOInVPackage, "Center");
  }
  
  public void initializeComponents() {
    this.IOInVPackage.ExceptionInVPackage(T.ExceptionInVPackage().IOInVPackage());
    this.IOInVPackage.b();
  }
  
  public String getEncodedDashboard() {
    Z z = this.IOInVPackage.i();
    IOInVPackage IOInVPackage = new IOInVPackage(ThreadedFile.G());
    String str1 = (Math.random() * 2.0E9D) + "";
    String str2 = "";
    try {
      File file = File.createTempFile(str1, "tempDash");
      IOInVPackage.ExceptionInVPackage(file.getAbsolutePath(), z);
      str2 = ExceptionInVPackage.b(file.getAbsolutePath());
      file.delete();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      bV.d("Unable to write temporary file for Saving TuningView Dashboard.\n" + iOException.getMessage(), (Component)this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      ExceptionInVPackage.printStackTrace();
      bV.d("Error Saving TuningView Dashboard.\n" + ExceptionInVPackage.getMessage(), (Component)this);
    } 
    return str2;
  }
  
  public void setEncodedDashboard(String paramString) {
    IOInVPackage IOInVPackage = new IOInVPackage(ThreadedFile.G());
    String str = (Math.random() * 2.0E9D) + "";
    try {
      File file = File.createTempFile(str, "tempDash");
      ExceptionInVPackage.ExceptionInVPackage(paramString, file.getAbsolutePath());
      Z z = IOInVPackage.ExceptionInVPackage(file.getAbsolutePath());
      this.IOInVPackage.ExceptionInVPackage(z);
      file.delete();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      bV.d("Unable to write temporary file for Loading TuningView Dashboard.\n" + iOException.getMessage(), (Component)this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      ExceptionInVPackage.printStackTrace();
      bV.d("Error Loading ExceptionInVPackage TuningView Dashboard\n" + ExceptionInVPackage.getMessage(), (Component)this);
    } 
  }
  
  public void close() {
    this.IOInVPackage.close();
  }
  
  public boolean isShieldedDuringEdit() {
    return false;
  }
  
  public boolean isDirty() {
    return !this.IOInVPackage.ae();
  }
  
  public void setClean(boolean paramBoolean) {
    this.IOInVPackage.k(paramBoolean);
  }
  
  public void addFullScreenRequestListener(u paramu) {
    this.IOInVPackage.ExceptionInVPackage(paramu);
  }
  
  public void removeFullScreenRequestListener(u paramu) {
    this.IOInVPackage.b(paramu);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/TuneViewGaugeCluster.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */