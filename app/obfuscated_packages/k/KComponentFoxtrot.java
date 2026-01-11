package k;

import ax.CloneableImplInAxPackage;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;

public class KComponentFoxtrot extends AbstractInAxPackage {
  private AxInterfaceAb e;
  
  double a = Double.NaN;
  
  double b = Double.NaN;
  
  int c = 0;
  
  double d = 0.0D;
  
  public KComponentFoxtrot(AxInterfaceAb paramab) {
    this.e = paramab;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
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
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/k/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */