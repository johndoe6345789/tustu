package k;

import ax.S;
import ax.ab;
import ax.ac;

public class f extends ac {
  private ab e;
  
  double a = Double.NaN;
  
  double b = Double.NaN;
  
  int c = 0;
  
  double d = 0.0D;
  
  public f(ab paramab) {
    this.e = paramab;
  }
  
  public double a(S paramS) {
    double d = this.e.b(paramS);
    if (Double.isNaN(this.a)) {
      this.b = d;
      this.c = 1;
      this.a = d;
    } else if (d != this.b) {
      this.d = (d - this.b) / this.c;
      this.a = d;
      this.b = d;
      this.c = 1;
    } else {
      this.a = d + this.c * this.d;
      this.c++;
    } 
    return this.a;
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/k/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */