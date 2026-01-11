package w;

import r.RInterfaceOscar;

public class WInterfaceBravo implements RInterfaceOscar {
  public boolean a(String paramString1, String paramString2) {
    if (paramString2 != null) {
      if (paramString2.isEmpty())
        return true; 
      if ((paramString2.equals("20") || paramString2.equals("\024")) && (paramString1.equals("20") || paramString1.equals("\024")))
        return true; 
      if (paramString2.length() > 6 && paramString1.length() > 6) {
        String str1 = paramString1.substring(0, 6);
        String str2 = paramString2.substring(0, 6);
        if (str2.equals(str1))
          return true; 
      } else if (paramString1 != null && paramString2.equals(paramString1)) {
        return true;
      } 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/w/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */