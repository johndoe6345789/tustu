package business.binary_decoders.bD_components;

import bH.X;
import bH.ab;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UIInBdPackage extends JPanel {
  JLabel a = new JLabel(" ?", 2);

  JLabel b = new JLabel("? KB", 2);

  JLabel c = new JLabel("?.?? GB", 2);

  ab d = null;

  JPanel e = null;

  public UIInBdPackage(ab paramab) {
    this.d = paramab;
    setLayout(new GridLayout(1, 0));
    this.e = a(this.c, "Total Size:");
    add(this.e);
    this.e.setVisible(false);
    add(a(this.a, "Files:"));
    add(a(this.b, "Used:"));
    setMinimumSize(eJ.a(400, 24));
    setPreferredSize(eJ.a(400, 24));
  }

  public void a(long paramLong) {
    if (paramLong > 0L) {
      this.e.setVisible(true);
      this.c.setText(X.a(paramLong));
    } else {
      this.e.setVisible(false);
    }
  }

  public void b(long paramLong) {
    this.b.setText(X.a(paramLong));
  }

  public void a(int paramInt) {
    this.a.setText("" + paramInt);
  }

  private JPanel a(JLabel paramJLabel, String paramString) {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout(1));
    jPanel1.setBorder(BorderFactory.createLoweredBevelBorder());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(3, 3));
    jPanel2.add("West", new JLabel(this.d.a(paramString)));
    jPanel2.add("Center", paramJLabel);
    jPanel1.add(jPanel2);
    return jPanel1;
  }

  public String a() {
    return this.b.getText();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
