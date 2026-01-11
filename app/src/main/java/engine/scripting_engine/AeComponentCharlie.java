package ae;

import java.util.ArrayList;
import java.util.List;

public class AeComponentCharlie {
  public static List a(List paramList, k paramk) {
    ArrayList<s> arrayList = new ArrayList();
    for (s s : paramList) {
      if (!s.a(paramk).isEmpty())
        arrayList.add(s); 
    } 
    return arrayList;
  }
  
  public static List b(List paramList, k paramk) {
    ArrayList<s> arrayList = new ArrayList();
    for (s s : paramList) {
      if (!s.b(paramk).isEmpty())
        arrayList.add(s); 
    } 
    return arrayList;
  }
  
  public static boolean c(List paramList, k paramk) {
    for (s s : paramList) {
      if (!s.a(paramk).isEmpty())
        return true; 
    } 
    return false;
  }
  
  public static boolean d(List paramList, k paramk) {
    for (s s : paramList) {
      if (!s.b(paramk).isEmpty())
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */