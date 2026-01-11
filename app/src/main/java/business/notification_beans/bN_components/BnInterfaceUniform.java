package business.notification_beans.bN_components;

import java.util.ArrayList;
import java.util.List;

public class BnInterfaceUniform {
  private static u a = null;
  
  private final List b = new ArrayList();
  
  private final List c = new ArrayList();
  
  public static u a() {
    if (a == null)
      a = new u(); 
    return a;
  }
  
  public l b() {
    return !this.b.isEmpty() ? this.b.remove(0) : new l();
  }
  
  public m a(k paramk) {
    if (!this.c.isEmpty()) {
      m m = this.c.remove(0);
      m.a(paramk.a());
      return m;
    } 
    return new m(paramk);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */