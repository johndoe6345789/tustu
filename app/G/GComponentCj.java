package G;

public class GComponentCj {
  private int a;
  
  private int b = -1;
  
  private int c = 0;
  
  private boolean d = false;
  
  public GComponentCj(int paramInt) {
    this.a = paramInt;
  }
  
  public int a() {
    return this.a;
  }
  
  public int b() {
    return this.b;
  }
  
  public void a(int paramInt) {
    this.b = paramInt;
  }
  
  public int c() {
    return this.c;
  }
  
  public void b(int paramInt) {
    this.c = paramInt;
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    return (paramInt1 <= this.b + this.c && paramInt1 + paramInt2 > this.b);
  }
  
  public void b(int paramInt1, int paramInt2) {
    int i = Math.max(this.b + this.c, paramInt1 + paramInt2);
    this.b = Math.min(this.b, paramInt1);
    this.c = i - this.b;
  }
  
  public String toString() {
    return "page: " + this.a + ", offset: " + this.b + ", len: " + this.c;
  }
  
  public boolean d() {
    return this.d;
  }
  
  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */