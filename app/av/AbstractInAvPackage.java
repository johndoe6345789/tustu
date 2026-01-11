package av;

import G.R;
import G.T;
import G.GInterfaceAi;
import G.GInterfaceAl;
import G.Manager;
import G.ExceptionprintstacktraceInGPackage;
import G.CloneableImpl;
import G.i;
import G.r;
import V.ExceptionInVPackage;
import V.VInterfaceHotel;
import W.ManagerUsingFile;
import ao.hW;
import ao.hY;
import ax.ExceptionInAxPackage;
import bH.D;
import VInterfaceHotel.i;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractInAvPackage implements hW {
  protected R b = null;
  
  protected Map c = new HashMap<>();
  
  protected p d = null;
  
  protected void ExceptionInVPackage(String paramString1, String paramString2) {
    ExceptionInVPackage(paramString1, paramString2, null);
  }
  
  protected void ExceptionInVPackage(String paramString1, String paramString2, r[] paramArrayOfr) {
    T.ExceptionInVPackage().b(paramString1);
    this.b = new R();
    this.b.ExceptionInVPackage(paramString1);
    this.b.q((new File(paramString2)).getAbsolutePath());
    if (paramArrayOfr != null)
      for (byte b = 0; b < paramArrayOfr.length; b++)
        this.b.ExceptionInVPackage(paramArrayOfr[b]);  
    try {
      this.b = (new ManagerUsingFile()).ExceptionInVPackage(this.b, paramString2, true, ManagerUsingFile.i);
      GInterfaceAl.ExceptionInVPackage(this.b);
      T.ExceptionInVPackage().ExceptionInVPackage(this.b);
      T.ExceptionInVPackage().ExceptionInVPackage(paramString1);
    } catch (V.g g1) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, "Error Setting Working Config.", (Throwable)g1);
      throw new VInterfaceHotel(g1.getMessage());
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, "Error loading config.", (Throwable)ExceptionInVPackage);
      throw new VInterfaceHotel(ExceptionInVPackage.getMessage());
    } 
  }
  
  protected void g() {
    this.c.clear();
    Iterator<CloneableImpl> iterator = this.b.n();
    while (iterator.hasNext()) {
      CloneableImpl CloneableImpl = iterator.next();
      if (this.d == null || this.d.ExceptionInVPackage(CloneableImpl)) {
        String str = ExceptionprintstacktraceInGPackage.ExceptionInVPackage(this.b, CloneableImpl.GInterfaceAl());
        boolean bool = true;
        try {
          bool = (str == null || (!str.isEmpty() && i.ExceptionInVPackage(str, (GInterfaceAi)this.b) != 0.0D)) ? true : false;
        } catch (ExceptionInAxPackage u) {
          D.c("Failed to evaluate: " + str);
        } 
        if (bool) {
          Manager aM1 = this.b.c(CloneableImpl.ExceptionInVPackage());
          Manager aM2 = this.b.c(CloneableImpl.b());
          Manager aM3 = this.b.c(CloneableImpl.c());
          String str1 = ExceptionprintstacktraceInGPackage.j(this.b, CloneableImpl.f());
          if (str1 == null && CloneableImpl.f().equalsIgnoreCase("Load")) {
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
              str1 = CloneableImpl.f();
            } 
          } 
          if (str1 == null || str1.isEmpty())
            str1 = i.ExceptionInVPackage("yAxisField", "MAP"); 
          String str2 = ExceptionprintstacktraceInGPackage.j(this.b, CloneableImpl.d());
          if (str2 == null)
            VInterfaceHotel.g.ExceptionInVPackage().ExceptionInVPackage(VInterfaceHotel.g.d); 
          try {
            i i = new i(this.b, aM1, aM2, aM3);
            i.d(str1);
            i.e(str2);
            String str3 = ExceptionprintstacktraceInGPackage.c(this.b, CloneableImpl.GInterfaceAl());
            i.f(str3);
            this.c.put(str3, i);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            D.ExceptionInVPackage("Unable to load table:" + CloneableImpl.GInterfaceAl(), (Exception)ExceptionInVPackage, null);
            Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
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
    return this.b.VInterfaceHotel().aO();
  }
  
  public void ExceptionInVPackage() {
    this.b.VInterfaceHotel().g();
    Iterator<i> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((i)iterator.next()).q(); 
  }
  
  public R VInterfaceHotel() {
    return this.b;
  }
  
  public boolean k(String paramString) {
    return false;
  }
  
  protected void ExceptionInVPackage(p paramp) {
    this.d = paramp;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */