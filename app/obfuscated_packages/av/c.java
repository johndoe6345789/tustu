package av;

import G.T;
import G.aI;
import G.aM;
import G.bM;
import G.be;
import G.i;
import V.a;
import V.g;
import V.h;
import W.z;
import ax.U;
import bH.D;
import h.g;
import h.i;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c extends g {
  protected static c a = null;
  
  public static c f() {
    if (a == null) {
      a = new c();
      a.a(new d());
    } 
    return a;
  }
  
  private c() {
    i();
  }
  
  private void i() {
    a("SingleBigMlvConfigInstance", "./inc/BigStuffGen4.ini", null);
  }
  
  public void a(String paramString) {
    String str = z.a(paramString);
    if (T.a().c() == null || !T.a().c().i().equals(str))
      i(); 
    try {
      (new a()).a(paramString, this);
      e e = new e(this);
      e.start();
      g();
    } catch (a a) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      throw new h("Unable to load tune file:\n" + paramString + "\nReported Error:\n" + a.getMessage());
    } 
  }
  
  protected void g() {
    boolean bool1 = false;
    boolean bool2 = true;
    try {
      bool1 = (this.b.c("LKUP_PARAMETER") == null || this.b.c("LKUP_PARAMETER").j(this.b.h()) != 0.0D) ? true : false;
      bool2 = (this.b.c("LOAD_AXIS_SCALE") == null || this.b.c("LOAD_AXIS_SCALE").j(this.b.h()) == 0.0D) ? true : false;
    } catch (g g1) {
      D.a("Failed to determine Y Axis field! " + g1.getLocalizedMessage());
    } 
    String str = bool1 ? "TPS" : (bool2 ? "MAP" : "BOOST_PSI");
    Iterator<be> iterator = this.b.n();
    while (iterator.hasNext()) {
      be be = iterator.next();
      if (this.d == null || this.d.a(be)) {
        String str1 = bM.a(this.b, be.aL());
        boolean bool = true;
        try {
          bool = (str1 == null || (!str1.isEmpty() && i.a(str1, (aI)this.b) != 0.0D)) ? true : false;
        } catch (U u) {
          D.c("Failed to evaluate: " + str1);
        } 
        if (bool) {
          aM aM1 = this.b.c(be.a());
          aM aM2 = this.b.c(be.b());
          aM aM3 = this.b.c(be.c());
          String str2 = null;
          if (be.f().equalsIgnoreCase("Load")) {
            String str4 = aM2.p();
            if (str4 != null)
              str4 = str4.toUpperCase(); 
            str2 = str;
          } 
          str2 = i.a("yAxisField", str2);
          str2 = g.a().a(str2);
          String str3 = g.a().a(g.d);
          try {
            i i = new i(this.b, aM1, aM2, aM3);
            i.d(str2);
            i.e(str3);
            i.f(be.aL());
            this.c.put(be.aL(), i);
          } catch (a a) {
            D.a("Unable to load table:" + be.aL(), (Exception)a, null);
            Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
          } 
        } 
      } 
    } 
  }
  
  public void j(String paramString) {
    try {
      (new a()).b(paramString, this);
      this.b.h().g();
    } catch (IOException iOException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new h("Failed to save tune file:\n" + paramString + "\nReported Error:\n" + iOException.getMessage());
    } 
  }
  
  public boolean k(String paramString) {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */