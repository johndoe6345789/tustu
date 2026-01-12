package G;

import java.io.Serializable;

public class SerializableImplInGPackage extends Q implements Serializable {
  private String a = null;

  private String b = null;

  private dj c = new B(0.0D);

  private int d = 1;

  private String e = null;

  private String f = null;

  private boolean g = true;

  public String a() {
    return this.a;
  }

  public void a(String paramString) {
    this.a = paramString;
  }

  public String b() {
    return this.b;
  }

  public double c() {
    return this.c.a();
  }

  public void a(dj paramdj) {
    this.c = paramdj;
  }

  public int d() {
    return this.d;
  }

  public void a(int paramInt) {
    this.d = paramInt;
  }

  public void b(String paramString) {
    if (paramString.equals("=")) {
      this.d = 1;
    } else if (paramString.equals(">")) {
      this.d = 2;
    } else if (paramString.equals("<")) {
      this.d = 4;
    } else if (paramString.equals("&")) {
      this.d = 32;
    } else if (paramString.equals("|")) {
      this.d = 64;
    } else if (paramString.equals("<=")) {
      this.d = 8;
    } else if (paramString.equals(">=")) {
      this.d = 16;
    } else if (paramString.equals("custom")) {
      this.d = 128;
    }
  }

  public static boolean c(String paramString) {
    return (paramString.equals("std_xAxisMin")
        || paramString.equals("std_xAxisMax")
        || paramString.equals("std_yAxisMin")
        || paramString.equals("std_yAxisMax")
        || paramString.equals("std_DeadLambda")
        || paramString.equals("std_Expression")
        || paramString.equals("std_Custom"));
  }

  public String e() {
    return this.e;
  }

  public void d(String paramString) {
    this.e = paramString;
  }

  public String f() {
    return this.f;
  }

  public void e(String paramString) {
    this.f = paramString;
  }

  public boolean g() {
    return this.g;
  }

  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
