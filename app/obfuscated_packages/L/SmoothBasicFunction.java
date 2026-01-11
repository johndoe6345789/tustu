package L;

import ax.CloneableImplInAxPackage;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;

public class SmoothBasicFunction extends AbstractInAxPackage {
  private AxInterfaceAb a;
  
  private AxInterfaceAb b;
  
  private double c = Double.NaN;
  
  public P(AxInterfaceAb paramab1, AxInterfaceAb paramab2) {
    this.a = paramab2;
    this.b = paramab1;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    if (Double.isNaN(this.c)) {
      this.c = this.b.b(paramS);
    } else {
      this.c = (this.c * (this.a.b(paramS) - 1.0D) + this.b.b(paramS)) / this.a.b(paramS);
    } 
    return this.c;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
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