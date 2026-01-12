package com.efiAnalytics.apps.ts.tuningViews;

import G.ArrayListExceptionprintstacktraceInGPackage;
import G.R;
import G.T;
import W.z;
import bH.D;
import bH.aa;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.SelectableTable;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.TuneSettingsPanel;
import com.efiAnalytics.tuningwidgets.panels.W;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.util.ArrayList;
import r.ThreadedFile;
import s.SComponentGolf;
import v.SComponentGolf;

public class TuningViewFile {
  public static String a = "TuneView_";

  File b = null;

  F c = null;

  private String d = null;

  public TuningViewFile(File paramFile) {
    this.b = paramFile;
  }

  public File a() {
    return this.b;
  }

  public String b() {
    return (this.c != null) ? this.c.b() : z.d(this.b);
  }

  public String c() {
    return (this.c != null) ? this.c.e() : z.a(this.b, "enabledCondition");
  }

  public String toString() {
    String str = (this.c != null) ? this.c.b() : z.d(this.b);
    if (this.d != null && !this.d.isEmpty()) return str + " (" + SComponentGolf.b(this.d) + ")";
    boolean bool = this.b.getAbsolutePath().startsWith(ThreadedFile.l().getAbsolutePath());
    return bool
        ? (str + " (" + SComponentGolf.b("Default") + ")")
        : (str + " (" + SComponentGolf.b("User Tune View") + ")");
  }

  public F d() {
    if (this.c == null && this.b != null && this.b.exists()) {
      aa aa = new aa();
      aa.a();
      SComponentGolf SComponentGolf = new SComponentGolf();
      this.c = SComponentGolf.a(this.b);
      D.d("Time to read " + this.b.getName() + ": " + aa.d() + "ms.");
      if (!a(this.c)) this.c = null;
    }
    return this.c;
  }

  public boolean a(F paramF) {
    ArrayList arrayList = new ArrayList();
    for (TuneViewComponent tuneViewComponent : paramF) {
      R r;
      String str1 = tuneViewComponent.getEcuConfigurationName();
      if (str1 == null || str1.isEmpty() || T.a().c(str1) == null) {
        r = T.a().c();
      } else {
        r = T.a().c(str1);
      }
      String str2 = null;
      if (tuneViewComponent instanceof TuneSettingsPanel) {
        str2 = ((TuneSettingsPanel) tuneViewComponent).getSettingPanelName();
      } else if (tuneViewComponent instanceof SelectableTable) {
        str2 = ((SelectableTable) tuneViewComponent).getSelectedTableName();
      }
      if (str2 != null && !str2.isEmpty()) {
        ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage =
            r.e().c(str2);
        if (ArrayListExceptionprintstacktraceInGPackage != null
            && !W.a(r, ArrayListExceptionprintstacktraceInGPackage, bV.c())) return false;
      }
    }
    return true;
  }

  public boolean equals(Object paramObject) {
    if (paramObject instanceof k) {
      k k1 = (k) paramObject;
      return (k1.c != null && this.c != null)
          ? this.c.equals(k1.c)
          : ((k1.b != null && this.b != null) ? k1.b.equals(this.b) : super.equals(paramObject));
    }
    return (paramObject instanceof File && this.b != null)
        ? paramObject.equals(this.b)
        : super.equals(paramObject);
  }

  public void a(String paramString) {
    this.d = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
