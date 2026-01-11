package bk;

import G.R;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import aI.CloneableImplInAiPackage;
import aI.ManagerGetfilesin;
import aI.AiInterfacePapa;
import aI.AiInterfaceQuebec;
import aI.ExceptionExtensionInAiPackage;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import s.SComponentGolf;

public class JPanelExtensionSetcurrentoutputchannelvalue extends JPanel implements GComponentCq, AiInterfaceQuebec, bc {
  static final String a = SComponentGolf.b("SD Logging Active");
  
  static final String b = SComponentGolf.b("SD Logging Idle");
  
  static final String c = SComponentGolf.b("SD Card Ready");
  
  static final String CloneableImplInAiPackage = SComponentGolf.b("SD Card not Ready");
  
  static final String e = SComponentGolf.b("SD Error!");
  
  static final String f = SComponentGolf.b("No SD Errors");
  
  static final String SComponentGolf = SComponentGolf.b("SD Card In");
  
  static final String h = SComponentGolf.b("No SD Card");
  
  R i = null;
  
  AiInterfacePapa j = null;
  
  o k = null;
  
  a ManagerGetfilesin = null;
  
  JButton m = null;
  
  JButton n = null;
  
  JButton o = null;
  
  JButton AiInterfacePapa = null;
  
  AiInterfaceQuebec AiInterfaceQuebec = null;
  
  AiInterfaceQuebec r = null;
  
  AiInterfaceQuebec s = null;
  
  AiInterfaceQuebec t = null;
  
  JPanel u = null;
  
  private ManagerGetfilesin z = null;
  
  n v = new n(this);
  
  dO ExceptionExtensionInAiPackage = new dO();
  
  boolean x = false;
  
  boolean y = false;
  
  public JPanelExtensionSetcurrentoutputchannelvalue(R paramR, boolean paramBoolean) {
    this.i = paramR;
    this.j = new AiInterfacePapa(paramR);
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("SD Logging Controls")));
    setLayout(new BorderLayout(5, 5));
    this.k = new o(paramR);
    add("North", this.k);
    this.u = new JPanel();
    this.u.setLayout(new GridLayout(0, 1, 5, 5));
    this.m = new JButton(SComponentGolf.b("Re-initalize Card"));
    this.m.addActionListener(new i(this));
    this.u.add(this.m);
    this.n = new JButton(SComponentGolf.b("Reset"));
    this.n.addActionListener(new j(this));
    this.u.add(this.n);
    this.o = new JButton(SComponentGolf.b("Reset and wait"));
    this.o.addActionListener(new k(this));
    this.u.add(this.o);
    this.AiInterfacePapa = new JButton(SComponentGolf.b("Format SD Card"));
    this.AiInterfacePapa.addActionListener(new ManagerGetfilesin(this));
    this.u.add(this.AiInterfacePapa);
    this.AiInterfacePapa.setEnabled(false);
    add("Center", this.u);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1, 5, 5));
    this.AiInterfaceQuebec = new AiInterfaceQuebec();
    this.AiInterfaceQuebec.a(a);
    this.AiInterfaceQuebec.b(b);
    this.AiInterfaceQuebec.setText(b);
    jPanel1.add(this.AiInterfaceQuebec);
    this.t = new AiInterfaceQuebec();
    this.t.a(SComponentGolf);
    this.t.b(h);
    this.t.setText(h);
    this.t.b(false);
    jPanel1.add(this.t);
    this.r = new AiInterfaceQuebec();
    this.r.a(c);
    this.r.b(CloneableImplInAiPackage);
    this.r.setText(CloneableImplInAiPackage);
    this.r.b(false);
    jPanel1.add(this.r);
    this.s = new AiInterfaceQuebec();
    this.s.setBackground(Color.red);
    this.s.a(e);
    this.s.b(f);
    this.s.setText(f);
    this.s.b(false);
    jPanel1.add(this.s);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("Center", jPanel1);
    this.ManagerGetfilesin = new a(paramR, true);
    jPanel2.add("South", (Component)this.ManagerGetfilesin);
    if (paramBoolean)
      add("South", jPanel2); 
    this.j.a(this);
    ManagerUsingArrayList.a().a(paramR.c(), CloneableImplInAiPackage.a, this);
  }
  
  private void CloneableImplInAiPackage() {
    try {
      this.j.e();
    } catch (ExceptionExtensionInAiPackage ExceptionExtensionInAiPackage) {
      bV.CloneableImplInAiPackage(ExceptionExtensionInAiPackage.getMessage(), this);
    } 
  }
  
  private void e() {
    try {
      this.j.CloneableImplInAiPackage();
    } catch (ExceptionExtensionInAiPackage ExceptionExtensionInAiPackage) {
      bV.CloneableImplInAiPackage(ExceptionExtensionInAiPackage.getMessage(), this);
    } 
  }
  
  private void f() {
    try {
      this.j.f();
    } catch (ExceptionExtensionInAiPackage ExceptionExtensionInAiPackage) {
      bV.CloneableImplInAiPackage(ExceptionExtensionInAiPackage.getMessage(), this);
    } 
  }
  
  public void a() {
    boolean bool = bV.a(SComponentGolf.b("Are you sure you want to format the SD card?") + "\n" + SComponentGolf.b("All files will be deleted."), this, true);
    if (bool) {
      m m = new m(this);
      m.start();
    } 
  }
  
  public void b() {
    JRootPane jRootPane = getRootPane();
    if (!(jRootPane.getGlassPane() instanceof dO)) {
      this.ExceptionExtensionInAiPackage.b(true);
      jRootPane.setGlassPane((Component)this.ExceptionExtensionInAiPackage);
      Component component = jRootPane.getGlassPane();
      component.setVisible(true);
    } else {
      this.ExceptionExtensionInAiPackage = (dO)jRootPane.getGlassPane();
    } 
    this.ExceptionExtensionInAiPackage.a(SComponentGolf.b("Formatting SD Card, Please wait"));
    this.ExceptionExtensionInAiPackage.setVisible(true);
  }
  
  public void c() {
    this.ExceptionExtensionInAiPackage.setVisible(false);
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    boolean bool1 = (((int)paramDouble & CloneableImplInAiPackage.CloneableImplInAiPackage) == CloneableImplInAiPackage.CloneableImplInAiPackage) ? true : false;
    boolean bool2 = (((int)paramDouble & CloneableImplInAiPackage.c) == CloneableImplInAiPackage.c) ? true : false;
    this.r.a(bool2);
    this.k.setEnabled((bool2 || bool1));
    boolean bool3 = (((int)paramDouble & CloneableImplInAiPackage.e) == CloneableImplInAiPackage.e) ? true : false;
    this.s.a(bool3);
    boolean bool = (((int)paramDouble & CloneableImplInAiPackage.b) == CloneableImplInAiPackage.b);
    this.t.a(bool);
    if (bool != this.m.isEnabled()) {
      this.m.setEnabled(bool);
      this.n.setEnabled(bool);
      this.o.setEnabled(bool);
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
  }
  
  public void close() {
    this.k.close();
    this.AiInterfaceQuebec.close();
    this.ManagerGetfilesin.close();
    this.j.b(this);
    ManagerUsingArrayList.a().a(this);
  }
  
  public void a(boolean paramBoolean) {
    this.y = paramBoolean;
    SComponentGolf();
  }
  
  public void b(boolean paramBoolean) {
    this.x = paramBoolean;
    this.AiInterfaceQuebec.a(paramBoolean);
    SComponentGolf();
  }
  
  public void a(ManagerGetfilesin paraml) {
    this.z = paraml;
    SComponentGolf();
  }
  
  private void SComponentGolf() {
    this.AiInterfacePapa.setEnabled((this.z != null && !this.x && this.y));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */