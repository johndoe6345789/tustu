package n;

import G.bT;
import V.a;
import ay.l;
import ay.n;
import ay.o;
import bH.X;
import com.efiAnalytics.ui.bV;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;

public class k implements o {
  private static k a = null;
  
  private k() {
    String[] arrayOfString = a.a().f(a.W);
    try {
      for (String str : arrayOfString)
        l.a().a(X.b(str, a.W, ""), this); 
    } catch (a a) {
      j.a().b("Failed to queue downloaded ECU Definitions! \nError: " + a.getLocalizedMessage());
    } 
  }
  
  public static k a() {
    if (a == null)
      a = new k(); 
    return a;
  }
  
  public void a(bT parambT) {
    a.a().b(a.W + parambT.b(), parambT.b());
    a.a().b(a.X + parambT.b(), parambT.c());
    try {
      l.a().a(parambT.b(), this);
    } catch (a a) {
      Logger.getLogger(k.class.getName()).log(Level.WARNING, "Shoudn't have happened...", (Throwable)a);
    } 
  }
  
  public void a(n paramn) {
    if (paramn.b() == 0) {
      String str1 = a.a().c(a.X + paramn.a(), "");
      if (str1.isEmpty())
        str1 = paramn.a(); 
      String str2 = a("The correct ECU Definition has been downloaded for the Firmware") + ":\n" + str1 + "\n\n" + a("You may now connect to your Controller with this firmware.") + "\n" + a("When prompted for a signature mismatch, select 'Update ECU Definition'");
      j.a().b(str2);
      a.a().e(a.W + paramn.a());
      a.a().e(a.X + paramn.a());
    } else {
      j.a().b("ECU Definition Failed for " + paramn.a() + "! \nError: " + paramn.c());
      a.a().e(a.W + paramn.a());
      a.a().e(a.X + paramn.a());
    } 
  }
  
  private String a(String paramString) {
    return (bV.a() != null) ? bV.a().a(paramString) : paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/n/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */