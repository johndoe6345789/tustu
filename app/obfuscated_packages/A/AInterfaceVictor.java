package A;

import G.R;
import G.T;
import W.ap;
import bH.J;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AInterfaceVictor {
  private static v c = null;
  
  private ap d = null;
  
  HashMap a = new HashMap<>();
  
  static String b = "controllerInterfaceId";
  
  public static v a() {
    if (c == null)
      c = new v(); 
    return c;
  }
  
  public t a(R paramR) {
    t t = (t)this.a.get(paramR.c());
    if (t == null) {
      t = new t(paramR.O());
      this.a.put(paramR.c(), t);
    } 
    return t;
  }
  
  public void a(String paramString) {
    this.a.remove(paramString);
  }
  
  public void a(String paramString1, String paramString2) {
    String str = c(paramString1);
    b(str + b, paramString2);
    str = d(paramString1);
    b(str + b, paramString2);
  }
  
  public String b(R paramR) {
    String str1 = b(paramR.c());
    String str2 = c(str1 + b, null);
    str1 = c(paramR.c());
    str2 = c(str1 + b, str2);
    str1 = d(paramR.c());
    str2 = c(str1 + b, str2);
    if (str2 == null && paramR.C() instanceof g) {
      g g = (g)paramR.C();
      if (g.a() != null)
        str2 = g.a().h(); 
    } 
    return str2;
  }
  
  public void a(String paramString, f paramf) {
    String str1 = c(paramString);
    String str2 = d(paramString);
    str1 = str1 + paramf.h();
    str2 = str2 + paramf.h();
    List list = paramf.l();
    for (r r : list) {
      Object object = paramf.a(r.c());
      if (object != null) {
        b(str1 + r.c(), object.toString());
        b(str2 + r.c(), object.toString());
      } 
    } 
  }
  
  public void b(String paramString, f paramf) {
    String str1 = c(paramString);
    String str2 = d(paramString);
    str1 = str1 + paramf.h();
    str2 = str2 + paramf.h();
    List list = paramf.l();
    for (r r : list) {
      Object object = paramf.a(r.c());
      object = (object != null) ? object : "";
      object = c(r.c(), object.toString());
      object = c(b(paramString) + r.c(), object.toString());
      String str3 = c(str1 + r.c(), object.toString());
      String str4 = c(str2 + r.c(), str3.toString());
      try {
        paramf.a(r.c(), str4);
      } catch (s s) {
        Logger.getLogger(v.class.getName()).log(Level.SEVERE, (String)null, s);
      } 
    } 
  }
  
  private String b(String paramString) {
    String str = "MSCommDriver.";
    if (T.a().c() != null && !T.a().c().c().equals(paramString)) {
      str = str + paramString + ".";
    } else {
      str = str + paramString;
    } 
    return str;
  }
  
  private String c(String paramString) {
    String str = "MSCommDriver.";
    if (T.a().c() != null && !T.a().c().c().equals(paramString))
      str = str + paramString + "."; 
    return str;
  }
  
  private String d(String paramString) {
    String str = b() + "CommDriver.";
    if (T.a().c() != null && !T.a().c().c().equals(paramString))
      str = str + paramString + "."; 
    return str;
  }
  
  public static String b() {
    String str = null;
    if (J.a()) {
      str = System.getenv("COMPUTERNAME");
    } else {
      str = System.getenv("HOSTNAME");
    } 
    if (str == null || str.isEmpty())
      try {
        str = InetAddress.getLocalHost().getHostName();
      } catch (Exception exception) {
        Logger.getLogger(v.class.getName()).log(Level.SEVERE, (String)null, exception);
      }  
    if (str == null || str.isEmpty())
      str = "UnknownHost"; 
    return str;
  }
  
  public void a(ap paramap) {
    this.d = paramap;
  }
  
  public ap c() {
    return this.d;
  }
  
  private void b(String paramString1, String paramString2) {
    if (this.d != null)
      this.d.a(paramString1, paramString2); 
  }
  
  private String c(String paramString1, String paramString2) {
    return (this.d != null) ? this.d.b(paramString1, paramString2) : paramString2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */