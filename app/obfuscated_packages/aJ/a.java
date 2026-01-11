package aJ;

public class a {
  private int a = -1;
  
  public int a() {
    return this.a >> 16;
  }
  
  public int b() {
    return this.a >> 8 & 0x3F;
  }
  
  public int c() {
    return this.a & 0xFF;
  }
  
  public void a(int paramInt) {
    this.a = paramInt;
  }
  
  public String toString() {
    return "Head: " + a() + ", sector: " + b() + ", cylinder: " + c();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aJ/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */