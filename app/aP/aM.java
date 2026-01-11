package aP;

import com.efiAnalytics.tuningwidgets.panels.aQ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class aM extends JPanel {
  aO a = new aO(this, "1st Gear");
  
  aO b = new aO(this, "2nd Gear");
  
  aO c = new aO(this, "3rd Gear");
  
  aO d = new aO(this, "4th Gear");
  
  aO e = new aO(this, "5th Gear");
  
  aO f = new aO(this, "6th Gear");
  
  aO g = new aO(this, "Converter Stall (RPM)");
  
  aO h = new aO(this, "Final Drive Ratio");
  
  JCheckBox i = new JCheckBox("Automatic Transmission");
  
  aQ j = new aQ("Vehicle Weight");
  
  public aM() {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder("Vehicle Information"));
    add("North", (Component)this.j);
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder("Transmission Ratios"));
    jPanel1.setLayout(new GridLayout(0, 2, 6, 0));
    jPanel1.add(this.a);
    jPanel1.add(this.b);
    jPanel1.add(this.c);
    jPanel1.add(this.d);
    jPanel1.add(this.e);
    jPanel1.add(this.f);
    add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setBorder(BorderFactory.createTitledBorder("Transmission Type"));
    jPanel2.setLayout(new GridLayout(0, 1));
    jPanel2.add(this.i);
    this.i.addChangeListener(new aN(this));
    jPanel2.add(this.g);
    jPanel2.add(this.h);
    add("South", jPanel2);
  }
  
  public void a(String paramString) {
    this.a.a(paramString);
  }
  
  public String a() {
    return this.a.a();
  }
  
  public void b(String paramString) {
    this.b.a(paramString);
  }
  
  public String b() {
    return this.b.a();
  }
  
  public void c(String paramString) {
    this.c.a(paramString);
  }
  
  public String c() {
    return this.c.a();
  }
  
  public void d(String paramString) {
    this.d.a(paramString);
  }
  
  public String d() {
    return this.d.a();
  }
  
  public void e(String paramString) {
    this.e.a(paramString);
  }
  
  public String e() {
    return this.e.a();
  }
  
  public void f(String paramString) {
    this.f.a(paramString);
  }
  
  public String f() {
    return this.f.a();
  }
  
  public void a(boolean paramBoolean) {
    this.i.setSelected(paramBoolean);
    this.g.setEnabled(paramBoolean);
  }
  
  public boolean g() {
    return this.i.isSelected();
  }
  
  public void g(String paramString) {
    this.g.a(paramString);
  }
  
  public String h() {
    return this.g.a();
  }
  
  public void h(String paramString) {
    this.h.a(paramString);
  }
  
  public String i() {
    return this.h.a();
  }
  
  public String j() {
    return this.j.a();
  }
  
  public void i(String paramString) {
    this.j.a(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */