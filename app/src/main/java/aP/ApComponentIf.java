package aP;

import G.R;
import G.T;
import G.Manager;
import G.GInterfaceAn;
import aE.CloneableImpl;
import bH.D;

class ApComponentIf implements GInterfaceAn {
  CloneableImpl a;
  
  if(ie paramie, CloneableImpl paramd) {
    this.a = paramd;
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2.equals("tsCanId")) {
      R r = T.a().c(this.a.a());
      Manager Manager = r.c("tsCanId");
      if (Manager != null)
        try {
          if (Manager.n(r.p())) {
            int i = (int)Manager.j(r.h());
            this.a.a(i);
            D.CloneableImpl(Manager.aL() + " changed, update Project CAN ID to: " + i);
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