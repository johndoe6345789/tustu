package business.binary_transformers;

import G.R;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bi;
import com.efiAnalytics.ui.eJ;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import s.SComponentGolf;

public class ContextHelpLabel extends JLabel {
  R a = null;

  String b = null;

  static ImageIcon c = null;

  public ContextHelpLabel(R paramR, String paramString) {
    this.a = paramR;
    this.b = paramString;
    if (c == null)
      try {
        Image image =
            Toolkit.getDefaultToolkit()
                .getImage(getClass().getResource("resources/help_square_12.png"));
        image = image.getScaledInstance(eJ.a(12), eJ.a(12), 4);
        c = new ImageIcon(image);
      } catch (Exception exception) {
        D.a("Could no load icon image resources/Help32.png");
      }
    addMouseListener(new m(this));
    b();
  }

  public void a() {
    String str = this.a.w(this.b);
    if (str == null || str.equals("")) return;
    str = SComponentGolf.b(str);
    Window window = bV.b(this);
    bi bi = new bi(window, str, true);
    bi.setSize(eJ.a(322), eJ.a(183));
    bi.a(new n(this));
    Point point = getLocationOnScreen();
    point.y += getHeight() / 2;
    point.x -= eJ.a(10);
    bi.setLocation(point);
    setToolTipText((String) null);
    bi.setVisible(true);
  }

  private void b() {
    String str = this.a.w(this.b);
    if (str != null && str.length() > 0) {
      str = SComponentGolf.b(str);
      StringBuilder stringBuilder = new StringBuilder(str);
      stringBuilder = X.a(stringBuilder, "\\n", "\n");
      stringBuilder = X.a(stringBuilder, "\n", "<br>");
      stringBuilder.insert(0, "<html>");
      stringBuilder.append("</html>");
      setToolTipText(stringBuilder.toString());
      setIcon(c);
    } else {
      setToolTipText((String) null);
      setIcon((Icon) null);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
