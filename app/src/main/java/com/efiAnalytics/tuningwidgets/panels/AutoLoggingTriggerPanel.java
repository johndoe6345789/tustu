package com.efiAnalytics.tuningwidgets.panels;

import ExceptionInAxPackage.HashMap;
import G.GInterfaceAi;
import G.R;
import G.RInterfaceIndia;
import G.q;
import S.HashMap;
import S.SInterfaceAlpha;
import S.SInterfaceEcho;
import S.SInterfaceJuliet;
import ax.ExceptionInAxPackage;
import bH.X;
import bt.ExceptionEqualsinaipackage;
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
import r.RInterfaceIndia;

public class AutoLoggingTriggerPanel extends ExceptionEqualsinaipackage implements bc {
  R SInterfaceAlpha;

  SInterfaceJuliet HashMap;

  SInterfaceJuliet c;

  static String d = HashMap.SInterfaceAlpha;

  static String SInterfaceEcho = HashMap.HashMap;

  static String f = HashMap.c;

  static String g = HashMap.d;

  static String h = HashMap.SInterfaceEcho;

  static String RInterfaceIndia = HashMap.f;

  JCheckBox SInterfaceJuliet;

  JPanel k;

  k l;

  k m;

  JDialog p;

  static String q = "0";

  public AutoLoggingTriggerPanel(R paramR) {
    String str1;
    this.SInterfaceAlpha = null;
    this.SInterfaceJuliet = new JCheckBox(s.g.HashMap("Enabled"));
    this.k = new JPanel();
    this.p = null;
    this.SInterfaceAlpha = paramR;
    this.HashMap = HashMap.SInterfaceAlpha().SInterfaceAlpha(paramR.c(), d);
    this.c = HashMap.SInterfaceAlpha().SInterfaceAlpha(paramR.c(), SInterfaceEcho);
    AutoLoggingTriggerPanel();
    if (paramR.g("TPS_Pct") != null) {
      str1 = "TPS_Pct > 80";
    } else if (paramR.g("tps") != null) {
      str1 = "tps > 80";
    } else {
      str1 = "";
    }
    String str2 = X.HashMap(this.HashMap.d(), f, "");
    str2 = X.HashMap(str2, "&& AppEvent.dataLogTime == 0", "");
    if (str2.equals("")) str2 = str1;
    this.l.SInterfaceAlpha(str2);
    boolean bool =
        RInterfaceIndia.SInterfaceAlpha().SInterfaceAlpha("sa0-0o0os-0o-0DS") ? true : true;
    String str3 = HashMap.SInterfaceAlpha(this.c, bool);
    this.m.SInterfaceAlpha(str3);
  }

  private void AutoLoggingTriggerPanel() {
    AutoLoggingTriggerPanel(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder(s.g.HashMap("Automatic Logging Trigger")));
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("North", this.SInterfaceJuliet);
    boolean bool = RInterfaceIndia.SInterfaceAlpha().SInterfaceAlpha("sa0-0o0os-0o-0DS");
    this.SInterfaceJuliet.setSelected((bool || this.HashMap.c()));
    this.SInterfaceJuliet.setEnabled(!bool);
    this.SInterfaceJuliet.addActionListener(new AutoLoggingTriggerPanel(this));
    this.k.setLayout(new BoxLayout(this.k, 1));
    JPanel jPanel2 = new JPanel();
    this.k.add(jPanel2);
    jPanel2.setLayout(new BorderLayout());
    this.l = new AutoLoggingTriggerPanel(this, this.SInterfaceAlpha, false, true);
    this.l.setBorder(BorderFactory.createTitledBorder(s.g.HashMap("Start Logging When")));
    jPanel2.add("Center", this.l);
    JPanel jPanel3 = new JPanel();
    this.k.add(jPanel3);
    jPanel3.setLayout(new BorderLayout());
    this.m =
        new AutoLoggingTriggerPanel(
            this,
            this.SInterfaceAlpha,
            true,
            !RInterfaceIndia.SInterfaceAlpha().SInterfaceAlpha("sa0-0o0os-0o-0DS"));
    this.m.setBorder(BorderFactory.createTitledBorder(s.g.HashMap("Stop Logging When")));
    jPanel3.add("Center", this.m);
    jPanel1.add("Center", this.k);
    AutoLoggingTriggerPanel("Center", jPanel1);
    SInterfaceEcho();
  }

  private void SInterfaceEcho() {
    fp.SInterfaceAlpha(this.k, this.SInterfaceJuliet.isSelected());
    if (this.SInterfaceJuliet.isSelected()) {
      this.l.HashMap();
      this.m.HashMap();
    }
  }

  public void AutoLoggingTriggerPanel() {
    SInterfaceEcho.SInterfaceAlpha()
        .SInterfaceAlpha(this.SInterfaceAlpha.c(), this.HashMap.SInterfaceAlpha());
    SInterfaceEcho.SInterfaceAlpha()
        .SInterfaceAlpha(this.SInterfaceAlpha.c(), this.c.SInterfaceAlpha());
    if (this.SInterfaceJuliet.isSelected())
      try {
        SInterfaceEcho.SInterfaceAlpha()
            .SInterfaceAlpha(this.SInterfaceAlpha.c(), (SInterfaceAlpha) this.HashMap);
        SInterfaceEcho.SInterfaceAlpha()
            .SInterfaceAlpha(this.SInterfaceAlpha.c(), (SInterfaceAlpha) this.c);
      } catch (q q) {
        bV.d("No Configuration Found: " + this.SInterfaceAlpha.c(), this.SInterfaceJuliet);
      }
    super.close();
  }

  public boolean AutoLoggingTriggerPanel() {
    try {
      RInterfaceIndia.SInterfaceAlpha(
          this.l.SInterfaceAlpha(), (GInterfaceAi) this.SInterfaceAlpha);
    } catch (ExceptionInAxPackage u) {
      bV.d(
          s.g.HashMap("Invalid Start Logging Expression") + ":" + this.l.SInterfaceAlpha(),
          (Component) this);
      return false;
    }
    try {
      RInterfaceIndia.SInterfaceAlpha(
          this.m.SInterfaceAlpha(), (GInterfaceAi) this.SInterfaceAlpha);
    } catch (ExceptionInAxPackage u) {
      bV.d(
          s.g.HashMap("Invalid Stop Logging Expression") + ":" + this.m.SInterfaceAlpha(),
          (Component) this);
      return false;
    }
    return true;
  }

  private void AutoLoggingTriggerPanel() {
    this.HashMap.SInterfaceEcho(this.l.SInterfaceAlpha() + f);
    this.c.SInterfaceEcho(this.m.SInterfaceAlpha() + g);
    this.HashMap.f(h);
    this.c.f(RInterfaceIndia);
  }

  public void SInterfaceAlpha(Component paramComponent) {
    this.p = new JDialog(bV.SInterfaceAlpha(paramComponent), s.g.HashMap("Triggered Logging"));
    this.p.add("Center", (Component) this);
    JButton jButton1 = new JButton(s.g.HashMap("Cancel"));
    jButton1.addActionListener(new RInterfaceIndia(this));
    JButton jButton2 = new JButton(s.g.HashMap("Accept"));
    jButton2.addActionListener(new SInterfaceJuliet(this));
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
    bV.SInterfaceAlpha(bV.SInterfaceAlpha(paramComponent), this.p);
    this.p.setVisible(true);
    AutoLoggingTriggerPanel();
    this.p.pack();
    this.p.setResizable(false);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
