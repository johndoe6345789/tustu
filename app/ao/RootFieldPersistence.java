package ao;

import Z.ZInterfaceCharlie;
import Z.ZInterfaceEcho;
import bH.X;
import h.IOProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ep implements ZInterfaceCharlie {
  public void a(ZInterfaceEcho parame) {
    StringBuilder stringBuilder = new StringBuilder();
    for (String str : parame.b())
      stringBuilder.append(str).append(";"); 
    IOProperties.ZInterfaceCharlie("ROOT_FIELD_" + parame.a(), stringBuilder.toString());
  }
  
  public List a() {
    ArrayList<ZInterfaceEcho> arrayList = new ArrayList();
    String[] arrayOfString = IOProperties.ZInterfaceEcho("ROOT_FIELD_");
    for (String str1 : arrayOfString) {
      String str2 = IOProperties.f(str1, "");
      if (!str2.isEmpty()) {
        String str = X.b(str1, "ROOT_FIELD_", "");
        ZInterfaceEcho ZInterfaceEcho = new ZInterfaceEcho(str);
        StringTokenizer stringTokenizer = new StringTokenizer(str2, ";");
        while (stringTokenizer.hasMoreTokens()) {
          String str3 = stringTokenizer.nextToken().trim();
          if (!str3.isEmpty())
            ZInterfaceEcho.a(str3); 
        } 
        arrayList.add(ZInterfaceEcho);
      } 
    } 
    return arrayList;
  }
  
  public ZInterfaceEcho a(String paramString) {
    String str = IOProperties.b("ROOT_FIELD_" + paramString, null);
    if (str != null) {
      ZInterfaceEcho ZInterfaceEcho = new ZInterfaceEcho(paramString);
      StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
      while (stringTokenizer.hasMoreTokens()) {
        String str1 = stringTokenizer.nextToken().trim();
        if (!str1.isEmpty())
          ZInterfaceEcho.a(str1); 
      } 
      return ZInterfaceEcho;
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */