package I;

import G.ak;
import G.c;
import G.cu;
import G.db;
import G.k;
import java.util.ArrayList;
import java.util.Iterator;

public class d {
  private static d b = null;
  
  ArrayList a = new ArrayList();
  
  public static d a() {
    if (b == null)
      b = new d(); 
    return b;
  }
  
  public void a(ak paramak) {
    if (!a(paramak.aL()))
      e().add(paramak); 
  }
  
  public boolean a(String paramString) {
    for (byte b = 0; b < e().size(); b++) {
      ak ak = this.a.get(b);
      if (ak.aL().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public void b(String paramString) {
    for (byte b = 0; b < e().size(); b++) {
      ak ak = this.a.get(b);
      if (ak.aL().equals(paramString))
        this.a.remove(b); 
    } 
  }
  
  public Iterator b() {
    return e().iterator();
  }
  
  private ArrayList e() {
    if (this.a.isEmpty())
      this.a = f(); 
    return this.a;
  }
  
  public Iterator c() {
    return e().iterator();
  }
  
  public void d() {
    this.a.clear();
    f();
  }
  
  private ArrayList f() {
    ak ak = new ak();
    ak.v("dataLoggingActive");
    ak.a((db)new c("Data Logging"));
    ak.b((db)new c("Data Logging"));
    ak.a(k.s);
    ak.b(k.a);
    ak.c(k.i);
    ak.d(k.c);
    ak.b("toggleDatalogging?");
    ak.a("dataLoggingActive");
    this.a.add(ak);
    if (cu.a().e("powerCycleRequired")) {
      ak = new ak();
      ak.v("powerCycleRequired");
      ak.a((db)new c("Power Cycle"));
      ak.b((db)new c("Power Cycle"));
      ak.a(k.k);
      ak.b(k.a);
      ak.c(k.i);
      ak.d(k.c);
      ak.a("powerCycleRequired");
      this.a.add(ak);
    } 
    if (c.a().c())
      h.b(this.a); 
    if (c.a().d()) {
      e.a();
      e.a(this.a);
    } 
    return this.a;
  }
  
  public ak c(String paramString) {
    Iterator<ak> iterator = c();
    while (iterator.hasNext()) {
      ak ak = iterator.next();
      if (ak.aL().equals(paramString))
        return ak; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */