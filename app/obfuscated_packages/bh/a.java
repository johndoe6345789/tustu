package bh;

import G.R;
import G.bi;
import java.util.Iterator;

public class a {
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
    Iterator<bi> iterator = paramR.o();
    while (iterator.hasNext()) {
      bi bi = iterator.next();
      if (bi.a().toLowerCase().startsWith(paramString.toLowerCase()))
        return bi.a(); 
    } 
    return str;
  }
  
  private static String c(R paramR) {
    try {
      return ((bi)paramR.o().next()).a();
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */