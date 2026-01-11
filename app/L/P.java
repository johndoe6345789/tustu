package L;

import ax.S;
import ax.ab;
import ax.ac;

public class P extends ac {
  private ab a;
  
  private ab b;
  
  private double c = Double.NaN;
  
  public P(ab paramab1, ab paramab2) {
    this.a = paramab2;
    this.b = paramab1;
  }
  
  public double a(S paramS) {
    if (Double.isNaN(this.c)) {
      this.c = this.b.b(paramS);
    } else {
      this.c = (this.c * (this.a.b(paramS) - 1.0D) + this.b.b(paramS)) / this.a.b(paramS);
    } 
    return this.c;
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "smoothBasic( " + this.b.toString() + ", " + this.a.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */