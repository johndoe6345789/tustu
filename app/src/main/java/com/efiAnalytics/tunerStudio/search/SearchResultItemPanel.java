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
  
  public SearchResultItemPanel() {
    SearchResultItemPanel(new GridLayout(1, 1));
    SearchResultItemPanel(this.a);
    this.a.setFont(this.c);
    SearchResultItemPanel(Color.WHITE);
    this.a.setForeground(Color.BLACK);
    SearchResultItemPanel(new SearchResultItemPanel(this));
  }
  
  public void SearchResultItemPanel(C paramC) {
    String str1 = SearchResultItemPanel(paramC.a(), paramC.b());
    if (paramC.d() != null && !paramC.d().isEmpty())
      str1 = str1 + " - (" + paramC.d() + ")"; 
    String str2 = "<html>" + str1 + "</html>";
    this.a.setText(str2);
    this.b = paramC;
  }
  
  private String SearchResultItemPanel(String paramString1, String paramString2) {
    for (int i = paramString1.toLowerCase().indexOf(paramString2.toLowerCase()); i >= 0; i = paramString1.toLowerCase().indexOf(paramString2.toLowerCase(), i + str.length())) {
      String str = "<font color=\"red\"><b>" + paramString1.substring(i, i + paramString2.length()) + "</b></font>";
      paramString1 = paramString1.substring(0, i) + str + paramString1.substring(i + paramString2.length());
    } 
    return paramString1;
  }
  
  void SearchResultItemPanel(boolean paramBoolean) {
    this.d = paramBoolean;
    if (paramBoolean) {
      this.a.setForeground(Color.WHITE);
      SearchResultItemPanel(Color.BLUE.darker());
    } else {
      this.a.setForeground(Color.BLACK);
      SearchResultItemPanel(Color.WHITE);
    } 
  }
  
  public void SearchResultItemPanel() {
    this.b.c().a(this.b);
  }
  
  public boolean SearchResultItemPanel() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */