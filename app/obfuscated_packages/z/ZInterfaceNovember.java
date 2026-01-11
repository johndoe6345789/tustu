package z;

public class ZInterfaceNovember {
  private String a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  public ZInterfaceNovember() {
    this("", 9600, 0, 0, 8, 1, 0);
  }
  
  public ZInterfaceNovember(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
    this.f = paramInt5;
    this.g = paramInt6;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public String a() {
    return this.a;
  }
  
  public void a(int paramInt) {
    this.b = paramInt;
  }
  
  public void b(String paramString) {
    try {
      this.b = Integer.parseInt(paramString);
    } catch (Exception exception) {
      this.b = 9600;
    } 
  }
  
  public int b() {
    return this.b;
  }
  
  public String c() {
    return Integer.toString(this.b);
  }
  
  public int d() {
    return this.c;
  }
  
  public int e() {
    return this.d;
  }
  
  public void b(int paramInt) {
    this.e = paramInt;
  }
  
  public int f() {
    return this.e;
  }
  
  public void c(int paramInt) {
    this.f = paramInt;
  }
  
  public int g() {
    return this.f;
  }
  
  public void d(int paramInt) {
    this.g = paramInt;
  }
  
  public int h() {
    return this.g;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */