package L;

import ax.CloneableImplInAxPackage;
import ax.ab;
import ax.ac;

public class AccelHpFunction extends ac {
  ab a;
  
  ab b;
  
  ab c;
  
  ab d;
  
  protected a(ab paramab1, ab paramab2, ab paramab3, ab paramab4) {
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