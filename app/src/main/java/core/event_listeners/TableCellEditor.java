package ao;

import g.IOJFileChooser;
import java.io.File;
import java.io.IOException;

public class bt {
  public static String a = "/help/index.html";

  public static String b = "/help/veAnalysis.html";

  public static String c = "/help/fieldDictionary.html";

  public static String d = "/help/formulas.html";

  public static String a(String paramString) {
    try {
      String str = (new File(".")).getCanonicalPath() + paramString;
      str = IOJFileChooser.a(str, "\\", "/");
      return "file:///" + str;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return "file:///." + paramString;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
