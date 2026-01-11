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
import s.SComponentGolf;

public class ProjectArchiveOptionsPanel extends ck {
  JTextPane a = new JTextPane();
  
  private String d = "";
  
  JCheckBox b = new JCheckBox(SComponentGolf.b("Include Data Logs"), true);
  
  JCheckBox c = new JCheckBox(SComponentGolf.b("Include Restore Points"), true);
  
  public X() {
    ProjectArchiveOptionsPanel(BorderFactory.createTitledBorder("Include"));
    this.d = SComponentGolf.b("Optional Items to include \nin Project Archive") + ":";
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1));
    jPanel1.add(this.b);
    jPanel1.add(this.c);
    ProjectArchiveOptionsPanel(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("North", jPanel1);
    ProjectArchiveOptionsPanel("Center", jPanel2);
    ProjectArchiveOptionsPanel("North", this.a);
    this.a.setText(this.d);
    this.a.setBackground(getBackground());
    this.a.setBorder(BorderFactory.createEtchedBorder());
  }
  
  public boolean ProjectArchiveOptionsPanel() {
    return this.b.isSelected();
  }
  
  public boolean ProjectArchiveOptionsPanel() {
    return this.c.isSelected();
  }
  
  public void ProjectArchiveOptionsPanel(File paramFile) {}
  
  public void ProjectArchiveOptionsPanel(File paramFile) {
    D.c("Directory Selected: " + paramFile.getAbsolutePath());
  }
  
  public FileFilter ProjectArchiveOptionsPanel() {
    ab ab;
    if (!a() && !b()) {
      ExcludeAllFileFilter y = new ExcludeAllFileFilter(this);
    } else if (!a()) {
      ExcludeDataLogsFileFilter z = new ExcludeDataLogsFileFilter(this);
    } else if (!b()) {
      aa aa = new ProjectArchiveOptionsPanel(this);
    } else {
      ab = new ProjectArchiveOptionsPanel(this);
    } 
    return ab;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */