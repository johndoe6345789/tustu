package bR;

import bH.D;
import bN.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d {
  private static d c = null;
  
  Map a = new HashMap<>();
  
  Map b = new HashMap<>();
  
  public static d a() {
    if (c == null)
      c = new d(); 
    return c;
  }
  
  public c a(k paramk) {
    List<c> list = c(paramk);
    synchronized (list) {
      int i = list.size() - 1;
      if (i >= 0) {
        c c = list.remove(i);
        List list1 = d(paramk);
        c.a(true);
        if (list1.size() > 1000)
          D.b("Checked Out msg count: " + list1.size()); 
        return c;
      } 
    } 
    return new c(paramk);
  }
  
  public void a(k paramk, c paramc) {
    List<c> list = c(paramk);
    List list1 = d(paramk);
    list1.remove(paramc);
    list.add(paramc);
  }
  
  private List c(k paramk) {
    List list = (List)this.a.get(paramk);
    if (list == null) {
      list = new ArrayList();
      this.a.put(paramk, list);
    } 
    return list;
  }
  
  private List d(k paramk) {
    List list = (List)this.b.get(paramk);
    if (list == null) {
      list = new ArrayList();
      this.b.put(paramk, list);
    } 
    return list;
  }
  
  public void b(k paramk) {
    List list = (List)this.b.get(paramk);
    if (list != null)
      list.clear(); 
    list = (List)this.a.get(paramk);
    if (list != null)
      list.clear(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bR/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */