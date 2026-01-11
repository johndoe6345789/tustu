package aP;

import G.R;
import G.T;
import G.Manager;
import G.GInterfaceAn;
import V.ExceptionPrintstacktrace;
import java.util.logging.Level;
import java.util.logging.Logger;

class ApInterfaceJg implements GInterfaceAn {
  ApInterfaceJg(jA paramjA) {}
  
  public void a(String paramString1, String paramString2) {
    R r = T.a().c(paramString1);
    if (r != null) {
      Manager Manager = r.c("tsCanId");
      try {
        double d = Manager.j(r.p());
        r.O().r((int)d);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(jA.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */