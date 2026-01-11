package I;

import G.Exceptionprintstacktrace;
import G.c;
import G.ManagerUsingArrayList;
import G.GInterfaceDb;
import G.k;
import java.util.ArrayList;
import java.util.Iterator;

public class IInterfaceDelta {
  private static d b = null;
  
  ArrayList a = new ArrayList();
  
  public static d a() {
    if (b == null)
      b = new d(); 
    return b;
  }
  
  public void a(Exceptionprintstacktrace paramak) {
    if (!a(paramak.aL()))
      e().add(paramak); 
  }
  
  public boolean a(String paramString) {
    for (byte b = 0; b < e().size(); b++) {
      Exceptionprintstacktrace Exceptionprintstacktrace = this.a.get(b);
      if (Exceptionprintstacktrace.aL().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public void b(String paramString) {
    for (byte b = 0; b < e().size(); b++) {
      Exceptionprintstacktrace Exceptionprintstacktrace = this.a.get(b);
      if (Exceptionprintstacktrace.aL().equals(paramString))
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
    Exceptionprintstacktrace Exceptionprintstacktrace = new Exceptionprintstacktrace();
    Exceptionprintstacktrace.v("dataLoggingActive");
    Exceptionprintstacktrace.a((GInterfaceDb)new c("Data Logging"));
    Exceptionprintstacktrace.b((GInterfaceDb)new c("Data Logging"));
    Exceptionprintstacktrace.a(k.s);
    Exceptionprintstacktrace.b(k.a);
    Exceptionprintstacktrace.c(k.i);
    Exceptionprintstacktrace.d(k.c);
    Exceptionprintstacktrace.b("toggleDatalogging?");
    Exceptionprintstacktrace.a("dataLoggingActive");
    this.a.add(Exceptionprintstacktrace);
    if (ManagerUsingArrayList.a().e("powerCycleRequired")) {
      Exceptionprintstacktrace = new Exceptionprintstacktrace();
      Exceptionprintstacktrace.v("powerCycleRequired");
      Exceptionprintstacktrace.a((GInterfaceDb)new c("Power Cycle"));
      Exceptionprintstacktrace.b((GInterfaceDb)new c("Power Cycle"));
      Exceptionprintstacktrace.a(k.k);
      Exceptionprintstacktrace.b(k.a);
      Exceptionprintstacktrace.c(k.i);
      Exceptionprintstacktrace.d(k.c);
      Exceptionprintstacktrace.a("powerCycleRequired");
      this.a.add(Exceptionprintstacktrace);
    } 
    if (c.a().c())
      h.b(this.a); 
    if (c.a().d()) {
      e.a();
      e.a(this.a);
    } 
    return this.a;
  }
  
  public Exceptionprintstacktrace c(String paramString) {
    Iterator<Exceptionprintstacktrace> iterator = c();
    while (iterator.hasNext()) {
      Exceptionprintstacktrace Exceptionprintstacktrace = iterator.next();
      if (Exceptionprintstacktrace.aL().equals(paramString))
        return Exceptionprintstacktrace; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */