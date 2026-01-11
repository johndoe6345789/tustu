package aR;

import G.T;
import aP.dd;
import aP.f;
import aP.hq;
import d.c;
import d.k;
import java.util.Properties;

public class p implements c {
  public String b() {
    return "Show Communications Dialog";
  }
  
  public String c() {
    return "Project";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    if (T.a().c() != null) {
      f.a().e(dd.a().c());
    } else {
      hq.a().a("No Project open, cannot display Comms settings.");
    } 
  }
  
  public String a() {
    return "showCommsSettings";
  }
  
  public void b(Properties paramProperties) {}
  
  public k e() {
    return null;
  }
  
  public boolean f() {
    return false;
  }
  
  public boolean g() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */