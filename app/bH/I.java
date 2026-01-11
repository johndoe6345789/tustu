package bH;

public class I {
  public static double a(double paramDouble) {
    double d = paramDouble * 100000.0D;
    if (d <= 0.0D)
      return 0.0D; 
    int i = (int)Math.log10(d);
    String str = (d + "").substring(0, 1);
    int j = Integer.parseInt(str) + 1;
    j *= (int)Math.pow(10.0D, i);
    return j / 100000.0D;
  }
  
  public static boolean a(String paramString) {
    if (paramString == null)
      return false; 
    if (paramString.startsWith(".") || paramString.endsWith("."))
      paramString = "0" + paramString + "0"; 
    if (paramString.startsWith("0x") || paramString.endsWith("h")) {
      paramString = X.b(paramString, "0x", "");
      paramString = X.b(paramString, "h", "");
      try {
        int i = Integer.parseInt(paramString, 16);
        return true;
      } catch (Exception exception) {
        return false;
      } 
    } 
    try {
      double d = Double.parseDouble(paramString);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public static double b(String paramString) {
    if (paramString.startsWith("0x") || paramString.endsWith("h")) {
      paramString = X.b(paramString, "0x", "");
      paramString = X.b(paramString, "h", "");
      int i = Integer.parseInt(paramString, 16);
      return i;
    } 
    if (paramString.startsWith("0b")) {
      paramString = X.b(paramString, "b", "");
      int i = Integer.parseInt(paramString, 2);
      return i;
    } 
    return Double.parseDouble(paramString);
  }
  
  public static double[][] a(double[][] paramArrayOfdouble, int paramInt1, int paramInt2) {
    double[][] arrayOfDouble = new double[paramInt1][paramInt2];
    if (paramInt2 == 1 && (paramArrayOfdouble[0]).length == 1) {
      for (byte b = 0; b < arrayOfDouble.length; b++) {
        double d = b / (arrayOfDouble.length - 1) * (paramArrayOfdouble.length - 1);
        arrayOfDouble[b][0] = a(paramArrayOfdouble, d, 0.0D);
      } 
    } else if (paramInt1 == 1 && paramArrayOfdouble.length == 1) {
      for (byte b = 0; b < (arrayOfDouble[0]).length; b++) {
        double d = b / ((arrayOfDouble[0]).length - 1) * ((paramArrayOfdouble[0]).length - 1);
        arrayOfDouble[0][b] = a(paramArrayOfdouble, 0.0D, d);
      } 
    } else {
      for (byte b = 0; b < arrayOfDouble.length; b++) {
        double d = b / (arrayOfDouble.length - 1) * (paramArrayOfdouble.length - 1);
        for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
          double d1 = b1 / ((arrayOfDouble[0]).length - 1) * ((paramArrayOfdouble[0]).length - 1);
          arrayOfDouble[b][b1] = a(paramArrayOfdouble, d, d1);
        } 
      } 
    } 
    return arrayOfDouble;
  }
  
  public static double a(double[][] paramArrayOfdouble, double paramDouble1, double paramDouble2) {
    int i = (int)paramDouble1;
    int j = (int)paramDouble2;
    int k = (i < paramArrayOfdouble.length - 1) ? (i + 1) : i;
    int m = (j < (paramArrayOfdouble[0]).length - 1) ? (j + 1) : j;
    double d1 = paramDouble1 - i;
    double d2 = paramDouble2 - j;
    null = 0.0D;
    return paramArrayOfdouble[i][j] * (1.0D - d2) * (1.0D - d1) + paramArrayOfdouble[i][m] * d2 * (1.0D - d1) + paramArrayOfdouble[k][j] * (1.0D - d2) * d1 + paramArrayOfdouble[k][m] * d2 * d1;
  }
  
  public static double[][] b(double[][] paramArrayOfdouble, int paramInt1, int paramInt2) {
    double[][] arrayOfDouble = new double[paramInt1][paramInt2];
    for (byte b = 0; b < arrayOfDouble.length && b < paramArrayOfdouble.length; b++) {
      for (byte b1 = 0; b1 < (arrayOfDouble[0]).length && b1 < (paramArrayOfdouble[0]).length; b1++)
        arrayOfDouble[b][b1] = paramArrayOfdouble[b][b1]; 
    } 
    return arrayOfDouble;
  }
  
  public static Double a(Object paramObject) {
    if (paramObject instanceof String)
      try {
        return Double.valueOf((String)paramObject);
      } catch (Exception exception) {
        return null;
      }  
    return (Double)paramObject;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */