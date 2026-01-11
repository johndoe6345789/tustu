package L;

import G.GInterfaceDj;
import ax.CloneableImplInAxPackage;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;

public class AccumulateFunction extends AbstractInAxPackage implements GInterfaceDj {
  AxInterfaceAb a;
  
  AxInterfaceAb b;
  
  AxInterfaceAb c = null;
  
  double d = Double.NaN;
  
  double e = Double.NaN;
  
  protected AccumulateFunction(AxInterfaceAb paramab1, AxInterfaceAb paramab2) {
    this.a = paramab2;
    this.b = paramab1;
  }
  
  protected AccumulateFunction(AxInterfaceAb paramab1, AxInterfaceAb paramab2, AxInterfaceAb paramab3) {
    this.a = paramab2;
    this.b = paramab1;
    this.c = paramab3;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    double d = this.a.b(paramS);
    if (Double.isNaN(this.e) || this.e != d) {
      if (Double.isNaN(this.d)) {
        if (this.c == null || this.c.b(paramS) == 0.0D) {
          this.d = this.b.b(paramS);
        } else {
          this.d = this.c.b(paramS);
        } 
      } else {
        this.d += this.b.b(paramS);
      } 
      this.e = d;
    } 
    return this.d;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return (this.c == null) ? ("accumulate( " + this.b.toString() + " )") : ("accumulate( " + this.b.toString() + ", " + this.c.toString() + " )");
  }
  
  public double a() {
    return a(0);
  }
  
  public double a(int paramInt) {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */