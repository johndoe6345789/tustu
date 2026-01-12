package business.binding_generators.bG_components;

import W.WInterfaceAp;
import com.efiAnalytics.ui.NumericTextField;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JDialogExtensionInBgPackage extends JDialog {
  Dimension a = null;

  NumericTextField b;

  NumericTextField c;

  NumericTextField d;

  private boolean g = false;

  WInterfaceAp e = null;

  String f =
      "<html><body>These are just the starting point settings for your wheel.<br>Starting with a"
          + " symetrical n-m wheel, you will then be able to<br>Add/Remove/Move and resize"
          + " teeth.</body></html>";

  public JDialogExtensionInBgPackage(Window paramWindow, WInterfaceAp paramap) {
    super(paramWindow, "Set Base Teeth");
    setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
    this.e = paramap;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    add("Center", jPanel1);
    jPanel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1));
    jPanel1.add("Center", jPanel2);
    JLabel jLabel = new JLabel(this.f);
    jPanel1.add(jLabel, "North");
    e e = new e(this);
    f f = new f(this);
    this.b = new NumericTextField();
    this.b.b(0);
    this.b.addFocusListener(e);
    this.b.addKeyListener(f);
    this.b.a(b("TotalTrigTeeth", 36.0D));
    a(jPanel2, "Base number of teeth including missing.", (Component) this.b);
    this.c = new NumericTextField("0");
    this.c.b(0);
    this.c.addFocusListener(e);
    this.c.addKeyListener(f);
    this.c.a(b("MissingTeeth", 1.0D));
    a(jPanel2, "Number of missing Teeth.", (Component) this.c);
    this.d = new NumericTextField("0");
    this.d.b(1);
    this.d.addFocusListener(e);
    this.d.addKeyListener(f);
    this.d.a(b("ToothWidth", 0.0D));
    a(jPanel2, "Teeth Width in Degrees. (0 for auto)", (Component) this.d);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    JButton jButton1 = new JButton("Accept");
    jButton1.addActionListener(new g(this));
    jPanel3.add(jButton1);
    JButton jButton2 = new JButton("Cancel");
    jButton2.addActionListener(new h(this));
    jPanel3.add(jButton2);
    jPanel1.add(jPanel3, "South");
    pack();
    setResizable(false);
  }

  public int a() {
    return (int) this.b.e();
  }

  public int b() {
    return (int) this.c.e();
  }

  public double c() {
    return this.d.e();
  }

  private void e() {
    double d1 = this.b.e();
    if (Double.isNaN(d1) || d1 <= 0.0D) {
      bV.d("Number of Teeth must have a positive value.", this);
      return;
    }
    if (this.c.e() < 0.0D) this.c.a(0.0D);
    a("TotalTrigTeeth", this.b.e());
    a("MissingTeeth", this.c.e());
    a("ToothWidth", this.d.e());
    this.g = true;
    dispose();
  }

  private void f() {
    dispose();
  }

  private void a(JPanel paramJPanel, String paramString, Component paramComponent) {
    JPanel jPanel = new JPanel();
    paramJPanel.add(jPanel);
    jPanel.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(paramString, 4);
    jPanel.add(jLabel, "Center");
    if (this.a == null) this.a = jLabel.getPreferredSize();
    if ((jLabel.getPreferredSize()).width > this.a.width) this.a.width += 10;
    jLabel.setPreferredSize(this.a);
    jPanel.add(paramComponent, "East");
  }

  public boolean d() {
    return this.g;
  }

  private void a(String paramString, double paramDouble) {
    if (this.e != null) this.e.a(paramString, "" + paramDouble);
  }

  private double b(String paramString, double paramDouble) {
    double d1 = paramDouble;
    if (this.e != null)
      try {
        String str = this.e.b(paramString, "" + paramDouble);
        d1 = Double.parseDouble(str);
      } catch (Exception exception) {
      }
    return d1;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
