package bh;

import G.R;
import G.GInterfaceBi;
import java.util.Iterator;

public class BhInterfaceAlpha {
  public static String a(R paramR) {
    String str = a(paramR, "ve");
    if (str == null)
      str = a(paramR, "fuel"); 
    if (str == null)
      str = c(paramR); 
    return str;
  }
  
  public static String b(R paramR) {
    String str = a(paramR, "spark");
    if (str == null)
      str = a(paramR, "adv"); 
    if (str == null)
      str = c(paramR); 
    return str;
  }
  
  private static String a(R paramR, String paramString) {
    String str = null;
    Iterator<GInterfaceBi> iterator = paramR.o();
    while (iterator.hasNext()) {
      GInterfaceBi GInterfaceBi = iterator.next();
      if (GInterfaceBi.a().toLowerCase().startsWith(paramString.toLowerCase()))
        return GInterfaceBi.a(); 
    } 
    return str;
  }
  
  private static String c(R paramR) {
    try {
      return ((GInterfaceBi)paramR.o().next()).a();
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */