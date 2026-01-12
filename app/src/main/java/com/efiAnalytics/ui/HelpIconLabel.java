package com.efiAnalytics.ui;

import bH.D;
import bH.X;
import bH.ab;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HelpIconLabel extends JLabel {
  static ImageIcon a = null;

  private String c;

  ab b;

  public HelpIconLabel(String paramString, ab paramab) {
    this(paramString, paramab, 32);
  }

  public HelpIconLabel(String paramString, ab paramab, int paramInt) {
    this.b = paramab;
    this.c = paramString;
    if (a == null)
      try {
        Image image =
            Toolkit.getDefaultToolkit()
                .getImage(getClass().getResource("resources/help_square_12.png"));
        image = eJ.a(image, this);
        a = new ImageIcon(image);
      } catch (Exception exception) {
        D.a("Could no load icon image resources/Help32.png");
      }
    addMouseListener(new cG(this));
    b();
  }

  private String b(String paramString) {
    return (this.b != null) ? this.b.a(paramString) : paramString;
  }

  public void a() {
    String str = this.c;
    if (str == null || str.equals("")) return;
    str = b(str);
    Window window = bV.b(this);
    bi bi = new bi(window, str, true);
    bi.setSize(eJ.a(322), eJ.a(183));
    bi.a(new cH(this));
    Point point = getLocationOnScreen();
    point.y += getHeight() / 2;
    point.x -= eJ.a(10);
    bi.setLocation(point);
    setToolTipText((String) null);
    bi.setVisible(true);
  }

  private void b() {
    if (this.c != null && this.c.length() > 0) {
      this.c = b(this.c);
      boolean bool =
          (this.c.length() > 150 && !this.c.contains("\n") && !this.c.contains("<br>"))
              ? true
              : false;
      StringBuilder stringBuilder = new StringBuilder(this.c);
      stringBuilder = X.a(stringBuilder, "\\n", "\n");
      stringBuilder = X.a(stringBuilder, "\n", "<br>");
      if (bool) stringBuilder = X.a(stringBuilder, 50, "<br>");
      stringBuilder.insert(0, "<html>");
      stringBuilder.append("</html>");
      setToolTipText(stringBuilder.toString());
      setIcon(a);
    } else {
      setToolTipText((String) null);
      setIcon((Icon) null);
    }
  }

  public void a(String paramString) {
    this.c = b(paramString);
    b();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
