package aS;

import G.R;
import G.Exceptionprintstacktrace;
import G.c;
import G.ManagerUsingArrayList;
import G.GInterfaceDb;
import G.GInterfaceDm;
import G.k;
import I.IInterfaceDelta;
import V.ExceptionPrintstacktrace;
import aR.ArInterfaceAlpha;
import bH.D;
import br.BrInterfaceJuliet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r.RInterfaceIndia;

public class AsInterfaceLima {
  public static String a = "veAnalyzeActive_";
  
  private Map b = new HashMap<>();
  
  private static l c = null;
  
  public static l a() {
    if (c == null)
      c = new l(); 
    return c;
  }
  
  public String a(R paramR, String paramString) {
    String str = a + paramString;
    ManagerUsingArrayList.a().IInterfaceDelta(str);
    ManagerUsingArrayList.a().a(str, 0.0D);
    this.b.put(paramString, str);
    try {
      GInterfaceDm GInterfaceDm = BrInterfaceJuliet.a().a(paramR, paramString);
      if (GInterfaceDm != null) {
        Exceptionprintstacktrace Exceptionprintstacktrace = new Exceptionprintstacktrace();
        Exceptionprintstacktrace.v(str + "Active");
        Exceptionprintstacktrace.a((GInterfaceDb)new c("VEAL " + paramString));
        Exceptionprintstacktrace.b((GInterfaceDb)new c("VEAL " + paramString));
        Exceptionprintstacktrace.a(k.s);
        Exceptionprintstacktrace.b(k.a);
        Exceptionprintstacktrace.c(k.RInterfaceIndia);
        Exceptionprintstacktrace.IInterfaceDelta(k.c);
        if (RInterfaceIndia.a().a("poij  fdsz poi9ure895 ms7("))
          Exceptionprintstacktrace.b(ArInterfaceAlpha.a + "?" + ArInterfaceAlpha.b + "=" + paramString); 
        Exceptionprintstacktrace.a(str);
        IInterfaceDelta.a().a(Exceptionprintstacktrace);
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {}
    return str;
  }
  
  public List a(R paramR, List paramList) {
    ArrayList<String> arrayList = new ArrayList();
    for (String str : paramList)
      arrayList.add(a(paramR, str)); 
    return arrayList;
  }
  
  public void b() {
    this.b.clear();
  }
  
  public void a(String paramString) {
    String str = (String)this.b.get(paramString);
    if (str != null) {
      ManagerUsingArrayList.a().a(str, 1.0D);
    } else {
      D.b("Attempt to start VE Analyze on unregistered table name: " + paramString);
    } 
  }
  
  public void b(String paramString) {
    String str = (String)this.b.get(paramString);
    if (str != null) {
      ManagerUsingArrayList.a().a(str, 0.0D);
    } else {
      D.b("Attempt to stop VE Analyze on unregistered table name: " + paramString);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */