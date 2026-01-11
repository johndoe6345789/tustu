package business.box_extensions;

import bH.X;
import bH.ab;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

class UIInBxPackage extends JPanel {
  j a = null;
  
  private k i = null;
  
  JTextField b = new q("", 15);
  
  JTextField c = new JTextField("", 50);
  
  JTextPane d = new JTextPane();
  
  JButton e = null;
  
  ab f = null;
  
  boolean g = true;
  
  List h = new ArrayList();
  
  m(ab paramab) {
    this.f = paramab;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(2, 0, eJ.a(3), eJ.a(3)));
    jPanel1.add(a(a("Unique Name"), this.b));
    jPanel1.add(a(a("Description"), this.c));
    add("North", jPanel1);
    this.d.setEditable(true);
    JScrollPane jScrollPane = new JScrollPane(this.d);
    Dimension dimension = eJ.a(320, 80);
    jScrollPane.setPreferredSize(dimension);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("North", new JLabel("<html>" + a("Expression, Filter Data When:") + "          " + a("Example") + ": [RPM] > 6000 && [TPS] < 90<br>Press CTRL+Space for Field List"));
    jPanel2.add("Center", jScrollPane);
    add("Center", jPanel2);
    this.e = new JButton(a("Save"));
    this.e.addActionListener(new n(this));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    jPanel3.add(this.e);
    add("South", jPanel3);
    b();
  }
  
  private JPanel a(String paramString, JTextField paramJTextField) {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(paramString + ":");
    jLabel.setHorizontalAlignment(4);
    jLabel.setPreferredSize(eJ.a(90, 20));
    jPanel1.add("West", jLabel);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(0));
    jPanel2.add(paramJTextField);
    jPanel1.add("Center", jPanel2);
    return jPanel1;
  }
  
  public void a(j paramj) {
    if (paramj != null) {
      this.a = paramj;
      this.b.setText(paramj.a());
      this.b.setEnabled(false);
      this.c.setText(paramj.b());
      this.c.setEnabled(true);
      this.d.setText(paramj.c());
      this.d.setEnabled(true);
      this.d.requestFocus();
      this.d.selectAll();
    } else {
      b();
    } 
  }
  
  public void b(j paramj) {
    this.a = paramj;
    this.b.setText(paramj.a());
    this.b.setEnabled(true);
    this.c.setText(paramj.b());
    this.c.setEnabled(true);
    this.d.setText(paramj.c());
    this.d.setEnabled(true);
    this.b.requestFocus();
  }
  
  public j a() {
    this.a.a(this.b.getText().trim());
    this.a.b(this.c.getText());
    String str = X.b(this.d.getText(), "\n", " ");
    if (this.i != null)
      str = this.i.a(str); 
    this.a.c(str);
    return this.a;
  }
  
  public void b() {
    this.a = null;
    this.b.setEnabled(false);
    this.b.setText("");
    this.c.setEnabled(false);
    this.c.setText("");
    this.d.setEnabled(false);
    this.d.setText("");
  }
  
  public void a(y paramy) {
    this.h.add(paramy);
  }
  
  public boolean c() {
    for (y y : this.h) {
      if (!y.a())
        return false; 
    } 
    return true;
  }
  
  private String a(String paramString) {
    return (this.f != null) ? this.f.a(paramString) : paramString;
  }
  
  public boolean d() {
    return (this.a != null && (!this.a.a().equals(this.b.getText().trim()) || !this.a.b().equals(this.c.getText()) || !this.a.c().equals(this.d.getText())));
  }
  
  public void a(k paramk) {
    this.i = paramk;
  }
  
  public JTextPane e() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */