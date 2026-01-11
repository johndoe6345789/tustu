package an;

import am.TostringInAmPackage;
import java.io.IOException;

public class AnInterfaceDelta extends a {
  double d;
  
  double e;
  
  double f;
  
  double g;
  
  double h;
  
  double i;
  
  AnInterfaceDelta(am.d paramd, TostringInAmPackage paramb) {
    super(paramd, paramb);
    if (paramb == null)
      throw new IOException("CCBLOCK Cannot be null for Rational Convertion"); 
    double[] arrayOfDouble = paramb.h();
    if (arrayOfDouble.length < 6)
      throw new IOException("CCBLOCK parameter count should be 6 for Rational Convertion"); 
    this.d = arrayOfDouble[0];
    this.e = arrayOfDouble[1];
    this.f = arrayOfDouble[2];
    this.g = arrayOfDouble[3];
    this.h = arrayOfDouble[4];
    this.i = arrayOfDouble[5];
  }
  
  public double a(byte[] paramArrayOfbyte) {
    double d1 = TostringInAmPackage(paramArrayOfbyte);
    return (this.d * d1 * d1 + this.e * d1 + this.f) / (this.g * d1 * d1 + this.h * d1 + this.i);
  }
  
  public double a(double paramDouble) {
    return (this.d * paramDouble * paramDouble + this.e * paramDouble + this.f) / (this.g * paramDouble * paramDouble + this.h * paramDouble + this.i);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/an/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */