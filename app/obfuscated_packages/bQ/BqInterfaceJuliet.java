package bQ;

import A.IO;
import A.AInterfaceRomeo;
import A.Exception;
import G.R;
import G.T;
import W.WInterfaceAp;
import bH.J;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BqInterfaceJuliet {
  private static j c = null;
  
  private WInterfaceAp d = null;
  
  HashMap a = new HashMap<>();
  
  static String b = "controllerInterfaceId";
  
  public static j a() {
    if (c == null)
      c = new j(); 
    return c;
  }
  
  public l a(R paramR) {
    l l = (l)this.a.get(paramR.c());
    if (l == null) {
      l = new l(paramR.O());
      this.a.put(paramR.c(), l);
    } 
    return l;
  }
  
  public void a(String paramString) {
    l l = (l)this.a.remove(paramString);
    if (l != null)
      l.j(); 
  }
  
  public void a(String paramString1, String paramString2) {
    String str = b(paramString1);
    b(str + b, paramString2);
    str = c(paramString1);
    b(str + b, paramString2);
  }
  
  public String b(R paramR) {
    String str1 = b(paramR.c());
    String str2 = c(str1 + b, null);
    str1 = c(paramR.c());
    return c(str1 + b, str2);
  }
  
  public void a(String paramString, IO paramf) {
    String str1 = b(paramString);
    String str2 = c(paramString);
    str1 = str1 + paramf.h();
    str2 = str2 + paramf.h();
    List list = paramf.l();
    for (AInterfaceRomeo AInterfaceRomeo : list) {
      Object object = paramf.a(AInterfaceRomeo.c());
      if (object != null) {
        b(str1 + AInterfaceRomeo.c(), object.toString());
        b(str2 + AInterfaceRomeo.c(), object.toString());
      } 
    } 
  }
  
  public void b(String paramString, IO paramf) {
    String str1 = b(paramString);
    String str2 = c(paramString);
    str1 = str1 + paramf.h();
    str2 = str2 + paramf.h();
    List list = paramf.l();
    for (AInterfaceRomeo AInterfaceRomeo : list) {
      Object object = paramf.a(AInterfaceRomeo.c());
      object = (object != null) ? object : "";
      object = c(AInterfaceRomeo.c(), object.toString());
      String str3 = c(str1 + AInterfaceRomeo.c(), object.toString());
      String str4 = c(str2 + AInterfaceRomeo.c(), str3.toString());
      try {
        paramf.a(AInterfaceRomeo.c(), str4);
      } catch (Exception Exception) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, (Throwable)Exception);
      } 
    } 
  }
  
  private String b(String paramString) {
    String str = "XCP_MasterCommDriver.";
    if (T.a().c() != null && !T.a().c().c().equals(paramString))
      str = str + paramString + "."; 
    return str;
  }
  
  private String c(String paramString) {
    String str = b() + "MasterCommDriver.";
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
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, exception);
      }  
    if (str == null || str.isEmpty())
      str = "UnknownHost"; 
    return str;
  }
  
  public void a(WInterfaceAp paramap) {
    this.d = paramap;
  }
  
  private void b(String paramString1, String paramString2) {
    if (this.d != null)
      this.d.a(paramString1, paramString2); 
  }
  
  private String c(String paramString1, String paramString2) {
    return (this.d != null) ? this.d.b(paramString1, paramString2) : paramString2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */