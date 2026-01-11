package business.byte_readers;

import G.R;
import G.SerializableImpl;
import G.Manager;
import G.GInterfaceAb;
import G.ExceptionprintstacktraceInGPackage;
import G.CloneableImpl;
import G.GInterfaceDe;
import G.GInterfaceDm;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import aE.ExceptionInVPackage;
import aP.NetworkHashMap;
import bH.D;
import bH.X;
import bL.ExceptionInVPackage;
import bt.ManagerBfcomponentcharlie;
import com.efiAnalytics.tuningwidgets.panels.aP;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.cA;
import com.efiAnalytics.ui.cD;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.s;
import com.efiAnalytics.ui.v;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import r.ExceptionInVPackage;
import s.ExceptionPrintstacktrace;

public class UICloseGetminimumsize extends al implements GInterfaceAb, bc {
  R ExceptionInVPackage = null;
  
  GInterfaceDe b = null;
  
  Isoptimizeddrawingenabled c = null;
  
  JPanel d = new JPanel();
  
  JPanel e = new JPanel();
  
  v NetworkHashMap;
  
  v ExceptionPrintstacktrace;
  
  aa h = null;
  
  JToggleButton i = new JToggleButton(ExceptionPrintstacktrace.b("Start"));
  
  af j = null;
  
  JCheckBox k = null;
  
  ac l = null;
  
  dQ m = null;
  
  JPanel Isoptimizeddrawingenabled = null;
  
  c o = null;
  
  List p = new ArrayList();
  
  String q = "15";
  
  public UICloseGetminimumsize(R paramR, GInterfaceDe paramde) {
    this.ExceptionInVPackage = paramR;
    this.b = paramde;
    this.m = new dQ((Properties)ExceptionInVPackage.A(), "TrimAnalyzePanel_" + paramde.b());
    String str1 = this.m.b("targetLambdaTableName", paramde.Isoptimizeddrawingenabled());
    if (str1 != null && !str1.equals(""))
      paramde.c(str1); 
    String str2 = this.m.b("targetLambdaChannelName", paramde.t());
    if (str2 != null && !str2.isEmpty())
      paramde.r(str2); 
    this.o = J.ExceptionInVPackage().c(paramR, paramde.ExceptionInVPackage(0));
    if (paramde.o("disableMaxPercentLimit"))
      this.o.NetworkHashMap(); 
    ExceptionInVPackage(paramde);
    this.j = new af(this);
    d();
    paramR.h().ExceptionInVPackage(this);
  }
  
  private void d() {
    ae ae = new ae(this, this.ExceptionInVPackage, this.b.e());
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Trim Table Auto Tune") + " " + ExceptionPrintstacktrace.b("Control Panel")));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BoxLayout(jPanel2, 0));
    this.h = new aa(this, ExceptionPrintstacktrace.b("Idle"), 0);
    jPanel2.add(this.h);
    jPanel2.add(new JLabel("  "));
    jPanel2.add(this.i);
    this.i.setMnemonic('A');
    this.i.addActionListener(new Q(this));
    jPanel1.add("East", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BoxLayout(jPanel3, 0));
    this.q = this.m.b("applyPeriod", "15");
    this.k = new JCheckBox(ExceptionPrintstacktrace.b("Update Controller") + "   ");
    this.k.setToolTipText(ExceptionPrintstacktrace.b("<html>Check to have VE Analyze Recommendations automatically <br>Sent to the controller. If unchecked, VE Analyze Live will <br>produce the recommended table, but not send changes until the Send button is clicked.</html>"));
    this.k.setSelected(!this.q.equals("Manually"));
    this.k.addActionListener(new S(this));
    jPanel3.add(this.k);
    JButton jButton1 = new JButton(ExceptionPrintstacktrace.b("Apply"));
    jButton1.setMnemonic('S');
    jButton1.setToolTipText(ExceptionPrintstacktrace.b("<html>Send the VE Analyze Recommendations<br>to the ECU Now. The engine will CloneableImpl running on the recommended <br>VE Table, but not nessecarily permenantly stored.</html>"));
    jButton1.addActionListener(new T(this));
    jPanel3.add(jButton1);
    JButton jButton2 = new JButton(ExceptionPrintstacktrace.b("Save on ECU"));
    jButton2.setMnemonic('E');
    jButton2.addActionListener(new U(this));
    jPanel3.add(jButton2);
    jButton2.setToolTipText("<html>" + ExceptionPrintstacktrace.b("Stores the Recommended VE table values to ECU<br>" + ExceptionPrintstacktrace.b("FLASH for persistent storage.") + "</html>"));
    this.Isoptimizeddrawingenabled = new JPanel();
    this.Isoptimizeddrawingenabled.setLayout(new FlowLayout());
    jPanel3.add(this.Isoptimizeddrawingenabled);
    jPanel1.add("West", jPanel3);
    add("North", jPanel1);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(this.o, (et)this.m);
    jPanel4.add("North", (Component)ExceptionInVPackage);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    ExceptionInVPackage a1 = new ExceptionInVPackage(this.ExceptionInVPackage, (GInterfaceDm)this.b);
    jPanel5.add("Center", a1);
    jPanel4.add("Center", jPanel5);
    JPanel jPanel6 = new JPanel();
    jPanel6.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Reference Tables")));
    jPanel6.setLayout(new GridLayout(0, 2));
    JButton jButton3 = new JButton(ExceptionPrintstacktrace.b("Lambda Delay"));
    jButton3.addActionListener(new V(this));
    jPanel6.add(jButton3);
    JButton jButton4 = new JButton(ExceptionPrintstacktrace.b("AFR Targets"));
    jButton4.addActionListener(new W(this));
    jPanel6.add(jButton4);
    jPanel4.add("South", jPanel6);
    this.c = new Isoptimizeddrawingenabled();
    JPanel jPanel7 = new JPanel();
    s s = ((ag)this.p.get(0)).ExceptionInVPackage.h();
    jPanel7.setLayout(new GridLayout(2, 1));
    this.NetworkHashMap = new v(s);
    cA cA = new cA((cD)this.NetworkHashMap);
    ae.ExceptionInVPackage(cA);
    this.NetworkHashMap.c(2);
    cA.ExceptionInVPackage(0.0D, getBackground());
    cA.ExceptionInVPackage(8.0D, Color.yellow);
    cA.ExceptionInVPackage(50.0D, Color.GREEN);
    cA.ExceptionInVPackage(150.0D, Color.GREEN.darker());
    cA.ExceptionInVPackage(s.w());
    cA.b(s.v());
    cA.c(ExceptionPrintstacktrace.b("Data Weighting"));
    JPanel jPanel8 = new JPanel();
    jPanel8.setLayout(new BorderLayout());
    jPanel8.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Cell Weighting")));
    jPanel8.add("Center", (Component)cA);
    jPanel7.add(jPanel8);
    this.ExceptionPrintstacktrace = new v(s);
    cA = new cA((cD)this.ExceptionPrintstacktrace);
    ae.ExceptionInVPackage(cA);
    this.ExceptionPrintstacktrace.c(3);
    cA.ExceptionInVPackage(-18.0D, Color.red.darker());
    cA.ExceptionInVPackage(-7.0D, Color.red);
    cA.ExceptionInVPackage(0.0D, getBackground());
    cA.ExceptionInVPackage(7.0D, Color.blue);
    cA.ExceptionInVPackage(18.0D, Color.blue.darker());
    cA.ExceptionInVPackage(s.w());
    cA.b(s.v());
    cA.c(ExceptionPrintstacktrace.b("Cell Change"));
    jPanel8 = new JPanel();
    jPanel8.setLayout(new BorderLayout());
    jPanel8.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Cell Change")));
    jPanel8.add("Center", (Component)cA);
    jPanel7.add(jPanel8);
    this.c.addTab(ExceptionPrintstacktrace.b("Status"), jPanel7);
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new BorderLayout());
    jPanel9.add("North", jPanel4);
    this.c.addTab(ExceptionPrintstacktrace.b("Advanced Settings"), jPanel9);
    add("East", (Component)this.c);
    add("Center", this.e);
    add("South", this.j);
    ExceptionInVPackage(false);
  }
  
  private void ExceptionInVPackage(GInterfaceDe paramde) {
    this.d.setLayout(new CardLayout());
    this.p.clear();
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    this.e.setLayout(new BorderLayout());
    this.e.add(jPanel1, "Center");
    jPanel1.add("Center", this.d);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(0));
    jPanel1.add("North", jPanel2);
    ButtonGroup buttonGroup = new ButtonGroup();
    int i = 6;
    try {
      Manager Manager = this.ExceptionInVPackage.c(((CloneableImpl)this.ExceptionInVPackage.e().c(paramde.ExceptionInVPackage(0))).ExceptionInVPackage());
      i = Manager.b();
    } catch (Exception exception) {}
    byte b1 = (i > 8) ? 2 : 4;
    b1 = (paramde.ExceptionInVPackage() > b1) ? b1 : paramde.ExceptionInVPackage();
    X x = new X(this);
    byte b2 = 0;
    while (b2 < paramde.ExceptionInVPackage()) {
      int j = b2 + 1;
      int k = j + b1 - 1;
      k = (k > paramde.ExceptionInVPackage()) ? paramde.ExceptionInVPackage() : k;
      JRadioButton jRadioButton = new JRadioButton(ExceptionPrintstacktrace.b("Trim Table") + " " + j + " - " + k);
      buttonGroup.add(jRadioButton);
      String str = Integer.toString(b2);
      jRadioButton.setActionCommand(str);
      jRadioButton.addActionListener(x);
      jPanel2.add(jRadioButton);
      JPanel jPanel = new JPanel();
      if (k - j <= 2) {
        jPanel.setLayout(new GridLayout(1, 0));
      } else {
        jPanel.setLayout(new GridLayout(2, 0));
      } 
      this.d.add(jPanel, str);
      for (byte b = 0; b < b1; b++) {
        ag ag = new ag(this.ExceptionInVPackage, paramde, paramde.ExceptionInVPackage(b2), this.o);
        this.p.add(ag);
        jPanel.add(ag);
        b2++;
      } 
    } 
    ((AbstractButton)buttonGroup.getElements().nextElement()).setSelected(true);
    e();
  }
  
  private void e() {
    for (ag ag : this.p)
      ag.b(); 
  }
  
  private boolean NetworkHashMap() {
    for (ag ag : this.p) {
      if (ag.c())
        return true; 
    } 
    return false;
  }
  
  private boolean ExceptionPrintstacktrace() {
    for (ag ag : this.p) {
      if (ag.ExceptionInVPackage.b())
        return true; 
    } 
    return false;
  }
  
  private boolean h() {
    for (ag ag : this.p) {
      if (ag.ExceptionInVPackage.NetworkHashMap())
        return true; 
    } 
    return false;
  }
  
  public void ExceptionInVPackage(JComponent paramJComponent) {
    this.Isoptimizeddrawingenabled.add(paramJComponent);
  }
  
  private void i() {
    try {
      s s1 = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage, this.b.b());
      s s2 = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(s1, this.b.b());
      aP aP = new aP(this.ExceptionInVPackage, s2, this.b.b());
      ExceptionInVPackage((bc)aP);
      aP.setPreferredSize(new Dimension(eJ.ExceptionInVPackage(290), eJ.ExceptionInVPackage(170)));
      bV.ExceptionInVPackage((Component)aP, (Component)this, ExceptionPrintstacktrace.b("Lambda Delay (ms)"), (bc)aP);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Can not show Lambda delay Table.", (Exception)ExceptionPrintstacktrace, this);
    } 
  }
  
  private void b(JComponent paramJComponent) {
    br br = new br();
    Iterator<String> iterator = this.b.j();
    while (iterator.hasNext()) {
      String str = iterator.next();
      boolean bool = str.equals(this.b.s());
      if (str.equals("afrTSCustom")) {
        JCheckBoxMenuItem jCheckBoxMenuItem = b(ExceptionInVPackage.b + " " + ExceptionPrintstacktrace.b("Custom"), str, bool);
        br.add(jCheckBoxMenuItem);
        continue;
      } 
      CloneableImpl CloneableImpl = (CloneableImpl)this.ExceptionInVPackage.e().c(str);
      if (CloneableImpl != null) {
        JCheckBoxMenuItem jCheckBoxMenuItem = b(X.b(ExceptionPrintstacktrace.b(CloneableImpl.M()), "\"", ""), str, bool);
        br.add(jCheckBoxMenuItem);
        continue;
      } 
      bV.d(str + " is defined as an Target Lambda Table, but not found in the current config.", paramJComponent);
    } 
    iterator = this.b.k();
    while (iterator.hasNext()) {
      String str1 = iterator.next();
      boolean bool = str1.equals(this.b.s());
      SerializableImpl SerializableImpl = this.ExceptionInVPackage.ExceptionPrintstacktrace(str1);
      String str2 = ExceptionprintstacktraceInGPackage.j(this.ExceptionInVPackage, str1);
      if (str2 == null)
        str2 = str1; 
      if (SerializableImpl != null) {
        JCheckBoxMenuItem jCheckBoxMenuItem = ExceptionInVPackage(X.b(ExceptionPrintstacktrace.b(str2), "\"", ""), str1, bool);
        br.add(jCheckBoxMenuItem);
        continue;
      } 
      bV.d(str1 + " is defined as an Target Lambda Channel, but not found in the current config.", paramJComponent);
    } 
    add((Component)br);
    br.show(paramJComponent, 0, paramJComponent.getHeight());
  }
  
  private JCheckBoxMenuItem ExceptionInVPackage(String paramString1, String paramString2, boolean paramBoolean) {
    String str = "";
    Y y = null;
    boolean bool = (this.b.t() != null && this.b.t().equals(paramString2)) ? true : false;
    if (!paramBoolean) {
      str = ExceptionPrintstacktrace.b("Switch to Channel") + " - " + paramString1;
      y = new Y(this);
    } 
    if (bool)
      str = ExceptionPrintstacktrace.b("Channel") + " " + paramString1 + " (" + ExceptionPrintstacktrace.b("Default") + ")"; 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, paramBoolean);
    jCheckBoxMenuItem.addActionListener(y);
    jCheckBoxMenuItem.setActionCommand(paramString2);
    return jCheckBoxMenuItem;
  }
  
  private JCheckBoxMenuItem b(String paramString1, String paramString2, boolean paramBoolean) {
    R r;
    String str = "";
    Z z = null;
    boolean bool = (this.b.Isoptimizeddrawingenabled() != null && (this.b.t() == null || this.b.t().isEmpty()) && this.b.Isoptimizeddrawingenabled().equals(paramString2)) ? true : false;
    if (paramBoolean) {
      str = ExceptionPrintstacktrace.b("Edit / View") + " - " + paramString1;
      z = new Z(this);
    } else {
      str = ExceptionPrintstacktrace.b("Switch to Table") + " - " + paramString1;
      r = new R(this);
    } 
    if (bool)
      str = str + " (" + ExceptionPrintstacktrace.b("Default") + ")"; 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, paramBoolean);
    jCheckBoxMenuItem.addActionListener(r);
    jCheckBoxMenuItem.setActionCommand(paramString2);
    return jCheckBoxMenuItem;
  }
  
  private void j() {
    if (this.b.c().equals("afrTSCustom")) {
      try {
        s s = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage, this.b.c(), "", this.b.b());
        aP aP = new aP(this.ExceptionInVPackage, s, this.b.b());
        ExceptionInVPackage((bc)aP);
        bV.ExceptionInVPackage((Component)aP, (Component)this, ExceptionPrintstacktrace.b("Target AFR Table"), (bc)aP);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.ExceptionInVPackage("Can not show AFR Table.", (Exception)ExceptionPrintstacktrace, this);
      } 
    } else {
      String str = this.ExceptionInVPackage.c() + "." + this.b.c();
      NetworkHashMap.ExceptionInVPackage().ExceptionInVPackage(str, "0", bV.ExceptionInVPackage((Component)this));
    } 
  }
  
  public void ExceptionInVPackage(String paramString) {
    this.q = paramString;
    this.m.ExceptionInVPackage("applyPeriod", this.q);
    if (this.l != null) {
      m();
    } else if (this.q.equals("Manually")) {
      k();
    } 
  }
  
  public void ExceptionInVPackage() {
    for (ag ag : this.p)
      ag.ExceptionInVPackage(); 
  }
  
  public boolean b() {
    for (ag ag : this.p) {
      if (ag.d())
        return true; 
    } 
    return false;
  }
  
  public void c() {
    ExceptionInVPackage();
    this.ExceptionInVPackage.I();
  }
  
  private void k() {
    if (this.l != null) {
      this.l.ExceptionInVPackage();
      this.l = null;
      ExceptionInVPackage();
    } 
  }
  
  private void m() {
    k();
    if (!this.q.equals("Manually")) {
      int i = Integer.parseInt(this.q);
      this.l = new ac(this, i);
      this.l.start();
    } 
  }
  
  protected void ExceptionInVPackage(boolean paramBoolean) {
    if (paramBoolean && NetworkHashMap()) {
      this.h.setText(ExceptionPrintstacktrace.b("Correcting VE"));
      this.i.setText(ExceptionPrintstacktrace.b("Stop Auto Tune"));
      m();
      for (ag ag : this.p) {
        if (ag.c()) {
          ag.ExceptionInVPackage.ExceptionInVPackage(this.j);
          this.NetworkHashMap.ExceptionInVPackage(ag.ExceptionInVPackage.h());
          this.ExceptionPrintstacktrace.ExceptionInVPackage(ag.ExceptionInVPackage.h());
          break;
        } 
      } 
    } else {
      this.h.setText(ExceptionPrintstacktrace.b("Idle"));
      this.i.setText(ExceptionPrintstacktrace.b("Start Auto Tune"));
      k();
      Isoptimizeddrawingenabled();
      for (ag ag : this.p) {
        if (ag.c())
          ag.ExceptionInVPackage.b(this.j); 
      } 
    } 
    for (ag ag : this.p) {
      try {
        ag.ExceptionInVPackage(paramBoolean);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.d(ExceptionInVPackage.getMessage(), (Component)this);
        ExceptionInVPackage(false);
        return;
      } 
    } 
    this.h.ExceptionInVPackage(paramBoolean);
  }
  
  private void Isoptimizeddrawingenabled() {
    int i = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.di, 0);
    if (i == 25)
      ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.dj, "true"); 
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.di, "" + ++i);
  }
  
  public void close() {
    ExceptionInVPackage(false);
    if (b()) {
      boolean bool = bV.ExceptionInVPackage(ExceptionPrintstacktrace.b("VE Analysis has recommended VE changes that have not been sent to the controller.\\Isoptimizeddrawingenabled Would you like to save the recommended table to the controller now?"), (Component)this, true);
      if (bool)
        c(); 
    } 
    l();
    ((ag)this.p.get(0)).ExceptionInVPackage.b(this.j);
    for (ag ag : this.p)
      ag.e(); 
    this.ExceptionInVPackage.h().b(this);
  }
  
  public Dimension getMinimumSize() {
    return eJ.ExceptionInVPackage(500, 410);
  }
  
  public Dimension getPreferredSize() {
    return eJ.ExceptionInVPackage(800, 450);
  }
  
  public void ExceptionInVPackage(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    e();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */