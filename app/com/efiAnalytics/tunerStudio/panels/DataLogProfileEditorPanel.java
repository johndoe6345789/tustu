package com.efiAnalytics.tunerStudio.panels;

import V.a;
import aE.a;
import aP.dd;
import aP.f;
import ai.b;
import bH.D;
import bH.S;
import bt.bh;
import com.efiAnalytics.tuningwidgets.panels.A;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class DataLogProfileEditorPanel extends bh {
  JComboBox a = new JComboBox();
  
  A b;
  
  JButton c;
  
  JButton d;
  
  a e;
  
  JTextPane f = new JTextPane();
  
  JDialog g = null;
  
  HashMap h = new HashMap<>();
  
  static String i = s.g.b("Default");
  
  public g(a parama) {
    this.e = parama;
    this.b = new A();
    setBorder(BorderFactory.createTitledBorder(s.g.b("Data Log Profile Editor")));
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("West", new JLabel("  " + s.g.b("Current Data Log Profile") + ": "));
    jPanel2.add("Center", this.a);
    jPanel1.add("West", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0, eJ.a(3), eJ.a(3)));
    Dimension dimension = new Dimension(eJ.a(24), eJ.a(24));
    try {
      Image image = cO.a().a(cO.a, jPanel3, 20);
      ImageIcon imageIcon = new ImageIcon(image);
      this.c = new JButton(null, imageIcon);
      this.c.setPreferredSize(dimension);
      this.c.setToolTipText(s.g.b("Add Logging Profile"));
      this.c.addActionListener(new h(this));
      jPanel3.add(this.c);
    } catch (a a1) {
      D.a(a1.getLocalizedMessage());
    } 
    try {
      Image image = cO.a().a(cO.b, jPanel3, 20);
      ImageIcon imageIcon = new ImageIcon(image);
      this.d = new JButton(null, imageIcon);
      this.d.setPreferredSize(dimension);
      this.d.setToolTipText(s.g.b("Delete Current Logging Profile"));
      this.d.addActionListener(new i(this));
      jPanel3.add(this.d);
    } catch (a a1) {
      D.a(a1.getLocalizedMessage());
    } 
    try {
      Image image = cO.a().a(cO.c, jPanel3, 20);
      ImageIcon imageIcon = new ImageIcon(image);
      JButton jButton = new JButton(null, imageIcon);
      jButton.setPreferredSize(dimension);
      jButton.setToolTipText(s.g.b("Open Data Log Profiles Help"));
      jButton.addActionListener(new j(this));
      jPanel3.add(jButton);
    } catch (a a1) {
      D.a(a1.getLocalizedMessage());
    } 
    jPanel3.add(new JLabel(" "));
    jPanel1.add("East", jPanel3);
    jPanel1.add("South", new JLabel(" "));
    add("North", jPanel1);
    String[] arrayOfString = parama.P();
    arrayOfString = S.a(arrayOfString);
    boolean bool = false;
    for (byte b = 0; b < arrayOfString.length; b++) {
      n n = new n(this, arrayOfString[b]);
      this.a.addItem(n);
      if (!bool && arrayOfString[b].equals(""))
        bool = true; 
      this.h.put(arrayOfString[b], parama.w(arrayOfString[b]));
    } 
    if (!bool) {
      this.h.put("", new String[0]);
      n n = new n(this, "");
      this.a.insertItemAt(n, 0);
    } 
    this.a.addItemListener(new k(this));
    add("Center", (Component)this.b);
    String str = parama.O();
    this.a.setSelectedItem(new n(this, str));
    b(str);
    this.b.h();
  }
  
  private void b(String paramString) {
    if (!this.b.f().equals(""))
      this.h.put(this.b.f(), this.b.i()); 
    if (paramString.equals(i) || paramString.equals("")) {
      paramString = "";
      this.b.a(false);
      this.d.setEnabled(false);
    } else {
      this.b.a(true);
      this.d.setEnabled(true);
    } 
    String[] arrayOfString = (String[])this.h.get(paramString);
    arrayOfString = S.a(arrayOfString);
    this.b.a(paramString, arrayOfString);
  }
  
  public void c() {
    if (!this.b.f().equals(""))
      this.h.put(this.b.f(), this.b.i()); 
    this.e.a(this.b.f(), this.b.i());
  }
  
  public void d() {
    String str;
    do {
      str = bV.a((Component)this, false, s.g.b("Name for your new Logging Profile"), "");
    } while (str != null && !str.equals("") && !c(str));
    if (str == null || str.equals(""))
      return; 
    this.h.put(this.b.f(), this.b.i());
    this.h.put(str, this.b.i());
    this.b.a(true);
    this.d.setEnabled(true);
    n n = new n(this, str);
    this.a.addItem(n);
    this.a.setSelectedItem(n);
    this.b.g();
  }
  
  private void h() {
    b b = new b();
    b.a(s.g.b("Data Log Profiles"));
    b.b("/help/datalogProfiles.html");
    f.a().a(b, dd.a().c());
  }
  
  private boolean c(String paramString) {
    if (paramString.contains("|") || paramString.contains(";") || paramString.contains(",")) {
      bV.d(s.g.b("Illegal Characters.") + " | ; ,", (Component)this);
      return false;
    } 
    return true;
  }
  
  public void e() {
    String str = s.g.b("Are you sure you want to delete logging Profile?") + "\n" + s.g.b("Profile") + ": " + this.b.f();
    boolean bool = bV.a(str, (Component)this, true);
    if (bool) {
      this.h.remove(this.b.f());
      this.a.removeItem(new n(this, this.b.f()));
    } 
  }
  
  public boolean f() {
    return true;
  }
  
  public void g() {
    c();
    String[] arrayOfString = new String[this.a.getItemCount()];
    for (byte b = 0; b < arrayOfString.length; b++) {
      arrayOfString[b] = ((n)this.a.getItemAt(b)).a();
      if (!arrayOfString[b].equals("")) {
        String[] arrayOfString1 = (String[])this.h.get(arrayOfString[b]);
        if (arrayOfString1 != null) {
          this.e.a(arrayOfString[b], arrayOfString1);
        } else {
          D.b("disabledFields null for log profile: " + arrayOfString[b] + ", not saving.");
        } 
      } 
    } 
    this.e.a(arrayOfString);
    this.e.v(i());
  }
  
  private String i() {
    return ((n)this.a.getSelectedItem()).a();
  }
  
  public void a(Component paramComponent) {
    this.g = new JDialog(bV.a(paramComponent), s.g.b("Data Log Profile Editor"));
    this.g.add("Center", (Component)this);
    JButton jButton1 = new JButton(s.g.b("Cancel"));
    jButton1.addActionListener(new l(this));
    JButton jButton2 = new JButton(s.g.b("Accept"));
    jButton2.addActionListener(new m(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.d()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } 
    this.g.add("South", jPanel);
    this.g.pack();
    bV.a(bV.a(paramComponent), this.g);
    this.g.setVisible(true);
    validate();
    this.g.pack();
    this.g.setResizable(false);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */