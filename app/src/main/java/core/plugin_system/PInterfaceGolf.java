package p;

import G.R;
import G.T;
import G.GInterfaceAi;
import G.i;
import G.q;
import S.SInterfaceAlpha;
import S.SInterfaceEcho;
import S.Timer;
import S.SInterfaceNovember;
import ax.ExceptionInAxPackage;
import bH.X;
import bH.ab;
import bt.ExceptionEqualsinaipackage;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fp;
import d.DComponentCharlie;
import d.SInterfaceEcho;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PInterfaceGolf extends ExceptionEqualsinaipackage implements bc {
  private String p = "Define the name of this Event Trigger. It must be unique to all Event based triggers. Should not contain spaces or special characters.";
  
  private String q = "The target Action that will be triggered based on your Trigger conditions.";
  
  private String r = "When this condition becomes true, the Target Action will be triggered and run. The target Action is only executed 1 time until the reset condition is met.";
  
  private String s = "After trigger condition becomes true and fires the target action, the target action will not be fired again until this Reset condition is met. Once the reset condition is met, it will fire again upon the trigger condition being met";
  
  public static String SInterfaceAlpha = "TimedResetSeconds:";
  
  R b = null;
  
  SInterfaceNovember DComponentCharlie;
  
  List d = new ArrayList();
  
  JCheckBox SInterfaceEcho = new JCheckBox(s.g.b("Enabled"));
  
  JComboBox f = new JComboBox();
  
  JTextField g = new JTextField("", 12);
  
  JPanel Timer = new JPanel();
  
  JButton i = null;
  
  m j;
  
  m k;
  
  JDialog l = null;
  
  ab m = null;
  
  public PInterfaceGolf(ab paramab) {
    this.m = paramab;
    this.b = T.SInterfaceAlpha().DComponentCharlie();
    q();
  }
  
  private void q() {
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BoxLayout(jPanel2, 0));
    jPanel1.add("North", jPanel2);
    jPanel2.add(this.SInterfaceEcho);
    jPanel2.add(new JLabel("  "));
    this.g.setEditable(false);
    this.SInterfaceEcho.setEnabled(false);
    this.f.setEnabled(false);
    jPanel2.add(SInterfaceAlpha(s.g.b("Trigger Name"), this.g, this.p));
    jPanel2.add(SInterfaceAlpha(s.g.b("Target Action"), this.f, this.q));
    j();
    this.SInterfaceEcho.addActionListener(new Timer(this));
    this.Timer.setLayout(new BoxLayout(this.Timer, 1));
    JPanel jPanel3 = new JPanel();
    this.Timer.add(jPanel3);
    jPanel3.setLayout(new BorderLayout());
    this.j = new m(this, this.b, false, b(this.r));
    this.j.setBorder(BorderFactory.createTitledBorder(s.g.b("Trigger Action When")));
    jPanel3.add("Center", this.j);
    cF cF = new cF(this.r, this.m);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("North", (Component)cF);
    jPanel3.add("East", jPanel4);
    JPanel jPanel5 = new JPanel();
    this.Timer.add(jPanel5);
    jPanel5.setLayout(new BorderLayout());
    this.k = new m(this, this.b, true, b(this.s));
    this.k.setBorder(BorderFactory.createTitledBorder(s.g.b("Reset Condition")));
    jPanel5.add("Center", this.k);
    cF = new cF(this.s, this.m);
    jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("North", (Component)cF);
    jPanel5.add("East", jPanel4);
    jPanel1.add("Center", this.Timer);
    add("Center", jPanel1);
    this.i = new JButton(b("Save"));
    this.i.addActionListener(new i(this));
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new FlowLayout(2));
    jPanel6.add(this.i);
    add("South", jPanel6);
    r();
  }
  
  private JPanel SInterfaceAlpha(String paramString1, JComponent paramJComponent, String paramString2) {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(paramString1 + ":");
    jLabel.setHorizontalAlignment(4);
    jLabel.setPreferredSize(eJ.SInterfaceAlpha(100, 20));
    jPanel1.add("West", jLabel);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(0));
    jPanel2.add(paramJComponent);
    jPanel1.add("Center", jPanel2);
    if (paramString2 != null && !paramString2.isEmpty()) {
      cF cF = new cF(paramString2, this.m);
      jPanel1.add("East", (Component)cF);
    } 
    return jPanel1;
  }
  
  private String b(String paramString) {
    return (this.m != null) ? this.m.SInterfaceAlpha(paramString) : paramString;
  }
  
  private void r() {
    if (this.SInterfaceEcho.isSelected()) {
      fp.SInterfaceAlpha((Component)this, true);
      this.j.b();
      this.k.b();
    } else {
      fp.SInterfaceAlpha((Component)this, false);
    } 
    this.SInterfaceEcho.setEnabled(true);
    this.i.setEnabled((this.DComponentCharlie != null));
  }
  
  public void close() {
    SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(this.b.DComponentCharlie(), this.DComponentCharlie.SInterfaceAlpha());
    if (this.SInterfaceEcho.isSelected())
      try {
        SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(this.b.DComponentCharlie(), (SInterfaceAlpha)this.DComponentCharlie);
      } catch (q q) {
        bV.d("No Configuration Found: " + this.b.DComponentCharlie(), this.SInterfaceEcho);
      }  
    super.close();
  }
  
  public void DComponentCharlie() {
    SInterfaceAlpha(SInterfaceEcho());
  }
  
  public void SInterfaceAlpha(Timer paramh) {
    String str = "";
    if (paramh.SInterfaceAlpha() == null || paramh.SInterfaceAlpha().trim().isEmpty())
      str = str + s.g.b("Name is required.") + "\\SInterfaceNovember"; 
    if (X.f(paramh.SInterfaceAlpha()) || paramh.SInterfaceAlpha().contains(" "))
      str = str + s.g.b("Name cannot contain special characters!") + "\\SInterfaceNovember"; 
    try {
      i.SInterfaceAlpha(paramh.d(), (GInterfaceAi)this.b);
    } catch (ExceptionInAxPackage u) {
      str = str + s.g.b("Invalid Trigger Expression") + ":" + this.j.SInterfaceAlpha() + "\\SInterfaceNovember";
      if (u.getMessage() != null && !u.getMessage().isEmpty())
        str = str + "     Err: " + s.g.b(u.getLocalizedMessage()) + "\\SInterfaceNovember"; 
    } 
    if (!paramh.f())
      try {
        i.SInterfaceAlpha(paramh.SInterfaceEcho(), (GInterfaceAi)this.b);
      } catch (ExceptionInAxPackage u) {
        str = str + s.g.b("Invalid Reset Expression") + ":" + this.k.SInterfaceAlpha() + "\\SInterfaceNovember";
        if (u.getMessage() != null && !u.getMessage().isEmpty())
          str = str + "     Err: " + s.g.b(u.getLocalizedMessage()) + "\\SInterfaceNovember"; 
      }  
    if (!str.isEmpty())
      throw new SInterfaceEcho(str); 
  }
  
  public void SInterfaceAlpha(f paramf) {
    this.d.add(paramf);
  }
  
  public boolean d() {
    for (f f : this.d) {
      if (!f.SInterfaceAlpha())
        return false; 
    } 
    return true;
  }
  
  public Timer SInterfaceEcho() {
    Timer Timer = new Timer();
    Timer.g(this.g.getText());
    Timer.SInterfaceAlpha(this.SInterfaceEcho.isSelected());
    Timer.SInterfaceEcho(this.j.SInterfaceAlpha());
    if (this.k.SInterfaceAlpha().contains(SInterfaceAlpha)) {
      int i = Integer.parseInt(X.b(this.k.SInterfaceAlpha(), SInterfaceAlpha, ""));
      Timer.SInterfaceAlpha(i * 1000);
    } else {
      Timer.f(this.k.SInterfaceAlpha());
    } 
    return Timer;
  }
  
  public SInterfaceNovember f() {
    DComponentCharlie();
    this.DComponentCharlie.g(this.g.getText());
    this.DComponentCharlie.SInterfaceAlpha(this.SInterfaceEcho.isSelected());
    this.DComponentCharlie.SInterfaceEcho(this.j.SInterfaceAlpha());
    this.DComponentCharlie.f(this.k.SInterfaceAlpha());
    if (this.k.SInterfaceAlpha().contains(SInterfaceAlpha)) {
      int i = Integer.parseInt(X.b(this.k.SInterfaceAlpha(), SInterfaceAlpha, ""));
      this.DComponentCharlie.SInterfaceAlpha(i * 1000);
    } else {
      this.DComponentCharlie.f(this.k.SInterfaceAlpha());
    } 
    this.DComponentCharlie.j(((l)this.f.getSelectedItem()).SInterfaceAlpha().SInterfaceAlpha());
    return this.DComponentCharlie;
  }
  
  void SInterfaceAlpha(SInterfaceNovember paramn) {
    paramn.g("TriggeredEvent");
    this.DComponentCharlie = paramn;
    this.g.setText(paramn.SInterfaceAlpha());
    this.g.setEditable(true);
    this.SInterfaceEcho.setEnabled(true);
    this.f.setEnabled(true);
    this.j.SInterfaceAlpha(paramn.d());
    this.k.SInterfaceAlpha(paramn.SInterfaceEcho());
    this.SInterfaceEcho.setSelected(paramn.DComponentCharlie());
    r();
    this.g.selectAll();
    this.g.requestFocus();
  }
  
  boolean g() {
    return this.g.isEditable();
  }
  
  void Timer() {
    this.DComponentCharlie = null;
    this.g.setEditable(false);
    this.g.setText("");
    this.SInterfaceEcho.setEnabled(false);
    this.f.setEnabled(false);
    this.j.SInterfaceAlpha("");
    this.k.SInterfaceAlpha("");
    r();
  }
  
  boolean i() {
    return (this.DComponentCharlie != null && (!this.DComponentCharlie.SInterfaceAlpha().equals(this.g.getText()) || !this.DComponentCharlie.d().equals(this.j.SInterfaceAlpha()) || !this.DComponentCharlie.SInterfaceEcho().equals(this.k.SInterfaceAlpha()) || !this.DComponentCharlie.i().equals(((l)this.f.getSelectedItem()).SInterfaceAlpha().SInterfaceAlpha()) || this.DComponentCharlie.DComponentCharlie() != this.SInterfaceEcho.isSelected()));
  }
  
  void b(SInterfaceNovember paramn) {
    this.DComponentCharlie = paramn;
    if (paramn != null) {
      this.g.setText(paramn.SInterfaceAlpha());
      this.g.setEditable(false);
      this.SInterfaceEcho.setEnabled(true);
      this.f.setEnabled(true);
      DComponentCharlie DComponentCharlie = d.g.SInterfaceAlpha().b(paramn.i());
      if (DComponentCharlie != null)
        for (byte b = 0; b < this.f.getItemCount(); b++) {
          l l = this.f.getItemAt(b);
          if (l != null && l.SInterfaceAlpha() != null && l.SInterfaceAlpha().SInterfaceAlpha().equals(DComponentCharlie.SInterfaceAlpha())) {
            this.f.setSelectedIndex(b);
            break;
          } 
        }  
      this.j.SInterfaceAlpha(paramn.d());
      if (paramn.f()) {
        m.SInterfaceAlpha(this.k, paramn.g() / 1000);
      } else {
        this.k.SInterfaceAlpha(paramn.SInterfaceEcho());
      } 
      this.SInterfaceEcho.setSelected(paramn.DComponentCharlie());
      r();
    } else {
      Timer();
    } 
  }
  
  public void j() {
    l l = (l)this.f.getSelectedItem();
    this.f.removeAllItems();
    List<?> list = d.g.SInterfaceAlpha().SInterfaceAlpha(new j(this));
    Collections.sort(list, new k(this));
    for (DComponentCharlie DComponentCharlie : list) {
      l l1 = new l(this, DComponentCharlie);
      this.f.addItem(l1);
    } 
    if (l != null)
      for (byte b = 0; b < this.f.getItemCount(); b++) {
        l l1 = this.f.getItemAt(b);
        if (l1.SInterfaceAlpha().SInterfaceAlpha().equals(l.SInterfaceAlpha().SInterfaceAlpha())) {
          this.f.setSelectedIndex(b);
          break;
        } 
      }  
  }
  
  void SInterfaceAlpha(boolean paramBoolean) {
    this.SInterfaceEcho.setSelected(paramBoolean);
    r();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */