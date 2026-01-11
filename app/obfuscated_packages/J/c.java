package J;

import G.F;

public class c {
  private static c a = null;
  
  public static c a() {
    if (a == null)
      a = new c(); 
    return a;
  }
  
  public void a(F paramF, int paramInt) {
    if (paramInt > 0 && !(paramF.D() instanceof f))
      paramF.a(new f()); 
    if (paramInt > 0 && !(paramF.C() instanceof g))
      paramF.a(new g()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/J/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */