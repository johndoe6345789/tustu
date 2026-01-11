package com.efiAnalytics.tunerStudio.panels;

import G.cd;
import W.aB;
import W.n;
import aE.a;
import bA.c;
import bH.X;
import bt.j;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cn;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import r.a;
import r.j;
import s.g;

class IgnitionLoggerControlPanel extends JPanel {
  JButton a = null;
  
  JButton b = null;
  
  JButton c = null;
  
  JButton d = null;
  
  JButton e = null;
  
  JButton f = null;
  
  JComboBox g = new JComboBox();
  
  JComboBox h = new JComboBox();
  
  cn i = new cn();
  
  JCheckBox j = null;
  
  TriggerLoggerPanel k;
  
  public o(TriggerLoggerPanel paramTriggerLoggerPanel) {
    this.k = paramTriggerLoggerPanel;
    setBorder(BorderFactory.createTitledBorder(g.b("Ignition Logger Controls")));
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout());
    String str = g.b("Attention!! For a typical continuous Data Log, use the Data Logging menu or the Graphing & Logging tab when available. This tab is for Specialty High Speed Loggers such as trigger wheel, ignition and pin states. Logging is performed using a series of snapshots as the events occur too fast to log in a continuous fashion.");
    j j = new j(str);
    jPanel1.add((Component)j);
    jPanel1.add(new JLabel(g.b("Logger Type:")));
    jPanel1.add(this.g);
    this.g.addActionListener(new p(this));
    this.a = new JButton(g.b("Start"));
    this.a.addActionListener(new u(this));
    jPanel1.add(this.a);
    this.b = new JButton(g.b("Stop"));
    this.b.addActionListener(new v(this));
    jPanel1.add(this.b);
    this.c = new JButton(g.b("Clear"));
    this.c.addActionListener(new w(this));
    jPanel1.add(this.c);
    this.h.addItem("250 ms");
    this.h.addItem("500 ms");
    this.h.addItem("750 ms");
    this.h.addItem("1000 ms");
    this.h.addItem("2000 ms");
    this.h.addItem("3000 ms");
    this.h.addItem("4000 ms");
    this.h.setSelectedItem("1000 ms");
    this.h.addActionListener(new x(this));
    jPanel1.add(this.h);
    if (paramTriggerLoggerPanel.j()) {
      if (!TriggerLoggerPanel.Q) {
        this.e = new JButton(g.b("Options"));
        jPanel1.add(this.e);
        this.e.addActionListener(new y(this));
      } 
      this.f = new JButton(g.b("File"));
      jPanel1.add(this.f);
      this.f.addActionListener(new z(this));
    } 
    add("West", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    this.j = new JCheckBox(g.b("Capture to log file:") + "  ");
    jPanel2.add("West", this.j);
    this.j.addActionListener(new A(this));
    jPanel2.add("Center", (Component)this.i);
    add("Center", jPanel2);
  }
  
  public void a() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    if (this.k.j()) {
      JMenuItem jMenuItem = jPopupMenu.add(g.b("Open Log File"));
      jMenuItem.addActionListener(new B(this));
    } 
    if (this.k.l()) {
      JMenuItem jMenuItem = jPopupMenu.add(g.b("Save Current Data to Log"));
      jMenuItem.addActionListener(new q(this));
    } 
    jPopupMenu.show(this.f, 0, this.f.getHeight());
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      String[] arrayOfString = { a.ct };
      String str1 = X.a() + "." + a.ct;
      a a = a.A();
      if (a == null || a.q() == null) {
        bV.d(g.b("There is no project open.\nPlease open a project first."), getParent());
        return;
      } 
      String str2 = a.q();
      str1 = bV.a(getParent(), g.b("Set Ignition Logger File"), arrayOfString, str1, str2);
      if (str1 == null || str1.equals("")) {
        this.j.setSelected(false);
        this.i.setText("");
        return;
      } 
      if (!str1.toLowerCase().endsWith(a.ct))
        str1 = str1 + "." + a.ct; 
      File file = new File(str1);
      if (file.exists()) {
        boolean bool = bV.a(g.b("The selected file already exists.") + "\n" + g.b("Would you like to over write:") + "\n" + str1, this, true);
        if (!bool)
          return; 
      } 
      c();
      this.i.a(str1);
    } else {
      this.i.a("");
      this.k.g();
    } 
  }
  
  protected void b() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    c c = new c(g.b("Render Including Non Interrupt Data"), true, this.k.m());
    jPopupMenu.add((JMenuItem)c);
    c.addActionListener(new r(this));
    jPopupMenu.show(this.e, 0, this.e.getHeight());
  }
  
  public void c() {
    this.k.k();
    this.i.a("");
    this.k.g();
  }
  
  public void d() {
    try {
      ai ai = this.k.n();
      if (ai == null || ai.isEmpty()) {
        bV.d(g.b("No data loaded or captured to save!"), this);
        return;
      } 
      String[] arrayOfString = { a.ct };
      String str1 = X.a() + "." + a.ct;
      a a = a.A();
      if (a == null || a.q() == null) {
        bV.d(g.b("There is no project open.\nPlease open a project first."), getParent());
        return;
      } 
      String str2 = a.q();
      str1 = bV.a(getParent(), g.b("Save log data"), arrayOfString, str1, str2);
      if (str1 == null || str1.equals("")) {
        this.j.setSelected(false);
        this.i.setText("");
        return;
      } 
      if (!str1.toLowerCase().endsWith(a.ct))
        str1 = str1 + "." + a.ct; 
      File file = new File(str1);
      if (file.exists()) {
        boolean bool = bV.a(g.b("The selected file already exists.") + "\n" + g.b("Would you like to over write:") + "\n" + str1, this, true);
        if (!bool)
          return; 
      } 
      byte b = 0;
      n n = (n)ai.get(b);
      W.o o1 = W.o.a(n, str1, ",");
      while (true) {
        n = (n)ai.get(b++);
        o1.a(n);
        if (b >= ai.size()) {
          o1.a();
          this.i.a(str1);
          return;
        } 
      } 
    } catch (IOException iOException) {
      bV.d(g.b("Failed to save Log Data") + "\n" + iOException.getMessage(), this);
      Logger.getLogger(o.class.getName()).log(Level.SEVERE, "Failed to save log data.", iOException);
    } 
  }
  
  public void e() {
    String[] arrayOfString = { a.ct };
    a a = a.A();
    String str1 = j.u();
    if (a != null && a.q() != null)
      str1 = a.q(); 
    String str2 = bV.b(getParent(), g.b("Open Ignition Log File"), arrayOfString, "", str1);
    if (str2 == null || str2.equals(""))
      return; 
    this.j.setSelected(false);
    a(str2);
  }
  
  public void a(String paramString) {
    aB aB = new aB();
    aB.a(new C(this));
    File file = new File(paramString);
    if (!file.exists()) {
      bV.d(g.b("Ignition Log File not found:") + "\n" + paramString, this);
      return;
    } 
    s s = new s(this, aB, file, paramString);
    s.start();
  }
  
  public boolean f() {
    return (this.j.isSelected() && this.i.getText().length() > 0);
  }
  
  public void g() {
    E e = (E)this.g.getSelectedItem();
    if (e == null || e.a() == null)
      return; 
    this.k.a(e.a());
    cd cd = e.a();
    if ((cd.e() != null && cd.e().trim().length() > 0) || cd.n().equals("UDP_Stream")) {
      this.h.setEnabled(false);
    } else {
      this.h.setEnabled(true);
    } 
    if (this.e != null)
      if (cd != null && (cd.d().equals(cd.a) || cd.d().equals(cd.e) || cd.d().equals(cd.g) || cd.d().equals(cd.f) || cd.d().equals(cd.h))) {
        this.e.setVisible(true);
      } else {
        this.e.setVisible(false);
      }  
    this.k.h();
  }
  
  public ArrayList h() {
    ArrayList<cd> arrayList = new ArrayList();
    for (byte b = 0; b < this.g.getItemCount(); b++) {
      if (this.g.getItemAt(b) instanceof E) {
        E e = this.g.getItemAt(b);
        arrayList.add(e.a());
      } 
    } 
    return arrayList;
  }
  
  public void a(ArrayList<cd> paramArrayList) {
    this.g.removeAllItems();
    for (byte b = 0; b < paramArrayList.size(); b++)
      this.g.addItem(new E(this, paramArrayList.get(b))); 
  }
  
  public void b(boolean paramBoolean) {
    this.a.setEnabled(!paramBoolean);
    this.b.setEnabled(paramBoolean);
  }
  
  public void i() {
    t t = new t(this);
    t.start();
  }
  
  public cd j() {
    E e = (E)this.g.getSelectedItem();
    return (e == null) ? null : e.a();
  }
  
  protected void k() {
    String str = (String)this.h.getSelectedItem();
    str = X.b(str, " ms", "");
    this.k.a(Integer.parseInt(str));
  }
  
  public void l() {
    this.k.f();
  }
  
  String m() {
    return this.i.a();
  }
  
  public void n() {
    this.j.setSelected(false);
    this.i.a("");
    this.k.g();
  }
  
  public void a(int paramInt) {
    this.h.setSelectedItem(paramInt + " ms");
    k();
  }
  
  public void b(String paramString) {
    for (byte b = 0; b < this.g.getItemCount(); b++) {
      Object object = this.g.getItemAt(b);
      if (object.toString().equals(paramString))
        this.g.setSelectedIndex(b); 
    } 
  }
  
  public int o() {
    String str = (String)this.h.getSelectedItem();
    return Integer.parseInt(X.b(str, " ms", ""));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */