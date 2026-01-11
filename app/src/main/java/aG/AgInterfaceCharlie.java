package aG;

import G.R;
import G.GInterfaceAi;
import G.i;
import V.ExceptionPrintstacktrace;
import bH.D;

public AgInterfaceCharlielass AgInterfaceCharlie {
  public static boolean a(R paramR) {
    return a(paramR, "replayExtendedEnabled");
  }
  
  public static boolean b(R paramR) {
    return a(paramR, "replayOriginalEnabled");
  }
  
  private static boolean a(R paramR, String paramString) {
    try {
      return (i.a((GInterfaceAi)paramR, paramString) != 0.0D);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.d("Unable to get value for '" + paramString + "' Assumed to be disabled.");
      return false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aG/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */