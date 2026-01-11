package business.button_builders.bB_components;

import bH.S;
import bH.ab;
import com.efiAnalytics.ui.NumericTextField;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelExtensionSetenabled extends JPanel {
  ab a;
  
  JTextField b = new JTextField("", 15);
  
  JComboBox c = new JComboBox();
  
  JCheckBox d;
  
  JCheckBox e;
  
  JCheckBox f;
  
  NumericTextField g = new NumericTextField("", 15);
  
  NumericTextField h = new NumericTextField("", 15);
  
  NumericTextField i = new NumericTextField("", 15);
  
  a j = null;
  
  JPanel k = new JPanel();
  
  CardLayout l;
  
  public JPanelExtensionSetenabled(ab paramab) {
    this.a = paramab;
    setLayout(new GridLayout(0, 1));
    this.l = new CardLayout();
    this.k.setLayout(this.l);
    this.k.add(a("Field Name", this.b), "showFieldNameTxtInput");
    this.b.setEditable(false);
    this.c.setEditable(false);
    this.k.add(a("Field Name", this.c), "showFieldNameSelector");
    add(this.k);
    this.d = new JCheckBox(b("Auto Scale Min"));
    this.d.addActionListener(new e(this));
    add(this.d);
    add(a("Min", (JComponent)this.g));
    this.e = new JCheckBox(b("Auto Scale Max"));
    this.e.addActionListener(new f(this));
    add(this.e);
    add(a("Max", (JComponent)this.h));
    this.f = new JCheckBox(b("Auto Decimal"));
    this.i.b(0);
    this.f.addActionListener(new g(this));
    add(this.f);
    add(a("Decimal Places", (JComponent)this.i));
  }
  
  private JPanel a(String paramString, JComponent paramJComponent) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JLabel jLabel = new JLabel(b(paramString) + ":", 4);
    jLabel.setMinimumSize(eJ.a(100, 20));
    jLabel.setPreferredSize(eJ.a(100, 20));
    jPanel.add(jLabel, "West");
    jPanel.add(paramJComponent, "Center");
    return jPanel;
  }
  
  public void a(boolean paramBoolean) {
    this.d.setSelected(paramBoolean);
    this.g.setEditable(!this.e.isSelected());
  }
  
  public void b(boolean paramBoolean) {
    this.e.setSelected(paramBoolean);
    this.h.setEditable(!this.e.isSelected());
  }
  
  public void c(boolean paramBoolean) {
    this.f.setSelected(paramBoolean);
    this.i.setEditable(!this.f.isSelected());
  }
  
  public void a(List paramList) {
    paramList = S.b(paramList);
    this.c.removeAllItems();
    this.c.addItem(" ");
    for (String str : paramList)
      this.c.addItem(str); 
  }
  
  public void a(String paramString, double paramDouble1, double paramDouble2, int paramInt) {
    a(paramString);
    a(paramDouble1);
    b(paramDouble2);
    a(paramInt);
    d();
  }
  
  public void a(String paramString) {
    if (paramString.equals(" ")) {
      this.l.show(this.k, "showFieldNameSelector");
      this.b.setText("");
    } else {
      this.l.show(this.k, "showFieldNameTxtInput");
      this.b.setText(paramString);
    } 
  }
  
  public void a(double paramDouble) {
    this.g.a(paramDouble);
    a(Double.isNaN(paramDouble));
    this.g.setEditable(!this.d.isSelected());
  }
  
  public void b(double paramDouble) {
    this.h.a(paramDouble);
    b(Double.isNaN(paramDouble));
    this.h.setEditable(!this.e.isSelected());
  }
  
  public void a(int paramInt) {
    if (paramInt >= 0) {
      this.i.a(paramInt);
    } else {
      this.i.a(-1.0D);
    } 
    c((paramInt == -1));
  }
  
  public String[] a() {
    return this.b.getText().split(", ");
  }
  
  public boolean b() {
    r r = e();
    return (this.j != null && a(r, this.j));
  }
  
  public boolean c() {
    return !b();
  }
  
  public void d() {
    this.j = g();
  }
  
  public boolean a(r paramr1, r paramr2) {
    return (paramr1.e().equals(paramr2.e()) && (paramr1.a() == paramr2.a() || (Double.isNaN(paramr1.a()) && Double.isNaN(paramr2.a()))) && (paramr1.b() == paramr2.b() || (Double.isNaN(paramr1.b()) && Double.isNaN(paramr2.b()))));
  }
  
  public r e() {
    return g();
  }
  
  private a g() {
    a a1 = new a();
    String str = this.b.getText();
    if (str.contains(","))
      str = str.substring(0, str.indexOf(",")); 
    a1.a(str);
    if (this.d.isSelected()) {
      a1.a(Double.NaN);
    } else {
      a1.a(this.g.e());
    } 
    if (this.e.isSelected()) {
      a1.b(Double.NaN);
    } else {
      a1.b(this.h.e());
    } 
    if (this.f.isSelected()) {
      a1.a(-1);
    } else {
      a1.a((int)this.i.e());
    } 
    return a1;
  }
  
  private String b(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  void f() {
    a(" ", Double.NaN, Double.NaN, -1);
  }
  
  public void setEnabled(boolean paramBoolean) {
    fp.a(this, paramBoolean);
    super.setEnabled(paramBoolean);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bB/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */