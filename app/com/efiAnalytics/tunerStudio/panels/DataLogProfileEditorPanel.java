package com.efiAnalytics.tunerStudio.panels;

import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import aP.dd;
import aP.NetworkHashMap;
import ai.EqualsInAiPackage;
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
  JComboBox ExceptionInVPackage = new JComboBox();
  
  A EqualsInAiPackage;
  
  JButton c;
  
  JButton d;
  
  ExceptionInVPackage e;
  
  JTextPane NetworkHashMap = new JTextPane();
  
  JDialog g = null;
  
  HashMap h = new HashMap<>();
  
  static String i = s.g.EqualsInAiPackage("Default");
  
  public g(ExceptionInVPackage parama) {
    this.e = parama;
    this.EqualsInAiPackage = new A();
    setBorder(BorderFactory.createTitledBorder(s.g.EqualsInAiPackage("Data Log Profile Editor")));
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("West", new JLabel("  " + s.g.EqualsInAiPackage("Current Data Log Profile") + ": "));
    jPanel2.add("Center", this.ExceptionInVPackage);
    jPanel1.add("West", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0, eJ.ExceptionInVPackage(3), eJ.ExceptionInVPackage(3)));
    Dimension dimension = new Dimension(eJ.ExceptionInVPackage(24), eJ.ExceptionInVPackage(24));
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.ExceptionInVPackage, jPanel3, 20);
      ImageIcon imageIcon = new ImageIcon(image);
      this.c = new JButton(null, imageIcon);
      this.c.setPreferredSize(dimension);
      this.c.setToolTipText(s.g.EqualsInAiPackage("Add Logging Profile"));
      this.c.addActionListener(new h(this));
      jPanel3.add(this.c);
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage(a1.getLocalizedMessage());
    } 
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.EqualsInAiPackage, jPanel3, 20);
      ImageIcon imageIcon = new ImageIcon(image);
      this.d = new JButton(null, imageIcon);
      this.d.setPreferredSize(dimension);
      this.d.setToolTipText(s.g.EqualsInAiPackage("Delete Current Logging Profile"));
      this.d.addActionListener(new i(this));
      jPanel3.add(this.d);
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage(a1.getLocalizedMessage());
    } 
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.c, jPanel3, 20);
      ImageIcon imageIcon = new ImageIcon(image);
      JButton jButton = new JButton(null, imageIcon);
      jButton.setPreferredSize(dimension);
      jButton.setToolTipText(s.g.EqualsInAiPackage("Open Data Log Profiles Help"));
      jButton.addActionListener(new j(this));
      jPanel3.add(jButton);
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage(a1.getLocalizedMessage());
    } 
    jPanel3.add(new JLabel(" "));
    jPanel1.add("East", jPanel3);
    jPanel1.add("South", new JLabel(" "));
    add("North", jPanel1);
    String[] arrayOfString = parama.P();
    arrayOfString = S.ExceptionInVPackage(arrayOfString);
    boolean bool = false;
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < arrayOfString.length; EqualsInAiPackage++) {
      n n = new n(this, arrayOfString[EqualsInAiPackage]);
      this.ExceptionInVPackage.addItem(n);
      if (!bool && arrayOfString[EqualsInAiPackage].equals(""))
        bool = true; 
      this.h.put(arrayOfString[EqualsInAiPackage], parama.w(arrayOfString[EqualsInAiPackage]));
    } 
    if (!bool) {
      this.h.put("", new String[0]);
      n n = new n(this, "");
      this.ExceptionInVPackage.insertItemAt(n, 0);
    } 
    this.ExceptionInVPackage.addItemListener(new k(this));
    add("Center", (Component)this.EqualsInAiPackage);
    String str = parama.O();
    this.ExceptionInVPackage.setSelectedItem(new n(this, str));
    EqualsInAiPackage(str);
    this.EqualsInAiPackage.h();
  }
  
  private void EqualsInAiPackage(String paramString) {
    if (!this.EqualsInAiPackage.NetworkHashMap().equals(""))
      this.h.put(this.EqualsInAiPackage.NetworkHashMap(), this.EqualsInAiPackage.i()); 
    if (paramString.equals(i) || paramString.equals("")) {
      paramString = "";
      this.EqualsInAiPackage.ExceptionInVPackage(false);
      this.d.setEnabled(false);
    } else {
      this.EqualsInAiPackage.ExceptionInVPackage(true);
      this.d.setEnabled(true);
    } 
    String[] arrayOfString = (String[])this.h.get(paramString);
    arrayOfString = S.ExceptionInVPackage(arrayOfString);
    this.EqualsInAiPackage.ExceptionInVPackage(paramString, arrayOfString);
  }
  
  public void c() {
    if (!this.EqualsInAiPackage.NetworkHashMap().equals(""))
      this.h.put(this.EqualsInAiPackage.NetworkHashMap(), this.EqualsInAiPackage.i()); 
    this.e.ExceptionInVPackage(this.EqualsInAiPackage.NetworkHashMap(), this.EqualsInAiPackage.i());
  }
  
  public void d() {
    String str;
    do {
      str = bV.ExceptionInVPackage((Component)this, false, s.g.EqualsInAiPackage("Name for your new Logging Profile"), "");
    } while (str != null && !str.equals("") && !c(str));
    if (str == null || str.equals(""))
      return; 
    this.h.put(this.EqualsInAiPackage.NetworkHashMap(), this.EqualsInAiPackage.i());
    this.h.put(str, this.EqualsInAiPackage.i());
    this.EqualsInAiPackage.ExceptionInVPackage(true);
    this.d.setEnabled(true);
    n n = new n(this, str);
    this.ExceptionInVPackage.addItem(n);
    this.ExceptionInVPackage.setSelectedItem(n);
    this.EqualsInAiPackage.g();
  }
  
  private void h() {
    EqualsInAiPackage EqualsInAiPackage = new EqualsInAiPackage();
    EqualsInAiPackage.ExceptionInVPackage(s.g.EqualsInAiPackage("Data Log Profiles"));
    EqualsInAiPackage.EqualsInAiPackage("/help/datalogProfiles.html");
    NetworkHashMap.ExceptionInVPackage().ExceptionInVPackage(EqualsInAiPackage, dd.ExceptionInVPackage().c());
  }
  
  private boolean c(String paramString) {
    if (paramString.contains("|") || paramString.contains(";") || paramString.contains(",")) {
      bV.d(s.g.EqualsInAiPackage("Illegal Characters.") + " | ; ,", (Component)this);
      return false;
    } 
    return true;
  }
  
  public void e() {
    String str = s.g.EqualsInAiPackage("Are you sure you want to delete logging Profile?") + "\n" + s.g.EqualsInAiPackage("Profile") + ": " + this.EqualsInAiPackage.NetworkHashMap();
    boolean bool = bV.ExceptionInVPackage(str, (Component)this, true);
    if (bool) {
      this.h.remove(this.EqualsInAiPackage.NetworkHashMap());
      this.ExceptionInVPackage.removeItem(new n(this, this.EqualsInAiPackage.NetworkHashMap()));
    } 
  }
  
  public boolean NetworkHashMap() {
    return true;
  }
  
  public void g() {
    c();
    String[] arrayOfString = new String[this.ExceptionInVPackage.getItemCount()];
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < arrayOfString.length; EqualsInAiPackage++) {
      arrayOfString[EqualsInAiPackage] = ((n)this.ExceptionInVPackage.getItemAt(EqualsInAiPackage)).ExceptionInVPackage();
      if (!arrayOfString[EqualsInAiPackage].equals("")) {
        String[] arrayOfString1 = (String[])this.h.get(arrayOfString[EqualsInAiPackage]);
        if (arrayOfString1 != null) {
          this.e.ExceptionInVPackage(arrayOfString[EqualsInAiPackage], arrayOfString1);
        } else {
          D.EqualsInAiPackage("disabledFields null for log profile: " + arrayOfString[EqualsInAiPackage] + ", not saving.");
        } 
      } 
    } 
    this.e.ExceptionInVPackage(arrayOfString);
    this.e.v(i());
  }
  
  private String i() {
    return ((n)this.ExceptionInVPackage.getSelectedItem()).ExceptionInVPackage();
  }
  
  public void ExceptionInVPackage(Component paramComponent) {
    this.g = new JDialog(bV.ExceptionInVPackage(paramComponent), s.g.EqualsInAiPackage("Data Log Profile Editor"));
    this.g.add("Center", (Component)this);
    JButton jButton1 = new JButton(s.g.EqualsInAiPackage("Cancel"));
    jButton1.addActionListener(new l(this));
    JButton jButton2 = new JButton(s.g.EqualsInAiPackage("Accept"));
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
    bV.ExceptionInVPackage(bV.ExceptionInVPackage(paramComponent), this.g);
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