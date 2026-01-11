package ae;

import java.util.ArrayList;
import java.util.List;

public class AeInterfaceRomeo {
  List a = new ArrayList();
  
  private static r b = null;
  
  public static r a() {
    if (b == null)
      b = new r(); 
    return b;
  }
  
  public void a(q paramq) {
    this.a.add(paramq);
  }
  
  public List a(m paramm) {
    ArrayList<q> arrayList = new ArrayList();
    for (q q : this.a) {
      if (paramm != null && q.a(paramm))
        arrayList.add(q); 
    } 
    return arrayList;
  }
  
  public List a(k paramk) {
    ArrayList<q> arrayList = new ArrayList();
    for (q q : this.a) {
      if (paramk != null && q.a(paramk))
        arrayList.add(q); 
    } 
    return arrayList;
  }
  
  public List a(k paramk, m paramm) {
    ArrayList<q> arrayList = new ArrayList();
    List list1 = a(paramm);
    List list2 = a(paramk);
    for (q q : list1) {
      if (list2.contains(q) && !arrayList.contains(q))
        arrayList.add(q); 
    } 
    return arrayList;
  }
  
  public void b() {
    for (q q : this.a)
      q.f(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */