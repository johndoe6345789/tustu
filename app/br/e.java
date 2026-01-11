package br;

import G.R;
import G.aM;
import G.aW;
import G.be;
import G.dm;
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
  
  public ArrayList a(R paramR, dm paramdm) {
    String str = paramR.c() + "." + paramdm.b();
    if (!this.b.containsKey(str)) {
      String str1 = paramR.c() + "." + paramdm.b();
      dQ dQ = new dQ((Properties)a.A(), str1);
      ArrayList<k> arrayList = new ArrayList();
      Iterator<aW> iterator = paramdm.i();
      while (iterator.hasNext()) {
        aW aW = iterator.next();
        k k = null;
        if (aW.aL().startsWith("std_"))
          try {
            k = a(paramR, paramdm, aW, (et)dQ);
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
      for (byte b = 0; b < arrayList.size() - 1; b++) {
        if (((k)arrayList.get(b)).g().equals("std_DeadLambda")) {
          k k = arrayList.remove(b);
          arrayList.add(k);
        } 
      } 
      this.b.put(str, arrayList);
    } 
    return (ArrayList)this.b.get(str);
  }
  
  private k a(R paramR, dm paramdm, aW paramaW, et paramet) {
    be be = (be)paramR.e().c(paramdm.b());
    if (be == null)
      throw new a("Can not find VE table: " + paramdm.b() + " in current configuration."); 
    k k = new k();
    if (paramaW.aL().equals("std_xAxisMin")) {
      aM aM = paramR.c(be.a());
      if (aM == null)
        throw new a("X Axis Parameter " + be.a() + " not found in current Configuration."); 
      k.e(paramaW.aL());
      k.a(be.d());
      k.a(4);
      double d = Double.parseDouble(a(paramet, k.g(), aM.r() + ""));
      k.a(d);
      k.a(paramet);
      k.d("Min " + be.d());
      return k;
    } 
    if (paramaW.aL().equals("std_xAxisMax")) {
      aM aM = paramR.c(be.a());
      if (aM == null)
        throw new a("X Axis Parameter " + be.a() + " not found in current Configuration."); 
      k.e(paramaW.aL());
      k.a(be.d());
      k.a(2);
      double d = Double.parseDouble(a(paramet, k.g(), aM.s() + ""));
      k.a(d);
      k.a(paramet);
      k.d("Max " + be.d());
      return k;
    } 
    if (paramaW.aL().equals("std_yAxisMin")) {
      aM aM = paramR.c(be.b());
      if (aM == null)
        throw new a("Y Axis Parameter " + be.b() + " not found in current Configuration."); 
      k.e(paramaW.aL());
      k.a(be.f());
      k.a(4);
      double d = Double.parseDouble(a(paramet, k.g(), aM.r() + ""));
      k.a(d);
      k.a(paramet);
      k.d("Min " + be.f());
      return k;
    } 
    if (paramaW.aL().equals("std_yAxisMax")) {
      aM aM = paramR.c(be.b());
      if (aM == null)
        throw new a("Y Axis Parameter " + be.b() + " not found in current Configuration."); 
      k.e(paramaW.aL());
      k.a(be.f());
      k.a(2);
      double d = Double.parseDouble(a(paramet, k.g(), aM.s() + ""));
      k.a(d);
      k.a(paramet);
      k.d("Max " + be.f());
      return k;
    } 
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
      f.a(paramdm.e());
      return (k)f;
    } 
    throw new a("Unknown Standard Record Filter type: " + paramaW.aL());
  }
  
  private String a(et paramet, String paramString1, String paramString2) {
    if (paramet == null)
      return paramString2; 
    String str = paramet.a(paramString1);
    return (str != null && !str.equals("")) ? str : paramString2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */