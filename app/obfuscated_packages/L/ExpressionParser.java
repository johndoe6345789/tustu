package L;

import G.aI;
import G.aM;
import G.i;
import ax.ArrayListUsingPattern;
import ax.ExceptionInAxPackage;
import bH.X;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExpressionParser extends ArrayListUsingPattern {
  String a = "";
  
  aI b = null;
  
  static h c = null;
  
  private static String f = "array.";
  
  public k(aI paramaI) {
    this.b = paramaI;
    if (c == null) {
      c = new h(paramaI);
      ArrayListUsingPattern.a(c);
    } else {
      c.a(paramaI);
    } 
  }
  
  public void a(String paramString) {
    this.a = paramString;
    if (paramString.contains("timeNow") && paramString.indexOf("timeNow(") == -1)
      paramString = X.b(paramString, "timeNow", "timeNow()"); 
    try {
      paramString = c(paramString);
    } catch (FileNotFoundException fileNotFoundException) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, fileNotFoundException);
      throw new ExceptionInAxPackage(fileNotFoundException.getMessage());
    } 
    if (paramString.indexOf("tempCvt(") != -1) {
      boolean bool = (this.b.d("CELSIUS") != null) ? true : false;
      paramString = i.a(paramString, bool);
    } 
    while (paramString.contains(f)) {
      String str1 = paramString.substring(0, paramString.indexOf(f));
      int i = paramString.indexOf(f) + f.length();
      int j = a(paramString, i);
      String str2 = paramString.substring(i, j);
      aM aM = this.b.c(str2);
      if (aM == null)
        throw new ExceptionInAxPackage("unknown EcuParameter " + str2 + " in expresstion: " + this.a); 
      int m = l.a().a(aM);
      String str3 = paramString.substring(j);
      paramString = str1 + m + str3;
    } 
    super.a(paramString);
  }
  
  private String c(String paramString) {
    int i = paramString.indexOf("table(");
    if (i == -1)
      return paramString; 
    while (i != -1) {
      String str1 = paramString.substring(0, paramString.indexOf("table("));
      int j = paramString.indexOf("(", paramString.indexOf("table")) + 1;
      int m = paramString.indexOf(",", j);
      String str2 = paramString.substring(j, m).trim();
      int n = paramString.indexOf(")", m);
      String str3 = paramString.substring(m + 1, n).trim();
      String str4 = this.b.K().F();
      str3 = X.b(str3, "\"", "");
      String str5 = paramString.substring(n + 1);
      Long long_ = V.a().a(str4, str3);
      paramString = str1 + " table(" + str2 + ", " + long_ + " ) " + str5;
      i = paramString.indexOf("table(", i + 6);
    } 
    return paramString;
  }
  
  private static int a(String paramString, int paramInt) {
    byte b1 = 0;
    byte b2 = 0;
    int i;
    for (i = paramInt; i < paramString.length() && (!b1 || b1 != b2); i++) {
      if (paramString.charAt(i) == '(')
        b1++; 
      if (paramString.charAt(i) == ')')
        b2++; 
      if (paramString.charAt(i) == ',')
        break; 
    } 
    return i;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */