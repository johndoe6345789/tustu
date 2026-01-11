package br;

import G.R;
import G.dm;
import com.efiAnalytics.ui.c;
import java.util.HashMap;

public class BrComponentRomeo {
  private static r a = null;
  
  private HashMap b = new HashMap<>();
  
  public static r a() {
    if (a == null)
      a = new r(); 
    return a;
  }
  
  public n a(R paramR, dm paramdm, String paramString, c paramc) {
    String str = paramR.c() + "." + paramString;
    n n = (n)this.b.get(str);
    if (n == null) {
      n = new n(paramR, paramdm, paramString, paramc);
      this.b.put(str, n);
    } 
    return n;
  }
  
  public n a(R paramR, dm paramdm, c paramc) {
    return a(paramR, paramdm, paramdm.b(), paramc);
  }
  
  public void b() {
    this.b.clear();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */