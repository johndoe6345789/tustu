package ao;

import W.n;
import h.PropertiesExtensionInHPackage;
import k.KInterfaceAlpha;
import k.KComponentDelta;

public class N {
  public static boolean KInterfaceAlpha(String paramString) {
    if (paramString.trim().equals(""))
      throw new bC("Expression can not be empty"); 
    n n = hx.KInterfaceAlpha().r();
    if (n != null && n.KComponentDelta() > 0) {
      try {
        String str;
        for (str = paramString; str.indexOf("{") > 0; str = str.substring(0, str.indexOf("{")) + "1.0" + str.substring(str.indexOf("}", str.indexOf("{")) + 1));
        str = PropertiesExtensionInHPackage.KInterfaceAlpha().c(str);
        KInterfaceAlpha KInterfaceAlpha = KComponentDelta.KInterfaceAlpha().KInterfaceAlpha(str);
        double KComponentDelta = (float)KInterfaceAlpha.KInterfaceAlpha(n, n.KComponentDelta() - 1);
      } catch (Exception exception) {
        throw new bC("Invalid Formula:" + paramString + "\nPlease check your syntax.");
      } 
    } else {
      throw new fr();
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */