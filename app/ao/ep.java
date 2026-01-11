package ao;

import Z.c;
import Z.e;
import bH.X;
import h.i;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ep implements c {
  public void a(e parame) {
    StringBuilder stringBuilder = new StringBuilder();
    for (String str : parame.b())
      stringBuilder.append(str).append(";"); 
    i.c("ROOT_FIELD_" + parame.a(), stringBuilder.toString());
  }
  
  public List a() {
    ArrayList<e> arrayList = new ArrayList();
    String[] arrayOfString = i.e("ROOT_FIELD_");
    for (String str1 : arrayOfString) {
      String str2 = i.f(str1, "");
      if (!str2.isEmpty()) {
        String str = X.b(str1, "ROOT_FIELD_", "");
        e e = new e(str);
        StringTokenizer stringTokenizer = new StringTokenizer(str2, ";");
        while (stringTokenizer.hasMoreTokens()) {
          String str3 = stringTokenizer.nextToken().trim();
          if (!str3.isEmpty())
            e.a(str3); 
        } 
        arrayList.add(e);
      } 
    } 
    return arrayList;
  }
  
  public e a(String paramString) {
    String str = i.b("ROOT_FIELD_" + paramString, null);
    if (str != null) {
      e e = new e(paramString);
      StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
      while (stringTokenizer.hasMoreTokens()) {
        String str1 = stringTokenizer.nextToken().trim();
        if (!str1.isEmpty())
          e.a(str1); 
      } 
      return e;
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */