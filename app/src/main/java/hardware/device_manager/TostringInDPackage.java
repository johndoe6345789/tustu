package d;

public class TostringInDPackage {
  private String a;

  private String b;

  public TostringInDPackage(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }

  public String a() {
    return this.a;
  }

  public String toString() {
    return this.b;
  }

  public boolean equals(Object paramObject) {
    return (paramObject instanceof String)
        ? ((String) paramObject).equals(this.a)
        : ((paramObject instanceof h)
            ? ((h) paramObject).a().equals(this.a)
            : super.equals(paramObject));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/d/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
