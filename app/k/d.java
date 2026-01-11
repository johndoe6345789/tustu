package k;

import G.i;
import L.ab;
import L.h;
import L.k;
import L.m;
import L.n;
import ax.Q;
import ax.e;
import h.b;
import java.util.HashMap;
import java.util.Map;

public class d {
  private static d b = null;
  
  Map a = new HashMap<>();
  
  public static d a() {
    if (b == null) {
      b = new d();
      a.a((e)n.a());
      Q.a((e)n.a());
      a.a(new e());
      if (b.a().a("advancedMathFunctions")) {
        k.a((e)n.a());
        a.a((e)n.a());
        h.a(true);
        k.a((e)ab.a());
        a.a((e)ab.a());
        ab.a().a(true);
        i.c = true;
      } else {
        a.a((e)new m());
        k.a((e)new m());
        h.a(false);
      } 
    } 
    return b;
  }
  
  public a a(String paramString) {
    a a = (a)this.a.get(paramString);
    if (a == null) {
      a = new a(paramString);
      this.a.put(paramString, a);
    } 
    return a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/k/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */