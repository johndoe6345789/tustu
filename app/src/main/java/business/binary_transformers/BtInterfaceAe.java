package business.binary_transformers;

import com.efiAnalytics.tuningwidgets.panels.f;

class BtInterfaceAe implements f {
  BtInterfaceAe(an paraman) {}

  public void a(String paramString) {
    if (paramString == null) paramString = "";
    this.a.z.a("xPlotColumnName", paramString);
    an.a(this.a);
  }

  public void b(String paramString) {
    if (paramString == null) paramString = "";
    this.a.z.a("yPlotColumnName", paramString);
    an.a(this.a);
  }

  public void a() {
    an.b(this.a);
  }

  public boolean c(String paramString) {
    if (an.c(this.a, paramString)) {
      this.a.b(paramString);
      this.a.z.a("xyPlotFilterExp", paramString);
      return true;
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
