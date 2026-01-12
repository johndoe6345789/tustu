package business.bit_array_utils;

import G.GInterfaceAi;
import G.R;
import G.i;
import V.ExceptionPrintstacktrace;

public class p {
  public static String a = "+-/=&<>*^!%, [{()}]|\n\t";

  public static boolean a(String paramString, R paramR) {
    if (paramString == null || paramString.trim().length() == 0) return true;
    try {
      double d = i.a((GInterfaceAi) paramR, paramString);
      return (Double.isNaN(d) || d != 0.0D);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionPrintstacktrace(
          "Unable to evaluate condition:'"
              + paramString
              + "'\n"
              + exception.getMessage()
              + " \nCheck Log for more detail.");
    }
  }

  public static double b(String paramString, R paramR) {
    if (paramString == null || paramString.trim().length() == 0) return 0.0D;
    try {
      return i.a((GInterfaceAi) paramR, paramString);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionPrintstacktrace(
          "Unable to evaluate condition:'"
              + paramString
              + "'\n"
              + exception.getMessage()
              + " \nCheck Log for more detail.");
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
