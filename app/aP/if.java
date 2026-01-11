package aP;

import G.R;
import G.T;
import G.aM;
import G.aN;
import aE.d;
import bH.D;

class if implements aN {
  d a;
  
  if(ie paramie, d paramd) {
    this.a = paramd;
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2.equals("tsCanId")) {
      R r = T.a().c(this.a.a());
      aM aM = r.c("tsCanId");
      if (aM != null)
        try {
          if (aM.n(r.p())) {
            int i = (int)aM.j(r.h());
            this.a.a(i);
            D.d(aM.aL() + " changed, update Project CAN ID to: " + i);
          } 
        } catch (Exception exception) {
          D.b("Failed to update Project Can ID");
        }  
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/if.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */