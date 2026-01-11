package T;

import G.R;
import G.Y;
import G.aM;
import G.cj;
import V.g;
import bH.D;
import bH.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class e {
  String a;
  
  Y b;
  
  R c;
  
  private String g = null;
  
  private boolean h = false;
  
  List d = null;
  
  private List i = null;
  
  boolean e = false;
  
  Map f = new HashMap<>();
  
  e(String paramString, R paramR) {
    this.a = paramString;
    this.b = paramR.h();
    this.c = paramR;
  }
  
  public boolean a(Y paramY) {
    if (this.d == null)
      this.d = b(); 
    if (this.i != null && this.e) {
      for (aM aM : this.i) {
        try {
          if (aM.i().equals("array") || aM.i().equals("string")) {
            double[][] arrayOfDouble1 = aM.i(paramY);
            double[][] arrayOfDouble2 = aM.i(this.b);
            if (!c.a(arrayOfDouble1, arrayOfDouble2, aM.v(), aM.B()))
              return false; 
            continue;
          } 
          if (aM.j(paramY) != aM.j(this.b))
            return false; 
        } catch (g g) {
          D.a(g.getLocalizedMessage());
        } 
      } 
    } else {
      for (cj cj : this.d) {
        for (int i = cj.b(); i < cj.b() + cj.c(); i++) {
          if (paramY.b(cj.a(), i) != this.b.b(cj.a(), i))
            if (cj.d()) {
              boolean bool = false;
              for (aM aM : a(cj)) {
                if (i >= aM.g() && i < aM.g() + aM.z()) {
                  bool = true;
                  try {
                    if (!aM.f(paramY).equals(aM.f(this.b)))
                      return false; 
                  } catch (g g) {}
                } 
              } 
              if (!bool)
                return false; 
            } else {
              return false;
            }  
        } 
      } 
    } 
    return true;
  }
  
  private List a(cj paramcj) {
    List<aM> list = (List)this.f.get(paramcj);
    if (list == null) {
      list = new ArrayList();
      this.f.put(paramcj, list);
      Iterator<aM> iterator = this.c.a(paramcj.a());
      while (iterator.hasNext()) {
        aM aM = iterator.next();
        if (aM.i().equals("bits") && aM.g() <= paramcj.b() + paramcj.c() && aM.g() + aM.z() > paramcj.b())
          list.add(aM); 
      } 
    } 
    return list;
  }
  
  private List b() {
    ArrayList<cj> arrayList = new ArrayList();
    for (byte b = 0; b < this.b.e(); b++) {
      int[] arrayOfInt = this.b.b(b);
      cj cj = null;
      for (byte b1 = 0; b1 < arrayOfInt.length; b1++) {
        if (cj == null && arrayOfInt[b1] != Y.j) {
          cj = new cj(b);
          cj.a(b1);
        } else if (cj != null && (arrayOfInt[b1] == Y.j || b1 == arrayOfInt.length - 1)) {
          cj.b(b1 - cj.b());
          arrayList.add(cj);
          cj = null;
        } 
      } 
    } 
    this.e = false;
    for (cj cj : arrayList) {
      Iterator<aM> iterator = this.c.a(cj.a());
      while (iterator.hasNext()) {
        aM aM = iterator.next();
        if (aM.a(cj.a(), cj.b(), cj.c()) && aM.i().equals("bits")) {
          this.e = true;
          cj.a(true);
        } 
      } 
    } 
    return arrayList;
  }
  
  public String a() {
    return this.g;
  }
  
  public void a(String paramString) {
    this.g = paramString;
  }
  
  public void a(List paramList) {
    this.i = paramList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/T/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */