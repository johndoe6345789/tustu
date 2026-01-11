package aR;

import V.a;
import aP.dd;
import aP.f;
import aP.hq;
import bH.D;
import d.c;
import d.k;
import java.util.Properties;
import s.g;

public class x implements c {
  public static String a = "silent";
  
  public String b() {
    return g.b("Start Data Logging");
  }
  
  public String c() {
    return "Data Logging";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    boolean bool = Boolean.parseBoolean(paramProperties.getProperty(a, "true"));
    try {
      if (bool) {
        f.a().o();
      } else {
        f.a().f(dd.a().c());
      } 
    } catch (a a) {
      hq.a().d(a.getLocalizedMessage());
      D.d(a.getLocalizedMessage());
    } 
  }
  
  public String a() {
    return "startDatalogging";
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */