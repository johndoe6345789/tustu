package bh;

import G.R;
import G.T;
import G.aH;
import G.ac;
import G.cu;
import V.ExceptionInVPackage;
import W.j;
import W.n;
import ao.hx;
import bH.D;
import bH.X;
import RInterfaceIndia.ExceptionInVPackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r.ExceptionInVPackage;
import r.RInterfaceIndia;

public class BhInterfaceVictor implements ExceptionInVPackage {
  Map ExceptionInVPackage = new HashMap<>();
  
  boolean b = RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage(" a09kmfds098432lkg89vlk");
  
  List c = new ArrayList();
  
  x d = new x(this);
  
  Map e;
  
  public BhInterfaceVictor() {
    cu.ExceptionInVPackage().ExceptionInVPackage(this.d);
    this.e = new HashMap<>();
  }
  
  public void ExceptionInVPackage(int paramInt) {
    if (this.b && ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage.P, ExceptionInVPackage.Q) && !b())
      b(paramInt); 
  }
  
  public void ExceptionInVPackage() {
    this.ExceptionInVPackage.clear();
    this.c.clear();
    this.e.clear();
  }
  
  private void b(int paramInt) {
    n n = hx.ExceptionInVPackage().r();
    ArrayList<w> arrayList = new ArrayList();
    if (n != null) {
      for (j j : n) {
        String str1;
        R r;
        String str2 = j.ExceptionInVPackage();
        if (str2.contains(".")) {
          str1 = str2.substring(0, str2.indexOf('.'));
          str2 = str2.substring(str2.indexOf('.') + 1);
          r = T.ExceptionInVPackage().c(str1);
          if (r == null) {
            str2 = str1 + "." + str2;
            str1 = T.ExceptionInVPackage().c().c();
            r = T.ExceptionInVPackage().c(str1);
          } 
        } else {
          str1 = T.ExceptionInVPackage().c().c();
          r = T.ExceptionInVPackage().c(str1);
        } 
        if (r == null) {
          D.d("EcuConfig '" + str1 + "' not found, using working config");
          r = T.ExceptionInVPackage().c();
        } 
        ac ac = ExceptionInVPackage(r, str2);
        if (ac != null)
          try {
            aH aH = r.g(ac.ExceptionInVPackage());
            byte[] arrayOfByte = ExceptionInVPackage(r);
            if (aH != null && !aH.ExceptionInVPackage(arrayOfByte, j.d(paramInt))) {
              arrayList.add(new w(this, str1, aH, j.d(paramInt)));
              if (!this.c.contains(aH))
                this.c.add(aH); 
            } 
          } catch (Exception exception) {} 
      } 
      for (String str : this.ExceptionInVPackage.keySet()) {
        try {
          cu.ExceptionInVPackage().ExceptionInVPackage(str, (byte[])this.ExceptionInVPackage.get(str));
        } catch (Exception exception) {}
      } 
      for (w w : arrayList) {
        w.d().c(w.b());
        try {
          cu.ExceptionInVPackage().ExceptionInVPackage(w.c(), w.ExceptionInVPackage(), w.b());
        } catch (ExceptionInVPackage a1) {}
      } 
    } 
  }
  
  private byte[] ExceptionInVPackage(R paramR) {
    byte[] arrayOfByte = (byte[])this.ExceptionInVPackage.get(paramR.c());
    if (arrayOfByte == null) {
      arrayOfByte = new byte[paramR.O().n()];
      this.ExceptionInVPackage.put(paramR.c(), arrayOfByte);
    } 
    return arrayOfByte;
  }
  
  private Map ExceptionInVPackage(String paramString) {
    Map<Object, Object> map = (Map)this.e.get(paramString);
    if (map == null) {
      map = new HashMap<>();
      this.e.put(paramString, map);
    } 
    return map;
  }
  
  private ac ExceptionInVPackage(R paramR, String paramString) {
    Map<String, ac> map = ExceptionInVPackage(paramR.c());
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
    R r = T.ExceptionInVPackage().c();
    return (r != null && r.R());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */