package bx;

public class BxInterfaceJuliet {
  private String a = "";
  
  private String b = "";
  
  private String c = "";
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public String a() {
    return this.a;
  }
  
  public void b(String paramString) {
    this.b = paramString;
  }
  
  public String b() {
    return this.b;
  }
  
  public void c(String paramString) {
    this.c = paramString;
  }
  
  public String c() {
    return this.c;
  }
  
  public j d() {
    j j1 = new j();
    j1.a(this.a);
    j1.b(this.b);
    j1.c(this.c);
    return j1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */