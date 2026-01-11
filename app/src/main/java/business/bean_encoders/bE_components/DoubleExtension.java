package bE;

import java.awt.geom.Point2D;

public class DoubleExtension extends Point2D.Double implements q {
  double a = Double.NaN;
  
  public DoubleExtension(double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramDouble1, paramDouble2);
    this.a = paramDouble3;
  }
  
  public double a() {
    return this.a;
  }
  
  public boolean b() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bE/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */