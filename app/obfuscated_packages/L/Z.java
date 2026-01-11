package L;

import ax.S;
import ax.ab;
import ax.ac;

public class Z extends ac {
  private ab c;
  
  long a = -1L;
  
  double b = 0.0D;
  
  public Z(ab paramab) {
    this.c = paramab;
  }
  
  public double a(S paramS) {
    if (this.c.b(paramS) != 0.0D) {
      if (this.a < 0L)
        this.a = System.currentTimeMillis(); 
      this.b = (System.currentTimeMillis() - this.a) / 1000.0D;
    } else if (this.a > 0L) {
      this.a = -1L;
      this.b = 0.0D;
    } 
    return this.b;
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "timeTrue( " + this.c.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */