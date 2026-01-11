package bt;

import W.n;
import ax.ExceptionInAxPackage;
import bH.D;
import bH.h;
import com.efiAnalytics.ui.bT;
import k.KInterfaceAlpha;
import k.KComponentDelta;

class Kinterfacealpha implements h, bT {
  n KInterfaceAlpha;
  
  private String c;
  
  Kinterfacealpha(an paraman, n paramn, String paramString) {
    this.KInterfaceAlpha = paramn;
    this.c = paramString;
  }
  
  public boolean KInterfaceAlpha(int paramInt) {
    if (this.c == null || this.c.isEmpty())
      return true; 
    try {
      KInterfaceAlpha KInterfaceAlpha = KComponentDelta.KInterfaceAlpha().KInterfaceAlpha(this.c);
      return (KInterfaceAlpha.KInterfaceAlpha(this.KInterfaceAlpha, paramInt) == 0.0D);
    } catch (ExceptionInAxPackage u) {
      D.KInterfaceAlpha("Unable to evaluate CurvePlotFilter: " + this.c);
      return true;
    } 
  }
  
  public void KInterfaceAlpha(String paramString) {
    this.c = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */