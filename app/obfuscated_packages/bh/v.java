package bh;

import G.R;
import G.T;
import G.aH;
import G.ac;
import G.cu;
import V.a;
import W.j;
import W.n;
import ao.hx;
import bH.D;
import bH.X;
import i.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r.a;
import r.i;

public class v implements a {
  Map a = new HashMap<>();
  
  boolean b = i.a().a(" a09kmfds098432lkg89vlk");
  
  List c = new ArrayList();
  
  x d = new x(this);
  
  Map e;
  
  public v() {
    cu.a().a(this.d);
    this.e = new HashMap<>();
  }
  
  public void a(int paramInt) {
    if (this.b && a.a().a(a.P, a.Q) && !b())
      b(paramInt); 
  }
  
  public void a() {
    this.a.clear();
    this.c.clear();
    this.e.clear();
  }
  
  private void b(int paramInt) {
    n n = hx.a().r();
    ArrayList<w> arrayList = new ArrayList();
    if (n != null) {
      for (j j : n) {
        String str1;
        R r;
        String str2 = j.a();
        if (str2.contains(".")) {
          str1 = str2.substring(0, str2.indexOf('.'));
          str2 = str2.substring(str2.indexOf('.') + 1);
          r = T.a().c(str1);
          if (r == null) {
            str2 = str1 + "." + str2;
            str1 = T.a().c().c();
            r = T.a().c(str1);
          } 
        } else {
          str1 = T.a().c().c();
          r = T.a().c(str1);
        } 
        if (r == null) {
          D.d("EcuConfig '" + str1 + "' not found, using working config");
          r = T.a().c();
        } 
        ac ac = a(r, str2);
        if (ac != null)
          try {
            aH aH = r.g(ac.a());
            byte[] arrayOfByte = a(r);
            if (aH != null && !aH.a(arrayOfByte, j.d(paramInt))) {
              arrayList.add(new w(this, str1, aH, j.d(paramInt)));
              if (!this.c.contains(aH))
                this.c.add(aH); 
            } 
          } catch (Exception exception) {} 
      } 
      for (String str : this.a.keySet()) {
        try {
          cu.a().a(str, (byte[])this.a.get(str));
        } catch (Exception exception) {}
      } 
      for (w w : arrayList) {
        w.d().c(w.b());
        try {
          cu.a().a(w.c(), w.a(), w.b());
        } catch (a a1) {}
      } 
    } 
  }
  
  private byte[] a(R paramR) {
    byte[] arrayOfByte = (byte[])this.a.get(paramR.c());
    if (arrayOfByte == null) {
      arrayOfByte = new byte[paramR.O().n()];
      this.a.put(paramR.c(), arrayOfByte);
    } 
    return arrayOfByte;
  }
  
  private Map a(String paramString) {
    Map<Object, Object> map = (Map)this.e.get(paramString);
    if (map == null) {
      map = new HashMap<>();
      this.e.put(paramString, map);
    } 
    return map;
  }
  
  private ac a(R paramR, String paramString) {
    Map<String, ac> map = a(paramR.c());
    ac ac = (ac)map.get(paramString);
    if (ac != null)
      return ac; 
    for (ac ac1 : paramR.g()) {
      String str = X.b(ac1.b(), "-", " ");
      if (str.equals(paramString)) {
        map.put(paramString, ac1);
        return ac1;
      } 
    } 
    return null;
  }
  
  private boolean b() {
    R r = T.a().c();
    return (r != null && r.R());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */