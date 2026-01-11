package com.efiAnalytics.apps.ts.dashboard;

import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.do;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

public class AspectRatioPanel extends JPanel {
  do a = new do("", 4);
  
  do b = new do("", 4);
  
  Dimension c = eJ.a(200, 10);
  
  JDialog d = null;
  
  e e = null;
  
  public AspectRatioPanel() {
    setBorder(BorderFactory.createTitledBorder(a("Forced Dash Aspect Ratio")));
    setLayout(new GridLayout(0, 1));
    add(new JLabel(a("Set the width and height or ratio you want for this dash.")));
    add(new JLabel(a("The actual dimensions will not be forced.")));
    add(new JLabel(a("The ratio between them will be.")));
    add(a("Forced Width", (Component)this.a, "The width part of the Width to Heigh ratio this dashboard will be forced to. The dash will not be forced to this specific width, but the raio between width and height will be enforced to ensure consistent scaling."));
    add(a("Forced Height", (Component)this.b, "The height part of the Width to Heigh ratio this dashboard will be forced to. The dash will not be forced to this specific height, but the raio between width and height will be enforced to ensure consistent scaling."));
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.a.setText(paramInt1 + "");
    this.b.setText(paramInt2 + "");
  }
  
  public final Component add(Component paramComponent) {
    return super.add(paramComponent);
  }
  
  private JPanel a(String paramString1, Component paramComponent, String paramString2) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JLabel jLabel = new JLabel(a(paramString1), 4);
    jLabel.setPreferredSize(this.c);
    jLabel.setMinimumSize(this.c);
    jPanel.add("West", jLabel);
    jPanel.add("Center", paramComponent);
    cF cF = new cF(paramString2, bV.a());
    jPanel.add("East", (Component)cF);
    return jPanel;
  }
  
  private String a(String paramString) {
    return (bV.a() != null) ? bV.a().a(paramString) : paramString;
  }
  
  private void a() {
    if (this.d != null) {
      this.e = null;
      this.d.dispose();
    } 
  }
  
  private void b() {
    if (!c()) {
      bV.d(a("Width and Height must be valid integer values!"), this);
    } else {
      this.e = new e(this, Integer.parseInt(this.a.getText()), Integer.parseInt(this.b.getText()));
      if (this.d != null)
        this.d.dispose(); 
    } 
  }
  
  private boolean c() {
    try {
      int i = Integer.parseInt(this.a.getText());
      i = Integer.parseInt(this.b.getText());
    } catch (Exception exception) {
      return false;
    } 
    return true;
  }
  
  public e a(Component paramComponent) {
    this.d = new JDialog(bV.a(paramComponent), SComponentGolf.b("Dashboard Forced Aspect Ratio"));
    this.d.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
    this.d.add("Center", this);
    JButton jButton1 = new JButton(SComponentGolf.b("Cancel"));
    jButton1.addActionListener(new c(this));
    JButton jButton2 = new JButton(SComponentGolf.b("Accept"));
    jButton2.addActionListener(new d(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.d()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } 
    this.d.add("South", jPanel);
    this.d.pack();
    bV.a(bV.a(paramComponent), this.d);
    this.d.setVisible(true);
    return this.e;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */