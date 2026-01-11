package S;

import G.R;
import G.S;
import G.T;
import U.a;
import W.ap;
import bH.D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class b implements S {
  private final a b = new a();
  
  private ap c = null;
  
  private final List d = new ArrayList();
  
  private final HashMap e = new HashMap<>();
  
  List a = new ArrayList();
  
  private static b f = null;
  
  public static b a() {
    if (f == null)
      f = new b(); 
    return f;
  }
  
  public j a(String paramString1, String paramString2) {
    a a1 = b(paramString1, paramString2);
    if (a1 == null || !(a1 instanceof j)) {
      j j = new j();
      j.g(paramString2);
      if (this.c != null)
        j.h(paramString1); 
      this.e.put(c(paramString1, paramString2), j);
      a1 = j;
    } 
    return (j)a1;
  }
  
  public a b(String paramString1, String paramString2) {
    a a1 = (a)this.e.get(c(paramString1, paramString2));
    if (a1 == null) {
      for (g g : this.d) {
        a1 = g.a(paramString1, paramString2);
        if (a1 != null)
          break; 
      } 
      if (a1 == null)
        a1 = this.b.a(paramString1, paramString2); 
      if (a1 != null)
        this.e.put(c(paramString1, paramString2), a1); 
      if (a1 instanceof k)
        ((k)a1).d_(); 
    } 
    return a1;
  }
  
  private String[] c() {
    ArrayList arrayList = new ArrayList();
    for (g g : this.d) {
      if (g instanceof l) {
        l l = (l)g;
        arrayList.addAll(l.c());
      } 
    } 
    return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
  }
  
  private String c(String paramString1, String paramString2) {
    if (T.a().c() != null && T.a().c().c().equals(paramString1)) {
      paramString1 = "";
    } else {
      paramString1 = paramString1 + ".";
    } 
    return paramString1 + paramString2;
  }
  
  public void a(g paramg) {
    this.d.add(paramg);
  }
  
  public ap b() {
    return this.c;
  }
  
  public void a(ap paramap) {
    this.c = paramap;
    this.b.a(paramap);
  }
  
  public void a(String paramString) {
    b(paramString);
    this.e.clear();
  }
  
  public void b(String paramString) {
    if (this.c != null) {
      StringBuilder stringBuilder = new StringBuilder();
      Collection collection = e.a().a(paramString);
      for (a a1 : collection)
        stringBuilder.append(a1.a()).append("|"); 
      String str = c(paramString, "ActiveTriggers");
      this.c.a(str, stringBuilder.toString());
    } else {
      D.d("No Persistor set, not saving active triggers.");
    } 
  }
  
  protected void c(String paramString) {
    if (this.c != null) {
      String str1 = c(paramString, "ActiveTriggers");
      String str2 = "";
      String[] arrayOfString1 = c();
      if (arrayOfString1 != null)
        for (String str : arrayOfString1)
          str2 = str2 + str + "|";  
      String str3 = this.c.b(str1, str2);
      String[] arrayOfString2 = str3.split("\\|");
      for (byte b1 = 0; b1 < arrayOfString2.length; b1++) {
        if (!arrayOfString2[b1].equals("")) {
          a a1 = b(paramString, arrayOfString2[b1]);
          if (a1 != null && a1.c()) {
            e.a().a(paramString, a1);
            D.d("EventTrigger: " + paramString + "." + arrayOfString2[b1] + " loaded and activated.");
          } else {
            D.d("EventTrigger: " + paramString + "." + arrayOfString2[b1] + " not active.");
          } 
        } 
      } 
      d(paramString);
    } else {
      D.d("No Persistor set, not activating persisted triggers.");
    } 
  }
  
  private void d(String paramString) {
    for (m m : this.a)
      m.a(paramString); 
  }
  
  public void a(m paramm) {
    if (!this.a.contains(paramm))
      this.a.add(paramm); 
  }
  
  public void a(R paramR) {
    c c = new c(this, paramR);
    c.start();
  }
  
  public void b(R paramR) {}
  
  public void c(R paramR) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/S/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */