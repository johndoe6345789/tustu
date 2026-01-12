package business.byte_serializers;

import bH.X;
import bM.BmInterfaceDelta;
import bM.BmInterfaceEcho;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

class UIInBsPackage extends JPanel implements BmInterfaceEcho {
  JLabel a = new JLabel();

  JLabel b = new JLabel();

  JLabel c = new JLabel();

  JLabel BmInterfaceDelta = new JLabel();

  JLabel BmInterfaceEcho = new JLabel();

  JLabel f = new JLabel();

  JLabel SComponentGolf = new JLabel();

  JLabel h = new JLabel();

  JLabel i = new JLabel();

  JLabel j = new JLabel();

  public void z(k paramk) {
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Warmup Analyze Stats")));
    setLayout(new GridLayout(0, 3, 6, 2));
    add(a("Total Records", this.a));
    add(a("Filtered Records", this.b));
    add(a("Used Records", this.c));
    add(a("Target Lambda", this.h));
    add(a("Current Lambda", this.i));
    add(a("Lambda Error %", this.j));
    add(a("Start Temperature", this.BmInterfaceDelta));
    add(a("Maximum temperature", this.BmInterfaceEcho));
    add(a("Coolant Temperature", this.f));
    add(a("Active Filter", this.SComponentGolf));
  }

  private JPanel a(String paramString, JLabel paramJLabel) {
    paramString = SComponentGolf.b(paramString) + ": ";
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 0));
    paramJLabel.setMinimumSize(new Dimension(60, 14));
    paramJLabel.setHorizontalAlignment(2);
    JLabel jLabel = new JLabel(paramString, 4);
    jPanel.add(jLabel);
    jPanel.add(paramJLabel);
    return jPanel;
  }

  public void a(BmInterfaceDelta paramd) {
    this.a.setText(paramd.a() + "");
    this.b.setText(paramd.b() + "");
    this.c.setText((paramd.a() - paramd.b()) + "");
    this.BmInterfaceDelta.setText(paramd.f() + "");
    this.BmInterfaceEcho.setText(paramd.SComponentGolf() + "");
    this.f.setText(X.b(paramd.BmInterfaceEcho(), 1));
    if (!this.k.b.b().equals("")) {
      this.SComponentGolf.setBackground(Color.yellow);
      this.SComponentGolf.setOpaque(true);
    } else {
      this.SComponentGolf.setBackground(this.c.getBackground());
      this.SComponentGolf.setOpaque(false);
    }
    this.SComponentGolf.setText(this.k.b.b());
    this.h.setText(X.a(paramd.c()));
    this.i.setText(X.a(paramd.BmInterfaceDelta()));
    float f = (paramd.BmInterfaceDelta() / paramd.c() - 1.0F) * 100.0F;
    this.j.setText(X.c(f, 2));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
