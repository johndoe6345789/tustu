package br;

import G.R;
import G.aH;
import G.aM;
import G.ab;
import G.bM;
import G.be;
import G.de;
import G.dm;
import V.a;
import V.g;
import aE.a;
import aP.f;
import bH.D;
import bH.X;
import bL.a;
import bt.bQ;
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
import n.n;
import r.a;
import s.g;

public class P extends al implements ab, bc {
  R a = null;
  
  de b = null;
  
  n c = null;
  
  JPanel d = new JPanel();
  
  JPanel e = new JPanel();
  
  v f;
  
  v g;
  
  aa h = null;
  
  JToggleButton i = new JToggleButton(g.b("Start"));
  
  af j = null;
  
  JCheckBox k = null;
  
  ac l = null;
  
  dQ m = null;
  
  JPanel n = null;
  
  c o = null;
  
  List p = new ArrayList();
  
  String q = "15";
  
  public P(R paramR, de paramde) {
    this.a = paramR;
    this.b = paramde;
    this.m = new dQ((Properties)a.A(), "TrimAnalyzePanel_" + paramde.b());
    String str1 = this.m.b("targetLambdaTableName", paramde.n());
    if (str1 != null && !str1.equals(""))
      paramde.c(str1); 
    String str2 = this.m.b("targetLambdaChannelName", paramde.t());
    if (str2 != null && !str2.isEmpty())
      paramde.r(str2); 
    this.o = J.a().c(paramR, paramde.a(0));
    if (paramde.o("disableMaxPercentLimit"))
      this.o.f(); 
    a(paramde);
    this.j = new af(this);
    d();
    paramR.h().a(this);
  }
  
  private void d() {
    ae ae = new ae(this, this.a, this.b.e());
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(g.b("Trim Table Auto Tune") + " " + g.b("Control Panel")));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BoxLayout(jPanel2, 0));
    this.h = new aa(this, g.b("Idle"), 0);
    jPanel2.add(this.h);
    jPanel2.add(new JLabel("  "));
    jPanel2.add(this.i);
    this.i.setMnemonic('A');
    this.i.addActionListener(new Q(this));
    jPanel1.add("East", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BoxLayout(jPanel3, 0));
    this.q = this.m.b("applyPeriod", "15");
    this.k = new JCheckBox(g.b("Update Controller") + "   ");
    this.k.setToolTipText(g.b("<html>Check to have VE Analyze Recommendations automatically <br>Sent to the controller. If unchecked, VE Analyze Live will <br>produce the recommended table, but not send changes until the Send button is clicked.</html>"));
    this.k.setSelected(!this.q.equals("Manually"));
    this.k.addActionListener(new S(this));
    jPanel3.add(this.k);
    JButton jButton1 = new JButton(g.b("Apply"));
    jButton1.setMnemonic('S');
    jButton1.setToolTipText(g.b("<html>Send the VE Analyze Recommendations<br>to the ECU Now. The engine will be running on the recommended <br>VE Table, but not nessecarily permenantly stored.</html>"));
    jButton1.addActionListener(new T(this));
    jPanel3.add(jButton1);
    JButton jButton2 = new JButton(g.b("Save on ECU"));
    jButton2.setMnemonic('E');
    jButton2.addActionListener(new U(this));
    jPanel3.add(jButton2);
    jButton2.setToolTipText("<html>" + g.b("Stores the Recommended VE table values to ECU<br>" + g.b("FLASH for persistent storage.") + "</html>"));
    this.n = new JPanel();
    this.n.setLayout(new FlowLayout());
    jPanel3.add(this.n);
    jPanel1.add("West", jPanel3);
    add("North", jPanel1);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    a a = new a(this.o, (et)this.m);
    jPanel4.add("North", (Component)a);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    a a1 = new a(this.a, (dm)this.b);
    jPanel5.add("Center", a1);
    jPanel4.add("Center", jPanel5);
    JPanel jPanel6 = new JPanel();
    jPanel6.setBorder(BorderFactory.createTitledBorder(g.b("Reference Tables")));
    jPanel6.setLayout(new GridLayout(0, 2));
    JButton jButton3 = new JButton(g.b("Lambda Delay"));
    jButton3.addActionListener(new V(this));
    jPanel6.add(jButton3);
    JButton jButton4 = new JButton(g.b("AFR Targets"));
    jButton4.addActionListener(new W(this));
    jPanel6.add(jButton4);
    jPanel4.add("South", jPanel6);
    this.c = new n();
    JPanel jPanel7 = new JPanel();
    s s = ((ag)this.p.get(0)).a.h();
    jPanel7.setLayout(new GridLayout(2, 1));
    this.f = new v(s);
    cA cA = new cA((cD)this.f);
    ae.a(cA);
    this.f.c(2);
    cA.a(0.0D, getBackground());
    cA.a(8.0D, Color.yellow);
    cA.a(50.0D, Color.GREEN);
    cA.a(150.0D, Color.GREEN.darker());
    cA.a(s.w());
    cA.b(s.v());
    cA.c(g.b("Data Weighting"));
    JPanel jPanel8 = new JPanel();
    jPanel8.setLayout(new BorderLayout());
    jPanel8.setBorder(BorderFactory.createTitledBorder(g.b("Cell Weighting")));
    jPanel8.add("Center", (Component)cA);
    jPanel7.add(jPanel8);
    this.g = new v(s);
    cA = new cA((cD)this.g);
    ae.a(cA);
    this.g.c(3);
    cA.a(-18.0D, Color.red.darker());
    cA.a(-7.0D, Color.red);
    cA.a(0.0D, getBackground());
    cA.a(7.0D, Color.blue);
    cA.a(18.0D, Color.blue.darker());
    cA.a(s.w());
    cA.b(s.v());
    cA.c(g.b("Cell Change"));
    jPanel8 = new JPanel();
    jPanel8.setLayout(new BorderLayout());
    jPanel8.setBorder(BorderFactory.createTitledBorder(g.b("Cell Change")));
    jPanel8.add("Center", (Component)cA);
    jPanel7.add(jPanel8);
    this.c.addTab(g.b("Status"), jPanel7);
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new BorderLayout());
    jPanel9.add("North", jPanel4);
    this.c.addTab(g.b("Advanced Settings"), jPanel9);
    add("East", (Component)this.c);
    add("Center", this.e);
    add("South", this.j);
    a(false);
  }
  
  private void a(de paramde) {
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
      aM aM = this.a.c(((be)this.a.e().c(paramde.a(0))).a());
      i = aM.b();
    } catch (Exception exception) {}
    byte b1 = (i > 8) ? 2 : 4;
    b1 = (paramde.a() > b1) ? b1 : paramde.a();
    X x = new X(this);
    byte b2 = 0;
    while (b2 < paramde.a()) {
      int j = b2 + 1;
      int k = j + b1 - 1;
      k = (k > paramde.a()) ? paramde.a() : k;
      JRadioButton jRadioButton = new JRadioButton(g.b("Trim Table") + " " + j + " - " + k);
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
        ag ag = new ag(this.a, paramde, paramde.a(b2), this.o);
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
  
  private boolean f() {
    for (ag ag : this.p) {
      if (ag.c())
        return true; 
    } 
    return false;
  }
  
  private boolean g() {
    for (ag ag : this.p) {
      if (ag.a.b())
        return true; 
    } 
    return false;
  }
  
  private boolean h() {
    for (ag ag : this.p) {
      if (ag.a.f())
        return true; 
    } 
    return false;
  }
  
  public void a(JComponent paramJComponent) {
    this.n.add(paramJComponent);
  }
  
  private void i() {
    try {
      s s1 = bQ.a().a(this.a, this.b.b());
      s s2 = bQ.a().a(s1, this.b.b());
      aP aP = new aP(this.a, s2, this.b.b());
      a((bc)aP);
      aP.setPreferredSize(new Dimension(eJ.a(290), eJ.a(170)));
      bV.a((Component)aP, (Component)this, g.b("Lambda Delay (ms)"), (bc)aP);
    } catch (g g) {
      D.a("Can not show Lambda delay Table.", (Exception)g, this);
    } 
  }
  
  private void b(JComponent paramJComponent) {
    br br = new br();
    Iterator<String> iterator = this.b.j();
    while (iterator.hasNext()) {
      String str = iterator.next();
      boolean bool = str.equals(this.b.s());
      if (str.equals("afrTSCustom")) {
        JCheckBoxMenuItem jCheckBoxMenuItem = b(a.b + " " + g.b("Custom"), str, bool);
        br.add(jCheckBoxMenuItem);
        continue;
      } 
      be be = (be)this.a.e().c(str);
      if (be != null) {
        JCheckBoxMenuItem jCheckBoxMenuItem = b(X.b(g.b(be.M()), "\"", ""), str, bool);
        br.add(jCheckBoxMenuItem);
        continue;
      } 
      bV.d(str + " is defined as an Target Lambda Table, but not found in the current config.", paramJComponent);
    } 
    iterator = this.b.k();
    while (iterator.hasNext()) {
      String str1 = iterator.next();
      boolean bool = str1.equals(this.b.s());
      aH aH = this.a.g(str1);
      String str2 = bM.j(this.a, str1);
      if (str2 == null)
        str2 = str1; 
      if (aH != null) {
        JCheckBoxMenuItem jCheckBoxMenuItem = a(X.b(g.b(str2), "\"", ""), str1, bool);
        br.add(jCheckBoxMenuItem);
        continue;
      } 
      bV.d(str1 + " is defined as an Target Lambda Channel, but not found in the current config.", paramJComponent);
    } 
    add((Component)br);
    br.show(paramJComponent, 0, paramJComponent.getHeight());
  }
  
  private JCheckBoxMenuItem a(String paramString1, String paramString2, boolean paramBoolean) {
    String str = "";
    Y y = null;
    boolean bool = (this.b.t() != null && this.b.t().equals(paramString2)) ? true : false;
    if (!paramBoolean) {
      str = g.b("Switch to Channel") + " - " + paramString1;
      y = new Y(this);
    } 
    if (bool)
      str = g.b("Channel") + " " + paramString1 + " (" + g.b("Default") + ")"; 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, paramBoolean);
    jCheckBoxMenuItem.addActionListener(y);
    jCheckBoxMenuItem.setActionCommand(paramString2);
    return jCheckBoxMenuItem;
  }
  
  private JCheckBoxMenuItem b(String paramString1, String paramString2, boolean paramBoolean) {
    R r;
    String str = "";
    Z z = null;
    boolean bool = (this.b.n() != null && (this.b.t() == null || this.b.t().isEmpty()) && this.b.n().equals(paramString2)) ? true : false;
    if (paramBoolean) {
      str = g.b("Edit / View") + " - " + paramString1;
      z = new Z(this);
    } else {
      str = g.b("Switch to Table") + " - " + paramString1;
      r = new R(this);
    } 
    if (bool)
      str = str + " (" + g.b("Default") + ")"; 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, paramBoolean);
    jCheckBoxMenuItem.addActionListener(r);
    jCheckBoxMenuItem.setActionCommand(paramString2);
    return jCheckBoxMenuItem;
  }
  
  private void j() {
    if (this.b.c().equals("afrTSCustom")) {
      try {
        s s = bQ.a().a(this.a, this.b.c(), "", this.b.b());
        aP aP = new aP(this.a, s, this.b.b());
        a((bc)aP);
        bV.a((Component)aP, (Component)this, g.b("Target AFR Table"), (bc)aP);
      } catch (g g) {
        D.a("Can not show AFR Table.", (Exception)g, this);
      } 
    } else {
      String str = this.a.c() + "." + this.b.c();
      f.a().a(str, "0", bV.a((Component)this));
    } 
  }
  
  public void a(String paramString) {
    this.q = paramString;
    this.m.a("applyPeriod", this.q);
    if (this.l != null) {
      m();
    } else if (this.q.equals("Manually")) {
      k();
    } 
  }
  
  public void a() {
    for (ag ag : this.p)
      ag.a(); 
  }
  
  public boolean b() {
    for (ag ag : this.p) {
      if (ag.d())
        return true; 
    } 
    return false;
  }
  
  public void c() {
    a();
    this.a.I();
  }
  
  private void k() {
    if (this.l != null) {
      this.l.a();
      this.l = null;
      a();
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
  
  protected void a(boolean paramBoolean) {
    if (paramBoolean && f()) {
      this.h.setText(g.b("Correcting VE"));
      this.i.setText(g.b("Stop Auto Tune"));
      m();
      for (ag ag : this.p) {
        if (ag.c()) {
          ag.a.a(this.j);
          this.f.a(ag.a.h());
          this.g.a(ag.a.h());
          break;
        } 
      } 
    } else {
      this.h.setText(g.b("Idle"));
      this.i.setText(g.b("Start Auto Tune"));
      k();
      n();
      for (ag ag : this.p) {
        if (ag.c())
          ag.a.b(this.j); 
      } 
    } 
    for (ag ag : this.p) {
      try {
        ag.a(paramBoolean);
      } catch (a a) {
        bV.d(a.getMessage(), (Component)this);
        a(false);
        return;
      } 
    } 
    this.h.a(paramBoolean);
  }
  
  private void n() {
    int i = a.a().c(a.di, 0);
    if (i == 25)
      a.a().b(a.dj, "true"); 
    a.a().b(a.di, "" + ++i);
  }
  
  public void close() {
    a(false);
    if (b()) {
      boolean bool = bV.a(g.b("VE Analysis has recommended VE changes that have not been sent to the controller.\n Would you like to save the recommended table to the controller now?"), (Component)this, true);
      if (bool)
        c(); 
    } 
    l();
    ((ag)this.p.get(0)).a.b(this.j);
    for (ag ag : this.p)
      ag.e(); 
    this.a.h().b(this);
  }
  
  public Dimension getMinimumSize() {
    return eJ.a(500, 410);
  }
  
  public Dimension getPreferredSize() {
    return eJ.a(800, 450);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    e();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */