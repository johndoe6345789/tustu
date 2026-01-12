package p;

import bH.X;
import bH.ab;
import bx.JTextFieldExtensionInBxPackage;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.eJ;
import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import d.DInterfaceIndia;
import d.DInterfaceMike;
import d.HashMapUsingArrayList;
import d.PropertiesExtensionInDPackage;
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

public class JPanelExtensionInPPackage extends JPanel {
  ab a;

  List PropertiesExtensionInDPackage = new ArrayList();

  JTextField DComponentCharlie = (JTextField) new JTextFieldExtensionInBxPackage("", 18);

  JTextField d = new JTextField("", 20);

  JTextField e = new JTextField("", 50);

  JComboBox f = new JComboBox();

  JButton HashMapUsingArrayList = null;

  JScrollPane h;

  private String l =
      "Define the action command used to fire this action. This name must be unique not only to"
          + " User Actions, but to all defined Actions. Should not contain spaces or special"
          + " characters.";

  private String DInterfaceMike =
      "A more descriptive name that will be displayed as the Action name.";

  private String n =
      "The target Action that your User Action will trigger with the parameters you provide.";

  JPanel DInterfaceIndia = new JPanel();

  List j = new ArrayList();

  DInterfaceMike ArrayListExtensionInDPackage = null;

