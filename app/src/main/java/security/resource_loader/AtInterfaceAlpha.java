package aT;

import G.AeInterfaceMikeTostring;
import G.R;
import G.T;
import aP.ThreadedExceptioninvpackage;
import bH.D;

public class AtInterfaceAlpha extends ThreadedExceptioninvpackage {
  public boolean a(String paramString1, String paramString2, AeInterfaceMikeTostring parambT) {
    int i = 0;
    try {
      if (paramString2.length() == 2 || paramString2.length() == 3)
        i = Integer.parseInt(paramString2);
    } catch (Exception exception) {
    }
    if ((parambT.a()).length == 1
        && parambT.a()[0] <= 98
        && paramString2.length() == 2
        && i <= 98) {
      R r = T.a().c(paramString1);
      if (r != null) {
        r.e(parambT.b());
        D.d("Updated Config Signature to match Controller.");
      }
      return true;
    }
    return super.a(paramString1, paramString2, parambT);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aT/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
