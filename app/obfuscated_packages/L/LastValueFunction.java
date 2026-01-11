package L;

import ax.CloneableImplInAxPackage;
import ax.ab;
import ax.ac;
import java.util.ArrayList;
import java.util.List;

public class LastValueFunction extends ac {
  ab a;
  
  ab b = null;
  
  int c = Integer.MIN_VALUE;
  
  List d = new ArrayList();
  
  double e = Double.NaN;
  
  int f = 1;
  
  protected K(ab paramab1, ab paramab2) {
    this.a = paramab1;
    this.b = paramab2;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    int i = c(paramS);
    if (i > this.f)
      this.f = i + 1; 
    double d = this.a.b(paramS);
    if (Double.isNaN(this.e) || this.e != d) {
      this.d.add(0, Double.valueOf(d));
      while (this.d.size() > this.f + 1)
        this.d.remove(this.d.size() - 1); 
      this.e = d;
    } 
    return (this.d.size() > i) ? ((Double)this.d.get(i)).doubleValue() : Double.NaN;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  private int c(CloneableImplInAxPackage paramS) {
    if (this.c > Integer.MIN_VALUE)
      return this.c; 
    if (this.b != null) {
      this.c = (int)this.b.b(paramS);
      return this.c;
    } 
    return 1;
  }
  
  public String toString() {
    return (this.b != null) ? ("lastValue( " + this.a.toString() + ", " + this.b.toString() + " )") : ("lastValue( " + this.a.toString() + " )");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */