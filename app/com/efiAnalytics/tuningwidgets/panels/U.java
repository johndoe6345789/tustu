package com.efiAnalytics.tuningwidgets.panels;

import W.ag;
import com.efiAnalytics.ui.eJ;
import h.b;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import s.g;

public class U extends JPanel {
  JLabel a = new JLabel();
  
  JLabel b = new JLabel();
  
  JLabel c = new JLabel();
  
  JLabel d = new JLabel();
  
  JTextPane e = new JTextPane();
  
  public U() {
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 1));
    jPanel.add(a(g.b("Restore Point Date") + ":", this.c));
    if (b.a().a(" ,SD;LKODGPOIGD9")) {
      jPanel.add(a(g.b("Firmware Rev Level") + ":", this.b));
      jPanel.add(a(g.b("Serial Number") + ":", this.d));
    } else {
      jPanel.add(a(g.b("Serial Signature") + ":", this.b));
      jPanel.add(a(g.b("Firmware Version") + ":", this.d));
    } 
    jPanel.add(new JLabel(g.b("Tune Log Notes") + ":"));
    add("North", jPanel);
    this.e.setEditable(false);
    JScrollPane jScrollPane = new JScrollPane(this.e);
    add("Center", jScrollPane);
  }
  
  public void a(ag paramag) {
    if (paramag == null) {
      this.a.setText("");
      this.b.setText("");
      this.c.setText("");
      this.d.setText("");
      this.e.setText("");
    } else {
      this.a.setText(paramag.a().getName());
      this.b.setText(paramag.d());
      this.c.setText(paramag.c());
      this.d.setText(paramag.e());
      if (paramag.b().startsWith("<html")) {
        this.e.setContentType("text/html");
      } else {
        this.e.setContentType("text/plain");
      } 
      this.e.setText(paramag.b());
      this.e.setCaretPosition(0);
    } 
  }
  
  private JPanel a(String paramString, JLabel paramJLabel) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(paramString);
    jPanel.add("West", jLabel);
    jLabel.setPreferredSize(new Dimension(eJ.a(120), eJ.a(21)));
    jPanel.add("Center", paramJLabel);
    paramJLabel.setPreferredSize(new Dimension(eJ.a(320), eJ.a(21)));
    return jPanel;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/U.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */