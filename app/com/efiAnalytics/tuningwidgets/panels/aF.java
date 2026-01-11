package com.efiAnalytics.tuningwidgets.panels;

import C.a;
import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.bA;
import G.bq;
import G.bv;
import V.a;
import V.g;
import V.j;
import bH.D;
import bH.X;
import bt.A;
import bt.E;
import bt.aV;
import bt.bb;
import bt.bh;
import bt.d;
import bt.y;
import com.efiAnalytics.ui.aO;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import s.g;

public class aF extends d implements aN, aO, bc {
  y a;
  
  R b = null;
  
  bh c = null;
  
  JPanel d = null;
  
  A e = null;
  
  aV f = null;
  
  private boolean g = true;
  
  public aF(R paramR) {
    this.b = paramR;
    this.c = g();
    this.d = j();
    this.g = paramR.O().an();
    setLayout(new BorderLayout());
    add("North", this.d);
    add("East", (Component)this.c);
    aR aR = aR.a();
    try {
      aR.a(paramR.c(), "reqFuel", this);
      aR.a(paramR.c(), "alternate", this);
      aR.a(paramR.c(), "nCylinders", this);
      aR.a(paramR.c(), "nInjectors", this);
      aR.a(paramR.c(), "divider", this);
    } catch (a a) {
      D.a("Unable to register all parameters.", (Exception)a, this);
    } 
    n();
    c();
  }
  
  protected boolean a(String paramString) {
    aM aM1 = this.b.c("nCylinders");
    aM aM2 = this.b.c("divider");
    aM aM3 = this.b.c("alternate");
    try {
      int i = (int)aM1.j(this.b.p());
      double d1 = Double.parseDouble(paramString);
      double d2 = aM1.j(this.b.p()) / d1;
      int j = (int)d2;
      double d3 = (aM3.j(this.b.p()) > 0.0D) ? 2.0D : 1.0D;
      if (this.g) {
        if (i % d1 != 0.0D || (d3 == 2.0D && d1 % 2.0D != 0.0D)) {
          if (d3 == 2.0D && (i % d1 != 0.0D || d1 % 2.0D != 0.0D)) {
            bV.d("Can not alternate " + i + " cyl with " + (int)d1 + " squirts.\nEither set to Simultaneous or adjust squirts so that:\ncyl / squirts produces a whole number with no remainder,\nsquirts is an even number and evenly divisible into the number of cylinders.\n", (Component)this);
          } else {
            bV.d(i + " cyl is not valid with " + (int)d1 + " squirts.\nAdjust squirts so that:\ncyl / squirts produces a whole number\n", (Component)this);
          } 
          return false;
        } 
        if (Math.abs(d2 - j) > 0.001D) {
          bV.d(paramString + " Injections Per Cycle not valid for " + i + " cylinders.\n(Number of Cylinders) / (Injections Per Cycle) must produce a whole number.\nPlease correct.\n", (Component)this);
          return false;
        } 
      } 
      aM2.a(this.b.p(), j);
      return true;
    } catch (g g) {
      D.a("Unable to retrive values for nCylinders or divider", (Exception)g, this);
    } catch (j j) {
      D.a("Can not set value", (Exception)j, this);
    } 
    return false;
  }
  
  public void a() {
    E e = new E(this.b);
    aG aG = new aG(this);
    Window window = bV.b((Component)this);
    an an = new an(window, this.b, (et)e, aG);
    bV.a(window, an);
    an.setVisible(true);
  }
  
  protected void b(String paramString) {
    String str = this.e.getText();
    this.e.setText(paramString);
    this.f.j();
    b();
  }
  
  private bh g() {
    bv bv = new bv();
    a a = a.a();
    bv.v("injControl");
    a(bv, c("Control Algorithm"), "algorithm");
    a(bv, c("Injector Staging"), "alternate");
    a(bv, c("Engine Stroke"), "twoStroke");
    a(bv, c("Number of Cylinders"), "nCylinders");
    a(bv, c("Injector Port Type"), "injType");
    a(bv, c("Number of Injectors"), "nInjectors");
    a(bv, c("Engine Type"), "engineType");
    bh bh1 = new bh(this.b, bv);
    JPanel jPanel = h();
    jPanel.add("Center", (Component)new bb(c("Squirts Per Engine Cycle")));
    this.a = new y();
    this.a.addItem("1");
    this.a.addItem("2");
    this.a.addItem("3");
    this.a.addItem("4");
    this.a.addItem("5");
    this.a.addItem("6");
    this.a.addItem("7");
    this.a.addItem("8");
    this.a.a(new aH(this));
    jPanel.add("East", (Component)this.a);
    bh1.add(jPanel, 1);
    return bh1;
  }
  
  private bq a(bv parambv, String paramString1, String paramString2) {
    bq bq = new bq();
    bq.e(paramString1);
    bq.b(paramString2);
    parambv.a((bA)bq);
    return bq;
  }
  
  private String c(String paramString) {
    return g.b(this.b.u(paramString));
  }
  
  private JPanel h() {
    aK aK = new aK(this);
    aK.setLayout(new BorderLayout(3, 3));
    return aK;
  }
  
  private JPanel j() {
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), c("Calculate Required Fuel")));
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout());
    JButton jButton = new JButton(c("Required Fuel..."));
    jButton.setMnemonic(82);
    jButton.addActionListener(new aI(this));
    jPanel2.add(jButton);
    jPanel1.add("Center", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1, 3, 3));
    this.e = new A("");
    this.e.a(new aJ(this));
    bq bq = new bq();
    bq.e("");
    bq.b("reqFuel");
    this.f = new aV(this.b, bq);
    this.f.c(false);
    try {
      aR.a().a(this.b.c(), "reqFuel", (aN)this.f);
    } catch (a a) {
      D.a("Error subscribing to reqFuel", (Exception)a, this);
    } 
    jPanel3.add((Component)this.e);
    jPanel3.add((Component)this.f);
    jPanel1.add("East", jPanel3);
    return jPanel1;
  }
  
  private void k() {
    b();
  }
  
  public void b() {
    aM aM1 = this.b.c("nInjectors");
    aM aM2 = this.b.c("divider");
    aM aM3 = this.b.c("reqFuel");
    aM aM4 = this.b.c("alternate");
    try {
      String str = this.e.getText();
      if (str.equals(""))
        str = "0.0"; 
      double d1 = Double.parseDouble(str);
      double d2 = aM4.j(this.b.p()) + 1.0D;
      double d3 = aM2.j(this.b.p());
      double d4 = aM1.j(this.b.p());
      double d5 = d1 * d2 * d3 / d4;
      aM3.a(this.b.p(), d5);
    } catch (g g) {
      g.printStackTrace();
    } catch (j j) {
      bV.d("ReqFuel " + j.getMessage(), (Component)this);
      try {
        if (j.a() == 2) {
          aM3.a(this.b.h(), aM3.r());
        } else if (j.a() == 1) {
          aM3.a(this.b.h(), aM3.s());
        } 
      } catch (g g) {
        D.a("Error trying to set reqFuel.");
        g.printStackTrace();
      } catch (j j1) {
        D.a("reset reqFuel but it is still out of bounds? This shouldn't happen.");
        j1.printStackTrace();
      } 
      this.f.i();
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2.startsWith("reqFuel")) {
      c();
    } else if (paramString2.startsWith("alternate")) {
      if (m())
        k(); 
    } else if (paramString2.startsWith("nCylinders")) {
      if (m())
        k(); 
    } else if (paramString2.startsWith("divider")) {
      k();
    } else if (paramString2.startsWith("nInjectors") && m()) {
      k();
    } 
  }
  
  private boolean m() {
    return a(this.a.a());
  }
  
  private boolean n() {
    aM aM1 = this.b.c("nCylinders");
    aM aM2 = this.b.c("divider");
    try {
      int i = (int)aM1.j(this.b.p());
      double d1 = aM1.j(this.b.p()) / aM2.j(this.b.p());
      int j = (int)d1;
      this.a.a("" + j);
    } catch (g g) {
      D.a("Unable to retrive values for nCylinders or divider", (Exception)g, this);
    } 
    return true;
  }
  
  public void c() {
    aM aM1 = this.b.c("nInjectors");
    aM aM2 = this.b.c("divider");
    aM aM3 = this.b.c("reqFuel");
    aM aM4 = this.b.c("alternate");
    try {
      double d1 = aM3.j(this.b.p());
      double d2 = aM4.j(this.b.p()) + 1.0D;
      double d3 = aM2.j(this.b.p());
      double d4 = aM1.j(this.b.p());
      double d5 = d1 * d4 / d2 * d3;
      this.e.setText(X.b(d5, 1));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void d() {
    try {
      this.b.p().d();
    } catch (g g) {
      D.a("Error performing redo:", (Exception)g, this);
    } 
  }
  
  public void e() {
    try {
      this.b.p().c();
    } catch (g g) {
      D.a("Error performing undo:", (Exception)g, this);
    } 
  }
  
  public void f() {
    this.b.I();
  }
  
  public void i() {
    f();
    this.f.close();
    this.c.close();
    aR.a().a(this);
    l();
  }
  
  public void close() {
    aR aR = aR.a();
    aR.a(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */