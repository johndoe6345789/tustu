package ak;

import W.X;
import bH.X;

public class AkComponentTango extends g {
  public AkComponentTango() {
    super("\t", false);
  }
  
  protected boolean c(String paramString1, String paramString2) {
    try {
      if (paramString1.startsWith("\""))
        paramString1 = paramString1.substring(1); 
      String str = paramString1.substring(0, paramString1.indexOf(paramString2));
      str = X.b(str, ",", ".");
      Double.parseDouble(str);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public String i() {
    return X.s;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */