package com.efiAnalytics.tuningwidgets.panels;

import G.bG;
import G.bH;
import V.a;
import bH.T;
import bH.X;
import com.efiAnalytics.ui.do;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import s.g;

public class aM extends aL {
  bG a = null;
  
  do b = new do();
  
  do c = new do();
  
  do d = new do();
  
  do e = new do();
  
  do f = new do();
  
  do g = new do();
  
  do h = new do();
  
  JRadioButton i = new JRadioButton("Fahrenheit");
  
  JRadioButton j = new JRadioButton("Celsius");
  
  JComboBox k = new JComboBox();
  
  public static String l = g.b("Temperature") + "(" + T.a() + "F)";
  
  public static String m = g.b("Temperature") + "(" + T.a() + "C)";
  
  JLabel n = new JLabel(m, 0);
  
  static String o = "<html><font color=\"gray\">" + g.b("Select a Common Sensor") + "</font></html>";
  
  double p;
  
  double q;
  
  double r;
  
  public aM(bG parambG) {
    this.a = parambG;
    setBorder(BorderFactory.createTitledBorder(g.b(parambG.h())));
    setLayout(new BorderLayout(5, 5));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1, 5, 5));
    this.k.addItem(o);
    this.k.setEditable(false);
    Iterator<bH> iterator = parambG.a();
    while (iterator.hasNext()) {
      bH bH = iterator.next();
      this.k.addItem(g.b(bH.a()));
    } 
    this.k.addItemListener(new aN(this));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(2, 2));
    jPanel2.add("Center", new JLabel(g.b("Common Sensor Values"), 4));
    jPanel2.add("East", this.k);
    jPanel1.add(jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("Center", new JLabel(g.b("Bias Resistor Value (Ohms)"), 0));
    jPanel3.add("East", (Component)this.b);
    jPanel1.add(jPanel3);
    aO aO = new aO(this);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(1, 2));
    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(this.i);
    jPanel4.add(this.i);
    this.i.addActionListener(aO);
    this.j.addActionListener(aO);
    buttonGroup.add(this.j);
    jPanel4.add(this.j);
    this.j.setSelected(true);
    jPanel1.add(jPanel4);
    add("North", jPanel1);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new FlowLayout(1));
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new GridLayout(0, 2, 5, 5));
    jPanel6.add(this.n);
    jPanel6.add(new JLabel(g.b("Resistance (Ohms)"), 0));
    jPanel6.add((Component)this.f);
    jPanel6.add((Component)this.c);
    jPanel6.add((Component)this.g);
    jPanel6.add((Component)this.d);
    jPanel6.add((Component)this.h);
    jPanel6.add((Component)this.e);
    jPanel5.add(jPanel6);
    add("Center", jPanel5);
  }
  
  public void a(String paramString) {
    if (paramString == null || paramString.trim().equals("") || paramString.trim().equals(o)) {
      this.b.setText("");
      this.c.setText("");
      this.d.setText("");
      this.e.setText("");
      this.f.setText("");
      this.g.setText("");
      this.h.setText("");
      return;
    } 
    bH bH = b(paramString);
    if (bH == null)
      return; 
    this.b.setText("" + bH.b());
    this.c.setText("" + bH.d());
    this.d.setText("" + bH.f());
    this.e.setText("" + bH.h());
    if (this.i.isSelected()) {
      double d1 = Math.round((bH.c() * 9.0D / 5.0D + 32.0D) * 1000.0D) / 1000.0D;
      double d2 = Math.round((bH.e() * 9.0D / 5.0D + 32.0D) * 1000.0D) / 1000.0D;
      double d3 = Math.round((bH.g() * 9.0D / 5.0D + 32.0D) * 1000.0D) / 1000.0D;
      this.f.setText("" + d1);
      this.g.setText("" + d2);
      this.h.setText("" + d3);
    } else {
      this.f.setText("" + bH.c());
      this.g.setText("" + bH.e());
      this.h.setText("" + bH.g());
    } 
  }
  
  private bH b(String paramString) {
    Iterator<bH> iterator = this.a.a();
    while (iterator.hasNext()) {
      bH bH = iterator.next();
      if (g.b(bH.a()).equals(paramString))
        return bH; 
    } 
    return null;
  }
  
  private void c() {
    Iterator<bH> iterator = this.a.a();
    while (iterator.hasNext()) {
      bH bH = iterator.next();
      if (c(bH.a()))
        this.k.setSelectedItem(g.b(bH.a())); 
    } 
  }
  
  private boolean c(String paramString) {
    bH bH = b(paramString);
    if (bH == null)
      return false; 
    if (this.j.isSelected())
      return (this.b.getText().equals("" + bH.b()) && this.c.getText().equals("" + bH.d()) && this.d.getText().equals("" + bH.f()) && this.e.getText().equals("" + bH.h()) && this.f.getText().equals("" + bH.c()) && this.g.getText().equals("" + bH.e()) && this.h.getText().equals("" + bH.g())); 
    double d1 = Double.parseDouble(this.f.getText());
    double d2 = Double.parseDouble(this.g.getText());
    double d3 = Double.parseDouble(this.h.getText());
    d1 = Math.round((d1 - 32.0D) * 5.0D / 9.0D * 1000.0D) / 1000.0D;
    d2 = Math.round((d2 - 32.0D) * 5.0D / 9.0D * 1000.0D) / 1000.0D;
    d3 = Math.round((d3 - 32.0D) * 5.0D / 9.0D * 1000.0D) / 1000.0D;
    return (this.b.getText().equals("" + bH.b()) && this.c.getText().equals("" + bH.d()) && this.d.getText().equals("" + bH.f()) && this.e.getText().equals("" + bH.h()) && d1 == bH.c() && d2 == bH.e() && d3 == bH.g());
  }
  
  private void d() {
    if (this.i.isSelected() && !this.n.getText().equals(l)) {
      this.n.setText(l);
      if (this.f.getText().length() > 0 && this.g.getText().length() > 0 && this.h.getText().length() > 0) {
        double d1 = Double.parseDouble(this.f.getText());
        double d2 = Double.parseDouble(this.g.getText());
        double d3 = Double.parseDouble(this.h.getText());
        d1 = Math.round((d1 * 9.0D / 5.0D + 32.0D) * 1000.0D) / 1000.0D;
        d2 = Math.round((d2 * 9.0D / 5.0D + 32.0D) * 1000.0D) / 1000.0D;
        d3 = Math.round((d3 * 9.0D / 5.0D + 32.0D) * 1000.0D) / 1000.0D;
        this.f.setText(X.b(d1, 3));
        this.g.setText(X.b(d2, 3));
        this.h.setText(X.b(d3, 3));
      } 
    } else if (this.j.isSelected() && !this.n.getText().equals(m)) {
      this.n.setText(m);
      if (this.f.getText().length() > 0 && this.g.getText().length() > 0 && this.h.getText().length() > 0) {
        double d1 = Double.parseDouble(this.f.getText());
        double d2 = Double.parseDouble(this.g.getText());
        double d3 = Double.parseDouble(this.h.getText());
        d1 = Math.round((d1 - 32.0D) * 5.0D / 9.0D * 1000.0D) / 1000.0D;
        d2 = Math.round((d2 - 32.0D) * 5.0D / 9.0D * 1000.0D) / 1000.0D;
        d3 = Math.round((d3 - 32.0D) * 5.0D / 9.0D * 1000.0D) / 1000.0D;
        this.f.a(d1);
        this.g.a(d2);
        this.h.a(d3);
      } 
    } 
  }
  
  public String a() {
    return "//--    Generated by ThermTableGenerator using user input values. \n//--    Bias Resistor value: " + this.b.getText() + " Ohms\n//--    Temperature1: " + this.f.getText() + "(" + (this.j.isSelected() ? "C" : "F") + "), \tResistance 1: " + this.c.getText() + " Ohms \n//--    Temperature2: " + this.g.getText() + "(" + (this.j.isSelected() ? "C" : "F") + "), \tResistance 2: " + this.d.getText() + " Ohms \n//--    Temperature3: " + this.h.getText() + "(" + (this.j.isSelected() ? "C" : "F") + "), \tResistance 3: " + this.e.getText() + " Ohms \n//-- \n";
  }
  
  public double[] a(int paramInt) {
    try {
      if (!b())
        throw new a("You must populate all temperature and resistor values"); 
    } catch (a a) {
      throw a;
    } 
    double[] arrayOfDouble1 = new double[paramInt];
    double[] arrayOfDouble2 = new double[3];
    arrayOfDouble2[0] = Double.parseDouble(this.f.getText());
    arrayOfDouble2[1] = Double.parseDouble(this.g.getText());
    arrayOfDouble2[2] = Double.parseDouble(this.h.getText());
    double d1 = Double.parseDouble(this.c.getText());
    double d2 = Double.parseDouble(this.d.getText());
    double d3 = Double.parseDouble(this.e.getText());
    double d4 = Double.parseDouble(this.b.getText());
    boolean bool = this.j.isSelected();
    for (byte b1 = 0; b1 < 3; b1++) {
      if (!bool)
        arrayOfDouble2[b1] = (arrayOfDouble2[b1] - 32.0D) * 5.0D / 9.0D; 
      arrayOfDouble2[b1] = arrayOfDouble2[b1] + 273.15D;
    } 
    double d5 = Math.log(d1);
    double d6 = Math.pow(d5, 3.0D);
    double d7 = 1.0D / arrayOfDouble2[0];
    double d8 = Math.log(d2);
    double d9 = Math.pow(d8, 3.0D);
    double d10 = 1.0D / arrayOfDouble2[1];
    double d11 = Math.log(d3);
    double d12 = Math.pow(d11, 3.0D);
    double d13 = 1.0D / arrayOfDouble2[2];
    this.r = (d10 - d7 - (d13 - d7) * (d8 - d5) / (d11 - d5)) / (d9 - d6 - (d12 - d6) * (d8 - d5) / (d11 - d5));
    this.q = (d13 - d7 - this.r * (d12 - d6)) / (d11 - d5);
    this.p = d7 - this.q * d5 - this.r * d6;
    for (byte b2 = 0; b2 < paramInt; b2++) {
      double d14 = d4 / ((paramInt - 1) / ((b2 == 0) ? 0.01D : b2) - 1.0D);
      double d15 = c(d14);
      arrayOfDouble1[b2] = d15;
    } 
    return arrayOfDouble1;
  }
  
  double a(double paramDouble) {
    return paramDouble * 9.0D / 5.0D - 459.67D;
  }
  
  double b(double paramDouble) {
    return 1.0D / (this.p + this.q * Math.log(paramDouble) + this.r * Math.pow(Math.log(paramDouble), 3.0D));
  }
  
  double c(double paramDouble) {
    return a(b(paramDouble));
  }
  
  public boolean b() {
    if (this.c.getText().length() <= 0 || this.f.getText().length() <= 0 || this.d.getText().length() <= 0 || this.g.getText().length() <= 0 || this.d.getText().length() <= 0 || this.g.getText().length() <= 0 || this.b.getText().length() <= 0)
      throw new a("You must populate all temperature and resistor values."); 
    if (this.b.e() < 0.0D)
      throw new a("Bias Resistor cannot be negative."); 
    if (this.c.e() < 0.0D || this.d.e() < 0.0D || this.e.e() < 0.0D)
      throw new a("Resistor values cannot be negative."); 
    if (this.f.e() > 1000.0D || this.g.e() > 1000.0D || this.h.e() > 1000.0D)
      throw new a("Temperatures are unusual high, are they input correctly?"); 
    if (this.f.e() > this.g.e() || this.g.e() > this.h.e())
      throw new a("Temperatures should go from low to high, are they input correctly?"); 
    return true;
  }
  
  public void setEnabled(boolean paramBoolean) {
    a(this, paramBoolean);
  }
  
  private void a(Container paramContainer, boolean paramBoolean) {
    for (byte b = 0; b < paramContainer.getComponentCount(); b++) {
      Component component = paramContainer.getComponent(b);
      if (component instanceof Container)
        a((Container)component, paramBoolean); 
      component.setEnabled(paramBoolean);
    } 
  }
  
  public void a(et paramet) {
    paramet.a("txtBiasResistor", this.b.getText());
    paramet.a("txtResistor1", this.c.getText());
    paramet.a("txtResistor2", this.d.getText());
    paramet.a("txtResistor3", this.e.getText());
    paramet.a("txtTemp1", this.f.getText());
    paramet.a("txtTemp2", this.g.getText());
    paramet.a("txtTemp3", this.h.getText());
    paramet.a("chkFahrenheit", "" + this.i.isSelected());
    paramet.a("chkCelsius", "" + this.j.isSelected());
  }
  
  public void b(et paramet) {
    String str = paramet.a("chkFahrenheit");
    this.i.setSelected((str != null && str.equals("true")));
    str = paramet.a("chkCelsius");
    this.j.setSelected((str != null && str.equals("true")));
    if (this.j.isSelected()) {
      this.n.setText(m);
    } else {
      this.n.setText(l);
    } 
    str = paramet.a("txtBiasResistor");
    if (str != null && str.length() > 0)
      this.b.setText(str); 
    str = paramet.a("txtResistor1");
    if (str != null && str.length() > 0)
      this.c.setText(str); 
    str = paramet.a("txtResistor2");
    if (str != null && str.length() > 0)
      this.d.setText(str); 
    str = paramet.a("txtResistor3");
    if (str != null && str.length() > 0)
      this.e.setText(str); 
    str = paramet.a("txtTemp1");
    if (str != null && str.length() > 0)
      this.f.setText(str); 
    str = paramet.a("txtTemp2");
    if (str != null && str.length() > 0)
      this.g.setText(str); 
    str = paramet.a("txtTemp3");
    if (str != null && str.length() > 0)
      this.h.setText(str); 
    c();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */