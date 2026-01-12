package com.efiAnalytics.apps.ts.dashboard;

import G.T;
import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.ui.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import r.JPanelExtensionInRPackage;
import r.ThreadedFile;
import v.IOInVPackage;

class DashboardFileLoader implements ExceptionInVPackage {
  private JPanelExtensionInRPackage JPanelExtensionInRPackage = null;

  private String[] IOInVPackage = null;

  DashboardFileLoader(x paramx, JPanelExtensionInRPackage paramb, String[] paramArrayOfString) {
    this.JPanelExtensionInRPackage = paramb;
    this.IOInVPackage = paramArrayOfString;
  }

  public boolean ExceptionInVPackage() {
    d();
    if (this.ExceptionInVPackage.ad() != null) this.ExceptionInVPackage.h();
    return true;
  }

  public void JPanelExtensionInRPackage() {}

  public void IOInVPackage() {
    d();
    if (this.ExceptionInVPackage.ad() != null) this.ExceptionInVPackage.h();
  }

  private void d() {
    try {
      IOInVPackage IOInVPackage = new IOInVPackage(ThreadedFile.G());
      Z z = null;
      z =
          IOInVPackage.ExceptionInVPackage(
              this.JPanelExtensionInRPackage.JPanelExtensionInRPackage().getAbsolutePath());
      if (this.JPanelExtensionInRPackage.IOInVPackage() && !ExceptionInVPackage(z.d())) {
        String str = this.IOInVPackage[0];
        for (byte b1 = 1; b1 < this.IOInVPackage.length; b1++)
          str = str + " or " + this.IOInVPackage[b1];
        boolean bool =
            bV.ExceptionInVPackage(
                "Warning: Gauge Cluster firmware signature ("
                    + z.d()
                    + ")\ndoes not match current firmware ("
                    + str
                    + ").\nYou may need to reset gauge output channels.\n \nContinue Loading?",
                this.ExceptionInVPackage.getParent(),
                true);
        if (!bool) return;
      }
      z.JPanelExtensionInRPackage(this.IOInVPackage[0]);
      String[] arrayOfString = T.ExceptionInVPackage().d();
      z = ab.ExceptionInVPackage(arrayOfString, z);
      G.R r = this.ExceptionInVPackage.k;
      if (r != null) (new aa()).JPanelExtensionInRPackage(r, z);
      this.ExceptionInVPackage.ExceptionInVPackage(z);
      this.ExceptionInVPackage.d(this.JPanelExtensionInRPackage.g());
      x.k(this.ExceptionInVPackage);
      x.d(this.ExceptionInVPackage, false);
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage(
          "Unable to load dash file:\n"
              + this.JPanelExtensionInRPackage.JPanelExtensionInRPackage(),
          (Exception) a1,
          this.ExceptionInVPackage.getParent());
    }
  }

  private boolean ExceptionInVPackage(String paramString) {
    for (byte b1 = 0; b1 < this.IOInVPackage.length; b1++) {
      if (this.IOInVPackage[b1].equals(paramString)) return true;
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
