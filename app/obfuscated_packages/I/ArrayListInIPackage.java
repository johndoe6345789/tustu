package I;

import G.ah;
import bH.q;
import java.util.ArrayList;
import java.util.Iterator;

public ArrayListInIPackagelass ArrayListInIPackage {
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
    ah ah = new ah();
    ah.v(f.a + "Gauge");
    ah.a(f.a);
    ah.a(0.0D);
    ah.b(100.0D);
    ah.d(75.0D);
    ah.e(90.0D);
    ah.c(10.0D);
    ah.h(5.0D);
    ah.c("Runtime Data Rate");
    ah.b("/sec");
    ah.g(1.0D);
    ah.f(1.0D);
    this.g.add(ah);
    ah = new ah();
    ah.v("dataLogRecordCountGauge");
    ah.a("dataLogRecordCount");
    ah.a(0.0D);
    ah.b(50000.0D);
    ah.d(200000.0D);
    ah.e(250000.0D);
    ah.c(0.0D);
    ah.h(0.0D);
    ah.c("Records Logged");
    ah.b("Records");
    ah.g(0.0D);
    ah.f(0.0D);
    this.g.add(ah);
    ah = new ah();
    ah.v("interrogationProgressGauge");
    ah.a("interrogationProgress");
    ah.a(0.0D);
    ah.b(100.0D);
    ah.d(200000.0D);
    ah.e(250000.0D);
    ah.c(0.0D);
    ah.h(0.0D);
    ah.c("Interrogation Progress");
    ah.b("%");
    ah.g(0.0D);
    ah.f(0.0D);
    this.g.add(ah);
    ah = new ah();
    ah.v("dataLogTimeGauge");
    ah.a("dataLogTime");
    ah.a(0.0D);
    ah.b(600.0D);
    ah.d(200000.0D);
    ah.e(250000.0D);
    ah.c(0.0D);
    ah.h(0.0D);
    ah.c("Log Time");
    ah.b("s.");
    ah.g(2.0D);
    ah.f(2.0D);
    this.g.add(ah);
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
  
  public ah a(String paramString) {
    Iterator<ah> iterator = b();
    while (iterator.hasNext()) {
      ah ah = iterator.next();
      if (ah.aL().equals(paramString))
        return ah; 
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