package aP;

import G.R;
import G.T;
import G.aM;
import G.aN;
import V.ExceptionPrintstacktrace;
import aE.PropertiesExtension;
import aE.CloneableImpl;
import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApInterfaceZulu implements aN {
  PropertiesExtension PropertiesExtension = null;
  
  public ApInterfaceZulu(PropertiesExtension parama) {
    this.PropertiesExtension = parama;
  }
  
  public void PropertiesExtension(String paramString1, String paramString2) {
    R r = T.PropertiesExtension().c(paramString1);
    if (r == null) {
      D.b("Unable to update CAN ID, no EcuConfiguration found for " + paramString1);
      return;
    } 
    aM aM = r.c(paramString2);
    try {
      CloneableImpl CloneableImpl = this.PropertiesExtension.t(paramString1);
      int i = (int)aM.j(r.p());
      if (CloneableImpl != null) {
        CloneableImpl.PropertiesExtension(i);
      } else {
        this.PropertiesExtension.PropertiesExtension(i);
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(Z.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */