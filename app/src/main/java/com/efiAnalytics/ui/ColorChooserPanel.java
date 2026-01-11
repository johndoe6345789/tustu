package com.efiAnalytics.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class ColorChooserPanel extends JPanel implements bc {
  JColorChooser a = new JColorChooser();
  
  ArrayList b = new ArrayList();
  
  private Color g = Color.WHITE;
  
  JDialog c = null;
  
  JButton d;
  
  JButton e;
  
  JButton f;
  
  public ColorChooserPanel() {
    setLayout(new BorderLayout());
    add("Center", this.a);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    this.d = new JButton("Apply");
    this.d.addActionListener(new be(this));
    jPanel.add(this.d);
    this.f = new JButton("Transparent");
    this.f.addActionListener(new bf(this));
    jPanel.add(this.f);
    this.e = new JButton("Reset");
    this.e.addActionListener(new bg(this));
    jPanel.add(this.e);
    this.e.setEnabled(false);
    add("South", jPanel);
  }
  
  public JDialog a(Component paramComponent, String paramString, Color paramColor) {
    a(paramColor);
    if (this.c == null || !this.c.isVisible()) {
      this.c = bV.a(this, paramComponent, paramString, this);
    } else {
      this.c.setTitle(paramString);
      this.c.setVisible(true);
    } 
    return this.c;
  }
  
  public void a(bh parambh) {
    this.b.clear();
    this.b.add(parambh);
  }
  
  private void b(Color paramColor) {
    for (bh bh : this.b)
      bh.a(paramColor); 
  }
  
  public void a(Color paramColor) {
    this.g = paramColor;
    this.a.setColor(paramColor);
    this.e.setEnabled(false);
  }
  
  public void close() {
    this.b.clear();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */