package aP;

import G.R;
import G.T;
import G.aM;
import G.aN;
import V.g;
import aE.a;
import aE.d;
import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Z implements aN {
  a a = null;
  
  public Z(a parama) {
    this.a = parama;
  }
  
  public void a(String paramString1, String paramString2) {
    R r = T.a().c(paramString1);
    if (r == null) {
      D.b("Unable to update CAN ID, no EcuConfiguration found for " + paramString1);
      return;
    } 
    aM aM = r.c(paramString2);
    try {
      d d = this.a.t(paramString1);
      int i = (int)aM.j(r.p());
      if (d != null) {
        d.a(i);
      } else {
        this.a.a(i);
      } 
    } catch (g g) {
      Logger.getLogger(Z.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */