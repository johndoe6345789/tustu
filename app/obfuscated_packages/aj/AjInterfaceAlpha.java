package aj;

import G.R;
import G.T;
import G.ac;
import G.cu;
import W.j;
import W.n;
import bH.D;

public class AjInterfaceAlpha {
  public void a(int paramInt, n paramn) {
    if (paramn != null && !a())
      for (j j : paramn) {
        String str1;
        String str2 = j.a();
        if (str2.contains(".")) {
          str1 = str2.substring(0, str2.indexOf('.'));
          str2 = str2.substring(str2.indexOf('.') + 1);
        } else {
          str1 = T.a().c().c();
        } 
        R r = T.a().c(str1);
        if (r == null) {
          D.d("EcuConfig '" + str1 + "' not found, using working config");
          r = T.a().c();
        } 
        ac ac = a(r, str2);
        if (ac != null)
          try {
            cu.a().a(r.c(), ac.a(), j.d(paramInt));
          } catch (Exception exception) {} 
      }  
  }
  
  private ac a(R paramR, String paramString) {
    for (ac ac : paramR.g()) {
      if (ac.b().equals(paramString))
        return ac; 
    } 
    return null;
  }
  
  private boolean a() {
    R r = T.a().c();
    return (r != null && r.R());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aj/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */