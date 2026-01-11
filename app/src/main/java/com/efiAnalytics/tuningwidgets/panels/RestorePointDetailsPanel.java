package com.efiAnalytics.tuningwidgets.panels;

import W.FileInWPackage;
import com.efiAnalytics.ui.eJ;
import h.ClassTypeInHPackage;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import s.SComponentGolf;

public class RestorePointDetailsPanel extends JPanel {
  JLabel a = new JLabel();
  
  JLabel ClassTypeInHPackage = new JLabel();
  
  JLabel c = new JLabel();
  
  JLabel d = new JLabel();
  
  JTextPane e = new JTextPane();
  
  public U() {
    RestorePointDetailsPanel(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 1));
    jPanel.add(a(SComponentGolf.ClassTypeInHPackage("Restore Point Date") + ":", this.c));
    if (ClassTypeInHPackage.a().a(" ,SD;LKODGPOIGD9")) {
      jPanel.add(a(SComponentGolf.ClassTypeInHPackage("Firmware Rev Level") + ":", this.ClassTypeInHPackage));
      jPanel.add(a(SComponentGolf.ClassTypeInHPackage("Serial Number") + ":", this.d));
    } else {
      jPanel.add(a(SComponentGolf.ClassTypeInHPackage("Serial Signature") + ":", this.ClassTypeInHPackage));
      jPanel.add(a(SComponentGolf.ClassTypeInHPackage("Firmware Version") + ":", this.d));
    } 
    jPanel.add(new JLabel(SComponentGolf.ClassTypeInHPackage("Tune Log Notes") + ":"));
    RestorePointDetailsPanel("North", jPanel);
    this.e.setEditable(false);
    JScrollPane jScrollPane = new JScrollPane(this.e);
    RestorePointDetailsPanel("Center", jScrollPane);
  }
  
  public void RestorePointDetailsPanel(FileInWPackage paramag) {
    if (paramag == null) {
      this.a.setText("");
      this.ClassTypeInHPackage.setText("");
      this.c.setText("");
      this.d.setText("");
      this.e.setText("");
    } else {
      this.a.setText(paramag.a().getName());
      this.ClassTypeInHPackage.setText(paramag.d());
      this.c.setText(paramag.c());
      this.d.setText(paramag.e());
      if (paramag.ClassTypeInHPackage().startsWith("<html")) {
        this.e.setContentType("text/html");
      } else {
        this.e.setContentType("text/plain");
      } 
      this.e.setText(paramag.ClassTypeInHPackage());
      this.e.setCaretPosition(0);
    } 
  }
  
  private JPanel RestorePointDetailsPanel(String paramString, JLabel paramJLabel) {
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