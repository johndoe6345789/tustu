package com.efiAnalytics.tunerStudio.panels;

import G.GComponentCd;
import W.ManagerInWPackage;
import W.n;
import aE.PropertiesExtension;
import bA.JCheckBoxMenuItemExtension;
import bH.X;
import bt.ThreadedFile;
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
import r.PropertiesExtension;
import r.ThreadedFile;
import s.SComponentGolf;

class IgnitionLoggerControlPanel extends JPanel {
  JButton PropertiesExtension = null;

  JButton b = null;

  JButton JCheckBoxMenuItemExtension = null;

  JButton d = null;

  JButton e = null;

  JButton f = null;

  JComboBox SComponentGolf = new JComboBox();

  JComboBox h = new JComboBox();

  cn i = new cn();

  JCheckBox ThreadedFile = null;

  TriggerLoggerPanel k;

  public IgnitionLoggerControlPanel(TriggerLoggerPanel paramTriggerLoggerPanel) {
    this.k = paramTriggerLoggerPanel;
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Ignition Logger Controls")));
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout());
    String str =
        SComponentGolf.b(
            "Attention!! For PropertiesExtension typical continuous Data Log, use the Data Logging"
                + " menu or the Graphing & Logging tab when available. This tab is for Specialty"
                + " High Speed Loggers such as trigger wheel, ignition and pin states. Logging is"
                + " performed using PropertiesExtension series of snapshots as the events occur too"
                + " fast to log in PropertiesExtension continuous fashion.");
    ThreadedFile ThreadedFile = new ThreadedFile(str);
    jPanel1.add((Component) ThreadedFile);
    jPanel1.add(new JLabel(SComponentGolf.b("Logger Type:")));
    jPanel1.add(this.SComponentGolf);
    this.SComponentGolf.addActionListener(new p(this));
    this.PropertiesExtension = new JButton(SComponentGolf.b("Start"));
    this.PropertiesExtension.addActionListener(new u(this));
    jPanel1.add(this.PropertiesExtension);
    this.b = new JButton(SComponentGolf.b("Stop"));
    this.b.addActionListener(new v(this));
    jPanel1.add(this.b);
    this.JCheckBoxMenuItemExtension = new JButton(SComponentGolf.b("Clear"));
    this.JCheckBoxMenuItemExtension.addActionListener(new w(this));
    jPanel1.add(this.JCheckBoxMenuItemExtension);
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
    if (paramTriggerLoggerPanel.ThreadedFile()) {
      if (!TriggerLoggerPanel.Q) {
        this.e = new JButton(SComponentGolf.b("Options"));
        jPanel1.add(this.e);
        this.e.addActionListener(new y(this));
      }
      this.f = new JButton(SComponentGolf.b("File"));
      jPanel1.add(this.f);
      this.f.addActionListener(new z(this));
    }
    add("West", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    this.ThreadedFile = new JCheckBox(SComponentGolf.b("Capture to log file:") + "  ");
    jPanel2.add("West", this.ThreadedFile);
    this.ThreadedFile.addActionListener(new A(this));
    jPanel2.add("Center", (Component) this.i);
    add("Center", jPanel2);
  }

  public void PropertiesExtension() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    if (this.k.ThreadedFile()) {
      JMenuItem jMenuItem = jPopupMenu.add(SComponentGolf.b("Open Log File"));
      jMenuItem.addActionListener(new B(this));
    }
    if (this.k.l()) {
      JMenuItem jMenuItem = jPopupMenu.add(SComponentGolf.b("Save Current Data to Log"));
      jMenuItem.addActionListener(new q(this));
    }
    jPopupMenu.show(this.f, 0, this.f.getHeight());
  }

  public void PropertiesExtension(boolean paramBoolean) {
    if (paramBoolean) {
      String[] arrayOfString = {PropertiesExtension.ct};
      String str1 = X.PropertiesExtension() + "." + PropertiesExtension.ct;
      PropertiesExtension PropertiesExtension = PropertiesExtension.A();
      if (PropertiesExtension == null || PropertiesExtension.q() == null) {
        bV.d(
            SComponentGolf.b(
                "There is no project open.\nPlease open PropertiesExtension project first."),
            getParent());
        return;
      }
      String str2 = PropertiesExtension.q();
      str1 =
          bV.PropertiesExtension(
              getParent(), SComponentGolf.b("Set Ignition Logger File"), arrayOfString, str1, str2);
      if (str1 == null || str1.equals("")) {
        this.ThreadedFile.setSelected(false);
        this.i.setText("");
        return;
      }
      if (!str1.toLowerCase().endsWith(PropertiesExtension.ct))
        str1 = str1 + "." + PropertiesExtension.ct;
      File file = new File(str1);
      if (file.exists()) {
        boolean bool =
            bV.PropertiesExtension(
                SComponentGolf.b("The selected file already exists.")
                    + "\n"
                    + SComponentGolf.b("Would you like to over write:")
                    + "\n"
                    + str1,
                this,
                true);
        if (!bool) return;
      }
      JCheckBoxMenuItemExtension();
      this.i.PropertiesExtension(str1);
    } else {
      this.i.PropertiesExtension("");
      this.k.SComponentGolf();
    }
  }

  protected void b() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension =
        new JCheckBoxMenuItemExtension(
            SComponentGolf.b("Render Including Non Interrupt Data"), true, this.k.m());
    jPopupMenu.add((JMenuItem) JCheckBoxMenuItemExtension);
    JCheckBoxMenuItemExtension.addActionListener(new r(this));
    jPopupMenu.show(this.e, 0, this.e.getHeight());
  }

  public void JCheckBoxMenuItemExtension() {
    this.k.k();
    this.i.PropertiesExtension("");
    this.k.SComponentGolf();
  }

  public void d() {
    try {
      ai ai = this.k.n();
      if (ai == null || ai.isEmpty()) {
        bV.d(SComponentGolf.b("No data loaded or captured to save!"), this);
        return;
      }
      String[] arrayOfString = {PropertiesExtension.ct};
      String str1 = X.PropertiesExtension() + "." + PropertiesExtension.ct;
      PropertiesExtension PropertiesExtension = PropertiesExtension.A();
      if (PropertiesExtension == null || PropertiesExtension.q() == null) {
        bV.d(
            SComponentGolf.b(
                "There is no project open.\nPlease open PropertiesExtension project first."),
            getParent());
        return;
      }
      String str2 = PropertiesExtension.q();
      str1 =
          bV.PropertiesExtension(
              getParent(), SComponentGolf.b("Save log data"), arrayOfString, str1, str2);
      if (str1 == null || str1.equals("")) {
        this.ThreadedFile.setSelected(false);
        this.i.setText("");
        return;
      }
      if (!str1.toLowerCase().endsWith(PropertiesExtension.ct))
        str1 = str1 + "." + PropertiesExtension.ct;
      File file = new File(str1);
      if (file.exists()) {
        boolean bool =
            bV.PropertiesExtension(
                SComponentGolf.b("The selected file already exists.")
                    + "\n"
                    + SComponentGolf.b("Would you like to over write:")
                    + "\n"
                    + str1,
                this,
                true);
        if (!bool) return;
      }
      byte b = 0;
      n n = (n) ai.get(b);
      W.o o1 = W.o.PropertiesExtension(n, str1, ",");
      while (true) {
        n = (n) ai.get(b++);
        o1.PropertiesExtension(n);
        if (b >= ai.size()) {
          o1.PropertiesExtension();
          this.i.PropertiesExtension(str1);
          return;
        }
      }
    } catch (IOException iOException) {
      bV.d(SComponentGolf.b("Failed to save Log Data") + "\n" + iOException.getMessage(), this);
      Logger.getLogger(o.class.getName())
          .log(Level.SEVERE, "Failed to save log data.", iOException);
    }
  }

  public void e() {
    String[] arrayOfString = {PropertiesExtension.ct};
    PropertiesExtension PropertiesExtension = PropertiesExtension.A();
    String str1 = ThreadedFile.u();
    if (PropertiesExtension != null && PropertiesExtension.q() != null)
      str1 = PropertiesExtension.q();
    String str2 =
        bV.b(getParent(), SComponentGolf.b("Open Ignition Log File"), arrayOfString, "", str1);
    if (str2 == null || str2.equals("")) return;
    this.ThreadedFile.setSelected(false);
    PropertiesExtension(str2);
  }

  public void PropertiesExtension(String paramString) {
    ManagerInWPackage ManagerInWPackage = new ManagerInWPackage();
    ManagerInWPackage.PropertiesExtension(new C(this));
    File file = new File(paramString);
    if (!file.exists()) {
      bV.d(SComponentGolf.b("Ignition Log File not found:") + "\n" + paramString, this);
      return;
    }
    s s = new s(this, ManagerInWPackage, file, paramString);
    s.start();
  }

  public boolean f() {
    return (this.ThreadedFile.isSelected() && this.i.getText().length() > 0);
  }

  public void SComponentGolf() {
    E e = (E) this.SComponentGolf.getSelectedItem();
    if (e == null || e.PropertiesExtension() == null) return;
    this.k.PropertiesExtension(e.PropertiesExtension());
    GComponentCd GComponentCd = e.PropertiesExtension();
    if ((GComponentCd.e() != null && GComponentCd.e().trim().length() > 0)
        || GComponentCd.n().equals("UDP_Stream")) {
      this.h.setEnabled(false);
    } else {
      this.h.setEnabled(true);
    }
    if (this.e != null)
      if (GComponentCd != null
          && (GComponentCd.d().equals(GComponentCd.PropertiesExtension)
              || GComponentCd.d().equals(GComponentCd.e)
              || GComponentCd.d().equals(GComponentCd.SComponentGolf)
              || GComponentCd.d().equals(GComponentCd.f)
              || GComponentCd.d().equals(GComponentCd.h))) {
        this.e.setVisible(true);
      } else {
        this.e.setVisible(false);
      }
    this.k.h();
  }

  public ArrayList h() {
    ArrayList<GComponentCd> arrayList = new ArrayList();
    for (byte b = 0; b < this.SComponentGolf.getItemCount(); b++) {
      if (this.SComponentGolf.getItemAt(b) instanceof E) {
        E e = this.SComponentGolf.getItemAt(b);
        arrayList.add(e.PropertiesExtension());
      }
    }
    return arrayList;
  }

  public void PropertiesExtension(ArrayList<GComponentCd> paramArrayList) {
    this.SComponentGolf.removeAllItems();
    for (byte b = 0; b < paramArrayList.size(); b++)
      this.SComponentGolf.addItem(new E(this, paramArrayList.get(b)));
  }

  public void b(boolean paramBoolean) {
    this.PropertiesExtension.setEnabled(!paramBoolean);
    this.b.setEnabled(paramBoolean);
  }

  public void i() {
    t t = new t(this);
    t.start();
  }

  public GComponentCd ThreadedFile() {
    E e = (E) this.SComponentGolf.getSelectedItem();
    return (e == null) ? null : e.PropertiesExtension();
  }

  protected void k() {
    String str = (String) this.h.getSelectedItem();
    str = X.b(str, " ms", "");
    this.k.PropertiesExtension(Integer.parseInt(str));
  }

  public void l() {
    this.k.f();
  }

  String m() {
    return this.i.PropertiesExtension();
  }

  public void n() {
    this.ThreadedFile.setSelected(false);
    this.i.PropertiesExtension("");
    this.k.SComponentGolf();
  }

  public void PropertiesExtension(int paramInt) {
    this.h.setSelectedItem(paramInt + " ms");
    k();
  }

  public void b(String paramString) {
    for (byte b = 0; b < this.SComponentGolf.getItemCount(); b++) {
      Object object = this.SComponentGolf.getItemAt(b);
      if (object.toString().equals(paramString)) this.SComponentGolf.setSelectedIndex(b);
    }
  }

  public int o() {
    String str = (String) this.h.getSelectedItem();
    return Integer.parseInt(X.b(str, " ms", ""));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
