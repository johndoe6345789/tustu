package aZ;

class m {
  private int b = -1;
  
  private int c = -1;
  
  private int d = -1;
  
  private int e = 0;
  
  private int f = 0;
  
  private String g = "";
  
  private int h = 0;
  
  m(j paramj) {}
  
  public void a(int paramInt) {
    this.b = paramInt & 0x3FF;
    this.e = (paramInt & 0xFFF) >>> 12;
    d(paramInt >>> 10 & 0xFFFC);
  }
  
  public int a() {
    return this.c;
  }
  
  public void b(int paramInt) {
    this.c = paramInt;
  }
  
  public int b() {
    return this.d;
  }
  
  public void c(int paramInt) {
    this.d = paramInt;
  }
  
  public int c() {
    return this.f;
  }
  
  public void d(int paramInt) {
    this.f = paramInt;
  }
  
  public int d() {
    return this.h;
  }
  
  public void e(int paramInt) {
    this.h = paramInt;
  }
  
  public String e() {
    return this.g;
  }
  
  public void a(String paramString) {
    this.g = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aZ/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */