package business.binding_generators.bG_components;

class BgInterfaceOscar {
  private double b = Double.NaN;
  
  private double c = Double.NaN;
  
  private double d = Double.NaN;
  
  private double e = Double.NaN;
  
  private int f;
  
  o(m paramm, int paramInt) {
    this.f = paramInt;
  }
  
  public double a() {
    return this.b;
  }
  
  public void a(double paramDouble) {
    this.b = paramDouble;
  }
  
  public void b(double paramDouble) {
    this.c = paramDouble;
  }
  
  public void c(double paramDouble) {
    this.d = paramDouble;
  }
  
  public void d(double paramDouble) {
    this.e = paramDouble;
  }
  
  public int b() {
    return this.f;
  }
  
  public boolean a(double paramDouble1, double paramDouble2) {
    return (paramDouble1 > this.b && paramDouble1 < this.c && paramDouble2 > this.d && paramDouble2 < (360.0D + this.e) % 360.0D);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */