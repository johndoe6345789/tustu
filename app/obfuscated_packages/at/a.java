package at;

import bH.X;
import bH.t;
import h.h;
import java.io.File;

public class a {
  public static String a = ".settings";
  
  public static String[] a() {
    File file = h.e();
    String[] arrayOfString = file.list(new b());
    if (arrayOfString != null) {
      for (byte b = 0; b < arrayOfString.length; b++)
        arrayOfString[b] = X.b(arrayOfString[b], a, ""); 
      return arrayOfString;
    } 
    return new String[0];
  }
  
  public static File a(String paramString) {
    return new File(h.e(), paramString + a);
  }
  
  public static boolean b(String paramString) {
    return a(paramString).delete();
  }
  
  public static void a(String paramString, File paramFile) {
    t.a(paramFile, a(paramString));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/at/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */