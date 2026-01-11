package bt;

import bH.X;
import java.awt.Graphics;
import javax.swing.JLabel;

public class bb extends JLabel {
  String a = null;
  
  public bb() {
    addMouseListener(new bc(this));
  }
  
  public bb(String paramString) {
    setOpaque(true);
    addMouseListener(new bc(this));
    setText(paramString);
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
  }
  
  public void setText(String paramString) {
    paramString = a(paramString);
    super.setText(paramString);
  }
  
  private String a(String paramString) {
    if (paramString == null)
      return null; 
    if (paramString.contains("<a") && paramString.contains("href=")) {
      String str = X.b(paramString, "\"", "");
      str = paramString.substring(paramString.indexOf("http", paramString.indexOf("href=")));
      if (str.indexOf(">") > 0)
        str = str.substring(0, str.indexOf(">")); 
      if (str.indexOf(" ") > 0)
        str = str.substring(0, str.indexOf(" ")); 
      this.a = str;
      setToolTipText(str);
      return paramString;
    } 
    if (paramString.contains("http:") || paramString.contains("https:")) {
      String str1 = paramString.substring(0, paramString.indexOf("http"));
      String str2 = "";
      String str3 = paramString.substring(paramString.indexOf("http"));
      if (str3.contains(" ")) {
        str2 = str3.substring(str3.indexOf(" "));
        str3 = str3.substring(0, str3.indexOf(" "));
      } 
      this.a = str3;
      setToolTipText(str3);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("<html>").append(str1).append("<a href=").append(str3).append(" >").append(str3).append("</a>").append(str2).append("</html>");
      return stringBuilder.toString();
    } 
    return paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */