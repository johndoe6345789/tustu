package com.efiAnalytics.tuningwidgets.panels;

import W.j;
import W.n;
import bH.S;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import i.c;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import s.g;

public class a extends JPanel {
  JComboBox a = new JComboBox();
  
  JComboBox b = new JComboBox();
  
  JButton c;
  
  JButton d;
  
  List e = new ArrayList();
  
  boolean f = false;
  
  private String g = "";
  
  public a() {
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(1, 0, eJ.a(5), eJ.a(5)));
    add("East", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(2));
    try {
      Image image = cO.a().a(cO.S, jPanel2, 16);
      ImageIcon imageIcon = new ImageIcon(image);
      this.c = new JButton(null, imageIcon);
      this.c.setToolTipText(g.b("Fit Curve to data"));
      this.c.addActionListener(new b(this));
      Dimension dimension = eJ.a(20, 20);
      this.c.setPreferredSize(dimension);
      jPanel2.add(this.c);
      image = cO.a().a(cO.R, jPanel2, 16);
      imageIcon = new ImageIcon(image);
      this.d = new JButton(null, imageIcon);
      this.d.setToolTipText(g.b("Add / Edit Data Filter Expression"));
      this.d.addActionListener(new c(this));
      this.d.setPreferredSize(dimension);
      jPanel2.add(this.d);
    } catch (V.a a1) {
      bV.d(a1.getLocalizedMessage(), jPanel2);
    } 
    add("West", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("Center", new JLabel(g.b("X Axis Field:")));
    jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.add(this.a);
    jPanel3.add("East", jPanel2);
    jPanel1.add(jPanel3);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("Center", new JLabel(g.b("Y Axis Field:")));
    jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.add(this.b);
    jPanel4.add("East", jPanel2);
    jPanel1.add(jPanel4);
    a();
    this.a.addActionListener(new d(this));
    this.b.addActionListener(new e(this));
    b();
  }
  
  private void b() {
    this.c.setEnabled((this.a.getSelectedItem() != null && !this.a.getSelectedItem().equals("") && this.b.getSelectedItem() != null && !this.b.getSelectedItem().equals("")));
  }
  
  private void c() {
    for (f f : this.e)
      f.a(); 
  }
  
  private void d() {
    String str;
    do {
      String str1 = g.b("Filter Expression") + ": ";
      str = JOptionPane.showInputDialog(this, str1, this.g);
    } while (str != null && !d(str));
    if (str != null) {
      this.g = str;
    } else {
      d(this.g);
    } 
  }
  
  private boolean d(String paramString) {
    for (f f : this.e) {
      if (!f.c(paramString))
        return false; 
    } 
    return true;
  }
  
  public void a() {
    String str1 = (String)this.a.getSelectedItem();
    String str2 = (String)this.b.getSelectedItem();
    this.f = true;
    this.a.removeAllItems();
    this.b.removeAllItems();
    n n = c.a().e();
    if (n != null) {
      ArrayList<String> arrayList = new ArrayList();
      for (j j : n)
        arrayList.add(j.a()); 
      List list = S.b(arrayList);
      for (String str : list) {
        this.a.addItem(str);
        this.b.addItem(str);
      } 
    } 
    this.f = false;
  }
  
  public void a(String paramString) {
    if (this.a.getSelectedItem() == null || !this.a.getSelectedItem().equals(paramString))
      this.a.setSelectedItem(paramString); 
  }
  
  public void b(String paramString) {
    if (this.b.getSelectedItem() == null || !this.b.getSelectedItem().equals(paramString))
      this.b.setSelectedItem(paramString); 
  }
  
  public void a(f paramf) {
    this.e.add(paramf);
  }
  
  private void e(String paramString) {
    for (f f : this.e)
      f.a(paramString); 
  }
  
  private void f(String paramString) {
    for (f f : this.e)
      f.b(paramString); 
  }
  
  public void c(String paramString) {
    this.g = paramString;
  }
  
  public Dimension getPreferredSize() {
    return super.getPreferredSize();
  }
  
  public Dimension getMinimumSize() {
    return super.getMinimumSize();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */