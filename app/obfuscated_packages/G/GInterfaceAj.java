package G;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GInterfaceAj {
  public static int a(R paramR, int paramInt1, int paramInt2) {
    int i = paramR.O().f(paramInt1) - 1;
    int j = 0;
    Iterator<aM> iterator = paramR.a(paramInt1);
    while (iterator.hasNext()) {
      aM aM = iterator.next();
      if (!aM.P() && aM.g() > paramInt2) {
        if (!aM.h()) {
          if (aM.o())
            j += aM.z(); 
          continue;
        } 
        i = aM.g() - 1;
        break;
      } 
    } 
    return i - paramInt2 - j;
  }
  
  public static boolean a(R paramR, List<?> paramList) {
    boolean bool = false;
    ArrayList arrayList = new ArrayList(paramList);
    int i = ((aM)paramList.get(0)).d();
    Iterator<aM> iterator = paramR.a(i);
    while (iterator.hasNext()) {
      aM aM = iterator.next();
      if (a(arrayList, aM)) {
        bool = true;
        arrayList.remove(aM);
        if (arrayList.isEmpty())
          return true; 
        continue;
      } 
      if (bool)
        return false; 
    } 
    return paramList.isEmpty();
  }
  
  private static boolean a(List paramList, aM paramaM) {
    for (aM aM1 : paramList) {
      if (aM1.equals(paramaM))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */