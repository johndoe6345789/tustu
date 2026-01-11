package business.binary_transformers;

import bH.D;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bi;
import com.efiAnalytics.ui.eJ;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import s.SComponentGolf;

public class HelpIconLabel extends JLabel {
  ImageIcon a = null;
  
  String b = null;
  
  public HelpIconLabel(String paramString) {
    this.b = paramString;
    try {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Help32.png"));
      image = image.getScaledInstance(20, 20, 4);
      this.a = new ImageIcon(image);
      addMouseListener(new k(this));
    } catch (Exception exception) {
      D.a("Could no load icon image resources/comment3.png");
    } 
    setIcon(this.a);
    b();
    setOpaque(false);
  }
  
  public void a() {
    if (this.b == null)
      this.b = ""; 
    String str = this.b;
    if (str == null || str.equals(""))
      return; 
    str = SComponentGolf.b(str);
    Window window = bV.b(this);
    bi bi = new bi(window, str, true);
    bi.setSize(eJ.a(322), eJ.a(183));
    Point point = getLocationOnScreen();
    point.y += getHeight() / 2;
    point.x -= eJ.a(10);
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    if (point.x + bi.getWidth() > dimension.width);
    bi.setLocation(point);
    setToolTipText((String)null);
    bi.setVisible(true);
  }
  
  private void b() {
    if (this.b != null && this.b.length() > 0) {
      String str = this.b;
      str = SComponentGolf.b(this.b);
      StringBuilder stringBuilder = new StringBuilder(str);
      stringBuilder = X.a(stringBuilder, "\\n", "\n");
      stringBuilder = X.a(stringBuilder, "\n", "<br>");
      stringBuilder.insert(0, "<html>");
      stringBuilder.append("</html>");
      setToolTipText(stringBuilder.toString());
    } else {
      setToolTipText((String)null);
      setIcon((Icon)null);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */