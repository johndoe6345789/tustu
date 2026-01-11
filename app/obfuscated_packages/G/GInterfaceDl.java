package G;

import java.util.ArrayList;

public class GInterfaceDl {
  public static String a = "+-/=&<>*^!,% [{()}]|\n\t?:\\";
  
  public static ArrayList a(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    String str = "";
    boolean bool = false;
    for (byte b = 0; b < paramString.length(); b++) {
      if (paramString.charAt(b) == '$') {
        bool = true;
      } else if (a.indexOf(paramString.charAt(b)) != -1) {
        bool = false;
        if (str.trim().length() > 0)
          arrayList.add(str); 
        str = "";
      } 
      if (bool)
        str = str + paramString.charAt(b); 
    } 
    if (str.trim().length() > 0)
      arrayList.add(str.trim()); 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/dl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */