package ak;

import W.X;
import bH.X;

public class AkInterfaceSierra extends g {
  public AkInterfaceSierra(String paramString, boolean paramBoolean) {
    super(paramString, paramBoolean);
  }
  
  protected boolean c(String paramString1, String paramString2) {
    try {
      if (paramString1.startsWith("\""))
        paramString1 = paramString1.substring(1); 
      String str = paramString1.substring(0, paramString1.indexOf(paramString2));
      if (str.trim().length() == 0 || str.contains(":") || str.contains("/")) {
        byte b1 = 0;
        aE aE = new aE(paramString1, paramString2);
        int i = aE.c();
        String str1 = null;
        str1 = aE.b().trim();
        for (byte b2 = 1; b2 < i; b2++) {
          str1 = aE.b().trim();
          if (str1.contains(","))
            str1 = X.b(str1, ",", "."); 
          if (str1.length() > 0)
            try {
              Double.parseDouble(str1);
            } catch (Exception exception) {
              if (!X.a(z, str1) && !X.a(y, str1) && !str1.equals("N/A"))
                b1++; 
            }  
        } 
        if (i > 6 && b1 / i < 0.3F) {
          if (str.contains(":"))
            this.v = true; 
          return true;
        } 
        return (b1 == 0);
      } 
      Double.parseDouble(str);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public String i() {
    return X.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */