package aP;

import A.j;
import B.g;
import E.c;
import G.S;
import G.T;
import G.X;
import G.aB;
import G.aR;
import G.cI;
import G.cO;
import G.cP;
import G.cX;
import G.cq;
import G.cu;
import G.i;
import I.f;
import I.h;
import I.p;
import I.q;
import J.d;
import K.c;
import L.ab;
import L.h;
import L.m;
import L.n;
import L.r;
import O.a;
import O.b;
import O.c;
import O.d;
import O.e;
import O.f;
import O.g;
import O.h;
import O.i;
import O.j;
import O.k;
import R.b;
import S.b;
import S.g;
import T.a;
import V.a;
import V.g;
import W.D;
import W.ab;
import W.ai;
import W.v;
import X.c;
import Z.a;
import Z.d;
import Z.f;
import aA.h;
import aE.a;
import aE.e;
import aS.a;
import aS.f;
import aS.g;
import aT.a;
import aV.x;
import aW.q;
import aW.r;
import aX.b;
import aZ.n;
import ac.c;
import ac.d;
import ac.e;
import ac.f;
import ac.n;
import ac.u;
import ac.v;
import ai.a;
import ai.e;
import ak.ao;
import ar.f;
import ar.l;
import ax.Q;
import ax.e;
import ay.a;
import ay.l;
import bH.A;
import bH.D;
import bH.P;
import bH.ac;
import bH.b;
import bN.k;
import bP.a;
import bd.a;
import bh.l;
import bl.l;
import bm.a;
import bm.b;
import bm.c;
import bm.d;
import bm.e;
import bn.a;
import bn.b;
import bn.c;
import bn.d;
import br.J;
import bt.M;
import bt.N;
import bt.bQ;
import bt.bu;
import com.efiAnalytics.ui.BinTableView;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cq;
import com.efiAnalytics.ui.dI;
import com.efiAnalytics.ui.fh;
import d.f;
import d.g;
import h.b;
import h.i;
import java.awt.Frame;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.a;
import n.h;
import n.j;
import n.k;
import n.m;
import p.x;
import p.z;
import q.f;
import r.a;
import r.i;
import r.j;
import s.g;
import v.c;
import y.c;
import z.c;
import z.d;

public class hO extends Thread {
  Frame a = null;
  
  int b = 2000;
  
  public hO(Frame paramFrame) {
    super("PreLoader");
    setDaemon(true);
    this.a = paramFrame;
    a();
  }
  
  public void a() {
    D.a(new hP(this));
    j.a().a(hq.a());
    g();
    hq.a().a("Initializing File Dialogs.");
    D.a(new hU(this));
    v.a((ai)new n());
    bV.a(new id());
    a.e = System.currentTimeMillis();
    i.b = a.e;
    hV hV = new hV(this);
    bV.a(hV);
    bQ.a().a(hV);
    ac.a().a(hV);
    c.a().b(new File(j.A(), "cache"));
    cu.a().a(f.a, (cq)c.a());
    try {
      bV.g();
    } catch (Exception exception) {
      D.b("Error inilizing FileDialog");
      exception.printStackTrace();
    } 
    jA jA = jA.a();
    T.a().a(jA);
    if (a.b.equals(a.as)) {
      a a = new a();
      jA.a((iH)a);
      T.a().a(new hF());
    } 
    j.u();
  }
  
  public void b() {
    a(a.b, a.c);
    h();
    f.a().a((e)bQ.a());
    f.a().a(new hW(this));
    f.a().a((e)J.a());
    e e = new e();
    g.a().a(e);
    df df = new df();
    if (i.a().a("09jtrkgds;okfds"))
      d(); 
    hq.a().a("Initializing Help.");
    df.a();
    hq.a().a("Initializing Edition Features.");
    j();
    hq.a().a("Initializing App Events.");
    i();
    T.a().a((S)new g());
    T.a().a((S)new a());
    T.a().a((S)b.a());
    aB.a().a(bV.e());
    c.a().a((f)new f());
    D.c("App Name:" + a.b + ", appEdition:" + a.c);
    f.a().a(new hX(this));
    if (i.a().a("oifgytrewalkfgyuewq87/ "))
      c.a(); 
    if (i.a().a("432;'g[pf-025;h;'")) {
      Q.a((e)n.a());
      h.a(true);
      i.c = true;
      q q = new q();
      q.a();
    } else {
      Q.a((e)new m());
      h.a(false);
    } 
    ab.a().a(i.a().a("98ua7h9uh432987 432"));
    Q.a((e)ab.a());
    ab.a().a((r)new a());
    h.a();
    if (i.a().a(" OKFDS09IFDSOK")) {
      hq.a().a("Initializing Log Viewer Components.");
      i.b = "LogViewer";
      f.a().a((l)l.b());
      if (a.b.equals(i.v) || a.b.equals(i.w)) {
        b.a().a(b.j, b.f);
      } else {
        b.a().a(b.j, b.g);
      } 
      f.a().a((d)new a());
      ao.a(new ic(this));
    } 
    fh.a(a.a().a(a.bR, a.bS));
    if (i.a().a("sa0-0o0os-0o-0DS"))
      b.a().a(new hY(this)); 
    T.a().a(new hZ(this));
    p.a().a(i.a().a("lkjdsa0iu0-,jew"));
    c.a(false);
    a.c(j.q());
    aR.a().a((cI)new a());
    k();
  }
  
  public void c() {
    a.a().a("helpManuals", (e)new a());
    double d = a.a().a(a.ai, 100.0D);
    bu.a(d);
    ab.c = j.H();
    ab.b = j.I();
    P p = new P(ab.b, P.b);
    p.a();
    try {
      P p1 = new P(j.c(), P.a);
      p1.a();
    } catch (a a) {
      D.a(a.getLocalizedMessage());
    } 
    n.a = a.a().b() + " version " + a.a;
    A.i().a("TunerStudio", "MS", "https://www.efianalytics.com/TunerStudio/download/");
    A.i().a("TunerStudio", "MS Ultra", "https://www.efianalytics.com/TunerStudio/download/");
    A.i().a("TunerStudio", "MS Dev", "https://www.efianalytics.com/TunerStudio/download/");
    A.i().a("MegaLogViewer", "MS", "https://www.efianalytics.com/MegaLogViewer/download/");
    A.i().a("MegaLogViewer", "HD", "https://www.efianalytics.com/MegaLogViewerHD/download/");
    A.i().a("MegaLogViewer", "BigStuff3", "http://www.bigcommpro.com/downloads");
    A.i().a("Shadow Dash MS", "", "https://www.tunerstudio.com/index.php/downloads");
    A.i().a("Big Dash", "", "http://www.bigcommpro.com/software/bigdash");
    A.i().a("Big Replay Upload", "", "http://www.bigcommpro.com/software/bigreplay");
    A.i().a("BigComm", "Pro", "http://bigcommpro.com/software/bigcomm-pro");
    A.i().a("BigComm", "Pro Single", "http://bigcommpro.com/software/bigcomm-pro");
    A.i().a("TS Dash", "Pro", "https://www.efianalytics.com/TunerStudio/download/");
    A.i().a("TS Dash", "Pro Ultra", "https://www.efianalytics.com/TunerStudio/download/");
    h.a().a(new ia(this));
    if (i.a().a(" 09s98r32-po3q9264"))
      u.a().a((v)new m()); 
    boolean bool = a.a().a(a.cg, a.ch);
    BinTableView.i(bool);
    hq.a().a("Loading Font list.");
    e();
    hq.a().a("");
    b b = new b();
    b.start();
    f();
    hq.a().a("Initializing UI Components.");
    f.a();
    if (i.a().a("poij  fdsz poi9ure895 ms7(")) {
      z.a().b();
      g.a().a((f)z.a());
    } 
    if (i.a().a("f(*&rew0987LKJ098342")) {
      x.a().b();
      b.a().a((g)x.a());
      T.a().a((S)a.a());
    } 
    if (i.a().a("bd098fsdpokfdslk") && x.a().c()) {
      hq.a().a("Initializing GPS.");
      try {
        x.a().d();
      } catch (Exception exception) {
        bV.d("Failed to initalize GPS:\n" + exception.getLocalizedMessage(), dd.a().c());
        Logger.getLogger(hO.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
    f.a().a((b)D.a());
    if (i.a().a("GD;';LFDS-0DSL;")) {
      r.a().a("Not Listed Bluetooth", (q)new b());
      boolean bool1 = false;
      if (bool1)
        (new M()).a(10000); 
    } 
    k.a(a.a().j());
    try {
      l.a().a(j.c());
      k.a();
    } catch (a a) {
      bV.d(a.getLocalizedMessage(), this.a);
    } 
    c.a().a(c.d, (a)new b());
    c.a().a(c.c, (a)new d());
    c.b();
    if (!a.c().e())
      a.c().g(); 
    hq.a().a("Ready");
    if (i.a().a("_(*UR98ewf098u 98EE 2  *(W"))
      dI.a().a(new ib(this)); 
  }
  
  private void f() {
    boolean bool = (a.a().a(a.dj, false) && !a.a().a(a.dk, false)) ? true : false;
    if (bool) {
      f.a().B();
      a.a().b(a.dk, "true");
    } 
  }
  
  public void d() {
    hq.a().a("Initializing Plugin Services.");
    try {
      l.b();
    } catch (a a) {
      bV.d("Failed to initialize Plugin Server, plugin support is disabled.\nreported error:" + a.getMessage() + "\nCheck log for more information.", this.a);
    } catch (NoClassDefFoundError noClassDefFoundError) {
      bV.d("Failed to initialize Plugin Server, plugin support is disabled.\nreported error: TunerStudioPlugin.jar not found\nCheck log for more information.", this.a);
      return;
    } 
    hq.a().a("Loading Plugins.");
    try {
      l.a().d();
    } catch (a a) {
      bV.d("Failed to initialize Plugins.\nreported error:" + a.getMessage() + "\nCheck log for more information.", this.a);
    } 
  }
  
  private void g() {}
  
  public void run() {
    try {
      Thread.currentThread();
      Thread.sleep(this.b);
      c();
    } catch (Exception exception) {
      D.c("Preload Thread Died");
      exception.printStackTrace();
    } 
  }
  
  public static String[] e() {
    cq.a().a(j.F());
    return cq.a().c();
  }
  
  private void a(String paramString1, String paramString2) {
    if (paramString2.equals(i.f) || paramString2.equals(i.o) || paramString2.equals(i.g) || paramString2.equals(i.p) || paramString1.equals(i.B)) {
      X.a().a((cX)new e());
      X.a().a((cX)new g());
      X.a().a((cX)new i());
      X.a().a((cX)new k());
      X.a().a((cX)new d());
      X.a().a((cX)new h());
      if (i.a().a("kjlkgoi098")) {
        g.a().a(21848);
        g.a().d();
      } 
      if (paramString2.equals(i.g) || paramString2.equals(i.p))
        X.a().a((cX)new a()); 
    } else if (paramString2.equals(i.h) || paramString2.equals(i.i)) {
      X.a().a((cX)new e());
      X.a().a((cX)new g());
      X.a().a((cX)new i());
      X.a().a((cX)new k());
      X.a().a((cX)new d());
      X.a().a((cX)new h());
      X.a().a((cX)new a());
      X.a().a((cX)new f());
      if (i.a().a("kjlkgoi098")) {
        g.a().a(21848);
        g.a().d();
        hQ hQ = new hQ(this);
        h.a(hQ);
        h.a().a(true);
      } 
    } else if (paramString1.equals(a.av) || paramString1.equals(a.aw)) {
      X.a().a((cX)new j());
    } else if (paramString1.equals(a.as)) {
      X.a().a((cX)new c());
      if (i.a().a("H;';'0FD;RE")) {
        X.a().a((cX)new b());
        hR hR = new hR(this);
        h.a(hR);
        g.a().a(21846);
        g.a().a(21847);
        g.a().d();
      } 
      c.a().a((d)new e());
      T.a().a(new hS(this));
    } else if (paramString1.equals(a.at)) {
      X.a().a((cX)new b());
      c.a().a((d)new e());
      hT hT = new hT(this);
      h.a(hT);
      g.a().a(21846);
      g.a().a(21847);
      g.a().d();
    } else {
      X.a().a((cX)new h());
      X.a().a((cX)new d());
    } 
  }
  
  private void h() {
    String str = a.a().a(a.aE, "MegaSquirt_001");
    if (str.equals("MegaSquirt_001")) {
      try {
        cP.a().a((cO)new d());
      } catch (g g) {
        D.b("Failed to create ProtocolInitializer: " + str);
        Logger.getLogger(hO.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } 
    } else if (str.equals("disabled") || str.equals("")) {
      D.d("ProtocolInitializer disabled");
    } else {
      D.d("Unknown ProtocolInitializer: '" + str + "', disabled");
    } 
    if (!i.a().a(";lgd;lgd09h;l "))
      try {
        d d = new d();
        d.a(c.e);
        d.b(g.b("Standard Protocols Driver"));
        c.a().a(d);
      } catch (Exception exception) {
        D.a("Failed to load Common MegaSquirt Driver, it will be unavailable.");
      }  
    if (i.a().a("HF-0[PEPHF0H;LJGPO0"))
      try {
        d d = new d();
        d.a(c.f);
        d.b(g.b("Dash Echo Client"));
        c.a().a(d);
      } catch (Exception exception) {
        D.a("Failed to load Remote Connection Driver, it will be unavailable.");
      }  
    if (i.a().a("HF-05[P54;'FD"))
      try {
        d d = new d();
        d.a(c.f);
        d.b(g.b("BigStuff Gen4 Driver"));
        c.a().a(d);
      } catch (Exception exception) {
        D.a("Failed to load Common MegaSquirt Driver, it will be unavailable.");
      }  
    j.a().a(R.a());
    j.a().a(a.f);
  }
  
  private void i() {
    cu cu = cu.a();
    cu.d("controllerSettingsLoaded");
  }
  
  private void j() {
    if (i.a().a("joijt;i609tr0932"))
      BinTableView.f(true); 
  }
  
  private void k() {
    M.a().a((N)new c());
    M.a().a((N)new b());
    M.a().a((N)new a());
    M.a().a((N)new e());
    M.a().a((N)new d());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */