package G;

import java.io.Serializable;

public class w implements Serializable {
  private int a = Integer.MAX_VALUE;
  
  private int b = 0;
  
  public String toString() {
    return "dr: " + a() + ":" + b();
  }
  
  public int a() {
    return this.a;
  }
  
  public void a(int paramInt) {
    this.a = paramInt;
  }
  
  public int b() {
    return this.b;
  }
  
  public void b(int paramInt) {
    this.b = paramInt;
  }
  
  public int c() {
    return this.b - this.a + 1;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof w) {
      w w1 = (w)paramObject;
      return (w1.a() == a() && w1.b() == b());
    } 
    return super.equals(paramObject);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */