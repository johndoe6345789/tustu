package g;

import W.j;
import W.n;
import bH.F;
import h.g;

public class d extends F {
  public static String a(n paramn, String paramString, int paramInt) {
    for (int i = paramString.indexOf("|"); i != -1; i = paramString.indexOf("|")) {
      boolean bool = (i < paramString.indexOf(".inc")) ? true : false;
      String str1 = null;
      String str2 = null;
      String str3 = null;
      String str4 = null;
      if (bool) {
        str1 = paramString.substring(i + 1, paramString.indexOf("]", i));
        str1 = k.a(str1, "]", "");
        str2 = paramString.substring(paramString.lastIndexOf("[", i), i);
        str2 = k.a(str2, "[", "");
        str3 = paramString.substring(0, paramString.indexOf(str2 + "|") - 1);
        str4 = paramString.substring(paramString.indexOf(str1) + str1.length() + 1, paramString.length());
      } else {
        str1 = paramString.substring(0, i);
        str2 = paramString.substring(i + 1);
        str1 = k.a(str1, "[", "");
        str2 = k.a(str2, "]", "");
        str3 = paramString.substring(0, paramString.indexOf(str1) - 1);
        str4 = paramString.substring(paramString.indexOf(str2) + str2.length() + 1, paramString.length());
      } 
      paramInt = a(str1, paramInt, paramn);
      str1 = b(str1);
      F f = b(".", str1);
      if (paramn != null) {
        str2 = g.a().a(str2);
        j j = paramn.a(str2);
        paramString = str3 + f.a(Float.toString(j.d(paramInt))) + str4;
      } else {
        paramString = str3 + f.a(str2) + str4;
      } 
    } 
    return paramString;
  }
  
  private static int a(String paramString, int paramInt, n paramn) {
    int i = 0;
    if (paramString.indexOf("+") != -1 || paramString.indexOf("-") != -1) {
      boolean bool = (paramString.indexOf("+") != -1) ? true : false;
      int j = bool ? paramString.indexOf("+") : paramString.indexOf("-");
      String str = paramString.substring(j + 1, paramString.length());
      paramString = k.a(paramString, paramString.substring(j, paramString.length()), "");
      i = Integer.parseInt(str);
      paramInt = bool ? (paramInt + i) : (paramInt - i);
      if (paramInt < 0)
        paramInt = 0; 
      if (paramInt > paramn.d() - 1)
        paramInt = paramn.d() - 1; 
    } 
    return paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */