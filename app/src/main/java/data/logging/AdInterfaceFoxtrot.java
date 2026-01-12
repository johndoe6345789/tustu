package aD;

public class AdInterfaceFoxtrot {
  private String a;

  private int b;

  private int c;

  private int d;

  private int e;

  private int f;

  private int g;

  public AdInterfaceFoxtrot() {
    this("", 115200, 0, 0, 8, 1, 0);
  }

  public AdInterfaceFoxtrot(
      String paramString,
      int paramInt1,
      int paramInt2,
      int paramInt3,
      int paramInt4,
      int paramInt5,
      int paramInt6) {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
    this.f = paramInt5;
    this.g = paramInt6;
  }

  public void a(String paramString) {
    try {
      this.b = Integer.parseInt(paramString);
    } catch (Exception exception) {
      this.b = 9600;
    }
  }

  public int a() {
    return this.b;
  }

  public int b() {
    return this.c;
  }

  public int c() {
    return this.d;
  }

  public int d() {
    return this.e;
  }

  public int e() {
    return this.f;
  }

  public int f() {
    return this.g;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aD/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
