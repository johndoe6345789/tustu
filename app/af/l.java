package af;

public class l {
  private int a;
  
  private int b = 65535;
  
  private int c = 0;
  
  public l(int paramInt) {
    this.a = paramInt;
  }
  
  public void a(int paramInt) {
    paramInt &= 0xFFFF;
    int i = paramInt / 1024 * 1024;
    int j = (paramInt + 1024) / 1024 * 1024;
    if (i < this.b)
      this.b = i; 
    if (j > this.c)
      this.c = j; 
  }
  
  public int a() {
    return this.a;
  }
  
  public int b() {
    return this.b;
  }
  
  public int c() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */