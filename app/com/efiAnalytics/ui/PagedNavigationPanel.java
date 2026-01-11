package com.efiAnalytics.ui;

import bH.ab;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PagedNavigationPanel extends JPanel {
  PagedContentProvider a;
  
  JPanel b = new JPanel();
  
  JButton c;
  
  JButton d;
  
  ab e;
  
  JLabel f = new JLabel("", 0);
  
  private Component h = null;
  
  JScrollPane g = new JScrollPane();
  
  public dz(dy paramdy, ab paramab) {
    this.a = paramdy;
    this.e = paramab;
    setLayout(new BorderLayout());
    add(this.g, "Center");
    this.g.setViewportView(this.b);
    this.b.setLayout(new GridLayout(1, 1));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.c = new JButton("<<  " + a("Previous"));
    this.d = new JButton(a("Next") + "  >>");
    jPanel.add(this.c, "West");
    jPanel.add(this.d, "East");
    this.d.addActionListener(new dA(this));
    this.c.addActionListener(new dB(this));
    jPanel.add(this.f, "Center");
    add(jPanel, "South");
    a(0);
  }
  
  private void d() {
    int i = this.a.d();
    a(i + 1);
  }
  
  private void e() {
    int i = this.a.d();
    a(i - 1);
  }
  
  public void a(int paramInt) {
    Component component = this.a.a(paramInt);
    if (this.h != null) {
      this.b.remove(this.h);
      this.a.b(this.h);
      this.h = null;
    } 
    if (component != null) {
      this.a.a(component);
      this.b.add(component);
      this.h = component;
    } 
    this.d.setEnabled(this.a.b());
    this.c.setEnabled(this.a.c());
    int i = this.a.d();
    int j = this.a.a();
    String str = a("Page") + ": " + (i + 1);
    if (j > 0)
      str = str + " " + a("of") + " " + j; 
    this.f.setText(str);
    this.b.doLayout();
    this.g.validate();
    this.b.repaint();
  }
  
  private String a(String paramString) {
    return (this.e != null) ? this.e.a(paramString) : paramString;
  }
  
  public JScrollPane a() {
    return this.g;
  }
  
  public JButton b() {
    return this.d;
  }
  
  public JButton c() {
    return this.c;
  }
  
  public Dimension getPreferredSize() {
    return (this.a == null || this.a.a(this.a.d()) == null) ? super.getPreferredSize() : this.a.a(this.a.d()).getPreferredSize();
  }
  
  public Dimension getMinimumSize() {
    return (this.a == null || this.a.a(this.a.d()) == null) ? super.getMinimumSize() : this.a.a(this.a.d()).getMinimumSize();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */