package ao;

class eI implements Runnable {
  private boolean c = true;
  
  private double d = 0.0D;
  
  boolean a = false;
  
  eI(eC parameC) {}
  
  public void run() {
    a(true);
    if (this.a) {
      this.b.c.a(0.0D);
      this.b.c.b((this.b.d != null) ? this.b.d.d() : 0.0D);
      this.b.c.c(0.0D);
      this.b.c.d((this.b.d != null) ? this.b.d.d() : 0.0D);
    } 
    this.b.b.a(a());
  }
  
  public void a(boolean paramBoolean) {
    this.c = paramBoolean;
  }
  
  public double a() {
    return this.d;
  }
  
  public void a(double paramDouble) {
    this.d = paramDouble;
    if (paramDouble < 0.2D) {
      this.a = false;
    } else if (paramDouble == 1.0D) {
      this.a = true;
    } 
  }
  
  public boolean b() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */