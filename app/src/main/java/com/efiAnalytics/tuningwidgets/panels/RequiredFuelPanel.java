package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.Manager;
import G.GInterfaceAn;
import G.ManagerUsingConcurrentHashMap;
import G.Abstract;
import G.GComponentBq;
import G.ArrayListExceptionprintstacktraceInGPackage;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import bH.T;
import bH.X;
import bt.A;
import bt.E;
import bt.ExceptionUsingComponent;
import bt.JLabelExtensionSettext;
import bt.ExceptionEqualsinaipackage;
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
import s.ExceptionPrintstacktrace;

public class RequiredFuelPanel extends d implements GInterfaceAn, aO {
  y ExceptionInVPackage;
  
  String b = "";
  
  R c = null;
  
  ExceptionEqualsinaipackage d = null;
  
  ExceptionEqualsinaipackage e = null;
  
  ExceptionEqualsinaipackage f = null;
  
  ExceptionEqualsinaipackage ExceptionPrintstacktrace = null;
  
  JPanel h = null;
  
  A i = null;
  
  ExceptionUsingComponent ExceptionExtensionGetmessage = null;
  
  public az(R paramR, int paramInt) {
    if (paramInt != -1)
      this.b = paramInt + ""; 
    this.c = paramR;
    this.d = ExceptionPrintstacktrace();
    this.e = ExceptionExtensionGetmessage();
    this.f = k();
    this.ExceptionPrintstacktrace = m();
    this.h = n();
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("North", this.h);
    jPanel1.add("South", (Component)this.ExceptionPrintstacktrace);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("North", (Component)this.e);
    jPanel2.add("South", (Component)this.f);
    jPanel1.add("Center", jPanel2);
    add("West", jPanel1);
    add("East", (Component)this.d);
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap = ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    try {
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), "reqFuel" + this.b, this);
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), "alternate" + this.b, this);
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), "nCylinders" + this.b, this);
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), "nInjectors" + this.b, this);
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), "divider" + this.b, this);
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), "injOpen" + this.b, this);
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), "battFac" + this.b, this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Unable to register all parameters.", (Exception)ExceptionInVPackage, this);
    } 
    p();
    c();
  }
  
  protected void ExceptionInVPackage(String paramString) {
    Manager aM1 = this.c.c("nCylinders" + this.b);
    Manager aM2 = this.c.c("divider" + this.b);
    Manager aM3 = this.c.c("alternate" + this.b);
    try {
      int i = (int)aM1.ExceptionExtensionGetmessage(this.c.p());
      double d1 = 1.0E-4D + aM1.ExceptionExtensionGetmessage(this.c.p()) / Double.parseDouble(paramString);
      int ExceptionExtensionGetmessage = (int)d1;
      double d2 = (aM3.ExceptionExtensionGetmessage(this.c.p()) > 0.0D) ? 2.0D : 1.0D;
      if (Math.abs(d1 - ExceptionExtensionGetmessage) > 0.001D || i == 0 || d2 * (d1 - 1.0E-4D) / i > 1.0D) {
        bV.d("Injections Per Cycle not valid for " + i + " cylinders.\n(Number of Cylinders) / (Injections Per Cycle) must produce ExceptionInVPackage whole number.\nPlease correct.\nWhen set to Alternating, Squirts Per Engine Cycle must be ExceptionInVPackage multiple of 2.", (Component)this);
        p();
        return;
      } 
      aM2.ExceptionInVPackage(this.c.p(), ExceptionExtensionGetmessage);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to retrive values for nCylinders or divider", (Exception)ExceptionPrintstacktrace, this);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      D.ExceptionInVPackage("Can not set value", (Exception)ExceptionExtensionGetmessage, this);
    } 
  }
  
  public void ExceptionInVPackage() {
    E e = new E(this.c);
    aA aA = new aA(this);
    Window window = bV.b((Component)this);
    an an = new an(window, this.c, (et)e, aA);
    bV.ExceptionInVPackage(window, an);
    an.setVisible(true);
  }
  
  protected void b(String paramString) {
    String str = this.i.getText();
    this.i.setText(paramString);
    this.ExceptionExtensionGetmessage.ExceptionExtensionGetmessage();
    try {
      b();
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      bV.d(ExceptionExtensionGetmessage.getMessage(), (Component)this);
      this.ExceptionExtensionGetmessage.i();
    } 
  }
  
  private ExceptionEqualsinaipackage ExceptionPrintstacktrace() {
    ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = new ArrayListExceptionprintstacktraceInGPackage();
    ArrayListExceptionprintstacktraceInGPackage.v("injControl");
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Control Algorithm"), "algorithm" + this.b);
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Injector Staging"), "alternate" + this.b);
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Engine Stroke"), "twoStroke" + this.b);
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Number of Cylinders"), "nCylinders" + this.b);
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Injector Port Type"), "injType" + this.b);
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Number of Injectors"), "nInjectors" + this.b);
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("MAP Type"), "mapType" + this.b);
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Engine Type"), "engineType" + this.b);
    ExceptionEqualsinaipackage bh1 = new ExceptionEqualsinaipackage(this.c, ArrayListExceptionprintstacktraceInGPackage);
    JPanel jPanel = h();
    jPanel.add("Center", (Component)new JLabelExtensionSettext("Squirts Per Engine Cycle"));
    this.ExceptionInVPackage = new y();
    this.ExceptionInVPackage.addItem("1");
    this.ExceptionInVPackage.addItem("2");
    this.ExceptionInVPackage.addItem("3");
    this.ExceptionInVPackage.addItem("4");
    this.ExceptionInVPackage.addItem("5");
    this.ExceptionInVPackage.addItem("6");
    this.ExceptionInVPackage.addItem("7");
    this.ExceptionInVPackage.addItem("8");
    this.ExceptionInVPackage.ExceptionInVPackage(new aB(this));
    jPanel.add("East", (Component)this.ExceptionInVPackage);
    bh1.add(jPanel, 1);
    return bh1;
  }
  
  private GComponentBq ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage parambv, String paramString1, String paramString2) {
    GComponentBq GComponentBq = new GComponentBq();
    GComponentBq.e(paramString1);
    GComponentBq.b(paramString2);
    parambv.ExceptionInVPackage((Abstract)GComponentBq);
    return GComponentBq;
  }
  
  private JPanel h() {
    aE aE = new aE(this);
    aE.setLayout(new BorderLayout(3, 3));
    return aE;
  }
  
  private ExceptionEqualsinaipackage ExceptionExtensionGetmessage() {
    ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = new ArrayListExceptionprintstacktraceInGPackage();
    ArrayListExceptionprintstacktraceInGPackage.v("injCharacteristics");
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Injector Opening Time"), "injOpen" + this.b);
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Battery Voltage Correction"), "battFac" + this.b);
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("PWM Current Limit"), "injPwmP" + this.b);
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("PWM Time"), "injPwmT" + this.b);
    return new ExceptionEqualsinaipackage(this.c, ArrayListExceptionprintstacktraceInGPackage);
  }
  
  private ExceptionEqualsinaipackage k() {
    ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = new ArrayListExceptionprintstacktraceInGPackage();
    ArrayListExceptionprintstacktraceInGPackage.v("injfastIdle");
    String str1 = "fastIdleT" + this.b;
    Manager Manager = this.c.c(str1);
    String str2 = "F";
    if (Manager != null)
      str2 = Manager.p(); 
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Fast Idle Threshold") + " (" + T.ExceptionInVPackage() + str2 + ")", str1);
    return new ExceptionEqualsinaipackage(this.c, ArrayListExceptionprintstacktraceInGPackage);
  }
  
  private ExceptionEqualsinaipackage m() {
    ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = new ArrayListExceptionprintstacktraceInGPackage();
    ArrayListExceptionprintstacktraceInGPackage.v("baroCorrection");
    ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage, c("Barometric Correction"), "baroCorr" + this.b);
    return new ExceptionEqualsinaipackage(this.c, ArrayListExceptionprintstacktraceInGPackage);
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
    this.i.ExceptionInVPackage(new aD(this));
    GComponentBq GComponentBq = new GComponentBq();
    GComponentBq.e("");
    GComponentBq.b("reqFuel" + this.b);
    this.ExceptionExtensionGetmessage = new ExceptionUsingComponent(this.c, GComponentBq);
    this.ExceptionExtensionGetmessage.c(false);
    try {
      ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this.c.c(), "reqFuel" + this.b, (GInterfaceAn)this.ExceptionExtensionGetmessage);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Error subscribing to reqFuel" + this.b, (Exception)ExceptionInVPackage, this);
    } 
    jPanel3.add((Component)this.i);
    jPanel3.add((Component)this.ExceptionExtensionGetmessage);
    jPanel1.add("East", jPanel3);
    return jPanel1;
  }
  
  private void o() {
    try {
      b();
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      bV.d(ExceptionExtensionGetmessage.getMessage(), (Component)this);
      e();
    } 
  }
  
  public void b() {
    Manager aM1 = this.c.c("nInjectors" + this.b);
    Manager aM2 = this.c.c("divider" + this.b);
    Manager aM3 = this.c.c("reqFuel" + this.b);
    Manager aM4 = this.c.c("alternate" + this.b);
    try {
      String str = this.i.getText();
      if (str.equals(""))
        str = "0.0"; 
      double d1 = Double.parseDouble(str);
      double d2 = aM4.ExceptionExtensionGetmessage(this.c.p()) + 1.0D;
      double d3 = aM2.ExceptionExtensionGetmessage(this.c.p());
      double d4 = aM1.ExceptionExtensionGetmessage(this.c.p());
      double d5 = d1 * d2 * d3 / d4;
      aM3.ExceptionInVPackage(this.c.p(), d5);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
    } 
  }
  
  private String c(String paramString) {
    return ExceptionPrintstacktrace.b(this.c.u(paramString));
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
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
      Manager Manager = this.c.c("injOpen" + this.b);
      try {
        double d1 = Manager.ExceptionExtensionGetmessage(this.c.p());
        if (d1 < 0.899D || d1 > 1.301D)
          bV.d("WARNING!!\n\nInjector Open Time is not within ExceptionInVPackage normal range.\nThe expected value is between 0.9 and 1.3 ms.\nThe typical value is 1.0", (Component)this); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        bV.d("Error testing Injector Open Time", (Component)this);
      } 
    } else if (paramString2.startsWith("battFac" + this.b)) {
      Manager Manager = this.c.c("battFac" + this.b);
      try {
        double d1 = Manager.ExceptionExtensionGetmessage(this.c.p());
        if (d1 < 0.099D || d1 > 0.201D)
          bV.d("WARNING!!\n\nBattery Voltage Correction is not within ExceptionInVPackage normal range.\nThe expected value is between 0.1 and 0.3 ms/V.\nThe typical value is 0.1", (Component)this); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        bV.d("Error testing Battery Correction Factor", (Component)this);
      } 
    } 
  }
  
  private boolean p() {
    Manager aM1 = this.c.c("nCylinders" + this.b);
    Manager aM2 = this.c.c("divider" + this.b);
    Manager aM3 = this.c.c("rpmk" + this.b);
    Manager aM4 = this.c.c("twoStroke" + this.b);
    try {
      int i = (int)aM1.ExceptionExtensionGetmessage(this.c.p());
      double d1 = 1.0E-4D + aM1.ExceptionExtensionGetmessage(this.c.p()) / aM2.ExceptionExtensionGetmessage(this.c.p());
      int ExceptionExtensionGetmessage = (int)d1;
      if (Math.abs(d1 - ExceptionExtensionGetmessage) > 0.001D) {
        bV.d("Injections Per Cycle not valid for " + i + " cylinders.\n(Number of Cylinders) / (Injections Per Cycle) must produce ExceptionInVPackage whole number.", (Component)this);
        return false;
      } 
      this.ExceptionInVPackage.ExceptionInVPackage("" + ExceptionExtensionGetmessage);
      double d2 = aM4.ExceptionExtensionGetmessage(this.c.p());
      double d3 = (((d2 != 0.0D) ? 6000 : 12000) / i);
      aM3.ExceptionInVPackage(this.c.p(), d3);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to retrive values for nCylinders or divider", (Exception)ExceptionPrintstacktrace, this);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      D.ExceptionInVPackage("Value Out Of Bounds for rpmk, this shouldn't happen.\nPlease report it.", (Exception)ExceptionExtensionGetmessage, this);
    } 
    return true;
  }
  
  public void c() {
    Manager aM1 = this.c.c("nInjectors" + this.b);
    Manager aM2 = this.c.c("divider" + this.b);
    Manager aM3 = this.c.c("reqFuel" + this.b);
    Manager aM4 = this.c.c("alternate" + this.b);
    try {
      double d1 = aM3.ExceptionExtensionGetmessage(this.c.p());
      double d2 = aM4.ExceptionExtensionGetmessage(this.c.p()) + 1.0D;
      double d3 = aM2.ExceptionExtensionGetmessage(this.c.p());
      double d4 = aM1.ExceptionExtensionGetmessage(this.c.p());
      double d5 = d1 * d4 / d2 * d3;
      this.i.setText(X.b(d5, 1));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void d() {
    try {
      this.c.p().d();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Error performing redo:", (Exception)ExceptionPrintstacktrace, this);
    } 
  }
  
  public void e() {
    try {
      this.c.p().c();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Error performing undo:", (Exception)ExceptionPrintstacktrace, this);
    } 
  }
  
  public void f() {
    this.c.I();
  }
  
  public void i() {
    f();
    this.ExceptionExtensionGetmessage.close();
    this.d.close();
    this.e.close();
    this.f.close();
    this.ExceptionPrintstacktrace.close();
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this);
    l();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */