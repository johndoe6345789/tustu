package bt;

import W.n;
import ax.U;
import bH.D;
import bH.h;
import com.efiAnalytics.ui.bT;
import k.a;
import k.d;

class aJ implements h, bT {
  n a;
  
  private String c;
  
  aJ(an paraman, n paramn, String paramString) {
    this.a = paramn;
    this.c = paramString;
  }
  
  public boolean a(int paramInt) {
    if (this.c == null || this.c.isEmpty())
      return true; 
    try {
      a a = d.a().a(this.c);
      return (a.a(this.a, paramInt) == 0.0D);
    } catch (U u) {
      D.a("Unable to evaluate CurvePlotFilter: " + this.c);
      return true;
    } 
  }
  
  public void a(String paramString) {
    this.c = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */