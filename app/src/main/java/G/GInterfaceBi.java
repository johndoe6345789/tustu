package G;

import java.io.Serializable;

public class GInterfaceBi extends bv implements Serializable {
  private String a = null;
  
  private int f = 16;
  
  private int g = 198;
  
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
  
  public int c() {
    return this.g;
  }
  
  public void b(int paramInt) {
    this.g = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */