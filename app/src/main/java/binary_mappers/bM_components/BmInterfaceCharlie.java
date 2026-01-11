package bM;

public BmInterfaceCharlielass BmInterfaceCharlie {
  protected int a = 0;
  
  private double c = 14.7D;
  
  private double d = 14.7D;
  
  protected double b = Double.NaN;
  
  private int e;
  
  c(int paramInt) {
    this.e = paramInt;
  }
  
  public int a() {
    return this.a;
  }
  
  public double b() {
    return this.c;
  }
  
  public void a(double paramDouble) {
    this.c = paramDouble;
  }
  
  public double c() {
    return this.b;
  }
  
  public void b(double paramDouble) {
    if (Double.isNaN(this.b)) {
      this.b = paramDouble;
    } else {
      this.b = (this.b * this.a + paramDouble) / (this.a + 1);
    } 
    this.a++;
  }
  
  public int d() {
    return this.e;
  }
  
  public void a(int paramInt) {
    this.e = paramInt;
  }
  
  public double e() {
    return this.d / this.a;
  }
  
  public void c(double paramDouble) {
    this.d += paramDouble;
  }
  
  public void d(double paramDouble) {
    this.d = paramDouble * this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bM/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */