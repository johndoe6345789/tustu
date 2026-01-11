package bP;

import G.R;
import G.T;
import G.aM;
import G.cE;
import G.cI;
import G.m;

public class BpInterfaceAlpha implements cI {
  public void a(String paramString1, String paramString2) {
    b(paramString1, paramString2);
  }
  
  private void b(String paramString1, String paramString2) {
    R r = T.a().c(paramString1);
    if (r != null) {
      aM aM = r.c(paramString2);
      if (aM != null) {
        String str = cE.a(r, aM);
        m m = m.a(r.O(), aM.aL(), str);
        r.C().b(m);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bP/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */