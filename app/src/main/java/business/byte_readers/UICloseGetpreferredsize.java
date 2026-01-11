package business.byte_readers;

import G.R;
import G.SerializableImpl;
import G.ExceptionprintstacktraceInGPackage;
import G.CloneableImpl;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.GInterfaceDm;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import aE.ExceptionInVPackage;
import aP.NetworkHashMap;
import aS.AsInterfaceLima;
import bH.D;
import bH.X;
import bH.p;
import bL.ExceptionInVPackage;
import bt.ManagerBfcomponentcharlie;
import bt.ExceptionEqualsinaipackage;
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
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import r.ExceptionInVPackage;
import s.ExceptionPrintstacktrace;

public class UICloseGetpreferredsize extends al implements bc {
  R ExceptionInVPackage = null;
  
  GInterfaceDm b = null;
  
  ExceptionEqualsinaipackage c = null;
  
  Isoptimizeddrawingenabled d = null;
  
  D e = null;
  
  JToggleButton NetworkHashMap = new JToggleButton(ExceptionPrintstacktrace.b("Start"));
  
  I ExceptionPrintstacktrace = null;
  
  Isoptimizeddrawingenabled h = null;
  
  c i = null;
  
  JButton j;
  
  JCheckBox k = null;
  
  F AsInterfaceLima = null;
  
  dQ m = null;
  
  JPanel Isoptimizeddrawingenabled = null;
  
  String o = "15";
  
  private String p = null;
  
  public UICloseGetpreferredsize(R paramR, GInterfaceDm paramdm) {
    this.ExceptionInVPackage = paramR;
    this.b = paramdm;
    this.p = paramdm.b();
    this.m = new dQ((Properties)ExceptionInVPackage.A(), "VeAnalyzePanel_" + e());
    String str1 = this.m.b("targetLambdaTableName", paramdm.Isoptimizeddrawingenabled());
    if (str1 != null && !str1.equals(""))
      paramdm.c(str1); 
    String str2 = this.m.b("targetLambdaChannelName", paramdm.t());
    if (str2 != null && !str2.isEmpty())
      paramdm.r(str2); 
    this.i = J.ExceptionInVPackage().c(paramR, this.p);
    if (paramdm.o("disableMaxPercentLimit"))
      this.i.NetworkHashMap(); 
    this.h = r.ExceptionInVPackage().ExceptionInVPackage(paramR, paramdm, this.i);
    this.c = new ExceptionEqualsinaipackage();
    ExceptionInVPackage((bc)this.c);
    this.ExceptionPrintstacktrace = new I(this);
    this.h.ExceptionInVPackage(this.ExceptionPrintstacktrace);
    NetworkHashMap();
    ExceptionInVPackage(paramdm);
  }
  
  private void NetworkHashMap() {
    H h = new H(this, this.ExceptionInVPackage, this.b.e());
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b(ExceptionprintstacktraceInGPackage.c(this.ExceptionInVPackage, e())) + " " + ExceptionPrintstacktrace.b("Control Panel")));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BoxLayout(jPanel3, 0));
    this.e = new D(this, ExceptionPrintstacktrace.b("Idle"), 0);
    jPanel3.add(this.e);
    jPanel3.add(new JLabel("  "));
    jPanel3.add(this.NetworkHashMap);
    this.NetworkHashMap.setMnemonic('A');
    this.NetworkHashMap.addActionListener(new t(this));
    jPanel2.add("East", jPanel3);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BoxLayout(jPanel4, 0));
    this.o = this.m.b("applyPeriod", "15");
    this.k = new JCheckBox(ExceptionPrintstacktrace.b("Update Controller") + "   ");
    this.k.setToolTipText(ExceptionPrintstacktrace.b("<html>Check to have VE Analyze Recommendations automatically <br>Sent to the controller. If unchecked, VE Analyze Live will <br>produce the recommended table, but not send changes until the Send button is clicked.</html>"));
    this.k.setSelected(!this.o.equals("Manually"));
    this.k.addActionListener(new v(this));
    jPanel4.add(this.k);
    JButton jButton1 = new JButton(ExceptionPrintstacktrace.b("Apply"));
    jButton1.setMnemonic('S');
    jButton1.setToolTipText(ExceptionPrintstacktrace.b("<html>Send the VE Analyze Recommendations<br>to the ECU Now. The engine will CloneableImpl running on the recommended <br>VE Table, but not nessecarily permenantly stored.</html>"));
    jButton1.addActionListener(new w(this));
    jPanel4.add(jButton1);
    JButton jButton2 = new JButton(ExceptionPrintstacktrace.b("Save on ECU"));
    jButton2.setMnemonic('E');
    jButton2.addActionListener(new x(this));
    jPanel4.add(jButton2);
    jButton2.setToolTipText("<html>" + ExceptionPrintstacktrace.b("Stores the Recommended VE table values to ECU<br>" + ExceptionPrintstacktrace.b("FLASH for persistent storage.") + "</html>"));
    this.Isoptimizeddrawingenabled = new JPanel();
    this.Isoptimizeddrawingenabled.setLayout(new FlowLayout());
    jPanel4.add(this.Isoptimizeddrawingenabled);
    jPanel4.add(new JLabel("  "));
    this.j = new JButton(ExceptionPrintstacktrace.b("Reset"));
    this.j.addActionListener(new y(this));
    this.j.setToolTipText("<html>" + ExceptionPrintstacktrace.b("Resets Heat Maps and underlying data that has produced table changes.<br>" + ExceptionPrintstacktrace.b("The VE Table will remain as it is.") + "</html>"));
    jPanel4.add(this.j);
    this.j.setEnabled(false);
    jPanel2.add("West", jPanel4);
    add("North", jPanel2);
    jPanel1.add("Center", (Component)this.c);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(this.i, (et)this.m);
    jPanel5.add("North", (Component)ExceptionInVPackage);
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new BorderLayout());
    ExceptionInVPackage a1 = new ExceptionInVPackage(this.ExceptionInVPackage, this.b);
    jPanel6.add("Center", a1);
    jPanel5.add("Center", jPanel6);
    JPanel jPanel7 = new JPanel();
    jPanel7.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Reference Tables")));
    jPanel7.setLayout(new GridLayout(0, 2));
    JButton jButton3 = new JButton(ExceptionPrintstacktrace.b("Lambda Delay"));
    jButton3.addActionListener(new z(this));
    jPanel7.add(jButton3);
    JButton jButton4 = new JButton(ExceptionPrintstacktrace.b("AFR Targets"));
    jButton4.addActionListener(new A(this));
    jPanel7.add(jButton4);
    jPanel5.add("South", jPanel7);
    this.d = new Isoptimizeddrawingenabled();
    JPanel jPanel8 = new JPanel();
    com.efiAnalytics.ui.s s1 = this.h.h();
    jPanel8.setLayout(new GridLayout(2, 1));
    v v = new v(s1);
    cA cA = new cA((cD)v);
    h.ExceptionInVPackage(cA);
    v.c(2);
    cA.ExceptionInVPackage(0.0D, getBackground());
    cA.ExceptionInVPackage(8.0D, Color.yellow);
    cA.ExceptionInVPackage(50.0D, Color.GREEN);
    cA.ExceptionInVPackage(150.0D, Color.GREEN.darker());
    cA.ExceptionInVPackage(s1.w());
    cA.b(s1.v());
    cA.c(ExceptionPrintstacktrace.b("Data Weighting"));
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new BorderLayout());
    jPanel9.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Cell Weighting")));
    jPanel9.add("Center", (Component)cA);
    jPanel8.add(jPanel9);
    v = new v(s1);
    cA = new cA((cD)v);
    h.ExceptionInVPackage(cA);
    v.c(3);
    cA.ExceptionInVPackage(-18.0D, Color.red.darker());
    cA.ExceptionInVPackage(-7.0D, Color.red);
    cA.ExceptionInVPackage(0.0D, getBackground());
    cA.ExceptionInVPackage(7.0D, Color.blue);
    cA.ExceptionInVPackage(18.0D, Color.blue.darker());
    cA.ExceptionInVPackage(s1.w());
    cA.b(s1.v());
    cA.c(ExceptionPrintstacktrace.b("Cell Change"));
    jPanel9 = new JPanel();
    jPanel9.setLayout(new BorderLayout());
    jPanel9.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Cell Change")));
    jPanel9.add("Center", (Component)cA);
    jPanel8.add(jPanel9);
    jPanel8.setPreferredSize(eJ.ExceptionInVPackage(265, 265));
    this.d.addTab(ExceptionPrintstacktrace.b("Status"), jPanel8);
    JPanel jPanel10 = new JPanel();
    jPanel10.setLayout(new BorderLayout());
    jPanel10.add("North", jPanel5);
    this.d.addTab(ExceptionPrintstacktrace.b("Advanced Settings"), jPanel10);
    add("East", (Component)this.d);
    add("Center", jPanel1);
    add("South", this.ExceptionPrintstacktrace);
    ExceptionInVPackage(false);
  }
  
  public boolean ExceptionInVPackage() {
    return this.h.b();
  }
  
  public void ExceptionInVPackage(JComponent paramJComponent) {
    this.Isoptimizeddrawingenabled.add(paramJComponent);
  }
  
  private void ExceptionPrintstacktrace() {
    try {
      com.efiAnalytics.ui.s s1 = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage, e());
      com.efiAnalytics.ui.s s2 = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(s1, this.b.b());
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
    B b = null;
    boolean bool = (this.b.t() != null && this.b.t().equals(paramString2)) ? true : false;
    if (!paramBoolean) {
      str = ExceptionPrintstacktrace.b("Switch to Channel") + " - " + paramString1;
      b = new B(this);
    } else {
      str = ExceptionPrintstacktrace.b("Channel") + " " + paramString1;
    } 
    if (bool)
      str = str + " (" + ExceptionPrintstacktrace.b("Default") + ")"; 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, paramBoolean);
    jCheckBoxMenuItem.addActionListener(b);
    jCheckBoxMenuItem.setActionCommand(paramString2);
    return jCheckBoxMenuItem;
  }
  
  private JCheckBoxMenuItem b(String paramString1, String paramString2, boolean paramBoolean) {
    u u;
    String str = "";
    C c1 = null;
    boolean bool = (this.b.Isoptimizeddrawingenabled() != null && (this.b.t() == null || this.b.t().isEmpty()) && this.b.Isoptimizeddrawingenabled().equals(paramString2)) ? true : false;
    if (paramBoolean) {
      str = ExceptionPrintstacktrace.b("Edit / View") + " - " + paramString1;
      c1 = new C(this);
    } else {
      str = ExceptionPrintstacktrace.b("Switch to Table") + " - " + paramString1;
      u = new u(this);
    } 
    if (bool)
      str = str + " (" + ExceptionPrintstacktrace.b("Default") + ")"; 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, paramBoolean);
    jCheckBoxMenuItem.addActionListener(u);
    jCheckBoxMenuItem.setActionCommand(paramString2);
    return jCheckBoxMenuItem;
  }
  
  private void h() {
    if (this.b.c().equals("afrTSCustom")) {
      try {
        com.efiAnalytics.ui.s s1 = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage, this.b.c(), "", this.b.b());
        aP aP = new aP(this.ExceptionInVPackage, s1, this.b.b());
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
  
  private void ExceptionInVPackage(GInterfaceDm paramdm) {
    CloneableImpl CloneableImpl = (CloneableImpl)this.ExceptionInVPackage.e().c(e());
    CloneableImpl = CloneableImpl.j();
    CloneableImpl.h("veAnalyze_");
    try {
      com.efiAnalytics.ui.s s1 = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage, CloneableImpl.aL(), CloneableImpl.AsInterfaceLima(), CloneableImpl.aL());
      s1.c(1);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to get Table Model for " + CloneableImpl.aL() + " with prefix:" + CloneableImpl.AsInterfaceLima());
      ExceptionPrintstacktrace.printStackTrace();
    } 
    this.c.ExceptionInVPackage(this.ExceptionInVPackage, (ArrayListExceptionprintstacktraceInGPackage)CloneableImpl);
  }
  
  public void ExceptionInVPackage(String paramString) {
    this.o = paramString;
    this.m.ExceptionInVPackage("applyPeriod", this.o);
    if (this.AsInterfaceLima != null) {
      j();
    } else if (this.o.equals("Manually")) {
      i();
    } 
  }
  
  public void b() {
    try {
      com.efiAnalytics.ui.s s1 = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage, this.b.b(), "veAnalyze_", this.b.b());
      b[][] arrayOfB = s1.D();
      s1 = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage, this.b.b(), "", this.b.b());
      for (byte b = 0; b < s1.getRowCount(); b++) {
        for (byte b1 = 0; b1 < s1.getColumnCount(); b1++)
          s1.setValueAt(arrayOfB[arrayOfB.length - b - 1][b1].i(), b, b1); 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to get Table Model for " + e() + " with prefix:" + "veAnalyze_");
      ExceptionPrintstacktrace.printStackTrace();
    } 
  }
  
  public boolean c() {
    try {
      com.efiAnalytics.ui.s s1 = ManagerBfcomponentcharlie.ExceptionInVPackage().b(this.ExceptionInVPackage, this.b.b(), "");
      com.efiAnalytics.ui.s s2 = ManagerBfcomponentcharlie.ExceptionInVPackage().b(this.ExceptionInVPackage, this.b.b(), "veAnalyze_");
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
      D.ExceptionInVPackage("Unable to get Table Model for " + e() + " with prefix:" + "veAnalyze_");
      exception.printStackTrace();
    } 
    return false;
  }
  
  public void d() {
    b();
    this.ExceptionInVPackage.I();
  }
  
  private void i() {
    if (this.AsInterfaceLima != null) {
      this.AsInterfaceLima.ExceptionInVPackage();
      this.AsInterfaceLima = null;
      b();
    } 
  }
  
  private void j() {
    i();
    if (!this.o.equals("Manually")) {
      int i = Integer.parseInt(this.o);
      this.AsInterfaceLima = new F(this, i);
      this.AsInterfaceLima.start();
    } 
  }
  
  protected void ExceptionInVPackage(boolean paramBoolean) {
    String str = ExceptionprintstacktraceInGPackage.ExceptionInVPackage(this.ExceptionInVPackage, e());
    boolean bool = true;
    try {
      bool = p.ExceptionInVPackage(str, this.ExceptionInVPackage);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    if (paramBoolean && bool) {
      try {
        this.e.setText(ExceptionPrintstacktrace.b("Correcting VE"));
        this.NetworkHashMap.setText(ExceptionPrintstacktrace.b("Stop Auto Tune"));
        this.h.c();
        j();
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.d(ExceptionInVPackage.getMessage(), (Component)this);
      } 
      AsInterfaceLima.ExceptionInVPackage().ExceptionInVPackage(e());
    } else {
      this.e.setText(ExceptionPrintstacktrace.b("Idle"));
      this.NetworkHashMap.setText(ExceptionPrintstacktrace.b("Start Auto Tune"));
      this.h.e();
      i();
      k();
      AsInterfaceLima.ExceptionInVPackage().b(e());
    } 
    this.e.ExceptionInVPackage(paramBoolean);
  }
  
  private void k() {
    int i = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.di, 0);
    if (i == 25)
      ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.dj, "true"); 
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.di, "" + ++i);
  }
  
  public void close() {
    ExceptionInVPackage(false);
    if (c()) {
      boolean bool = bV.ExceptionInVPackage(ExceptionPrintstacktrace.b("VE Analysis has recommended VE changes that have not been sent to the controller.\Isoptimizeddrawingenabled Would you like to save the recommended table to the controller now?"), (Component)this, true);
      if (bool)
        d(); 
    } 
    try {
      AsInterfaceLima();
    } catch (Exception exception) {
      D.ExceptionInVPackage("Exception on VE Analyze Close: " + exception.getMessage());
    } 
    try {
      this.h.b(this.ExceptionPrintstacktrace);
      this.h.close();
    } catch (Exception exception) {
      D.ExceptionInVPackage("Exception on veAnalyzeLive close: " + exception.getMessage());
    } 
  }
  
  public Dimension getMinimumSize() {
    return new Dimension(eJ.ExceptionInVPackage(500), eJ.ExceptionInVPackage(410));
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(eJ.ExceptionInVPackage(800), eJ.ExceptionInVPackage(450));
  }
  
  public String e() {
    return this.p;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */