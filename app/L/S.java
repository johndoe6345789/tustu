package L;

import ax.U;
import ax.ab;
import ax.ac;
import bH.F;
import java.io.FileNotFoundException;

public class S extends ac {
  ab a = null;
  
  ab b = null;
  
  String c = null;
  
  public S(ab paramab1, ab paramab2) {
    this.a = paramab2;
    this.b = paramab1;
  }
  
  public double a(ax.S paramS) {
    try {
      Long long_ = Long.valueOf((long)this.a.b(paramS));
      F f = V.a().a(long_);
      if (this.c == null)
        this.c = (f.d() != null) ? f.d().getName() : null; 
      double d = this.b.b(paramS);
      return f.a(d);
    } catch (FileNotFoundException fileNotFoundException) {
      throw new U("inc lookup failed: " + fileNotFoundException.getMessage());
    } 
  }
  
  public double b(ax.S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "table( " + this.b.toString() + ", \"" + this.c + "\" )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */