package ao;

import V.a;
import W.n;
import W.o;
import ac.r;
import ac.y;
import bu.a;
import com.efiAnalytics.dialogs.b;
import com.efiAnalytics.ui.a;
import com.efiAnalytics.ui.bV;
import h.i;
import i.b;
import i.c;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

class f implements a {
  f(b paramb, b paramb1, n paramn) {}
  
  public boolean a() {
    try {
      a a1 = this.a.a();
      n n1 = hx.a().r();
      if (n1 != null) {
        a1.b(n1);
        i.c(i.aw, this.a.b());
        if (!r.a() && n1.k() != null && n1.k().exists())
          if (this.b.k().getAbsolutePath().toLowerCase().endsWith(".mlg")) {
            y.a(n1, n1.k().getAbsolutePath());
          } else {
            o.b(n1, n1.k().getAbsolutePath(), i.v);
          }  
        Iterator<b> iterator = c.a().g();
        while (iterator.hasNext())
          ((b)iterator.next()).a(1.0D); 
      } 
    } catch (IOException iOException) {
      bV.d(iOException.getLocalizedMessage(), bq.a().b());
      iOException.printStackTrace();
    } catch (a a1) {
      bV.d(a1.getLocalizedMessage(), bq.a().b());
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