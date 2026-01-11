package bE;

import bH.ab;
import com.efiAnalytics.ui.do;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class e extends JPanel {
  ab a = null;
  
  JCheckBox b = null;
  
  do c = new do("", 4);
  
  do d = new do("", 4);
  
  ArrayList e = new ArrayList();
  
  public e(ab paramab) {
    this.a = paramab;
    this.b = new JCheckBox(a("Use Default"));
    setLayout(new GridLayout(0, 1, eJ.a(3), eJ.a(3)));
    add(this.b);
    this.b.addActionListener(new f(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(a("Min") + ":", 4);
    jLabel.setPreferredSize(eJ.a(45, 18));
    jPanel.add("West", jLabel);
    jPanel.add("Center", (Component)this.c);
    this.c.b(7);
    this.d.b(7);
    add(jPanel);
    this.c.addKeyListener(new g(this));
    this.c.addFocusListener(new h(this));
    jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jLabel = new JLabel(a("Max") + ":", 4);
    jLabel.setPreferredSize(eJ.a(45, 18));
    jPanel.add("West", jLabel);
    jPanel.add("Center", (Component)this.d);
    add(jPanel);
    this.d.addKeyListener(new i(this));
    this.d.addFocusListener(new j(this));
  }
  
  public void a(boolean paramBoolean) {
    this.b.setSelected(paramBoolean);
    this.c.setEnabled(!paramBoolean);
    this.d.setEnabled(!paramBoolean);
  }
  
  public boolean a() {
    return this.b.isSelected();
  }
  
  public void a(double paramDouble) {
    this.c.a(paramDouble);
  }
  
  public double b() {
    return this.c.e();
  }
  
  public void b(double paramDouble) {
    this.d.a(paramDouble);
  }
  
  public double c() {
    return this.d.e();
  }
  
  public void a(d paramd) {
    this.e.add(paramd);
  }
  
  private void d() {
    for (d d : this.e)
      d.a(this.b.isSelected()); 
  }
  
  private void e() {
    double d = this.c.e();
    for (d d1 : this.e)
      d1.a(d); 
  }
  
  private void f() {
    double d = this.c.e();
    for (d d1 : this.e)
      d1.b(d); 
  }
  
  private String a(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bE/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */