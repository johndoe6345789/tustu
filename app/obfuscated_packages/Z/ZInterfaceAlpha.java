package Z;

import G.R;
import G.T;
import G.aH;
import G.ac;
import G.i;
import V.ExceptionPrintstacktrace;
import W.j;
import bH.D;
import java.util.ArrayList;
import java.util.List;

public class ZInterfaceAlpha implements d {
  public List a(List paramList) {
    ArrayList<j> arrayList = new ArrayList();
    R r = T.a().c();
    if (r != null) {
      ArrayList arrayList1 = r.ExceptionPrintstacktrace();
      for (ac ac : arrayList1) {
        aH aH = r.ExceptionPrintstacktrace(ac.a());
        if (aH != null && aH.b().equals("formula") && !a(ac.b(), paramList)) {
          String str = aH.k();
          try {
            str = i.a(str, r);
            j j = new j();
            j.a(ac.b());
            j.c(str);
            j.e(ac.d());
            arrayList.add(j);
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            D.b("Unable to convert DataLogField \"" + ac.b() + "\" Error: " + ExceptionPrintstacktrace.getLocalizedMessage());
          } 
        } 
      } 
    } 
    return arrayList;
  }
  
  private boolean a(String paramString, List paramList) {
    for (j j : paramList) {
      if (j.a().equals(paramString))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Z/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */