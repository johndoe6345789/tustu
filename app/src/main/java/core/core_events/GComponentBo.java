package G;

public class GComponentBo extends bv {
  private String a = null;

  private int f = 22021;

  private String g = null;

  private String h = null;

  private boolean i = true;

  private bp j = null;

  private bp k = null;

  public String a() {
    return this.a;
  }

  public void a(String paramString) {
    this.a = paramString;
  }

  public int b() {
    return this.f;
  }

  public void a(int paramInt) {
    this.f = paramInt;
  }

  public String c() {
    return this.g;
  }

  public void b(String paramString) {
    this.g = paramString;
  }

  public String d() {
    return this.h;
  }

  public void c(String paramString) {
    this.h = paramString;
  }

  public bp f() {
    return this.j;
  }

  public bp g() {
    return this.k;
  }

  public void a(String paramString1, String paramString2) {
    this.j = new bp(this);
    this.j.b(paramString1);
    this.j.a(paramString2);
  }

  public void b(String paramString1, String paramString2) {
    this.k = new bp(this);
    this.k.b(paramString1);
    this.k.a(paramString2);
  }

  public boolean h() {
    return this.i;
  }

  public void a(boolean paramBoolean) {
    this.i = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
