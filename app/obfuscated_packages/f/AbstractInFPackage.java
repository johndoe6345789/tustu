package f;

import bH.D;
import bH.n;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract AbstractInFPackagelass AbstractInFPackage {
  public static boolean a = false;
  
  protected static b b = null;
  
  public synchronized b a() {
    return b;
  }
  
  public void a(b paramb) {
    b = paramb;
  }
  
  public a a(String paramString, b paramb) {
    String str1 = e.a() + paramb.a() + "&appId=" + paramString;
    String str2 = n.a(str1);
    a a = new a();
    a.a(str2);
    return a;
  }
  
  public d a(a parama) {
    d d = new d();
    if (parama == null) {
      d.a(parama.f());
      d.a("Invalid Activation." + parama.g());
    } else if (parama.f() == 0 || parama.f() == 1) {
      try {
        if (b(parama)) {
          if (parama.h().before(new Date())) {
            d.a(1);
            d.a("Valid Activation.");
          } else {
            d.a(0);
            d.a("Valid Activation.");
          } 
          d.a(parama);
        } else {
          a("Compare Failed: " + parama);
          d.a(2);
          d.a("Invalid Activation.");
        } 
      } catch (g g) {
        a("InsufficientIdentifiers: " + parama.toString());
        d.a(4);
        d.a("No identifiers available.");
      } 
    } else if (parama.f() == 5) {
      d.a(5);
      d.a("Current Activation Count: " + parama.e());
      d.a(parama);
    } else if (parama.f() == 6) {
      d.a(6);
      d.a(parama.g());
    } else {
      d.a(2);
      d.a("Invalid activation data.");
    } 
    return d;
  }
  
  protected boolean b(a parama) {
    b b1 = b;
    if (b1 == null) {
      a("No Local Identifiers");
      b1 = a();
      D.d("hid not set, but they should");
      long l = System.currentTimeMillis();
      while (b1 == null) {
        D.d("sn");
        try {
          Thread.sleep(100L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
        if (System.currentTimeMillis() - l > 30000L) {
          D.d("TO");
          return false;
        } 
      } 
    } 
    if (b1.h() != null && !b1.h().equals("") && parama.j().equals(b1.h()))
      return true; 
    if (b1.c() != null && !b1.c().equals("") && parama.b().equals(b1.c()))
      return true; 
    if (b1.d() != null && !b1.d().equals("") && parama.c().equals(b1.d()))
      return true; 
    if (b1.b() != null && !b1.b().equals("") && parama.a().equals(b1.b()))
      return true; 
    if (a)
      a("HW No Match, Local:\n" + b1 + "\nAct: " + parama); 
    return false;
  }
  
  public abstract a b();
  
  public d c() {
    a a = b();
    if (a == null) {
      d d = new d();
      d.a(2);
      d.a(d.a);
      return d;
    } 
    return a(a);
  }
  
  protected void a(String paramString) {
    if (a)
      D.c("AM: " + paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/f/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */