package G;

import V.ExceptionPrintstacktrace;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bE extends Q implements Serializable {
  ArrayList a = new ArrayList();
  
  HashMap b = new HashMap<>();
  
  HashMap c = new HashMap<>();
  
  Map d = new HashMap<>();
  
  ArrayList e = new ArrayList();
  
  public void a(am paramam) {
    this.e.add(paramam);
  }
  
  public List a() {
    ArrayList arrayList = new ArrayList();
    arrayList.addAll(this.e);
    return arrayList;
  }
  
  public void a(bL parambL) {
    if (parambL == null || parambL.aL() == null)
      throw new ExceptionPrintstacktrace("Can not add wheelPattern unless it has a valid name."); 
    this.d.put(parambL.aL(), parambL);
  }
  
  public bL a(String paramString) {
    return (bL)this.d.get(paramString);
  }
  
  public void a(aj paramaj) {
    this.c.put(paramaj.a(), paramaj);
  }
  
  public aj b(String paramString) {
    return (aj)this.c.get(paramString);
  }
  
  public void a(aA paramaA) {
    this.a.add(paramaA);
  }
  
  public Iterator b() {
    return this.a.iterator();
  }
  
  public List c() {
    return this.a;
  }
  
  public void a(bv parambv) {
    this.b.put(parambv.aL(), parambv);
  }
  
  public bv c(String paramString) {
    return (bv)this.b.get(paramString);
  }
  
  public bi d(String paramString) {
    for (bv bv : this.b.values()) {
      if (bv instanceof bi) {
        bi bi = (bi)bv;
        if (bi.a() != null && bi.a().equals(paramString))
          return bi; 
      } 
    } 
    return null;
  }
  
  public Iterator d() {
    return this.b.values().iterator();
  }
  
  public void a(String paramString1, String paramString2) {
    for (aA aA : this.a) {
      if (aA.h().equals(paramString1)) {
        Iterator<aA> iterator = aA.a();
        while (iterator.hasNext()) {
          aA aA1 = iterator.next();
          if (aA1.d() != null && aA1.d().equals(paramString2)) {
            iterator.remove();
            return;
          } 
        } 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */