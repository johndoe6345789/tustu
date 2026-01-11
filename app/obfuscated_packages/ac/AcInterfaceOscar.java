package ac;

import G.aF;
import bH.D;
import bH.c;
import java.io.OutputStream;
import java.util.HashMap;

public class AcInterfaceOscar implements aF {
  private static o e = null;
  
  HashMap a;
  
  public static String b = "signature";
  
  public static String c = "ochLength";
  
  long d;
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    p p = (p)this.a.get(paramString);
    OutputStream outputStream = p.b();
    if (paramArrayOfbyte.length == p.a()) {
      byte[] arrayOfByte = new byte[paramArrayOfbyte.length + 4];
      int i;
      for (i = 0; i < paramArrayOfbyte.length; i++)
        arrayOfByte[i] = paramArrayOfbyte[i]; 
      i = a();
      arrayOfByte[paramArrayOfbyte.length] = (byte)((i & 0xFF000000) >> 24);
      arrayOfByte[paramArrayOfbyte.length + 1] = (byte)((i & 0xFF0000) >> 16);
      arrayOfByte[paramArrayOfbyte.length + 2] = (byte)((i & 0xFF00) >> 8);
      arrayOfByte[paramArrayOfbyte.length + 3] = (byte)(i & 0xFF);
      try {
        System.out.println(c.d(arrayOfByte));
        outputStream.write(arrayOfByte);
        outputStream.flush();
      } catch (Exception exception) {
        D.c("Error writing to logfile:" + exception.getMessage());
      } 
    } else {
      D.b("Och Length=" + paramArrayOfbyte.length + ", expected " + p.a() + ":\n\t" + c.d(paramArrayOfbyte));
    } 
  }
  
  private int a() {
    return (int)(System.currentTimeMillis() - this.d);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */