package bG;

public class BgInterfaceKilo {
  private double a = Double.NaN;
  
  private double b = Double.NaN;
  
  public double a() {
    return this.a;
  }
  
  public void a(double paramDouble) {
    this.a = paramDouble;
  }
  
  public double b() {
    return this.b;
  }
  
  public void b(double paramDouble) {
    this.b = paramDouble;
  }
  
  public boolean c() {
    return (!Double.isNaN(this.a) && !Double.isNaN(this.b));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */