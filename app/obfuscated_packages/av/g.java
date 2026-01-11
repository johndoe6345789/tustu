package av;

import G.R;
import G.T;
import G.aI;
import G.aL;
import G.aM;
import G.bM;
import G.be;
import G.i;
import G.r;
import V.a;
import V.h;
import W.ab;
import ao.hW;
import ao.hY;
import ax.U;
import bH.D;
import h.i;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class g implements hW {
  protected R b = null;
  
  protected Map c = new HashMap<>();
  
  protected p d = null;
  
  protected void a(String paramString1, String paramString2) {
    a(paramString1, paramString2, null);
  }
  
  protected void a(String paramString1, String paramString2, r[] paramArrayOfr) {
    T.a().b(paramString1);
    this.b = new R();
    this.b.a(paramString1);
    this.b.q((new File(paramString2)).getAbsolutePath());
    if (paramArrayOfr != null)
      for (byte b = 0; b < paramArrayOfr.length; b++)
        this.b.a(paramArrayOfr[b]);  
    try {
      this.b = (new ab()).a(this.b, paramString2, true, ab.i);
      aL.a(this.b);
      T.a().a(this.b);
      T.a().a(paramString1);
    } catch (V.g g1) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, "Error Setting Working Config.", (Throwable)g1);
      throw new h(g1.getMessage());
    } catch (a a) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, "Error loading config.", (Throwable)a);
      throw new h(a.getMessage());
    } 
  }
  
  protected void g() {
    this.c.clear();
    Iterator<be> iterator = this.b.n();
    while (iterator.hasNext()) {
      be be = iterator.next();
      if (this.d == null || this.d.a(be)) {
        String str = bM.a(this.b, be.aL());
        boolean bool = true;
        try {
          bool = (str == null || (!str.isEmpty() && i.a(str, (aI)this.b) != 0.0D)) ? true : false;
        } catch (U u) {
          D.c("Failed to evaluate: " + str);
        } 
        if (bool) {
          aM aM1 = this.b.c(be.a());
          aM aM2 = this.b.c(be.b());
          aM aM3 = this.b.c(be.c());
          String str1 = bM.j(this.b, be.f());
          if (str1 == null && be.f().equalsIgnoreCase("Load")) {
            String str3 = aM2.p();
            if (str3 != null)
              str3 = str3.toUpperCase(); 
            if ("KPA".equals(str3)) {
              str1 = "MAP";
            } else if ("PSI".equals(str3)) {
              str1 = "Boost";
            } else if ("TPS".equals(str3)) {
              str1 = "TPS";
            } else {
              str1 = be.f();
            } 
          } 
          if (str1 == null || str1.isEmpty())
            str1 = i.a("yAxisField", "MAP"); 
          String str2 = bM.j(this.b, be.d());
          if (str2 == null)
            h.g.a().a(h.g.d); 
          try {
            i i = new i(this.b, aM1, aM2, aM3);
            i.d(str1);
            i.e(str2);
            String str3 = bM.c(this.b, be.aL());
            i.f(str3);
            this.c.put(str3, i);
          } catch (a a) {
            D.a("Unable to load table:" + be.aL(), (Exception)a, null);
            Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
          } 
        } 
      } 
    } 
  }
  
  public Iterator c() {
    return this.c.keySet().iterator();
  }
  
  public int d() {
    return this.c.size();
  }
  
  public hY b(String paramString) {
    return (hY)this.c.get(paramString);
  }
  
  public void e() {}
  
  public boolean b() {
    return this.b.h().aO();
  }
  
  public void a() {
    this.b.h().g();
    Iterator<i> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((i)iterator.next()).q(); 
  }
  
  public R h() {
    return this.b;
  }
  
  public boolean k(String paramString) {
    return false;
  }
  
  protected void a(p paramp) {
    this.d = paramp;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */