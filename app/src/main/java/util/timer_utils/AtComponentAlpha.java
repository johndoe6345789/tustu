package at;

import HInterfaceHotel.HInterfaceHotel;
import bH.X;
import bH.t;
import java.io.File;

public class AtComponentAlpha {
  public static String a = ".settings";

  public static String[] a() {
    File file = HInterfaceHotel.e();
    String[] arrayOfString = file.list(new b());
    if (arrayOfString != null) {
      for (byte b = 0; b < arrayOfString.length; b++)
        arrayOfString[b] = X.b(arrayOfString[b], a, "");
      return arrayOfString;
    }
    return new String[0];
  }

  public static File a(String paramString) {
    return new File(HInterfaceHotel.e(), paramString + a);
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
