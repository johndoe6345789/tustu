package com.efiAnalytics.ui;

import bH.D;
import bH.X;
import bH.ab;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class cI extends JLabel {
  ImageIcon a = null;
  
  String b = null;
  
  private ab c = null;
  
  public cI(String paramString) {
    this(paramString, (ab)null);
  }
  
  public cI(String paramString, ab paramab) {
    this.b = paramString;
    this.c = paramab;
    try {
      Image image = cO.a().a(cO.f, this);
      this.a = new ImageIcon(image);
      Dimension dimension = eJ.a(26, 26);
      setPreferredSize(dimension);
      addMouseListener(new cJ(this));
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
    str = a(str);
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
      str = a(this.b);
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
  
  private String a(String paramString) {
    return (this.c != null) ? this.c.a(paramString) : paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */