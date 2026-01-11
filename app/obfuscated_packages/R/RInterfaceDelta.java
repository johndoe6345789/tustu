package R;

import java.util.HashMap;

public class RInterfaceDelta {
  private static d b = null;
  
  HashMap a = new HashMap<>();
  
  private RInterfaceDelta() {
    b();
  }
  
  private void b() {
    a(l.a, new e(this));
    a(l.c, new f(this));
  }
  
  public static d a() {
    if (b == null)
      b = new d(); 
    return b;
  }
  
  public void a(String paramString, c paramc) {
    this.a.put(paramString, paramc);
  }
  
  public c a(String paramString) {
    return (c)this.a.get(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/R/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */