package G;

import V.ExceptionPrintstacktrace;
import bH.X;

public class da {
  private static da a = null;
  
  public static da a() {
    if (a == null)
      a = new da(); 
    return a;
  }
  
  public db a(cZ paramcZ, String paramString) {
    return a(null, paramcZ, paramString);
  }
  
  public db a(R paramR, String paramString) {
    return a(paramR, null, paramString);
  }
  
  private db a(R paramR, cZ paramcZ, String paramString) {
    if (paramString.trim().startsWith("{")) {
      paramString = X.b(paramString, "{", "");
      paramString = X.b(paramString, "}", "");
    } 
    String str = paramString.trim();
    if (str.indexOf("bitStringValue(") > -1) {
      d d;
      String str1 = X.i(paramString.substring(0, paramString.indexOf("bitStringValue(")));
      String str2 = paramString.substring(paramString.indexOf("bitStringValue("), paramString.lastIndexOf(")") + 1);
      String str3 = X.i(paramString.substring(paramString.lastIndexOf(")") + 1, paramString.length()));
      paramString = str2.substring("bitStringValue(".length());
      paramString = paramString.substring(0, paramString.lastIndexOf(")"));
      String[] arrayOfString = new String[2];
      try {
        arrayOfString[0] = paramString.substring(0, paramString.indexOf(",")).trim();
        arrayOfString[1] = paramString.substring(paramString.indexOf(",") + 1).trim();
      } catch (Exception exception) {
        throw new ExceptionPrintstacktrace("bitStringValue([bitConstantName], [expression]): Invalid Expression");
      } 
      aM aM = null;
      if (paramR != null) {
        aM = paramR.c(arrayOfString[0]);
        if (aM == null)
          throw new ExceptionPrintstacktrace("bitStringValue([bitConstantName], [expression]): Invalid bitConstantName: " + arrayOfString[0] + " not found"); 
        if (!aM.i().equals("bits"))
          throw new ExceptionPrintstacktrace("bitStringValue([bitConstantName], [expression]): Invalid bitConstantName: " + arrayOfString[0] + " is not paramClass bits"); 
      } 
      String str4 = X.b(arrayOfString[1], "{", "");
      str4 = X.b(str4, "}", "");
      if (paramR == null) {
        d = new d(paramcZ, arrayOfString[0], str4);
      } else {
        p p = new p(paramR.c());
        d = new d(p, arrayOfString[0], str4);
      } 
      if (!str1.trim().isEmpty())
        d.a(str1); 
      if (!str3.trim().isEmpty())
        d.b(str3); 
      return d;
    } 
    if (paramString.indexOf("$stringValue(") != -1) {
      cC cC;
      String str1 = X.i(paramString.substring(0, paramString.indexOf("$stringValue(")));
      String str2 = paramString.substring(paramString.indexOf("$stringValue("), paramString.lastIndexOf(")") + 1);
      String str3 = X.i(paramString.substring(paramString.lastIndexOf(")") + 1, paramString.length()));
      paramString = str2.substring("$stringValue(".length());
      paramString = paramString.substring(0, paramString.lastIndexOf(")"));
      String[] arrayOfString = X.c(paramString, ",");
      String str4 = arrayOfString[0];
      int i = -1;
      if (str4.indexOf("[") > -1) {
        i = Integer.parseInt(str4.substring(str4.indexOf("[") + 1, str4.indexOf("]")));
        str4 = str4.substring(0, str4.indexOf("["));
      } 
      aM aM = null;
      if (paramR != null) {
        aM = paramR.c(str4);
        if (aM == null)
          throw new ExceptionPrintstacktrace("stringValue([StringConstantName]): Invalid String Constant Name: " + arrayOfString[0] + " not found"); 
      } 
      if (paramR != null) {
        cC = new cC(paramR, aM);
      } else {
        cC = new cC(paramcZ, str4);
      } 
      cC.a(i);
      cC.a(str1);
      cC.b(str3);
      return cC;
    } 
    if (str.startsWith("stringValue(")) {
      cC cC;
      String str1 = X.i(paramString.substring(0, paramString.indexOf("stringValue("))).trim();
      String str2 = paramString.substring(paramString.indexOf("stringValue("), paramString.lastIndexOf(")") + 1).trim();
      String str3 = X.i(paramString.substring(paramString.lastIndexOf(")") + 1, paramString.length())).trim();
      paramString = str2.substring("stringValue(".length());
      paramString = paramString.substring(0, paramString.lastIndexOf(")"));
      String[] arrayOfString = X.c(paramString, ",");
      String str4 = arrayOfString[0];
      int i = -1;
      if (str4.indexOf("[") > -1) {
        i = Integer.parseInt(str4.substring(str4.indexOf("[") + 1, str4.indexOf("]")));
        str4 = str4.substring(0, str4.indexOf("["));
      } 
      aM aM = null;
      if (paramR != null) {
        aM = paramR.c(str4);
        if (aM == null)
          throw new ExceptionPrintstacktrace("stringValue([StringConstantName]): Invalid String Constant Name: " + arrayOfString[0] + " not found"); 
      } 
      if (paramR != null) {
        cC = new cC(paramR, aM);
      } else {
        cC = new cC(paramcZ, str4);
      } 
      cC.a(i);
      cC.a(str1);
      cC.b(str3);
      return cC;
    } 
    if (paramString.indexOf("$getWorkingDirPath(") != -1) {
      String str1 = X.i(paramString.substring(0, paramString.indexOf("$getWorkingDirPath(")));
      String str2 = paramString.substring(paramString.indexOf("$getWorkingDirPath("), paramString.lastIndexOf(")") + 1);
      String str3 = X.i(paramString.substring(paramString.lastIndexOf(")") + 1, paramString.length()));
      dn dn = new dn(paramR);
      dn.a(str1);
      dn.b(str3);
      return dn;
    } 
    if (paramString.indexOf("$getProjectsDirPath(") != -1) {
      String str1 = X.i(paramString.substring(0, paramString.indexOf("$getProjectsDirPath(")));
      String str2 = paramString.substring(paramString.indexOf("$getProjectsDirPath("), paramString.lastIndexOf(")") + 1);
      String str3 = X.i(paramString.substring(paramString.lastIndexOf(")") + 1, paramString.length()));
      cK cK = new cK(paramR);
      cK.a(str1);
      cK.b(str3);
      return cK;
    } 
    if (paramString.trim().startsWith("\""))
      paramString = X.i(paramString); 
    return new c(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/da.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */