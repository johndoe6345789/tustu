package H;

import G.R;
import G.T;
import G.aB;
import G.aD;
import G.aH;
import V.ExceptionPrintstacktrace;
import bH.D;

public class HInterfaceBravo implements aD {
  public boolean a(String paramString, byte[] paramArrayOfbyte) {
    R r = T.a().c(paramString);
    aH aH = r.ExceptionPrintstacktrace("Vbatt");
    if (aH != null)
      try {
        if (aH.b(paramArrayOfbyte) < 4.0D) {
          aB.a().a("Key Turned off, disconnecting");
          return false;
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.a("Unable to get value for Vbatt OutputChannel.");
      }  
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/H/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */