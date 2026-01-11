package ai;

import bH.X;
import java.io.File;
import java.io.IOException;

public class d {
  public static String a(String paramString) {
    try {
      String str = (new File(".")).getCanonicalPath() + paramString;
      str = X.b(str, "\\", "/");
      return "file:///" + str;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return "file:///." + paramString;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ai/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */