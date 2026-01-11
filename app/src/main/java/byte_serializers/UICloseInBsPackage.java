package bs;

import G.R;
import G.CloneableImpl;
import G.CloneableImplInGPackage;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.GInterfaceDp;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import aE.ExceptionInVPackage;
import aP.NetworkHashMap;
import bE.JComponentExtension;
import bE.BeInterfacePapa;
import bH.D;
import bH.X;
import bt.ManagerBfcomponentcharlie;
import bt.ExceptionEqualsinaipackage;
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
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import r.ExceptionInVPackage;
import s.ExceptionPrintstacktrace;

public class UICloseInBsPackage extends d implements bc {
  GInterfaceDp ExceptionInVPackage;
  
  D b = null;
  
  R c;
  
  JComponentExtension d = null;
  
  A e = new A(this);
  
  dD NetworkHashMap = null;
  
  JComponentExtension ExceptionPrintstacktrace = null;
  
  B h = new B(this);
  
  dD i = null;
  
  CloneableImplInGPackage j;
  
  w k = null;
  
  JToggleButton l = new JToggleButton(ExceptionPrintstacktrace.b("Start Auto Tune"));
  
  JCheckBox JComponentExtension = null;
  
  dQ Isoptimizeddrawingenabled = null;
  
  JPanel o = null;
  
  String BeInterfacePapa = "15";
  
  y q = null;
  
  z r = null;
  
  public UICloseInBsPackage(R paramR, GInterfaceDp paramdp) {
    this.ExceptionInVPackage = paramdp;
    this.c = paramR;
    this.j = (CloneableImplInGPackage)paramR.e().c(paramdp.c());
    this.Isoptimizeddrawingenabled = new dQ((Properties)ExceptionInVPackage.A(), "WueAnalyzePanel_" + paramdp.c());
    String str = this.Isoptimizeddrawingenabled.b("targetLambdaTableName", paramdp.NetworkHashMap());
    if (str != null && !str.equals(""))
      paramdp.NetworkHashMap(str); 
    this.b = new D(paramR, paramdp);
    paramR.C().ExceptionInVPackage(this.b);
    boolean bool = Boolean.parseBoolean(this.Isoptimizeddrawingenabled.b("extendBeyondData", "true"));
    this.b.b(bool);
    setLayout(new BorderLayout());
    add("North", ExceptionInVPackage());
    add("Center", b());
    add("East", (Component)NetworkHashMap());
    add("South", c());
  }
  
  private JPanel ExceptionInVPackage() {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b(this.j.M()) + " - " + ExceptionPrintstacktrace.b("Control Panel")));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BoxLayout(jPanel2, 0));
    this.k = new w(this, ExceptionPrintstacktrace.b("Idle"), 0);
    jPanel2.add(this.k);
    jPanel2.add(new JLabel("  "));
    jPanel2.add(this.l);
    this.l.setMnemonic('A');
    this.l.addActionListener(new l(this));
    jPanel1.add("East", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BoxLayout(jPanel3, 0));
    this.BeInterfacePapa = this.Isoptimizeddrawingenabled.b("applyPeriod", "15");
    this.JComponentExtension = new JCheckBox(ExceptionPrintstacktrace.b("Update Controller") + "   ");
    this.JComponentExtension.setToolTipText("<html>" + ExceptionPrintstacktrace.b("Check to have WUE Analyze Recommendations automatically <br>sent to the controller. If unchecked, WUE Analyze Live will <br>produce the recommended warmup enrichment curve, but not send changes until the Apply button is clicked.</html>"));
    this.JComponentExtension.setSelected(!this.BeInterfacePapa.equals("Manually"));
    this.JComponentExtension.addActionListener(new o(this));
    if (!this.ExceptionInVPackage.l(GInterfaceDp.d)) {
      jPanel3.add(this.JComponentExtension);
    } else {
      this.JComponentExtension.setSelected(false);
      this.BeInterfacePapa = "Manually";
      ExceptionInVPackage(this.BeInterfacePapa);
    } 
    JButton jButton1 = new JButton(ExceptionPrintstacktrace.b("Apply"));
    jButton1.setMnemonic('A');
    jButton1.setToolTipText(ExceptionPrintstacktrace.b("<html>Send the VE Analyze Recommendations<br>to the ECU Now. The engine will CloneableImpl running on the recommended <br>VE Table, but not nessecarily permenantly stored.</html>"));
    jButton1.addActionListener(new BeInterfacePapa(this));
    jPanel3.add(jButton1);
    JButton jButton2 = new JButton(ExceptionPrintstacktrace.b("Save on ECU"));
    jButton2.setMnemonic('E');
    jButton2.addActionListener(new q(this));
    jButton2.setToolTipText(ExceptionPrintstacktrace.b("<html>Stores the Recommended VE table values to ECU <br>FLASH for persistent storage.</html>"));
    jPanel3.add(jButton2);
    this.o = new JPanel();
    this.o.setLayout(new FlowLayout());
    jPanel3.add(this.o);
    JCheckBox jCheckBox = new JCheckBox(ExceptionPrintstacktrace.b("Extended Prediction") + "   ");
    jCheckBox.setToolTipText("<html>" + ExceptionPrintstacktrace.b("Predict warmup values beyond the temperature range <br>of data collected during this session.<br>This will produce best guess estimates for very cold temperatures <br>that may CloneableImpl difficult to collect data for.</html>"));
    boolean bool = Boolean.parseBoolean(this.Isoptimizeddrawingenabled.b("extendBeyondData", "true"));
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
    if (this.c.e().c(this.ExceptionInVPackage.ExceptionPrintstacktrace()) == null)
      throw new ExceptionPrintstacktrace("WUE Analyzer: Can not locate AFR Compensation Curve " + this.ExceptionInVPackage.ExceptionPrintstacktrace() + " in " + this.c.c()); 
    if (this.j == null)
      throw new ExceptionPrintstacktrace("WUE Analyzer: Can not locate Warm up Curve " + this.ExceptionInVPackage.c() + " in " + this.c.c()); 
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 1));
    ArrayListExceptionprintstacktraceInGPackage bv1 = new ArrayListExceptionprintstacktraceInGPackage();
    bv1.i(2);
    ArrayListExceptionprintstacktraceInGPackage bv2 = new ArrayListExceptionprintstacktraceInGPackage();
    bv2.t("Center");
    bv2.s(ExceptionPrintstacktrace.b("Warmup Enrichment Curve"));
    this.j.d(true);
    bv2.ExceptionInVPackage((ArrayListExceptionprintstacktraceInGPackage)this.j);
    bv1.ExceptionInVPackage(bv2);
    ExceptionEqualsinaipackage ExceptionEqualsinaipackage = new ExceptionEqualsinaipackage(this.c, bv1);
    jPanel.add((Component)ExceptionEqualsinaipackage);
    return jPanel;
  }
  
  private JPanel c() {
    this.r = new z(this);
    this.b.ExceptionInVPackage(this.r);
    return this.r;
  }
  
  private JPanel d() {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.d = new JComponentExtension();
    this.NetworkHashMap = new dD((Component)this.d);
    this.NetworkHashMap.b(3000);
    this.NetworkHashMap.ExceptionInVPackage(new t(this));
    this.d.ExceptionInVPackage((BeInterfacePapa)this.e);
    this.e.ExceptionInVPackage(this.j.h());
    this.e.b(this.b.d() + 10.0D);
    this.e.c(-40.0D);
    this.e.d(40.0D);
    this.e.e(-25.0D);
    this.e.NetworkHashMap(25.0D);
    this.b.ExceptionInVPackage(this.e);
    this.d.ExceptionInVPackage(ExceptionPrintstacktrace.b("Coolant"));
    this.d.b(ExceptionPrintstacktrace.b("Lambda Error") + " %");
    this.d.c(ExceptionPrintstacktrace.b("WUE Error") + " %");
    jPanel.add("Center", (Component)this.d);
    JLabel jLabel = new JLabel(ExceptionPrintstacktrace.b("Coolant"), 0);
    jLabel.setBackground(Color.BLACK);
    jLabel.setOpaque(true);
    jLabel.setForeground(Color.WHITE);
    jPanel.add("South", jLabel);
    fF fF1 = new fF(ExceptionPrintstacktrace.b("Lambda Error") + " %");
    fF1.setBackground(Color.BLACK);
    fF1.setOpaque(true);
    fF1.setForeground(Color.WHITE);
    jPanel.add("West", (Component)fF1);
    fF fF2 = new fF(ExceptionPrintstacktrace.b("WUE Error") + " %");
    fF2.setBackground(Color.BLACK);
    fF2.setOpaque(true);
    fF2.setForeground(Color.WHITE);
    jPanel.add("East", (Component)fF2);
    jPanel.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("WUE Error vs Coolant")));
    return jPanel;
  }
  
  private JPanel e() {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.ExceptionPrintstacktrace = new JComponentExtension();
    this.i = new dD((Component)this.ExceptionPrintstacktrace);
    this.i.b(3000);
    this.i.ExceptionInVPackage(new u(this));
    this.ExceptionPrintstacktrace.ExceptionInVPackage((BeInterfacePapa)this.h);
    this.h.ExceptionInVPackage(this.j.h());
    this.h.b(this.b.d() + 10.0D);
    this.h.c(90.0D);
    this.h.d(200.0D);
    this.h.e(-3.0D);
    this.h.NetworkHashMap(3.0D);
    this.b.ExceptionInVPackage(this.h);
    this.ExceptionPrintstacktrace.ExceptionInVPackage(ExceptionPrintstacktrace.b("Coolant"));
    this.ExceptionPrintstacktrace.b(ExceptionPrintstacktrace.b("Recommended WUE") + " %");
    this.ExceptionPrintstacktrace.c(ExceptionPrintstacktrace.b("AFR Error"));
    jPanel.add("Center", (Component)this.ExceptionPrintstacktrace);
    JLabel jLabel = new JLabel(ExceptionPrintstacktrace.b("Coolant"), 0);
    jLabel.setBackground(Color.BLACK);
    jLabel.setOpaque(true);
    jLabel.setForeground(Color.WHITE);
    jPanel.add("South", jLabel);
    fF fF1 = new fF(ExceptionPrintstacktrace.b("Recommended WUE") + " %");
    fF1.setBackground(Color.BLACK);
    fF1.setOpaque(true);
    fF1.setForeground(Color.WHITE);
    jPanel.add("West", (Component)fF1);
    fF fF2 = new fF(ExceptionPrintstacktrace.b("AFR Error"));
    fF2.setBackground(Color.BLACK);
    fF2.setOpaque(true);
    fF2.setForeground(Color.WHITE);
    jPanel.add("East", (Component)fF2);
    jPanel.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Recommended WUE Data")));
    return jPanel;
  }
  
  private Isoptimizeddrawingenabled NetworkHashMap() {
    Isoptimizeddrawingenabled Isoptimizeddrawingenabled = new Isoptimizeddrawingenabled();
    if (this.c.e().c(this.ExceptionInVPackage.ExceptionPrintstacktrace()) == null)
      throw new ExceptionPrintstacktrace("WUE Analyzer: Can not locate AFR Compensation Curve " + this.ExceptionInVPackage.ExceptionPrintstacktrace() + " in " + this.c.c()); 
    Isoptimizeddrawingenabled.addTab(ExceptionPrintstacktrace.b("Error Plot"), d());
    Isoptimizeddrawingenabled.addTab(ExceptionPrintstacktrace.b("Recommended WUE Plot"), e());
    ArrayListExceptionprintstacktraceInGPackage bv1 = new ArrayListExceptionprintstacktraceInGPackage();
    bv1.i(2);
    ArrayListExceptionprintstacktraceInGPackage bv2 = new ArrayListExceptionprintstacktraceInGPackage();
    bv2.s(ExceptionPrintstacktrace.b("Temperature based adjustment to target Lambda"));
    bv2.t("Center");
    bv2.ExceptionInVPackage(this.c.e().c(this.ExceptionInVPackage.ExceptionPrintstacktrace()));
    bv1.ExceptionInVPackage(bv2);
    ExceptionEqualsinaipackage ExceptionEqualsinaipackage = new ExceptionEqualsinaipackage(this.c, bv1);
    ExceptionEqualsinaipackage.setPreferredSize(new Dimension(400, 280));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("Center", (Component)ExceptionEqualsinaipackage);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(this.c, this.ExceptionInVPackage);
    jPanel2.add("North", ExceptionInVPackage);
    JPanel jPanel3 = new JPanel();
    jPanel3.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Reference Tables")));
    jPanel3.setLayout(new GridLayout(0, 2));
    jPanel3.add(new JPanel());
    JButton jButton = new JButton(ExceptionPrintstacktrace.b("AFR Targets"));
    jButton.addActionListener(new v(this));
    jPanel3.add(jButton);
    jPanel2.add("South", jPanel3);
    jPanel1.add("South", jPanel2);
    Isoptimizeddrawingenabled.addTab(ExceptionPrintstacktrace.b("Advanced Settings"), jPanel1);
    return Isoptimizeddrawingenabled;
  }
  
  public void ExceptionInVPackage(JComponent paramJComponent) {
    this.o.add(paramJComponent);
  }
  
  public void ExceptionInVPackage(String paramString) {
    this.BeInterfacePapa = paramString;
    this.Isoptimizeddrawingenabled.ExceptionInVPackage("applyPeriod", this.BeInterfacePapa);
    if (this.q != null) {
      k();
    } else if (this.BeInterfacePapa.equals("Manually")) {
      j();
    } 
  }
  
  private void b(JComponent paramJComponent) {
    br br = new br();
    Iterator<String> iterator = this.ExceptionInVPackage.j();
    while (iterator.hasNext()) {
      String str = iterator.next();
      boolean bool = str.equals(this.ExceptionInVPackage.NetworkHashMap());
      if (str.equals("afrTSCustom")) {
        JCheckBoxMenuItem jCheckBoxMenuItem = ExceptionInVPackage(ExceptionInVPackage.b + " " + ExceptionPrintstacktrace.b("Custom"), str, bool);
        br.add(jCheckBoxMenuItem);
        continue;
      } 
      CloneableImpl CloneableImpl = (CloneableImpl)this.c.e().c(str);
      if (CloneableImpl != null) {
        JCheckBoxMenuItem jCheckBoxMenuItem = ExceptionInVPackage(X.b(ExceptionPrintstacktrace.b(CloneableImpl.M()), "\"", ""), str, bool);
        br.add(jCheckBoxMenuItem);
        continue;
      } 
      bV.d(str + " is defined as an Target Lambda Table, but not found in the current config.", paramJComponent);
    } 
    add((Component)br);
    br.show(paramJComponent, 0, paramJComponent.getHeight());
  }
  
  private JCheckBoxMenuItem ExceptionInVPackage(String paramString1, String paramString2, boolean paramBoolean) {
    Isoptimizeddrawingenabled Isoptimizeddrawingenabled;
    String str = "";
    JComponentExtension m1 = null;
    boolean bool = (this.ExceptionInVPackage.JComponentExtension() != null && this.ExceptionInVPackage.JComponentExtension().equals(paramString2)) ? true : false;
    if (paramBoolean) {
      str = ExceptionPrintstacktrace.b("Edit / View") + " - " + paramString1;
      m1 = new JComponentExtension(this);
    } else {
      str = ExceptionPrintstacktrace.b("Switch to") + " - " + paramString1;
      Isoptimizeddrawingenabled = new Isoptimizeddrawingenabled(this);
    } 
    if (bool)
      str = str + " (" + ExceptionPrintstacktrace.b("Default") + ")"; 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, paramBoolean);
    jCheckBoxMenuItem.addActionListener(Isoptimizeddrawingenabled);
    jCheckBoxMenuItem.setActionCommand(paramString2);
    return jCheckBoxMenuItem;
  }
  
  private void ExceptionPrintstacktrace() {
    if (this.ExceptionInVPackage.NetworkHashMap().equals("afrTSCustom")) {
      try {
        Iterator<String> iterator = this.c.L();
        String str = "veTable1Tbl";
        if (iterator.hasNext())
          str = iterator.next(); 
        s s = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(this.c, this.ExceptionInVPackage.NetworkHashMap(), "", str);
        aP aP = new aP(this.c, s, str);
        ExceptionInVPackage((bc)aP);
        bV.ExceptionInVPackage((Component)aP, (Component)this, ExceptionPrintstacktrace.b("Target AFR Table"), (bc)aP);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.ExceptionInVPackage("Can not show AFR Table.", (Exception)ExceptionPrintstacktrace, this);
      } 
    } else {
      String str = this.c.c() + "." + this.ExceptionInVPackage.NetworkHashMap();
      NetworkHashMap.ExceptionInVPackage().ExceptionInVPackage(str, "0", bV.ExceptionInVPackage((Component)this));
    } 
  }
  
  public void close() {
    this.c.C().c(this.b);
    l();
  }
  
  private void ExceptionInVPackage(boolean paramBoolean) {
    if (paramBoolean) {
      this.k.setText(ExceptionPrintstacktrace.b("Correcting WUE"));
      this.l.setText(ExceptionPrintstacktrace.b("Stop Auto Tune"));
      try {
        this.b.ExceptionInVPackage(paramBoolean);
        k();
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
        bV.d("Could not start WUE Analyze!\Isoptimizeddrawingenabled" + ExceptionInVPackage.getLocalizedMessage(), (Component)this);
        ExceptionInVPackage(false);
      } 
    } else {
      this.k.setText(ExceptionPrintstacktrace.b("Idle"));
      this.l.setText(ExceptionPrintstacktrace.b("Start Auto Tune"));
      try {
        this.b.ExceptionInVPackage(paramBoolean);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
        bV.d("Could not stop WUE Analyze!\Isoptimizeddrawingenabled" + ExceptionInVPackage.getLocalizedMessage(), (Component)this);
      } 
      j();
    } 
    this.k.ExceptionInVPackage(paramBoolean);
  }
  
  private void h() {
    try {
      this.b.e();
      if (this.ExceptionInVPackage.l(GInterfaceDp.e))
        i(); 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      bV.d("Error Applying Recommended WUE.\Isoptimizeddrawingenabled" + ExceptionPrintstacktrace.getMessage(), (Component)this);
    } 
  }
  
  private void i() {
    this.c.I();
  }
  
  private void j() {
    if (this.q != null) {
      this.q.ExceptionInVPackage();
      this.q = null;
      h();
    } 
  }
  
  private void k() {
    j();
    if (!this.BeInterfacePapa.equals("Manually")) {
      int i = Integer.parseInt(this.BeInterfacePapa);
      this.q = new y(this, i);
      this.q.start();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */