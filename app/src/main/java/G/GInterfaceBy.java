package G;

import V.ExceptionPrintstacktrace;
import bH.D;
import bH.c;
import java.util.StringTokenizer;

public class GInterfaceBy extends Q {
  private String a = "big";
  
  private bZ b = null;
  
  private bZ c = null;
  
  private bZ d = null;
  
  public bZ a() {
    return this.b;
  }
  
  public void a(String paramString) {
    this.b = b(paramString);
  }
  
  public bZ b(String paramString) {
    bZ bZ1 = new bZ(this);
    bZ1.a(paramString);
    return a(bZ1);
  }
  
  public boolean b() {
    return c().equals("big");
  }
  
  public String c() {
    return this.a;
  }
  
  public bZ a(bZ parambZ) {
    String str = parambZ.a();
    try {
      boolean bool = parambZ.f();
      if (bool)
        D.b("Variables not currently supported in Interrogation command strings."); 
      int i = (str.indexOf("%") != -1) ? str.indexOf("%") : str.length();
      if (i == -1 && str.indexOf("\\") == -1 && str.indexOf("%") == -1) {
        parambZ.b("");
        parambZ.a(str.getBytes());
        return parambZ;
      } 
      parambZ.b(str.substring(i));
      if (parambZ.c().indexOf("%2cId") != -1) {
        parambZ.b(2);
      } else if (parambZ.c().indexOf("%cId") != -1) {
        parambZ.b(1);
      } else {
        parambZ.b(0);
      } 
      str = str.substring(0, i);
      byte[] arrayOfByte = c(str);
      D.c("Command Non-VolatileBytes for " + str + " resolved to: " + c.d(arrayOfByte));
      parambZ.a(arrayOfByte);
    } catch (NumberFormatException numberFormatException) {
      numberFormatException.printStackTrace();
      throw new ExceptionPrintstacktrace("Unable to parse SendCommand:" + str + "\nCould not convert to number " + numberFormatException.getMessage(), numberFormatException);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionPrintstacktrace("Unable to parse SendCommand:" + str, exception);
    } 
    return parambZ;
  }
  
  public static byte[] c(String paramString) {
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, "\\");
    byte[] arrayOfByte = new byte[stringTokenizer.countTokens()];
    for (byte b = 0; stringTokenizer.hasMoreTokens(); b++) {
      String str = stringTokenizer.nextToken();
      if (!b) {
        arrayOfByte[b] = str.getBytes()[0];
      } else {
        arrayOfByte[b] = f(str);
      } 
    } 
    return arrayOfByte;
  }
  
  private static byte f(String paramString) {
    byte b = 10;
    if (paramString.startsWith("x")) {
      paramString = paramString.substring(1);
      b = 16;
    } else {
      b = 8;
    } 
    return (byte)Integer.parseInt(paramString, b);
  }
  
  public bZ d() {
    return this.c;
  }
  
  public void d(String paramString) {
    this.c = b(paramString);
  }
  
  public bZ e() {
    return this.d;
  }
  
  public void e(String paramString) {
    this.d = b(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */