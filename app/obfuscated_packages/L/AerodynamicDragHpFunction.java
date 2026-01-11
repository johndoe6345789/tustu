package L;

import ax.CloneableImplInAxPackage;
import ax.ab;
import ax.ac;

public class AerodynamicDragHpFunction extends ac {
  ab a;
  
  ab b;
  
  ab c;
  
  ab d;
  
  protected c(ab paramab1, ab paramab2, ab paramab3, ab paramab4) {
    this.b = paramab1;
    this.a = paramab2;
    this.c = paramab3;
    this.d = paramab4;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    double d = this.a.b(paramS) * Math.pow(this.b.b(paramS), 3.0D) * this.c.b(paramS) * this.d.b(paramS) / 2.0D;
    return d / 745.7D;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "aerodynamicDragHp( " + this.b.toString() + " ," + this.a.toString() + ", " + this.c.toString() + ", " + this.d.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */