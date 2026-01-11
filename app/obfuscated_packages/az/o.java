package az;

import V.a;
import bH.D;
import bH.X;
import bH.aa;
import bH.ab;
import bH.n;
import bH.q;
import com.efiAnalytics.ui.bV;
import f.a;
import f.b;
import f.c;
import f.d;
import f.g;
import f.h;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class o extends c {
  private boolean d = false;
  
  private d e;
  
  private ab f;
  
  private static boolean g = false;
  
  Map c = new HashMap<>();
  
  private static o h = null;
  
  private o(d paramd, ab paramab) {
    this.e = paramd;
    this.f = paramab;
  }
  
  public static o a(d paramd, ab paramab) {
    if (h == null) {
      h = new o(paramd, paramab);
    } else if (paramd != null) {
      D.d("Updating ai & t");
      h.e = paramd;
      h.f = paramab;
    } 
    return h;
  }
  
  public static synchronized o d() {
    if (h == null) {
      D.d("gupam");
      h = new o(null, null);
    } 
    return h;
  }
  
  public a e() {
    if (!n.b())
      throw new e(c.a(this.f)); 
    a a = null;
    try {
      b b = i();
      a = a("TunerStudioMS", b);
    } catch (IOException iOException) {
      Logger.getLogger(o.class.getName()).log(Level.INFO, "AF: IOE", iOException);
      throw new e(c.b(this.f));
    } catch (h h) {
      Logger.getLogger(o.class.getName()).log(Level.INFO, "AF: IEE", (Throwable)h);
      throw new b(this.f.a("Invalid activation data.") + " " + h.getMessage());
    } 
    return a;
  }
  
  public a b() {
    String str = this.e.c();
    a a = (a)this.c.get(this.e.f());
    if (str == null || str.trim().equals(""))
      return null; 
    if (a != null && a.f() == 0)
      return a; 
    try {
      a = new a(str);
      a.i(str);
      this.c.put(this.e.f(), a);
      return a;
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public void f() {
    this.c.clear();
  }
  
  public void c(a parama) {
    try {
      String str = parama.i();
      this.e.a(str);
    } catch (a a1) {
      bV.d("Unable to save Activation Data:\n" + a1.getMessage(), this.e.i());
    } 
  }
  
  public synchronized b a() {
    if (super.a() == null)
      try {
        b b = new b();
        (new o(null, null)).b(b);
        d().a(b);
        return super.a();
      } catch (g g) {
        D.a("Error ISID");
      }  
    return super.a();
  }
  
  public synchronized b b(b paramb) {
    if (super.a() != null) {
      if (this.d)
        D.c("Returning cached HW"); 
      return super.a();
    } 
    if (this.d)
      D.c("Gathering HWID!!!!!"); 
    long l = System.currentTimeMillis();
    aa aa = new aa();
    aa.a();
    byte b1 = 0;
    p p = new p(this, paramb);
    q q = new q(this, paramb);
    r r = new r(this, paramb);
    s s = new s(this, paramb);
    p.start();
    q.start();
    r.start();
    s.start();
    do {
      try {
        Thread.sleep(10L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(o.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } while (System.currentTimeMillis() - l < 4000L && (!q.a() || !r.a() || !s.a()));
    if (this.d) {
      D.c("Time to get: " + aa.d());
      aa.e();
      aa.a();
    } 
    String str1 = r.b();
    if (str1 != null && str1.length() > 0) {
      paramb.a(str1);
      if (this.d)
        D.c("m:" + str1); 
      b1++;
    } 
    String str2 = s.b();
    if (str2 != null && !str2.isEmpty()) {
      if (this.d)
        D.c("mbId:" + str2); 
      paramb.c(str2);
      b1++;
    } 
    String str3 = q.b();
    if (str3 != null && str3.length() > 0) {
      if (this.d)
        D.c("hdId:" + str3); 
      paramb.b(str3);
      b1++;
    } 
    if (!p.a() && (b1 < 2 || g))
      do {
        try {
          Thread.sleep(10L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(o.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } while (!p.a()); 
    String str4 = p.b();
    if (str4 != null && str4.length() > 5) {
      if (this.d)
        D.c("cpuId:" + str4); 
      paramb.i(str4);
      b1++;
    } 
    if (b1 == 0)
      throw new g("No Identifiers available."); 
    D.c("hid: " + aa.d());
    a(paramb);
    return paramb;
  }
  
  public void g() {
    a a = b();
    if (a != null && a.h().before(new Date(System.currentTimeMillis() + 1209600000L)) && n.b()) {
      a a1 = null;
      try {
        a1 = e();
        d d1 = a(a1);
        if (d1.a() == 0)
          c(a1); 
      } catch (g g) {
      
      } catch (b b) {
      
      } catch (e e) {}
    } 
  }
  
  public synchronized d h() {
    return a(this.e);
  }
  
  public synchronized d a(d paramd) {
    d d1 = this.e;
    this.e = paramd;
    try {
      d d2 = c();
      if (g && d2.a() == 0)
        d2.a(1); 
      if (d2.a() == 0) {
        a a = b();
        if (a != null && a.h().before(new Date(System.currentTimeMillis() + 604800000L)) && n.b()) {
          a a1 = null;
          try {
            a1 = e();
            d d3 = a(a1);
            if (d3.a() == 0)
              c(a1); 
          } catch (g g) {
          
          } catch (b b) {
          
          } catch (e e) {}
        } 
        return d2;
      } 
      if (d2.a() == 1) {
        if (n.b()) {
          a a = null;
          try {
            a = e();
            d2 = a(a);
            if (d2.a() == 0) {
              c(a);
              return d2;
            } 
            return d2;
          } catch (g g) {
            a("MISSING_IDENTIFIERS, Expired");
            if (q.a()) {
              d2.a(this.f.a(c.f));
              d2.a(4);
            } else {
              d2.a(this.f.a(c.f));
              d2.a(4);
            } 
            return d2;
          } catch (b b) {
            d2.a(2);
            d2.a(b.getMessage());
            return d2;
          } catch (e e) {
            D.d("Network Error");
          } 
        } 
        return d2;
      } 
      if (n.b()) {
        a("Connected to Internet");
        a a = null;
        try {
          a = e();
          d2 = a(a);
          if (d2.a() == 0) {
            c(a);
            return d2;
          } 
          return d2;
        } catch (g g) {
          a("MISSING_IDENTIFIERS");
          if (q.a()) {
            d2.a(this.f.a(c.f));
            d2.a(4);
          } else {
            d2.a(this.f.a(c.g));
            d2.a(4);
          } 
          return d2;
        } catch (b b) {
          a("MISSING_IDENTIFIERS " + b.getLocalizedMessage());
          d2.a(2);
          d2.a(b.getMessage());
          return d2;
        } catch (e e) {
          D.c("key: kjsdaiie");
          e.printStackTrace();
          if (this.e.j())
            return a(this.e, ""); 
          d2.a(2);
          d2.a("Unable to connect to Activativon Server");
          return d2;
        } 
      } 
      if (this.e.j())
        return a(this.e, (String)null); 
      d2.a(2);
      d2.a("Unable to connecto Activativon Server");
      return d2;
    } finally {
      this.e = d1;
    } 
  }
  
  public d a(d paramd, String paramString) {
    String str = (paramString != null && !paramString.equals("")) ? (paramString + "\n" + c.d(this.f)) : c.d(this.f);
    if (bV.a(str, paramd.i(), true)) {
      a(paramd);
    } else {
      try {
        b b = i();
        f f = new f(paramd.i(), paramd, this.f, b);
        f.pack();
        bV.b(f);
        f.setResizable(false);
        f.setVisible(true);
        a a = f.b();
        if (a != null) {
          d d1 = a(a);
          if (d1.a() == 0) {
            c(a);
            bV.d(this.f.a(c.a), f);
          } 
          return d1;
        } 
      } catch (g g) {
        d d1 = new d();
        if (q.a()) {
          d1.a(this.f.a(c.f));
          d1.a(4);
        } else {
          d1.a(this.f.a(c.f));
          d1.a(4);
        } 
        return d1;
      } catch (b b) {
        d d1 = new d();
        d1.a(2);
        d1.a(b.getMessage());
        return d1;
      } 
    } 
    return null;
  }
  
  public d c() {
    a a = b();
    if (a == null || !a.d().equals(this.e.d())) {
      d d1 = new d();
      d1.a(2);
      d1.a(d.a);
      a("MISSING_IDENTIFIERS: " + a);
      return d1;
    } 
    return a(a);
  }
  
  public synchronized b i() {
    b b = a();
    b.d(this.e.d());
    b.f(this.e.e());
    b.e(this.e.h());
    b.g(this.e.f());
    String str = X.b(this.e.g(), "(Beta)", "");
    b.h(str);
    b = b(b);
    boolean bool = false;
    if (bool)
      b.d("RZ7R7P6F7WPA2IM36A6M"); 
    return b;
  }
  
  public static void a(boolean paramBoolean) {
    g = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */