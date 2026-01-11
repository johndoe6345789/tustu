package p;

import bH.X;
import bH.ab;
import bx.q;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.eJ;
import d.b;
import d.c;
import d.g;
import d.i;
import d.k;
import d.m;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class D extends JPanel {
  ab a;
  
  List b = new ArrayList();
  
  JTextField c = (JTextField)new q("", 18);
  
  JTextField d = new JTextField("", 20);
  
  JTextField e = new JTextField("", 50);
  
  JComboBox f = new JComboBox();
  
  JButton g = null;
  
  JScrollPane h;
  
  private String l = "Define the action command used to fire this action. This name must be unique not only to User Actions, but to all defined Actions. Should not contain spaces or special characters.";
  
  private String m = "A more descriptive name that will be displayed as the Action name.";
  
  private String n = "The target Action that your User Action will trigger with the parameters you provide.";
  
  JPanel i = new JPanel();
  
  List j = new ArrayList();
  
  m k = null;
  
  public D(ab paramab) {
    this.a = paramab;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1, eJ.a(1), eJ.a(1)));
    jPanel1.add(a(a("Unique Action Name"), this.c, this.l));
    jPanel1.add(a(a("Display Name"), this.d, this.m));
    jPanel1.add(a(a("Target Action"), this.f, this.n));
    List<?> list = g.a().a(new E(this));
    Collections.sort(list, new F(this));
    for (c c : list) {
      I i = new I(this, c);
      this.f.addItem(i);
    } 
    this.f.addActionListener(new G(this));
    jPanel1.add(a(a("Description"), this.e, "Description for this User Action."));
    add("North", jPanel1);
    this.i.setLayout(new BoxLayout(this.i, 1));
    this.h = new JScrollPane(this.i);
    Dimension dimension = eJ.a(320, 80);
    this.h.setPreferredSize(dimension);
    this.h.setHorizontalScrollBarPolicy(31);
    this.h.setVerticalScrollBarPolicy(22);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("North", new JLabel(a("User Parameters") + ":"));
    jPanel2.add("Center", this.h);
    add("Center", jPanel2);
    this.g = new JButton(a("Save"));
    this.g.addActionListener(new H(this));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    jPanel3.add(this.g);
    add("South", jPanel3);
    d();
  }
  
  public void a(f paramf) {
    this.b.add(paramf);
  }
  
  public boolean a() {
    for (f f : this.b) {
      if (!f.a())
        return false; 
    } 
    return true;
  }
  
  private String a(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  public m b() {
    m m1 = new m();
    m1.d(this.c.getText());
    m1.c(this.d.getText());
    m1.b(this.e.getText());
    I i = (I)this.f.getSelectedItem();
    if (i != null && i.a() instanceof c) {
      m1.a(i.a().a());
    } else {
      m1.a("");
    } 
    b b = new b();
    for (c c : this.j)
      b.setProperty(c.a().c(), c.b()); 
    m1.a(b);
    return m1;
  }
  
  public boolean c() {
    m m1 = b();
    return (this.k != null && (!X.a(this.k.a(), m1.a()) || !X.a(this.k.b(), m1.b()) || !X.a(this.k.j(), m1.j()) || !X.a(this.k.h(), m1.h()) || !a(this.k.i(), m1.i())));
  }
  
  private boolean a(b paramb1, b paramb2) {
    if (paramb1.size() != paramb2.size())
      return false; 
    for (String str1 : paramb1.stringPropertyNames()) {
      String str2 = paramb2.getProperty(str1);
      if (str2 == null || !str2.equals(paramb1.getProperty(str1)))
        return false; 
    } 
    return true;
  }
  
  void d() {
    this.c.setEnabled(false);
    this.c.setText("");
    this.d.setEnabled(false);
    this.d.setText("");
    this.e.setEnabled(false);
    this.e.setText("");
    this.f.setEnabled(false);
    this.f.setSelectedItem("");
    this.i.removeAll();
    this.i.validate();
    this.i.repaint();
    this.j.clear();
    this.k = null;
  }
  
  public boolean e() {
    return this.c.isEnabled();
  }
  
  private void a(String paramString, k paramk) {
    if (paramString == null || paramString.isEmpty()) {
      this.j.clear();
      this.i.removeAll();
      return;
    } 
    c c = g.a().b(paramString);
    if (c == null) {
      bV.d(a("This action is not supported on this device.") + "\n" + paramString, this);
      this.j.clear();
      this.i.removeAll();
      return;
    } 
    if (paramk == null || paramk.isEmpty())
      paramk = f(); 
    this.j.clear();
    this.i.removeAll();
    int i = 0;
    if (c != null) {
      k k1 = c.e();
      if (k1 != null)
        for (i i1 : k1) {
          c c1;
          if (paramk != null && paramk.a(i1.c()) != null) {
            c1 = new c(paramk.a(i1.c()), this.a);
          } else {
            c1 = new c(i1.a(i1, ""), this.a);
          } 
          this.i.add(c1);
          this.j.add(c1);
          i += (c1.getPreferredSize()).height;
        }  
    } 
    JLabel jLabel = new JLabel();
    Dimension dimension = this.h.getPreferredSize();
    if (i < dimension.height) {
      dimension.height -= i;
      if (dimension.height < 0)
        dimension.height = 0; 
      jLabel.setPreferredSize(dimension);
      this.i.add(jLabel);
    } 
    this.h.getVerticalScrollBar().setValue(0);
    this.i.validate();
    this.i.doLayout();
    this.h.validate();
    this.i.repaint();
  }
  
  private void a(b paramb) {
    for (c c : this.j) {
      String str1 = c.a().c();
      String str2 = paramb.getProperty(str1);
      if (str2 != null)
        c.a(str2); 
    } 
  }
  
  private k f() {
    k k = new k();
    for (c c : this.j)
      k.a(c.a().a(c.a(), c.b())); 
    return k;
  }
  
  private JPanel a(String paramString1, JComponent paramJComponent, String paramString2) {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(paramString1 + ":");
    jLabel.setHorizontalAlignment(4);
    jLabel.setPreferredSize(eJ.a(150, 20));
    jPanel1.add("West", jLabel);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(0));
    jPanel2.add(paramJComponent);
    jPanel1.add("Center", jPanel2);
    if (paramString2 != null && !paramString2.isEmpty()) {
      cF cF = new cF(paramString2, this.a);
      jPanel1.add("East", (Component)cF);
    } 
    return jPanel1;
  }
  
  public void a(m paramm) {
    d();
    this.c.setEnabled(true);
    this.c.setText(paramm.a());
    this.d.setEnabled(true);
    this.d.setText(paramm.b());
    this.e.setEnabled(true);
    this.e.setText(paramm.j());
    this.f.setEnabled(true);
    this.f.setSelectedItem(paramm.h());
    this.k = b();
    this.c.requestFocus();
  }
  
  public void b(m paramm) {
    d();
    if (paramm == null)
      return; 
    this.c.setEnabled(false);
    this.c.setText(paramm.a());
    this.d.setEnabled(true);
    this.d.setText(paramm.b());
    this.e.setEnabled(true);
    this.e.setText(paramm.j());
    this.f.setEnabled(true);
    for (byte b = 0; b < this.f.getItemCount(); b++) {
      I i = this.f.getItemAt(b);
      if (i != null && i.a() != null && i.a().a().equals(paramm.h())) {
        this.f.setSelectedIndex(b);
        break;
      } 
    } 
    c c = g.a().b(paramm.h());
    this.f.setSelectedItem(c);
    a(paramm.i());
    this.k = paramm;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */