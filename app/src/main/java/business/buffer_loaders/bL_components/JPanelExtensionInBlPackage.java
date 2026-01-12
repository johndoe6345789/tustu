package business.buffer_loaders.bL_components;

import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

public class JPanelExtensionInBlPackage extends JPanel {
  c a = null;

  et b = null;

  static String c = SComponentGolf.b("Maximum Cell Value Change");

  static String d = SComponentGolf.b("Maximum Cell Percentage Change");

  JButton e = new JButton(c);

  JButton f = new JButton(d);

  JComboBox SComponentGolf = new JComboBox();

  public JPanelExtensionInBlPackage(c paramc, et paramet) {
    this.a = paramc;
    this.b = paramet;
    c();
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("Center", new JLabel(SComponentGolf.b("Cell Change Resistance") + ": ", 4));
    jPanel1.add("East", this.SComponentGolf);
    Iterator iterator = e();
    while (iterator.hasNext()) this.SComponentGolf.addItem(iterator.next());
    a();
    this.SComponentGolf.addActionListener(new b(this));
    add("North", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Authority Limits")));
    jPanel2.setLayout(new GridLayout(2, 0));
    jPanel2.add(this.e);
    if (!paramc.SComponentGolf()) jPanel2.add(this.f);
    add("Center", jPanel2);
    this.e.addActionListener(new c(this));
    a(this.e);
    if (!paramc.SComponentGolf()) {
      this.f.addActionListener(new d(this));
      a(this.f);
    }
  }

  private void a(e parame) {
    this.a.f(parame.d());
    this.a.c(parame.b());
    this.a.a(parame.a());
    a("minChangeThreshold", "" + this.a.c());
    a("weightThreshold", "" + this.a.a());
    a("baseWeight", "" + this.a.h());
    a("maxWeight", "" + this.a.i());
  }

  private void b() {
    String str = bV.a(this, true, c, "" + X.a(this.a.d()));
    if (str == null || str.equals("")) return;
    double d = Double.parseDouble(str);
    this.a.d(d);
    a("maxValueChange", d + "");
    a(this.e);
  }

  private void c() {
    double d = a("minChangeThreshold", this.a.c());
    this.a.c(d);
    d = a("weightThreshold", this.a.a());
    this.a.a(d);
    d = a("baseWeight", this.a.h());
    this.a.f(d);
    d = a("maxWeight", this.a.i());
    this.a.SComponentGolf(d);
    d = a("maxValueChange", this.a.d());
    this.a.d(d);
    if (!this.a.SComponentGolf()) {
      d = a("maxPercentChange", this.a.e());
      this.a.e(d);
    }
  }

  private void d() {
    if (!this.a.SComponentGolf()) {
      String str = bV.a(this, true, d, "" + X.a(this.a.e() * 100.0D));
      if (str == null || str.equals("")) return;
      double d = Double.parseDouble(str) / 100.0D;
      this.a.e(d);
      a("maxPercentChange", d + "");
      a(this.f);
    }
  }

  protected void a() {
    for (byte b = 0; b < this.SComponentGolf.getItemCount(); b++) {
      e e = this.SComponentGolf.getItemAt(b);
      if (e.d() == this.a.h()) this.SComponentGolf.setSelectedIndex(b);
    }
  }

  private void a(String paramString1, String paramString2) {
    if (this.b != null) this.b.a(paramString1, paramString2);
  }

  private double a(String paramString, double paramDouble) {
    if (this.b == null) return paramDouble;
    String str = this.b.a(paramString);
    return (str == null || str.equals("")) ? paramDouble : Double.parseDouble(str);
  }

  private void a(JButton paramJButton) {
    if (paramJButton.equals(this.e)) {
      String str = X.b(this.a.d(), 1);
      paramJButton.setText(c + ": " + str);
    } else if (paramJButton.equals(this.f)) {
      String str = X.a(this.a.e() * 100.0D);
      paramJButton.setText(d + ": " + str);
    }
  }

  private Iterator e() {
    ArrayList<e> arrayList = new ArrayList();
    e e = new e(this, "Very Easy", 0.0D, 0.0D, 0.5D, 5.0D);
    arrayList.add(e);
    e = new e(this, "Easy", 0.0D, 0.0D, 3.0D, 100.0D);
    arrayList.add(e);
    e = new e(this, "Normal", 0.0D, 0.0D, 5.0D, 300.0D);
    arrayList.add(e);
    e = new e(this, "Hard", 1.0D, 0.1D, 20.0D, 1000.0D);
    arrayList.add(e);
    e = new e(this, "Very Hard", 1.0D, 0.25D, 100.0D, 100000.0D);
    arrayList.add(e);
    return arrayList.iterator();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bL/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
