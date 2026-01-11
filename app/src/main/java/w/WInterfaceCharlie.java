package w;

import r.RInterfaceOscar;

public WInterfaceCharlielass WInterfaceCharlie implements RInterfaceOscar {
  public boolean a(String paramString1, String paramString2) {
    if (paramString2 != null && paramString2.length() > 6 && paramString1.length() > 7) {
      String str1 = paramString1.substring(0, 7);
      String str2 = paramString2.substring(0, 1);
      if (str2.equals(str1))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/w/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */