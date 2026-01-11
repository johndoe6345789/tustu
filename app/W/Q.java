package W;

import java.util.ArrayList;

public class Q {
  public static String a(String paramString) {
    return paramString.substring(paramString.indexOf("=") + 1, paramString.length()).trim();
  }
  
  public static String b(String paramString) {
    return paramString.substring(0, paramString.indexOf("=")).trim();
  }
  
  public static String[] c(String paramString) {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 0; b < paramString.length(); b++) {
      if (paramString.charAt(b) == '"' || paramString.charAt(b) == '[' || paramString.charAt(b) == ']') {
        bool1 = !bool1 ? true : false;
      } else if (paramString.charAt(b) == '{' || paramString.charAt(b) == '}') {
        bool2 = !bool2 ? true : false;
      } else if (!bool2 && !bool1 && (paramString.charAt(b) == ',' || paramString.charAt(b) == ' ' || paramString.charAt(b) == '\t' || b == paramString.length())) {
        arrayList.add(paramString.substring(i, b));
        while (b < paramString.length()) {
          if (paramString.charAt(b) != ',' && paramString.charAt(b) != ' ' && paramString.charAt(b) != '\t') {
            b--;
            break;
          } 
          b++;
        } 
        i = b + 1;
      } 
    } 
    if (i < paramString.length())
      arrayList.add(paramString.substring(i, paramString.length())); 
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */