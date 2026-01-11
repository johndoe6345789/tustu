package I;

import G.GInterfaceAh;
import bH.q;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInIPackage {
  private static c b = null;
  
  boolean a = false;
  
  private boolean c = (q.b() || this.a);
  
  private boolean d = (q.b() || this.a);
  
  private boolean e = (q.b() || this.a);
  
  private boolean f = true;
  
  private ArrayList g = new ArrayList();
  
  public static c a() {
    if (b == null)
      b = new c(); 
    return b;
  }
  
  public Iterator b() {
    if (this.g.isEmpty())
      this.g = e(); 
    return this.g.iterator();
  }
  
  private ArrayList e() {
    GInterfaceAh GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(f.a + "Gauge");
    GInterfaceAh.a(f.a);
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(100.0D);
    GInterfaceAh.d(75.0D);
    GInterfaceAh.e(90.0D);
    GInterfaceAh.c(10.0D);
    GInterfaceAh.h(5.0D);
    GInterfaceAh.c("Runtime Data Rate");
    GInterfaceAh.b("/sec");
    GInterfaceAh.g(1.0D);
    GInterfaceAh.f(1.0D);
    this.g.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v("dataLogRecordCountGauge");
    GInterfaceAh.a("dataLogRecordCount");
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(50000.0D);
    GInterfaceAh.d(200000.0D);
    GInterfaceAh.e(250000.0D);
    GInterfaceAh.c(0.0D);
    GInterfaceAh.h(0.0D);
    GInterfaceAh.c("Records Logged");
    GInterfaceAh.b("Records");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    this.g.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v("interrogationProgressGauge");
    GInterfaceAh.a("interrogationProgress");
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(100.0D);
    GInterfaceAh.d(200000.0D);
    GInterfaceAh.e(250000.0D);
    GInterfaceAh.c(0.0D);
    GInterfaceAh.h(0.0D);
    GInterfaceAh.c("Interrogation Progress");
    GInterfaceAh.b("%");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    this.g.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v("dataLogTimeGauge");
    GInterfaceAh.a("dataLogTime");
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(600.0D);
    GInterfaceAh.d(200000.0D);
    GInterfaceAh.e(250000.0D);
    GInterfaceAh.c(0.0D);
    GInterfaceAh.h(0.0D);
    GInterfaceAh.c("Log Time");
    GInterfaceAh.b("s.");
    GInterfaceAh.g(2.0D);
    GInterfaceAh.f(2.0D);
    this.g.add(GInterfaceAh);
    if (this.c) {
      a.a();
      a.a(this.g);
    } 
    if (this.e) {
      h.a();
      h.a(this.g);
    } 
    if (this.d) {
      j.a();
      j.a(this.g);
    } 
    return this.g;
  }
  
  public GInterfaceAh a(String paramString) {
    Iterator<GInterfaceAh> iterator = b();
    while (iterator.hasNext()) {
      GInterfaceAh GInterfaceAh = iterator.next();
      if (GInterfaceAh.aL().equals(paramString))
        return GInterfaceAh; 
    } 
    return null;
  }
  
  public boolean c() {
    return this.e;
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public boolean d() {
    return this.f;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */