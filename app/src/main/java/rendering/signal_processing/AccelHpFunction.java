package L;

import ax.CloneableImplInAxPackage;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;

public class AccelHpFunction extends AbstractInAxPackage {
  AxInterfaceAb a;
  
  AxInterfaceAb b;
  
  AxInterfaceAb c;
  
  AxInterfaceAb d;
  
  protected AccelHpFunction(AxInterfaceAb paramab1, AxInterfaceAb paramab2, AxInterfaceAb paramab3, AxInterfaceAb paramab4) {
    this.b = paramab1;
    this.a = paramab2;
    this.c = paramab3;
    this.d = paramab4;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    double d1 = this.c.b(paramS);
    double d2 = this.d.b(paramS) / 32.0D * this.a.b(paramS) * 1.46667D / d1 * this.b.b(paramS) * 1.46667D / 550.0D;
    return Double.isNaN(d2) ? 0.0D : d2;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "accelHp( " + this.b.toString() + " ," + this.a.toString() + ", " + this.c.toString() + ", " + this.d.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */