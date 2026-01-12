package U;

import S.SInterfaceGolf;
import S.SInterfaceJuliet;
import W.WInterfaceAp;

public class UInterfaceAlpha implements SInterfaceGolf {
  public static String a = "Data log";

  public static String b = "Stop Data log";

  private WInterfaceAp e = null;

  SInterfaceJuliet c = null;

  SInterfaceJuliet d = null;

  public S.a a(String paramString1, String paramString2) {
    if (paramString2.equals(a)) {
      if (this.c != null) return (S.a) this.c;
      this.c = new SInterfaceJuliet();
      this.c.SInterfaceGolf(paramString2);
      this.c.e("0");
      this.c.f("0");
      if (this.e != null) this.c.h(paramString1);
      return (S.a) this.c;
    }
    if (paramString2.equals(b)) {
      if (this.d != null) return (S.a) this.d;
      this.d = new SInterfaceJuliet();
      this.d.SInterfaceGolf(paramString2);
      this.d.e("0");
      this.d.f("0");
      if (this.e != null) this.d.h(paramString1);
      return (S.a) this.d;
    }
    return null;
  }

  public void a(WInterfaceAp paramap) {
    this.e = paramap;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/U/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
