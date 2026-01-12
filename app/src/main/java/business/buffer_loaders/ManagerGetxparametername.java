package business.buffer_loaders;

import G.CloneableImpl;
import com.efiAnalytics.plugin.ecu.UiTable;

public class ManagerGetxparametername implements UiTable {
  private String a = null;

  private String b = null;

  private String c = null;

  private String d = null;

  private String e = null;

  private String f = null;

  public String getName() {
    return this.a;
  }

  public void a(String paramString) {
    this.a = paramString;
  }

  public String getXParameterName() {
    return this.b;
  }

  public void b(String paramString) {
    this.b = paramString;
  }

  public String getYParameterName() {
    return this.c;
  }

  public void c(String paramString) {
    this.c = paramString;
  }

  public String getZParameterName() {
    return this.d;
  }

  public void d(String paramString) {
    this.d = paramString;
  }

  public String getXOutputChannel() {
    return this.e;
  }

  public void e(String paramString) {
    this.e = paramString;
  }

  public String getYOutputChannel() {
    return this.f;
  }

  public void f(String paramString) {
    this.f = paramString;
  }

  public static q a(CloneableImpl parambe) {
    q q1 = new q();
    q1.a(parambe.aL());
    q1.e(parambe.d());
    q1.f(parambe.f());
    q1.b(parambe.a());
    q1.c(parambe.b());
    q1.d(parambe.c());
    return q1;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
