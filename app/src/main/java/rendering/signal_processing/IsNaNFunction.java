package L;

import ax.AbstractInAxPackage;
import ax.AxInterfaceAb;
import ax.CloneableImplInAxPackage;

public class IsNaNFunction extends AbstractInAxPackage {
  AxInterfaceAb a;

  boolean b = false;

  IsNaNFunction(AxInterfaceAb paramab) {
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
