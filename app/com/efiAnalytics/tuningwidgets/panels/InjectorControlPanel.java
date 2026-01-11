package com.efiAnalytics.tuningwidgets.panels;

import C.ExceptionInVPackage;
import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.bA;
import G.bq;
import G.bv;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
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
import s.ExceptionPrintstacktrace;

public class InjectorControlPanel extends d implements aN, aO, bc {
  y ExceptionInVPackage;
  
  R b = null;
  
  bh c = null;
  
  JPanel d = null;
  
  A e = null;
  
  aV f = null;
  
  private boolean ExceptionPrintstacktrace = true;
  
  public aF(R paramR) {
    this.b = paramR;
    this.c = ExceptionPrintstacktrace();
    this.d = ExceptionExtensionGetmessage();
    this.ExceptionPrintstacktrace = paramR.O().an();
    setLayout(new BorderLayout());
    add("North", this.d);
    add("East", (Component)this.c);
    aR aR = aR.ExceptionInVPackage();
    try {
      aR.ExceptionInVPackage(paramR.c(), "reqFuel", this);
      aR.ExceptionInVPackage(paramR.c(), "alternate", this);
      aR.ExceptionInVPackage(paramR.c(), "nCylinders", this);
      aR.ExceptionInVPackage(paramR.c(), "nInjectors", this);
      aR.ExceptionInVPackage(paramR.c(), "divider", this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Unable to register all parameters.", (Exception)ExceptionInVPackage, this);
    } 
    n();
    c();
  }
  
  protected boolean ExceptionInVPackage(String paramString) {
    aM aM1 = this.b.c("nCylinders");
    aM aM2 = this.b.c("divider");
    aM aM3 = this.b.c("alternate");
    try {
      int i = (int)aM1.ExceptionExtensionGetmessage(this.b.p());
      double d1 = Double.parseDouble(paramString);
      double d2 = aM1.ExceptionExtensionGetmessage(this.b.p()) / d1;
      int ExceptionExtensionGetmessage = (int)d2;
      double d3 = (aM3.ExceptionExtensionGetmessage(this.b.p()) > 0.0D) ? 2.0D : 1.0D;
      if (this.ExceptionPrintstacktrace) {
        if (i % d1 != 0.0D || (d3 == 2.0D && d1 % 2.0D != 0.0D)) {
          if (d3 == 2.0D && (i % d1 != 0.0D || d1 % 2.0D != 0.0D)) {
            bV.d("Can not alternate " + i + " cyl with " + (int)d1 + " squirts.\nEither set to Simultaneous or adjust squirts so that:\ncyl / squirts produces ExceptionInVPackage whole number with no remainder,\nsquirts is an even number and evenly divisible into the number of cylinders.\n", (Component)this);
          } else {
            bV.d(i + " cyl is not valid with " + (int)d1 + " squirts.\nAdjust squirts so that:\ncyl / squirts produces ExceptionInVPackage whole number\n", (Component)this);
          } 
          return false;
        } 
        if (Math.abs(d2 - ExceptionExtensionGetmessage) > 0.001D) {
          bV.d(paramString + " Injections Per Cycle not valid for " + i + " cylinders.\n(Number of Cylinders) / (Injections Per Cycle) must produce ExceptionInVPackage whole number.\nPlease correct.\n", (Component)this);
          return false;
        } 
      } 
      aM2.ExceptionInVPackage(this.b.p(), ExceptionExtensionGetmessage);
      return true;
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to retrive values for nCylinders or divider", (Exception)ExceptionPrintstacktrace, this);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      D.ExceptionInVPackage("Can not set value", (Exception)ExceptionExtensionGetmessage, this);
    } 
    return false;
  }
  
  public void ExceptionInVPackage() {
    E e = new E(this.b);
    aG aG = new aG(this);
    Window window = bV.b((Component)this);
    an an = new an(window, this.b, (et)e, aG);
    bV.ExceptionInVPackage(window, an);
    an.setVisible(true);
  }
  
  protected void b(String paramString) {
    String str = this.e.getText();
    this.e.setText(paramString);
    this.f.ExceptionExtensionGetmessage();
    b();
  }
  
  private bh ExceptionPrintstacktrace() {
    bv bv = new bv();
    ExceptionInVPackage ExceptionInVPackage = ExceptionInVPackage.ExceptionInVPackage();
    bv.v("injControl");
    ExceptionInVPackage(bv, c("Control Algorithm"), "algorithm");
    ExceptionInVPackage(bv, c("Injector Staging"), "alternate");
    ExceptionInVPackage(bv, c("Engine Stroke"), "twoStroke");
    ExceptionInVPackage(bv, c("Number of Cylinders"), "nCylinders");
    ExceptionInVPackage(bv, c("Injector Port Type"), "injType");
    ExceptionInVPackage(bv, c("Number of Injectors"), "nInjectors");
    ExceptionInVPackage(bv, c("Engine Type"), "engineType");
    bh bh1 = new bh(this.b, bv);
    JPanel jPanel = h();
    jPanel.add("Center", (Component)new bb(c("Squirts Per Engine Cycle")));
    this.ExceptionInVPackage = new y();
    this.ExceptionInVPackage.addItem("1");
    this.ExceptionInVPackage.addItem("2");
    this.ExceptionInVPackage.addItem("3");
    this.ExceptionInVPackage.addItem("4");
    this.ExceptionInVPackage.addItem("5");
    this.ExceptionInVPackage.addItem("6");
    this.ExceptionInVPackage.addItem("7");
    this.ExceptionInVPackage.addItem("8");
    this.ExceptionInVPackage.ExceptionInVPackage(new aH(this));
    jPanel.add("East", (Component)this.ExceptionInVPackage);
    bh1.add(jPanel, 1);
    return bh1;
  }
  
  private bq ExceptionInVPackage(bv parambv, String paramString1, String paramString2) {
    bq bq = new bq();
    bq.e(paramString1);
    bq.b(paramString2);
    parambv.ExceptionInVPackage((bA)bq);
    return bq;
  }
  
  private String c(String paramString) {
    return ExceptionPrintstacktrace.b(this.b.u(paramString));
  }
  
  private JPanel h() {
    aK aK = new aK(this);
    aK.setLayout(new BorderLayout(3, 3));
    return aK;
  }
  
  private JPanel ExceptionExtensionGetmessage() {
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
    this.e.ExceptionInVPackage(new aJ(this));
    bq bq = new bq();
    bq.e("");
    bq.b("reqFuel");
    this.f = new aV(this.b, bq);
    this.f.c(false);
    try {
      aR.ExceptionInVPackage().ExceptionInVPackage(this.b.c(), "reqFuel", (aN)this.f);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Error subscribing to reqFuel", (Exception)ExceptionInVPackage, this);
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
      double d2 = aM4.ExceptionExtensionGetmessage(this.b.p()) + 1.0D;
      double d3 = aM2.ExceptionExtensionGetmessage(this.b.p());
      double d4 = aM1.ExceptionExtensionGetmessage(this.b.p());
      double d5 = d1 * d2 * d3 / d4;
      aM3.ExceptionInVPackage(this.b.p(), d5);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      bV.d("ReqFuel " + ExceptionExtensionGetmessage.getMessage(), (Component)this);
      try {
        if (ExceptionExtensionGetmessage.ExceptionInVPackage() == 2) {
          aM3.ExceptionInVPackage(this.b.h(), aM3.r());
        } else if (ExceptionExtensionGetmessage.ExceptionInVPackage() == 1) {
          aM3.ExceptionInVPackage(this.b.h(), aM3.s());
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.ExceptionInVPackage("Error trying to set reqFuel.");
        ExceptionPrintstacktrace.printStackTrace();
      } catch (ExceptionExtensionGetmessage j1) {
        D.ExceptionInVPackage("reset reqFuel but it is still out of bounds? This shouldn't happen.");
        j1.printStackTrace();
      } 
      this.f.i();
    } 
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
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
    return ExceptionInVPackage(this.ExceptionInVPackage.ExceptionInVPackage());
  }
  
  private boolean n() {
    aM aM1 = this.b.c("nCylinders");
    aM aM2 = this.b.c("divider");
    try {
      int i = (int)aM1.ExceptionExtensionGetmessage(this.b.p());
      double d1 = aM1.ExceptionExtensionGetmessage(this.b.p()) / aM2.ExceptionExtensionGetmessage(this.b.p());
      int ExceptionExtensionGetmessage = (int)d1;
      this.ExceptionInVPackage.ExceptionInVPackage("" + ExceptionExtensionGetmessage);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to retrive values for nCylinders or divider", (Exception)ExceptionPrintstacktrace, this);
    } 
    return true;
  }
  
  public void c() {
    aM aM1 = this.b.c("nInjectors");
    aM aM2 = this.b.c("divider");
    aM aM3 = this.b.c("reqFuel");
    aM aM4 = this.b.c("alternate");
    try {
      double d1 = aM3.ExceptionExtensionGetmessage(this.b.p());
      double d2 = aM4.ExceptionExtensionGetmessage(this.b.p()) + 1.0D;
      double d3 = aM2.ExceptionExtensionGetmessage(this.b.p());
      double d4 = aM1.ExceptionExtensionGetmessage(this.b.p());
      double d5 = d1 * d4 / d2 * d3;
      this.e.setText(X.b(d5, 1));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void d() {
    try {
      this.b.p().d();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Error performing redo:", (Exception)ExceptionPrintstacktrace, this);
    } 
  }
  
  public void e() {
    try {
      this.b.p().c();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Error performing undo:", (Exception)ExceptionPrintstacktrace, this);
    } 
  }
  
  public void f() {
    this.b.I();
  }
  
  public void i() {
    f();
    this.f.close();
    this.c.close();
    aR.ExceptionInVPackage().ExceptionInVPackage(this);
    l();
  }
  
  public void close() {
    aR aR = aR.ExceptionInVPackage();
    aR.ExceptionInVPackage(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */