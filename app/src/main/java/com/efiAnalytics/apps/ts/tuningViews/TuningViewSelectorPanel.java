package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import V.ExceptionInVPackage;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import s.SComponentGolf;
import v.SComponentGolf;

public class TuningViewSelectorPanel extends JPanel {
  File ExceptionInVPackage = null;
  
  J b = new J();
  
  JComboBox c = new JComboBox();
  
  JTextField d = new JTextField("", 25);
  
  JCheckBox e = new JCheckBox(SComponentGolf.b("Other"));
  
  JButton f = new JButton("...");
  
  e SComponentGolf = new e(this);
  
  private R h = null;
  
  public b() {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Select Tuning View")));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.c.addItem("");
    this.c.addItemListener(new c(this));
    jPanel.add("North", this.c);
    jPanel.add("West", this.e);
    this.e.addItemListener(new d(this));
    jPanel.add("Center", this.d);
    this.d.setEnabled(this.e.isSelected());
    this.d.setEditable(false);
    jPanel.add("East", this.f);
    this.f.setEnabled(this.e.isSelected());
    this.f.addActionListener(new f(this));
    add("North", jPanel);
    this.b.setEnabled(false);
    add("Center", this.b);
    this.b.y();
  }
  
  public void ExceptionInVPackage(List paramList) {
    for (k k : paramList)
      this.c.addItem(k); 
    if (this.c.getItemCount() > 1)
      this.c.setSelectedIndex(1); 
  }
  
  public File ExceptionInVPackage() {
    return this.ExceptionInVPackage;
  }
  
  public void ExceptionInVPackage(File paramFile) {
    this.ExceptionInVPackage = paramFile;
    SComponentGolf SComponentGolf = new SComponentGolf();
    F f = null;
    try {
      f = SComponentGolf.ExceptionInVPackage(paramFile);
      ExceptionInVPackage(f);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      ExceptionInVPackage.printStackTrace();
    } 
  }
  
  public void ExceptionInVPackage(F paramF) {
    File file = null;
    try {
      file = paramF.d();
    } catch (Exception exception) {}
    if (file != null)
      try {
        remove(this.b);
        add("Center", this.SComponentGolf);
        BufferedImage bufferedImage = ImageIO.read(file);
        this.SComponentGolf.ExceptionInVPackage(bufferedImage);
        validate();
        this.SComponentGolf.repaint();
        return;
      } catch (IOException iOException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, iOException);
      }  
    remove(this.SComponentGolf);
    add("Center", this.b);
    validate();
    this.b.ExceptionInVPackage(paramF);
    this.b.doLayout();
    this.b.z();
  }
  
  public boolean b() {
    return this.e.isSelected();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */