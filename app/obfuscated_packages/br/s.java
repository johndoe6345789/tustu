package br;

import G.R;
import G.aH;
import G.bM;
import G.be;
import G.bv;
import G.dm;
import V.a;
import V.g;
import aE.a;
import aP.f;
import aS.l;
import bH.D;
import bH.X;
import bH.p;
import bL.a;
import bt.bQ;
import bt.bh;
import com.efiAnalytics.tuningwidgets.panels.aP;
import com.efiAnalytics.ui.b;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.cA;
import com.efiAnalytics.ui.cD;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.v;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import n.n;
import r.a;
import s.g;

public class s extends al implements bc {
  R a = null;
  
  dm b = null;
  
  bh c = null;
  
  n d = null;
  
  D e = null;
  
  JToggleButton f = new JToggleButton(g.b("Start"));
  
  I g = null;
  
  n h = null;
  
  c i = null;
  
  JButton j;
  
  JCheckBox k = null;
  
  F l = null;
  
  dQ m = null;
  
  JPanel n = null;
  
  String o = "15";
  
  private String p = null;
  
  public s(R paramR, dm paramdm) {
    this.a = paramR;
    this.b = paramdm;
    this.p = paramdm.b();
    this.m = new dQ((Properties)a.A(), "VeAnalyzePanel_" + e());
    String str1 = this.m.b("targetLambdaTableName", paramdm.n());
    if (str1 != null && !str1.equals(""))
      paramdm.c(str1); 
    String str2 = this.m.b("targetLambdaChannelName", paramdm.t());
    if (str2 != null && !str2.isEmpty())
      paramdm.r(str2); 
    this.i = J.a().c(paramR, this.p);
    if (paramdm.o("disableMaxPercentLimit"))
      this.i.f(); 
    this.h = r.a().a(paramR, paramdm, this.i);
    this.c = new bh();
    a((bc)this.c);
    this.g = new I(this);
    this.h.a(this.g);
    f();
    a(paramdm);
  }
  
  private void f() {
    H h = new H(this, this.a, this.b.e());
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.setBorder(BorderFactory.createTitledBorder(g.b(bM.c(this.a, e())) + " " + g.b("Control Panel")));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BoxLayout(jPanel3, 0));
    this.e = new D(this, g.b("Idle"), 0);
    jPanel3.add(this.e);
    jPanel3.add(new JLabel("  "));
    jPanel3.add(this.f);
    this.f.setMnemonic('A');
    this.f.addActionListener(new t(this));
    jPanel2.add("East", jPanel3);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BoxLayout(jPanel4, 0));
    this.o = this.m.b("applyPeriod", "15");
    this.k = new JCheckBox(g.b("Update Controller") + "   ");
    this.k.setToolTipText(g.b("<html>Check to have VE Analyze Recommendations automatically <br>Sent to the controller. If unchecked, VE Analyze Live will <br>produce the recommended table, but not send changes until the Send button is clicked.</html>"));
    this.k.setSelected(!this.o.equals("Manually"));
    this.k.addActionListener(new v(this));
    jPanel4.add(this.k);
    JButton jButton1 = new JButton(g.b("Apply"));
    jButton1.setMnemonic('S');
    jButton1.setToolTipText(g.b("<html>Send the VE Analyze Recommendations<br>to the ECU Now. The engine will be running on the recommended <br>VE Table, but not nessecarily permenantly stored.</html>"));
    jButton1.addActionListener(new w(this));
    jPanel4.add(jButton1);
    JButton jButton2 = new JButton(g.b("Save on ECU"));
    jButton2.setMnemonic('E');
    jButton2.addActionListener(new x(this));
    jPanel4.add(jButton2);
    jButton2.setToolTipText("<html>" + g.b("Stores the Recommended VE table values to ECU<br>" + g.b("FLASH for persistent storage.") + "</html>"));
    this.n = new JPanel();
    this.n.setLayout(new FlowLayout());
    jPanel4.add(this.n);
    jPanel4.add(new JLabel("  "));
    this.j = new JButton(g.b("Reset"));
    this.j.addActionListener(new y(this));
    this.j.setToolTipText("<html>" + g.b("Resets Heat Maps and underlying data that has produced table changes.<br>" + g.b("The VE Table will remain as it is.") + "</html>"));
    jPanel4.add(this.j);
    this.j.setEnabled(false);
    jPanel2.add("West", jPanel4);
    add("North", jPanel2);
    jPanel1.add("Center", (Component)this.c);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    a a = new a(this.i, (et)this.m);
    jPanel5.add("North", (Component)a);
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new BorderLayout());
    a a1 = new a(this.a, this.b);
    jPanel6.add("Center", a1);
    jPanel5.add("Center", jPanel6);
    JPanel jPanel7 = new JPanel();
    jPanel7.setBorder(BorderFactory.createTitledBorder(g.b("Reference Tables")));
    jPanel7.setLayout(new GridLayout(0, 2));
    JButton jButton3 = new JButton(g.b("Lambda Delay"));
    jButton3.addActionListener(new z(this));
    jPanel7.add(jButton3);
    JButton jButton4 = new JButton(g.b("AFR Targets"));
    jButton4.addActionListener(new A(this));
    jPanel7.add(jButton4);
    jPanel5.add("South", jPanel7);
    this.d = new n();
    JPanel jPanel8 = new JPanel();
    com.efiAnalytics.ui.s s1 = this.h.h();
    jPanel8.setLayout(new GridLayout(2, 1));
    v v = new v(s1);
    cA cA = new cA((cD)v);
    h.a(cA);
    v.c(2);
    cA.a(0.0D, getBackground());
    cA.a(8.0D, Color.yellow);
    cA.a(50.0D, Color.GREEN);
    cA.a(150.0D, Color.GREEN.darker());
    cA.a(s1.w());
    cA.b(s1.v());
    cA.c(g.b("Data Weighting"));
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new BorderLayout());
    jPanel9.setBorder(BorderFactory.createTitledBorder(g.b("Cell Weighting")));
    jPanel9.add("Center", (Component)cA);
    jPanel8.add(jPanel9);
    v = new v(s1);
    cA = new cA((cD)v);
    h.a(cA);
    v.c(3);
    cA.a(-18.0D, Color.red.darker());
    cA.a(-7.0D, Color.red);
    cA.a(0.0D, getBackground());
    cA.a(7.0D, Color.blue);
    cA.a(18.0D, Color.blue.darker());
    cA.a(s1.w());
    cA.b(s1.v());
    cA.c(g.b("Cell Change"));
    jPanel9 = new JPanel();
    jPanel9.setLayout(new BorderLayout());
    jPanel9.setBorder(BorderFactory.createTitledBorder(g.b("Cell Change")));
    jPanel9.add("Center", (Component)cA);
    jPanel8.add(jPanel9);
    jPanel8.setPreferredSize(eJ.a(265, 265));
    this.d.addTab(g.b("Status"), jPanel8);
    JPanel jPanel10 = new JPanel();
    jPanel10.setLayout(new BorderLayout());
    jPanel10.add("North", jPanel5);
    this.d.addTab(g.b("Advanced Settings"), jPanel10);
    add("East", (Component)this.d);
    add("Center", jPanel1);
    add("South", this.g);
    a(false);
  }
  
  public boolean a() {
    return this.h.b();
  }
  
  public void a(JComponent paramJComponent) {
    this.n.add(paramJComponent);
  }
  
  private void g() {
    try {
      com.efiAnalytics.ui.s s1 = bQ.a().a(this.a, e());
      com.efiAnalytics.ui.s s2 = bQ.a().a(s1, this.b.b());
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
    B b = null;
    boolean bool = (this.b.t() != null && this.b.t().equals(paramString2)) ? true : false;
    if (!paramBoolean) {
      str = g.b("Switch to Channel") + " - " + paramString1;
      b = new B(this);
    } else {
      str = g.b("Channel") + " " + paramString1;
    } 
    if (bool)
      str = str + " (" + g.b("Default") + ")"; 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, paramBoolean);
    jCheckBoxMenuItem.addActionListener(b);
    jCheckBoxMenuItem.setActionCommand(paramString2);
    return jCheckBoxMenuItem;
  }
  
  private JCheckBoxMenuItem b(String paramString1, String paramString2, boolean paramBoolean) {
    u u;
    String str = "";
    C c1 = null;
    boolean bool = (this.b.n() != null && (this.b.t() == null || this.b.t().isEmpty()) && this.b.n().equals(paramString2)) ? true : false;
    if (paramBoolean) {
      str = g.b("Edit / View") + " - " + paramString1;
      c1 = new C(this);
    } else {
      str = g.b("Switch to Table") + " - " + paramString1;
      u = new u(this);
    } 
    if (bool)
      str = str + " (" + g.b("Default") + ")"; 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, paramBoolean);
    jCheckBoxMenuItem.addActionListener(u);
    jCheckBoxMenuItem.setActionCommand(paramString2);
    return jCheckBoxMenuItem;
  }
  
  private void h() {
    if (this.b.c().equals("afrTSCustom")) {
      try {
        com.efiAnalytics.ui.s s1 = bQ.a().a(this.a, this.b.c(), "", this.b.b());
        aP aP = new aP(this.a, s1, this.b.b());
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
  
  private void a(dm paramdm) {
    be be = (be)this.a.e().c(e());
    be = be.j();
    be.h("veAnalyze_");
    try {
      com.efiAnalytics.ui.s s1 = bQ.a().a(this.a, be.aL(), be.l(), be.aL());
      s1.c(1);
    } catch (g g) {
      D.a("Unable to get Table Model for " + be.aL() + " with prefix:" + be.l());
      g.printStackTrace();
    } 
    this.c.a(this.a, (bv)be);
  }
  
  public void a(String paramString) {
    this.o = paramString;
    this.m.a("applyPeriod", this.o);
    if (this.l != null) {
      j();
    } else if (this.o.equals("Manually")) {
      i();
    } 
  }
  
  public void b() {
    try {
      com.efiAnalytics.ui.s s1 = bQ.a().a(this.a, this.b.b(), "veAnalyze_", this.b.b());
      b[][] arrayOfB = s1.D();
      s1 = bQ.a().a(this.a, this.b.b(), "", this.b.b());
      for (byte b = 0; b < s1.getRowCount(); b++) {
        for (byte b1 = 0; b1 < s1.getColumnCount(); b1++)
          s1.setValueAt(arrayOfB[arrayOfB.length - b - 1][b1].i(), b, b1); 
      } 
    } catch (g g) {
      D.a("Unable to get Table Model for " + e() + " with prefix:" + "veAnalyze_");
      g.printStackTrace();
    } 
  }
  
  public boolean c() {
    try {
      com.efiAnalytics.ui.s s1 = bQ.a().b(this.a, this.b.b(), "");
      com.efiAnalytics.ui.s s2 = bQ.a().b(this.a, this.b.b(), "veAnalyze_");
      if (s1 != null && s2 != null) {
        b[][] arrayOfB = s2.D();
        if (arrayOfB == null)
          return false; 
        for (byte b = 0; b < s1.getRowCount(); b++) {
          for (byte b1 = 0; b1 < s1.getColumnCount(); b1++) {
            if (Math.abs(s1.d(b, b1).doubleValue() - arrayOfB[arrayOfB.length - b - 1][b1].i().doubleValue()) > 1.0E-6D)
              return true; 
          } 
        } 
      } 
    } catch (Exception exception) {
      D.a("Unable to get Table Model for " + e() + " with prefix:" + "veAnalyze_");
      exception.printStackTrace();
    } 
    return false;
  }
  
  public void d() {
    b();
    this.a.I();
  }
  
  private void i() {
    if (this.l != null) {
      this.l.a();
      this.l = null;
      b();
    } 
  }
  
  private void j() {
    i();
    if (!this.o.equals("Manually")) {
      int i = Integer.parseInt(this.o);
      this.l = new F(this, i);
      this.l.start();
    } 
  }
  
  protected void a(boolean paramBoolean) {
    String str = bM.a(this.a, e());
    boolean bool = true;
    try {
      bool = p.a(str, this.a);
    } catch (g g) {
      Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
    } 
    if (paramBoolean && bool) {
      try {
        this.e.setText(g.b("Correcting VE"));
        this.f.setText(g.b("Stop Auto Tune"));
        this.h.c();
        j();
      } catch (a a) {
        bV.d(a.getMessage(), (Component)this);
      } 
      l.a().a(e());
    } else {
      this.e.setText(g.b("Idle"));
      this.f.setText(g.b("Start Auto Tune"));
      this.h.e();
      i();
      k();
      l.a().b(e());
    } 
    this.e.a(paramBoolean);
  }
  
  private void k() {
    int i = a.a().c(a.di, 0);
    if (i == 25)
      a.a().b(a.dj, "true"); 
    a.a().b(a.di, "" + ++i);
  }
  
  public void close() {
    a(false);
    if (c()) {
      boolean bool = bV.a(g.b("VE Analysis has recommended VE changes that have not been sent to the controller.\n Would you like to save the recommended table to the controller now?"), (Component)this, true);
      if (bool)
        d(); 
    } 
    try {
      l();
    } catch (Exception exception) {
      D.a("Exception on VE Analyze Close: " + exception.getMessage());
    } 
    try {
      this.h.b(this.g);
      this.h.close();
    } catch (Exception exception) {
      D.a("Exception on veAnalyzeLive close: " + exception.getMessage());
    } 
  }
  
  public Dimension getMinimumSize() {
    return new Dimension(eJ.a(500), eJ.a(410));
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(eJ.a(800), eJ.a(450));
  }
  
  public String e() {
    return this.p;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */