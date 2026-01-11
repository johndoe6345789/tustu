package L;

import ax.CloneableImplInAxPackage;
import ax.ab;
import ax.ac;

public class IsNaNFunction extends ac {
  ab a;
  
  boolean b = false;
  
  C(ab paramab) {
    this.a = paramab;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    return Double.isNaN(this.a.b(paramS)) ? 1.0D : 0.0D;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "isNaN( " + this.a.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */