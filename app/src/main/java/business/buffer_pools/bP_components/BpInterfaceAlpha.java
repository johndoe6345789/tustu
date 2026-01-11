package business.buffer_pools.bP_components;

import G.R;
import G.T;
import G.Manager;
import G.GInterfaceCe;
import G.GInterfaceCi;
import G.m;

public class BpInterfaceAlpha implements GInterfaceCi {
  public void a(String paramString1, String paramString2) {
    b(paramString1, paramString2);
  }
  
  private void b(String paramString1, String paramString2) {
    R r = T.a().c(paramString1);
    if (r != null) {
      Manager Manager = r.c(paramString2);
      if (Manager != null) {
        String str = GInterfaceCe.a(r, Manager);
        m m = m.a(r.O(), Manager.aL(), str);
        r.C().b(m);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bP/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */