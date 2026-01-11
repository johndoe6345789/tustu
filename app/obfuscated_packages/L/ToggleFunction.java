package L;

import ax.CloneableImplInAxPackage;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;

public class aa extends AbstractInAxPackage {
  AxInterfaceAb a;
  
  AxInterfaceAb b = null;
  
  boolean c = false;
  
  boolean d = false;
  
  double e = 0.0D;
  
  protected aa(AxInterfaceAb paramab1, AxInterfaceAb paramab2) {
    this.a = paramab1;
    this.b = paramab2;
  }
  
  protected aa(AxInterfaceAb paramab) {
    this.a = paramab;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    if (!this.d) {
      if (this.b != null) {
        this.c = (this.b.b(paramS) != 0.0D);
      } else {
        this.c = false;
      } 
      this.e = this.a.b(paramS);
      this.d = true;
    } 
    double d = this.a.b(paramS);
    if (this.e == 0.0D && d != 0.0D)
      this.c = !this.c; 
    this.e = d;
    return this.c ? 1.0D : 0.0D;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return (this.b != null) ? ("toggle( " + this.a.toString() + ", " + this.b.toString() + " )") : ("toggle( " + this.a.toString() + " )");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */