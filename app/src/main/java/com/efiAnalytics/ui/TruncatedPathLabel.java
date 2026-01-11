package com.efiAnalytics.ui;

import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import javax.swing.JLabel;

public class TruncatedPathLabel extends JLabel {
  String a = "";
  
  double b = 0.0D;
  
  public TruncatedPathLabel() {
    setFont(new Font("SansSerif", 0, eJ.a(11)));
    this.b = (getFontMetrics(getFont()).stringWidth("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ") / 52);
  }
  
  public void paint(Graphics paramGraphics) {
    String str = this.a;
    int i = (int)(getWidth() / this.b);
    if (str != null && str.length() > i) {
      int j = i - 19;
      if (j > 0) {
        str = str.substring(0, 10) + " .... " + str.substring(str.length() - j, str.length());
      } else if (str.lastIndexOf(File.separator) != -1) {
        str = str.substring(str.lastIndexOf(File.separator));
      } 
    } 
    if (str != null && !getText().equals(str))
      super.setText(str); 
    super.paint(paramGraphics);
  }
  
  public void a(String paramString) {
    this.a = paramString;
    super.setText(this.a);
  }
  
  public void setText(String paramString) {
    this.a = paramString;
    super.setText(this.a);
  }
  
  public String a() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */