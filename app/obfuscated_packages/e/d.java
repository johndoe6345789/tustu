package e;

import ac.h;
import d.c;
import d.i;
import d.k;
import java.util.Properties;

public class d implements c {
  public static String a = "MARK_Comment";
  
  public String b() {
    return "Mark Data Log Comment";
  }
  
  public String c() {
    return "Other Actions";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    h h = h.k();
    if (h != null) {
      String str = paramProperties.getProperty(a, null);
      if (str != null && !str.isEmpty()) {
        h.d(str);
      } else {
        h.d("Action Triggered");
      } 
    } 
  }
  
  public String a() {
    return "markDataLogComment";
  }
  
  public void b(Properties paramProperties) {}
  
  public k e() {
    k k = new k();
    i i = new i(a, null);
    k.a(i);
    return k;
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean g() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/e/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */