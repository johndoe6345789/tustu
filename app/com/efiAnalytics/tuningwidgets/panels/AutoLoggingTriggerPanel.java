package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.aI;
import G.i;
import G.q;
import S.a;
import S.b;
import S.e;
import S.j;
import U.b;
import ax.U;
import bH.X;
import bt.bh;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import r.i;

public class AutoLoggingTriggerPanel extends bh implements bc {
  R a;
  
  j b;
  
  j c;
  
  static String d = b.a;
  
  static String e = b.b;
  
  static String f = b.c;
  
  static String g = b.d;
  
  static String h = b.e;
  
  static String i = b.f;
  
  JCheckBox j;
  
  JPanel k;
  
  k l;
  
  k m;
  
  JDialog p;
  
  static String q = "0";
  
  public g(R paramR) {
    String str1;
    this.a = null;
    this.j = new JCheckBox(s.g.b("Enabled"));
    this.k = new JPanel();
    this.p = null;
    this.a = paramR;
    this.b = b.a().a(paramR.c(), d);
    this.c = b.a().a(paramR.c(), e);
    d();
    if (paramR.g("TPS_Pct") != null) {
      str1 = "TPS_Pct > 80";
    } else if (paramR.g("tps") != null) {
      str1 = "tps > 80";
    } else {
      str1 = "";
    } 
    String str2 = X.b(this.b.d(), f, "");
    str2 = X.b(str2, "&& AppEvent.dataLogTime == 0", "");
    if (str2.equals(""))
      str2 = str1; 
    this.l.a(str2);
    boolean bool = i.a().a("sa0-0o0os-0o-0DS") ? true : true;
    String str3 = b.a(this.c, bool);
    this.m.a(str3);
  }
  
  private void d() {
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder(s.g.b("Automatic Logging Trigger")));
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("North", this.j);
    boolean bool = i.a().a("sa0-0o0os-0o-0DS");
    this.j.setSelected((bool || this.b.c()));
    this.j.setEnabled(!bool);
    this.j.addActionListener(new h(this));
    this.k.setLayout(new BoxLayout(this.k, 1));
    JPanel jPanel2 = new JPanel();
    this.k.add(jPanel2);
    jPanel2.setLayout(new BorderLayout());
    this.l = new k(this, this.a, false, true);
    this.l.setBorder(BorderFactory.createTitledBorder(s.g.b("Start Logging When")));
    jPanel2.add("Center", this.l);
    JPanel jPanel3 = new JPanel();
    this.k.add(jPanel3);
    jPanel3.setLayout(new BorderLayout());
    this.m = new k(this, this.a, true, !i.a().a("sa0-0o0os-0o-0DS"));
    this.m.setBorder(BorderFactory.createTitledBorder(s.g.b("Stop Logging When")));
    jPanel3.add("Center", this.m);
    jPanel1.add("Center", this.k);
    add("Center", jPanel1);
    e();
  }
  
  private void e() {
    fp.a(this.k, this.j.isSelected());
    if (this.j.isSelected()) {
      this.l.b();
      this.m.b();
    } 
  }
  
  public void close() {
    e.a().a(this.a.c(), this.b.a());
    e.a().a(this.a.c(), this.c.a());
    if (this.j.isSelected())
      try {
        e.a().a(this.a.c(), (a)this.b);
        e.a().a(this.a.c(), (a)this.c);
      } catch (q q) {
        bV.d("No Configuration Found: " + this.a.c(), this.j);
      }  
    super.close();
  }
  
  public boolean c() {
    try {
      i.a(this.l.a(), (aI)this.a);
    } catch (U u) {
      bV.d(s.g.b("Invalid Start Logging Expression") + ":" + this.l.a(), (Component)this);
      return false;
    } 
    try {
      i.a(this.m.a(), (aI)this.a);
    } catch (U u) {
      bV.d(s.g.b("Invalid Stop Logging Expression") + ":" + this.m.a(), (Component)this);
      return false;
    } 
    return true;
  }
  
  private void f() {
    this.b.e(this.l.a() + f);
    this.c.e(this.m.a() + g);
    this.b.f(h);
    this.c.f(i);
  }
  
  public void a(Component paramComponent) {
    this.p = new JDialog(bV.a(paramComponent), s.g.b("Triggered Logging"));
    this.p.add("Center", (Component)this);
    JButton jButton1 = new JButton(s.g.b("Cancel"));
    jButton1.addActionListener(new i(this));
    JButton jButton2 = new JButton(s.g.b("Accept"));
    jButton2.addActionListener(new j(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.d()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } 
    this.p.add("South", jPanel);
    this.p.pack();
    bV.a(bV.a(paramComponent), this.p);
    this.p.setVisible(true);
    validate();
    this.p.pack();
    this.p.setResizable(false);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */