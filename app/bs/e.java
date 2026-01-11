package bs;

import G.R;
import G.aW;
import G.bm;
import G.dp;
import V.a;
import aE.a;
import bH.D;
import bL.f;
import bL.k;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.et;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import s.g;

public class e {
  private static e a = null;
  
  private HashMap b = new HashMap<>();
  
  public static e a() {
    if (a == null)
      a = new e(); 
    return a;
  }
  
  public ArrayList a(R paramR, dp paramdp) {
    String str = paramR.c() + "." + paramdp.c();
    if (!this.b.containsKey(str)) {
      String str1 = paramR.c() + "." + paramdp.c();
      dQ dQ = new dQ((Properties)a.A(), str1);
      ArrayList<k> arrayList = new ArrayList();
      Iterator<aW> iterator = paramdp.i();
      while (iterator.hasNext()) {
        aW aW = iterator.next();
        k k = null;
        if (aW.aL().startsWith("std_"))
          try {
            k = a(paramR, paramdp, aW, (et)dQ);
          } catch (a a) {
            D.b("Unable to create Standard VE Analyze Filter: " + aW.aL() + ", will try as a normal filter.");
            a.printStackTrace();
          }  
        if (k == null) {
          k = new k();
          k.a(aW.a());
          k.c(aW.b());
          k.a(aW.c());
          if (aW.g()) {
            double d = Double.parseDouble(a((et)dQ, k.g(), aW.c() + ""));
            k.a(d);
            k.a((et)dQ);
          } 
          k.a(aW.d());
          k.d(aW.e());
          k.e(aW.aL());
          k.a(aW.g());
        } 
        k.d();
        arrayList.add(k);
      } 
      this.b.put(str, arrayList);
    } 
    return (ArrayList)this.b.get(str);
  }
  
  private k a(R paramR, dp paramdp, aW paramaW, et paramet) {
    bm bm = (bm)paramR.e().c(paramdp.c());
    if (bm == null)
      throw new a("Can not find WUE Curve: " + paramdp.c() + " in current configuration."); 
    k k = new k();
    if (paramaW.aL().equals("std_Custom")) {
      k.e(paramaW.aL());
      k.a(128);
      String str = a(paramet, k.g(), "");
      k.c(str);
      k.a(paramet);
      k.d(g.b("Custom Filter") + ": ");
      return k;
    } 
    if (paramaW.aL().equals("std_Expression")) {
      k.e(paramaW.aL());
      k.a(128);
      String str = paramaW.f();
      k.c(str);
      k.d(paramaW.e());
      k.a(false);
      return k;
    } 
    if (paramaW.aL().equals("std_DeadLambda")) {
      f f = new f();
      f.e(paramaW.aL());
      f.a(paramdp.d());
      return (k)f;
    } 
    throw new a("Unknown Standard Record Filter type for WUE: " + paramaW.aL());
  }
  
  private String a(et paramet, String paramString1, String paramString2) {
    if (paramet == null)
      return paramString2; 
    String str = paramet.a(paramString1);
    return (str != null && !str.equals("")) ? str : paramString2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */