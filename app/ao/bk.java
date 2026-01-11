package ao;

import ar.c;
import ar.d;
import ar.e;
import ar.f;
import h.b;
import h.i;

public class bk implements e {
  bn a;
  
  bk(aX paramaX, bn parambn) {
    this.a = parambn;
  }
  
  public void a(c paramc) {
    this.a.a();
    bq.a().c().k();
    if (hx.a().r() != null)
      if (b.a().a("tabbedQuickViews")) {
        i.c("lastSelectedQuickViewName", paramc.b());
      } else if (paramc != null && !paramc.b().equals("Default")) {
        c c1 = f.a().c("Default");
        if (c1 != null) {
          c1.d();
          for (d d : paramc.c())
            c1.a(d); 
          f.a().a("Default");
        } 
      }  
  }
  
  public boolean a(String paramString1, String paramString2) {
    this.b.f(paramString1);
    return true;
  }
  
  public void b(c paramc) {}
  
  public void c(c paramc) {}
  
  public void a(String paramString) {}
  
  public void b(String paramString) {}
  
  public void c(String paramString) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */