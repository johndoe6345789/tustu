package L;

import G.GInterfaceAi;
import G.Manager;
import V.ExceptionPrintstacktrace;
import ax.CloneableImplInAxPackage;
import ax.ExceptionInAxPackage;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;

public class ArrayLookupFunction extends AbstractInAxPackage {
  AxInterfaceAb a = null;
  
  AxInterfaceAb b;
  
  Manager c = null;
  
  GInterfaceAi d;
  
  public d(GInterfaceAi paramaI, AxInterfaceAb paramab1, AxInterfaceAb paramab2) {
    this.a = paramab2;
    this.b = paramab1;
    this.d = paramaI;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    c(paramS);
    try {
      double[][] arrayOfDouble = this.c.i(this.d.h());
      return a(arrayOfDouble, this.a.b(paramS));
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      throw new ExceptionInAxPackage("Unable to evaluate tableLookup: " + ExceptionPrintstacktrace.getLocalizedMessage());
    } 
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  private void c(CloneableImplInAxPackage paramS) {
    if (this.c == null) {
      this.c = l.a().a((int)this.b.b(paramS));
      if (this.c == null)
        throw new ExceptionInAxPackage("Array Parameter not found!"); 
      if (!this.c.i().equals("array"))
        throw new ExceptionInAxPackage("Array Parameter must be of type array!"); 
      if (this.c.m() != 1)
        throw new ExceptionInAxPackage("Array Parameter must be 1D array!"); 
    } 
  }
  
  public double a(double[][] paramArrayOfdouble, double paramDouble) {
    if (paramDouble > (paramArrayOfdouble.length - 1)) {
      paramDouble = (paramArrayOfdouble.length - 1);
    } else if (paramDouble < 0.0D) {
      paramDouble = 0.0D;
    } 
    int i = (int)paramDouble;
    int j = (int)Math.ceil(paramDouble);
    double d1 = paramDouble - i;
    return paramArrayOfdouble[i][0] + d1 * (paramArrayOfdouble[j][0] - paramArrayOfdouble[i][0]);
  }
  
  public String toString() {
    return "arrayLookup( " + this.b.toString() + " ," + this.a.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */