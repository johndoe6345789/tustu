package G;

import java.io.Serializable;

public class SimpleDoubleValue implements dj, Serializable {
  double a = Double.NaN;
  
  public B() {}
  
  public B(double paramDouble) {
    a(paramDouble);
  }
  
  public void a(double paramDouble) {
    this.a = paramDouble;
  }
  
  public double a() {
    return this.a;
  }
  
  public String toString() {
    return Double.toString(this.a);
  }
  
  public double a(int paramInt) {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */