package L;

import ax.S;
import ax.ab;
import ax.ac;

public class aa extends ac {
  ab a;
  
  ab b = null;
  
  boolean c = false;
  
  boolean d = false;
  
  double e = 0.0D;
  
  protected aa(ab paramab1, ab paramab2) {
    this.a = paramab1;
    this.b = paramab2;
  }
  
  protected aa(ab paramab) {
    this.a = paramab;
  }
  
  public double a(S paramS) {
    if (!this.d) {
      if (this.b != null) {
        this.c = (this.b.b(paramS) != 0.0D);
      } else {
        this.c = false;
      } 
      this.e = this.a.b(paramS);
      this.d = true;
    } 
    double d = this.a.b(paramS);
    if (this.e == 0.0D && d != 0.0D)
      this.c = !this.c; 
    this.e = d;
    return this.c ? 1.0D : 0.0D;
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return (this.b != null) ? ("toggle( " + this.a.toString() + ", " + this.b.toString() + " )") : ("toggle( " + this.a.toString() + " )");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */