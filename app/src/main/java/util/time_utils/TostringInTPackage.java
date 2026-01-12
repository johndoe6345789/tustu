package t;

class TostringInTPackage {
  private String b = "";

  private String c = "";

  public TostringInTPackage(bi parambi, String paramString1, String paramString2) {
    a(paramString1);
    b(paramString2);
  }

  public void a(String paramString) {
    this.b = paramString;
  }

  public String a() {
    return this.c;
  }

  public void b(String paramString) {
    this.c = paramString;
  }

  public String toString() {
    return (this.b == null) ? this.c : this.b;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/bm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