  public JPanelExtensionInPPackage(ab paramab) {
    this.a = paramab;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1, eJ.a(1), eJ.a(1)));
    jPanel1.add(a(a("Unique Action Name"), this.DComponentCharlie, this.l));
    jPanel1.add(a(a("Display Name"), this.d, this.DInterfaceMike));
    jPanel1.add(a(a("Target Action"), this.f, this.n));
    List<?> list = HashMapUsingArrayList.a().a(new E(this));
    Collections.sort(list, new F(this));
    for (DComponentCharlie DComponentCharlie : list) {
      I DInterfaceIndia = new I(this, DComponentCharlie);
      this.f.addItem(DInterfaceIndia);
    }
    this.f.addActionListener(new G(this));
    jPanel1.add(a(a("Description"), this.e, "Description for this User Action."));
    add("North", jPanel1);
    this.DInterfaceIndia.setLayout(new BoxLayout(this.DInterfaceIndia, 1));
    this.h = new JScrollPane(this.DInterfaceIndia);
    Dimension dimension = eJ.a(320, 80);
    this.h.setPreferredSize(dimension);
    this.h.setHorizontalScrollBarPolicy(31);
    this.h.setVerticalScrollBarPolicy(22);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("North", new JLabel(a("User Parameters") + ":"));
    jPanel2.add("Center", this.h);
    add("Center", jPanel2);
    this.HashMapUsingArrayList = new JButton(a("Save"));
    this.HashMapUsingArrayList.addActionListener(new H(this));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    jPanel3.add(this.HashMapUsingArrayList);
    add("South", jPanel3);
    d();
  }

  public void a(f paramf) {
    this.PropertiesExtensionInDPackage.add(paramf);
  }

  public boolean a() {
    for (f f : this.PropertiesExtensionInDPackage) {
      if (!f.a()) return false;
    }
    return true;
  }

  private String a(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }

  public DInterfaceMike PropertiesExtensionInDPackage() {
    DInterfaceMike m1 = new DInterfaceMike();
    m1.d(this.DComponentCharlie.getText());
    m1.DComponentCharlie(this.d.getText());
    m1.PropertiesExtensionInDPackage(this.e.getText());
    I DInterfaceIndia = (I) this.f.getSelectedItem();
    if (DInterfaceIndia != null && DInterfaceIndia.a() instanceof DComponentCharlie) {
      m1.a(DInterfaceIndia.a().a());
    } else {
      m1.a("");
    }
    PropertiesExtensionInDPackage PropertiesExtensionInDPackage =
        new PropertiesExtensionInDPackage();
    for (DComponentCharlie DComponentCharlie : this.j)
      PropertiesExtensionInDPackage.setProperty(
          DComponentCharlie.a().DComponentCharlie(),
          DComponentCharlie.PropertiesExtensionInDPackage());
    m1.a(PropertiesExtensionInDPackage);
    return m1;
  }

  public boolean DComponentCharlie() {
    DInterfaceMike m1 = PropertiesExtensionInDPackage();
    return (this.ArrayListExtensionInDPackage != null
        && (!X.a(this.ArrayListExtensionInDPackage.a(), m1.a())
            || !X.a(
                this.ArrayListExtensionInDPackage.PropertiesExtensionInDPackage(),
                m1.PropertiesExtensionInDPackage())
            || !X.a(this.ArrayListExtensionInDPackage.j(), m1.j())
            || !X.a(this.ArrayListExtensionInDPackage.h(), m1.h())
            || !a(this.ArrayListExtensionInDPackage.DInterfaceIndia(), m1.DInterfaceIndia())));
  }

  private boolean a(PropertiesExtensionInDPackage paramb1, PropertiesExtensionInDPackage paramb2) {
    if (paramb1.size() != paramb2.size()) return false;
    for (String str1 : paramb1.stringPropertyNames()) {
      String str2 = paramb2.getProperty(str1);
      if (str2 == null || !str2.equals(paramb1.getProperty(str1))) return false;
    }
    return true;
  }

  void d() {
    this.DComponentCharlie.setEnabled(false);
    this.DComponentCharlie.setText("");
    this.d.setEnabled(false);
    this.d.setText("");
    this.e.setEnabled(false);
    this.e.setText("");
    this.f.setEnabled(false);
    this.f.setSelectedItem("");
    this.DInterfaceIndia.removeAll();
    this.DInterfaceIndia.validate();
    this.DInterfaceIndia.repaint();
    this.j.clear();
    this.ArrayListExtensionInDPackage = null;
  }

  public boolean e() {
    return this.DComponentCharlie.isEnabled();
  }

  private void a(String paramString, ArrayListExtensionInDPackage paramk) {
    if (paramString == null || paramString.isEmpty()) {
      this.j.clear();
      this.DInterfaceIndia.removeAll();
      return;
    }
    DComponentCharlie DComponentCharlie =
        HashMapUsingArrayList.a().PropertiesExtensionInDPackage(paramString);
    if (DComponentCharlie == null) {
      bV.d(a("This action is not supported on this device.") + "\n" + paramString, this);
      this.j.clear();
      this.DInterfaceIndia.removeAll();
      return;
    }
    if (paramk == null || paramk.isEmpty()) paramk = f();
    this.j.clear();
    this.DInterfaceIndia.removeAll();
    int DInterfaceIndia = 0;
    if (DComponentCharlie != null) {
      ArrayListExtensionInDPackage k1 = DComponentCharlie.e();
      if (k1 != null)
        for (DInterfaceIndia i1 : k1) {
          DComponentCharlie c1;
          if (paramk != null && paramk.a(i1.DComponentCharlie()) != null) {
            c1 = new DComponentCharlie(paramk.a(i1.DComponentCharlie()), this.a);
          } else {
            c1 = new DComponentCharlie(i1.a(i1, ""), this.a);
          }
          this.DInterfaceIndia.add(c1);
          this.j.add(c1);
          DInterfaceIndia += (c1.getPreferredSize()).height;
        }
    }
    JLabel jLabel = new JLabel();
    Dimension dimension = this.h.getPreferredSize();
    if (DInterfaceIndia < dimension.height) {
      dimension.height -= DInterfaceIndia;
      if (dimension.height < 0) dimension.height = 0;
      jLabel.setPreferredSize(dimension);
      this.DInterfaceIndia.add(jLabel);
    }
    this.h.getVerticalScrollBar().setValue(0);
    this.DInterfaceIndia.validate();
    this.DInterfaceIndia.doLayout();
    this.h.validate();
    this.DInterfaceIndia.repaint();
  }

  private void a(PropertiesExtensionInDPackage paramb) {
    for (DComponentCharlie DComponentCharlie : this.j) {
      String str1 = DComponentCharlie.a().DComponentCharlie();
      String str2 = paramb.getProperty(str1);
      if (str2 != null) DComponentCharlie.a(str2);
    }
  }

  private ArrayListExtensionInDPackage f() {
    ArrayListExtensionInDPackage ArrayListExtensionInDPackage = new ArrayListExtensionInDPackage();
    for (DComponentCharlie DComponentCharlie : this.j)
      ArrayListExtensionInDPackage.a(
          DComponentCharlie.a()
              .a(DComponentCharlie.a(), DComponentCharlie.PropertiesExtensionInDPackage()));
    return ArrayListExtensionInDPackage;
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
      jPanel1.add("East", (Component) cF);
    }
    return jPanel1;
  }

  public void a(DInterfaceMike paramm) {
    d();
    this.DComponentCharlie.setEnabled(true);
    this.DComponentCharlie.setText(paramm.a());
    this.d.setEnabled(true);
    this.d.setText(paramm.PropertiesExtensionInDPackage());
    this.e.setEnabled(true);
    this.e.setText(paramm.j());
    this.f.setEnabled(true);
    this.f.setSelectedItem(paramm.h());
    this.ArrayListExtensionInDPackage = PropertiesExtensionInDPackage();
    this.DComponentCharlie.requestFocus();
  }

  public void PropertiesExtensionInDPackage(DInterfaceMike paramm) {
    d();
    if (paramm == null) return;
    this.DComponentCharlie.setEnabled(false);
    this.DComponentCharlie.setText(paramm.a());
    this.d.setEnabled(true);
    this.d.setText(paramm.PropertiesExtensionInDPackage());
    this.e.setEnabled(true);
    this.e.setText(paramm.j());
    this.f.setEnabled(true);
    for (byte PropertiesExtensionInDPackage = 0;
        PropertiesExtensionInDPackage < this.f.getItemCount();
        PropertiesExtensionInDPackage++) {
      I DInterfaceIndia = this.f.getItemAt(PropertiesExtensionInDPackage);
      if (DInterfaceIndia != null
          && DInterfaceIndia.a() != null
          && DInterfaceIndia.a().a().equals(paramm.h())) {
        this.f.setSelectedIndex(PropertiesExtensionInDPackage);
        break;
      }
    }
    DComponentCharlie DComponentCharlie =
        HashMapUsingArrayList.a().PropertiesExtensionInDPackage(paramm.h());
    this.f.setSelectedItem(DComponentCharlie);
    a(paramm.DInterfaceIndia());
    this.ArrayListExtensionInDPackage = paramm;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
