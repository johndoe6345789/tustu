package ak;

import W.k;
import java.util.Arrays;

class AkComponentAj implements k {
  private int[] b;
  
  private String[] c;
  
  public AkComponentAj(aa paramaa, double[] paramArrayOfdouble, String[] paramArrayOfString) {
    this.b = new int[paramArrayOfdouble.length];
    this.c = new String[paramArrayOfdouble.length];
    for (byte b = 0; b < paramArrayOfdouble.length; b++) {
      this.b[b] = (int)paramArrayOfdouble[b];
      this.c[b] = paramArrayOfString[b];
    } 
  }
  
  public String a(float paramFloat) {
    return this.c[Arrays.binarySearch(this.b, (int)paramFloat)];
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */