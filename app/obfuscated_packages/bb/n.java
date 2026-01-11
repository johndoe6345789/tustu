package bb;

import G.T;
import V.a;
import aE.a;
import aP.dd;
import aP.iP;
import ae.c;
import ae.f;
import ae.k;
import ae.m;
import ae.p;
import ae.q;
import ae.r;
import c.a;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.fL;
import com.efiAnalytics.ui.fS;
import java.awt.Container;
import java.awt.Window;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import r.a;
import r.i;
import r.j;
import s.g;

public class n implements fS {
  fL a = null;
  
  p b = new p();
  
  d c = new d(this.b, !i.a().a(";'gdfdhg-0hg"));
  
  E d = new E();
  
  L e = new L();
  
  a f = new a();
  
  c g = new c(true);
  
  v h = new v();
  
  c i = new c(false);
  
  k j = new k("Install & Update Firmware", false);
  
  k k = new k("Firmware Read Me", false);
  
  k l = new k("Firmware License", true);
  
  k m = new k("Firmware Release Notes", false);
  
  x n = new x();
  
  f o = null;
  
  boolean p = false;
  
  JDialog q = null;
  
  private static File r = new File(j.C(), "firmwareLoader/firmwareLoaderIntro.html");
  
  public n() {
    this.a = new fL("Firmware Update Utility", g.d());
    this.j.a(true);
    File file = r;
    try {
      this.j.a(file);
      this.a.e(this.j);
    } catch (Exception exception) {
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, exception);
      u u = new u(g.d());
      this.a.e(u);
    } 
    if (a.A() != null && i.a().a("09RGDKDG;LKIGD"))
      this.a.e(this.f); 
    this.a.e(this.c);
    this.a.e(this.d);
    this.a.e(this.e);
    this.a.e(this.l);
    this.a.e(this.k);
    this.a.e(this.m);
    this.a.e(this.g);
    this.a.e(this.h);
    if (T.a().c() != null)
      this.a.e(this.n); 
    this.a.a(this);
    try {
      iP.a().a(new o(this));
    } catch (a a1) {
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
  }
  
  public boolean b() {
    dd.a().b(this.q);
    for (byte b = 0; b < this.a.e(); b++) {
      if (this.a.a(b) instanceof bc)
        ((bc)this.a.a(b)).close(); 
    } 
    return true;
  }
  
  public void c() {
    dd.a().b(this.q);
    for (byte b = 0; b < this.a.e(); b++) {
      if (this.a.a(b) instanceof bc)
        ((bc)this.a.a(b)).close(); 
    } 
  }
  
  public boolean a(Container paramContainer) {
    if (paramContainer.equals(this.c)) {
      if (this.c.g() == null) {
        String str = g.b("Please detect Hardware before continuing.");
        bV.d(str, paramContainer);
        return false;
      } 
      if (this.c.g().e() == null) {
        String str = g.b("Unknown Hardware detected.");
        str = str + "\n";
        str = str + g.b("Are you sure you wish to continue?");
        return bV.a(str, paramContainer, true);
      } 
      this.c.h();
      this.p = this.n.a();
    } else if (paramContainer.equals(this.d)) {
      k k1 = this.d.a();
      m m = this.c.g().e();
      if (k1 == null) {
        String str = g.b("No Firmware Selected!");
        str = str + "\n" + g.b("You must select a firmware to load.");
        bV.d(str, paramContainer);
        return false;
      } 
      if (!k1.a()) {
        String str = g.b("No valid Firmware file in selected package!");
        str = str + "\n" + g.b("Please select a valid firmware to load.");
        bV.d(str, paramContainer);
        return false;
      } 
      List<q> list = r.a().a(k1, m);
      if (list.size() == 1) {
        this.a.a(this.e);
        q q = list.get(0);
        this.e.a(list);
        File file = k1.g();
        if (file == null) {
          String str = g.b("You must select a Firmware File to proceed.");
          bV.d(str, paramContainer);
          return false;
        } 
        if (!q.b(m, file)) {
          String str1 = (this.c.g() != null) ? a.a(this.c.g().b(), a.f) : "";
          String str2 = g.b(a.b + " cannot validate that the selected firmware File is correct for your " + a.a(str1, a.f) + ".");
          str2 = str2 + "\n" + g.b("Only proceed if you are confident the select file is correct.") + "\n";
          List list1 = q.b(m);
          if (list1 != null && !list1.isEmpty()) {
            str2 = str2 + "\n" + g.b("Detected Controller:") + " - " + m.a();
            str2 = str2 + "\n" + g.b("Expected Firmware File(s):") + "\n";
            for (String str : list1)
              str2 = str2 + " - " + str + "\n"; 
          } 
          str2 = str2 + "\n" + g.b("Are you sure you want to load the selected firmware?");
          return bV.b(str2, paramContainer, true);
        } 
      } else {
        this.e.a(list);
        this.a.b(this.e);
      } 
    } else if (paramContainer.equals(this.l)) {
      if (this.l.a()) {
        String str = g.b("You must accept the Firmware License Agreement to proceed.");
        bV.d(str, paramContainer);
        return false;
      } 
    } else if (paramContainer.equals(this.e)) {
      if (this.e.a() == null) {
        String str = g.b("No Firmware Loader selected, cannot continue.");
        bV.d(str, paramContainer);
        return false;
      } 
    } else {
      if (paramContainer.equals(this.g))
        return this.g.a(); 
      if (paramContainer.equals(this.i))
        return this.i.a(); 
      if (paramContainer.equals(this.h))
        return this.h.a(); 
      if (paramContainer.equals(this.n)) {
        if (this.n.e())
          return !this.n.d(); 
        String str = g.b("Are you sure you want to exit without restoring your Tune Settings?");
        return bV.a(str, paramContainer, true);
      } 
    } 
    return true;
  }
  
  public boolean b(Container paramContainer) {
    if (paramContainer.equals(this.e)) {
      k k1 = this.d.a();
      m m = this.c.g().e();
      this.e.a(k1, m);
      if (this.e.b() == 1);
    } else if (paramContainer.equals(this.c)) {
      if (a.A() != null) {
        this.c.c();
        this.c.f();
      } else {
        this.c.d();
      } 
    } else if (paramContainer.equals(this.d)) {
      m m = this.c.g().e();
      this.d.a(m);
    } else if (paramContainer.equals(this.k)) {
      k k1 = this.d.a();
      if (k1.e() != null && k1.e().exists()) {
        try {
          this.k.a(k1.e());
        } catch (a a1) {
          bV.d(g.b("Firmware ReadMe File not found."), paramContainer);
          Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        } 
      } else {
        return false;
      } 
    } else if (paramContainer.equals(this.l)) {
      k k1 = this.d.a();
      if (k1.f() != null && k1.f().exists()) {
        try {
          this.l.a(k1.f());
        } catch (a a1) {
          bV.d(g.b("Firmware License File not found."), paramContainer);
          Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        } 
      } else {
        this.l.b.setSelected(true);
        this.a.a(this.l);
        return false;
      } 
    } else if (paramContainer.equals(this.m)) {
      k k1 = this.d.a();
      if (k1.i() != null && k1.i().exists()) {
        try {
          this.m.a(k1.i());
        } catch (a a1) {
          bV.d(g.b("Release Notes File not found."), paramContainer);
          Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        } 
      } else {
        return false;
      } 
    } else if (paramContainer.equals(this.g)) {
      q q = this.e.a();
      if (q == null) {
        bV.d(g.b("No valid Firmware Loader Driver found or selected."), paramContainer);
        return false;
      } 
      a();
      k k1 = this.d.a();
      if (c.c(q.c(), k1)) {
        this.g.a(q, k1);
        this.a.b(paramContainer);
      } else {
        this.a.a(paramContainer);
        return false;
      } 
    } else if (paramContainer.equals(this.i)) {
      q q = this.e.a();
      if (q == null) {
        bV.d(g.b("No valid Firmware Loader Driver found or selected."), paramContainer);
        return false;
      } 
      k k1 = this.d.a();
      if (c.d(q.d(), k1)) {
        this.a.b(paramContainer);
        this.i.a(q, k1);
      } else {
        this.a.a(paramContainer);
        return false;
      } 
    } else if (paramContainer.equals(this.h)) {
      this.h.a(a());
      this.a.a(false);
    } else if (paramContainer.equals(this.n)) {
      this.n.a(this.d.a(), this.e.a(), this.b);
    } 
    return true;
  }
  
  public void a(Window paramWindow) {
    String str = g.b("Firmware Update Utility");
    this.q = this.a.a(paramWindow, str);
    dd.a().a(this.q);
    this.q.setVisible(true);
  }
  
  private f a() {
    if (this.o == null) {
      q q = this.e.a();
      q.a(this.c.g().b());
      this.o = new f(q, this.d.a(), this.c.i());
    } else {
      q q = this.e.a();
      q.a(this.c.g().b());
      this.o.a(q);
      this.o.a(this.d.a());
      this.o.a(this.c.i());
    } 
    return this.o;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */