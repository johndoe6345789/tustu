package I;

import G.R;
import G.T;
import G.aH;
import G.dj;
import G.i;
import W.am;
import bH.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k {
  private am c = null;
  
  private static k d = null;
  
  Map a = new HashMap<>();
  
  Thread b = null;
  
  private k() {
    (new m(this)).start();
  }
  
  public static k a() {
    if (d == null)
      d = new k(); 
    return d;
  }
  
  public void a(am paramam) {
    this.c = paramam;
  }
  
  private String c(String paramString1, String paramString2) {
    return (T.a().c() == null || T.a().c().c().equals(paramString1)) ? ("_" + paramString2) : (paramString1 + "_" + paramString2);
  }
  
  public void b() {
    this.a.clear();
  }
  
  private List a(String paramString) {
    List list = (List)this.a.get(paramString);
    if (list == null) {
      list = new ArrayList();
      this.a.put(paramString, list);
    } 
    return list;
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString1 == null || paramString1.isEmpty())
      paramString1 = T.a().c().c(); 
    R r = T.a().c(paramString1);
    aH aH = r.g(paramString2);
    if (aH != null && aH.b().equals("formula")) {
      String str = aH.k();
      this.b = Thread.currentThread();
      i.b(paramString1, paramString2);
      double d = aH.o();
      this.b = null;
    } 
  }
  
  public double b(String paramString1, String paramString2) {
    double d;
    if (this.b != null && this.b.equals(Thread.currentThread()))
      return 0.0D; 
    String str = this.c.b(c(paramString1, paramString2), "0");
    try {
      d = Double.parseDouble(str);
    } catch (Exception exception) {
      D.d("Bad stored value for key: " + paramString2 + " = " + str + ", using 0");
      d = 0.0D;
    } 
    if (Double.isNaN(d)) {
      D.d("Stored value for key: " + paramString2 + " = NaN, using 0");
      d = 0.0D;
    } 
    if (Double.isInfinite(d)) {
      D.d("Stored value for key: " + paramString2 + " = Infinity, using 0");
      d = 0.0D;
    } 
    return d;
  }
  
  public void a(String paramString1, String paramString2, dj paramdj) {
    l l = new l(this, paramString1, paramString2, paramdj);
    List<l> list = a(paramString1);
    if (list.contains(paramString2))
      D.b("2 persisteAccumulate Entries with same key! : " + paramString2); 
    list.add(l);
  }
  
  public void a(String paramString, boolean paramBoolean) {
    if (this.c != null) {
      List list = (List)this.a.get(paramString);
      if (paramBoolean)
        paramString = ""; 
      for (l l : list)
        this.c.a(c(paramString, l.b()), Double.toString(l.c().a())); 
    } else {
      D.d("Persistor not set, not storing persistent accumulated values.");
    } 
  }
  
  public void c() {
    R r = T.a().c();
    boolean bool = false;
    for (List list : this.a.values()) {
      for (l l : list) {
        String str;
        if (r != null && r.c().equals(l.a())) {
          str = "";
        } else {
          str = l.a();
        } 
        double d = l.c().a();
        if (Double.isNaN(l.d()) || d != l.d()) {
          this.c.a(c(str, l.b()), Double.toString(d));
          l.a(d);
          bool = true;
        } 
      } 
    } 
    if (this.c != null && bool)
      this.c.a(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */