package ao;

import ax.ExceptionInAxPackage;
import h.IOProperties;
import java.util.ArrayList;
import k.KInterfaceAlpha;

public class ai {
  public static boolean KInterfaceAlpha(String paramString) {
    String str = c(paramString);
    return !IOProperties.e(str, "").equals("");
  }

  public static boolean b(String paramString) {
    String str = c(paramString);
    return (IOProperties.c(str) != null);
  }

  public static String c(String paramString) {
    return "APPEND_FIELD_" + paramString;
  }

  public static String[] KInterfaceAlpha(String paramString1, String paramString2) {
    String[] arrayOfString = null;
    try {
      KInterfaceAlpha KInterfaceAlpha = new KInterfaceAlpha(paramString2);
      arrayOfString = KInterfaceAlpha.b();
    } catch (ExceptionInAxPackage u) {
      u.printStackTrace();
      return new String[0];
    }
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (b(arrayOfString[b]) && !KInterfaceAlpha(arrayOfString[b])) {
        arrayList.add(arrayOfString[b]);
      } else if (!arrayOfString[b].equals(paramString1) && b(arrayOfString[b])) {
        String str = IOProperties.c(c(arrayOfString[b]));
        String[] arrayOfString1 = KInterfaceAlpha(arrayOfString[b], str);
        if (arrayOfString1 != null && arrayOfString1.length > 0)
          for (byte b1 = 0; b < arrayOfString1.length; b1++) {
            if (!arrayList.contains(arrayOfString1[b])) arrayList.add(arrayOfString1[b]);
          }
      }
    }
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
