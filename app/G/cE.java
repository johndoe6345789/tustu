package G;

import V.g;
import V.i;
import V.j;
import bH.D;
import bH.I;
import bH.X;

public class cE {
  public static void a(R paramR, aM paramaM, String paramString) {
    if (paramString != null && paramString.indexOf("\"") != -1) {
      try {
        if (paramaM.C())
          paramR.a(paramaM.aL(), paramString); 
      } catch (g g) {
        D.b("Attempt to set Parameter value, but not valid for current firmware: " + g.getMessage());
      } catch (Exception exception) {
        throw new i("Error setting value: " + paramaM.aL() + " to value: " + paramString);
      } 
    } else if (paramaM != null && paramaM.i().equals("string")) {
      try {
        paramR.a(paramaM.aL(), paramString);
      } catch (g g) {
        D.b("Failed to set value for " + paramaM.aL() + " value is not valid for current configuration: " + g.getMessage());
      } 
    } else if (paramaM != null && paramString != null) {
      int i = paramaM.a();
      int j = paramaM.m();
      double[][] arrayOfDouble = new double[i][j];
      try {
        if (paramaM != null && paramaM.C() && !paramaM.i().equals("string")) {
          try {
            arrayOfDouble = X.a(arrayOfDouble, paramString);
          } catch (Exception exception) {
            if (!paramaM.aL().startsWith("UNALLOCATED_SPACE"))
              throw new i("Invalid table data in Constant: " + paramaM.aL() + ", not loading values."); 
          } 
          A a = paramaM.c();
          boolean bool = false;
          if (paramaM.i().equals("array") && arrayOfDouble.length > 0 && a.b() > 0 && (arrayOfDouble.length != a.b() || (arrayOfDouble[0]).length != a.a()))
            if (paramaM.P()) {
              bool = true;
              D.d("Unallocated memory changed, skip loading filler Constants.");
            } else if (paramaM.D()) {
              D.b(paramaM.aL() + " array size does not match the currently loaded configuration,\n\trescaled values to match configuration.");
              arrayOfDouble = I.a(arrayOfDouble, a.b(), a.a());
            } else {
              D.b(paramaM.aL() + " array size does not match the currently loaded configuration,\n\tnoSizeMutation set for parameter values transfered to new array size where possible.");
              arrayOfDouble = I.b(arrayOfDouble, a.b(), a.a());
            }  
          if (!bool)
            paramR.a(paramaM.aL(), arrayOfDouble); 
        } 
      } catch (g g) {
        D.b("Failed to set value for " + paramaM.aL() + " value is not valid for current configuration: " + g.getMessage());
      } catch (j j1) {
        boolean bool1 = false;
        boolean bool2 = false;
        try {
          for (byte b = 0; b < arrayOfDouble.length; b++) {
            for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
              if (arrayOfDouble[b][b1] > paramaM.s()) {
                if (!bool1) {
                  if (bM.i(paramR, paramaM.aL()))
                    D.b(paramaM.aL() + " row:" + b + ", col:" + b1 + ", One or more value higher than maximum: " + arrayOfDouble[b][b1] + ", Set to the maximum value: " + paramaM.s()); 
                  bool1 = true;
                } 
                arrayOfDouble[b][b1] = paramaM.s();
              } else if (arrayOfDouble[b][b1] < paramaM.a(b)) {
                if (!bool2) {
                  D.b(paramaM.aL() + " row:" + b + ", col:" + b1 + ", One or more value below minimum: " + arrayOfDouble[b][b1] + ", Set to the minimum value: " + paramaM.a(b));
                  bool2 = true;
                } 
                arrayOfDouble[b][b1] = paramaM.a(b);
              } 
            } 
          } 
          paramR.a(paramaM.aL(), arrayOfDouble);
        } catch (Exception exception) {
          D.b("Failed to set value for " + paramaM.aL() + " value is not valid for current configuration: " + exception.getMessage());
        } 
      } 
    } else {
      D.c("A value was null for " + paramaM.aL() + "??? This shouldn't happen.");
    } 
  }
  
  public static String a(R paramR, aM paramaM) {
    try {
      if (paramaM.i().equals("bits"))
        return paramaM.f(paramR.p()); 
      if (paramaM.i().equals("string"))
        return paramaM.d(paramR.p()); 
      if (paramaM.i().equals("scalar") || paramaM.i().equals(ca.e) || paramaM.i().equals(ca.d)) {
        double d = paramaM.j(paramR.p());
        d = Math.round(d * 1.0E7D) / 1.0E7D;
        return d + "";
      } 
      if (paramaM.i().equals("array")) {
        String[][] arrayOfString = new String[paramaM.a()][paramaM.m()];
        double[][] arrayOfDouble = paramaM.i(paramR.p());
        for (byte b = 0; b < arrayOfDouble.length; b++) {
          for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
            double d = arrayOfDouble[b][b1];
            d = Math.round(d * 1.0E7D) / 1.0E7D;
            arrayOfString[b][b1] = "" + d;
          } 
        } 
        return X.a(arrayOfString);
      } 
    } catch (g g) {
      D.a(g.getLocalizedMessage());
    } 
    return null;
  }
  
  public static String a(R paramR) {
    StringBuilder stringBuilder = new StringBuilder();
    for (aM aM : paramR.l()) {
      if (aM instanceof ca)
        stringBuilder.append(aM.aL()).append("=").append(a(paramR, aM)).append("~"); 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */