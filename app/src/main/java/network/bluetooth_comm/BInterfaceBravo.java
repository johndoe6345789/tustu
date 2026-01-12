package B;

import A.AInterfaceIndia;
import A.ClassType;
import A.IO;
import java.util.ArrayList;
import java.util.List;

public class BInterfaceBravo implements AInterfaceIndia {
  private final List a = new ArrayList();

  private ClassType b = null;

  private static b c = null;

  private AInterfaceIndia d = null;

  private BInterfaceBravo() {
    ClassType q1 = new ClassType();
    q1.a(a.c);
    q1.b("Auto WiFi / Ethernet");
    q1.a(a.class);
    this.a.add(q1);
    this.b = q1;
    q1 = new ClassType();
    q1.a(o.b);
    q1.b("UDP WiFi / Ethernet");
    q1.a(o.class);
    this.a.add(q1);
    q1 = new ClassType();
    q1.a(l.b);
    q1.b("TCP/IP - WiFi / Ethernet");
    q1.a(l.class);
    this.a.add(q1);
  }

  public static b c() {
    if (c == null) c = new b();
    return c;
  }

  public List a() {
    return this.a;
  }

  public ClassType b() {
    return this.b;
  }

  public IO a(String paramString1, String paramString2) {
    if (this.d != null) {
      a a = new a();
      a.b(this.d.e());
      return a;
    }
    for (ClassType q1 : this.a) {
      if (q1.a().equals(paramString1)) return q1.c(paramString2);
    }
    return null;
  }

  public IO a(String paramString1, AInterfaceIndia parami, String paramString2) {
    if (this.d != null) {
      a a = new a();
      a.a(this.d, paramString2);
      return a;
    }
    for (ClassType q1 : this.a) {
      if (q1.a().equals(paramString1)) return q1.c(paramString2);
    }
    return null;
  }

  public AInterfaceIndia d() {
    return this.d;
  }

  public void a(AInterfaceIndia parami) {
    this.d = parami;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
