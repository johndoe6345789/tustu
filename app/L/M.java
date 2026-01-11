package L;

import ax.S;
import ax.ab;
import ax.ac;

public class M extends ac {
  ab a;
  
  ab b;
  
  ab c;
  
  double d = Double.NaN;
  
  double e = Double.NaN;
  
  double f = Double.NaN;
  
  protected M(ab paramab1, ab paramab2, ab paramab3) {
    this.a = paramab2;
    this.b = paramab1;
    this.c = paramab3;
  }
  
  public double a(S paramS) {
    double d1 = this.a.b(paramS);
    if (Double.isNaN(this.d) || this.d != d1) {
      this.d = d1;
      a();
    } 
    double d2 = this.e + this.f * Math.pow(this.b.b(paramS), 2.5D);
    double d3 = d2 * this.c.b(paramS) / 1000.0D * this.b.b(paramS) / 375.0D;
    return Double.isNaN(d3) ? 0.0D : d3;
  }
  
  private void a() {
    this.e = 0.034667D * (this.d - 35.0D) * (this.d - 45.0D) + -0.063333D * (this.d - 20.0D) * (this.d - 45.0D) + 0.032D * (this.d - 20.0D) * (this.d - 35.0D);
    this.f = 7.704E-7D * (this.d - 35.0D) * (this.d - 45.0D) + -8.33333E-7D * (this.d - 20.0D) * (this.d - 45.0D) + 3.148E-7D * (this.d - 20.0D) * (this.d - 35.0D);
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "rollingDragHp( " + this.b.toString() + " ," + this.a.toString() + ", " + this.c.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */