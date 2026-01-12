package w;

import r.RInterfaceOscar;

public class WInterfaceAlpha implements RInterfaceOscar {
  public boolean a(String paramString1, String paramString2) {
    if (paramString2 == null) return false;
    if (paramString2.isEmpty()) return true;
    if (paramString2 != null && paramString1 != null && paramString1.length() < 5) {
      if (paramString2.equals("76")
          || paramString2.equals("77")
          || paramString2.equals("88")
          || paramString2.equals("97")
          || paramString2.equals("98")
          || paramString2.length() == 2) return true;
    } else if (paramString1 != null
        && paramString1.startsWith("BigStuff Gen4")
        && paramString2.startsWith("BigStuff Gen4")) {
      return true;
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/w/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
