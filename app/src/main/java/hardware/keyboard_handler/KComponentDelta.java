package k;

import G.i;
import L.ab;
import L.h;
import L.k;
import L.m;
import L.n;
import ax.AbstractInAxPackage;
import ax.ArrayListUsingPattern;
import h.ClassTypeInHPackage;
import java.util.HashMap;
import java.util.Map;

public class KComponentDelta {
  private static d ClassTypeInHPackage = null;

  Map a = new HashMap<>();

  public static d a() {
    if (ClassTypeInHPackage == null) {
      ClassTypeInHPackage = new d();
      a.a((AbstractInAxPackage) n.a());
      ArrayListUsingPattern.a((AbstractInAxPackage) n.a());
      a.a(new AbstractInAxPackage());
      if (ClassTypeInHPackage.a().a("advancedMathFunctions")) {
        k.a((AbstractInAxPackage) n.a());
        a.a((AbstractInAxPackage) n.a());
        h.a(true);
        k.a((AbstractInAxPackage) ab.a());
        a.a((AbstractInAxPackage) ab.a());
        ab.a().a(true);
        i.c = true;
      } else {
        a.a((AbstractInAxPackage) new m());
        k.a((AbstractInAxPackage) new m());
        h.a(false);
      }
    }
    return ClassTypeInHPackage;
  }

  public a a(String paramString) {
    a a = (a) this.a.get(paramString);
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
