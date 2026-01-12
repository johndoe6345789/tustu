package aP;

import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UIInApPackage extends JPanel {
  public iv[] a =
      new iv[] {
        new iv(this, "Awesome Dashboards!", "[localfile]/help/learnMore.html"),
        new iv(this, "VE Table Generator", "[localfile]/help/learnMore.html"),
        new iv(this, "AFR Table Generator", "[localfile]/help/learnMore.html"),
        new iv(this, "VE Analyze Live!", "[localfile]/help/learnMore.html"),
        new iv(this, "Tabbed Dashboards", "[localfile]/help/learnMore.html"),
        new iv(this, "Trigger Log Viewer", "[localfile]/help/learnMore.html"),
        new iv(this, "Difference Reports", "[localfile]/help/learnMore.html"),
        new iv(
            this,
            "Android Dashboards",
            "https://www.tunerstudio.com/index.php/products/shadowdashmsmenu"),
        new iv(this, "Fullscreen Dashboard", "[localfile]/help/learnMore.html"),
        new iv(this, "Tune Restore Points", "[localfile]/help/learnMore.html"),
        new iv(this, "Enhanced 3D Tables", "[localfile]/help/learnMore.html")
      };

  JLabel b = new JLabel();

  int c = 0;

  public UIInApPackage() {
    setLayout(new BorderLayout());
    is is = new is(this, " Learn More! ");
    is.setFont(new Font("Arial Unicode MS", 0, eJ.a(12)));
    is.setForeground(Color.blue);
    is.setBackground(Color.black);
    it it = new it(this, is);
    is.addMouseListener(it);
    add("East", is);
    this.b.setFont(new Font("Arial Unicode MS", 0, eJ.a(12)));
    this.b.setHorizontalAlignment(0);
    this.b.setMinimumSize(new Dimension(130, 15));
    this.b.setPreferredSize(new Dimension(130, 15));
    add("Center", this.b);
    iu iu = new iu(this);
    iu.start();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
