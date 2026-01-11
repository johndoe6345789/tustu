package com.efiAnalytics.ui.calculators.calculator;

import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.OptionalDouble;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Display extends JPanel {
  private JLabel b;
  
  private JLabel c;
  
  private final StringBuilder d;
  
  String a = "";
  
  Display() {
    f();
    this.d = new StringBuilder(32);
  }
  
  private void f() {
    setLayout(new BorderLayout(1, 1));
    this.b = new JLabel("0");
    this.b.setFont(new Font("Consolas", 0, eJ.a(30)));
    this.b.setFocusable(false);
    this.b.setBorder(BorderFactory.createEmptyBorder(eJ.a(2), eJ.a(2), eJ.a(2), eJ.a(2)));
    this.b.setHorizontalAlignment(4);
    this.b.setMaximumSize(this.b.getPreferredSize());
    add("Center", this.b);
    this.c = new JLabel("0");
    this.c.setFont(new Font("Consolas", 0, eJ.a(12)));
    this.c.setFocusable(false);
    this.c.setBorder(BorderFactory.createEmptyBorder(eJ.a(2), eJ.a(2), eJ.a(2), eJ.a(2)));
    this.c.setHorizontalAlignment(4);
    this.c.setMaximumSize(this.c.getPreferredSize());
    this.c.setMinimumSize(this.c.getPreferredSize());
    this.c.setText(" ");
    add("North", this.c);
  }
  
  private boolean b(double paramDouble) {
    return (Math.round(paramDouble) != paramDouble);
  }
  
  void a(double paramDouble) {
    String str = b(paramDouble) ? Double.toString(paramDouble) : Long.toString((long)paramDouble);
    byte b = 16;
    if (str.length() > b)
      str = str.substring(0, b); 
    this.b.setText(str);
  }
  
  OptionalDouble a() {
    if (g()) {
      double d = Double.parseDouble(this.d.toString());
      d();
      return OptionalDouble.of(d);
    } 
    return OptionalDouble.empty();
  }
  
  void a(String paramString) {
    String str;
    if (this.a.equals("="))
      this.c.setText(" "); 
    if (this.c.getText().equals(" ")) {
      str = this.b.getText() + " " + paramString;
    } else {
      str = this.c.getText() + " " + this.b.getText() + " " + paramString;
    } 
    this.c.setText(str);
    this.a = paramString;
  }
  
  void b() {
    this.c.setText(" ");
    this.a = "";
  }
  
  void c() {
    if (this.a.equals("="))
      b(); 
  }
  
  void b(String paramString) {
    this.d.append(paramString);
    this.b.setText(this.d.toString());
    c();
  }
  
  private boolean g() {
    return (this.d.length() > 0);
  }
  
  void d() {
    this.d.delete(0, this.d.length());
    this.b.setText("0");
  }
  
  void e() {
    if (this.d.indexOf(".") == -1)
      this.d.append('.'); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/calculators/calculator/Display.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */