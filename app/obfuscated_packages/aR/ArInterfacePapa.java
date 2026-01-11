package aR;

import G.T;
import aP.dd;
import aP.NetworkHashMap;
import aP.hq;
import d.DComponentCharlie;
import d.ArrayListExtensionInDPackage;
import java.util.Properties;

public class ArInterfacePapa implements DComponentCharlie {
  public String b() {
    return "Show Communications Dialog";
  }
  
  public String DComponentCharlie() {
    return "Project";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    if (T.a().DComponentCharlie() != null) {
      NetworkHashMap.a().e(dd.a().DComponentCharlie());
    } else {
      hq.a().a("No Project open, cannot display Comms settings.");
    } 
  }
  
  public String a() {
    return "showCommsSettings";
  }
  
  public void b(Properties paramProperties) {}
  
  public ArrayListExtensionInDPackage e() {
    return null;
  }
  
  public boolean NetworkHashMap() {
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