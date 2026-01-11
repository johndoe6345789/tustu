package G;

import java.io.Serializable;

public class ck implements Serializable {
  private int a;
  
  private int b;
  
  public ck(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public int a() {
    return this.a;
  }
  
  public int b() {
    return this.b;
  }
  
  public void a(int paramInt) {
    this.a = paramInt;
  }
  
  public void b(int paramInt) {
    this.b = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/ck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */