package com.efiAnalytics.tuningwidgets.panels;

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
import bH.T;
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

public class az extends d implements aN, aO {
  y a;
  
  String b = "";
  
  R c = null;
  
  bh d = null;
  
  bh e = null;
  
  bh f = null;
  
  bh g = null;
  
  JPanel h = null;
  
  A i = null;
  
  aV j = null;
  
  public az(R paramR, int paramInt) {
    if (paramInt != -1)
      this.b = paramInt + ""; 
    this.c = paramR;
    this.d = g();
    this.e = j();
    this.f = k();
    this.g = m();
    this.h = n();
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("North", this.h);
    jPanel1.add("South", (Component)this.g);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("North", (Component)this.e);
    jPanel2.add("South", (Component)this.f);
    jPanel1.add("Center", jPanel2);
    add("West", jPanel1);
    add("East", (Component)this.d);
    aR aR = aR.a();
    try {
      aR.a(paramR.c(), "reqFuel" + this.b, this);
      aR.a(paramR.c(), "alternate" + this.b, this);
      aR.a(paramR.c(), "nCylinders" + this.b, this);
      aR.a(paramR.c(), "nInjectors" + this.b, this);
      aR.a(paramR.c(), "divider" + this.b, this);
      aR.a(paramR.c(), "injOpen" + this.b, this);
      aR.a(paramR.c(), "battFac" + this.b, this);
    } catch (a a) {
      D.a("Unable to register all parameters.", (Exception)a, this);
    } 
    p();
    c();
  }
  
  protected void a(String paramString) {
    aM aM1 = this.c.c("nCylinders" + this.b);
    aM aM2 = this.c.c("divider" + this.b);
    aM aM3 = this.c.c("alternate" + this.b);
    try {
      int i = (int)aM1.j(this.c.p());
      double d1 = 1.0E-4D + aM1.j(this.c.p()) / Double.parseDouble(paramString);
      int j = (int)d1;
      double d2 = (aM3.j(this.c.p()) > 0.0D) ? 2.0D : 1.0D;
      if (Math.abs(d1 - j) > 0.001D || i == 0 || d2 * (d1 - 1.0E-4D) / i > 1.0D) {
        bV.d("Injections Per Cycle not valid for " + i + " cylinders.\n(Number of Cylinders) / (Injections Per Cycle) must produce a whole number.\nPlease correct.\nWhen set to Alternating, Squirts Per Engine Cycle must be a multiple of 2.", (Component)this);
        p();
        return;
      } 
      aM2.a(this.c.p(), j);
    } catch (g g) {
      D.a("Unable to retrive values for nCylinders or divider", (Exception)g, this);
    } catch (j j) {
      D.a("Can not set value", (Exception)j, this);
    } 
  }
  
  public void a() {
    E e = new E(this.c);
    aA aA = new aA(this);
    Window window = bV.b((Component)this);
    an an = new an(window, this.c, (et)e, aA);
    bV.a(window, an);
    an.setVisible(true);
  }
  
  protected void b(String paramString) {
    String str = this.i.getText();
    this.i.setText(paramString);
    this.j.j();
    try {
      b();
    } catch (j j) {
      bV.d(j.getMessage(), (Component)this);
      this.j.i();
    } 
  }
  
  private bh g() {
    bv bv = new bv();
    bv.v("injControl");
    a(bv, c("Control Algorithm"), "algorithm" + this.b);
    a(bv, c("Injector Staging"), "alternate" + this.b);
    a(bv, c("Engine Stroke"), "twoStroke" + this.b);
    a(bv, c("Number of Cylinders"), "nCylinders" + this.b);
    a(bv, c("Injector Port Type"), "injType" + this.b);
    a(bv, c("Number of Injectors"), "nInjectors" + this.b);
    a(bv, c("MAP Type"), "mapType" + this.b);
    a(bv, c("Engine Type"), "engineType" + this.b);
    bh bh1 = new bh(this.c, bv);
    JPanel jPanel = h();
    jPanel.add("Center", (Component)new bb("Squirts Per Engine Cycle"));
    this.a = new y();
    this.a.addItem("1");
    this.a.addItem("2");
    this.a.addItem("3");
    this.a.addItem("4");
    this.a.addItem("5");
    this.a.addItem("6");
    this.a.addItem("7");
    this.a.addItem("8");
    this.a.a(new aB(this));
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
  
  private JPanel h() {
    aE aE = new aE(this);
    aE.setLayout(new BorderLayout(3, 3));
    return aE;
  }
  
  private bh j() {
    bv bv = new bv();
    bv.v("injCharacteristics");
    a(bv, c("Injector Opening Time"), "injOpen" + this.b);
    a(bv, c("Battery Voltage Correction"), "battFac" + this.b);
    a(bv, c("PWM Current Limit"), "injPwmP" + this.b);
    a(bv, c("PWM Time"), "injPwmT" + this.b);
    return new bh(this.c, bv);
  }
  
  private bh k() {
    bv bv = new bv();
    bv.v("injfastIdle");
    String str1 = "fastIdleT" + this.b;
    aM aM = this.c.c(str1);
    String str2 = "F";
    if (aM != null)
      str2 = aM.p(); 
    a(bv, c("Fast Idle Threshold") + " (" + T.a() + str2 + ")", str1);
    return new bh(this.c, bv);
  }
  
  private bh m() {
    bv bv = new bv();
    bv.v("baroCorrection");
    a(bv, c("Barometric Correction"), "baroCorr" + this.b);
    return new bh(this.c, bv);
  }
  
  private JPanel n() {
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), c("Calculate Required Fuel")));
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout());
    JButton jButton = new JButton(c("Required Fuel..."));
    jButton.setMnemonic(82);
    jButton.addActionListener(new aC(this));
    jPanel2.add(jButton);
    jPanel1.add("Center", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1, 3, 3));
    this.i = new A("");
    this.i.a(new aD(this));
    bq bq = new bq();
    bq.e("");
    bq.b("reqFuel" + this.b);
    this.j = new aV(this.c, bq);
    this.j.c(false);
    try {
      aR.a().a(this.c.c(), "reqFuel" + this.b, (aN)this.j);
    } catch (a a) {
      D.a("Error subscribing to reqFuel" + this.b, (Exception)a, this);
    } 
    jPanel3.add((Component)this.i);
    jPanel3.add((Component)this.j);
    jPanel1.add("East", jPanel3);
    return jPanel1;
  }
  
  private void o() {
    try {
      b();
    } catch (j j) {
      bV.d(j.getMessage(), (Component)this);
      e();
    } 
  }
  
  public void b() {
    aM aM1 = this.c.c("nInjectors" + this.b);
    aM aM2 = this.c.c("divider" + this.b);
    aM aM3 = this.c.c("reqFuel" + this.b);
    aM aM4 = this.c.c("alternate" + this.b);
    try {
      String str = this.i.getText();
      if (str.equals(""))
        str = "0.0"; 
      double d1 = Double.parseDouble(str);
      double d2 = aM4.j(this.c.p()) + 1.0D;
      double d3 = aM2.j(this.c.p());
      double d4 = aM1.j(this.c.p());
      double d5 = d1 * d2 * d3 / d4;
      aM3.a(this.c.p(), d5);
    } catch (g g) {
      g.printStackTrace();
    } 
  }
  
  private String c(String paramString) {
    return g.b(this.c.u(paramString));
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2.startsWith("reqFuel")) {
      c();
    } else if (paramString2.startsWith("alternate")) {
      if (p())
        o(); 
    } else if (paramString2.startsWith("nCylinders")) {
      if (p())
        o(); 
    } else if (paramString2.startsWith("nInjectors")) {
      if (p())
        o(); 
    } else if (paramString2.startsWith("divider")) {
      if (p())
        o(); 
    } else if (paramString2.startsWith("injOpen" + this.b)) {
      aM aM = this.c.c("injOpen" + this.b);
      try {
        double d1 = aM.j(this.c.p());
        if (d1 < 0.899D || d1 > 1.301D)
          bV.d("WARNING!!\n\nInjector Open Time is not within a normal range.\nThe expected value is between 0.9 and 1.3 ms.\nThe typical value is 1.0", (Component)this); 
      } catch (g g) {
        bV.d("Error testing Injector Open Time", (Component)this);
      } 
    } else if (paramString2.startsWith("battFac" + this.b)) {
      aM aM = this.c.c("battFac" + this.b);
      try {
        double d1 = aM.j(this.c.p());
        if (d1 < 0.099D || d1 > 0.201D)
          bV.d("WARNING!!\n\nBattery Voltage Correction is not within a normal range.\nThe expected value is between 0.1 and 0.3 ms/V.\nThe typical value is 0.1", (Component)this); 
      } catch (g g) {
        bV.d("Error testing Battery Correction Factor", (Component)this);
      } 
    } 
  }
  
  private boolean p() {
    aM aM1 = this.c.c("nCylinders" + this.b);
    aM aM2 = this.c.c("divider" + this.b);
    aM aM3 = this.c.c("rpmk" + this.b);
    aM aM4 = this.c.c("twoStroke" + this.b);
    try {
      int i = (int)aM1.j(this.c.p());
      double d1 = 1.0E-4D + aM1.j(this.c.p()) / aM2.j(this.c.p());
      int j = (int)d1;
      if (Math.abs(d1 - j) > 0.001D) {
        bV.d("Injections Per Cycle not valid for " + i + " cylinders.\n(Number of Cylinders) / (Injections Per Cycle) must produce a whole number.", (Component)this);
        return false;
      } 
      this.a.a("" + j);
      double d2 = aM4.j(this.c.p());
      double d3 = (((d2 != 0.0D) ? 6000 : 12000) / i);
      aM3.a(this.c.p(), d3);
    } catch (g g) {
      D.a("Unable to retrive values for nCylinders or divider", (Exception)g, this);
    } catch (j j) {
      D.a("Value Out Of Bounds for rpmk, this shouldn't happen.\nPlease report it.", (Exception)j, this);
    } 
    return true;
  }
  
  public void c() {
    aM aM1 = this.c.c("nInjectors" + this.b);
    aM aM2 = this.c.c("divider" + this.b);
    aM aM3 = this.c.c("reqFuel" + this.b);
    aM aM4 = this.c.c("alternate" + this.b);
    try {
      double d1 = aM3.j(this.c.p());
      double d2 = aM4.j(this.c.p()) + 1.0D;
      double d3 = aM2.j(this.c.p());
      double d4 = aM1.j(this.c.p());
      double d5 = d1 * d4 / d2 * d3;
      this.i.setText(X.b(d5, 1));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void d() {
    try {
      this.c.p().d();
    } catch (g g) {
      D.a("Error performing redo:", (Exception)g, this);
    } 
  }
  
  public void e() {
    try {
      this.c.p().c();
    } catch (g g) {
      D.a("Error performing undo:", (Exception)g, this);
    } 
  }
  
  public void f() {
    this.c.I();
  }
  
  public void i() {
    f();
    this.j.close();
    this.d.close();
    this.e.close();
    this.f.close();
    this.g.close();
    aR.a().a(this);
    l();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */