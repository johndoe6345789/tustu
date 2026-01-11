package com.efiAnalytics.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class ct extends JDialog {
  ArrayList a = new ArrayList();
  
  public ct(Window paramWindow, JComponent paramJComponent, String paramString, a parama, int paramInt) {
    super(paramWindow, paramString);
    setLayout(new BorderLayout());
    a(parama);
    add("Center", paramJComponent);
    add("South", a(paramInt));
    pack();
  }
  
  private JPanel a(int paramInt) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    boolean bool = bV.d();
    JButton jButton1 = null;
    if (bool) {
      jButton1 = new JButton("Ok");
      jButton1.setMnemonic(79);
    } else {
      jButton1 = new JButton("Accept");
      jButton1.setMnemonic(65);
    } 
    jButton1.addActionListener(new cu(this));
    JButton jButton2 = new JButton("Cancel");
    jButton2.setMnemonic(27);
    jButton2.addActionListener(new cv(this));
    JButton jButton3 = new JButton("Apply");
    jButton3.setMnemonic(80);
    jButton3.addActionListener(new cw(this));
    if (bool) {
      if ((paramInt | 0x1) == paramInt)
        jPanel.add(jButton1); 
      if ((paramInt | 0x2) == paramInt)
        jPanel.add(jButton2); 
      if ((paramInt | 0x4) == paramInt)
        jPanel.add(jButton3); 
    } else {
      if ((paramInt | 0x4) == paramInt)
        jPanel.add(jButton3); 
      if ((paramInt | 0x2) == paramInt)
        jPanel.add(jButton2); 
      if ((paramInt | 0x1) == paramInt)
        jPanel.add(jButton1); 
    } 
    return jPanel;
  }
  
  protected void a() {
    for (a a : this.a) {
      if (!a.a())
        return; 
    } 
    dispose();
  }
  
  protected void b() {
    for (a a : this.a)
      a.b(); 
    dispose();
  }
  
  protected void c() {
    for (a a : this.a)
      a.c(); 
  }
  
  public void a(a parama) {
    if (!this.a.contains(parama))
      this.a.add(parama); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */