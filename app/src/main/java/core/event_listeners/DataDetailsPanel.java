package ao;

import bH.X;
import com.efiAnalytics.ui.b;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

class gY extends JPanel {
  JLabel a = new JLabel("");

  JLabel b = new JLabel("");

  JLabel c = new JLabel("");

  JLabel d = new JLabel("");

  JLabel e = new JLabel("");

  JLabel f = new JLabel("");

  JLabel g = new JLabel("");

  JLabel h = new JLabel("");

  JLabel i = new JLabel("");

  Dimension j = new Dimension(70, 20);

  gY(go paramgo) {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder("Data Details"));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BoxLayout(jPanel, 1));
    add(jPanel, "North");
    jPanel.add(a("Total Records:", this.b));
    jPanel.add(a("Filtered Records:", this.a));
    jPanel.add(new JLabel(" "));
    jPanel.add(a("Cell Hit Count:", this.d));
    jPanel.add(a("Cell Weight:", this.c));
    jPanel.add(a("Variance:", this.e));
    jPanel.add(a("Standard Dev:", this.f));
    jPanel.add(a("Minimum:", this.h));
    jPanel.add(a("Mean:", this.g));
    jPanel.add(a("Max:", this.i));
  }

  public void a() {
    int[] arrayOfInt1 = this.k.l.h().getSelectedColumns();
    int[] arrayOfInt2 = this.k.l.h().getSelectedRows();
    if (arrayOfInt1.length > 0 && arrayOfInt2.length > 0) {
      int i = 0;
      double d1 = 0.0D;
      double d2 = 0.0D;
      double d3 = 0.0D;
      double d4 = 0.0D;
      double d5 = Double.NaN;
      double d6 = Double.NaN;
      for (byte b = 0; b < arrayOfInt1.length; b++) {
        for (byte b1 = 0; b1 < arrayOfInt2.length; b1++) {
          b[][] arrayOfB = this.k.b().D();
          b b2 = arrayOfB[arrayOfB.length - arrayOfInt2[b1] - 1][arrayOfInt1[b]];
          i += b2.j();
          d1 += b2.k();
          d2 += b2.e() * b2.k();
          d3 = b2.c() * b2.k();
          d4 = b2.d() * b2.k();
          if (b2.f() != null && (Double.isNaN(d5) || b2.f().doubleValue() > d5))
            d5 = b2.f().doubleValue();
          if (b2.g() != null && (Double.isNaN(d6) || b2.g().doubleValue() < d6))
            d6 = b2.g().doubleValue();
        }
      }
      double d7 = d3 / d1;
      double d8 = d2 / d1;
      double d9 = d4 / d1;
      this.c.setText(X.b(d1, 2));
      this.d.setText("" + i);
      this.e.setText(X.b(d9, this.k.l.h().b()));
      this.f.setText(X.b(d7, this.k.l.h().b()));
      this.g.setText(X.b(d8, this.k.l.h().b()));
      this.h.setText(X.b(d6, this.k.l.h().b()));
      this.i.setText(X.b(d5, this.k.l.h().b()));
    } else {
      this.c.setText("");
      this.d.setText("");
      this.e.setText("");
      this.f.setText("");
      this.g.setText("");
      this.h.setText("");
      this.i.setText("");
    }
  }

  private JPanel a(String paramString, Component paramComponent) {
    JLabel jLabel = new JLabel(paramString, 4);
    jLabel.setMinimumSize(this.j);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(3, 3));
    jPanel.add(paramComponent, "Center");
    jPanel.add(jLabel, "West");
    return jPanel;
  }

  public void a(String paramString) {
    this.b.setText(paramString);
  }

  public void b(String paramString) {
    this.a.setText(paramString);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
