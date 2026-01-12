package business.buffer_controllers.bC_components;

import Z.ZInterfaceCharlie;
import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class JPanelExtensionInBcPackage extends JPanel {
  ab a;

  JTextField b = new JTextField("", 15);

  private ZInterfaceCharlie k = null;

  Z.e ZInterfaceCharlie = null;

  j d = new j(this);

  JList e = new JList(this.d);

  List f = new ArrayList();

  JButton g;

  JButton h;

  JButton i;

  List j = new ArrayList();

  public JPanelExtensionInBcPackage(ab paramab) {
    this.a = paramab;
    setBorder(BorderFactory.createTitledBorder(b("Standard Field Name Editor")));
    setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    add("North", a("Standard Field Name", this.b));
    this.b.setEditable(false);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 2, eJ.a(5), eJ.a(5)));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("North", new JLabel(b("Imported Log Name") + ":", 4));
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(0, 1, eJ.a(5), eJ.a(5)));
    this.g = new JButton(b("Add Log Name"));
    jPanel4.add(this.g);
    this.h = new JButton(b("Remove Log Name"));
    jPanel4.add(this.h);
    this.i = new JButton(b("Load Default"));
    jPanel4.add(this.i);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new FlowLayout(1));
    jPanel5.add(jPanel4);
    jPanel3.add("Center", jPanel5);
    jPanel2.add(jPanel3);
    this.g.addActionListener(new f(this));
    this.h.addActionListener(new g(this));
    this.i.addActionListener(new h(this));
    this.e.setBorder(BorderFactory.createEmptyBorder(0, eJ.a(3), 0, eJ.a(3)));
    JScrollPane jScrollPane = new JScrollPane(this.e);
    jScrollPane.setPreferredSize(eJ.a(140, 90));
    jPanel2.add(jScrollPane);
    jPanel1.add("Center", jPanel2);
    this.e.setSelectionMode(0);
    this.e.addListSelectionListener(new i(this));
    add("Center", jPanel1);
  }

  public void a() {
    String str = "";
    boolean bool = false;
    do {
      str = bV.a(this, false, "New Imported Log Name", str);
      if (str == null || str.isEmpty()) continue;
      if (!a(str)) {
        bV.d("Invalid characters in field name", this);
      } else {
        this.f.add(str);
        this.d = new j(this);
        this.e.setModel(this.d);
        i();
        return;
      }
    } while (str != null && !str.isEmpty());
  }

  public boolean a(String paramString) {
    return (!paramString.contains("[") && !paramString.contains("]"));
  }

  public void b() {
    int i = this.e.getSelectedIndex();
    if (i >= 0) {
      this.f.remove(i);
      this.d = new j(this);
      this.e.setModel(this.d);
      i();
    }
  }

  public void ZInterfaceCharlie() {
    Z.e e1 = this.k.a(this.b.getText());
    if (e1 != null) {
      this.f.clear();
      if (e1 != null) for (String str : e1.b()) this.f.add(str);
      this.d = new j(this);
      this.e.setModel(this.d);
      i();
    }
  }

  private void h() {
    this.h.setEnabled((this.e.getSelectedIndex() >= 0));
  }

  public void a(Z.e parame) {
    this.ZInterfaceCharlie = parame;
    this.b.setText("");
    this.f.clear();
    this.e.clearSelection();
    if (parame != null) {
      this.b.setText(parame.a());
      this.f.addAll(parame.b());
      fp.a(this, true);
    }
    this.d = new j(this);
    this.e.setModel(this.d);
    this.h.setEnabled((this.e.getSelectedIndex() >= 0));
    this.e.repaint();
    i();
  }

  public Z.e d() {
    Z.e e1 = null;
    if (this.b.getText().trim().length() > 0) {
      e1 = new Z.e(this.b.getText());
      for (String str : this.f) e1.a(str);
    }
    return e1;
  }

  private boolean a(Z.e parame1, Z.e parame2) {
    if (parame1 == null && parame2 == null) return true;
    if ((((parame1 == null) ? 1 : 0) ^ ((parame2 == null) ? 1 : 0)) != 0) return false;
    if (!parame1.a().equals(parame2.a())) return false;
    if (parame1.b().size() != parame2.b().size()) return false;
    for (byte b = 0; b < parame1.b().size(); b++) {
      if (!parame2.b(parame1.b().get(b))) return false;
    }
    return true;
  }

  private JPanel a(String paramString, JComponent paramJComponent) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 2, eJ.a(5), eJ.a(5)));
    JLabel jLabel = new JLabel(b(paramString) + ":", 4);
    jLabel.setMinimumSize(eJ.a(120, 20));
    jLabel.setPreferredSize(eJ.a(120, 20));
    jPanel.add(jLabel, "West");
    jPanel.add(paramJComponent, "Center");
    return jPanel;
  }

  private String b(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }

  public boolean e() {
    return !a(this.ZInterfaceCharlie, d());
  }

  public void f() {
    this.ZInterfaceCharlie = d();
  }

  public void g() {
    this.f.clear();
    this.b.setText("");
    this.e.repaint();
    this.ZInterfaceCharlie = null;
    i();
    fp.a(this, false);
  }

  public void a(a parama) {
    this.j.add(parama);
  }

  private void i() {
    boolean bool =
        (this.k != null
                && this.k.a(this.b.getText()) != null
                && !a(this.k.a(this.b.getText()), d()))
            ? true
            : false;
    this.i.setEnabled(bool);
    boolean bool1 = e();
    for (a a : this.j) {
      if (bool1) {
        a.a();
        continue;
      }
      a.b();
    }
  }

  public void a(ZInterfaceCharlie paramc) {
    this.k = paramc;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bC/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
