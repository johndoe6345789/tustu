package bt;

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
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import r.i;

public class a extends JLabel {
  R a = null;
  
  String b = null;
  
  static ImageIcon c = null;
  
  static ImageIcon d = null;
  
  public a(R paramR, String paramString) {
    if (!i.a().a("lkjfgblkjgdoijre98u"))
      return; 
    this.a = paramR;
    this.b = paramString;
    if (c == null || d == null)
      try {
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/comment3.png"));
        image = image.getScaledInstance(eJ.a(14), eJ.a(14), 4);
        d = new ImageIcon(image);
        image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/comment2.png"));
        image = image.getScaledInstance(eJ.a(14), eJ.a(14), 4);
        c = new ImageIcon(image);
      } catch (Exception exception) {
        D.a("Could no load icon image resources/comment3.png");
      }  
    addMouseListener(new b(this));
    b();
  }
  
  public void a() {
    String str = this.a.o(this.b);
    if (str == null)
      str = ""; 
    if (str.contains("</head>"))
      str = "<html>" + str.substring(str.indexOf("</head>") + 7); 
    Window window = bV.b(this);
    bi bi = new bi(window, str);
    bi.a(new c(this));
    bi.setSize(eJ.a(322), eJ.a(183));
    Point point = getLocationOnScreen();
    point.y += getHeight() / 2;
    point.x -= eJ.a(10);
    bi.setLocation(point);
    bi.setVisible(true);
    setToolTipText((String)null);
  }
  
  private void b() {
    if (this.a.o(this.b) != null && this.a.o(this.b).length() > 0) {
      String str = this.a.o(this.b);
      str = X.d(str);
      StringBuilder stringBuilder = new StringBuilder(str);
      stringBuilder = X.a(stringBuilder, "\n", "<br>");
      if (!stringBuilder.toString().startsWith("<html>"))
        stringBuilder.insert(0, "<html>"); 
      if (!stringBuilder.toString().endsWith("</html>"))
        stringBuilder.append("</html>"); 
      setToolTipText(stringBuilder.toString());
      setIcon(d);
    } else {
      setToolTipText("Click to add notes for this setting.");
      setIcon(c);
    } 
  }
  
  private void a(String paramString) {
    paramString = X.d(paramString);
    this.a.b(this.b, paramString);
    b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */