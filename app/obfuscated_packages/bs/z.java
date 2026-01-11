package bs;

import bH.X;
import bM.d;
import bM.e;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.g;

class z extends JPanel implements e {
  JLabel a = new JLabel();
  
  JLabel b = new JLabel();
  
  JLabel c = new JLabel();
  
  JLabel d = new JLabel();
  
  JLabel e = new JLabel();
  
  JLabel f = new JLabel();
  
  JLabel g = new JLabel();
  
  JLabel h = new JLabel();
  
  JLabel i = new JLabel();
  
  JLabel j = new JLabel();
  
  z(k paramk) {
    setBorder(BorderFactory.createTitledBorder(g.b("Warmup Analyze Stats")));
    setLayout(new GridLayout(0, 3, 6, 2));
    add(a("Total Records", this.a));
    add(a("Filtered Records", this.b));
    add(a("Used Records", this.c));
    add(a("Target Lambda", this.h));
    add(a("Current Lambda", this.i));
    add(a("Lambda Error %", this.j));
    add(a("Start Temperature", this.d));
    add(a("Maximum temperature", this.e));
    add(a("Coolant Temperature", this.f));
    add(a("Active Filter", this.g));
  }
  
  private JPanel a(String paramString, JLabel paramJLabel) {
    paramString = g.b(paramString) + ": ";
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 0));
    paramJLabel.setMinimumSize(new Dimension(60, 14));
    paramJLabel.setHorizontalAlignment(2);
    JLabel jLabel = new JLabel(paramString, 4);
    jPanel.add(jLabel);
    jPanel.add(paramJLabel);
    return jPanel;
  }
  
  public void a(d paramd) {
    this.a.setText(paramd.a() + "");
    this.b.setText(paramd.b() + "");
    this.c.setText((paramd.a() - paramd.b()) + "");
    this.d.setText(paramd.f() + "");
    this.e.setText(paramd.g() + "");
    this.f.setText(X.b(paramd.e(), 1));
    if (!this.k.b.b().equals("")) {
      this.g.setBackground(Color.yellow);
      this.g.setOpaque(true);
    } else {
      this.g.setBackground(this.c.getBackground());
      this.g.setOpaque(false);
    } 
    this.g.setText(this.k.b.b());
    this.h.setText(X.a(paramd.c()));
    this.i.setText(X.a(paramd.d()));
    float f = (paramd.d() / paramd.c() - 1.0F) * 100.0F;
    this.j.setText(X.c(f, 2));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */