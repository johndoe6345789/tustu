package G;

import V.a;
import V.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aQ implements S {
  private static aQ b = null;
  
  HashMap a = new HashMap<>();
  
  public static aQ a() {
    if (b == null) {
      b = new aQ();
      T.a().a(b);
    } 
    return b;
  }
  
  public void a(aM paramaM, R paramR, String paramString) {
    if (paramaM == null)
      throw new g("EcuPrameter not optional."); 
    if (!paramaM.i().equals("scalar") && !paramaM.i().equals("bits"))
      throw new g("Only scalar and bit param class supported."); 
    aO aO = new aO(paramaM, paramR, paramString);
    ArrayList<aO> arrayList = a(paramR.c());
    arrayList.add(aO);
  }
  
  private ArrayList a(String paramString) {
    ArrayList arrayList = (ArrayList)this.a.get(paramString);
    if (arrayList == null) {
      arrayList = new ArrayList();
      this.a.put(paramString, arrayList);
    } 
    return arrayList;
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    for (aO aO : a(paramR.c()))
      aR.a().a(aO); 
    ArrayList arrayList = a(paramR.c());
    arrayList.clear();
  }
  
  public void c(R paramR) {
    ArrayList arrayList = a(paramR.c());
    for (aO aO : arrayList) {
      String[] arrayOfString = i.h(aO.a(), paramR);
      for (String str : arrayOfString) {
        try {
          aR.a().a(paramR.c(), str, aO);
        } catch (a a) {
          Logger.getLogger(aQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
      } 
      arrayOfString = i.e(aO.a(), paramR);
      for (String str : arrayOfString) {
        try {
          cu.a().a(paramR.c(), str, aO);
        } catch (a a) {
          Logger.getLogger(aQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */