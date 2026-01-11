package bs;

import G.R;
import G.dp;
import W.ab;
import aE.a;
import aE.e;
import java.util.ArrayList;
import java.util.Iterator;
import r.a;
import r.j;

public class C implements e {
  private static C a = null;
  
  public static C a() {
    if (a == null)
      a = new C(); 
    return a;
  }
  
  public ArrayList a(R paramR) {
    Iterator<String> iterator = paramR.N();
    if (!iterator.hasNext()) {
      b(paramR);
      iterator = paramR.N();
    } 
    ArrayList<String> arrayList = new ArrayList();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList;
  }
  
  public dp a(R paramR, String paramString) {
    dp dp = paramR.t(paramString);
    if (dp != null)
      return dp; 
    b(paramR);
    return paramR.t(paramString);
  }
  
  private void b(R paramR) {
    String str = paramR.i();
    if (str.startsWith("MS3")) {
      float f = a(str);
      if (f >= 261.0F) {
        String str1 = j.w;
        b(paramR, str1);
      } else {
        String str1 = j.x;
        b(paramR, str1);
      } 
    } else if (str.startsWith("MS2Extra")) {
      String str1 = j.v;
      b(paramR, str1);
    } else if (str.startsWith("MS/Extra") || str.startsWith("MS1/Extra") || str.startsWith("MSnS-extra")) {
      String str1 = j.u;
      b(paramR, str1);
    } else if (str.startsWith("MSII Rev") || str.startsWith("LCT Rev")) {
      String str1 = j.v;
      b(paramR, str1);
    } else if (str.startsWith("20")) {
      String str1 = j.t;
      b(paramR, str1);
    } 
  }
  
  private static float a(String paramString) {
    String str = paramString.replace("MS3 Format", "");
    float f = -1.0F;
    try {
      f = Float.parseFloat(str);
    } catch (Exception exception) {}
    return f;
  }
  
  private void b(R paramR, String paramString) {
    boolean bool = (a.a().c(a.bq, a.br) && a.a().c(a.bs, a.bt)) ? true : false;
    if (!bool) {
      ab ab = new ab();
      ab.a(paramR, paramString, false);
    } 
  }
  
  public void a(a parama, R paramR) {}
  
  public void e_() {}
  
  public void a(a parama) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */