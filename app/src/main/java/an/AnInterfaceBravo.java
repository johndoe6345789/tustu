package an;

import am.AmInterfaceDelta;
import bH.D;
import java.io.IOException;

public class AnInterfaceBravo extends a {
  double AmInterfaceDelta;
  
  double e;
  
  b(AmInterfaceDelta paramd, am.b paramb) {
    super(paramd, paramb);
    if (paramb == null)
      throw new IOException("CCBLOCK Cannot be null for Linear Convertion"); 
    double[] arrayOfDouble = paramb.h();
    if (arrayOfDouble.length > 0) {
      this.e = arrayOfDouble[0];
    } else {
      D.b("LinearConversion no shift, using default 0.0");
      this.e = 0.0D;
    } 
    if (arrayOfDouble.length > 1) {
      this.AmInterfaceDelta = arrayOfDouble[1];
    } else {
      D.b("LinearConversion no vals, using defaul 1.0");
      this.AmInterfaceDelta = 1.0D;
    } 
  }
  
  public double a(byte[] paramArrayOfbyte) {
    double AmInterfaceDelta = b(paramArrayOfbyte);
    return AmInterfaceDelta * this.AmInterfaceDelta + this.e;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/an/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */