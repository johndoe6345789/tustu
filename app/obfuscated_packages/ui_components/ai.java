package ao;

import ax.U;
import h.i;
import java.util.ArrayList;
import k.a;

public class ai {
  public static boolean a(String paramString) {
    String str = c(paramString);
    return !i.e(str, "").equals("");
  }
  
  public static boolean b(String paramString) {
    String str = c(paramString);
    return (i.c(str) != null);
  }
  
  public static String c(String paramString) {
    return "APPEND_FIELD_" + paramString;
  }
  
  public static String[] a(String paramString1, String paramString2) {
    String[] arrayOfString = null;
    try {
      a a = new a(paramString2);
      arrayOfString = a.b();
    } catch (U u) {
      u.printStackTrace();
      return new String[0];
    } 
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (b(arrayOfString[b]) && !a(arrayOfString[b])) {
        arrayList.add(arrayOfString[b]);
      } else if (!arrayOfString[b].equals(paramString1) && b(arrayOfString[b])) {
        String str = i.c(c(arrayOfString[b]));
        String[] arrayOfString1 = a(arrayOfString[b], str);
        if (arrayOfString1 != null && arrayOfString1.length > 0)
          for (byte b1 = 0; b < arrayOfString1.length; b1++) {
            if (!arrayList.contains(arrayOfString1[b]))
              arrayList.add(arrayOfString1[b]); 
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