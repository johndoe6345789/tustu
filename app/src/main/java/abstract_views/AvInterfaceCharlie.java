package av;

import G.T;
import G.GInterfaceAi;
import G.Manager;
import G.ExceptionprintstacktraceInGPackage;
import G.CloneableImpl;
import G.i;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.VInterfaceHotel;
import W.z;
import ax.ExceptionInAxPackage;
import bH.D;
import VInterfaceHotel.ExceptionPrintstacktrace;
import VInterfaceHotel.i;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public AvInterfaceCharlielass AvInterfaceCharlie extends ExceptionPrintstacktrace {
  protected static c ExceptionInVPackage = null;
  
  public static c f() {
    if (ExceptionInVPackage == null) {
      ExceptionInVPackage = new c();
      ExceptionInVPackage.ExceptionInVPackage(new d());
    } 
    return ExceptionInVPackage;
  }
  
  private AvInterfaceCharlie() {
    i();
  }
  
  private void i() {
    ExceptionInVPackage("SingleBigMlvConfigInstance", "./inc/BigStuffGen4.ini", null);
  }
  
  public void ExceptionInVPackage(String paramString) {
    String str = z.ExceptionInVPackage(paramString);
    if (T.ExceptionInVPackage().c() == null || !T.ExceptionInVPackage().c().i().equals(str))
      i(); 
    try {
      (new ExceptionInVPackage()).ExceptionInVPackage(paramString, this);
      e e = new e(this);
      e.start();
      ExceptionPrintstacktrace();
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
      throw new VInterfaceHotel("Unable to load tune file:\n" + paramString + "\nReported Error:\n" + ExceptionInVPackage.getMessage());
    } 
  }
  
  protected void ExceptionPrintstacktrace() {
    boolean bool1 = false;
    boolean bool2 = true;
    try {
      bool1 = (this.b.c("LKUP_PARAMETER") == null || this.b.c("LKUP_PARAMETER").j(this.b.VInterfaceHotel()) != 0.0D) ? true : false;
      bool2 = (this.b.c("LOAD_AXIS_SCALE") == null || this.b.c("LOAD_AXIS_SCALE").j(this.b.VInterfaceHotel()) == 0.0D) ? true : false;
    } catch (ExceptionPrintstacktrace g1) {
      D.ExceptionInVPackage("Failed to determine Y Axis field! " + g1.getLocalizedMessage());
    } 
    String str = bool1 ? "TPS" : (bool2 ? "MAP" : "BOOST_PSI");
    Iterator<CloneableImpl> iterator = this.b.n();
    while (iterator.hasNext()) {
      CloneableImpl CloneableImpl = iterator.next();
      if (this.d == null || this.d.ExceptionInVPackage(CloneableImpl)) {
        String str1 = ExceptionprintstacktraceInGPackage.ExceptionInVPackage(this.b, CloneableImpl.aL());
        boolean bool = true;
        try {
          bool = (str1 == null || (!str1.isEmpty() && i.ExceptionInVPackage(str1, (GInterfaceAi)this.b) != 0.0D)) ? true : false;
        } catch (ExceptionInAxPackage u) {
          D.c("Failed to evaluate: " + str1);
        } 
        if (bool) {
          Manager aM1 = this.b.c(CloneableImpl.ExceptionInVPackage());
          Manager aM2 = this.b.c(CloneableImpl.b());
          Manager aM3 = this.b.c(CloneableImpl.c());
          String str2 = null;
          if (CloneableImpl.f().equalsIgnoreCase("Load")) {
            String str4 = aM2.p();
            if (str4 != null)
              str4 = str4.toUpperCase(); 
            str2 = str;
          } 
          str2 = i.ExceptionInVPackage("yAxisField", str2);
          str2 = ExceptionPrintstacktrace.ExceptionInVPackage().ExceptionInVPackage(str2);
          String str3 = ExceptionPrintstacktrace.ExceptionInVPackage().ExceptionInVPackage(ExceptionPrintstacktrace.d);
          try {
            i i = new i(this.b, aM1, aM2, aM3);
            i.d(str2);
            i.e(str3);
            i.f(CloneableImpl.aL());
            this.c.put(CloneableImpl.aL(), i);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            D.ExceptionInVPackage("Unable to load table:" + CloneableImpl.aL(), (Exception)ExceptionInVPackage, null);
            Logger.getLogger(ExceptionPrintstacktrace.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
          } 
        } 
      } 
    } 
  }
  
  public void j(String paramString) {
    try {
      (new ExceptionInVPackage()).b(paramString, this);
      this.b.VInterfaceHotel().ExceptionPrintstacktrace();
    } catch (IOException iOException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new VInterfaceHotel("Failed to save tune file:\n" + paramString + "\nReported Error:\n" + iOException.getMessage());
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