package L;

import ax.CloneableImplInAxPackage;
import ax.ab;
import ax.ac;
import java.util.ArrayList;
import java.util.List;

public class LastValueWithTrigger extends ac {
  ab a;
  
  ab b;
  
  ab c = null;
  
  int d = Integer.MIN_VALUE;
  
  List e = new ArrayList();
  
  double f = Double.NaN;
  
  protected F(ab paramab1, ab paramab2) {
    this.a = paramab2;
    this.b = paramab1;
    this.d = 1;
  }
  
  protected F(ab paramab1, ab paramab2, ab paramab3) {
    this.a = paramab2;
    this.b = paramab1;
    this.c = paramab3;
  }
  
  public synchronized double a(CloneableImplInAxPackage paramS) {
    double d = this.a.b(paramS);
    int i = c(paramS);
    if (Double.isNaN(this.f) || this.f != d) {
      this.e.add(0, Double.valueOf(this.b.b(paramS)));
      while (this.e.size() > i + 2)
        this.e.remove(this.e.size() - 1); 
      this.f = d;
    } 
    return (this.e.size() > i) ? ((Double)this.e.get(i)).doubleValue() : Double.NaN;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  private int c(CloneableImplInAxPackage paramS) {
    if (this.d > Integer.MIN_VALUE)
      return this.d; 
    if (this.c != null) {
      this.d = (int)this.c.b(paramS);
      return this.d;
    } 
    return 1;
  }
  
  public String toString() {
    return (this.c != null) ? ("lastValue( " + this.b.toString() + ", " + this.c.toString() + " )") : ("lastValue( " + this.b.toString() + " )");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */