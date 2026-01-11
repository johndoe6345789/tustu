package Z;

import G.R;
import G.T;
import G.aH;
import G.ac;
import G.i;
import V.g;
import W.j;
import bH.D;
import java.util.ArrayList;
import java.util.List;

public class a implements d {
  public List a(List paramList) {
    ArrayList<j> arrayList = new ArrayList();
    R r = T.a().c();
    if (r != null) {
      ArrayList arrayList1 = r.g();
      for (ac ac : arrayList1) {
        aH aH = r.g(ac.a());
        if (aH != null && aH.b().equals("formula") && !a(ac.b(), paramList)) {
          String str = aH.k();
          try {
            str = i.a(str, r);
            j j = new j();
            j.a(ac.b());
            j.c(str);
            j.e(ac.d());
            arrayList.add(j);
          } catch (g g) {
            D.b("Unable to convert DataLogField \"" + ac.b() + "\" Error: " + g.getLocalizedMessage());
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