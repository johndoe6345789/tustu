package T;

import G.R;
import G.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a implements S {
  private static a d = null;
  
  Map a = new HashMap<>();
  
  b b = new b(this);
  
  c c = null;
  
  public static a a() {
    if (d == null)
      d = new a(); 
    return d;
  }
  
  public void a(String paramString1, R paramR, List paramList, String paramString2) {
    List<e> list = a(paramString1);
    e e = new e(paramString1, paramR);
    e.a(paramString2);
    e.a(paramList);
    list.add(e);
  }
  
  public void b() {
    this.a.clear();
  }
  
  private c c() {
    if (this.c == null || !this.c.isAlive()) {
      this.c = new c(this);
      this.c.start();
    } 
    return this.c;
  }
  
  private synchronized List a(String paramString) {
    List list = (List)this.a.get(paramString);
    if (list == null) {
      list = new ArrayList();
      this.a.put(paramString, list);
    } 
    return list;
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    paramR.h().b(this.b);
  }
  
  public void c(R paramR) {
    paramR.h().a(this.b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/T/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */