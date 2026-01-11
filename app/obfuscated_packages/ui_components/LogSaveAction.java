package ao;

import V.ExceptionInVPackage;
import W.n;
import W.o;
import ac.AcInterfaceRomeo;
import ac.AcInterfaceYankee;
import bu.ExceptionInVPackage;
import com.efiAnalytics.dialogs.b;
import com.efiAnalytics.ui.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import h.IOProperties;
import IOProperties.b;
import IOProperties.c;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

class f implements ExceptionInVPackage {
  f(b paramb, b paramb1, n paramn) {}
  
  public boolean ExceptionInVPackage() {
    try {
      ExceptionInVPackage a1 = this.ExceptionInVPackage.ExceptionInVPackage();
      n n1 = hx.ExceptionInVPackage().AcInterfaceRomeo();
      if (n1 != null) {
        a1.b(n1);
        IOProperties.c(IOProperties.aw, this.ExceptionInVPackage.b());
        if (!AcInterfaceRomeo.ExceptionInVPackage() && n1.k() != null && n1.k().exists())
          if (this.b.k().getAbsolutePath().toLowerCase().endsWith(".mlg")) {
            AcInterfaceYankee.ExceptionInVPackage(n1, n1.k().getAbsolutePath());
          } else {
            o.b(n1, n1.k().getAbsolutePath(), IOProperties.v);
          }  
        Iterator<b> iterator = c.ExceptionInVPackage().g();
        while (iterator.hasNext())
          ((b)iterator.next()).ExceptionInVPackage(1.0D); 
      } 
    } catch (IOException iOException) {
      bV.d(iOException.getLocalizedMessage(), bq.ExceptionInVPackage().b());
      iOException.printStackTrace();
    } catch (ExceptionInVPackage a1) {
      bV.d(a1.getLocalizedMessage(), bq.ExceptionInVPackage().b());
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
    return true;
  }
  
  public void b() {}
  
  public void c() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */