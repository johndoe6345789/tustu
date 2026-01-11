package bs;

import G.R;
import G.be;
import G.bm;
import G.bv;
import G.dp;
import V.a;
import V.g;
import aE.a;
import aP.f;
import bE.m;
import bE.p;
import bH.D;
import bH.X;
import bt.bQ;
import bt.bh;
import bt.d;
import com.efiAnalytics.tuningwidgets.panels.aP;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.dD;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.fF;
import com.efiAnalytics.ui.s;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
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

public class k extends d implements bc {
  dp a;
  
  D b = null;
  
  R c;
  
  m d = null;
  
  A e = new A(this);
  
  dD f = null;
  
  m g = null;
  
  B h = new B(this);
  
  dD i = null;
  
  bm j;
  
  w k = null;
  
  JToggleButton l = new JToggleButton(g.b("Start Auto Tune"));
  
  JCheckBox m = null;
  
  dQ n = null;
  
  JPanel o = null;
  
  String p = "15";
  
  y q = null;
  
  z r = null;
  
  public k(R paramR, dp paramdp) {
    this.a = paramdp;
    this.c = paramR;
    this.j = (bm)paramR.e().c(paramdp.c());
    this.n = new dQ((Properties)a.A(), "WueAnalyzePanel_" + paramdp.c());
    String str = this.n.b("targetLambdaTableName", paramdp.f());
    if (str != null && !str.equals(""))
      paramdp.f(str); 
    this.b = new D(paramR, paramdp);
    paramR.C().a(this.b);
    boolean bool = Boolean.parseBoolean(this.n.b("extendBeyondData", "true"));
    this.b.b(bool);
    setLayout(new BorderLayout());
    add("North", a());
    add("Center", b());
    add("East", (Component)f());
    add("South", c());
  }
  
  private JPanel a() {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(g.b(this.j.M()) + " - " + g.b("Control Panel")));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BoxLayout(jPanel2, 0));
    this.k = new w(this, g.b("Idle"), 0);
    jPanel2.add(this.k);
    jPanel2.add(new JLabel("  "));
    jPanel2.add(this.l);
    this.l.setMnemonic('A');
    this.l.addActionListener(new l(this));
    jPanel1.add("East", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BoxLayout(jPanel3, 0));
    this.p = this.n.b("applyPeriod", "15");
    this.m = new JCheckBox(g.b("Update Controller") + "   ");
    this.m.setToolTipText("<html>" + g.b("Check to have WUE Analyze Recommendations automatically <br>sent to the controller. If unchecked, WUE Analyze Live will <br>produce the recommended warmup enrichment curve, but not send changes until the Apply button is clicked.</html>"));
    this.m.setSelected(!this.p.equals("Manually"));
    this.m.addActionListener(new o(this));
    if (!this.a.l(dp.d)) {
      jPanel3.add(this.m);
    } else {
      this.m.setSelected(false);
      this.p = "Manually";
      a(this.p);
    } 
    JButton jButton1 = new JButton(g.b("Apply"));
    jButton1.setMnemonic('A');
    jButton1.setToolTipText(g.b("<html>Send the VE Analyze Recommendations<br>to the ECU Now. The engine will be running on the recommended <br>VE Table, but not nessecarily permenantly stored.</html>"));
    jButton1.addActionListener(new p(this));
    jPanel3.add(jButton1);
    JButton jButton2 = new JButton(g.b("Save on ECU"));
    jButton2.setMnemonic('E');
    jButton2.addActionListener(new q(this));
    jButton2.setToolTipText(g.b("<html>Stores the Recommended VE table values to ECU <br>FLASH for persistent storage.</html>"));
    jPanel3.add(jButton2);
    this.o = new JPanel();
    this.o.setLayout(new FlowLayout());
    jPanel3.add(this.o);
    JCheckBox jCheckBox = new JCheckBox(g.b("Extended Prediction") + "   ");
    jCheckBox.setToolTipText("<html>" + g.b("Predict warmup values beyond the temperature range <br>of data collected during this session.<br>This will produce best guess estimates for very cold temperatures <br>that may be difficult to collect data for.</html>"));
    boolean bool = Boolean.parseBoolean(this.n.b("extendBeyondData", "true"));
    jCheckBox.setSelected(bool);
    jCheckBox.addActionListener(new r(this));
    jPanel3.add(jCheckBox);
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Help32.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton3 = new JButton(null, imageIcon);
    jButton3.setFocusable(false);
    jButton3.addActionListener(new s(this));
    jButton3.setPreferredSize(new Dimension(28, 24));
    jButton3.setMinimumSize(new Dimension(28, 24));
    jButton3.setMaximumSize(new Dimension(28, 26));
    jPanel3.add(jButton3);
    jPanel1.add("West", jPanel3);
    return jPanel1;
  }
  
  private JPanel b() {
    if (this.c.e().c(this.a.g()) == null)
      throw new g("WUE Analyzer: Can not locate AFR Compensation Curve " + this.a.g() + " in " + this.c.c()); 
    if (this.j == null)
      throw new g("WUE Analyzer: Can not locate Warm up Curve " + this.a.c() + " in " + this.c.c()); 
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 1));
    bv bv1 = new bv();
    bv1.i(2);
    bv bv2 = new bv();
    bv2.t("Center");
    bv2.s(g.b("Warmup Enrichment Curve"));
    this.j.d(true);
    bv2.a((bv)this.j);
    bv1.a(bv2);
    bh bh = new bh(this.c, bv1);
    jPanel.add((Component)bh);
    return jPanel;
  }
  
  private JPanel c() {
    this.r = new z(this);
    this.b.a(this.r);
    return this.r;
  }
  
  private JPanel d() {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.d = new m();
    this.f = new dD((Component)this.d);
    this.f.b(3000);
    this.f.a(new t(this));
    this.d.a((p)this.e);
    this.e.a(this.j.h());
    this.e.b(this.b.d() + 10.0D);
    this.e.c(-40.0D);
    this.e.d(40.0D);
    this.e.e(-25.0D);
    this.e.f(25.0D);
    this.b.a(this.e);
    this.d.a(g.b("Coolant"));
    this.d.b(g.b("Lambda Error") + " %");
    this.d.c(g.b("WUE Error") + " %");
    jPanel.add("Center", (Component)this.d);
    JLabel jLabel = new JLabel(g.b("Coolant"), 0);
    jLabel.setBackground(Color.BLACK);
    jLabel.setOpaque(true);
    jLabel.setForeground(Color.WHITE);
    jPanel.add("South", jLabel);
    fF fF1 = new fF(g.b("Lambda Error") + " %");
    fF1.setBackground(Color.BLACK);
    fF1.setOpaque(true);
    fF1.setForeground(Color.WHITE);
    jPanel.add("West", (Component)fF1);
    fF fF2 = new fF(g.b("WUE Error") + " %");
    fF2.setBackground(Color.BLACK);
    fF2.setOpaque(true);
    fF2.setForeground(Color.WHITE);
    jPanel.add("East", (Component)fF2);
    jPanel.setBorder(BorderFactory.createTitledBorder(g.b("WUE Error vs Coolant")));
    return jPanel;
  }
  
  private JPanel e() {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.g = new m();
    this.i = new dD((Component)this.g);
    this.i.b(3000);
    this.i.a(new u(this));
    this.g.a((p)this.h);
    this.h.a(this.j.h());
    this.h.b(this.b.d() + 10.0D);
    this.h.c(90.0D);
    this.h.d(200.0D);
    this.h.e(-3.0D);
    this.h.f(3.0D);
    this.b.a(this.h);
    this.g.a(g.b("Coolant"));
    this.g.b(g.b("Recommended WUE") + " %");
    this.g.c(g.b("AFR Error"));
    jPanel.add("Center", (Component)this.g);
    JLabel jLabel = new JLabel(g.b("Coolant"), 0);
    jLabel.setBackground(Color.BLACK);
    jLabel.setOpaque(true);
    jLabel.setForeground(Color.WHITE);
    jPanel.add("South", jLabel);
    fF fF1 = new fF(g.b("Recommended WUE") + " %");
    fF1.setBackground(Color.BLACK);
    fF1.setOpaque(true);
    fF1.setForeground(Color.WHITE);
    jPanel.add("West", (Component)fF1);
    fF fF2 = new fF(g.b("AFR Error"));
    fF2.setBackground(Color.BLACK);
    fF2.setOpaque(true);
    fF2.setForeground(Color.WHITE);
    jPanel.add("East", (Component)fF2);
    jPanel.setBorder(BorderFactory.createTitledBorder(g.b("Recommended WUE Data")));
    return jPanel;
  }
  
  private n f() {
    n n = new n();
    if (this.c.e().c(this.a.g()) == null)
      throw new g("WUE Analyzer: Can not locate AFR Compensation Curve " + this.a.g() + " in " + this.c.c()); 
    n.addTab(g.b("Error Plot"), d());
    n.addTab(g.b("Recommended WUE Plot"), e());
    bv bv1 = new bv();
    bv1.i(2);
    bv bv2 = new bv();
    bv2.s(g.b("Temperature based adjustment to target Lambda"));
    bv2.t("Center");
    bv2.a(this.c.e().c(this.a.g()));
    bv1.a(bv2);
    bh bh = new bh(this.c, bv1);
    bh.setPreferredSize(new Dimension(400, 280));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("Center", (Component)bh);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    a a = new a(this.c, this.a);
    jPanel2.add("North", a);
    JPanel jPanel3 = new JPanel();
    jPanel3.setBorder(BorderFactory.createTitledBorder(g.b("Reference Tables")));
    jPanel3.setLayout(new GridLayout(0, 2));
    jPanel3.add(new JPanel());
    JButton jButton = new JButton(g.b("AFR Targets"));
    jButton.addActionListener(new v(this));
    jPanel3.add(jButton);
    jPanel2.add("South", jPanel3);
    jPanel1.add("South", jPanel2);
    n.addTab(g.b("Advanced Settings"), jPanel1);
    return n;
  }
  
  public void a(JComponent paramJComponent) {
    this.o.add(paramJComponent);
  }
  
  public void a(String paramString) {
    this.p = paramString;
    this.n.a("applyPeriod", this.p);
    if (this.q != null) {
      k();
    } else if (this.p.equals("Manually")) {
      j();
    } 
  }
  
  private void b(JComponent paramJComponent) {
    br br = new br();
    Iterator<String> iterator = this.a.j();
    while (iterator.hasNext()) {
      String str = iterator.next();
      boolean bool = str.equals(this.a.f());
      if (str.equals("afrTSCustom")) {
        JCheckBoxMenuItem jCheckBoxMenuItem = a(a.b + " " + g.b("Custom"), str, bool);
        br.add(jCheckBoxMenuItem);
        continue;
      } 
      be be = (be)this.c.e().c(str);
      if (be != null) {
        JCheckBoxMenuItem jCheckBoxMenuItem = a(X.b(g.b(be.M()), "\"", ""), str, bool);
        br.add(jCheckBoxMenuItem);
        continue;
      } 
      bV.d(str + " is defined as an Target Lambda Table, but not found in the current config.", paramJComponent);
    } 
    add((Component)br);
    br.show(paramJComponent, 0, paramJComponent.getHeight());
  }
  
  private JCheckBoxMenuItem a(String paramString1, String paramString2, boolean paramBoolean) {
    n n;
    String str = "";
    m m1 = null;
    boolean bool = (this.a.m() != null && this.a.m().equals(paramString2)) ? true : false;
    if (paramBoolean) {
      str = g.b("Edit / View") + " - " + paramString1;
      m1 = new m(this);
    } else {
      str = g.b("Switch to") + " - " + paramString1;
      n = new n(this);
    } 
    if (bool)
      str = str + " (" + g.b("Default") + ")"; 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, paramBoolean);
    jCheckBoxMenuItem.addActionListener(n);
    jCheckBoxMenuItem.setActionCommand(paramString2);
    return jCheckBoxMenuItem;
  }
  
  private void g() {
    if (this.a.f().equals("afrTSCustom")) {
      try {
        Iterator<String> iterator = this.c.L();
        String str = "veTable1Tbl";
        if (iterator.hasNext())
          str = iterator.next(); 
        s s = bQ.a().a(this.c, this.a.f(), "", str);
        aP aP = new aP(this.c, s, str);
        a((bc)aP);
        bV.a((Component)aP, (Component)this, g.b("Target AFR Table"), (bc)aP);
      } catch (g g) {
        D.a("Can not show AFR Table.", (Exception)g, this);
      } 
    } else {
      String str = this.c.c() + "." + this.a.f();
      f.a().a(str, "0", bV.a((Component)this));
    } 
  }
  
  public void close() {
    this.c.C().c(this.b);
    l();
  }
  
  private void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.k.setText(g.b("Correcting WUE"));
      this.l.setText(g.b("Stop Auto Tune"));
      try {
        this.b.a(paramBoolean);
        k();
      } catch (a a) {
        Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        bV.d("Could not start WUE Analyze!\n" + a.getLocalizedMessage(), (Component)this);
        a(false);
      } 
    } else {
      this.k.setText(g.b("Idle"));
      this.l.setText(g.b("Start Auto Tune"));
      try {
        this.b.a(paramBoolean);
      } catch (a a) {
        Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        bV.d("Could not stop WUE Analyze!\n" + a.getLocalizedMessage(), (Component)this);
      } 
      j();
    } 
    this.k.a(paramBoolean);
  }
  
  private void h() {
    try {
      this.b.e();
      if (this.a.l(dp.e))
        i(); 
    } catch (g g) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      bV.d("Error Applying Recommended WUE.\n" + g.getMessage(), (Component)this);
    } 
  }
  
  private void i() {
    this.c.I();
  }
  
  private void j() {
    if (this.q != null) {
      this.q.a();
      this.q = null;
      h();
    } 
  }
  
  private void k() {
    j();
    if (!this.p.equals("Manually")) {
      int i = Integer.parseInt(this.p);
      this.q = new y(this, i);
      this.q.start();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */