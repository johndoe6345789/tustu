package ao;

import W.j;
import W.n;
import bB.a;
import bB.q;
import bB.r;
import bH.S;
import g.b;
import g.k;
import h.i;
import java.util.ArrayList;
import java.util.List;

public class eo implements q {
  private void c(String paramString) {
    String str = "FIELD_MIN_MAX_" + paramString;
    if (i.c(str) == null) {
      i.d(str);
    } else {
      i.c(str, ";");
    } 
  }
  
  public void a(r paramr) {
    n n = hx.a().r();
    j j = (n == null) ? null : n.a(paramr.e());
    StringBuilder stringBuilder = new StringBuilder();
    if (paramr.c()) {
      stringBuilder.append("Auto");
    } else {
      stringBuilder.append(paramr.a());
    } 
    stringBuilder.append(";");
    if (paramr.d()) {
      stringBuilder.append("Auto");
    } else {
      stringBuilder.append(paramr.b());
    } 
    stringBuilder.append(";");
    stringBuilder.append(paramr.f());
    i.c("FIELD_MIN_MAX_" + paramr.e(), stringBuilder.toString());
    if (j != null) {
      j.g((float)paramr.a());
      j.f((float)paramr.b());
      if (paramr.f() != -1) {
        j.e(paramr.f());
      } else {
        j.e(j.B());
      } 
    } 
    bq.a().e().o();
  }
  
  public void a(String paramString) {
    c(paramString);
    bq.a().e().o();
  }
  
  public List a() {
    ArrayList<a> arrayList = new ArrayList();
    String[] arrayOfString = i.e("FIELD_MIN_MAX_");
    if (i.a(i.E, i.F))
      arrayOfString = S.a(arrayOfString); 
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str1 = i.a(arrayOfString[b], "");
      String str2 = k.a(arrayOfString[b], "FIELD_MIN_MAX_", "");
      if (hx.a().r() == null || hx.a().r().a(str2) != null) {
        a a;
        r r = null;
        try {
          r = b.a().a(str2);
        } catch (Exception exception) {}
        if (r == null) {
          a = new a(str2);
          a.a(Double.NaN);
          a.b(Double.NaN);
          a.a(-1);
        } 
        arrayList.add(a);
      } 
    } 
    return arrayList;
  }
  
  public r b(String paramString) {
    return b.a().a(paramString);
  }
  
  public List b() {
    ArrayList<String> arrayList = new ArrayList();
    n n = hx.a().r();
    if (n != null)
      for (j j : n)
        arrayList.add(j.a());  
    return arrayList;
  }
  
  public r b(r paramr) {
    return b.a().a(paramr);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */