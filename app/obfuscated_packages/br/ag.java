package br;

import G.R;
import G.aH;
import G.aI;
import G.be;
import G.bv;
import G.de;
import G.df;
import G.dm;
import G.i;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import aE.ExceptionInVPackage;
import ax.ExceptionInAxPackage;
import bH.D;
import bH.p;
import bt.bQ;
import bt.bh;
import com.efiAnalytics.ui.b;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.fp;
import com.efiAnalytics.ui.s;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.ExceptionPrintstacktrace;

public class ag extends JPanel {
  n ExceptionInVPackage = null;
  
  c b = null;
  
  bh c = null;
  
  dQ d = null;
  
  de e;
  
  df f;
  
  R ExceptionPrintstacktrace;
  
  String h;
  
  JLabel i = new JLabel();
  
  JComboBox j = new JComboBox();
  
  JComboBox k = new JComboBox();
  
  JComboBox l = new JComboBox();
  
  JCheckBox m = new JCheckBox(ExceptionPrintstacktrace.b("Deactivate"));
  
  public ag(R paramR, de paramde, String paramString, c paramc) {
    this.ExceptionPrintstacktrace = paramR;
    this.e = paramde;
    this.h = paramString;
    this.f = paramde.ExceptionInVPackage(paramString);
    this.d = new dQ((Properties)ExceptionInVPackage.A(), "TrimTablePanel_" + paramString);
    this.c = new bh();
    setLayout(new BorderLayout());
    add((Component)this.c, "Center");
    this.ExceptionInVPackage = r.ExceptionInVPackage().ExceptionInVPackage(paramR, (dm)paramde, paramString, paramc);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(0));
    add(jPanel, "North");
    jPanel.add(this.i);
    Iterator iterator = paramde.l();
    while (iterator.hasNext())
      this.j.addItem(iterator.next()); 
    iterator = paramde.m();
    while (iterator.hasNext())
      this.k.addItem(iterator.next()); 
    iterator = paramde.u();
    while (iterator.hasNext())
      this.l.addItem(iterator.next()); 
    if (this.f.f() != null && !this.f.f().trim().isEmpty()) {
      jPanel.add(new JLabel("       "));
      jPanel.add(new JLabel(ExceptionPrintstacktrace.b("EGO Sensor:")));
      jPanel.add(this.l);
      jPanel.add(new JLabel("       "));
    } else {
      jPanel.add(new JLabel(ExceptionPrintstacktrace.b("AFR:")));
      jPanel.add(this.j);
      jPanel.add(new JLabel(ExceptionPrintstacktrace.b("EGO Corr:")));
      jPanel.add(this.k);
    } 
    jPanel.add(this.m);
    boolean bool = Boolean.parseBoolean(this.d.b("deactivated", "false"));
    this.m.setSelected(bool);
    this.m.addActionListener(new ah(this));
    try {
      String str = this.d.ExceptionInVPackage("egoCorChannel");
      if (str != null) {
        this.k.setSelectedItem(str);
      } else {
        D.c("Invalid EGO Correction Channle, using first");
        this.k.setSelectedIndex(0);
      } 
    } catch (Exception exception) {
      bV.d("Invalid Lambda Sensor Index, setting first", (Component)this.c);
    } 
    try {
      String str = this.d.ExceptionInVPackage("lambdaChannel");
      if (str != null) {
        this.j.setSelectedItem(str);
      } else {
        D.c("Invalid Lambda Channel, using first");
        this.j.setSelectedIndex(0);
      } 
    } catch (Exception exception) {
      bV.d("Invalid Lambda Sensor Index, setting first", (Component)this.c);
    } 
    this.l.addActionListener(new ai(this));
    this.j.addActionListener(new aj(this));
    this.k.addActionListener(new ak(this));
    ExceptionInVPackage(this.f);
  }
  
  private void ExceptionInVPackage(df paramdf) {
    be be = (be)this.ExceptionPrintstacktrace.e().c(paramdf.b());
    be = be.j();
    be.ExceptionInVPackage(true);
    this.i.setText(ExceptionPrintstacktrace.b(paramdf.e()));
    be.h("veAnalyze_");
    be.u(paramdf.ExceptionInVPackage());
    try {
      s s = bQ.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionPrintstacktrace, be.aL(), be.l(), be.aL());
      s.c(1);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to get Table Model for " + be.aL() + " with prefix:" + be.l());
      ExceptionPrintstacktrace.printStackTrace();
    } 
    this.c.ExceptionInVPackage(this.ExceptionPrintstacktrace, (bv)be);
    this.c.c_(paramdf.ExceptionInVPackage());
    if (paramdf.f() != null && !paramdf.f().trim().isEmpty()) {
      boolean bool;
      try {
        bool = (int)Math.round(i.ExceptionInVPackage(paramdf.f(), (aI)this.ExceptionPrintstacktrace));
      } catch (ExceptionInAxPackage u) {
        Logger.getLogger(ag.class.getName()).log(Level.SEVERE, (String)null, (Throwable)u);
        bool = false;
      } 
      String str = this.d.b("egoSensorIndex", bool + "");
      try {
        this.l.setSelectedIndex(Integer.parseInt(str));
      } catch (NumberFormatException numberFormatException) {
        bV.d(paramdf.e() + ": Error retrieving Sensor Index", this);
        this.l.setSelectedIndex(0);
      } 
    } else {
      String str1 = this.d.b("lambdaChannel", paramdf.c());
      this.j.setSelectedItem(str1);
      String str2 = this.d.b("egoCorChannel", paramdf.d());
      this.k.setSelectedItem(str2);
    } 
  }
  
  public void ExceptionInVPackage() {
    try {
      s s = bQ.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionPrintstacktrace, this.h, "veAnalyze_", this.h);
      b[][] arrayOfB = s.D();
      s = bQ.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionPrintstacktrace, this.h, "", this.h);
      for (byte b = 0; b < s.getRowCount(); b++) {
        for (byte b1 = 0; b1 < s.getColumnCount(); b1++)
          s.setValueAt(arrayOfB[arrayOfB.length - b - 1][b1].i(), b, b1); 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Unable to get Table Model for " + this.h + " with prefix:" + "veAnalyze_");
      ExceptionPrintstacktrace.printStackTrace();
    } 
  }
  
  public void b() {
    if (this.m.isSelected()) {
      fp.ExceptionInVPackage((Component)this.c, false);
      if (this.ExceptionInVPackage.b())
        try {
          ExceptionInVPackage(false);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(ag.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
        }  
    } else {
      this.c.ExceptionInVPackage();
      if (this.c.isEnabled())
        fp.ExceptionInVPackage((Component)this.c, true); 
    } 
  }
  
  public boolean c() {
    boolean bool = true;
    try {
      bool = (this.f.ExceptionInVPackage() == null || p.ExceptionInVPackage(this.f.ExceptionInVPackage(), this.ExceptionPrintstacktrace)) ? true : false;
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(ag.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    return (!this.m.isSelected() && bool);
  }
  
  public boolean d() {
    try {
      s s1 = bQ.ExceptionInVPackage().b(this.ExceptionPrintstacktrace, this.h, "");
      s s2 = bQ.ExceptionInVPackage().b(this.ExceptionPrintstacktrace, this.h, "veAnalyze_");
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
      D.ExceptionInVPackage("Unable to get Table Model for " + this.h + " with prefix:" + "veAnalyze_");
      exception.printStackTrace();
    } 
    return false;
  }
  
  protected void ExceptionInVPackage(boolean paramBoolean) {
    boolean bool = true;
    try {
      bool = (i.ExceptionInVPackage(this.f.ExceptionInVPackage(), (aI)this.ExceptionPrintstacktrace) != 0.0D) ? true : false;
    } catch (ExceptionInAxPackage u) {}
    if (bool && paramBoolean && !this.m.isSelected()) {
      this.ExceptionInVPackage.c();
    } else {
      this.ExceptionInVPackage.e();
    } 
  }
  
  public void e() {
    this.ExceptionInVPackage.close();
  }
  
  public void f() {
    this.ExceptionInVPackage.ExceptionInVPackage();
  }
  
  public void ExceptionInVPackage(aH paramaH) {
    this.ExceptionInVPackage.ExceptionInVPackage(paramaH);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */