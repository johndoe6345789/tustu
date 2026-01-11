package bn;

import G.R;
import G.bI;
import G.bM;
import V.g;
import aE.a;
import bH.D;
import bH.X;
import bo.b;
import bt.bQ;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.s;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.g;

public class c {
  public static String a = "veTableGenerator";
  
  public static String b = "afrTableGenerator";
  
  public static String c = "Two Point Calculator";
  
  public static String d = "Calculator";
  
  private static c f = null;
  
  HashMap e = new HashMap<>();
  
  public static c a() {
    if (f == null)
      f = new c(); 
    return f;
  }
  
  public a a(R paramR, bI parambI) {
    String str = X.b(parambI.aL(), " ", "");
    if (this.e.get(str) != null)
      return (a)this.e.get(str); 
    if (str.equals(a))
      try {
        s s = bQ.a().a(paramR, parambI.a(), "", "");
        String str1 = bM.c(paramR, parambI.a());
        str1 = g.b(str1);
        return (a)new b(str1, paramR, parambI.a(), s, (et)new dQ((Properties)a.A(), "veGenerator"), b.p);
      } catch (g g) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        throw new e("Unable to create VE Table Generator for " + parambI.a());
      } catch (Exception exception) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, exception);
        throw new e("Unable to create VE Table Generator for " + parambI.a());
      }  
    if (str.equals(b))
      try {
        s s = bQ.a().a(paramR, parambI.a(), "", "");
        String str1 = bM.c(paramR, parambI.a());
        str1 = g.b(str1);
        if (paramR.d("NARROW_BAND_EGO") != null)
          D.a("Narrow band AFR target generation is are not currently supported - Use at own risk", null, null); 
        boolean bool = (paramR.d("LAMBDA") != null) ? true : false;
        return (a)new b(str1, paramR, parambI.a(), s, (et)new dQ((Properties)a.A(), "veGenerator"), bool ? b.r : b.q);
      } catch (g g) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        throw new e("Unable to create AFR Table Generator for " + parambI.a());
      } catch (Exception exception) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, exception);
        throw new e("Unable to create AFR Table Generator for " + parambI.a());
      }  
    throw new e("Unknown Tool:" + str);
  }
  
  public void a(String paramString, a parama) {
    this.e.put(X.b(paramString, " ", ""), parama);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bn/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */