package aP;

import G.R;
import G.T;
import G.aM;
import G.aN;
import V.g;
import java.util.logging.Level;
import java.util.logging.Logger;

class jG implements aN {
  jG(jA paramjA) {}
  
  public void a(String paramString1, String paramString2) {
    R r = T.a().c(paramString1);
    if (r != null) {
      aM aM = r.c("tsCanId");
      try {
        double d = aM.j(r.p());
        r.O().r((int)d);
      } catch (g g) {
        Logger.getLogger(jA.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */