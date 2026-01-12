package ai;

public class EqualsInAiPackage {
  private String a = "";

  private String b = "";

  public EqualsInAiPackage() {}

  public EqualsInAiPackage(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }

  public String a() {
    return this.a;
  }

  public void a(String paramString) {
    this.a = paramString;
  }

  public String b() {
    return this.b;
  }

  public void b(String paramString) {
    this.b = paramString;
  }

  public boolean equals(Object paramObject) {
    if (paramObject instanceof b) {
      b b1 = (b) paramObject;
      return (b1.a().equals(this.a) && b1.b().equals(this.b));
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ai/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
