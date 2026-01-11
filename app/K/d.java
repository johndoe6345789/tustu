package K;

import G.R;
import G.aM;

public class d {
  public static double a(double[][] paramArrayOfdouble1, double[][] paramArrayOfdouble2, double paramDouble) {
    double d1 = a(paramArrayOfdouble1, paramDouble);
    int i = (int)Math.floor(d1);
    double d2 = d1 - i;
    if (d2 == 0.0D)
      return paramArrayOfdouble2[i][0]; 
    int j = (int)Math.ceil(d1);
    return paramArrayOfdouble2[i][0] * (1.0D - d2) + paramArrayOfdouble2[j][0] * d2;
  }
  
  public static double a(double[][] paramArrayOfdouble, double paramDouble) {
    double d1 = -1.0D;
    for (byte b = 0; b < paramArrayOfdouble.length; b++) {
      double d2 = paramArrayOfdouble[b][0];
      if (b == 0 && d2 >= paramDouble) {
        d1 = b;
        break;
      } 
      if (b == paramArrayOfdouble.length - 1 && paramDouble >= d2) {
        d1 = b;
        break;
      } 
      if (d2 > paramDouble) {
        double d3 = paramArrayOfdouble[b - 1][0];
        d1 = (b - 1) + (paramDouble - d3) / (d2 - d3);
        break;
      } 
    } 
    return d1;
  }
  
  public static double[] a(R paramR, aM paramaM) {
    double[] arrayOfDouble = new double[paramaM.b()];
    double[][] arrayOfDouble1 = paramaM.i(paramR.p());
    for (byte b = 0; b < arrayOfDouble.length; b++)
      arrayOfDouble[b] = arrayOfDouble1[b][0]; 
    return arrayOfDouble;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */