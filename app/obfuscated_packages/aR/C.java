package aR;

import V.a;
import aP.dd;
import aP.f;
import aP.hq;
import ac.r;
import bH.D;
import d.c;
import d.k;
import java.util.Properties;
import s.g;

public class C implements c {
  public static String a = "silent";
  
  public String b() {
    return g.b("Toggle Data Logging");
  }
  
  public String c() {
    return "Data Logging";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    try {
      if (r.a()) {
        f.a().g(dd.a().c());
      } else {
        f.a().o();
      } 
    } catch (a a) {
      hq.a().d(a.getLocalizedMessage());
      D.d(a.getLocalizedMessage());
    } 
  }
  
  public String a() {
    return "toggleDatalogging";
  }
  
  public void b(Properties paramProperties) {}
  
  public k e() {
    return null;
  }
  
  public boolean f() {
    return false;
  }
  
  public boolean g() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */