package aR;

import d.c;
import d.e;
import d.i;
import d.k;
import java.util.Properties;

public class f implements c {
  public static String a = "Warning_Message";
  
  public static String b = "globalWarning";
  
  k c = null;
  
  public String a() {
    return b;
  }
  
  public String b() {
    return "Show a Global Warning";
  }
  
  public String c() {
    return "Other Actions";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    String str = paramProperties.getProperty(a, null);
    if (str == null || str.isEmpty())
      throw new e(a + " is required"); 
    aP.f.a().d(str);
  }
  
  public void b(Properties paramProperties) {
    String str = paramProperties.getProperty(a, null);
    if (str == null || str.isEmpty())
      throw new e(a + " is required"); 
  }
  
  public k e() {
    if (this.c == null) {
      this.c = new k();
      i i = new i(a, "");
      i.a(1);
      i.c("Set the message you want displayed throughout the application when this User Action is triggered.");
      this.c.a(i);
    } 
    return this.c;
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean g() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */