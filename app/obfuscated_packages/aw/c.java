package aw;

import bE.e;
import bH.ab;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class c extends JPanel {
  ab a = null;
  
  e b = null;
  
  e c = null;
  
  e d = null;
  
  ArrayList e = new ArrayList();
  
  public c(ab paramab) {
    this.a = paramab;
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 0));
    this.b = new e(paramab);
    this.b.setBorder(BorderFactory.createTitledBorder(a("X Axis Scale")));
    jPanel.add((Component)this.b);
    this.b.a(new e(this, null));
    this.b.a(true);
    this.c = new e(paramab);
    this.c.setBorder(BorderFactory.createTitledBorder(a("Y Axis Scale")));
    jPanel.add((Component)this.c);
    this.c.a(new f(this, null));
    this.c.a(true);
    this.d = new e(paramab);
    this.d.setBorder(BorderFactory.createTitledBorder(a("Z Axis Scale")));
    jPanel.add((Component)this.d);
    this.d.a(new g(this, null));
    this.d.a(true);
    add("North", jPanel);
  }
  
  public void a(boolean paramBoolean) {
    this.c.a(paramBoolean);
  }
  
  public void a(double paramDouble1, double paramDouble2) {
    this.c.a(paramDouble1);
    this.c.b(paramDouble2);
  }
  
  public void b(boolean paramBoolean) {
    this.b.a(paramBoolean);
  }
  
  public void b(double paramDouble1, double paramDouble2) {
    this.b.a(paramDouble1);
    this.b.b(paramDouble2);
  }
  
  public void c(boolean paramBoolean) {
    this.d.a(paramBoolean);
  }
  
  public void c(double paramDouble1, double paramDouble2) {
    this.d.a(paramDouble1);
    this.d.b(paramDouble2);
  }
  
  public boolean a() {
    return this.b.a();
  }
  
  public double b() {
    return this.b.b();
  }
  
  public double c() {
    return this.b.c();
  }
  
  public boolean d() {
    return this.c.a();
  }
  
  public double e() {
    return this.c.b();
  }
  
  public double f() {
    return this.c.c();
  }
  
  public boolean g() {
    return this.d.a();
  }
  
  public double h() {
    return this.d.b();
  }
  
  public double i() {
    return this.d.c();
  }
  
  public void a(b paramb) {
    this.e.add(paramb);
  }
  
  private void j() {
    for (b b : this.e)
      b.a(this.b.b(), this.b.c()); 
  }
  
  private void d(boolean paramBoolean) {
    for (b b : this.e)
      b.a(paramBoolean); 
  }
  
  private void k() {
    for (b b : this.e)
      b.b(this.c.b(), this.c.c()); 
  }
  
  private void e(boolean paramBoolean) {
    for (b b : this.e)
      b.b(paramBoolean); 
  }
  
  private void l() {
    for (b b : this.e)
      b.c(this.d.b(), this.d.c()); 
  }
  
  private void f(boolean paramBoolean) {
    for (b b : this.e)
      b.c(paramBoolean); 
  }
  
  private String a(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aw/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */