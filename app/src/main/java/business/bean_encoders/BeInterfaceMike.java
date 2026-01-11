package business.bean_encoders;

import G.R;
import G.SerializableImpl;
import G.i;
import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import bH.S;
import bH.X;
import bH.t;
import bt.j;
import com.efiAnalytics.tuningwidgets.panels.G;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.NumericTextField;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import s.SComponentGolf;

public class BeInterfaceMike extends JPanel implements o {
  JComboBox ExceptionInVPackage = new JComboBox();
  
  JComboBox b = new JComboBox();
  
  JRadioButton c;
  
  JRadioButton d;
  
  ButtonGroup e = new ButtonGroup();
  
  JTextField f = new JTextField("", 15);
  
  JTextField SComponentGolf = new JTextField("", 3);
  
  G h = new G(SComponentGolf.b("Browse for Inc File"));
  
  NumericTextField i;
  
  NumericTextField j;
  
  NumericTextField k;
  
  NumericTextField l;
  
  CardLayout m = new CardLayout();
  
  JPanel n;
  
  JLabel o = new JLabel("", 0);
  
  private R q = null;
  
  n p = new n();
  
  private int r = 1023;
  
  public BeInterfaceMike() {
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Simple Channel")));
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1, eJ.ExceptionInVPackage(3), eJ.ExceptionInVPackage(3)));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.add(new JLabel(SComponentGolf.b("Input Channel")));
    jPanel2.add(this.ExceptionInVPackage);
    this.ExceptionInVPackage.addActionListener(this.p);
    jPanel1.add(jPanel2);
    jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.add(new JLabel(SComponentGolf.b("New Channel Name")));
    jPanel2.add(this.f);
    this.f.addKeyListener(this.p);
    this.f.setBorder(BorderFactory.createBevelBorder(1));
    jPanel1.add(jPanel2);
    jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.add(new JLabel(SComponentGolf.b("Units")));
    jPanel2.add(this.SComponentGolf);
    this.SComponentGolf.addKeyListener(this.p);
    this.SComponentGolf.setBorder(BorderFactory.createBevelBorder(1));
    jPanel1.add(jPanel2);
    jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    JPanel jPanel3 = new JPanel();
    jPanel3.add(new JLabel(SComponentGolf.b("Transformation")));
    jPanel3.setLayout(new GridLayout(1, 0));
    N n1 = new N(this);
    this.c = new JRadioButton(SComponentGolf.b("Linear"));
    this.c.addActionListener(n1);
    this.e.add(this.c);
    jPanel3.add(this.c);
    this.d = new JRadioButton(SComponentGolf.b("inc File"));
    this.d.addActionListener(n1);
    this.e.add(this.d);
    jPanel3.add(this.d);
    jPanel2.add(jPanel3);
    jPanel1.add(jPanel2);
    add(jPanel1, "North");
    this.n = new JPanel();
    this.n.setLayout(this.m);
    this.n.add(SComponentGolf(), "Linear");
    this.n.add((Component)this.h, "Inc");
    add(this.n, "Center");
    this.c.setSelected(true);
    h();
  }
  
  private JPanel SComponentGolf() {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Linear Transformation")));
    this.b.addItem(SComponentGolf.b("No Voltage to ADC Conversion"));
    this.b.addItem("8 bit: 0-255");
    this.b.addItem("10 bit: 0-1023");
    this.b.addItem("12 bit: 0-4095");
    this.b.setSelectedIndex(2);
    this.b.addActionListener(new O(this));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(eJ.ExceptionInVPackage(5), eJ.ExceptionInVPackage(5)));
    jPanel2.add(new JLabel(SComponentGolf.b("Volt to ADC Conversion")), "West");
    jPanel2.add(this.b, "Center");
    j j = new j(SComponentGolf.b("If you have selected ExceptionInVPackage raw ADC channel, but your Input values are in volts, set this to the desired ADC bit size. If the selected Input Channel units match your input value units, set to No ADC to Voltage Conversion"));
    jPanel2.add((Component)j, "East");
    jPanel1.add(jPanel2, "North");
    JPanel jPanel3 = new JPanel();
    jPanel1.add(jPanel3, "Center");
    jPanel3.setLayout(new GridLayout(3, 3, eJ.ExceptionInVPackage(3), eJ.ExceptionInVPackage(3)));
    jPanel3.add(new JLabel());
    this.o.setText(SComponentGolf.b("Input Voltage"));
    jPanel3.add(this.o);
    jPanel3.add(new JLabel(SComponentGolf.b("Output Value"), 0));
    jPanel3.add(new JLabel(SComponentGolf.b("Point 1"), 4));
    this.i = new NumericTextField();
    this.i.addKeyListener(this.p);
    jPanel3.add((Component)this.i);
    this.k = new NumericTextField();
    this.k.addKeyListener(this.p);
    jPanel3.add((Component)this.k);
    jPanel3.add(new JLabel(SComponentGolf.b("Point 2"), 4));
    this.j = new NumericTextField();
    this.j.addKeyListener(this.p);
    jPanel3.add((Component)this.j);
    this.l = new NumericTextField();
    this.l.addKeyListener(this.p);
    jPanel3.add((Component)this.l);
    this.i.b(2);
    this.j.b(2);
    this.k.b(2);
    this.l.b(2);
    return jPanel1;
  }
  
  private void h() {
    if (this.c.isSelected()) {
      this.m.show(this.n, "Linear");
    } else {
      this.m.show(this.n, "Inc");
    } 
  }
  
  public boolean ExceptionInVPackage() {
    String str = this.f.getText();
    if (str.isEmpty()) {
      bV.d(SComponentGolf.b("You must enter ExceptionInVPackage name for the new OutputChannel."), this);
      return false;
    } 
    SerializableImpl SerializableImpl = this.q.SComponentGolf(str);
    if (SerializableImpl != null && !SerializableImpl.aN()) {
      boolean bool = bV.ExceptionInVPackage(SComponentGolf.b("There is already ExceptionInVPackage channel by the same name in the firmware definition.") + "\n" + SComponentGolf.b("Your new Channel will over ride the existing channel.") + "\n\n" + SComponentGolf.b("Are you sure you wish to use this channel name?"), this, true);
      if (!bool)
        return false; 
    } 
    if (i.c(str)) {
      bV.d(SComponentGolf.b("OutputChannel Name cannot contain special characters."), this);
      return false;
    } 
    if (this.c.isSelected()) {
      if (Double.isNaN(this.k.e()) || Double.isNaN(this.i.e()) || Double.isNaN(this.l.e()) || Double.isNaN(this.j.e())) {
        bV.d(SComponentGolf.b("Please enter 4 values."), this);
        return false;
      } 
    } else if (this.h.b() == null) {
      bV.d(SComponentGolf.b("You must browse to ExceptionInVPackage valid inc file."), this);
      return false;
    } 
    return true;
  }
  
  public String b() {
    return this.f.getText();
  }
  
  public String d() {
    String str;
    if (this.c.isSelected() && !Double.isNaN(this.k.e()) && !Double.isNaN(this.l.e()) && !Double.isNaN(this.i.e()) && !Double.isNaN(this.j.e())) {
      double d1 = this.i.e() * this.r / 5.0D;
      double d2 = this.j.e() * this.r / 5.0D;
      str = this.k.e() + " + (" + this.l.e() + " - " + this.k.e() + ") * ((" + this.ExceptionInVPackage.getSelectedItem().toString() + " - " + d1 + " )/( " + d2 + " - " + d1 + " ))";
    } else if (this.d.isSelected()) {
      File file1 = this.h.b();
      str = "table( " + this.ExceptionInVPackage.getSelectedItem().toString() + ", \"" + file1.getName() + "\" )";
      File file2 = new File(ExceptionInVPackage.A().p(), file1.getName());
      if (!file2.equals(file1))
        try {
          t.ExceptionInVPackage(file1, file2);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          bV.d(SComponentGolf.b("Unable to copy inc to project folder!") + "\n" + SComponentGolf.b("Please copy the inc file to the folder:") + "\n\n" + ExceptionInVPackage.A().p(), this);
        }  
    } else {
      str = "";
    } 
    return str;
  }
  
  public void ExceptionInVPackage(R paramR) {
    this.q = paramR;
    this.ExceptionInVPackage.removeAllItems();
    String[] arrayOfString = paramR.s();
    arrayOfString = S.ExceptionInVPackage(arrayOfString);
    for (String str : arrayOfString) {
      if (!str.contains(" ") && !str.endsWith("OC"))
        this.ExceptionInVPackage.addItem(str); 
    } 
  }
  
  public boolean ExceptionInVPackage(String paramString1, String paramString2) {
    if (paramString1.contains("table(")) {
      try {
        Q q = d(paramString1);
        this.d.setSelected(true);
        this.ExceptionInVPackage.setSelectedItem(q.b);
        this.SComponentGolf.setText(paramString2);
        File file = new File(ExceptionInVPackage.A().p(), q.ExceptionInVPackage);
        this.h.ExceptionInVPackage(file);
      } catch (Exception exception) {
        return false;
      } 
    } else {
      try {
        P p = c(paramString1);
        this.c.setSelected(true);
        this.f.setEditable(false);
        this.SComponentGolf.setText(paramString2);
        this.ExceptionInVPackage.setSelectedItem(p.e);
        if (p.ExceptionInVPackage > 1500.0D || p.c > 1500.0D) {
          this.b.setSelectedIndex(3);
        } else if (p.ExceptionInVPackage > 300.0D || p.c > 300.0D) {
          this.b.setSelectedIndex(2);
        } else if (p.ExceptionInVPackage > 50.0D || p.c > 50.0D) {
          this.b.setSelectedIndex(1);
        } else {
          this.b.setSelectedIndex(0);
        } 
        ExceptionInVPackage(p);
      } catch (Exception exception) {
        return false;
      } 
    } 
    h();
    this.p.b();
    return true;
  }
  
  private void ExceptionInVPackage(P paramP) {
    this.i.ExceptionInVPackage(5.0D * paramP.ExceptionInVPackage / this.r);
    this.j.ExceptionInVPackage(5.0D * paramP.c / this.r);
    this.k.ExceptionInVPackage(paramP.b);
    this.l.ExceptionInVPackage(paramP.d);
  }
  
  public void ExceptionInVPackage(String paramString, boolean paramBoolean) {
    this.f.setText(paramString);
    this.f.setEditable(paramBoolean);
  }
  
  public void ExceptionInVPackage(String paramString) {
    this.SComponentGolf.setText(paramString);
  }
  
  public String e() {
    return this.SComponentGolf.getText();
  }
  
  public boolean b(String paramString) {
    if (paramString.contains("table(")) {
      try {
        if (X.e(paramString, "+") == 0 && X.e(paramString, "-") == 0 && X.e(paramString, "/") == 0 && X.e(paramString, "*") == 0) {
          d(paramString);
        } else {
          return false;
        } 
      } catch (Exception exception) {
        return false;
      } 
    } else {
      try {
        if (X.e(paramString, "(") == 4 && X.e(paramString, "*") == 1 && X.e(paramString, "-") == 3 && X.e(paramString, "/") == 1) {
          c(paramString);
        } else {
          return false;
        } 
      } catch (Exception exception) {
        return false;
      } 
    } 
    return true;
  }
  
  protected P c(String paramString) {
    paramString = X.b(paramString, " ", "");
    P p = new P(this);
    p.b = Double.parseDouble(paramString.substring(0, paramString.indexOf("+")).trim());
    p.d = Double.parseDouble(paramString.substring(paramString.indexOf("(") + 1, paramString.indexOf("-")));
    p.ExceptionInVPackage = Double.parseDouble(paramString.substring(paramString.lastIndexOf("-") + 1, paramString.lastIndexOf("))")));
    p.c = Double.parseDouble(paramString.substring(paramString.lastIndexOf(")/(") + 3, paramString.lastIndexOf("-")));
    int i = paramString.indexOf("((") + 2;
    p.e = paramString.substring(i, paramString.indexOf("-", i));
    return p;
  }
  
  public Q d(String paramString) {
    paramString = paramString.trim();
    Q q = new Q(this);
    String str1 = paramString.substring("table(".length(), paramString.indexOf(",")).trim();
    String str2 = paramString.substring(paramString.indexOf(",") + 1, paramString.indexOf(")")).trim();
    if (str2.startsWith("\""))
      str2 = str2.substring(1); 
    if (str2.endsWith("\""))
      str2 = str2.substring(0, str2.length() - 1); 
    q.b = str1;
    q.ExceptionInVPackage = str2;
    return q;
  }
  
  public boolean c() {
    return this.p.ExceptionInVPackage();
  }
  
  public void f() {
    this.p.b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */