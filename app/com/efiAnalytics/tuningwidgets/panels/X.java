package com.efiAnalytics.tuningwidgets.panels;

import bH.D;
import com.efiAnalytics.ui.ck;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileFilter;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import s.g;

public class X extends ck {
  JTextPane a = new JTextPane();
  
  private String d = "";
  
  JCheckBox b = new JCheckBox(g.b("Include Data Logs"), true);
  
  JCheckBox c = new JCheckBox(g.b("Include Restore Points"), true);
  
  public X() {
    setBorder(BorderFactory.createTitledBorder("Include"));
    this.d = g.b("Optional Items to include \nin Project Archive") + ":";
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1));
    jPanel1.add(this.b);
    jPanel1.add(this.c);
    setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("North", jPanel1);
    add("Center", jPanel2);
    add("North", this.a);
    this.a.setText(this.d);
    this.a.setBackground(getBackground());
    this.a.setBorder(BorderFactory.createEtchedBorder());
  }
  
  public boolean a() {
    return this.b.isSelected();
  }
  
  public boolean b() {
    return this.c.isSelected();
  }
  
  public void a(File paramFile) {}
  
  public void b(File paramFile) {
    D.c("Directory Selected: " + paramFile.getAbsolutePath());
  }
  
  public FileFilter c() {
    ab ab;
    if (!a() && !b()) {
      Y y = new Y(this);
    } else if (!a()) {
      Z z = new Z(this);
    } else if (!b()) {
      aa aa = new aa(this);
    } else {
      ab = new ab(this);
    } 
    return ab;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */