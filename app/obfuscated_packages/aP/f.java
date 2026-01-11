package aP;

import A.s;
import B.b;
import B.i;
import B.m;
import B.s;
import D.a;
import D.c;
import G.R;
import G.T;
import G.Y;
import G.aR;
import G.aX;
import G.ab;
import G.aj;
import G.bI;
import G.bM;
import G.bv;
import G.cQ;
import G.cb;
import G.cj;
import G.cq;
import G.cu;
import G.cx;
import G.db;
import G.i;
import G.l;
import G.m;
import G.n;
import G.r;
import G.s;
import I.k;
import J.h;
import K.b;
import K.e;
import L.l;
import N.a;
import Q.a;
import S.b;
import S.j;
import S.l;
import U.b;
import V.a;
import V.e;
import V.g;
import W.A;
import W.B;
import W.C;
import W.D;
import W.I;
import W.O;
import W.P;
import W.U;
import W.aA;
import W.aa;
import W.af;
import W.aj;
import W.ak;
import W.ap;
import W.ar;
import W.av;
import W.n;
import W.o;
import W.v;
import W.z;
import Y.a;
import Y.c;
import aA.a;
import aA.h;
import aE.a;
import aE.e;
import aL.a;
import aM.a;
import aN.a;
import aN.e;
import aV.a;
import aV.g;
import aV.x;
import aY.a;
import aY.j;
import aY.l;
import aY.s;
import aZ.e;
import aa.a;
import aa.e;
import ac.D;
import ac.a;
import ac.b;
import ac.c;
import ac.h;
import ac.u;
import ac.y;
import ai.b;
import ai.d;
import ao.hx;
import bD.I;
import bH.D;
import bH.F;
import bH.J;
import bH.M;
import bH.X;
import bH.b;
import bH.n;
import bH.t;
import bQ.l;
import bS.o;
import bS.r;
import ba.a;
import bd.a;
import be.C;
import be.a;
import bg.a;
import bl.h;
import bl.l;
import bn.a;
import bn.c;
import bn.e;
import bt.bH;
import bt.bQ;
import bw.a;
import c.a;
import com.efiAnalytics.apps.ts.dashboard.T;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.apps.ts.dashboard.ab;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.plugin.ApplicationPlugin;
import com.efiAnalytics.tunerStudio.panels.F;
import com.efiAnalytics.tunerStudio.panels.J;
import com.efiAnalytics.tunerStudio.panels.g;
import com.efiAnalytics.tuningwidgets.panels.W;
import com.efiAnalytics.tuningwidgets.panels.X;
import com.efiAnalytics.tuningwidgets.panels.ac;
import com.efiAnalytics.tuningwidgets.panels.g;
import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.ck;
import com.efiAnalytics.ui.cq;
import com.efiAnalytics.ui.dF;
import com.efiAnalytics.ui.dM;
import com.efiAnalytics.ui.dO;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import h.i;
import i.c;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Insets;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import n.n;
import n.o;
import p.B;
import p.J;
import p.a;
import p.x;
import p.z;
import r.a;
import r.i;
import r.j;
import r.n;
import s.g;
import v.c;
import z.e;
import z.m;

public class f {
  private static f c = null;
  
  private List d = Collections.synchronizedList(new ArrayList());
  
  private List e = Collections.synchronizedList(new ArrayList());
  
  private HashMap f = new HashMap<>();
  
  private HashMap g = new HashMap<>();
  
  private int h = 0;
  
  List a = new ArrayList();
  
  private boolean i = false;
  
  private Runnable j = new g(this);
  
  boolean b = false;
  
  private HashMap k = new HashMap<>();
  
  public static f a() {
    if (c == null)
      c = new f(); 
    return c;
  }
  
  private void f(R paramR) {
    for (jK jK : this.a)
      jK.a(paramR); 
  }
  
  private void g(R paramR) {
    for (jK jK : this.a)
      jK.b(paramR); 
  }
  
  private void h(R paramR) {
    for (jK jK : this.a)
      jK.c(paramR); 
  }
  
  private void i(R paramR) {
    for (jK jK : this.a)
      jK.d(paramR); 
  }
  
  public void a(e parame) {
    this.e.add(parame);
  }
  
  public void b(e parame) {
    this.e.remove(parame);
  }
  
  private void U() {
    R r = T.a().c();
    a a = a.A();
    for (e e : this.e)
      e.a(a, r); 
  }
  
  private void V() {
    Iterator<e> iterator = this.e.iterator();
    while (iterator.hasNext())
      ((e)iterator.next()).e_(); 
    cb.a().b();
  }
  
  private void a(a parama) {
    Iterator<e> iterator = this.e.iterator();
    while (iterator.hasNext())
      ((e)iterator.next()).a(parama); 
  }
  
  public void a(Window paramWindow) {
    if (T.a().c() != null) {
      R r = T.a().c();
      if (r.O().al().equals("XCP")) {
        aV aV = new aV(paramWindow);
      } else {
        D.c("Loaded Configuration loaded not using XCP.");
      } 
    } else {
      D.c("No Configurations loaded to show DAQ Report on.");
    } 
  }
  
  public void b(Window paramWindow) {
    n n = dd.a().m();
    if (n == null || !n.getTitleAt(n.getSelectedIndex()).equals(hb.r))
      (new hC(paramWindow)).a(); 
  }
  
  public com.efiAnalytics.tunerStudio.search.f a(com.efiAnalytics.tunerStudio.search.f paramf) {
    boolean bool = paramf.b().equals(o.a);
    a a = new a(paramf.b(), paramf.a(), g.d());
    if (bool) {
      if (paramf.g() != null && paramf.g().c().equals("A"))
        return paramf; 
      if (paramf.g() != null)
        paramf.a(new a()); 
      paramf.g().d(a.a().c(a.cE, ""));
      paramf.g().e(a.a().c(a.cC, ""));
      paramf.g().f(a.a().c(a.cD, ""));
      paramf.g().b(paramf.a());
      paramf.g().c("A");
    } else {
      if (paramf.g() != null && paramf.g().c().equals("A"))
        a.a(paramf.g()); 
      JDialog jDialog = a.a(dd.a().c());
      jDialog.setVisible(true);
      a a1 = a.a();
      paramf.a(a1);
    } 
    return paramf;
  }
  
  public void a(i parami, boolean paramBoolean) {
    com.efiAnalytics.tunerStudio.search.f f1 = new com.efiAnalytics.tunerStudio.search.f();
    f1.a(parami);
    c c = h.a().c(f1.b(), f1.a());
    if (c.a() == 8) {
      bV.d("This Device has been disabled, please Contact support for more information.", dd.a().c());
      return;
    } 
    f1.a(c.b());
    byte b = 0;
    while (!f1.g().c().equals("A")) {
      f1 = a(f1);
      if (b > 3)
        return; 
    } 
    a(f1, paramBoolean);
  }
  
  public void b(com.efiAnalytics.tunerStudio.search.f paramf) {}
  
  public void a(com.efiAnalytics.tunerStudio.search.f paramf, boolean paramBoolean) {
    if (paramf.b().equals(o.a)) {
      b(paramf);
      return;
    } 
    byte b = 0;
    while (!paramf.g().c().equals("A")) {
      paramf = a(paramf);
      if (b > 3)
        return; 
    } 
    File file = null;
    String str = a.a().c(a.U + paramf.a(), "");
    if (paramf.h() != null && paramf.h().b() != null && paramf.h().b().exists()) {
      file = paramf.h().b();
    } else if (str != null && !str.isEmpty()) {
      file = new File(str);
    } 
    JFrame jFrame = dd.a().c();
    i i = j.d(file);
    if (i != null && i.e() != null && !i.e().isEmpty() && !i.e().equals(paramf.a())) {
      D.d("Wrong Project for serial #" + paramf.a());
      file = null;
    } 
    if (file == null || !file.exists()) {
      List<File> list = j.b(paramf.a());
      if (list.size() == 1) {
        file = list.get(0);
      } else if (list.size() > 1) {
        String str1 = "Multiple projects for this serial number found, using: " + ((File)list.get(0)).getName() + "\nIf you wish to use a different project, select:\nFile --> Vehicle Projects --> Open Project";
        bV.d(str1, null);
        file = list.get(0);
      } else {
        file = a(paramf, jFrame);
        if (file == null)
          return; 
      } 
    } 
    a.a().b(a.U + paramf.a(), file.getAbsolutePath());
    H h = new H(this, jFrame, file.getAbsolutePath());
    h.a(paramBoolean);
    h.start();
  }
  
  public File a(com.efiAnalytics.tunerStudio.search.f paramf, Window paramWindow) {
    File file = null;
    b.c().a(paramf.f());
    String str = paramf.d();
    try {
      File file1 = j.a(paramWindow, str);
      if (file1 == null || !file1.exists())
        return null; 
      String str1 = z.a(file1);
      if (str1 != null && !str1.isEmpty())
        str = str1; 
      ie ie = new ie();
      String str2 = "";
      if (paramf.g() != null && paramf.g().e() != null && !paramf.g().e().isEmpty() && paramf.g().f() != null && !paramf.g().f().isEmpty()) {
        str2 = paramf.g().e() + " " + paramf.g().f();
        if (paramf.f().e() != null && !paramf.f().e().isEmpty()) {
          str2 = str2 + " Serial " + paramf.f().e();
        } else {
          str2 = str2 + " Car";
        } 
      } 
      File file2 = new File(j.u(), str2);
      boolean bool = (file2.exists() || !t.a(str)) ? true : false;
      if (bool) {
        boolean bool1 = false;
        do {
          str2 = bV.a(paramWindow, false, g.b("A new project will be created for this " + a.a(str, a.f)) + "\n" + g.b("This will help keep logs and calibration files related to this device organized.") + ".\n\n" + g.b("What would you like to name this project?"), str2);
          if (str2 == null || str2.equals("")) {
            bool1 = false;
          } else {
            file2 = new File(j.u(), str2);
            if (file2.exists()) {
              boolean bool2 = bV.a(g.b("There is already a project by that name.") + "\n" + g.b("Overwrite?"), paramWindow, true);
              if (!bool2) {
                str2 = null;
                bool1 = true;
              } else {
                t.b(file2);
                bool1 = false;
              } 
            } 
          } 
        } while (bool1 || (str2 != null && !str2.equals("") && !t.a(str2)));
      } 
      if (str2 == null || str2.equals(""))
        return null; 
      a a = ie.a(str2, str, file1, null);
      file = new File(a.t());
      if (paramf.f() != null && paramf.f().e() != null && !paramf.f().e().isEmpty())
        j.a(file, paramf.f()); 
      if (!file.exists()) {
        bV.d("Project Directory not found?", paramWindow);
        return null;
      } 
      a.a(a);
      g();
    } catch (a a) {
      bV.d(a.getMessage(), dd.a().c());
      return null;
    } 
    if (i.a().a("645fds64[=43098=32fsa  ")) {
      String str1 = j.u();
      for (String str2 : j.v()) {
        File file1 = new File(str1, str2);
        if (file1.exists())
          t.b(file1); 
      } 
    } 
    return file;
  }
  
  public void c(Window paramWindow) {
    String str = bV.b(j.u(), paramWindow);
    if (str == null || str.equals(""))
      return; 
    a(paramWindow, str);
  }
  
  public void a(Window paramWindow, String paramString) {
    File file = new File(paramString);
    if (!file.exists()) {
      bV.d("A valid Project was not found at:\n" + paramString, paramWindow);
      return;
    } 
    (new H(this, paramWindow, paramString)).start();
  }
  
  public void b() {
    a((M)null);
  }
  
  public String a(M paramM) {
    a a = a.A();
    if (a == null) {
      bV.d("There is no project open to archive", dd.a().c());
      return null;
    } 
    File file = new File(a.t());
    String[] arrayOfString = { a.t };
    String str1 = a.a().a(a.u, j.u());
    String str2 = a.u() + "_" + X.a() + "." + a.t;
    X x = new X();
    String str3 = bV.a(dd.a().c(), g.b("Archive Project"), arrayOfString, str2, str1, false, (ck)x);
    if (str3 != null && !str3.equals("")) {
      if (!str3.endsWith(arrayOfString[0]))
        str3 = str3 + "." + arrayOfString[0]; 
      FileFilter fileFilter = x.c();
      File file1 = new File(str3);
      if (paramM == null)
        paramM = new t(this); 
      D d = new D(this, file, file1, fileFilter, paramM);
      d.start();
    } 
    return str3;
  }
  
  public void c() {
    String[] arrayOfString = { a.t };
    String str1 = a.a().a(a.u, j.u());
    String str2 = "*." + a.t;
    String str3 = bV.a(dd.a().c(), g.b("Import Archive Project"), arrayOfString, str2, str1, false, null);
    a(str3);
  }
  
  public void a(String paramString) {
    if (i.a().a("09RGDKDG;LKIGD") && paramString != null && !paramString.equals("")) {
      File file = new File(paramString);
      String str = null;
      boolean bool = false;
      do {
        str = bV.a(dd.a().c(), false, g.b("Import Project as (Project Name):"), X.b(file.getName(), "." + a.t, ""));
        if (str == null || str.equals("")) {
          bool = false;
        } else {
          File file1 = new File(j.u(), str);
          if (file1.exists()) {
            boolean bool1 = bV.a(g.b("There is already a project by that name.") + "\n" + g.b("Overwrite?"), dd.a().c(), true);
            if (!bool1) {
              str = null;
              bool = true;
            } else {
              bool = false;
            } 
          } 
        } 
      } while (bool || (str != null && !str.equals("") && !t.a(str)));
      if (str != null && !str.equals("")) {
        w w = new w(this);
        J j = new J(this, file, str, w);
        j.start();
      } 
    } 
  }
  
  public void d() {
    JFrame jFrame = dd.a().c();
    R r = T.a().c();
    if (r == null) {
      bV.d("There must be a Controller Configuration loaded to use the Expression Evaluator.", jFrame);
      return;
    } 
    l l = new l(jFrame, r);
    bV.a(jFrame, (Component)l);
    l.setVisible(true);
  }
  
  private synchronized void a(Window paramWindow, String paramString, boolean paramBoolean) {
    boolean bool;
    if (!i.a().a("09fewlkm309glkfds09"))
      return; 
    dM dM = dd.a().d();
    if (dd.a().m().getSelectedIndex() == 0) {
      bool = false;
    } else {
      e(g.b("Loading Project"));
      bool = true;
    } 
    x x = dd.a().b();
    hq.a().a(g.b("Opening Project") + " ...");
    x.k(g.b("Loading Project"));
    x.repaint();
    Thread.yield();
    cq.a().d();
    if (bool)
      a(0.1D); 
    dM.b(0.1D);
    a a = a.a();
    if (a.A() != null)
      g(); 
    D.c("Opening project: " + paramString);
    long l = System.currentTimeMillis();
    if (paramString == null || paramString.equals(""))
      return; 
    String str = (new File(paramString)).getParent();
    a.b(a.aV, str);
    a.c(j.q());
    D.c();
    if (bool)
      a(0.15D); 
    dM.b(0.15D);
    a a1 = new a();
    a1.h(paramString);
    File file = new File(paramString);
    a1.i(file.getName());
    try {
      a1.a(paramString);
      if (i.a().a("FDSDSA-0;L;l0")) {
        b.a().a((ap)new ar((Properties)a1, "Triggers."));
        bB.a().b();
      } 
      a1 = (new ie()).a(paramString);
      if (i.a().a("FDSDSA-0;L;l0"))
        b.a().a((ap)new ar((Properties)a1, "Triggers.")); 
      if (bool)
        a(0.4D); 
      dM.b(0.4D);
      a.a(a1);
    } catch (g g) {
      D.a("A problem was encountered loading the project " + file.getName() + ".\n", (Exception)g, paramWindow);
      K k = new K(D.f());
      k.a(paramWindow);
      if (g.a() != 2 && bV.a("Would you like to update your Controller configuration file?", paramWindow, true)) {
        iH iH = new iH();
        File file1 = iH.a();
        if (file1 != null && file1.exists()) {
          iH.a(a1.u(), a1, file1);
          a(paramWindow, paramString);
        } 
      } 
      l();
      return;
    } catch (e e) {
      D.a("A problem was encountered loading the project " + file.getName() + ".\n", (Exception)e, paramWindow);
      if (bV.a("The project  " + file.getName() + " appears to be corrupt. \nWould you like to create a new Project?", paramWindow, true))
        b(paramWindow); 
      if (bool)
        l(); 
      return;
    } catch (a a2) {
      D.a("A problem was encountered loading the project " + file.getName() + ".\n", (Exception)a2, paramWindow);
      K k = new K(D.f());
      k.a(paramWindow);
      if (bool)
        l(); 
      return;
    } 
    T t = T.a();
    try {
      if (bool)
        a(0.5D); 
      dM.b(0.5D);
      boolean bool1 = a.a().c(a.bc, a.bd);
      if ((a.be && D.d() > 0) || (D.e() > 0 && bool1)) {
        boolean bool3 = bV.a("There were " + D.d() + " errors and " + D.e() + " warnings during Project  load.\nWould you like to review them now?", paramWindow, true);
        if (bool3) {
          K k = new K(D.f());
          k.a(paramWindow);
        } else {
          D.f();
          D.c();
        } 
      } else {
        D.f();
        D.c();
      } 
      for (byte b1 = 0; b1 < a1.D().size(); b1++) {
        R r1 = a1.D().get(b1);
        if (t.c(r1.c()) == null) {
          t.a(r1);
          D.b("Config not in Config Manager, adding it: " + r1.c());
        } 
        if (a.u(paramString) || a.a().c(a.bw, true)) {
          a(a1, r1);
          try {
            File file1 = a1.c(r1.c());
            boolean bool3 = a.a().c(a.bj, a.bk);
            if (bool3 && i.a().a(",.fesokdsoi4309") && !a.u(paramString)) {
              a a2 = new a(r1);
              C.a().a(file1, (B)a2);
            } 
            if (bool)
              a(0.6D); 
            dM.b(0.6D);
          } catch (Exception exception) {
            D.c("Failed to get offline Tune File for " + r1.c());
            exception.printStackTrace();
          } 
        } 
        r1.h().a(new x(this));
      } 
      D.d("!!! Loaded config in " + (System.currentTimeMillis() - l));
      b(paramWindow, a1.u());
      D.d("!!! Activated Project " + (System.currentTimeMillis() - l));
      boolean bool2 = a1.Q();
      if (i.a().a("98fg54lklk") && bool2)
        a().J(); 
      a(t.c(), a1.o().getAbsolutePath());
      if (bool)
        a(0.65D); 
      dM.b(0.65D);
      R();
      for (byte b2 = 1; b2 < a1.D().size(); b2++) {
        try {
          R r1 = a1.D().get(b2);
          Z z = null;
          if (r1.S()) {
            String str1 = a1.m() + r1.c() + "." + a.co;
            File file1 = new File(str1);
            if (i.a().a(" 098u 98u498u98ug") && file1.exists())
              try {
                z = (new c(j.G())).a(str1);
              } catch (a a2) {
                bV.d("Gauge Cluster for " + r1.c() + " is corrupt,\nthe default will be used instead.\nLoad error:\n" + a2.getMessage(), paramWindow);
              }  
            if (z == null) {
              z = (new aa()).a(r1, "FrontPage", 1);
              Component[] arrayOfComponent = z.c();
              for (byte b = 0; b < arrayOfComponent.length; b++) {
                if (arrayOfComponent[b] instanceof s) {
                  s s = (s)arrayOfComponent[b];
                  if ((s.getEcuConfigurationName() == null || s.getEcuConfigurationName().equals("")) && !s.getEcuConfigurationName().equals(cu.a))
                    s.setEcuConfigurationName(r1.c()); 
                } 
              } 
            } 
            if (i.a().a("64865e43s5hjhcurd")) {
              x x1 = dd.a().h().a(z, r1.c());
              x1.m(str1);
              ab.a(x1);
            } 
          } 
        } catch (a a2) {
          D.a("Failed to load project", (Exception)a2, paramWindow);
        } 
      } 
      if (bool)
        a(1.0D); 
      if (paramBoolean)
        a(t.c()); 
      if (dM != null)
        dM.b(0.65D); 
    } finally {
      l();
      dd.a().b().repaint();
    } 
    R r = t.c();
    if (i.a().a("64865e43s5hjhcurd")) {
      if (i.a().a("fdsa0987fdsa43298 fds") && r.g("etDistanceFt") != null && r.g("timeTo330Ft") != null) {
        File file1 = j.g();
        aE.f f1 = new aE.f();
        f1.a(g.b("Acceleration Performance"));
        f1.b("Acceleration_Performance.dash");
        File file2 = new File(f1.a(a1));
        if (file1.exists() && !file2.exists()) {
          try {
            t.a(file1, file2);
            a1.a(f1);
          } catch (a a2) {
            D.a("Failed to copy Performance dash to project!");
            a2.printStackTrace();
          } 
        } else if (!file1.exists()) {
          D.d("Performance Dash file not found in installer, so not loaded.");
        } 
      } 
      int i = a1.G();
      byte b = 0;
      Iterator<aE.f> iterator = a1.F();
      while (iterator.hasNext()) {
        aE.f f1 = iterator.next();
        x x1 = new x(a1.E());
        ab.a(x1);
        dd.a().h().a(x1, f1.a());
        try {
          x1.f(f1.a(a1));
        } catch (a a2) {
          D.a("Error loading User Dashboard \"" + f1.a() + "\"", (Exception)a2, paramWindow);
        } 
        double d = 0.2D * b++ / i;
        if (dM != null)
          dM.b(0.7D + d); 
      } 
    } 
    D.c("!!! Opened Dash " + (System.currentTimeMillis() - l));
    if (!a.u(paramString)) {
      String str1 = paramString;
      if (!paramString.startsWith("\\\\"))
        str1 = X.b(paramString, File.separator + File.separator, File.separator); 
      a.a().b("lastProjectPath", str1);
      (new n()).a(str1);
    } 
    if (dM != null)
      dM.b(0.9D); 
    try {
      if (!T.a().c().C().q()) {
        x.k(g.b("Not Connected"));
      } else {
        x.ab();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    hq.a().a(a1.u() + " " + g.b("Ready"));
    if (dM != null)
      dM.b(1.0D); 
    U();
  }
  
  public void e() {
    cu.a().a("dataLogTime", 0.0D);
  }
  
  public void f() {
    Window[] arrayOfWindow = Window.getWindows();
    try {
      for (byte b = 0; b < arrayOfWindow.length; b++) {
        if (arrayOfWindow[b].isVisible() && dd.a().c(arrayOfWindow[b]))
          arrayOfWindow[b].dispose(); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean g() {
    x x = dd.a().b();
    try {
      K();
    } catch (Exception exception) {
      D.c("Failed to stop Slave Server");
    } 
    k.a().c();
    boolean bool = false;
    try {
      if (x.isVisible() && (x.aa() == null || x.aa().indexOf(g.b("Shut down....")) == -1)) {
        x.k(g.b("Closing Project"));
        x.paint(x.getGraphics());
        bool = true;
      } 
    } catch (Exception exception) {}
    try {
      if (a.A() != null)
        a(a.A()); 
      f();
      T t = T.a();
      a a = a.A();
      if (a != null && i.a().a("-=fds[pfds[pgd-0") && a.a().c(a.bz, a.bA)) {
        String str = "Project close";
        c(str);
      } 
      g(dd.a().c());
      bW bW = dd.a().h();
      if (a != null && !t.a(a.t(), 1024L)) {
        bV.d(g.b("Unable to save current project.") + "\n" + g.b("Either the disk is full or the you have insufficient rights."), dd.a().c());
        return true;
      } 
      hx.a().j();
      if (a != null) {
        a.y(dd.a().f().a());
        for (R r : a.D()) {
          if (r != null && r.p().aO() && (!a.a().c(a.bw, true) || a.a().c(a.bx, a.by))) {
            boolean bool1 = bV.a("The tune for " + r.c() + " has changed.\nWould you like to save a backup with the changes?", dd.a().c(), true);
            if (bool1)
              e(dd.a().c()); 
          } 
          if (r != null) {
            if (!a.a().c(a.bw, true)) {
              File file = a.d(r.c());
              aa aa = new aa();
              aa.b(r, file.getAbsolutePath(), (A)new o());
              D.d("Saved PC variables for " + r.c() + " to:\n" + file.getAbsolutePath());
            } 
            if (a != null && !a.J()) {
              e(r);
              try {
                File file = a.c(r.c());
                C.a().b(file);
              } catch (Exception exception) {
                D.c("Failed to get offline Tune File for " + r.c());
                exception.printStackTrace();
              } 
            } 
            cu.a().i(r.c());
            if (r.c("Dash_Pad") != null)
              try {
                Thread.currentThread();
                Thread.sleep(1000L);
              } catch (InterruptedException interruptedException) {} 
            r.C().c();
            cQ.a().a(r.c());
          } 
          aR.a().b(r.c());
        } 
      } 
      if (dd.a().f() != null)
        dd.a().f().b(""); 
      if (a != null)
        if (bW != null) {
          Iterator<x> iterator = bW.f();
          while (iterator.hasNext()) {
            x x1 = iterator.next();
            if (!x1.e(""))
              return false; 
            x1.c();
          } 
        } else if (x != null) {
          x.c();
        }  
      if (bW != null)
        bW.f_(); 
      jA.a().b();
      t.b();
      a.a(null);
      this.f.clear();
      if (dd.a().f() != null)
        dd.a().f().b(""); 
      if (dd.a().b() != null)
        dd.a().b().ab(); 
      F.c();
      i.a();
      l.a().b();
      V();
      try {
        if (a != null)
          a.b(); 
      } catch (Exception exception) {
        try {
          Thread.sleep(100L);
          if (a != null)
            a.b(); 
        } catch (Exception exception1) {
          D.a("Failed to save current Project", exception1, dd.a().c());
        } 
      } 
    } catch (Exception exception) {
      D.b("Caught this exception, clean this up:");
      exception.printStackTrace();
    } 
    if (bool)
      x.ab(); 
    b.c().a(null);
    return true;
  }
  
  public void b(Window paramWindow, String paramString) {
    T t = T.a();
    try {
      t.a(paramString);
    } catch (a a) {
      D.a(a.getMessage(), (Exception)a, paramWindow);
    } 
  }
  
  public void a(File paramFile) {
    if (U.a(paramFile)) {
      y y = new y(this);
      if (SwingUtilities.isEventDispatchThread()) {
        y.run();
      } else {
        try {
          SwingUtilities.invokeAndWait(y);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } catch (InvocationTargetException invocationTargetException) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
        } 
      } 
      (dd.a().i()).c.a.a(paramFile);
    } else if (i.a().a(" OKFDS09IFDSOK")) {
      z z = new z(this, paramFile);
      SwingUtilities.invokeLater(z);
    } else {
      b(paramFile.getAbsolutePath());
    } 
  }
  
  public void a(File[] paramArrayOfFile) {
    if (i.a().a(" OKFDS09IFDSOK") && paramArrayOfFile.length > 0) {
      A a = new A(this, paramArrayOfFile);
      SwingUtilities.invokeLater(a);
    } 
  }
  
  public void a(R paramR) {
    if (a.A().J())
      return; 
    try {
      T t = T.a();
      String[] arrayOfString = t.d();
      byte b;
      for (b = 0; b < arrayOfString.length; b++) {
        R r = t.c(arrayOfString[b]);
        if (r != null)
          r.d(); 
      } 
      paramR.C().d();
      for (b = 0; b < arrayOfString.length; b++) {
        R r = t.c(arrayOfString[b]);
        if (!r.c().equals(paramR.c()) && r.C() instanceof l)
          r.C().d(); 
      } 
    } catch (l l) {
      if (paramR.C() instanceof e) {
        a a = a.a();
        if (paramR.C() instanceof e) {
          e e = (e)paramR.C();
          e.a();
          String str = "promptOnPortNotDetected" + e.g();
        } 
      } 
    } 
  }
  
  public void a(R paramR, String paramString) {
    hq.a().a("Opening Gauge Cluster..");
    x x = dd.a().b();
    x.N();
    try {
      if (!i.a().a(" 098u 98u498u98ug")) {
        Z z = x.b(paramR);
        x.a(z);
        aa aa = new aa(paramR.c(), x);
        aa.a(x);
        x.a(aa);
        x.d(true);
      } else {
        x.f(paramString);
      } 
    } catch (a a) {
      D.a("Error opening saved dashboard.", (Exception)a, x);
      return;
    } 
    hq.a().a("");
  }
  
  public void h() {
    JFrame jFrame = dd.a().c();
    String[] arrayOfString = { a.cw };
    a a = a.A();
    if (a == null) {
      bV.d("There is no project open.\nPlease open a project first.", jFrame);
      return;
    } 
    String str1 = a.s();
    T t = T.a();
    ac ac = new ac(t.d(), a.u());
    ac.a(true);
    ac.setPreferredSize(eJ.a(200, 150));
    String str2 = bV.b(jFrame, "Compare Saved Tune", arrayOfString, "", str1, (ck)ac);
    if (str2 == null || str2.equals(""))
      return; 
    R r = t.c(ac.a());
    b(r, str2);
  }
  
  public void b(R paramR, String paramString) {
    JFrame jFrame = dd.a().c();
    if (paramR == null) {
      bV.d("No open and active ECU Configuration.\nPlease open or create a project before loading a saved tune.", jFrame);
      return;
    } 
    hH hH = new hH();
    if (!hH.a(jFrame, paramR, paramString))
      bV.d("No Differences Found!\nThe settings in the file are the same as the current loaded tune.", jFrame); 
  }
  
  public void a(Frame paramFrame, List paramList) {
    a(paramFrame, (R)null, paramList);
  }
  
  public void a(Frame paramFrame, R paramR, List paramList) {
    String[] arrayOfString1;
    String str1 = a.a().a("tuneFileExt", a.cw) + a.cy;
    String[] arrayOfString2 = { a.cw, str1 };
    String[] arrayOfString3 = a.a().a(a.cx, a.cw).split(";");
    if (paramList != null) {
      arrayOfString1 = arrayOfString2;
    } else {
      arrayOfString1 = arrayOfString3;
    } 
    a a = a.A();
    if (a == null) {
      a(paramFrame);
      return;
    } 
    String str2 = a.s();
    T t = T.a();
    ac ac = null;
    ac = new ac(t.d(), a.u());
    ac.a(true);
    ac.setPreferredSize(eJ.a(200, 150));
    if (paramR != null)
      ac.a(paramR.c()); 
    String str3 = (paramList != null) ? g.b("Load Dialog Settings") : g.b("Open Saved Tune");
    String str4 = bV.b(paramFrame, str3, arrayOfString1, "", str2, (ck)ac);
    if (str4 == null || str4.equals(""))
      return; 
    File file = new File(str4);
    if (!file.exists()) {
      bV.d(g.b("File not found") + ":\n" + str4, paramFrame);
      return;
    } 
    if (paramR == null)
      paramR = t.c(ac.a()); 
    if (paramR == null) {
      bV.d("No open and active ECU Configuration.\nPlease open or create a project before loading a saved tune.", paramFrame);
      return;
    } 
    str2 = str4.substring(0, str4.lastIndexOf(File.separatorChar));
    a.g(str2);
    String str5 = z.a(str4);
    if (str5 != null && !str5.equals("null") && !paramR.i().equals(str5)) {
      String str = g.b("Signatures do not match!") + "\nTune File signature: " + str5 + "\nConfiguration signature: " + paramR.i() + "\n \n" + g.b("Do you want to load it anyway?");
      if (!bV.a(str, paramFrame, true))
        return; 
      paramR.O().m("");
    } 
    if (paramR.C().q()) {
      String str = g.b("Would you like to send & burn configuration to controller?");
      if (!paramR.p().h() && paramList == null) {
        str = str + "\n\nThe current settings will be replaced by the\n settings in " + file.getName();
        if (i.a().a("-=fds[pfds[pgd-0") && a.a().c(a.bF, a.bG))
          str = str + "\nA restore point with the current " + a.a(str5, a.f) + " settings will be created."; 
      } 
      if (!bV.a(str, paramFrame, true))
        return; 
      if (i.a().a("-=fds[pfds[pgd-0") && a.a().c(a.bF, a.bG)) {
        String str6 = "Before loading " + str4 + " to " + paramR.c();
        d(paramR, str6);
      } 
    } else if (paramList == null && !paramR.p().h() && a.a().c(a.bw, true)) {
      String str = g.b("This will load all settings from the file:") + "\n" + file.getName() + "\nCurrentTune." + a.cw + " will be be updated with all settings from " + file.getName();
      if (i.a().a("-=fds[pfds[pgd-0") && a.a().c(a.bF, a.bG))
        str = str + "\nA restore point with current CurrentTune." + a.cw + " settings will be created."; 
      str = str + "\n\n" + g.b("Would you like to proceed?");
      if (!bV.a(str, paramFrame, true))
        return; 
      if (i.a().a("-=fds[pfds[pgd-0") && a.a().c(a.bF, a.bG)) {
        String str6 = "Before loading " + str4 + " to " + paramR.c();
        d(paramR, str6);
      } 
    } 
    a(paramFrame, paramR, str4, paramList);
  }
  
  public void a(Window paramWindow, File paramFile) {
    if (U.b(paramFile)) {
      if (a.A() == null) {
        c(paramWindow, paramFile.getAbsolutePath());
      } else {
        a(paramWindow, (R)null, paramFile.getAbsolutePath());
      } 
    } else if (U.c(paramFile) && a.A() != null) {
      a(paramFile);
    } 
  }
  
  public void a(Frame paramFrame) {
    ac ac = new ac(null, "");
    ac.a(true);
    ac.setPreferredSize(eJ.a(200, 150));
    String str1 = j.u();
    String[] arrayOfString = a.a().a(a.cx, a.cw).split(";");
    String str2 = bV.b(paramFrame, "Open Saved Tune", arrayOfString, "", str1, (ck)ac);
    if (str2 == null || str2.equals(""))
      return; 
    File file = new File(str2);
    if (!file.exists()) {
      bV.d("File not found:\n" + str2, paramFrame);
      return;
    } 
    c(paramFrame, str2);
  }
  
  public void c(Window paramWindow, String paramString) {
    String str1 = z.a(paramString);
    String str2 = g.b("Would you like to use one of your existing projects to open this " + a.cw + "?") + "\n\n" + g.b("Alternatively, a temporary project can be used for viewing purposes only.") + "\n\n" + g.b("Note:") + "\n" + g.b("For working on a controller you should always create and open your own Project.") + "\n" + g.b("Temporary projects disable saving the " + a.cw + " and establishing communication with the controller.");
    String[] arrayOfString = { g.b("Use an existing Project"), g.b("Use a Temporary Project") };
    boolean bool = (0 == JOptionPane.showOptionDialog(paramWindow, str2, g.b("Tune File Project"), 0, 3, null, (Object[])arrayOfString, arrayOfString[1])) ? true : false;
    if (bool) {
      String str = bV.b(j.u(), paramWindow);
      if (str != null && !str.equals(""))
        (new H(this, paramWindow, str, paramString)).run(); 
      return;
    } 
    try {
      File file1 = j.a(paramWindow, str1);
      aa aa = new aa();
      String[] arrayOfString1 = null;
      try {
        arrayOfString1 = aa.c(new File(paramString));
      } catch (g g) {
        D.a("Failed to retrieve settings, loading without.");
      } 
      r[] arrayOfR = null;
      boolean bool1 = false;
      if (arrayOfString1 != null) {
        arrayOfR = new r[arrayOfString1.length];
        for (byte b = 0; b < arrayOfString1.length; b++) {
          arrayOfR[b] = new r();
          arrayOfR[b].v(arrayOfString1[b]);
        } 
      } else {
        s[] arrayOfS = v.a().b(file1.getAbsolutePath());
        arrayOfS = (new I()).a(arrayOfS, file1.getAbsolutePath());
        arrayOfR = new r[arrayOfS.length];
        String str = paramString.substring(paramString.lastIndexOf("."));
        if (arrayOfS != null && arrayOfS.length > 0) {
          bV.d("Warning!\nThis " + str + " is an older format and does not contain project settings.\nYou will need to set them on the Settings Tab of the\nProject Properties dialog after opening the " + str + ".", paramWindow);
          bool1 = true;
          for (byte b = 0; b < arrayOfR.length; b++)
            arrayOfR[b] = arrayOfS[b].b(); 
        } 
      } 
      File file2 = new File(j.u() + "Temp");
      if (file2.exists())
        t.b(file2); 
      a a = (new ie()).a(str1, file1, arrayOfR);
      File file3 = a.c(a.u());
      if (file3.exists())
        file3.delete(); 
      D.a().a(new File(a.t()));
      (new H(this, paramWindow, a.t(), paramString)).run();
      if (bool1) {
        ig ig = j(paramWindow);
        ig.a("Settings");
        t.a(new File(paramString), a.c(a.u()));
      } 
    } catch (a a) {
      D.a("Unable to get create working project.", (Exception)a, paramWindow);
      return;
    } 
  }
  
  public void a(Window paramWindow, R paramR, String paramString) {
    f(paramR);
    a(paramWindow, paramR, paramString, (List)null);
    g(paramR);
  }
  
  public void a(Window paramWindow, R paramR, String paramString, List paramList) {
    if (paramR == null)
      if (T.a().d() == null) {
        c(paramWindow, paramString);
      } else if ((T.a().d()).length == 1) {
        paramR = T.a().c();
      } else {
        String str = z.a(new File(paramString));
        if (str == null || str.isEmpty()) {
          D.a("Attempt to load invalid tune file: " + paramString);
          return;
        } 
        for (String str1 : T.a().d()) {
          R r = T.a().c(str1);
          if (r.i().equals(str)) {
            paramR = r;
            break;
          } 
        } 
        if (paramR == null) {
          Object object = JOptionPane.showInputDialog(null, "Select Target Controller", "Available Controllers", -1, null, (Object[])T.a().d(), null);
          if (object == null)
            return; 
          paramR = T.a().c(object.toString());
          if (paramR == null) {
            D.b("Contrller not found: " + object);
            return;
          } 
          if (!paramR.i().equals(str)) {
            boolean bool = bV.a(g.b("This tune file was saved from a different firmware than the selected Controller.") + "\n" + g.b("Are you sure you want to load this tune?"), paramWindow, true);
            if (!bool)
              return; 
          } 
        } 
      }  
    b b = new b();
    paramR.p().a((ab)b);
    D.c();
    try {
      if (i.a().a("FSD;LDSALKPOIERW") && !aa.a(paramString)) {
        av av = new av();
        av.a(paramR, paramString, paramList);
      } else {
        aa aa = new aa();
        aa.a(paramR, paramString, paramList);
      } 
      if (b.a() > 2) {
        iw iw = new iw(paramR, dd.a().b(), b.b());
        iw.a();
      } 
      if (paramList == null) {
        String str = "Tune opened, " + b.a() + " bytes updated. File:" + paramString;
        hq.a().a(str);
        D.d(str);
        e e = new e(paramR);
        e.a(paramR);
      } else {
        String str = "Dialog Settings Loaded, " + b.a() + " bytes updated. File:" + paramString;
        hq.a().a(str);
        D.d(str);
      } 
    } catch (g g) {
      D.a("Error opening Saved tune.", (Exception)g, paramWindow);
    } catch (a a1) {
      D.a("Error opening Saved tune.", (Exception)a1, paramWindow);
    } catch (aj aj) {
      bV.d("Password Protected, Invalid Password!", paramWindow);
      return;
    } finally {
      paramR.ah();
      paramR.I();
      paramR.p().b((ab)b);
    } 
    a a = a.A();
    if (a != null && paramR.c().equals(a.u()) && dd.a().f() != null && !paramString.contains("CurrentTune"))
      dd.a().f().b(paramString); 
    if (!this.i && (D.d() > 0 || (D.e() > 0 && !i.a().a("FESLKJGD09432LK ")))) {
      String str = "There were errors or warnings during " + a.cw + " load.\nWould you like to review them now?";
      String[] arrayOfString = { g.b("View"), g.b("Ignore") };
      boolean bool = (0 == JOptionPane.showOptionDialog(paramWindow, str, g.b("Audit Log"), 0, 3, null, (Object[])arrayOfString, arrayOfString[1])) ? true : false;
      if (bool) {
        K k = new K(D.f());
        k.a(paramWindow);
      } 
    } 
    if (paramList == null) {
      paramR.p().g();
      this.f.put(paramR.c(), paramString);
    } 
  }
  
  public void a(a parama, R paramR) {
    File file = parama.c(paramR.c());
    if (!file.exists())
      return; 
    String str1 = file.getAbsolutePath();
    a(dd.a().c(), paramR, str1);
    String str2 = parama.W();
    if (dd.a().f() != null)
      dd.a().f().b(str2); 
  }
  
  public String i() {
    String str = "TunerStudioMS.jar";
    try {
      File file = new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
      if (!file.getName().equals("classes"))
        str = file.getName(); 
      System.out.println("Jar Name:" + str);
    } catch (URISyntaxException uRISyntaxException) {
      uRISyntaxException.printStackTrace();
    } 
    return str;
  }
  
  public void d(Window paramWindow) {
    String str1 = X.b(a.c, "(Beta)", "");
    str1 = X.b(str1, " Lite!", "");
    str1 = X.b(str1, i.d, "");
    String str2 = i();
    String str3 = X.b(a.b, " ", "") + ".exe";
    String str4 = null;
    String str5 = null;
    try {
      a.a().e();
      i.g();
    } catch (a a) {
      D.b("Unable to save user properties.");
    } 
    try {
      if (J.a()) {
        str5 = "javaw.exe Staging";
        str4 = "javaw.exe -cp .;./plugins/;lib;./lib/*.jar -Djava.library.path=lib -jar " + str2;
        Runtime.getRuntime().exec(str5 + " \"" + str4 + "\"");
      } else if (J.b()) {
        File file = new File(".", "runtime/bin/java");
        if (file.exists()) {
          D.d("Bundled Java found, using that for restart.");
          str5 = X.b(file.getAbsolutePath(), " ", "\\ ");
          str4 = file.getAbsolutePath() + " -cp .:./plugins/:lib:./lib/*.jar -Djava.library.path=lib -jar " + str2;
          D.d("Bundled Java found, using that for restart. Restart Command:\n" + str4);
          String[] arrayOfString = { str5, "Staging", str4 };
          Runtime.getRuntime().exec(arrayOfString);
        } else {
          D.d("Bundled Java not found, using standard installed Java.");
          str5 = "/usr/bin/java";
          str4 = "/usr/bin/java -cp \".:plugins/:lib\" -Djava.library.path=lib -jar " + str2;
          String[] arrayOfString = { str5, "Staging", str4 };
          D.c("Restarting with command: '" + str5 + "', then '" + str4);
          Runtime.getRuntime().exec(arrayOfString);
        } 
      } else if (J.d()) {
        str5 = "/usr/bin/java";
        str4 = "/usr/bin/java -cp \".:plugins/:lib\" -Djava.library.path=lib -jar " + str2;
        File file1 = new File(".");
        File[] arrayOfFile = file1.listFiles(new B(this));
        if (arrayOfFile.length > 0) {
          File file = null;
          for (File file3 : arrayOfFile) {
            if (file == null || file3.getName().startsWith(a.b))
              file = file3; 
          } 
          str4 = file.getCanonicalPath();
        } 
        String[] arrayOfString1 = { str5, "Staging", str4 };
        String[] arrayOfString2 = null;
        File file2 = (new File(".")).getAbsoluteFile();
        D.c("Restarting with command: '" + str5 + "', then '" + str4);
        Runtime.getRuntime().exec(arrayOfString1, arrayOfString2, file2);
      } else {
        str5 = "/usr/bin/java";
        str4 = "/usr/bin/java -cp .:./plugins/:lib:./lib/*.jar -Djava.library.path=lib -jar " + str2;
        String[] arrayOfString = { str5, "Staging", str4 };
        D.c("Restarting 3 with command: '" + str5 + "', then '" + str4);
        Runtime.getRuntime().exec(arrayOfString);
      } 
      s();
    } catch (IOException iOException) {
      D.a("Failed to restart Application!", iOException, paramWindow);
    } 
  }
  
  public void j() {
    a(false);
  }
  
  public void a(boolean paramBoolean) {
    String str = null;
    if (!paramBoolean) {
      str = c.a().n();
      if (str == null || str.equals("")) {
        cc cc = dd.a().j();
        if (cc != null) {
          File file = cc.h();
          if (file != null && file.exists())
            str = file.getAbsolutePath(); 
        } 
      } 
    } 
    if (str == null || str.equals("")) {
      JFrame jFrame = dd.a().c();
      String[] arrayOfString = { "msl", "mlg", "csv" };
      String str1 = "";
      a a = a.A();
      if (a != null)
        str1 = a.q(); 
      str = bV.b(jFrame, "Open Log File", arrayOfString, "", str1);
    } 
    if (str != null && !str.equals(""))
      b(str); 
  }
  
  public void b(String paramString) {
    C c = new C(this);
    hp hp = new hp(c);
    hp.a(paramString);
  }
  
  public void k() {
    h h = new h(this);
    hp hp = new hp(h);
    hp.c("");
  }
  
  public boolean c(R paramR, String paramString) {
    b b = new b();
    paramR.p().a((ab)b);
    try {
      aa aa = new aa();
      aa.a(paramR, paramString);
      if (b.a() > 10) {
        iw iw = new iw(paramR, dd.a().b(), b.b());
        iw.a();
      } 
      paramR.I();
      String str = "Sending, " + b.a() + " bytes.";
      hq.a().a(str);
      D.d("Loaded Restore point " + paramString + "\n\t" + str);
    } catch (g g) {
      D.a("Error opening Tune Restore Point.", (Exception)g, dd.a().c());
      return false;
    } catch (aj aj) {
      bV.d("Password Protected, Invalid Password!", dd.a().c());
      return false;
    } finally {
      paramR.p().b((ab)b);
      paramR.I();
    } 
    paramR.p().g();
    return true;
  }
  
  public void c(String paramString) {
    T t = T.a();
    String[] arrayOfString = t.d();
    for (byte b = 0; b < arrayOfString.length; b++) {
      R r = t.c(arrayOfString[b]);
      d(r, paramString);
    } 
  }
  
  public File d(R paramR, String paramString) {
    a a = a.A();
    JFrame jFrame = dd.a().c();
    if (a == null) {
      bV.d("There is no project open.\nPlease open a project first.", jFrame);
      return null;
    } 
    if (a.a().c(a.bJ, a.bK)) {
      iq iq = new iq(paramR.c());
      File file1 = j.a(j.b(a), iq);
      if (file1 != null && file1.length() > 4096L) {
        hH hH = new hH();
        if (!hH.a(paramR, file1.getAbsolutePath())) {
          D.d("Skip Restore Point for '" + paramR.c() + "' because nothing changed since: " + file1.getName());
          return file1;
        } 
      } 
    } 
    double d = a.a().a(a.bH, a.bI);
    j.a(j.b(a), d);
    File file = j.a(a, paramR);
    String str = paramR.Q();
    paramR.v("<html>" + g.b("Restore Point") + ": " + paramString + " - <br>" + X.b(str, "<html>", ""));
    aa aa = new aa();
    try {
      if (!file.getParentFile().exists())
        file.getParentFile().mkdirs(); 
      aa.a(paramR, file.getAbsolutePath(), (A)new o());
      hq.a().a(paramR.c() + " Restore point saved");
      D.d(paramR.c() + " Restore point saved to: " + file.getName());
    } catch (g g) {
      bV.d(g.getMessage(), jFrame);
    } catch (Exception exception) {
      String str1 = "Unhandled error occured saving tune.\nSee log for more detail";
      D.a(str1, exception, jFrame);
    } finally {
      paramR.v(str);
    } 
    return file;
  }
  
  public void d(String paramString) {
    JRootPane jRootPane = dd.a().c().getRootPane();
    if (!(jRootPane.getGlassPane() instanceof dO)) {
      dO dO1 = new dO();
      dO1.b(true);
      jRootPane.setGlassPane((Component)dO1);
    } 
    dO dO = (dO)jRootPane.getGlassPane();
    if (paramString != null) {
      paramString = g.b(paramString);
      dO.a(paramString);
    } 
    dO.a(false);
    dO.a(g.b("Dismiss"), new i(this));
    dO.setVisible(true);
    this.h++;
  }
  
  public void e(String paramString) {
    JRootPane jRootPane = dd.a().c().getRootPane();
    if (!(jRootPane.getGlassPane() instanceof dO)) {
      dO dO1 = new dO();
      dO1.b(true);
      jRootPane.setGlassPane((Component)dO1);
    } 
    dO dO = (dO)jRootPane.getGlassPane();
    if (paramString != null) {
      paramString = g.b(paramString);
      dO.a(paramString);
    } 
    dO.a(true);
    dO.a();
    dO.b();
    dO.setVisible(true);
    this.h++;
  }
  
  public void l() {
    b(false);
  }
  
  public void b(boolean paramBoolean) {
    JRootPane jRootPane = dd.a().c().getRootPane();
    if (--this.h <= 0 || paramBoolean) {
      this.h = 0;
      if (jRootPane.getGlassPane() instanceof dO) {
        dO dO = (dO)jRootPane.getGlassPane();
        dO.setVisible(false);
      } else {
        D.d("endModalBlock called, but Root Pane is not a ProgressPane.");
      } 
    } else {
      D.d("endModalBlock called, but additional block requests in place.");
    } 
  }
  
  public void a(double paramDouble) {
    JRootPane jRootPane = dd.a().c().getRootPane();
    if (jRootPane.getGlassPane() instanceof dO) {
      dO dO = (dO)jRootPane.getGlassPane();
      dO.a(paramDouble);
    } else {
      D.d("updateModalPercent called, but Root Pane is not a ProgressPane.");
    } 
  }
  
  public void f(String paramString) {
    JRootPane jRootPane = dd.a().c().getRootPane();
    if (jRootPane.getGlassPane() instanceof dO) {
      dO dO = (dO)jRootPane.getGlassPane();
      paramString = g.b(paramString);
      dO.a(paramString);
    } else {
      D.d("updateModalPercent called, but Root Pane is not a ProgressPane.");
    } 
  }
  
  public boolean b(R paramR) {
    if (a.A() == null) {
      bV.d(g.b("No Project Open, cannot save custom.ini"), dd.a().c());
      return false;
    } 
    File file = new File(a.A().k(paramR.c()));
    j j = new j(this);
    P p = P.a();
    p.a(true);
    try {
      p.a(file, paramR, j);
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
      bV.d(g.b("Error saving custom.ini") + "\n" + iOException.getMessage(), dd.a().c());
      return false;
    } 
    return true;
  }
  
  public boolean a(R paramR, List paramList) {
    if (a.A() == null) {
      bV.d(g.b("No Project Open, cannot save ECU Definition. "), dd.a().c());
      return false;
    } 
    File file1 = a.A().f(paramR.c());
    File file2 = new File(file1.getParentFile(), file1.getName() + "~");
    try {
      t.a(file1, file2);
    } catch (a a) {
      D.a("Failed to backup " + file1.getName() + ", Error: " + a.getLocalizedMessage());
    } 
    k k = new k(this);
    P p = new P();
    for (O o : paramList)
      p.a(o); 
    p.a(true);
    try {
      p.a(file1, paramR, k);
      file2.delete();
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
      bV.d(g.b("Error saving ini") + "\nWill attempt to restore previous file.\n" + iOException.getMessage(), dd.a().c());
      File file = new File(file1.getParentFile(), "Failed_" + file1.getName());
      file.delete();
      try {
        t.a(file1, file);
      } catch (a a) {
        D.d("Failed to copy failed " + file1.getName() + ", Error: " + a.getLocalizedMessage());
      } 
      if (file2.exists() && file2.length() > 100L) {
        file1.delete();
        try {
          t.a(file2, file1);
          file2.delete();
          bV.d(g.b("Previous ini restored."), dd.a().c());
        } catch (a a) {
          D.d("Failed to restore main ini backup " + file1.getName() + ", Error: " + a.getLocalizedMessage());
        } 
      } 
      return false;
    } 
    return true;
  }
  
  public void c(R paramR) {
    String[] arrayOfString = { "" };
    JFrame jFrame = dd.a().c();
    String str1 = a.a().c(a.O, "");
    String str2 = bV.b(jFrame, "Import Channel Updates", arrayOfString, "", str1);
    if (str2 == null || str2.equals(""))
      return; 
    File file = new File(str2);
    a.a().b(a.O, file.getParentFile().getAbsolutePath());
    a a = new a();
    try {
      a.a(paramR, file, false);
      ArrayList<e> arrayList = new ArrayList();
      arrayList.add(new e());
      a(paramR, arrayList);
      e e = new e(paramR);
      e.a(paramR);
      cu.a().a(paramR);
    } catch (IOException iOException) {
      bV.d(g.b("Error saving ECU Definition") + "\n" + iOException.getMessage(), dd.a().c());
    } 
  }
  
  public void d(R paramR) {
    String[] arrayOfString = { "" };
    JFrame jFrame = dd.a().c();
    String str1 = a.a().c(a.O, "");
    String str2 = bV.b(jFrame, "Import Calibration Updates", arrayOfString, "", str1);
    if (str2 == null || str2.equals(""))
      return; 
    File file = new File(str2);
    a.a().b(a.O, file.getParentFile().getAbsolutePath());
    c c = new c();
    try {
      List list = c.a(file);
      ArrayList<a> arrayList = new ArrayList();
      arrayList.add(new a(list));
      a(paramR, arrayList);
    } catch (IOException iOException) {
      bV.d(g.b("Error saving ECU Definition") + "\n" + iOException.getMessage(), dd.a().c());
    } 
  }
  
  public void b(Frame paramFrame) {
    C c = new C();
    c.a(T.a().c());
    c.a(paramFrame);
  }
  
  public void m() {
    T t = T.a();
    String[] arrayOfString = t.d();
    for (byte b = 0; b < arrayOfString.length; b++) {
      R r = t.c(arrayOfString[b]);
      e(r);
      String str = (String)this.f.get(arrayOfString[b]);
      if (str == null && a.a().c(a.bw, true))
        str = a.A().c(arrayOfString[b]).getAbsolutePath(); 
      if (str != null)
        e(r, str); 
      if (str == null || a.a().c(a.bx, a.by))
        e(dd.a().c()); 
    } 
    if (i.a().a("-=fds[pfds[pgd-0") && a.a().c(a.bB, a.bC)) {
      String str = "User Requested Save of Settings";
      c(str);
    } 
  }
  
  public void a(R paramR, String paramString, List paramList) {
    JFrame jFrame = dd.a().c();
    String[] arrayOfString = new String[1];
    String str1 = a.a().a("tuneFileExt", a.cw) + a.cy;
    arrayOfString[0] = str1;
    a a = a.A();
    if (a == null) {
      bV.d("There is no project open.\nPlease open a project first.", jFrame);
      return;
    } 
    String str2 = a.s();
    String str3 = paramString + "_" + X.a() + "." + str1;
    str3 = bV.a(jFrame, "Save Dialog Tune Settings", arrayOfString, str3, str2, null);
    if (str3 != null && str3.length() > 0) {
      D.c("Save partial msq to: " + str3);
      if (!str3.endsWith(str1))
        str3 = str3 + "." + str1; 
      b(paramR, str3, paramList);
    } 
  }
  
  public void e(R paramR, String paramString) {
    h(paramR);
    b(paramR, paramString, null);
    i(paramR);
  }
  
  public void b(R paramR, String paramString, List paramList) {
    a a = a.A();
    JFrame jFrame = dd.a().c();
    if (a == null) {
      bV.d("There is no project open.\nPlease open a project first.", jFrame);
      return;
    } 
    String str = paramString.substring(0, paramString.lastIndexOf(File.separatorChar));
    a.g(str);
    File file = new File(paramString);
    C.a().c(file);
    if (paramString.endsWith(a.C)) {
      av av = new av();
      try {
        av.a(paramString, paramR);
      } catch (IOException iOException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
        bV.d("Error Saving Tune.\n" + iOException.getMessage(), jFrame);
        return;
      } 
    } else {
      aa aa = new aa();
      boolean bool = false;
      try {
        bool = ak.b(a.j());
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      try {
        boolean bool1 = aa.d;
        if (bool)
          aa.d = bool; 
        aa.a(paramR, paramString, (A)new o(), paramList);
        aa.d = bool1;
        if (!paramString.contains("CurrentTune"))
          dd.a().f().b(paramString); 
        if (paramList == null) {
          hq.a().a(paramR.c() + " Tune Saved!");
        } else {
          hq.a().a(paramR.c() + " Dialog settings Saved!");
        } 
        bQ.a().c();
      } catch (g g) {
        bV.d(g.getMessage(), jFrame);
      } catch (Exception exception) {
        String str1 = "Unhandled error occured saving tune.\nSee log for more detail";
        D.a(str1, exception, jFrame);
      } 
    } 
    paramR.p().g();
    C.a().d(file);
    this.f.put(paramR.c(), paramString);
  }
  
  public void n() {
    try {
      if (a.A() != null && a.A().D().size() > 0)
        for (R r : a.A().D())
          e(r);  
    } catch (Exception exception) {
      D.a("Problem saving CurrentTune files, stack to follow.");
      exception.printStackTrace();
    } 
  }
  
  public void e(R paramR) {
    a(paramR, false);
  }
  
  public File a(R paramR, boolean paramBoolean) {
    a a = a.A();
    JFrame jFrame = dd.a().c();
    if (a == null) {
      D.b("Request to save offline tune when project is null!");
      return null;
    } 
    aa.d = ak.b(a.j());
    if (!paramBoolean && (a.u(a.t()) || !a.a().c(a.bw, true)))
      return null; 
    String str = a.c(paramR.c()).getAbsolutePath();
    File file = new File(str);
    C.a().c(file);
    aa aa = new aa();
    try {
      aa.a(paramR, str, (A)new o());
    } catch (g g) {
      bV.d(g.getMessage(), jFrame);
    } catch (Exception exception) {
      String str1 = "Unhandled error occured saving offline tune.\nSee log for more detail";
      D.a(str1, exception, jFrame);
    } finally {
      C.a().d(file);
    } 
    return new File(str);
  }
  
  public void e(Window paramWindow) {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = a.a().a("tuneFileExt", a.cw);
    a a = a.A();
    T t = T.a();
    if (a == null) {
      bV.d("There is no project open.\nPlease open a project first.", paramWindow);
      return;
    } 
    String str1 = a.s();
    String str2 = X.a() + "." + a.cw;
    ac ac = new ac(t.d(), a.u());
    ac.c("Select Controller to save tune for.");
    str2 = bV.a(paramWindow, "Save Tune Configuration", arrayOfString, str2, str1, (ck)ac);
    if (str2 == null || str2.equals(""))
      return; 
    File file = new File(str2);
    String str3 = g.b("File already exists!") + "\n" + g.b("Are you sure you want to over write this file?") + "\n\n" + file.getName();
    if (file.exists() && !bV.a(str3, paramWindow, true))
      return; 
    if (str2 != null && str2.length() > 0) {
      D.c("EcuConfigName for Save:" + ac.a());
      if (!str2.endsWith(a.cw) && !str2.endsWith(a.C))
        str2 = str2 + "." + a.cw; 
      R r = t.c(ac.a());
      e(r, str2);
    } 
  }
  
  public void c(Frame paramFrame) {
    String[] arrayOfString = { "msl" };
    String str1 = X.a() + "." + a.cs;
    a a = a.A();
    if (a == null || a.q() == null) {
      bV.d("There is no project open.\nPlease open a project first.", paramFrame);
      return;
    } 
    R r = T.a().c();
    if (r == null || r.h().h()) {
      String str = g.b("Attention!!") + "\n" + g.b("There is no tune loaded.") + "\n" + g.b("Before generating a log file, it is recommended to either load an (" + a.cw + ") or connect to a controller.") + "\n" + g.b("Otherwise some field values will be incorrect.") + "\n\n" + g.b("Would you like to process this log file anyway?");
      boolean bool1 = bV.a(str, paramFrame, true);
      if (!bool1)
        return; 
    } 
    String str2 = a.q();
    str1 = bV.a(paramFrame, "Target Data Log file name", arrayOfString, str1, str2);
    if (str1 == null || str1.equals(""))
      return; 
    str2 = str1.substring(0, str1.lastIndexOf(File.separatorChar));
    a.j(str2);
    if (!str1.endsWith("." + a.cs))
      str1 = str1 + "." + a.cs; 
    File file = new File(str1);
    boolean bool = r.C().q();
    r.C().c();
    x x = dd.a().b();
    if (x != null)
      x.k(g.b("Palm Extract Mode")); 
    aY.f f1 = new aY.f(paramFrame, r, file, true);
    bV.a(paramFrame, (Component)f1);
    f1.setVisible(true);
    f1.c();
    if (x != null)
      x.k(g.b("Not Connected")); 
    if (bool)
      try {
        r.C().d();
      } catch (l l) {
        D.b("failed to go back online");
      }  
    System.out.println("Palm Extract Dialog Closed");
  }
  
  public void d(Frame paramFrame) {
    String[] arrayOfString1 = new String[2];
    arrayOfString1[0] = a.cu;
    arrayOfString1[1] = a.cv;
    a a = a.A();
    if (a == null) {
      bV.d("There is no project open.\nPlease open a project first.", paramFrame);
      return;
    } 
    R r = T.a().c();
    if (r == null || r.h().h()) {
      String str1 = "Attention!!\nThere is no tune loaded. Before generating a log file,\nit is recommended to either load an (" + a.cw + ") or connect to a controller.\nOtherwise some field values will be incorrect.\n\nWould you like to process this log file anyway?";
      boolean bool = bV.a(str1, paramFrame, true);
      if (!bool)
        return; 
    } 
    String str = a.k();
    String[] arrayOfString2 = null;
    arrayOfString2 = bV.a(paramFrame, "Transform Raw DataLog", arrayOfString1, "", str, true, (ck)null, true);
    if (arrayOfString2 == null || arrayOfString2.length == 0 || arrayOfString2[0] == null)
      return; 
    try {
      String str1 = arrayOfString2[0].substring(0, arrayOfString2[0].lastIndexOf(File.separator));
      a.e(str1);
    } catch (Exception exception) {
      D.b("Unable to save Log File Folder for:" + arrayOfString2);
    } 
    a(paramFrame, arrayOfString2);
  }
  
  public aA a(Window paramWindow, String[] paramArrayOfString) {
    aA aA = new aA();
    a a = a.A();
    if (a == null) {
      bV.d("There is no project open.\nPlease open a project first.", paramWindow);
      return aA;
    } 
    ArrayList arrayList = a.A().D();
    R[] arrayOfR = new R[arrayList.size()];
    arrayOfR = (R[])arrayList.toArray((Object[])arrayOfR);
    bR bR = new bR(paramWindow, arrayOfR);
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      File file = new File(paramArrayOfString[b]);
      String str = X.a();
      if (!paramArrayOfString[b].toLowerCase().endsWith("mlg") && !paramArrayOfString[b].toLowerCase().endsWith("csv") && !paramArrayOfString[b].toLowerCase().endsWith("msl")) {
        if (paramArrayOfString[b].toLowerCase().endsWith("ms3"))
          try {
            Date date1 = af.a(file);
            Calendar calendar = Calendar.getInstance();
            calendar.set(2010, 0, 1);
            Date date2 = calendar.getTime();
            if (date1.after(date2))
              str = X.a(date1); 
          } catch (Exception exception) {
            exception.printStackTrace();
          }  
        String str1 = paramArrayOfString[b].substring(paramArrayOfString[b].lastIndexOf(File.separator) + 1);
        if (str1.indexOf(".") != -1)
          str1 = str1.substring(0, str1.lastIndexOf(".")); 
        String str2 = a.cs;
        str1 = str + "_" + str1 + "." + str2;
        String str3 = paramArrayOfString[b].substring(0, paramArrayOfString[b].lastIndexOf(File.separator) + 1) + str1;
        if (str3.lastIndexOf(File.separator) != -1)
          str3 = str3.substring(str3.lastIndexOf(File.separator)); 
        str3 = a.q() + File.separator + str3;
        File file1 = new File(str3);
        bR.a(file, file1);
      } 
    } 
    if (!bR.h.isEmpty()) {
      File[] arrayOfFile = new File[bR.h.size()];
      byte b1;
      for (b1 = 0; b1 < arrayOfFile.length; b1++)
        arrayOfFile[b1] = ((bU)bR.h.get(b1)).b(); 
      arrayOfFile = a(paramWindow, arrayOfFile);
      for (b1 = 0; b1 < arrayOfFile.length; b1++)
        ((bU)bR.h.get(b1)).b(arrayOfFile[b1]); 
      bR.start();
    } else {
      File[] arrayOfFile = new File[paramArrayOfString.length];
      for (byte b1 = 0; b1 < arrayOfFile.length; b1++)
        arrayOfFile[b1] = new File(paramArrayOfString[b1]); 
      arrayOfFile = a(paramWindow, arrayOfFile);
      if (bV.a(g.b("File(s) ready for viewing, would you like to open it now?"), dd.a().c(), true))
        a().a(arrayOfFile); 
    } 
    return aA;
  }
  
  private File[] a(Window paramWindow, File[] paramArrayOfFile) {
    if (a.a().c(a.ca, a.cb)) {
      String str1 = g.b("Rename Log Files");
      String str2 = g.b("Set the log file names downloaded to the Project DataLog Folder.");
      I i = new I(paramWindow, str1, str2);
      return i.a(paramArrayOfFile);
    } 
    return paramArrayOfFile;
  }
  
  public void f(Window paramWindow) {
    if (i.a().a(";'rew-043;lh/lhoi")) {
      if (!a.a().c(a.ce, a.cf).equals(a.bY)) {
        g(paramWindow);
        try {
          o();
        } catch (a a) {
          bV.d(a.getLocalizedMessage(), paramWindow);
        } 
      } else {
        g(paramWindow);
        String str1 = a.a().c(a.cA, a.cB);
        String[] arrayOfString = new String[2];
        if (str1.equals(a.cs)) {
          arrayOfString[0] = a.cs;
          arrayOfString[1] = a.cr;
        } else {
          arrayOfString[0] = a.cr;
          arrayOfString[1] = a.cs;
        } 
        String str2 = X.a() + "." + str1;
        a a = a.A();
        if (a == null || a.q() == null) {
          bV.d("There is no project open.\nPlease open a project first.", paramWindow);
          return;
        } 
        String str3 = a.q();
        str2 = bV.a(paramWindow, "Start New Data Log", arrayOfString, str2, str3);
        if (str2 == null || str2.equals(""))
          return; 
        if (!str2.toLowerCase().endsWith(a.cr) && !str2.toLowerCase().endsWith(a.cs) && !str2.toLowerCase().endsWith(".frd") && !str2.toLowerCase().endsWith(".mlg"))
          str2 = str2 + "." + str1; 
        str3 = str2.substring(0, str2.lastIndexOf(File.separatorChar));
        a.j(str3);
        g(str2);
      } 
    } else {
      bV.d("Data Logging is not enabled in this edition of " + a.b + "\n\nUpgrade Now!", paramWindow);
    } 
  }
  
  public void o() {
    if (i.a().a(";'rew-043;lh/lhoi")) {
      String str1 = a.a().c(a.cA, a.cB);
      String str2 = X.a() + "." + str1;
      a a = a.A();
      if (a == null || a.q() == null)
        throw new a("There is no project open. Please open a project first."); 
      String str3 = a.q();
      str2 = (new File(str3, str2)).getAbsolutePath();
      if (str2 == null || str2.equals(""))
        return; 
      str3 = str2.substring(0, str2.lastIndexOf(File.separatorChar));
      a.j(str3);
      g(str2);
    } else {
      bV.d("Data Logging is not enabled in this edition of " + a.b + "\n\nUpgrade Now!", dd.a().c());
    } 
  }
  
  public File g(String paramString) {
    T t = T.a();
    String str = a.a().c(a.cA, a.cB);
    if (!paramString.toLowerCase().endsWith("." + str) && !paramString.toLowerCase().endsWith(".msl") && !paramString.toLowerCase().endsWith(".csv") && !paramString.toLowerCase().endsWith(".frd") && !paramString.toLowerCase().endsWith(".mlg"))
      paramString = paramString + "." + str; 
    String[] arrayOfString = t.d();
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 0; b < arrayOfString.length; b++) {
      R r = t.c(arrayOfString[b]);
      if (b == 0 || (!r.O().ap() && r.S()))
        arrayList.add(arrayOfString[b]); 
    } 
    arrayOfString = arrayList.<String>toArray(new String[arrayList.size()]);
    try {
      c c;
      e e = null;
      if (paramString.endsWith(".frd")) {
        e = e.a();
      } else if (paramString.toLowerCase().endsWith(".mlg")) {
        u u = u.a();
      } else {
        c c1 = c.a();
        c = c1;
        String str1 = a.a().a(a.aK, "\t");
        c1.c(str1);
      } 
      i.b();
      if (c.u()) {
        hq.a().a(g.b("Already Logging."));
        return new File(c.n());
      } 
      c.i();
      if (x.a().c() && x.a().g() != null) {
        List list = g.a();
        Iterator<a> iterator = list.iterator();
        while (iterator.hasNext())
          c.a(iterator.next()); 
      } 
      for (D d : b.a())
        c.a((a)d); 
      if (a.A() != null) {
        a a = a.A();
        String str1 = a.O();
        String[] arrayOfString1 = a.w(str1);
        c.a(arrayOfString1);
      } 
      if (Runtime.getRuntime().availableProcessors() == 1 && Integer.parseInt(T.a().c().J()) > 20)
        T.a().c().c(20); 
      try {
        j j = b.a().a(t.c().c(), b.b);
        if (j != null)
          j.b(true); 
      } catch (Exception exception) {
        D.a("Error trying to reset Log Stop Trigger. " + exception.getLocalizedMessage());
      } 
      c.a(arrayOfString, paramString);
      hq.a().a("Capturing DataLog");
      return new File(c.n());
    } catch (Exception exception) {
      bV.d("Failed to start log file. Error:\n" + exception.getMessage(), dd.a().c());
      exception.printStackTrace();
      return null;
    } 
  }
  
  public void p() {
    h h = h.k();
    if (h != null && h.u()) {
      h.d("Manual");
      hq.a().a("Manual MARK");
    } 
  }
  
  private void W() {
    n n = hx.a().r();
    if (n != null && n.h() && n.k() != null && n.k().exists())
      try {
        if (n.k().getAbsolutePath().toLowerCase().endsWith(".mlg")) {
          y.a(n, n.k().getAbsolutePath());
        } else {
          o.b(n, n.k().getAbsolutePath(), i.v);
        } 
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } catch (a a) {
        a.printStackTrace();
        bV.d(a.getLocalizedMessage(), bV.c());
      }  
  }
  
  public void q() {
    e e;
    u u;
    c c = c.a();
    if (!c.u())
      e = e.a(); 
    if (!e.u())
      u = u.a(); 
    if (u.u())
      try {
        u.l();
        W();
        hq.a().a("Data log stopped");
      } catch (Exception exception) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, exception);
      }  
  }
  
  public void g(Window paramWindow) {
    e e;
    u u;
    T t = T.a();
    R r = t.c();
    c c = c.a();
    if (!c.u())
      e = e.a(); 
    if (!e.u())
      u = u.a(); 
    try {
      if (u.u()) {
        String str = u.n();
        u.l();
        W();
        hq.a().a("Data log stopped");
        if (T.a().c() != null && a.A() != null) {
          int i = 15;
          try {
            i = a.A().c(T.a().c().O().as());
          } catch (Exception exception) {}
          T.a().c().c(i);
        } 
        if (a.a().c(a.ce, a.cf).equals(a.bX) && str != null && !str.isEmpty()) {
          File file = new File(str);
          String str1 = g.b("File already exists.");
          str1 = str1 + g.b("Overwrite File?");
          str1 = str1 + "\n";
          if (file.exists() && file.length() > 1000L) {
            File file1;
            String str2 = a.a().c(a.cA, a.cB);
            String[] arrayOfString = { str2 };
            do {
              String str3 = bV.a(paramWindow, "Rename Data Log File", arrayOfString, str, file.getParent());
              if (str3 == null || str3.equals(""))
                return; 
              if (!str3.toLowerCase().endsWith(str2))
                str3 = str3 + "." + str2; 
              file1 = new File(str3);
            } while (file1.exists() && !file1.equals(file) && !bV.a(str1 + file1.getName(), paramWindow, true));
            if (!file1.equals(file)) {
              if (file1.exists())
                file1.delete(); 
              if (file.renameTo(file1)) {
                hq.a().a("Data log saved as " + file1.getName());
                u.a(file1);
                c.a().a(file.getAbsolutePath(), file1.getAbsolutePath());
              } else {
                hq.a().a("Unable to rename Data log");
              } 
            } 
          } 
        } 
      } 
    } catch (Exception exception) {
      D.b("Something happened stopping the log??? " + exception.getMessage());
    } 
  }
  
  public void r() {
    JFrame jFrame = dd.a().c();
    if (jFrame instanceof dl)
      ((dl)jFrame).k(); 
  }
  
  public boolean s() {
    if (!g())
      return false; 
    a().y();
    System.exit(0);
    return true;
  }
  
  public boolean t() {
    if (this.b)
      return true; 
    this.b = true;
    l l = new l(this);
    try {
      if (!SwingUtilities.isEventDispatchThread()) {
        SwingUtilities.invokeAndWait(l);
      } else {
        l.run();
      } 
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, "Error waiting for shutdown", interruptedException);
    } catch (InvocationTargetException invocationTargetException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, "Error on shutdown command", invocationTargetException);
    } 
    return true;
  }
  
  public ad e(Frame paramFrame) {
    paramFrame.setCursor(Cursor.getPredefinedCursor(3));
    try {
      ad ad = new ad();
      a a = a.A();
      if (a != null) {
        String str = a.C();
        if (str == null || str.length() == 0)
          str = a.ba; 
        ad.c(str);
      } 
      ad.a(true);
      ad.a(paramFrame);
      return ad;
    } finally {
      paramFrame.setCursor(Cursor.getDefaultCursor());
    } 
  }
  
  public void f(Frame paramFrame) {
    boolean bool1 = false;
    R r = T.a().c();
    if (r != null) {
      bool1 = r.C().q();
      r.C().c();
    } 
    boolean bool2 = i.a().a("GD[PP-0REP");
    hs hs = new hs(paramFrame, bool2);
    bV.a(paramFrame, hs);
    if (r != null && bool1) {
      hs.b(r.O().r() + "");
      hs.a(r.O().s());
      try {
        hs.c();
      } catch (m m) {
        D.c("Unable to open port: " + r.O().s());
      } 
    } 
    hs.setVisible(true);
    if (r != null && bool1)
      try {
        r.C().d();
      } catch (l l) {
        D.a("Unable to go back online after closing Mini-Terminal");
      }  
  }
  
  public void g(Frame paramFrame) {
    if (a.A() == null) {
      bV.d("No Project Open.", paramFrame);
      return;
    } 
    if (ak.b(a.A().j())) {
      ak ak = new ak();
      String str = null;
      str = bV.a(paramFrame, "ECU Definition Password: ");
      if (str == null)
        return; 
      try {
        ak.a(a.A().j(), str);
      } catch (FileNotFoundException fileNotFoundException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, fileNotFoundException);
        bV.d("File Not Found!", paramFrame);
        return;
      } catch (IOException iOException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
        bV.d("Unable to read file.", paramFrame);
        return;
      } catch (aj aj) {
        bV.d("Invalid Password!", paramFrame);
        return;
      } 
    } 
    T t = T.a();
    R r = t.c();
    Y y = r.p();
    jc jc = new jc(paramFrame, y);
    jc.setVisible(true);
  }
  
  public void h(Frame paramFrame) {
    ii ii = new ii(paramFrame);
    ii.setVisible(true);
  }
  
  public void i(Frame paramFrame) {
    T t = T.a();
    R r = t.c();
    if (r != null) {
      aG aG = new aG();
      aG.a(r);
      aG.a(paramFrame);
    } 
  }
  
  public void h(String paramString) {
    File file = new File(".");
    String str = "file:///" + file.getAbsolutePath() + "/help/learnMore.html";
    if (paramString != null && !paramString.isEmpty())
      str = str + "#" + paramString; 
    aN.a(str);
  }
  
  public void j(Frame paramFrame) {
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/companyLogo.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    String str = a.a().k();
    JOptionPane.showMessageDialog(paramFrame, str, "About " + a.b, 0, imageIcon);
  }
  
  public void h(Window paramWindow) {
    if (i.aI) {
      a a = new a(paramWindow, g.d());
      a.a(j.A());
    } else {
      aM.f f1 = new aM.f(paramWindow, g.d());
      f1.a(j.A());
    } 
  }
  
  public void a(R paramR, String paramString, Frame paramFrame) {
    T t = T.a();
    R r = null;
    if (paramR == null) {
      r = t.c();
    } else {
      r = paramR;
    } 
    if (paramString.indexOf("http:") == -1 && paramString.indexOf("file:") == -1 && paramString.indexOf(".") != -1) {
      String str = paramString.substring(0, paramString.lastIndexOf("."));
      r = t.c(str);
      paramString = paramString.substring(paramString.lastIndexOf(".") + 1);
    } 
    aj aj = r.e().b(paramString);
    if (aj == null && r.e().c(paramString) != null) {
      a(paramString, "-1", paramFrame);
      return;
    } 
    if (aj == null) {
      bV.d("Help:" + paramString + " not found in current configuration.", paramFrame);
      return;
    } 
    if (aj.c() != null && !aj.c().equals("")) {
      ai.f f1 = new ai.f(aj);
      f1.a((et)new dQ(a.a().d(), "HelpViewer"));
      f1.a(paramFrame, aj.d());
    } else if (aj.b() != null && !aj.b().equals("")) {
      String str = aj.b();
      if (str.toLowerCase().indexOf("www.megasquirt.info") != -1)
        str = X.b(str, "www.megasquirt.info", "www.megamanual.com"); 
      URL uRL = null;
      try {
        uRL = new URL(str);
      } catch (MalformedURLException malformedURLException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, malformedURLException);
      } 
      if (!t.a(uRL) && paramR.V() != null) {
        File file = t.b(uRL);
        String str1 = paramR.V() + file.getName();
        if (!n.b()) {
          String str2 = g.b("Help Manual not found on your computer.") + "\n" + g.b("Try again while connected to Internet and it can be downloaded for future offline use.");
          bV.d(str2, paramFrame);
        } else if (!n.b(str1)) {
          String str2 = g.b("Help Manual not found on your computer.") + "\n" + g.b("Also not found on server.") + "\n" + g.b("Check with your firmware provider and place manual on your computer at") + ":\n" + file.getAbsolutePath();
          bV.d(str2, paramFrame);
        } else {
          String str2 = g.b("The help manual for your firmware is not installed.") + "\n\n" + g.b("Would you like to download it now?");
          if (bV.a(str2, paramFrame, true)) {
            G g = new G(this, str);
            a(g.b("Downloading Help Manual"), str1, file, g);
          } 
        } 
      } else {
        aN.a(str);
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2, File paramFile, by paramby) {
    JDialog jDialog = bV.a(dd.a().c(), "<html>" + g.b(paramString1) + "<br> " + paramFile.getName() + "</html>");
    m m = new m(this, paramFile, paramString2, paramby, jDialog);
    m.start();
  }
  
  public void u() {
    b b = null;
    a a = new a();
    b = a.a();
    if (b == null || !i.a().a(";'FG;'-05;'FG0-=")) {
      b.a(a.b + " " + a.c + " Help");
      b.b(d.a("/help/learnMore.html"));
    } 
    a().a(b, dd.a().c());
  }
  
  public void i(Window paramWindow) {
    n n = new n(this, paramWindow);
    SwingUtilities.invokeLater(n);
  }
  
  public void a(b paramb, Window paramWindow) {
    if (paramb == null || paramb.b() == null) {
      bV.d("Invalid help reference.", paramWindow);
      return;
    } 
    if (paramb.b() != null && !paramb.b().equals("")) {
      ai.f f1 = new ai.f();
      f1.a(d.a("/help/index.html"));
      f1.a((et)new dQ(a.a().d(), "AppHelpViewer"));
      try {
        f1.b(paramb.b());
      } catch (a a) {
        D.a("Unable to open help:\n" + paramb.b(), (Exception)a, paramWindow);
      } 
      f1.a(paramWindow, paramb.a());
    } 
  }
  
  public void a(String paramString1, String paramString2, Frame paramFrame) {
    T t = T.a();
    R r = t.c();
    if (paramString1.indexOf(".") != -1) {
      String str = paramString1.substring(0, paramString1.lastIndexOf("."));
      r = t.c(str);
      if (r == null) {
        D.d("Configuration " + str + " not found using working configuation to open dialog.");
        r = t.c();
      } 
      paramString1 = paramString1.substring(paramString1.lastIndexOf(".") + 1);
    } 
    if (r.h().h()) {
      String str = g.b("Attention!!") + "\n" + g.b("There is no tune loaded. Before doing any configuration") + ",\n" + g.b("it is recommended to either load an (" + a.cw + ") or connect to a controller.") + "\n\n" + g.b("It is not advised to create a tune (" + a.cw + ") from scratch.");
      bV.d(str, paramFrame);
    } 
    bv bv = r.e().c(paramString1);
    if (bv == null) {
      iL iL = iL.a();
      try {
        if (!iL.a(paramFrame, r, paramString1, paramString2))
          bV.d(paramString1 + " " + g.b("not found in current configuration.") + "\n" + g.b("Perhaps it hasn't been created."), paramFrame); 
      } catch (a a) {
        bV.d("Error showing dialog " + paramString1 + "\n\n" + a.getMessage(), paramFrame);
      } 
      return;
    } 
    if (bv instanceof aX) {
      a(r, (aX)bv, paramFrame);
    } else {
      a(r, bv, paramFrame);
    } 
  }
  
  public void v() {
    String str = bV.a("{OutputChannel},{Value}", false, dd.a().c());
    if (str != null && !str.equals("")) {
      StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
      String str1 = stringTokenizer.nextToken();
      double d = Double.parseDouble(stringTokenizer.nextToken());
      R r = T.a().c();
      if (r == null) {
        bV.d("No Config open", dd.a().c());
        return;
      } 
      String str2 = r.c();
      ArrayList arrayList = cu.a().a(str2, str1);
      for (cq cq : arrayList)
        cq.setCurrentOutputChannelValue(str1, d); 
    } 
  }
  
  public void w() {
    File file2;
    String[] arrayOfString = { "jar" };
    JFrame jFrame = dd.a().c();
    String str1 = a.a().c(a.dm, "");
    String str2 = bV.b(jFrame, "Install " + a.b + " Plugin", arrayOfString, "", str1);
    if (str2 == null || str2.equals(""))
      return; 
    File file1 = new File(str2);
    a.a().b(a.dm, file1.getParentFile().getAbsolutePath());
    ApplicationPlugin applicationPlugin = null;
    boolean bool = false;
    try {
      applicationPlugin = l.a().a(file1);
      if (l.a().c(applicationPlugin.getIdName())) {
        String str3 = "A plugin with a matching ID: '" + applicationPlugin.getIdName() + "' is already installed.\n\nDo you want to replace it with the new one?";
        if (!bV.a(str3, dd.a().c(), true))
          return; 
        bool = true;
      } 
      String str = "<html><body><h2>Install " + a.b + " plugin!</h2><b>Plugin Name:</b> '" + applicationPlugin.getDisplayName() + "'<br><b>Plugin ID:</b> '" + applicationPlugin.getIdName() + "'<br><b>Description:</b> <br>" + X.a(applicationPlugin.getDescription(), 60, "<br>") + "<br><br>Do you want to Install this plugin?</body></html>";
      if (!bV.a(str, dd.a().c(), true))
        return; 
    } catch (a a) {
      bV.d("Error loading Plugin:\n" + a.getMessage(), dd.a().c());
    } catch (Exception exception) {
      bV.d("Unknown Error loading Plugin.\nIs this a valid Plugin file?\nError:\n" + exception.getMessage(), dd.a().c());
    } catch (UnsupportedClassVersionError unsupportedClassVersionError) {
      bV.d("Unsupported Class Vesion loading Plugin.\nError:\n" + unsupportedClassVersionError.getMessage(), dd.a().c());
    } catch (Error error) {
      bV.d("Unknown Error loading Plugin.\nIs this a valid Plugin file?\nError:\n" + error.getMessage(), dd.a().c());
    } 
    try {
      file2 = j.b();
    } catch (a a) {
      D.a("Unable to access Plugin Dir", (Exception)a, dd.a().c());
      return;
    } 
    File file3 = null;
    if (l.a().c(applicationPlugin.getIdName())) {
      file3 = l.a().e(applicationPlugin.getIdName());
    } else {
      file3 = new File(file2, file1.getName());
    } 
    if (file3.exists() && l.a().e(applicationPlugin.getIdName()) == null && l.a().b(file3))
      file3 = new File(file2, applicationPlugin.getIdName() + ".jar"); 
    try {
      t.a(file1, file3);
    } catch (a a) {
      D.a("Unable to copy Plugin to Plugin Dir", (Exception)a, dd.a().c());
      return;
    } 
    if (bool)
      try {
        l.a().d(applicationPlugin.getIdName());
      } catch (a a) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        bool = false;
      }  
    if (bool) {
      String str = "<html><body><h2>" + a.b + " plugin Installation</h2>Plugin Name: '" + applicationPlugin.getDisplayName() + "<br>Has successfully Upgraded and should be ready for use.<br></body></html>";
      bV.d(str, jFrame);
    } else {
      String str = "<html><body><h2>" + a.b + " plugin Installation</h2>Plugin Name: '" + applicationPlugin.getDisplayName() + "<br>Has successfully Installed.<br>A restart of " + a.b + " is required to use this plugin.<br></body></html>";
      bV.d(str, jFrame);
    } 
  }
  
  public void f(R paramR, String paramString) {
    try {
      ApplicationPlugin applicationPlugin = l.a().a(paramString);
      h h = new h(applicationPlugin);
      bV.a((Component)h, dd.a().c(), applicationPlugin.getDisplayName(), (bc)h);
    } catch (a a) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      bV.d(g.b("Unable to display Plugin") + "\nError:\n" + a.getMessage(), dd.a().c());
    } catch (UnsupportedClassVersionError unsupportedClassVersionError) {
      bV.d("Unsupported Class Vesion loading Plugin.\nError:\n" + unsupportedClassVersionError.getMessage(), dd.a().c());
    } catch (Error error) {
      bV.d("Unknown Error loading Plugin.\nIs this a valid Plugin file?\nError:\n" + error.getMessage(), dd.a().c());
    } 
  }
  
  public void a(R paramR, bv parambv, Window paramWindow) {
    if (paramWindow == null)
      paramWindow = dd.a().c(); 
    if (parambv.Y()) {
      String str1 = "Password protected Dialog. Enter the password.";
      String str2 = bV.a(paramWindow, str1);
      String str3 = parambv.X();
      if (str2 == null)
        return; 
      if (!str2.equals(str3)) {
        bV.d("Invalid Password", paramWindow);
        return;
      } 
    } 
    if (!W.a(paramR, parambv, paramWindow))
      return; 
    try {
      hg hg = new hg(paramR, parambv);
      String str1 = X.b(parambv.M(), "\"", "");
      if (str1.trim().isEmpty()) {
        str1 = bM.c(paramR, parambv.aL());
        if (str1 == null || str1.equals(parambv.aL()))
          str1 = g.b("Settings"); 
      } 
      str1 = g.b(str1);
      dF dF = new dF(paramWindow, str1, hg, (parambv.n() || hg.h()));
      dF.add("Center", (Component)hg);
      hg.a((bc)dF);
      db db = parambv.N();
      o o = new o(this, db, dF);
      try {
        i.a(paramR.c(), db, o);
      } catch (a a) {
        bV.d("Invalid Title Defined: " + db.toString() + "\nError: " + a.getLocalizedMessage(), (Component)dF);
      } 
      boolean bool = (parambv instanceof G.bm || parambv instanceof G.bi || parambv instanceof K.a || parambv instanceof K.i || parambv instanceof G.be || bM.a(parambv)) ? true : false;
      String str2 = parambv.aL();
      if (parambv instanceof G.bi)
        str2 = str2 + "3D"; 
      hg.a(new I(this, (Dialog)dF, str2));
      Rectangle rectangle = a(str2 + str1, dF.getBounds());
      if (rectangle.height == 0) {
        dF.pack();
        bV.a(paramWindow, (Component)dF);
        rectangle = dF.getBounds();
      } 
      if (bool) {
        rectangle = bV.a(rectangle);
        if (rectangle.height < dF.getHeight())
          rectangle.height = dF.getHeight(); 
        if (rectangle.width < dF.getWidth())
          rectangle.width = dF.getWidth(); 
        dF.setBounds(rectangle);
      } else {
        dF.pack();
        dF.setLocation(rectangle.x, rectangle.y);
        rectangle = bV.a(dF.getBounds());
        dF.setBounds(rectangle);
      } 
      Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
      dimension.height -= 30;
      if (dF.getWidth() > dimension.width) {
        dF.setSize(dimension.width, dF.getHeight());
        dF.setLocation(0, (dF.getLocation()).y);
        dF.doLayout();
      } 
      if (dF.getHeight() > dimension.height) {
        dF.setSize(dF.getWidth(), dimension.height);
        dF.setLocation((dF.getLocation()).x, 0);
        dF.doLayout();
      } 
      if ((dF.getX() > dimension.width || dF.getY() > dimension.height) && !bV.h())
        bV.a(paramWindow, (Component)dF); 
      if (paramR.O().aj()) {
        cj[] arrayOfCj = bM.b(paramR, parambv);
        a(paramR, arrayOfCj);
      } 
      hg.k();
      try {
        dF.setVisible(true);
      } finally {
        dd.a().b().c(true);
      } 
    } catch (Exception exception) {
      D.a("Error showing Dialog", exception, dd.a().c());
    } 
  }
  
  public void a(R paramR, cj[] paramArrayOfcj) {
    try {
      if (paramArrayOfcj != null) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (byte b = 0; b < paramArrayOfcj.length; b++) {
          if (paramArrayOfcj[b].a() >= 0)
            if (paramR.O().B(paramArrayOfcj[b].a())) {
              a(paramR, paramArrayOfcj[b]);
              D.d("Initiating read page " + (paramArrayOfcj[b].a() + 1) + " : " + paramArrayOfcj[b].b() + ":" + paramArrayOfcj[b].c());
            } else if (!arrayList.contains(Integer.valueOf(paramArrayOfcj[b].a()))) {
              a(paramR, paramArrayOfcj[b].a());
              arrayList.add(Integer.valueOf(paramArrayOfcj[b].a()));
              D.d("Initiating read page " + (paramArrayOfcj[b].a() + 1));
            }  
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void a(R paramR, aX paramaX, Frame paramFrame) {
    JDialog jDialog1 = j(paramaX.M());
    if (jDialog1 != null && jDialog1.isDisplayable()) {
      jDialog1.requestFocus();
      return;
    } 
    if (paramR == null) {
      bV.d(g.b("You must have a working configuration open."), paramFrame);
      return;
    } 
    J j = new J(paramR, paramaX);
    JDialog jDialog2 = bV.a((Component)j, paramFrame, g.b(paramaX.M()), null);
    jDialog2.setDefaultCloseOperation(2);
    this.g.put(paramaX.M(), jDialog2);
  }
  
  private JDialog j(String paramString) {
    for (JDialog jDialog : this.g.values()) {
      if (!jDialog.isDisplayable())
        this.g.remove(jDialog.getTitle()); 
    } 
    return (JDialog)this.g.get(paramString);
  }
  
  public void a(Frame paramFrame, String paramString) {
    String str = a.a().c("lookAndFeelClass", "defaultLookAndFeelClass");
    a.a().b("lookAndFeelClass", paramString);
    if (paramString.contains("TinyLookAndFeel") || str.contains("TinyLookAndFeel")) {
      String str1 = g.b("You must restart for changes to take effect. Restart Now?");
      if (bV.a(str1, paramFrame, true)) {
        try {
          a.a().e();
        } catch (a a) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
        d(paramFrame);
      } 
    } else {
      try {
        UIManager.setLookAndFeel(paramString);
        if (paramString.contains("Nimbus")) {
          UIDefaults uIDefaults = UIManager.getLookAndFeel().getDefaults();
          uIDefaults.put("Table.cellNoFocusBorder", new Insets(0, 0, 0, 0));
          uIDefaults.put("Table.focusCellHighlightBorder", new Insets(0, 0, 0, 0));
          UIManager.getLookAndFeelDefaults().put("Table.cellNoFocusBorder", new Insets(0, 0, 0, 0));
          UIManager.getLookAndFeelDefaults().put("Table.focusCellHighlightBorder", new Insets(0, 0, 0, 0));
        } 
        x();
        SwingUtilities.updateComponentTreeUI(paramFrame);
        dd.a().g().c();
        bV.e();
        bV.a(new id());
      } catch (Exception exception) {
        D.c("Exception setting look to " + paramString);
      } 
    } 
  }
  
  public void x() {
    boolean bool = (J.a() && UIManager.getLookAndFeel().isNativeLookAndFeel()) ? true : false;
    try {
      UIManager.setLookAndFeel(UIManager.getLookAndFeel());
    } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, unsupportedLookAndFeelException);
    } 
    Font font1 = UIManager.getFont("Label.font");
    if (font1 != null && font1.getSize() < 14)
      eJ.c(font1.getSize()); 
    int i = eJ.a();
    int j = a.a().a(a.aH, a.a().o());
    float f1 = j / i;
    Set set = UIManager.getLookAndFeelDefaults().keySet();
    Object[] arrayOfObject1 = set.toArray(new Object[set.size()]);
    Object[] arrayOfObject2 = new Object[arrayOfObject1.length + 1];
    System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, arrayOfObject1.length);
    arrayOfObject2[arrayOfObject2.length - 1] = "defaultFont";
    arrayOfObject1 = arrayOfObject2;
    Font font2 = UIManager.getFont("defaultFont");
    for (Object object : arrayOfObject1) {
      if (object != null && object.toString().toLowerCase().contains("font")) {
        Font font = UIManager.getFont(object);
        if (font != null && !bool) {
          Float float_ = (Float)this.k.get(object);
          if (float_ == null) {
            this.k.put(object, Float.valueOf(font.getSize2D()));
            float_ = Float.valueOf(font.getSize2D());
          } 
          Font font3 = new Font(font.getFamily(), font.getStyle(), Math.round(eJ.a(float_.floatValue() * f1)));
          UIManager.put(object, font3);
        } else if (font == null) {
          D.c("no update:" + object);
        } 
      } else if (object != null && object.toString().equals("ScrollBar.width")) {
        System.out.println(object);
        if (UIManager.getInt(object) < 20)
          UIManager.put(object, Integer.valueOf(eJ.a(UIManager.getInt(object)))); 
      } else if (UIManager.get(object) instanceof Font) {
        D.c("no update:" + object);
      } 
    } 
    if (font2 != null) {
      Font font = new Font(font2.getFamily(), font2.getStyle(), eJ.a(12));
      UIManager.getLookAndFeel().getDefaults().put("defaultFont", font);
    } 
    if (dd.a().c() != null) {
      SwingUtilities.updateComponentTreeUI(dd.a().c());
      dd.a().g().c();
      bV.e();
      bV.a(new id());
    } 
  }
  
  public void a(b paramb) {
    this.d.add(paramb);
  }
  
  protected void y() {
    x x = dd.a().b();
    try {
      if (x.isVisible()) {
        x.k(a.a().b() + " " + g.b("Shut down...."));
        x.paint(x.getGraphics());
      } 
    } catch (Exception exception) {}
    n();
    Thread.yield();
    for (b b : this.d) {
      if (!b.b()) {
        D.b("App shut down has been asked to stop.\nI will kill event thread. Ignore stack trace.");
        if (x != null)
          x.ab(); 
        dd.a().c().setVisible(true);
        ((String)null).toString();
      } 
    } 
    D.d("Finalizing Sensors");
    x.a().f();
  }
  
  private Rectangle a(String paramString, Rectangle paramRectangle) {
    Properties properties;
    Rectangle rectangle = new Rectangle();
    a a = a.A();
    if (a == null)
      properties = a.a().d(); 
    try {
      rectangle.x = Integer.parseInt(properties.getProperty(paramString + "_X", "0"));
      if (rectangle.x == 0) {
        rectangle.x = paramRectangle.x;
      } else {
        rectangle.x = eJ.a(rectangle.x);
      } 
      rectangle.y = Integer.parseInt(properties.getProperty(paramString + "_Y", "0"));
      if (rectangle.y == 0) {
        rectangle.y = paramRectangle.y;
      } else {
        rectangle.y = eJ.a(rectangle.y);
      } 
      rectangle.width = Integer.parseInt(properties.getProperty(paramString + "_width", "0"));
      if (rectangle.width == 0) {
        rectangle.width = paramRectangle.width;
      } else {
        rectangle.width = eJ.a(rectangle.width);
      } 
      rectangle.height = Integer.parseInt(properties.getProperty(paramString + "_height", "0"));
      if (rectangle.height == 0) {
        rectangle.height = paramRectangle.height;
      } else {
        rectangle.height = eJ.a(rectangle.height);
      } 
    } catch (Exception exception) {
      return paramRectangle;
    } 
    return rectangle;
  }
  
  public void k(Frame paramFrame) {
    if (!i.a().a("09fewlkm309glkfds09"))
      return; 
    String str = a.a().c("lastProjectPath", "");
    if (!str.equals("") && !a.u(str))
      a(paramFrame, str); 
  }
  
  public ig j(Window paramWindow) {
    n n = dd.a().m();
    if (n == null || !n.getTitleAt(n.getSelectedIndex()).equals(hb.r)) {
      a a = a.A();
      if (a != null) {
        ig ig = new ig(paramWindow);
        try {
          ig.a(a);
        } catch (a a1) {
          D.a("Error setting current project.", (Exception)a1, paramWindow);
        } 
        ig.a();
        ig.a(new p(this));
        return ig;
      } 
      bV.d("There must be an open project to show Project Properties.", paramWindow);
      return null;
    } 
    return null;
  }
  
  public void z() {
    this.j.run();
  }
  
  public void k(Window paramWindow) {
    a a = a.A();
    if (a == null)
      return; 
    String str = "" + a.c(T.a().c().O().as());
    j j = new j(str);
    j.a(paramWindow);
  }
  
  public void a(bW parambW) {
    a a = a.A();
    if (a == null) {
      bV.d("There must be a project open to add additional Gauge Clusters.", (Component)parambW);
      return;
    } 
    bW bW1 = dd.a().h();
    String str = "";
    boolean bool = false;
    while (true) {
      if (str == null || str.trim().length() == 0) {
        str = JOptionPane.showInputDialog((Component)parambW, g.b("New Gauge Cluster Name"), g.b("Add New Gauge Cluster Tab"), 3);
      } else {
        str = JOptionPane.showInputDialog((Component)parambW, g.b("New Gauge Cluster Name"), str);
      } 
      if (str == null || str.trim().equals(""))
        return; 
      if (bW1.d(str)) {
        bV.d(g.b("Name Already In Use."), (Component)bW1);
        bool = true;
      } else if (!t.a(str)) {
        bV.d(g.b("Invalid Characters in gauge cluster name."), (Component)bW1);
        bool = true;
      } else {
        bool = false;
      } 
      if (!bool) {
        x x = new x(T.a().c());
        x.setName(str);
        x.l(true);
        T t = x.X();
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher)t);
        x.setBackground(Color.DARK_GRAY);
        aE.f f1 = new aE.f();
        f1.a(str);
        f1.b(str + "." + a.co);
        x.m(f1.a(a));
        bW1.a(x, str);
        bW1.g(str);
        a.a(f1);
        x.a(new E(this, str));
        return;
      } 
    } 
  }
  
  public void A() {
    boolean bool = bV.a("The application will be closed after removing the Registration.\n \nThis computer will be removed from the count of active computers using \nyour registration within 30-60 days.\n\n Are you sure you want to remove the registration information Now?", dd.a().c(), true);
    if (!bool)
      return; 
    a.a().d(a.cC, "");
    a.a().d(a.cD, "");
    a.a().d(a.cF, "");
    a.a().d(a.cE, "");
    a.a().d(a.j, "");
    a.a().d(a.n, "");
    a.a().b(a.cL, "false");
    try {
      a.a().i();
    } catch (a a) {
      D.a("Failed to save registration file.", (Exception)a, dd.a().c());
    } 
    bV.d(a.b + " " + a.c + " registration has been removed.\n" + a.b + " will now close.", dd.a().c());
    s();
  }
  
  public void l(Frame paramFrame) {
    String str = a.a().a(a.cF, null);
    if (str != null)
      bG.a(paramFrame); 
  }
  
  public void b(Frame paramFrame, String paramString) {
    a.a().b("viewLanguageCode", paramString);
    boolean bool = bV.a(g.b("You must restart for changes to take effect. Restart Now?"), paramFrame, true);
    if (bool)
      d(paramFrame); 
  }
  
  public void m(Frame paramFrame) {
    a a = a.A();
    if (a == null) {
      bV.d("You must have a Project Open for Restore Points.", paramFrame);
      return;
    } 
    s s = new s(a);
    s.a(paramFrame);
  }
  
  public void B() {
    a a = new a(a.a().c(a.aN, ""), a.a().c(a.cE, ""), "", a.b, a.c, a.a);
    a.a(dd.a().c());
  }
  
  public void C() {
    R r = T.a().c();
    if (r == null) {
      bV.d("There are no Active Protocol Stats.", dd.a().c());
      return;
    } 
    h h = r.C().D();
    if (h == null) {
      bV.d("There are no Active Protocol Stats.", dd.a().c());
      return;
    } 
    F f1 = new F(h);
    f1.a(dd.a().c(), g.b("Protocol Stats"), (bc)f1);
  }
  
  public void D() {
    JFrame jFrame = dd.a().c();
    a a = new a(dd.a().c());
    a.setSize(eJ.a(600), eJ.a(280));
    bV.a(jFrame, (Component)a);
    a.setVisible(true);
  }
  
  public void a(R paramR, bI parambI, Component paramComponent) {
    try {
      a a = c.a().a(paramR, parambI);
      a.a(paramComponent);
    } catch (e e) {
      bV.d(e.getMessage(), paramComponent);
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)e);
    } 
  }
  
  public void E() {
    a a = new a(x.a().b());
    a.a(dd.a().c());
  }
  
  public void F() {
    ai.f f1 = new ai.f();
    String str = d.a("/help/learnMore.html");
    try {
      bV.a(dd.a().c(), (Component)f1);
      f1.b(str);
    } catch (a a) {
      D.a("Unable to open help:\n" + str, (Exception)a, dd.a().c());
    } 
    f1.setPreferredSize(eJ.a(1050, 800));
    f1.a(dd.a().c(), g.b("Upgrade Now!!"));
  }
  
  public void G() {
    if (i.a().a("h-=ds[]gdsgds[p"))
      try {
        iP.a().a(dd.a().b());
      } catch (a a) {
        hq.a().d("Error: " + a.getMessage());
      }  
  }
  
  public void l(Window paramWindow) {
    R r = T.a().c();
    if (r == null) {
      D.b("EcuConfig is null, not showing DataLogEvent");
      return;
    } 
    g g = new g(r);
    g.a(paramWindow);
  }
  
  public void m(Window paramWindow) {
    g g = new g(a.A());
    g.a(paramWindow);
  }
  
  public void n(Frame paramFrame) {
    a a = new a(paramFrame, (ap)new ar(a.a().d(), "BinaryDiff"));
    a.setSize(eJ.a(1000), eJ.a(600));
    bV.a(dd.a().c(), (Component)a);
    a.setVisible(true);
  }
  
  public void H() {
    if (a.A() == null)
      bV.d("A Project must be loaded to add a channel", dd.a().c()); 
    a a = new a();
    a.a();
  }
  
  public void o(Frame paramFrame) {
    R r = T.a().c();
    if (r != null) {
      if (ak.b(a.A().j())) {
        ak ak = new ak();
        String str = null;
        str = bV.a(paramFrame, "ECU Definition Password: ");
        if (str == null)
          return; 
        try {
          ak.a(a.A().j(), str);
        } catch (FileNotFoundException fileNotFoundException) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, fileNotFoundException);
          bV.d("File Not Found!", paramFrame);
          return;
        } catch (IOException iOException) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
          bV.d("Unable to read file.", paramFrame);
          return;
        } catch (aj aj) {
          bV.d("Invalid Password!", paramFrame);
          return;
        } 
      } 
      e e = new e(paramFrame);
      e.setSize(eJ.a(1000), eJ.a(600));
      bV.a(paramFrame, (Component)e);
      e.setVisible(true);
      e.a(r);
    } 
  }
  
  public void c(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public boolean I() {
    R r = T.a().c();
    return (r == null) ? false : ((r.C() instanceof l && ((l)r.C()).h()));
  }
  
  public void J() {
    byte b = 0;
    for (String str : T.a().d()) {
      R r = T.a().c(str);
      if (i.a().a("98fg54lklk") && !I() && !a.a(r).e() && a.a(r).b() == 0 && T.a().c() != null) {
        boolean bool = true;
        if (bool) {
          m m = new m(r);
          try {
            m.a(m.k, Integer.valueOf(21848 + b++));
          } catch (s s) {
            Logger.getLogger(f.class.getName()).log(Level.WARNING, "Failed to set ECU Hub Port on TCP", (Throwable)s);
          } 
          D.d("Starting TCP Slave Server");
          a.a(r).a((r)m);
        } else {
          s s = new s(r);
          try {
            s.a(m.k, Integer.valueOf(21848 + b++));
          } catch (s s1) {
            Logger.getLogger(f.class.getName()).log(Level.WARNING, "Failed to set ECU Hub Port on UDP", (Throwable)s1);
          } 
          a.a(r).a((r)s);
          D.d("Starting UDP Slave Server");
        } 
      } 
      a.a(r).a();
    } 
  }
  
  public void K() {
    if (i.a().a("98fg54lklk"))
      a.c(); 
  }
  
  public void d(boolean paramBoolean) {
    a.a().b(a.ci, Boolean.toString(paramBoolean));
    bH.a().a(paramBoolean);
  }
  
  public void L() {
    q q = new q(this);
    q.start();
  }
  
  public void n(Window paramWindow) {
    a a = new a(new jz(), g.d());
    a.a(paramWindow);
  }
  
  public void M() {
    if (Desktop.isDesktopSupported())
      try {
        if (a.A() != null) {
          Desktop.getDesktop().open(new File(a.A().t()));
        } else {
          Desktop.getDesktop().open(new File(j.u()));
        } 
      } catch (IOException iOException) {
        Logger.getLogger(f.class.getName()).log(Level.INFO, "Failed to open Project folder", iOException);
      }  
  }
  
  public void N() {
    if (i.a().a("poij  fdsz poi9ure895 ms7("))
      try {
        J j = new J((B)z.a(), bV.a());
        j.a(dd.a().c());
      } catch (a a) {
        bV.d(g.b(a.getLocalizedMessage()), dd.a().c());
      }  
  }
  
  public void O() {
    if (i.a().a("poij  fdsz poi9ure895 ms7("))
      try {
        a a = new a((l)x.a(), (B)z.a(), bV.a());
        a.a(dd.a().c());
      } catch (a a) {
        bV.d(g.b(a.getLocalizedMessage()), dd.a().c());
      }  
  }
  
  public void P() {
    if (Desktop.isDesktopSupported() && a.A() != null)
      try {
        Desktop.getDesktop().open(a.A().L());
      } catch (IOException iOException) {
        Logger.getLogger(f.class.getName()).log(Level.INFO, "Failed to open Data Log folder", iOException);
      }  
  }
  
  public void Q() {
    if (i.a().a("kjlkgoi098")) {
      dd.a().m().g(hb.u);
    } else {
      dd.a().m().setSelectedIndex(0);
    } 
  }
  
  public void R() {
    if (dd.a().m() != null)
      dd.a().m().setSelectedIndex(0); 
  }
  
  public void S() {
    if (T.a().c() == null)
      bV.d("No EcuConfiguration Loaded!", bV.c()); 
    a a = new a(T.a().c());
    a.a(bV.c());
  }
  
  public void i(String paramString) {
    a.a(dd.a().c(), paramString);
  }
  
  public void T() {
    u u = new u(this);
    u.b("userParameter_Timeout in Minutes", a.a().c(a.ag, a.ah));
    String str1 = "Once you enter a password for a password protected dialog\nit will be cached for the set number of minutes without\nthe need to re-enter for any dialog using the same password.\n\nNote: The Cache is cleared when closing the project.";
    String str2 = bV.a("{Timeout in Minutes}", true, str1, true, dd.a().c(), u, null);
    if (str2 != null && !str2.isEmpty())
      try {
        int i = Integer.parseInt(str2);
        a.a().b(a.ag, str2);
        W.a(i);
      } catch (NumberFormatException numberFormatException) {
        bV.d("Time must be a valid integer.", dd.a().c());
      }  
  }
  
  void a(String[] paramArrayOfString) {
    if (paramArrayOfString.length < 4) {
      D.a(C.f.k);
      System.exit(0);
    } 
    String str1 = paramArrayOfString[1];
    String str2 = paramArrayOfString[2];
    String str3 = paramArrayOfString[3];
    v v = new v(this, str1, str2, str3);
    try {
      SwingUtilities.invokeAndWait(v);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } catch (InvocationTargetException invocationTargetException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
    } 
    System.exit(0);
  }
  
  public void a(R paramR, cj paramcj) {
    m m = m.b(paramR.O(), paramcj.a(), paramcj.b(), paramcj.c());
    cx cx = new cx(paramR);
    cx.b(paramcj.b());
    m.b((n)cx);
    paramR.C().b(m);
  }
  
  public void a(R paramR, int paramInt) {
    m m = m.d(paramR.O(), paramInt);
    cx cx = new cx(paramR);
    m.b((n)cx);
    paramR.C().b(m);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */