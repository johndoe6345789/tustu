package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.T;
import G.SerializableImplExceptionprintstacktrace;
import SerializableImplExceptionprintstacktrace.AcInterfaceQuebec;
import SerializableImplExceptionprintstacktrace.AcInterfaceRomeo;
import bH.D;
import bt.ExceptionEqualsinaipackage;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import s.SComponentGolf;

public class ProfileDatalogFieldsPanel extends ExceptionEqualsinaipackage {
  R[] a = null;
  
  private String k = "";
  
  DefaultListModel b = new DefaultListModel();
  
  JList c = new JList(this.b);
  
  DefaultListModel d = new DefaultListModel();
  
  JList e = new JList(this.d);
  
  List f = new ArrayList();
  
  List SComponentGolf = new ArrayList();
  
  JPanel h;
  
  JLabel i = new JLabel(" ");
  
  long j = 0L;
  
  private boolean l = false;
  
  public A() {
    String[] arrayOfString = T.a().d();
    this.a = new R[arrayOfString.length];
    for (byte b = 0; b < arrayOfString.length; b++)
      this.a[b] = T.a().c(arrayOfString[b]); 
    ArrayList arrayList = AcInterfaceRomeo.a(this.a);
    for (AcInterfaceQuebec AcInterfaceQuebec : arrayList)
      this.f.add(new F(this, AcInterfaceQuebec)); 
    this.f = a(this.f);
    setLayout(new BorderLayout(eJ.a(12), eJ.a(12)));
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Profile Data Log Fields")));
    int i = eJ.a(180);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JScrollPane jScrollPane1 = new JScrollPane(this.c);
    jScrollPane1.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane1.setPreferredSize(new Dimension(i, i));
    jPanel1.add("North", new JLabel(SComponentGolf.b("Not Logged"), 0));
    jPanel1.add("Center", jScrollPane1);
    jPanel1.add("West", new JLabel(""));
    add("West", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JScrollPane jScrollPane2 = new JScrollPane(this.e);
    jScrollPane2.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane2.setPreferredSize(new Dimension(i, i));
    jPanel2.add("North", new JLabel(SComponentGolf.b("Logged Fields"), 0));
    jPanel2.add("Center", jScrollPane2);
    jPanel2.add("East", new JLabel(""));
    add("East", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout());
    this.h = new JPanel();
    Dimension dimension = eJ.a(60, 25);
    this.h.setLayout(new GridLayout(0, 1, eJ.a(4), eJ.a(4)));
    this.h.add(new JLabel(" "));
    JButton jButton = new JButton(">>");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(65);
    jButton.setToolTipText(SComponentGolf.b("Add All"));
    jButton.addActionListener(new B(this));
    this.h.add(jButton);
    jButton = new JButton(">");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(160);
    jButton.setToolTipText(SComponentGolf.b("Add selected fields"));
    jButton.addActionListener(new C(this));
    this.h.add(jButton);
    jButton = new JButton("<");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(153);
    jButton.setToolTipText(SComponentGolf.b("Remove selected fields"));
    jButton.addActionListener(new D(this));
    this.h.add(jButton);
    jButton = new JButton("<<");
    jButton.setPreferredSize(dimension);
    jButton.setToolTipText(SComponentGolf.b("Remove All"));
    jButton.setMnemonic(82);
    jButton.addActionListener(new E(this));
    this.h.add(jButton);
    add("Center", this.h);
  }
  
  private boolean b(String paramString) {
    return (paramString.equals("Time") || paramString.equals("Engine"));
  }
  
  private void j() {
    this.b.clear();
    this.d.clear();
    for (F f : this.f) {
      R AcInterfaceRomeo = T.a().c(f.a().SComponentGolf());
      SerializableImplExceptionprintstacktrace SerializableImplExceptionprintstacktrace = f.a().b();
      if (AcInterfaceRomeo.a(AcInterfaceRomeo, SerializableImplExceptionprintstacktrace)) {
        if (f.a().a().contains("Oil"))
          D.c(f.a().a()); 
        if (this.SComponentGolf != null && (!this.SComponentGolf.contains(f.a().a()) || b(f.a().a()))) {
          this.d.addElement(f);
          continue;
        } 
        this.b.addElement(f);
      } 
    } 
  }
  
  public void c() {
    this.j = System.currentTimeMillis();
    int[] arrayOfInt = this.c.getSelectedIndices();
    for (byte b = 0; b < arrayOfInt.length; b++) {
      F f = this.b.getElementAt(arrayOfInt[b]);
      if (this.SComponentGolf.remove(f.a().a()));
    } 
    j();
  }
  
  public void d() {
    this.SComponentGolf.clear();
    j();
  }
  
  public void e() {
    int[] arrayOfInt = this.e.getSelectedIndices();
    if (arrayOfInt == null)
      return; 
    for (int i = arrayOfInt.length - 1; i >= 0; i--) {
      F f = this.d.getElementAt(arrayOfInt[i]);
      if (!b(F.a(f).a()) && !this.SComponentGolf.contains(f.a().a()))
        this.SComponentGolf.add(this.SComponentGolf.size(), f.a().a()); 
    } 
    j();
  }
  
  public void removeAll() {
    for (F f : this.f) {
      if (!b(f.a().a()))
        this.SComponentGolf.add(f.a().a()); 
    } 
    j();
  }
  
  public String f() {
    return this.k;
  }
  
  public void a(String paramString, String[] paramArrayOfString) {
    this.k = paramString;
    this.SComponentGolf.clear();
    for (String str : paramArrayOfString) {
      str = str.trim();
      if (!this.SComponentGolf.contains(str))
        this.SComponentGolf.add(str); 
    } 
    j();
  }
  
  public void a(boolean paramBoolean) {
    fp.a(this.h, paramBoolean);
  }
  
  public void SComponentGolf() {
    this.l = true;
  }
  
  public void h() {
    this.l = false;
  }
  
  public String[] i() {
    return (String[])this.SComponentGolf.toArray((Object[])new String[this.SComponentGolf.size()]);
  }
  
  public List a(List<F> paramList) {
    for (byte b = 0; b < paramList.size(); b++) {
      for (int i = b + 1; i < paramList.size(); i++) {
        F f1 = paramList.get(b);
        F f2 = paramList.get(i);
        if (f1.c().toLowerCase().compareTo(f2.c().toLowerCase()) > 0) {
          paramList.set(b, f2);
          paramList.set(i, f1);
        } 
      } 
    } 
    return paramList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */