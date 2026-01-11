package L;

import M.KalmanFilterUsingMatrix;
import linear_algebra.Matrix;
import ax.CloneableImplInAxPackage;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;

public class SmoothFilteredFunction extends AbstractInAxPackage {
  private KalmanFilterUsingMatrix c;

  private AxInterfaceAb d;

  private AxInterfaceAb e;

  private double f = Double.NaN;

  double a = Double.NaN;

  double b = Double.NaN;

  public O(AxInterfaceAb paramab1, AxInterfaceAb paramab2) {
    this.e = paramab2;
    this.d = paramab1;
    double d1 = 50.0D;
    double d2 = 3.0D;
    double d3 = 5000.0D;
    this.c = KalmanFilterUsingMatrix.create(0.0D, 0.0D, d1, Math.pow(d2, 2.0D) / 2.0D, Math.pow(d3, 2.0D));
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    double d = this.e.b(paramS);
    if (Double.isNaN(this.a) || this.a != d) {
      if (Double.isNaN(this.f)) {
        this.f = this.d.b(paramS);
        this.c.i(new Matrix(new double[][] { { this.f }, { 0.0D }, { 0.0D }, { 0.0D } }));
      } else {
        this.c.a();
        double d1 = this.d.b(paramS);
        if (!Double.isNaN(d1) && !Double.isNaN(this.f) && !Double.isInfinite(d1) && !Double.isInfinite(this.f))
          this.c.a(new Matrix(new double[][] { { d1 }, { this.f } })); 
        this.f = d1;
      } 
      this.b = this.c.b().a(0, 0);
      this.a = d;
    } 
    return this.b;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "smoothFiltered( " + this.d.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/O.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */