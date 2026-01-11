package G;

import V.ExceptionPrintstacktrace;
import bH.I;
import bH.X;

public class GInterfaceDk {
  public static dj a(double paramDouble) {
    return new B(paramDouble);
  }
  
  public static dj a(aI paramaI, String paramString) {
    if (I.a(paramString)) {
      double d;
      if (paramString.startsWith("0x")) {
        d = X.ExceptionPrintstacktrace(paramString);
      } else {
        d = Double.parseDouble(paramString);
      } 
      try {
        return new B(d);
      } catch (NumberFormatException numberFormatException) {
        throw new ExceptionPrintstacktrace("Non-Numeric Value.");
      } 
    } 
    paramString = X.b(paramString, "{", "");
    paramString = X.b(paramString, "}", "");
    return new bR(paramaI, paramString);
  }
  
  public static dj a(cZ paramcZ, String paramString) {
    if (I.a(paramString)) {
      double d = Double.parseDouble(paramString);
      return new B(d);
    } 
    paramString = X.b(paramString, "{", "");
    paramString = X.b(paramString, "}", "");
    return (dj)(paramString.isEmpty() ? new B(Double.NaN) : new bR(paramcZ, paramString));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/dk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */