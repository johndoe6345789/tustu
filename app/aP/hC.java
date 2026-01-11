package aP;

import A.c;
import G.J;
import G.R;
import G.T;
import G.aI;
import G.bT;
import G.cR;
import G.cV;
import G.cu;
import G.h;
import G.i;
import G.l;
import G.r;
import G.s;
import J.a;
import J.b;
import V.a;
import W.I;
import W.ab;
import W.v;
import W.z;
import aD.a;
import aE.a;
import aV.w;
import bH.D;
import bH.t;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fL;
import com.efiAnalytics.ui.fS;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import r.a;
import r.b;
import r.j;
import r.o;
import r.p;
import s.g;
import v.c;
import z.c;

public class hC implements fS {
  aF a = new aF();
  
  au b = new au();
  
  b c = new b();
  
  ad d = new ad();
  
  aG e = null;
  
  hE f = null;
  
  fL g = null;
  
  Window h = null;
  
  R i = null;
  
  public hC(Window paramWindow) {
    this.h = paramWindow;
    hD hD = new hD(this);
    this.g = new fL("New " + a.b + " Project", hD);
    try {
      this.g.e(this.b);
      this.b.a(false);
      this.f = new hE(this, this.a);
      this.g.e(this.f);
      this.g.e(this.d);
      this.g.e((Container)this.c);
      this.c.a();
      this.g.a(this);
    } catch (Exception exception) {
      String str = "Failed to build New Project Wizard, see log for details.";
      bV.d(str, paramWindow);
      D.a(str);
      exception.printStackTrace();
    } 
  }
  
  public void a() {
    JDialog jDialog = this.g.a(this.h, g.b("Create New Project"));
    if (T.a().c() != null)
      T.a().c().C().c(); 
    jDialog.setVisible(true);
  }
  
  public boolean b() {
    a a = new a();
    a.h(this.b.g().getAbsolutePath());
    a.i(this.b.f());
    if (a.A() != null) {
      f.a().g();
      if (this.i != null)
        try {
          h.a().a((aI)this.i);
          T.a().a(this.i);
          T.a().a(this.i.c());
        } catch (a a1) {
          Logger.getLogger(hC.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        }  
    } 
    try {
      a.a();
      File file1 = this.b.h();
      String str1 = file1.getName().toLowerCase().endsWith(".ecu") ? "mainController.ecu" : "mainController.ini";
      a.l(str1);
      a.remove("firmwareDescription");
      t.a(file1, a.j());
      a.p(this.b.c());
      a.a(this.a.b());
      File file2 = this.c.b();
      Z z = this.c.e();
      t.a(file2, a.l());
      String str2 = z.a(file1);
      z.b(str2);
      c c = new c(j.G());
      c.a(a.l().getAbsolutePath(), z);
      a.o(a.n());
      try {
        if (this.e != null)
          this.e.c(); 
      } catch (a a1) {
        D.a("Error saving throttle calibration.", (Exception)a1, this.e);
      } 
      try {
        String str = (this.d.f() == null) ? "" : this.d.f();
        a.a(a.u(), this.d.d());
        a.b(a.u(), str);
        this.d.a(a);
      } catch (Exception exception) {}
      this.d.a(a);
      a.b();
      T.a().b();
      this.c.d();
      c();
      f.a().a(dd.a().c(), this.b.g().getAbsolutePath());
    } catch (a a1) {
      bV.d("Error creating Project " + this.b.f() + "\nProject Location:" + this.b.g().getAbsolutePath() + "\nError Message:\n" + a1.getMessage() + "\nSee log for more detail.\nBy restarting " + a.b + " and opening this project,\n all will most likely be fine.", (Component)this.c);
      a1.printStackTrace();
      return false;
    } 
    return true;
  }
  
  public void c() {
    this.c.d();
    R r = this.i;
    if (r != null) {
      J j = r.C();
      if (j != null)
        j.c(); 
      T.a().b(r.c());
    } 
    if (T.a().c() != null)
      try {
        T.a().c().C().d();
      } catch (l l) {} 
    i.a();
  }
  
  public boolean a(Container paramContainer) {
    if (paramContainer instanceof au) {
      boolean bool = ((au)paramContainer).e();
      if (!bool)
        return false; 
      try {
        s[] arrayOfS = v.a().b(this.b.h().getAbsolutePath());
        arrayOfS = (new I()).a(arrayOfS, this.b.h().getAbsolutePath());
        this.a.a(arrayOfS);
      } catch (a a) {
        bV.d(a.getMessage(), this.h);
      } 
      return true;
    } 
    if (paramContainer instanceof aF)
      return ((aF)paramContainer).e(); 
    if (paramContainer instanceof b)
      return ((b)paramContainer).f(); 
    if (paramContainer instanceof aG) {
      cu cu = cu.a();
      cu.a((aG)paramContainer);
    } 
    return true;
  }
  
  private R d() {
    if (this.i != null) {
      this.i.q(this.b.b());
      return this.i;
    } 
    if (this.b.h() == null)
      return null; 
    R r = new R();
    r.a(this.b.f());
    r.q(this.b.b());
    r[] arrayOfR = this.a.b();
    for (byte b1 = 0; b1 < arrayOfR.length; b1++)
      r.a(arrayOfR[b1]); 
    ab ab = new ab();
    try {
      if (r.c("tsCanId") == null)
        r = ab.a(r, j.G, false); 
      r = ab.a(r, this.b.h().getCanonicalPath());
      r.q(this.b.g().getAbsolutePath());
      r.c(c.a().a(r, a.ba, w.c(), null, null));
      T.a().a(r);
      if (a.b.equals(a.as)) {
        a a = new a();
        r.O().a((cR)a);
        b b2 = new b();
        r.O().a((cV)b2);
        r.O().d(true);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bV.d("Error loading ECU configuration.\nMessage:\n" + exception.getMessage(), this.d);
      return null;
    } 
    this.i = r;
    return this.i;
  }
  
  public boolean b(Container paramContainer) {
    if (paramContainer.equals(this.f)) {
      aF aF1 = this.a;
      s[] arrayOfS = aF1.c();
      if (arrayOfS == null || arrayOfS.length == 0)
        this.g.a(); 
    } else if (paramContainer instanceof ad) {
      ad ad1 = (ad)paramContainer;
      R r = d();
      try {
        String str = this.b.i();
        List<c> list = this.b.j();
        bT bT = this.b.k();
        ad1.k();
        ad1.a(r);
        if (list != null && str != null) {
          ad1.a("DetectedDevice", str, list, bT);
          ad1.c();
        } else {
          list = new ArrayList();
          list.add(new c("Baud Rate", a.c));
          ad1.a("DetectedDevice", a.d, list, new bT());
        } 
      } catch (a a) {
        D.a("Error setting configuration to comm settings.", (Exception)a, ad1);
      } 
    } else if (paramContainer instanceof b) {
      R r = d();
      aa aa = new aa();
      try {
        Z z;
        if (r.i().startsWith("MS3 Format") && (r.i().endsWith("P") || r.i().endsWith("E") || r.i().endsWith("U"))) {
          File file = new File(j.h(), "AMPMS3_Pro_Default.dash");
          z = (new c(j.G())).a(file.getAbsolutePath());
        } else if (r.i().startsWith("MS2Extra") && r.i().endsWith("P")) {
          File file = new File(j.h(), "AMP_MS2_PNP.dash");
          z = (new c(j.G())).a(file.getAbsolutePath());
        } else {
          z = aa.a(r, "FrontPage", 2, 4);
        } 
        this.c.a(this.b.f(), z);
      } catch (Exception exception) {
        bV.d("Error in Front Page definition.", paramContainer);
      } 
      o o = p.a().b();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = r.i();
      this.c.a(arrayOfString, o);
    } else if (paramContainer instanceof aG) {
      R r = d();
      aG aG1 = (aG)paramContainer;
      aG1.a(r);
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */