package com.efiAnalytics.tunerStudio.search;

import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SearchResultItemPanel extends JPanel {
  JLabel a = new JLabel();
  
  C b = null;
  
  Font c = new Font("SansSerif", 0, eJ.a(11));
  
  private boolean d = false;
  
  public D() {
    setLayout(new GridLayout(1, 1));
    add(this.a);
    this.a.setFont(this.c);
    setBackground(Color.WHITE);
    this.a.setForeground(Color.BLACK);
    addMouseListener(new E(this));
  }
  
  public void a(C paramC) {
    String str1 = a(paramC.a(), paramC.b());
    if (paramC.d() != null && !paramC.d().isEmpty())
      str1 = str1 + " - (" + paramC.d() + ")"; 
    String str2 = "<html>" + str1 + "</html>";
    this.a.setText(str2);
    this.b = paramC;
  }
  
  private String a(String paramString1, String paramString2) {
    for (int i = paramString1.toLowerCase().indexOf(paramString2.toLowerCase()); i >= 0; i = paramString1.toLowerCase().indexOf(paramString2.toLowerCase(), i + str.length())) {
      String str = "<font color=\"red\"><b>" + paramString1.substring(i, i + paramString2.length()) + "</b></font>";
      paramString1 = paramString1.substring(0, i) + str + paramString1.substring(i + paramString2.length());
    } 
    return paramString1;
  }
  
  void a(boolean paramBoolean) {
    this.d = paramBoolean;
    if (paramBoolean) {
      this.a.setForeground(Color.WHITE);
      setBackground(Color.BLUE.darker());
    } else {
      this.a.setForeground(Color.BLACK);
      setBackground(Color.WHITE);
    } 
  }
  
  public void a() {
    this.b.c().a(this.b);
  }
  
  public boolean b() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */