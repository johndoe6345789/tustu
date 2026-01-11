package aP;

import G.R;
import bH.D;
import bH.p;
import com.efiAnalytics.ui.ci;

class gF implements ci {
  R a = null;
  
  public gF(dB paramdB, R paramR) {
    this.a = paramR;
  }
  
  public boolean a(String paramString) {
    try {
      return p.a(paramString, this.a);
    } catch (Exception exception) {
      D.c(exception.getMessage());
      return true;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */